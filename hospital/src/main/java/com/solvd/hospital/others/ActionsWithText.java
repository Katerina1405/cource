package com.solvd.hospital.others;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ActionsWithText {
    FileReader myFile = null;
    BufferedReader buff = null;
        try {
        myFile=new FileReader("text.txt");
        buff = new BufferedReader(myFile);
        while (true) {
            // a line is read from a file
            String line = buff.readLine();

            // check if end of file has been reached
            if (line == null) break;
            System.out.println(line);
        } // end of cycle while
    }
        catch (IOException e){
        e.printStackTrace();
    }
        finally {
        try{
            buff.close();
            myFile.close();
        }
        catch(IOException e1){
            e1.printStackTrace();
        }
    }
}

