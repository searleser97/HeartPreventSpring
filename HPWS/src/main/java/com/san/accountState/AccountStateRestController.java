package com.san.accountState;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import java.util.List;

@RestController
@RequestMapping("/accountState")
public class AccountStateRestController {
	
    @Autowired
    private AccountStateService accountStateService;

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String test(ServletRequest servletRequest) {
        System.out.println(servletRequest.getRemoteAddr());
        return "Completed.";
    }

    @RequestMapping(path = "/test", method = RequestMethod.POST)
    public String test2(@RequestBody TestAux aux) {
        System.out.println("UserInfo:");
        System.out.println("\tid: " + aux.getUserInfo().getId());
        System.out.println("\taccess_token: " + aux.getUserInfo().getAccess_token());
        System.out.println("\trole: " + aux.getUserInfo().getRole());
        System.out.println("\tip: " + aux.getUserInfo().getIp());
        System.out.println("\tagent: " + aux.getUserInfo().getAgent());
        return "Completed.";
    }

    /*
    **Return a listing of all the resources
    */
    @RequestMapping(method = RequestMethod.GET)
    public List<AccountState> getAll() {
        return accountStateService.getAll();
    }

    /*
    **Return one resource
    */
    @RequestMapping("/{id}")
    public AccountState getOne(@PathVariable Integer id) {
        return accountStateService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody AccountState accountState) {
        accountStateService.add(accountState);
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody AccountState accountState) {
        accountStateService.update(accountState);
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        accountStateService.delete(id);
    }
}
