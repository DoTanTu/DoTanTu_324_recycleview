package com.example.recyclerview;

public class Car {
    private int  hinhAnh;
    private String namePhone;


    public Car(int hinhAnh, String namePhone) {
        this.namePhone = namePhone;
        this.hinhAnh = hinhAnh;
    }

    public Car(String namePhone) {
        this.namePhone = namePhone;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
