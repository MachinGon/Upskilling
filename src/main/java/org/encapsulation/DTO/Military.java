package org.encapsulation.DTO;

public final class Military extends Army{
    String name;
    public Military(MilitaryRank rank) {
        this.myRank = rank;
    }

    public void printJob(){
        System.out.println("Im a militar, my rank is: " + this.myRank);
    }

}
