package com.san.sexInLanguage;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/sexInLanguage")
public class SexInLanguageRestController {
	
    @Autowired
    private SexInLanguageService sexInLanguageService;

    /*
    **Return a listing of all the resources
    */
    @RequestMapping(method = RequestMethod.GET)
    public List<SexInLanguage> getAll() {
        return sexInLanguageService.getAll();
    }

    /*
    **Return one resource
    */
    @RequestMapping("/{id}")
    public SexInLanguage getOne(@PathVariable Integer id) {
        return sexInLanguageService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody SexInLanguage sexInLanguage) {
        sexInLanguageService.add(sexInLanguage);
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody SexInLanguage sexInLanguage) {
        sexInLanguageService.update(sexInLanguage);
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        sexInLanguageService.delete(id);
    }
}
