package am;

public class YeildDemo {
    public static void main(String[] args) {
        Thread t1=new Thread("线程一"){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(getName()+":"+i);
                }
            }
        };
        Thread t2=new Thread("线程二"){
            @Override
            public void run() {
                for (int i=0;i<20;i++){
                    if(i==5){
                        Thread.yield();
                    }
                    System.out.println(getName()+":"+i);
                }
            }
        };
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
