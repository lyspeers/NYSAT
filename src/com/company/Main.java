package com.company;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Map<String, String> school = new HashMap<>();
        Map<String, String> satR = new HashMap<>();
        Map<String, String> satW = new HashMap<>();
        Map<String, String> satM = new HashMap<>();
        Map<String, String> satT = new HashMap<>();


        Scanner infoMan = new Scanner(new File("scores.txt"));
        int maxIndx = -1;
        String storage[]= new String[1000];
        String scores[]= new String[1000];
        Integer bestScore[]= new Integer[1000];
        String split[];
        int count = 0;


        while(infoMan.hasNext())
        {
            maxIndx++;
            scores[maxIndx]=infoMan.nextLine();
            storage[maxIndx]=infoMan.nextLine();
        }
        for(int i = 0;i<storage.length;i++){

            if(storage[i] == null)
                break;


            split=storage[i].split("\t");
            school.put(split[1], split[2]);

            if(split.length > 18) {
                if (Integer.parseInt(split[18]) > 500 || Integer.parseInt(split[19]) > 500  || Integer.parseInt(split[20]) > 500 ) {


                    count++;

                    Integer j = Integer.parseInt(split[18]) + Integer.parseInt(split[19]) + Integer.parseInt(split[20]);
                    String t = j.toString();
                    satT.put(split[1], t);

                    bestScore[i] = Integer.parseInt(satT.get(split[1]));



                }
                else{

                    count++;
                    System.out.println("missed");

                }
            }
        }


    }
}
