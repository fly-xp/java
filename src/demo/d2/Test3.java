package demo.d2;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("d");
        list.add("a");
        list.add("c");
        list.add("b");
        list.add("a");
        System.out.println(Collections.frequency(list, "b"));
        Collections.swap(list, 0, 3);
        Collections.replaceAll(list, "a", "aa");
        System.out.println(list);
        Collections.reverse(list);
        Collections.shuffle(list);//随机排序
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.max(list));
       /* Map<String,Integer> map=new HashMap();
        map.put("b",1);
        map.put("c",2);
        map.put("d",3);
        System.out.println(map);
        System.out.println(map.get("d"));
        System.out.println(map.size());
        System.out.println(map.containsKey("c"));
        Set<String> keys = map.keySet();
        for (String key:keys
             ) {System.out.println(key+ " "+map.get(key));
            
        }
        Set<Map.Entry<String, Integer>> entrys = map.entrySet();
        for (Map.Entry<String,Integer> en:entrys
             ) {System.out.println(en.getKey()+" "+en.getValue());

        }}*/
        Student s1 = new Student(11, "ALICE");
        Student s2 = new Student(10, "ALICE");
        Student s3 = new Student(20, "ALICE");
        List<Student> stu = new ArrayList<>();
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        Collections.sort(stu, new Student());
        for (Student st : stu
                ) {
            System.out.println(st.name + "  " + st.age);
        }
    }
}

class Student implements Comparator<Student> {
    int age;
    String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.age > o2.age) {
            return 1;
        } else if (o1.age < o2.age) {
            return -1;
        } else {
            return 0;
        }
    }
}

