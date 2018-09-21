package am;

public class Student {
    String name;
    int age;
    private String home;

    public Student(){}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private Student(int age){
        this.age=age;
    }
    public void print1(){
        System.out.println("无参普通方法被调用了");
    }
    public void print2(String name,int age){
        System.out.println("有参普通方法被调用了");
    }
    public int print3(int age){
        System.out.println("有参有返回值的有参构造方法被调用了");
        return 666;}
}
