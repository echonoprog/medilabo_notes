package com.ocs.medilabo_notes.service;

import com.ocs.medilabo_notes.model.Note;
import com.ocs.medilabo_notes.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {
    @Autowired
    private NoteRepository noteRepository;

    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    public List<Note> findAll() {
        return noteRepository.findAll();
    }

    public Optional<Note> getNoteById(String id) {
        return noteRepository.findById(id);
    }

    public void deleteNote(String id) {
        noteRepository.deleteById(id);
    }

    public List<Note> findByPatId(int patId) {
        return noteRepository.findByPatId(patId);
    }
}