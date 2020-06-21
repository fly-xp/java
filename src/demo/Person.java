package demo;

import java.io.Serializable;

public class Person implements Serializable {
    /*
     * 一个表示序列化版本标识符的静态变量
     * 用来表明类的不同版本间的兼容性*/
    private static final long serialVersionUID = 1l;
    /*public Person(int a){
        age=a;
    }*/
    public int age;
    public String name;

    /*public int getAge() {
        return age;
    }

    public void setAge(int a) {
        if(a>=0&&a<=130){
            age=a;
            System.out.println("age:"+age);
        }else {
            System.out.println("false:"+a);
        }
    }*/
    public void showInfo() {
        System.out.println(age);
    }

    ClassLoader cl = this.getClass().getClassLoader();
    Class c;

    {
        try {
            c = cl.loadClass("Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
