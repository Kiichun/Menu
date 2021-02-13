package com.company;

public class Segitiga extends BangunDatar{
    private double alas, tinggi;

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double hitungKeliling() {
        return alas + alas + alas;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}
