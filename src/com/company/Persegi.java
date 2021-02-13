package com.company;

public class Persegi extends BangunDatar {
    private double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling() {
        return sisi * 4;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
}
