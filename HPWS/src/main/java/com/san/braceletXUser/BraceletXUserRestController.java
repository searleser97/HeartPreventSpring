package com.san.braceletXUser;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/braceletXUser")
public class BraceletXUserRestController {
	
    @Autowired
    private BraceletXUserService braceletXUserService;

    /*
    **Return a listing of all the resources
    */
    @RequestMapping(method = RequestMethod.GET)
    public List<BraceletXUser> getAll() {
        return braceletXUserService.getAll();
    }

    /*
    **Return one resource
    */
    @RequestMapping("/{id}")
    public BraceletXUser getOne(@PathVariable Integer id) {
        return braceletXUserService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody BraceletXUser braceletXUser) {
        braceletXUserService.add(braceletXUser);
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody BraceletXUser braceletXUser) {
        braceletXUserService.update(braceletXUser);
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        braceletXUserService.delete(id);
    }
}
