package xmcc.object;

public class ObjectDemo {
    public static void main(String[] args) {
        System.out.println(Student.class);
        System.out.println(Student.class.getName());
        Student stu = new Student("jack", 22);
        Student stu1 = new Student("henry", 21);
        Student stu2 = new Student("henry", 21);
        System.out.println(stu.equals(stu1));
        System.out.println(stu1.equals(stu2));
        System.out.println("Student toString 方法"+stu.toString());
        System.out.println("getClass方法："+stu.getClass());
        System.out.println(Student.class);

        //toString
        System.out.println(String.class.getName());

        String s1 = new String("abcde");
        String s2 = new String("abcde");
        System.out.println(s1.equals(s2));

    }
}
