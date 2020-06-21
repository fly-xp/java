package demo.d1;

public class TriAngle {
    public TriAngle(int a, int b) {
        base = a;
        height = b;
    }

    private int base;
    private int height;

    public void Area() {
        double area;
        area = base * height * 0.5;
        System.out.println(area);
    }
    /*public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }*/
}
