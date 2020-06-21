package demo.d2;

public interface BWM {
    void showInfo();
}

class BMW3 implements BWM {

    @Override
    public void showInfo() {
        System.out.println("bmw3");
    }
}

class BMW5 implements BWM {

    @Override
    public void showInfo() {
        System.out.println("bmw5");
    }
}

class BMW7 implements BWM {

    @Override
    public void showInfo() {
        System.out.println("bmw7");
    }
}
