package com.san.diseaseInLanguage;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/diseaseInLanguage")
public class DiseaseInLanguageRestController {
	
    @Autowired
    private DiseaseInLanguageService diseaseInLanguageService;

    /*
    **Return a listing of all the resources
    */
    @RequestMapping(method = RequestMethod.GET)
    public List<DiseaseInLanguage> getAll() {
        return diseaseInLanguageService.getAll();
    }

    /*
    **Return one resource
    */
    @RequestMapping("/{id}")
    public DiseaseInLanguage getOne(@PathVariable Integer id) {
        return diseaseInLanguageService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody DiseaseInLanguage diseaseInLanguage) {
        diseaseInLanguageService.add(diseaseInLanguage);
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody DiseaseInLanguage diseaseInLanguage) {
        diseaseInLanguageService.update(diseaseInLanguage);
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        diseaseInLanguageService.delete(id);
    }
}
