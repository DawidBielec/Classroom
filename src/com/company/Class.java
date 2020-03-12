package com.company;

import java.util.ArrayList;
import java.util.List;

public class Class {

    private static Class INSTANCE ;

    private String className ;
    private List<Pupil> pupilsList = new ArrayList<>();
    private List<Teacher> teachersList = new ArrayList<>() ;
    private List<Subject> subjectsList = new ArrayList<>() ;
    
    private Class(String className) {
        this.className = className ;
    }

    public static Class getInstance(String className) {

        if(INSTANCE == null) {
            INSTANCE = new Class(className) ;
        }
        return INSTANCE ;
    }

    public void addPupil(Pupil pupil) {
        pupilsList.add(pupil) ;
    }

    public void addTeacher(Teacher teacher) {
        teachersList.add(teacher) ;
    }

    public void addSubject(Subject subject) {
        subjectsList.add(subject) ;
    }

    public void showPupils() {
        System.out.println("Lista uczniów");
        for ( Pupil pupil : pupilsList ) {
            System.out.println(pupil);
        }
    }

    public void addSubject(String subjectName) {
        subjectsList.add(new Subject(subjectName));
    }

    public void showTeachers() {
        System.out.println("Lista nauczycieli");
        for ( Teacher teacher : teachersList ) {
            System.out.println(teacher);
        }
    }

    public void showSubject() {
        System.out.println("Lista przedmiotów");
        for ( Subject subject : subjectsList ) {
            System.out.println(subject);
        }
    }

    public void addTeacherToSubjects() throws ClassException {
        for(Subject subject : subjectsList)
            if (subject.getTeacher() == null) {
                String subjectName = subject.getName();
                List<Teacher> candidatesForSubject = new ArrayList<>();
                for(Teacher teacher : teachersList)
                    if (teacher.checkSubject(subjectName))
                        candidatesForSubject.add(teacher);
                if (candidatesForSubject.size() == 0)
                    throw new ClassException("Nie ma nauczyciela dla :" + subjectName);
                int los = (int)(Math.random()*candidatesForSubject.size());
                Teacher choosenTeacher = candidatesForSubject.get(los);
                subject.setTeacher(choosenTeacher);
            }
    }

    public void showSubjects() {
        for(Subject subject : subjectsList)
            System.out.format("%12s nauczyciel: %-20s %n", subject.getName(), subject.getTeacher().toString());
    }

    public void addNote(Pupil pupil, String subjectName, double note) throws ClassException {
        boolean exist = false;
        for(Subject subject : subjectsList)
            if (subject.getName().compareTo(subjectName) == 0) {
                exist = true;
                break;
            }
        if (exist)
            pupil.addNote(subjectName, note);
        else
            throw  new ClassException("nie ma przedmiotu:" + subjectName);
    }

}
