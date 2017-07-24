package com.company;

import java.util.InputMismatchException;

public class Menu {

    public static void main(String[] args) {

        UserContainer userContainer = new UserContainer();
        PhotoContainer photoContainer = new PhotoContainer();
        UserFileWorker userFileWorker = new UserFileWorker();
        PhotoFileWorker photoFileWorker = new PhotoFileWorker();
        ScannerWrapper sw = new ScannerWrapper();

        System.out.println("Здарвствуйте, введите " +
                "\n1 - Добавить пользователя" +
                "\n2 - Добавить фотографию" +
                "\n3 - Удалить пользователя по id" +
                "\n4 - Обновление данных пользователя по id" +
                "\n5 - Сохранить(запись данных в файл)" +
                "\n0 - Выйти");

        try {

            int result = sw.readInt();

            for (int i = 0; i < 2 ; i++) {

                if (result == 1) {
                    User user = new User();
                    System.out.println("Введите имя пользователя: ");
                    user.setName(sw.readLine());
                    user.setId(i); //user id
                    System.out.println("Введите login пользователя: ");
                    user.setLogin(sw.readLine());
                    System.out.println("Введите password пользователя: ");
                    user.setPassword(sw.readLine());
                    userContainer.add(user);

                } else if (result == 2) {
                    Photo photo = new Photo();
                    photo.setId(i);
                    System.out.println("Введите ширину фотографии: ");
                    photo.setWidth(sw.readInt());
                    System.out.println("Введите высоту фотографии: ");
                    photo.setHeight(sw.readInt());
                    photoContainer.add(photo);

                } else if (result == 3){
                    System.out.println("Введите id пользователя,которого хотите удалиь: ");
                    long id = sw.readLong();
                    userContainer.delete(id);

                } else if ( result == 4){
                    System.out.println("Введите id пользователя,данные которого хотите обновить: ");
                    long id = sw.readLong();
                    User user = new User();
                    System.out.println("Введите имя пользователя: ");
                    user.setName(sw.readLine());
                    System.out.println("Введите login пользователя: ");
                    user.setLogin(sw.readLine());
                    System.out.println("Введите password пользователя: ");
                    user.setPassword(sw.readLine());
                    userContainer.update(id,user);

                } else if (result == 5){
                    userFileWorker.write("manageUsers.txt",userContainer);
                    photoFileWorker.writePhoto("managePhoto.txt",photoContainer);

                } else if (result == 0){
                    break;
                }
                else {
                    System.out.println("Выберете пункт из списка");
                }
            }
        } catch(InputMismatchException e){
            System.out.println("Введите число");
        }




    }

}
