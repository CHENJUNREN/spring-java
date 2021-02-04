package com.ren.demo2;

public class Client {

    public static void main(String[] args) {
        UserService userService = new UserServiceProxy(new UserServiceImpl());
        userService.add();
        userService.query();
        userService.update();
        userService.delete();
    }

}
