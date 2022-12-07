package vn.sunasterisk.sunwebsite;

import vn.sunasterisk.sunwebsite.model.UserDto;
import vn.sunasterisk.sunwebsite.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService us = new UserService();
        us.registerUser("nguyenvana", "123");
        us.registerUser("nguyenvanb", "123");
        us.registerUser("nguyenvanc", "123");
        us.registerUser("nguyenvand", "123");
        us.registerUser("nguyenvanr", "123");
        us.registerUser("nguyenvanf", "123");
        System.out.print("nguyenvanw ");
        if(us.login("nguyenvanw","123")){
            System.out.println("Login thành công");
        }else {
            System.out.println("Login thất bại");
        }
        System.out.print("nguyenvanc ");
        if(us.login("nguyenvanc","123")){
            System.out.println("Login thành công");
        }else {
            System.out.println("Login thất bại");
        }
        System.out.print("nguyenvand ");
        if(us.login("nguyenvand","123")){
            System.out.println("Login thành công");
        }else {
            System.out.println("Login thất bại");
        }
        System.out.println("Danh sách memnber trong UserService");
        for (UserDto u : us.getListUser()){
            System.out.println(u);
        }
    }
}