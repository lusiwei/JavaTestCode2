package xmcc.hashSet;

import xmcc.object.Student;

import java.util.HashSet;
import java.util.Set;

public class testHashSet {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        Student stu1 = new Student("张三", 20);
        Student stu2 = new Student("李四", 21);
        Student stu3 = new Student("王五", 22);
        Student stu4 = new Student("小强", 22);
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);
        for (Student stu : set ) {
            System.out.println(stu);
        }

    }
}
