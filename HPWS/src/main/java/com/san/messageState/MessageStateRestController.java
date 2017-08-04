package com.san.messageState;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messageState")
public class MessageStateRestController {
	
    @Autowired
    private MessageStateService messageStateService;

    /*
    **Return a listing of all the resources
    */
    @GetMapping
    public List<MessageState> getAll() {
        return messageStateService.getAll();
    }

    /*
    **Return one resource
    */
    @GetMapping("/{id}")
    public MessageState getOne(@PathVariable Integer id) {
        return messageStateService.getOne(id);
    }

    /*
    **Store a newly created resource in storage.
    */
    @PostMapping
    public void add(@RequestBody MessageState messageState) {
        messageStateService.add(messageState);
    }

    /*
    **Update the specified resource in storage.
    */
    @PatchMapping
    public void update(@RequestBody MessageState messageState) {
        messageStateService.update(messageState);
    }

    /*
    **Remove the specified resource from storage.
    */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        messageStateService.delete(id);
    }
}
