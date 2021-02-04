package com.ren.demo2;

public class UserServiceProxy implements UserService {

    private UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        log();
        userService.add();
    }

    public void delete() {
        log();
        userService.delete();
    }

    public void update() {
        log();
        userService.update();
    }

    public void query() {
        log();
        userService.query();
    }

    public void log() {
        System.out.println(Thread.currentThread() .getStackTrace()[2].getMethodName() + " method called!");
    }
}
