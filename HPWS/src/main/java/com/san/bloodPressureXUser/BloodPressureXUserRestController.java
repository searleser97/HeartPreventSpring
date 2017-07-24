package com.san.bloodPressureXUser;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/bloodPressureXUser")
public class BloodPressureXUserRestController {
	
    @Autowired
    private BloodPressureXUserService bloodPressureXUserService;

    /*
    **Return a listing of all the resources
    */
    @RequestMapping(method = RequestMethod.GET)
    public List<BloodPressureXUser> getAll() {
        return bloodPressureXUserService.getAll();
    }

    /*
    **Return one resource
    */
    @RequestMapping("/{id}")
    public BloodPressureXUser getOne(@PathVariable Integer id) {
        return bloodPressureXUserService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody BloodPressureXUser bloodPressureXUser) {
        bloodPressureXUserService.add(bloodPressureXUser);
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody BloodPressureXUser bloodPressureXUser) {
        bloodPressureXUserService.update(bloodPressureXUser);
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        bloodPressureXUserService.delete(id);
    }
}
