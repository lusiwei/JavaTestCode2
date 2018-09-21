package homework3;

import java.util.ArrayList;
import java.util.Collection;

public class Student {
    private String username;
    private String password;
    private String phoneNumber;
    private int sId;
    static int id = 0;//计数
    static ArrayList<Student> stuList = new ArrayList<>();

    public Student() {
        sId = ++id;
    }

    public Student(String username, String password, String phoneNumber) {
        this();
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", sId=" + sId +
                '}';
    }
}
