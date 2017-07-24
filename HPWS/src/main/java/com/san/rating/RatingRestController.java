package com.san.rating;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/rating")
public class RatingRestController {
	
    /*
    **Return a listing of all the resources
    */
    @RequestMapping(method = RequestMethod.GET)
    public String getAll() {
        return "resources";
    }

    /*
    **Return one resource
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getOne(@PathVariable String id) {
        return "resource";
    }

    /*
    **Store a newly created resource in storage.
    */
    @RequestMapping(method = RequestMethod.POST)
    public String add(@RequestBody Rating rating) {
        return "stored";
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PATCH)
    public String update(@RequestBody Rating rating) {
        return "updated";
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable String id) {
        return "deleted";
    }
}
