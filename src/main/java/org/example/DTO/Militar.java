package org.example.DTO;

public class Militar extends Army{

    String name;
    public Militar(String name) {
        for (MilitaryRank rank : MilitaryRank.values()){
            if(rank.name().equalsIgnoreCase(name)){
                this.myRank = rank;
            }
        }
        if(this.myRank == null){
            this.myRank = MilitaryRank.Cadet;
            System.out.println("  Invalid rank, set to cadet");

        }
    }

    public void printJob(){
        System.out.println("Im a militar, my rank is: " + this.myRank);
    }

}
