package org.example.DTO;

public final class SpecificJob implements Job{

    String jobName;

    public SpecificJob(String jobName) {
        this.jobName = jobName;
    }

    public void printJob(){
        System.out.println("Im a "+ jobName);
    }
}
