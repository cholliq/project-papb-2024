package com.example.addhabit;

public class Habit {
    private String namaHabit;
    private String tanggal;
    private String isiJurnal;

    public Habit(String namaHabit, String tanggal, String isiJurnal) {
        this.namaHabit = namaHabit;
        this.tanggal = tanggal;
        this.isiJurnal = isiJurnal;
    }

    public String getNamaHabit() {
        return namaHabit;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getIsiJurnal() {
        return isiJurnal;
    }
}
