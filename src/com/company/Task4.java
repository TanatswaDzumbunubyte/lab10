package com.company;

import java.io.*;

class DataManagement{
    String Dzumbunu56874 ;
    void ReadDataDzumbunu56874() throws IOException {
        BufferedReader tv = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input Your Full Name");
        Dzumbunu56874=tv.readLine();
    }
    void WriteDataToDzumbunu56874(){
        try(FileWriter ts = new FileWriter("task4.txt")) {
            ts.write(Dzumbunu56874);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void readDataViaDzumbunu56874(){
        String result;
        try(BufferedReader br = new BufferedReader(new FileReader("task4.txt"))) {
            while((result=br.readLine()) !=null){
                System.out.println(result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Task4 {
    public static void main(String []args) throws IOException {
        DataManagement obj = new DataManagement();
        obj.readDataViaDzumbunu56874();
        obj.WriteDataToDzumbunu56874();
        System.out.println();
        obj.ReadDataDzumbunu56874();
    }
}