package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pupil extends Person {

    private LocalDate birthDate ;

    List<Note> noteList = new ArrayList<>() ;

    public Pupil(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName);
        this.birthDate = birthDate ;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public  void addNote(Note note) {
        noteList.add(note) ;
    }

    public void addNote(String subjectName, double note) {
        Note newNote = new Note(subjectName, note);
        noteList.add(newNote);
    }

    public boolean hasAnyNote() {
        return (!noteList.isEmpty()) ;
    }

    @Override
    public String toString() {
        return getFirstName() +" " +getLastName() + " " +birthDate ;
    }
}
