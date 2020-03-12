package com.company;

public class Subject {

    private String name ;
    private Teacher teacher ;

    public Subject(String name) {
        this.name = name;
    }

    public Subject(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {

        return name + " uczy: " + teacher ;
    }
}
