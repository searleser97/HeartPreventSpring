package com.san.guiTextInLanguage;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guiTextInLanguage")
public class GuiTextInLanguageRestController {
	
    @Autowired
    private GuiTextInLanguageService guiTextInLanguageService;

    /*
    **Return a listing of all the resources
    */
    @GetMapping
    public List<GuiTextInLanguage> getAll() {
        return guiTextInLanguageService.getAll();
    }

    /*
    **Return one resource
    */
    @GetMapping("/{id}")
    public GuiTextInLanguage getOne(@PathVariable Integer id) {
        return guiTextInLanguageService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @PostMapping
    public void add(@RequestBody GuiTextInLanguage guiTextInLanguage) {
        guiTextInLanguageService.add(guiTextInLanguage);
    }

    /*
    **Update the specified resource in storage.
    */
    @PatchMapping
    public void update(@RequestBody GuiTextInLanguage guiTextInLanguage) {
        guiTextInLanguageService.update(guiTextInLanguage);
    }

    /*
    **Remove the specified resource from storage.
    */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        guiTextInLanguageService.delete(id);
    }
}
