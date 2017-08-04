package com.san.user;

import com.google.gson.Gson;
import com.san.security.Security;
import com.san.tokenUserInfo.TokenUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
    @Autowired
    private UserService userService;
    private Security security = new Security();

    /*
    **Return a listing of all the resources
    */
    @PreAuthorize("hasAnyRole('ADMIN')")
    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAll() {
        return userService.getAll();
    }

    /*
    **Return one resource
    */
    @PreAuthorize("hasAnyRole('USER')")
    @GetMapping("/{id}")
    public User getOne(@PathVariable Integer id) {
        User user = userService.getOne(id);
        user.getRoles();
        return userService.getOne(id);
    }

    @PostMapping("/getJwtoken")
    public LoginResponse getJwtoken(@RequestBody LoginRequest loginRequest, HttpServletRequest httpServletRequest) {
        TokenUserInfo tokenUserInfo = userService.getTokenUserInfo(loginRequest, httpServletRequest.getRemoteAddr(), httpServletRequest.getHeader("user-agent"));
        if (tokenUserInfo == null)
            return new LoginResponse("Invalid Credentials", null);
        Gson gson = new Gson();
        String jwToken = security.encryptAES(gson.toJson(tokenUserInfo));
        return new LoginResponse("success", jwToken);
    }

    /*
    **Store a newly created resource in storage.
    */
    @PostMapping
//    public boolean add(@RequestBody SignUpRequest signUpRequest) {
//        return userService.add(user);
//    }

    /*
    **Update the specified resource in storage.
    */
//    @PutMapping
//    public boolean update(@RequestBody) {
//        return true;
//    }

    /*
    **Remove the specified resource from storage.
    */
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return userService.delete(id);
    }
}
