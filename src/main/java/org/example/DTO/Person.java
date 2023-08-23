package org.example.DTO;

public class Person {
    private String name;
    private Job myJob;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setMyJob(Job myJob) {
        this.myJob = myJob;
    }
}
