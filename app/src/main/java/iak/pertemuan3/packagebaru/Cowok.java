package iak.pertemuan3.packagebaru;

import android.util.Log;

import java.lang.reflect.Constructor;

/**
 * Created by hendrawd on 4/17/16.
 * extends berarti turunan dari kelas yang di extend
 * dalam kasus ini Cowok adalah turunan dari Orang
 * Jadi Orang merupakan "parent" dari Cowok,
 * dan Cowok adalah "child" dari Orang
 *
 * Kelas yang merupakan child dari kelas lain, memiliki
 * semua properties dan methods dari kelas parent
 */
public class Cowok extends Orang {
    public boolean isGanteng() {
        return isGanteng;
    }

    public void setIsGanteng(boolean isGanteng) {
        this.isGanteng = isGanteng;
    }

    private boolean isGanteng;

    /**
     * Constructor
     * adalah kode yang dipanggil saat
     * pertama kali object di create
     */
    public Cowok() {
        Log.v("Cowok", "Cowok dipanggil");
//        setJenis_kelamin("Cowok");
    }

    @Override
    public String getJenis_kelamin() {
        return "Cowok dari override";
    }
}
