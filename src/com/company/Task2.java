package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Task2 {
    public static  void main(String[] args) throws IOException {
        int tj2;
        try (
                FileInputStream TJ=new FileInputStream("test123.txt"))
        { //READ DATA
            do{
                tj2=TJ.read();//read from file
                if (tj2!= -1){System.out.print(tj2);}
            }
            while(tj2!= -1);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        catch (IOException e) {
            System.out.println("Error Reading The File");
        }

    }
}