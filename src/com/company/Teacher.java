package com.company;

import java.util.HashSet;

public class Teacher extends Person {

    private HashSet<String> subjects  ;

    public Teacher(String firstName, String lastName) {

        super(firstName, lastName);

        subjects = new HashSet<>() ;
    }

    public HashSet<String> getSubjects() {
        return subjects;
    }

    public void addSubject(String subjectName) {
        subjects.add(subjectName) ;
    }

    public boolean removeSub (String subjectName) {
        boolean succesed = subjects.remove(subjectName) ;
        return succesed ;
    }

    public boolean checkSubExist(String subjectName) {
        return subjectName.contains(subjectName) ;
    }

    public boolean checkSubject(String subjectName) {
        return subjects.contains(subjectName);
    }

}
