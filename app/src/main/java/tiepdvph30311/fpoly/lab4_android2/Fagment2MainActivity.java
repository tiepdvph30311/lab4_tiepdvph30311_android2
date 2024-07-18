package tiepdvph30311.fpoly.lab4_android2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;



public class Fagment2MainActivity extends AppCompatActivity {
    Button btnAn,btnHien;
    BlankFragment1 frg;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fagment2_main);
        btnAn=findViewById(R.id.demo42BtnAn);
        btnHien=findViewById(R.id.demo42BtnHien);
        btnAn.setOnClickListener(v->{
            //tao doi tuong quan ly fragment
            FragmentManager fragmentManager=getSupportFragmentManager();
            //anh xa fragment
            frg=(BlankFragment1) fragmentManager.findFragmentById(R.id.demo42Fr1);
            //an
            fragmentManager.beginTransaction()
                    .hide(frg)
                    .commit();
        });
        btnHien.setOnClickListener(v->{
            //tao doi tuong quan ly fragment
            FragmentManager fragmentManager=getSupportFragmentManager();
            //anh xa fragment
            frg=(BlankFragment1) fragmentManager.findFragmentById(R.id.demo42Fr1);
            //an
            fragmentManager.beginTransaction()
                    .show(frg)
                    .commit();
        });
    }
}