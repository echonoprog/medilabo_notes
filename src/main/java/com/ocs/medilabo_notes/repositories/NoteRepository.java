package com.ocs.medilabo_notes.repositories;

import com.ocs.medilabo_notes.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends MongoRepository<Note,String> {


        List<Note> findByPatId(int patId);
    }

