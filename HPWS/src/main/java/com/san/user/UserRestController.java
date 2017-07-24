package com.san.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
    @Autowired
    private UserService userService;

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
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getOne(@PathVariable Integer id) {
        User user = userService.getOne(id);
        user.getRoles();
        return userService.getOne(id);
    }
//    @RequestMapping("/role/{email}")
//    public List<User> getUserRole(String email) {
//        return userService.getUserRole(email);
//    }

    /*
    **Store a newly created resource in storage.
    */
    @RequestMapping(method = RequestMethod.POST)
    public boolean add(@RequestBody User user) {
        return userService.add(user);
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PUT)
    public boolean update(@RequestBody DataUser dataUser) {
        return userService.update(dataUser);
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable Integer id) {
        return userService.delete(id);
    }

//    @RequestMapping(value = "/roles/{email}", method = RequestMethod.GET)
//    public List<Aux> getUserRoles(@PathVariable String email) {
//        List<Aux> list = userService.getRoles(email);
//        return list;
//    }
}
