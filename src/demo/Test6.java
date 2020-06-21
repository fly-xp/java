package demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("demo.Student");
            Constructor con = clazz.getConstructor();
            Student stu = (Student) con.newInstance();
            Field f = clazz.getField("school");
            f.set(stu, "second school");
            String school = (String) f.get(stu);
            System.out.println(school);
            clazz.getDeclaredField("priva");
            f.setAccessible(true);
            f.set(stu, "ddd");
            String priva = (String) f.get(stu);
            System.out.println(priva);
            /*Method m=clazz.getMethod("setInfo", String.class, String.class);
            Object obj=clazz.newInstance();
            m.invoke(obj,"zhangsan","frist school");
            Method m1=clazz.getDeclaredMethod("test", String.class);
            m1.setAccessible(true);
            m1.invoke(obj,"li si");
            Method m2=clazz.getMethod("setInfo",int.class);
            m2.invoke(obj,12);
            Method m3=clazz.getMethod("getSchool");

            String school= (String) m3.invoke(obj);
            System.out.println(school);*/
            //Field[] fs = clazz.getFields();//获取类的公有属性，包含父类的公有属性
            /*Field[] fs = clazz.getDeclaredFields();//获取本类（不包含父类的属性）的所有属性，包括私有
            for (Field f:fs
                 ) {System.out.println("属性名称："+f.getName());
                 System.out.println("属性类型："+f.getType());
                System.out.println("修饰符："+f.getModifiers());

            }
           Package pack= clazz.getPackage();
            System.out.println(pack.getName());*/
            /*//Method[] ms=clazz.getMethods();//获取类的所有公有方法
            Method[] ms=clazz.getDeclaredMethods();//获取类的所有方法
            for (Method m:ms
                 ) {System.out.println("method name:"+m.getName());
                 System.out.println("return type:"+m.getReturnType());
                 System.out.println("attributive:"+m.getModifiers());
                 Class []c=m.getParameterTypes();
                for (Class c1:c
                     ) {System.out.println("parameter type:"+c1.getName());

                }
            }*/
//            Object o = clazz.newInstance();//相当于调用student类的无参公有的构造方法
//Student stu= (Student) o;
/*Constructor co=clazz.getConstructor(int.class);//指定获取有一个参数并且为有参的公有构造方法
Object obj=co.newInstance(11);
Student stu1= (Student) obj;
System.out.println(stu1.age);
//通过反射强制调用私有构造方法
            Constructor c = clazz.getDeclaredConstructor(int.class, String.class);
c.setAccessible(true);//解除私有封装，然后就可以对私有方法强制调用
            Student stu2= (Student) c.newInstance(12,"zhangsan");*/
            /*Class sup=clazz.getSuperclass();
            System.out.println(sup);
            Class[] in=clazz.getInterfaces();
            for (Class c:in
                 ) {System.out.println(c.getName());

            }
            Constructor[] con= clazz.getConstructors();//获取类的公有构造方法
            for (Constructor cs:con
                 ) {System.out.println(cs.getName());
                System.out.println(cs.getName()+"method"+cs.getModifiers());//getModifiers()修饰符
                Class[] pa = cs.getParameterTypes();
                for (Class p:pa
                     ) {System.out.println(p.getName()+cs.getName());

                }
            }

           Constructor []c1=clazz.getDeclaredConstructors();//获取类的所有构造方法
            for (Constructor cd:c1
                 ) {
System.out.println(cd.getName()+cd.getModifiers());
            }

            TypeVariable[] type = List.class.getTypeParameters();//获得泛型里的类型
            for (TypeVariable t:type
                    ) {System.out.println(t.getName()+"fff"+clazz.getName());

            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
