package Test_Question;

public class TestSingleTon {
    public static void main(String[] args) {
        SingleTon singleTon=SingleTon.getInstance();
        System.out.println(SingleTon.getInstance());
        System.out.println(SingleTon.getInstance());
    }
}
