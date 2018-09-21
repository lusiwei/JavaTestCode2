package am.am.arraylist.homework;

public class Computer {
    private int id;
    private int cId = 0;
    private String cpuType;
    private String mainboardType;
    private int size;
    private int memory;
    private String graphicCardType;
    private double price;

    public Computer(){
        id=cId++;
    }
    public Computer(int id, String cpuType, String mainboardType, int size, int memory, String graphicCardType, double price) {
        this.id = id;
        this.cpuType = cpuType;
        this.mainboardType = mainboardType;
        this.size = size;
        this.memory = memory;
        this.graphicCardType = graphicCardType;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public String getMainboardType() {
        return mainboardType;
    }

    public void setMainboardType(String mainboardType) {
        this.mainboardType = mainboardType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getGraphicCardType() {
        return graphicCardType;
    }

    public void setGraphicCardType(String graphicCardType) {
        this.graphicCardType = graphicCardType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    public String toString(){
//        return "Computer{"+
//                " cpu="+cpuType+
//                " mainboard="+mainboardType+

//    }
}
