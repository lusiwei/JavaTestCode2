public class DemoLambdaSumbable {
    private static void showSum(int x,int y,Sumable sumCalculator){
        System.out.println(sumCalculator.sum(x,y));
    }

    public static void main(String[] args) {
        showSum(10,20,(m,n)->m+n);
    }
}
