package com.company;


import java.io.Serializable;

public class PhotoContainer implements Serializable {

    public int counter;
    private Photo[] photos = new Photo[1];

    public void add(Photo photo){
        photos[counter] = photo;
        counter++;

        if (photos.length == counter){
            Photo[] photos1 = new Photo[counter +5];
            for (int i = 0; i < photos.length; i++ ) {
                photos1[i] = photos[i];
            }
            photos = photos1;
        }
    }
}

