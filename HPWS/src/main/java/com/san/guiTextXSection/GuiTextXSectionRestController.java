package com.san.guiTextXSection;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/guiTextXSection")
public class GuiTextXSectionRestController {
	
    @Autowired
    private GuiTextXSectionService guiTextXSectionService;

    /*
    **Return a listing of all the resources
    */
    @RequestMapping(method = RequestMethod.GET)
    public List<GuiTextXSection> getAll() {
        return guiTextXSectionService.getAll();
    }

    /*
    **Return one resource
    */
    @RequestMapping("/{id}")
    public GuiTextXSection getOne(@PathVariable Integer id) {
        return guiTextXSectionService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody GuiTextXSection guiTextXSection) {
        guiTextXSectionService.add(guiTextXSection);
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody GuiTextXSection guiTextXSection) {
        guiTextXSectionService.update(guiTextXSection);
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        guiTextXSectionService.delete(id);
    }
}
