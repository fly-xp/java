package demo.d2;

/*
 * 工厂模式
 * */
public interface BWMFactory {
    BWM productBWM();
}

class BWM3Factory implements BWMFactory {

    @Override
    public BWM productBWM() {
        System.out.println("product 3");
        return new BMW3();
    }
}

class BWM5Factory implements BWMFactory {

    @Override
    public BWM productBWM() {
        System.out.println("product 5");
        return new BMW5();
    }
}
