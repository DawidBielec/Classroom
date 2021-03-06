package com.company;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Class aClass = Class.getInstance("klasa przyrodnicza") ;

        Pupil p0 = new Pupil("Janek", "Wiśniewski", LocalDate.of(2005, 2, 23));

        Pupil p1 = new Pupil("Jan", "Nowak", LocalDate.of(2005, 5, 21));
        Pupil p2 = new Pupil("Anna", "Mucha", LocalDate.of(2003, 6, 11));
        Pupil p3 = new Pupil("Leon", "Czyżyk", LocalDate.of(2006, 7, 12));
        Pupil p4 = new Pupil("Olga", "Praska", LocalDate.of(2005, 8, 2));
        Pupil p5 = new Pupil("Sylwia", "Piątek", LocalDate.of(2005, 1, 22));

        p1.addNote(new Note("matematyka", 4.5));
        p1.addNote(new Note("fizyka", 4.0));
        p1.addNote(new Note("chemia", 3.5));
        p1.addNote(new Note("geografia", 5.0));
        p1.addNote(new Note("historia", 3.0));
        p1.addNote(new Note("język polski", 2.0));
        p1.addNote(new Note("język angielski", 2.0));
        p2.addNote(new Note("matematyka", 3.5));
        p2.addNote(new Note("fizyka", 3.0));
        p2.addNote(new Note("chemia", 2.5));
        p2.addNote(new Note("geografia", 3.0));
        p2.addNote(new Note("historia", 3.5));
        p2.addNote(new Note("język polski", 3.0));
        p2.addNote(new Note("język angielski", 4.0));
        p3.addNote(new Note("matematyka", 3.5));
        p3.addNote(new Note("fizyka", 3.0));
        p3.addNote(new Note("chemia", 3.5));
        p3.addNote(new Note("geografia", 2.0));
        p3.addNote(new Note("historia", 2.0));
        p3.addNote(new Note("język polski", 3.5));
        p4.addNote(new Note("matematyka", 3.5));
        p4.addNote(new Note("fizyka", 4.5));
        p4.addNote(new Note("chemia", 4.5));
        p4.addNote(new Note("geografia", 4.0));
        p4.addNote(new Note("historia", 4.0));
        p4.addNote(new Note("język polski", 3.5));
        p4.addNote(new Note("język angielski", 4.0));
        p5.addNote(new Note("matematyka", 4.5));
        p5.addNote(new Note("fizyka", 5.0));
        p5.addNote(new Note("chemia", 4.5));
        p5.addNote(new Note("geografia", 4.5));
        p5.addNote(new Note("historia", 5.0));
        p5.addNote(new Note("język polski", 3.5));
        p5.addNote(new Note("język angielski", 4.0));

        List<Pupil> pupils = (List<Pupil>) Arrays.asList(new Pupil[] {p1,p2,p3,p4,p5});

        Teacher t0 = new Teacher("Tomasz", "Batko");

        t0.addSubject("matematyka");
        t0.addSubject("fizyka");

        Teacher t1 = new Teacher("Zenon", "Żyto");
        Teacher t2 = new Teacher("Dorota", "Nowakowska");
        Teacher t3 = new Teacher("Cecylia", "Ciesielska");
        Teacher t4 = new Teacher("Roman", "Dmowczyk");

        t1.addSubject("matematyka");
        t1.addSubject("fizyka");
        t1.addSubject("chemia");
        t1.addSubject("chemia");
        t1.addSubject("chemia");
        t1.addSubject("WF");
        t2.addSubject("język polski");
        t2.addSubject("język angielski");
        t2.addSubject("język niemiecki");
        t2.addSubject("historia");
        t3.addSubject("geografia");
        t3.addSubject("chemia");
        t3.addSubject("historia");
        t3.addSubject("religia");
        t4.addSubject("matematyka");
        t4.addSubject("fizyka");
        t4.addSubject("religia");
        t4.addSubject("język angielski");

        aClass.addPupil(p1);
        aClass.addPupil(p2);
        aClass.addPupil(p3);
        aClass.addPupil(p4);
        aClass.addPupil(p5);

        aClass.addTeacher(t1);
        aClass.addTeacher(t2);
        aClass.addTeacher(t3);
        aClass.addTeacher(t4);

        aClass.addSubject("język polski");
        aClass.addSubject("język angielski");
        aClass.addSubject("historia");
        aClass.addSubject("geografia");
        aClass.addSubject("matematyka");
        aClass.addSubject("fizyka");
        aClass.addSubject("chemia");

    }
}
