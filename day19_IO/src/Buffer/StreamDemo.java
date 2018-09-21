package Buffer;

import java.io.*;

public class StreamDemo {
    String srcPath="E:/360Downloads/Software/TIM2.2.5.20882.exe";
    String desPath="F:/TIM.exe";
    InputStream is;
    OutputStream os;
    BufferedInputStream bis;
    BufferedOutputStream bos;
    public static void main(String[] args) throws IOException {
        long beginTime=System.currentTimeMillis();
        new StreamDemo().copy1();
        System.out.println("耗时"+(System.currentTimeMillis()-beginTime)+"毫秒");
    }


    //原生字节流 233919ms
    public void copy1() throws IOException {
        is=new FileInputStream(srcPath);
        os=new FileOutputStream(desPath);
        int i;
        while ((i=is.read())!=-1) {
            os.write(i);
        }
        os.close();
        is.close();
    }
    //原生字节流+数组 494ms
    public void copy2() throws IOException {
        is=new FileInputStream(srcPath);
        os=new FileOutputStream(desPath);
        byte[] bytes=new byte[1024];
        int len=0;
        while ((len=is.read(bytes))!=-1) {
            os.write(bytes,0,len);
        }
        is.close();
        os.close();
    }
    //包装字节流 2920ms
    public void copy3() throws IOException {
        is=new FileInputStream(srcPath);
        os=new FileOutputStream(desPath);
        bis=new BufferedInputStream(is);
        bos=new BufferedOutputStream(os);
        int i;
        while ((i=bis.read())!=-1) {
            bos.write(i);
        }
        bos.close();
        os.close();
        bis.close();
        is.close();
    }
    //包装字节流+数组 143ms
    public void copy4() throws IOException {
        is=new FileInputStream(srcPath);
        os=new FileOutputStream(desPath);
        bis=new BufferedInputStream(is);
        bos=new BufferedOutputStream(os);
        byte[] bytes=new byte[1024];
        int len=0;
        while ((len=bis.read(bytes))!=-1) {
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
        os.close();
        is.close();
    }

}
