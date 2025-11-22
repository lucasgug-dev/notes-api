package com.lucas.notesapi.service;

import com.lucas.notesapi.model.NoteEntity;
import com.lucas.notesapi.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<NoteEntity> getAllNotes() {
        return (List<NoteEntity>) noteRepository.findAll();
    }

    public NoteEntity getNoteById(Long id) {
        return noteRepository.findById(id).orElse(null);
    }

    public NoteEntity createNote(NoteEntity note) {
        return noteRepository.save(note);
    }

    public NoteEntity deleteNote(Long id) {
        return noteRepository.findById(id)
                .map(note -> {
                    noteRepository.delete(note);
                    return note;
                })
                .orElse(null);
    }

    public NoteEntity updateNote(Long id, NoteEntity updatedNote) {
        return noteRepository.findById(id)
                .map(note -> {
                    note.setTitle(updatedNote.getTitle());
                    note.setContent(updatedNote.getContent());
                    return noteRepository.save(note);
                })
                .orElse(null);
    }

    public NoteEntity findByTitle(String title) {
        return noteRepository.findByTitle(title)
                .stream()
                .findFirst()
                .orElse(null);
    }
}
