package com.example.asistenku;


public class Fitur_Home {
    private String nama,status_absen;
    private int Presentase_hadir,Presentase_izin,Presentase_alfa;

    public Fitur_Home(String nama, String status_absen, int presentase_hadir, int presentase_izin, int presentase_alfa) {
        this.nama = nama;
        this.status_absen = status_absen;
        this.Presentase_hadir = presentase_hadir;
        this.Presentase_izin = presentase_izin;
        this.Presentase_alfa = presentase_alfa;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus_absen() {
        return status_absen;
    }

    public void setStatus_absen(String status_absen) {
        this.status_absen = status_absen;
    }

    public int getPresentase_hadir() {
        return Presentase_hadir;
    }

    public void setPresentase_hadir(int presentase_hadir) {
        Presentase_hadir = presentase_hadir;
    }

    public int getPresentase_izin() {
        return Presentase_izin;
    }

    public void setPresentase_izin(int presentase_izin) {
        Presentase_izin = presentase_izin;
    }

    public int getPresentase_alfa() {
        return Presentase_alfa;
    }

    public void setPresentase_alfa(int presentase_alfa) {
        Presentase_alfa = presentase_alfa;
    }
}
