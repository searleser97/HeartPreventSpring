package com.san.fieldType;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/fieldType")
public class FieldTypeRestController {
	
    @Autowired
    private FieldTypeService fieldTypeService;

    /*
    **Return a listing of all the resources
    */
    @RequestMapping(method = RequestMethod.GET)
    public List<FieldType> getAll() {
        return fieldTypeService.getAll();
    }

    /*
    **Return one resource
    */
    @RequestMapping("/{id}")
    public FieldType getOne(@PathVariable Integer id) {
        return fieldTypeService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody FieldType fieldType) {
        fieldTypeService.add(fieldType);
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody FieldType fieldType) {
        fieldTypeService.update(fieldType);
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        fieldTypeService.delete(id);
    }
}
