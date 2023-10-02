package org.functionalInterface;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main3{

    public static void main(String args[]){
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(40);
        lista.add(36);
        lista.add(536);
        lista.add(1010);

        //lo ideal es que se use para oper no muy complejas
        NumberToSquare mySquare = ( a ) -> a*a; //FunctionalInterface
        List<Integer> squareList = lista.stream().map(mySquare::square)
                .collect(Collectors.toList());
        squareList.forEach(n -> System.out.println("square: "+n));
        //System.out.println();

        //PRACTICA
        //hacer un lambda para n -> numeroRomano (IVXLCDM)
        LinkedHashMap<Integer,String> romanLetters = new LinkedHashMap<Integer,String>();
        romanLetters.put(1000,"M");
        romanLetters.put(900,"CM");
        romanLetters.put(500,"D");
        romanLetters.put(400,"CD");
        romanLetters.put(100,"C");
        romanLetters.put(90,"XC");
        romanLetters.put(50,"L");
        romanLetters.put(40,"XL");
        romanLetters.put(10,"X");
        romanLetters.put(9,"IX");
        romanLetters.put(5,"V");
        romanLetters.put(4,"IV");
        romanLetters.put(1,"I");

        List<String> romanos = lista.stream().map((num) -> {
            StringBuilder roman = new StringBuilder();
            for(Integer i : romanLetters.keySet()){
                while(num>=i){
                    num = num-i;
                    roman.append(romanLetters.get(i));
                }
            }
            return roman.toString();
        }).collect(Collectors.toList());

        romanos.forEach(n -> System.out.println("roman: "+n));

        Map<Integer,String> romanos2 = lista.stream().collect(Collectors.toMap(value -> value, value ->{
            StringBuilder roman = new StringBuilder();
            for(Integer i : romanLetters.keySet()){
                while(value>=i){
                    value = value-i;
                    roman.append(romanLetters.get(i));
                }
            }
            return roman.toString();
                }));

        romanos2.forEach((values, keys)->{
            System.out.println("*" + values + ":" + keys);
        });
    }


}
