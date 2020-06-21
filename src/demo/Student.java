package demo;

public class Student extends Person1 implements Move, Study {
    public String school;
    private String priva;

    public Student(String school) {
        this.school = school;
    }

    public Student() {
        System.out.println("public Student()");
    }

    public Student(int age) {
        this.age = age;
        System.out.println("public Student(int age)");
    }

    private Student(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("private Student(int age,String name)");
    }

    @Override
    public void moveType() {
        System.out.println("bicycle");
    }

    @Override
    public void StudyInfo() {
        System.out.println("java");
    }

    private void test(String name) {
        System.out.println("private void test(String name)");
    }

    public int getAge() {
        return this.age;
    }

    public String getSchool() {
        return this.school;
    }

    public void setInfo(String name, String school) {
        this.school = school;
        this.name = name;
        System.out.println("public void setInfo(String name,String school)");
    }

    public void setInfo(int age) {

        System.out.println("public void setInfo(int age)");
    }
}
