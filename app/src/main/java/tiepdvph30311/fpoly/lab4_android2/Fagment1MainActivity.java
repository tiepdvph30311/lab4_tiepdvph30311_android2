package tiepdvph30311.fpoly.lab4_android2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class Fagment1MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText txt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fagment1_main);
        //anh xa
        btn=findViewById(R.id.demo41Btn1);
        txt=findViewById(R.id.demo41Txt1);
        //xu ly su kien
        btn.setOnClickListener(v->{
            //Doi tuong quan ly Fragment
            FragmentManager fragmentManager=getSupportFragmentManager();
            //anh xa fragment
            BlankFragment1 fragment1=(BlankFragment1) fragmentManager
                    .findFragmentById(R.id.fr41);
            //truyen du lieu tu activity sang fragment
            fragment1.txt1.setText(txt.getText().toString());
        });
    }
}