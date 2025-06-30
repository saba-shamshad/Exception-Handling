package com.mycompany.javabackend02;

import java.io.File;
import java.util.Scanner;

public class JavaBackend02 {

    public static void main(String[] args) {
//        int a = 5;
//        int b = 0;
//        try{
//             System.out.println(a/b);
//        }catch(Exception e){
//            System.out.println(e);
//        }

        String str = null;
        try{
            System.out.println(str.length());
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            File file = new File("myfile.txt");
          Scanner sc = new Scanner(file);
        }catch(Exception e){
            System.out.println(e);
        }
          
       
        
    }
}
