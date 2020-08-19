package inqoo;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program1 {


    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        int a;

        Map<Integer, String> map = new TreeMap<>();
        map.put(0, "zero");
        map.put(1, "jeden");
        map.put(2, "dwa");
        map.put(3, "trzy");
        map.put(4, "cztery");
        map.put(5, "pięć");
        map.put(6, "sześć");
        map.put(7, "siedem");
        map.put(8, "osiem");
        map.put(9, "dziewięć");


        System.out.println("Podaj cyfrę");
        a = Math.abs(skaner.nextInt());
        String string = map.get(a);

        if (string == null){
            throw new NotANumberException();

        }
        else {
            System.out.println(map.get(a));

        }
    }}











//        if (Math.abs(a) > 9 ) {
//            throw new IllegalArgumentException("Błąd. To nie jest cyfra");
//        }
//            else System.out.println("Podałeś cyfrę. Jest ok");
//        }



