package org.encapsulation.DTO;

public final class Military extends Army{
    String name;
    public Military(MilitaryRank rank) {
        this.myRank = rank;
    }

    @Override
    public void myPrinter(String msj){
        System.out.println("custom Military printed "+ msj);
    }

    public void printJob(){
        System.out.println("Im a militar, my rank is: " + this.myRank);
    }

}
