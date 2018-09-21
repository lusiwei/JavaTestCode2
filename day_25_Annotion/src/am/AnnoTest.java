package am;

@MyAnno(name = "jack",animals = {"dog","cat","pig"})
public class AnnoTest {
    @MyAnno(name = "jack",animals = {"dog","cat","pig"})
    public static void print(){
        System.out.println("我被调用了");
    }
}
