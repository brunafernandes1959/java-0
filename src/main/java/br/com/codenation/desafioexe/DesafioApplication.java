package br.com.codenation.desafioexe;


import java.util.ArrayList;

import java.util.List;


public class DesafioApplication {


    public static List<Integer> fibonacci() {

        List<Integer> fibonaccilist = new ArrayList<>();

        fibonaccilist.add(0);

        fibonaccilist.add(1);


        int fibonacciNumeros = 0;


        do {

            int i = fibonaccilist.size();

            fibonacciNumeros = fibonaccilist.get(i-1) + fibonaccilist.get(i-2);

            fibonaccilist.add(fibonacciNumeros);

        }while(fibonacciNumeros <= 350);


        return fibonaccilist;

    }


    public static Boolean isFibonacci(Integer a) {

        List<Integer> listaFibonacci = fibonacci();

        return listaFibonacci.contains(a);

    }


}