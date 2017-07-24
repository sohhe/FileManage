package com.company;


import java.io.Serializable;
import java.util.Arrays;

public class UserContainer implements Serializable {

    public int counter;
    private User[] users = new User[1];


    public void add(User user){
            users[counter] = user;
            counter++;

        if (users.length == counter){
            User[] users1 = new User[counter +5];
            for (int i = 0; i < users.length; i++ ) {
                users1[i] = users[i];
            }
            users = users1;
        }
    }

    public void delete(long id){
        for (int i = 0; i < users.length; i++) {
            if (id == i){
                users[i] = null;
            }else{
                System.out.println("Пользователm с таким id не найден!");
            }
        }
    }

    public void update(long id,User user){
        for (int i = 0; i < users.length ; i++) {
            if (id == i) {
                users[i] = user;
            }else{
                System.out.println("Пользователm с таким id не найден!");
            }
        }
    }

    @Override
    public String toString() {
        return "UserContainer{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}
