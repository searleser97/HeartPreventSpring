package com.san.diseaseXUser;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/diseaseXUser")
public class DiseaseXUserRestController {
	
    @Autowired
    private DiseaseXUserService diseaseXUserService;

    /*
    **Return a listing of all the resources
    */
    @RequestMapping(method = RequestMethod.GET)
    public List<DiseaseXUser> getAll() {
        return diseaseXUserService.getAll();
    }

    /*
    **Return one resource
    */
    @RequestMapping("/{id}")
    public DiseaseXUser getOne(@PathVariable Integer id) {
        return diseaseXUserService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody DiseaseXUser diseaseXUser) {
        diseaseXUserService.add(diseaseXUser);
    }

    /*
    **Update the specified resource in storage.
    */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody DiseaseXUser diseaseXUser) {
        diseaseXUserService.update(diseaseXUser);
    }

    /*
    **Remove the specified resource from storage.
    */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        diseaseXUserService.delete(id);
    }
}
