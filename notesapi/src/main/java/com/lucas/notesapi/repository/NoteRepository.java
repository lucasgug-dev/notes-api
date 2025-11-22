package com.lucas.notesapi.repository;

import java.util.List;

import com.lucas.notesapi.model.NoteEntity;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<NoteEntity, Long> {

    List<NoteEntity> findByTitle(String title);
    NoteEntity findById(long id);
}
