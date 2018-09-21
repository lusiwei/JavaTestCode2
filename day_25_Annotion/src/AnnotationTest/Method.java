package AnnotationTest;

public class Method {
    @MyAnno
    public int  add(int x,int y){
        return x+y;
    }
    @MyAnno
    public int subtract(int x,int y){
        return x-y;
    }
    @MyAnno
    public int divide(int x,int y){
        x=1/0;
        return x/y;
    }
    @MyAnno
    public int update(int x,int y){
        String str=null;
        System.out.println(str.length());
        return x+y;
    }
    public int multiply(int x,int y){
        return x*y;
    }
}
