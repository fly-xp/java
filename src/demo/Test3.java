package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test3 {
    public static void main(String[] args) {
        try {
            //Test3.testSerialize();
            Test3.testDeserialize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*对象序列化*/
    public static void testSerialize() throws Exception {
        //定义对象的输出流，把对象序列化之后的流放入到指定文件
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:/Users/xp/Desktop/1.txt"));
        Person p = new Person();
        p.age = 11;
        p.name = "alice";
        out.writeObject(p);
        out.flush();
        out.close();
    }

    public static void testDeserialize() throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/Users/xp/Desktop/1.txt"));
        Object obj = in.readObject();
        Person p = (Person) obj;
        System.out.println(p.age);
        System.out.println(p.name);
    }
}
