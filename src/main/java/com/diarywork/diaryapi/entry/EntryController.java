package com.diarywork.diaryapi.entry;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entry")
public class EntryController {

    @Autowired
    private EntryService entryService;

    @GetMapping
    public ResponseEntity<List<Entry>> getEntry(){
        List<Entry> entrys = entryService.getEntry();
        return new ResponseEntity<>(entrys, HttpStatus.OK);
    }

    @PostMapping("/add")
    public void addNewEntry(@RequestBody Entry entry){
        entryService.addNewEntry(entry);

    }
}
