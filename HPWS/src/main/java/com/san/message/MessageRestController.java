package com.san.message;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageRestController {
	
    @Autowired
    private MessageService messageService;

    /*
    **Return a listing of all the resources
    */
    @GetMapping
    public List<Message> getAll() {
        return messageService.getAll();
    }

    /*
    **Return one resource
    */
    @GetMapping("/{id}")
    public Message getOne(@PathVariable Integer id) {
        return messageService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @PostMapping
    public void add(@RequestBody Message message) {
        messageService.add(message);
    }

    /*
    **Update the specified resource in storage.
    */
    @PatchMapping
    public void update(@RequestBody Message message) {
        messageService.update(message);
    }

    /*
    **Remove the specified resource from storage.
    */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        messageService.delete(id);
    }
}
