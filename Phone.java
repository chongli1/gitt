package com.chl.bean;

/**
 * 标准的单例模式
 * Spring 框架默认 单例模式
 */
public class Phone {
    //2、在对象本身new自己，而且是一个static修饰的
    private static Phone ourInstance = new Phone();

    public static Phone getInstance() {

        return ourInstance;
    }

    //1、无参构造方法私有化
    private Phone() {
    }

    public static void main(String[] args) {
        //测试单例模式
        Phone p1 = Phone.getInstance();
        Phone p2 = Phone.getInstance();
        System.out.println(p1 == p2);
    }
}
