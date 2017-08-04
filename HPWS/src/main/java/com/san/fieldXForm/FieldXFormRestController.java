package com.san.fieldXForm;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/fieldXForm")
public class FieldXFormRestController {
	
    @Autowired
    private FieldXFormService fieldXFormService;

    /*
    **Return a listing of all the resources
    */
    @RequestMapping(method = RequestMethod.GET)
    public List<FieldXForm> getAll() {
        return fieldXFormService.getAll();
    }

    /*
    **Return one resource
    */
    @RequestMapping("/{id}")
    public FieldXForm getOne(@PathVariable Integer id) {
        return fieldXFormService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody FieldXForm fieldXForm) {
        fieldXFormService.add(fieldXForm);
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody FieldXForm fieldXForm) {
        fieldXFormService.update(fieldXForm);
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        fieldXFormService.delete(id);
    }
}
