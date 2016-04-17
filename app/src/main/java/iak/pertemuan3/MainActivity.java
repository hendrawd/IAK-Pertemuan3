package iak.pertemuan3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import iak.pertemuan3.packagebaru.Cewek;
import iak.pertemuan3.packagebaru.Cowok;
import iak.pertemuan3.packagebaru.Orang;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Orang orangPertama = new Orang();
        Log.e("Jenis Kelamin Orang", orangPertama.getJenis_kelamin());

        Cewek cewekPertama = new Cewek();
        Log.e("Jenis Kelamin Cewek", cewekPertama.getJenis_kelamin());

        Cowok co1 = new Cowok();
        co1.setNama("Nur Hidayat");
//        co1.setJenis_kelamin("Bencong");
        co1.setIsGanteng(false);

        Log.e("Nama co1", co1.getNama());
        Log.e("Jenis Kelamin co1", co1.getJenis_kelamin());
        Log.e("co1 ganteng?", co1.isGanteng() + "");

        //manggil method overloading
        co1.speak();
        co1.speak("alooo dari method yang lain");

        TextView textView;
//        casting View to TextView
        textView = (TextView) findViewById(R.id.text_view);
        textView.setText("Text yang di set");
        Log.e("TextView text", textView.getText().toString());

        //contoh lain casting
        //casting double ke int
        double angka = 123;
        int intAngka = (int) angka;
        //kenapa parameter kedua dari log kalau
        //tipe int atau double harus ditambah ""?
        //karena method Log.e butuh parameter String dan String
        //jadi kalau int dan double harus dicasting dulu ke String
        //cara paling gampangnya dengan concat
        Log.e("angka double", angka + "");//+ = concatenation
        Log.e("angka int", intAngka + "");

        //Conditional Code
        //if else
        String name = co1.getNama();
//        name = "Kuda";
        name = "asfddasfsad";
        //untuk membandingkan String yang satu dengan
        //yang lain memakai method String.equals();
        //tidak boleh menggunakan operator "=="
        //contoh:
        //name == "Nur Hidayat"; -> salah
        //name.equals("Nur Hidayat"); -> benar
        if (name.equals("Nur Hidayat")) {
            Log.e("Conditional Code", "Masuk if");
        } else if (name.equals("Kuda")) {
            Log.e("Conditional Code", "Masuk else if");
        } else {
            Log.e("Conditional Code", "Masuk else");
        }

        //bentuk lain conditional code
        //memakai switch case - lebih cepat daripada if-else
        switch (name) {
            case "Nur Hidayat":
                Log.e("Switch Case", "Masuk case1");
                break;
            case "Kuda":
                Log.e("Switch Case", "Masuk case2");
                break;
            default:
                //seperti kondisi else di if-else
                Log.e("Switch Case", "Masuk default");
                break;
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
