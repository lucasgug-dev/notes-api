package com.lucas.notesapi.controller;

import com.lucas.notesapi.model.NoteEntity;
import com.lucas.notesapi.service.NoteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("")
    public ResponseEntity<List<NoteEntity>> getAllNotes() {
        return ResponseEntity.ok(noteService.getAllNotes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<NoteEntity> getNoteById(@PathVariable Long id) {
        NoteEntity note = noteService.getNoteById(id);
        if (note != null) {
            return ResponseEntity.ok(note);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<NoteEntity> createNote(@RequestBody NoteEntity note) {
        NoteEntity createdNote = noteService.createNote(note);
        return ResponseEntity.ok(createdNote);
    }

    @PutMapping("/{id}")
    public ResponseEntity<NoteEntity> updateNote(@PathVariable Long id, @RequestBody NoteEntity updatedNote) {
        NoteEntity note = noteService.updateNote(id, updatedNote);
        if (note != null) {
            return ResponseEntity.ok(note);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<NoteEntity> deleteNote(@PathVariable Long id) {
        NoteEntity deletedNote = noteService.deleteNote(id);
        if (deletedNote != null) {
            return ResponseEntity.ok(deletedNote);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/search")
    public ResponseEntity<NoteEntity> findByTitle(@RequestParam String title) {
        NoteEntity note = noteService.findByTitle(title);
        if (note != null) {
            return ResponseEntity.ok(note);
        }
        return ResponseEntity.notFound().build();
    }
}
