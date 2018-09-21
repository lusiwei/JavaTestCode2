package xmcc.System;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        long beginTime=System.currentTimeMillis();
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[4];
        System.arraycopy(arr1,0,arr2,0,4);
        System.out.println(Arrays.toString(arr2));
        long endTime=System.currentTimeMillis();
        System.out.println("中间代码执行用了"+(endTime-beginTime)+"毫秒");
        System.gc();//垃圾回收


        //StringBuilder 和StringBuffer
        StringBuilder stringBuilder=new StringBuilder("abdef");
        String str="";
        String str1="";
        for (int i = 0; i < 10; i++) {
            str+=i;
            str1=str1+1;
        }
        System.out.println(str==str1);
        System.out.println(str);
        String str2=str.toString();

        StringBuffer stringBuffer=new StringBuffer("hello");

    }
}
