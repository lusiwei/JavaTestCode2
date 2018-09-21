package am;

public class MydaemonThread {
    public static void main(String[] args) {

        //Rose,表演者：前台线程
        Thread rose=new Thread(){
            @Override
            public void run(){
                for (int i = 0; i <5 ; i++) {
                    System.out.println("rose:let me go!");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("rose:啊啊啊");
                System.out.println("扑通");
            }
        };
        //jack，表演者：后台线程
        Thread jack= new Thread(){
            public void run(){
                while (true){
                    System.out.println("jack:you jump!i jump!");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
        jack.setDaemon(true);
        rose.start();
        jack.start();
    }
}
