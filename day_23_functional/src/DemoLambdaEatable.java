public class DemoLambdaEatable{
    private static void keepALive(Eatable human){
        human.eat();
    }
    public static void main(String[] args){
        keepALive(()-> System.out.println("吃药药！！"));
    }
}
