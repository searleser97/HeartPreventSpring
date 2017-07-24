package com.san.allergyXUser;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/allergyXUser")
public class AllergyXUserRestController {
	
    @Autowired
    private AllergyXUserService allergyXUserService;

    /*
    **Return a listing of all the resources
    */
    @RequestMapping(method = RequestMethod.GET)
    public List<AllergyXUser> getAll() {
        return allergyXUserService.getAll();
    }

    /*
    **Return one resource
    */
    @RequestMapping("/{id}")
    public AllergyXUser getOne(@PathVariable Integer id) {
        return allergyXUserService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody AllergyXUser allergyXUser) {
        allergyXUserService.add(allergyXUser);
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody AllergyXUser allergyXUser) {
        allergyXUserService.update(allergyXUser);
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        allergyXUserService.delete(id);
    }
}
