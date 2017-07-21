package com.company;


import java.io.Serializable;

public class UserContainer implements Serializable {
    public  static  int counter;
    private User[] users = new User[1];


    public void add(User user){
            users[counter] = user;
            counter++;

        if (users.length == counter){
            User[] users1 = new User[counter +5];
            for (int i = 0; i < users1.length; i++ ) {
                users1[i] = users[i];
            }
            users = users1;
        }


    }

    public void poluchenie(){
        for (int i = 0; i <  users.length; i++) {
            System.out.println(users[i]);
        }
    }

    public void delete(long id){

    }

    public void update(){

    }


}
