package com.diarywork.diaryapi.entry;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryService{

    @Autowired
    private EntryRepo entryRepo;

    public List<Entry> getEntry(){
        return entryRepo.findAll();
    }


    public Entry addNewEntry(Entry entry){
        return entryRepo.save(entry);
    }

}
