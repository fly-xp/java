package demo;

public class Test5 {
    public static void main(String[] args) {
        Person p = new Person();
        Class clazz = String.class;
        Class clazz1 = p.getClass();
        try {
            Class clazz2 = Class.forName("demo.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
