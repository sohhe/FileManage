package com.company;

import java.util.InputMismatchException;

public class Menu {

    public static void main(String[] args) {

        UserContainer userContainer = new UserContainer();
        PhotoContainer photoContainer = new PhotoContainer();
        FileWorker fileWorker = new FileWorker();
        ScannerWrapper sw = new ScannerWrapper();

        System.out.println("Здарвствуйте, введите " +
                "\n1 - Добавить пользователя" +
                "\n2 - Добавить фотографию" +
                "\n3 - Найти пользователя по id" +
                "\n4 - Показать фотографии поль-ля по id" +
                "\n5 - Сохранить" +
                "\n0 - Выйти");

        try {

            int result = sw.readInt();

            for (int i = 0; i < 2 ; i++) {

                if (result == 1) {
                    User user = new User();
                    System.out.println("Введите имя пользователя: ");
                    user.setName(sw.readLine());
                    System.out.println("Введите id пользователя: ");
                    user.setId(sw.readLong());
                    System.out.println("Введите login пользователя: ");
                    user.setLogin(sw.readLine());
                    System.out.println("Введите password пользователя: ");
                    user.setPassword(sw.readLine());
                    userContainer.add(user);
//                    userContainer.poluchenie();
                    fileWorker.write("manage.txt",userContainer);
                    fileWorker.read("manage.txt");

                } else if (result == 2) {
                    Photo photo = new Photo();
                    System.out.println("Введите ширину фотографии: ");
                    photo.setWidth(sw.readInt());
                    photoContainer.add(photo);
                } else {
                    System.out.println("Введите 1 или 2");
                }
            }
        }catch(InputMismatchException e){
            System.out.println("Введите число");
        }




    }

}
