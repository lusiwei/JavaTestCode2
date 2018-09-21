public class Test {

    public static void main(String[] args) {

        String str="dwwewrfdde";
//        System.out.println(str.substring(0, 1));
        print(str);
    }
    //打印第二个重复的字符
    public static void print(String str){
        int n=0;
        for (int i = 0; i < str.length()-1; i++) {
            if(str.substring(i,i+1).equals(str.substring(i+1,i+2))){
                n++;
            }
            if(n==2){
                System.out.println("第二个重复的字符为："+str.substring(i,i+1));
                break;
            }
        }
    }
}
