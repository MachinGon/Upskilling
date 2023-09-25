package functionalInterface;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {

    public static void main(String args[]){
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        //lo ideal es que se use para oper no muy complejas
        NumberToSquare mySquare = ( a ) -> a*a; //FunctionalInterface

        List<Integer> squareList = lista.stream().map(mySquare::square)
                .collect(Collectors.toList());

        squareList.forEach(n -> System.out.println("square: "+n));
        //System.out.println();

        //PRACTICA
        //hacer un lambda para n -> numeroRomano (IVXCM)

    }
}
