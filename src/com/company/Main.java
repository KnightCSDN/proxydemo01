package com.company;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main implements InvocationHandler {
    private AddUser addUser;
    public Object getAddUserProxy(AddUserImpl addUser){
        this.addUser=addUser;
        return Proxy.newProxyInstance(addUser.getClass().getClassLoader(),addUser.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法之前执行");
        Object o = method.invoke(addUser, args);
        System.out.println("方法之后执行");
        return o;
    }
}
