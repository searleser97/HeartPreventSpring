package com.san.guiText;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/guiText")
public class GuiTextRestController {
	
    @Autowired
    private GuiTextService guiTextService;

    /*
    **Return a listing of all the resources
    */
    @RequestMapping(method = RequestMethod.GET)
    public List<GuiText> getAll() {
        return guiTextService.getAll();
    }

    /*
    **Return one resource
    */
    @RequestMapping("/{id}")
    public GuiText getOne(@PathVariable Integer id) {
        return guiTextService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody GuiText guiText) {
        guiTextService.add(guiText);
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody GuiText guiText) {
        guiTextService.update(guiText);
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        guiTextService.delete(id);
    }
}
