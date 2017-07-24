package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PhotoFileWorker {

    public void writePhoto(String name,PhotoContainer photoContainer){

        File file = new File(name);

        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(photoContainer);

            oos.close();
            fos.close();
        }catch(IOException ioe){
            System.out.println("oops,Exeption while writting the photo to the file");
        }

    }
}
