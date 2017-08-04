package com.san.section;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletRequest;
import java.util.List;

@RestController
@RequestMapping("/section")
public class SectionRestController {
	
    @Autowired
    private SectionService sectionService;

    /*
    **Return a listing of all the resources
    */
    @GetMapping
    public List<Section> getAll() {
        return sectionService.getAll();
    }

    /*
    **Return one resource
    */
    @GetMapping("/{id}/{language}")
    public SectionResponse getOne(@PathVariable String id, @PathVariable String language, ServletRequest request) {
        return sectionService.getSectionResponse(id, "USER", language);
    }

    @PostMapping
    public SectionResponse getOne(@RequestBody SectionRequest sectionRequest) {
        return null;
    }

    /*
    **Store a newly created resource in storage.
    */
    @PostMapping("/add")
    public void add(@RequestBody Section section) {
        sectionService.add(section);
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody Section section) {
        sectionService.update(section);
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        sectionService.delete(id);
    }
}
