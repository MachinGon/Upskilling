package org.encapsulation;

import org.encapsulation.DTO.Military;
import org.encapsulation.DTO.MilitaryRank;
import org.encapsulation.DTO.Person;
import org.encapsulation.DTO.SpecificJob;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person myPerson1 = new Person("Pedro", new SpecificJob("Policemen"));
        Person myPerson2 = new Person("Juan", new SpecificJob("Doctor"));
        Person myPerson3 = new Person("Enrique", new Military(MilitaryRank.Marshall));

        //agregar con abstract class
        //militar, que habra varios (cabo, sargento, general,...)
        //clase militar agregue rango
        //constructores y const

        myPerson1.getMyJob().printJob();
        myPerson2.getMyJob().printJob();
        myPerson3.getMyJob().printJob();
    }
}