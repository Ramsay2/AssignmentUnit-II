package com.example.recyclerviewitemclick;

public class StudentModel {
    private String name;
    private int age;
    private String Address;
    private int imageId;
    private String dob;

    public StudentModel(String name, int age, String address, int imageId, String DOB) {
        this.name = name;
        this.age = age;
        this.Address = address;
        this.imageId = imageId;
        this.dob = DOB;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return Address;
    }

    public int getImageId() {
        return imageId;
    }

    public String getDOB() {
        return dob;
    }
}
