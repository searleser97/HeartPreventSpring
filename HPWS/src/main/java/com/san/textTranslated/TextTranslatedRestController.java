package com.san.textTranslated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/textTranslated")
public class TextTranslatedRestController {
	
    @Autowired
    private TextTranslatedService textTranslatedService;

    /*
    **Return a listing of all the resources
    */
    @GetMapping
    public List<TextTranslated> getAll() {
        return textTranslatedService.getAll();
    }

    /*
    **Return one resource
    */
    @GetMapping("/{id}")
    public TextTranslated getOne(@PathVariable Integer id) {
        return textTranslatedService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @PostMapping
    public void add(@RequestBody TextTranslated textTranslated) {
        textTranslatedService.add(textTranslated);
    }

    /*
    **Update the specified resource in storage.
    */
    @PatchMapping
    public void update(@RequestBody TextTranslated textTranslated) {
        textTranslatedService.update(textTranslated);
    }

    /*
    **Remove the specified resource from storage.
    */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        textTranslatedService.delete(id);
    }
}
