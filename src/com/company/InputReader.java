package com.company;

import java.io.File;
import java.util.Scanner;

public class InputReader {

    public int[] readfiles(String file){
        try {

            File f = new File(file);
            Scanner s = new Scanner(f);
            int ctr = 0;
            while (s.hasNext()){
                ctr++;
                s.nextInt();
            }
            int [] arr = new int[ctr];
            Scanner s1 = new Scanner(f);
            for (int i = 0; i < ctr; i++) {
                arr[i] = s1.nextInt();

            }
            return arr;

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}

