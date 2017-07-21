package com.company;


import java.io.*;
import java.io.IOException;

public class FileWorker  {


    public void write(String filename,UserContainer userContainer){
        File file = new File(filename);

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(userContainer);

            oos.close();
            fos.close();
        }catch(IOException ioe){
            System.out.println("something went wrong");

        }
    }

    public  void read(String filename){
        File file = new File(filename);

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            UserContainer userContainer = (UserContainer) ois.readObject();
            System.out.println(userContainer);
            ois.close();
            fis.close();
        }catch(IOException | ClassNotFoundException e){
            System.out.println("something went wrong with read");
        }
    }


}
