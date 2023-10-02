package org.functionalInterface;

@FunctionalInterface
public interface NumberToSquare {
    Integer square(Integer a); //solo puedes tener un ABSTRACT

    default Integer square2(){
        return 1;
    };
}
