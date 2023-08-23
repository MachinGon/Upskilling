package org.example;

import org.example.DTO.Militar;
import org.example.DTO.Person;
import org.example.DTO.SpecificJob;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Person myPerson1 = new Person("Pedro", new SpecificJob("Policemen"));
        Person myPerson2 = new Person("Juan", new SpecificJob("Doctor"));
        Person myPerson3 = new Person("Enrique", new Militar("Marshall"));

        //agregar con abstract class
        //militar, que habra varios (cabo, sargento, general,...)
        //clase militar agregue rango
        //constructores y const

        myPerson1.getMyJob().printJob();
        myPerson2.getMyJob().printJob();
        myPerson3.getMyJob().printJob();
    }
}