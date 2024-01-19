import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    String address;
    String phNo;
    String batchNo;
    int age;

    static ArrayList<Student> stuList = new ArrayList<>();

    public Student(String name, String address, String phNo, String batchNo, int age) {
        this.name = name;
        this.address = address;
        this.phNo = phNo;
        this.age = age;
        this.batchNo = batchNo;
    }

    public static void addStu(Student stObj) {
        stuList.add(stObj);
    }

    public static ArrayList<Student> getStuList() {
        return stuList;
    }

    public String toString() {
        return name + ":" + address + ":" + phNo + ":" + batchNo + ":" + age;
    }

}