package com.san.formXSection;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/formXSection")
public class FormXSectionRestController {
	
    @Autowired
    private FormXSectionService formXSectionService;

    /*
    **Return a listing of all the resources
    */
    @RequestMapping(method = RequestMethod.GET)
    public List<FormXSection> getAll() {
        return formXSectionService.getAll();
    }

    /*
    **Return one resource
    */
    @RequestMapping("/{id}")
    public FormXSection getOne(@PathVariable Integer id) {
        return formXSectionService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody FormXSection formXSection) {
        formXSectionService.add(formXSection);
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody FormXSection formXSection) {
        formXSectionService.update(formXSection);
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        formXSectionService.delete(id);
    }
}
