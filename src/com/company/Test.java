package com.company;

public class Test {
    public static void main(String[] args) {
        Main main = new Main();
        AddUser addUserProxy = (AddUser)main.getAddUserProxy(new AddUserImpl());
        addUserProxy.addUser("不好喝的柚子茶");
    }
}
