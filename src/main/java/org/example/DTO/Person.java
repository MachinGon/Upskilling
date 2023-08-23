package org.example.DTO;

public final class Person {
    private final String name;
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

    public void setMyJob(Job myJob) {
        this.myJob = myJob;
    }
}
