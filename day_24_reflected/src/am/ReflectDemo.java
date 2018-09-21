package am;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c=Class.forName("am.Student");
        System.out.println(c);
        Class c1=Student.class;
        System.out.println(c1);
        Class c2= new Student().getClass();
        System.out.println(c2);
    }
}
