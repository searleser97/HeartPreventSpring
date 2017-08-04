package com.san.medicineInLanguage;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/medicineInLanguage")
public class MedicineInLanguageRestController {
	
    @Autowired
    private MedicineInLanguageService medicineInLanguageService;

    /*
    **Return a listing of all the resources
    */
    @RequestMapping(method = RequestMethod.GET)
    public List<MedicineInLanguage> getAll() {
        return medicineInLanguageService.getAll();
    }

    /*
    **Return one resource
    */
    @RequestMapping("/{id}")
    public MedicineInLanguage getOne(@PathVariable Integer id) {
        return medicineInLanguageService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody MedicineInLanguage medicineInLanguage) {
        medicineInLanguageService.add(medicineInLanguage);
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody MedicineInLanguage medicineInLanguage) {
        medicineInLanguageService.update(medicineInLanguage);
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        medicineInLanguageService.delete(id);
    }
}
