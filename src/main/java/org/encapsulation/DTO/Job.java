package org.encapsulation.DTO;

public interface Job {
    void printJob(); // Functional Interface ya que tiene un solo metodo abstracto

    //En una clase abstracta SI PUEDES declrar un metodo final

    default void myPrinter(String msj){
        //Operacion que se vaya a compartir pej.
        System.out.println("mi metodo default: "+msj);
    };
}
