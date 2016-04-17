package iak.pertemuan3.packagebaru;

import android.util.Log;

/**
 * Created by hendrawd on 4/17/16.
 */
public class Orang {

    private int berat;
    private int tinggi;
    private String jenis_kelamin = "Belom tau";
    private String nama;

    public Orang() {
        Log.v("Orang", "Orang di create");
    }

    /**
     * ini namanya getter
     * @return nama dari orang
     */
    public String getNama() {
        return nama;
    }

    /**
     * ini namanya setter
     * @param nama yang mau di set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBerat() {
        return berat;
    }

    public int getTinggi() {
        return tinggi;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    /**
     * method overloading
     * method yang namanya sama tapi
     * memiliki perbedaan dalam hal
     * input parameter
     */
    public void speak(String whatToSpeak) {
        Log.e("Orang speak", whatToSpeak);
    }

    public void speak() {
        speak("halooo");
    }
    //end method overloading
}
