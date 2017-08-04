package com.san.guiTextType;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/guiTextType")
public class GuiTextTypeRestController {
	
    @Autowired
    private GuiTextTypeService guiTextTypeService;

    /*
    **Return a listing of all the resources
    */
    @RequestMapping(method = RequestMethod.GET)
    public List<GuiTextType> getAll() {
        return guiTextTypeService.getAll();
    }

    /*
    **Return one resource
    */
    @RequestMapping("/{id}")
    public GuiTextType getOne(@PathVariable Integer id) {
        return guiTextTypeService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody GuiTextType guiTextType) {
        guiTextTypeService.add(guiTextType);
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody GuiTextType guiTextType) {
        guiTextTypeService.update(guiTextType);
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        guiTextTypeService.delete(id);
    }
}
