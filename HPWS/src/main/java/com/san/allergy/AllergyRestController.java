package com.san.allergy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/allergy")
public class AllergyRestController {
	
    @Autowired
    private AllergyService allergyService;

    /*
    **Return a listing of all the resources
    */
    @RequestMapping(method = RequestMethod.GET)
    public List<Allergy> getAll() {
        return allergyService.getAll();
    }

    /*
    **Return one resource
    */
    @RequestMapping("/{id}")
    public Allergy getOne(@PathVariable Integer id) {
        return allergyService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody DataAllergy dataAllergy) {
        allergyService.add(dataAllergy.allergy);
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody DataAllergy dataAllergy) {
        allergyService.update(dataAllergy.allergy);
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        allergyService.delete(id);
    }
}
