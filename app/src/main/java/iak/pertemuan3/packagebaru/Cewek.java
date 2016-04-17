package iak.pertemuan3.packagebaru;

import android.util.Log;

/**
 * Created by hendrawd on 4/17/16.
 */
public class Cewek extends Orang{
    private boolean isBerkerudung;

    public boolean isBerkerudung() {
        return isBerkerudung;
    }

    public void setIsBerkerudung(boolean isBerkerudung) {
        this.isBerkerudung = isBerkerudung;
    }

    public Cewek() {
        Log.v("Cewek", "Cewek dipanggil");
        setJenis_kelamin("Cewek");
    }
}
