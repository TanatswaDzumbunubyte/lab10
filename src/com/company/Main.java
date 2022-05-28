package com.company;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileInputStream TJ;
        int tj2;
        try{
           TJ=new FileInputStream("test123.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }



        //read bytestil EOF encountered
        try{
            do{
                tj2=TJ.read();//read from file
                if (tj2!= -1) {
                    System.out.print((char) tj2);
                }
            }
            while(tj2!= -1);
        } catch (IOException e) {
            System.out.println("Error Reading File");
        }
        finally {
            try{
                TJ.close();
                System.out.println("File Closed");
            }
            catch (IOException e) {
                System.out.println("Error Closing File");
            }
        }
    }
}