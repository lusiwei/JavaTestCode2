package am.am.arraylist.Teacher_date.test;

public class Computer {
    private static int cid=0;//做计数器 每个对象都是公用的
    private int id;//把计算器自增的cid给到当前对象
    private String cpu;
    private double price;
    public Computer(){
        id=cid++;
    }
    public int getId() {//id自动生成 每次自增1
        return id;
    }
    public Computer(String cpu, double price) {
        this();
        this.cpu = cpu;
        this.price = price;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                " id=" + id +
                ", cpu='" + cpu + '\'' +
                ", price=" + price +
                '}';
    }
}
