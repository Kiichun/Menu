package com.company;

public class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * panjang + 2 * lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
}
