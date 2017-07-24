package com.san.ratingXUser;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/ratingXUser")
public class RatingXUserRestController {
	
    @Autowired
    private RatingXUserService ratingXUserService;

    /*
    **Return a listing of all the resources
    */
    @RequestMapping(method = RequestMethod.GET)
    public List<RatingXUser> getAll() {
        return ratingXUserService.getAll();
    }

    /*
    **Return one resource
    */
    @RequestMapping("/{id}")
    public RatingXUser getOne(@PathVariable Integer id) {
        return ratingXUserService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody RatingXUser ratingXUser) {
        ratingXUserService.add(ratingXUser);
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody RatingXUser ratingXUser) {
        ratingXUserService.update(ratingXUser);
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        ratingXUserService.delete(id);
    }
}
