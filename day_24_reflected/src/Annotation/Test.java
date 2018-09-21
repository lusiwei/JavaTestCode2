package Annotation;

public class Test {
    @AnnoTest(name = "hello",animal = {"dog","cat","pig"},deprecated = ,age = 10)
    public static void main(String[] args) {
        System.out.println("注解");
    }
}
