package org.example.DTO;

public class Person {
    final private String name;
    final private Job myJob;

    public Person(String name, Job myJob) {
        this.name = name;
        this.myJob = myJob;
    }

    public String getName() {
        return name;
    }

    public Job getMyJob() {
        return myJob;
    }

}
