package am;

import java.io.*;
public class SerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serializableObj();
        deserializableObj();
    }
    //序列化对象
    private static void serializableObj() throws IOException {
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("F:/object.txt"));
        Animal animal=new Animal("dog",20);
        oos.writeObject(animal);
        oos.close();
    }
    //反序列化对象
    private static void deserializableObj() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("F:/object.txt"));
        Animal a=(Animal) ois.readObject();
        System.out.println(a);
        a.print();
        ois.close();
    }
}
