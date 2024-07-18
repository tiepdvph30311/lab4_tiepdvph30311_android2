package tiepdvph30311.fpoly.lab4_android2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;


public class Fagment3MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fagment3_main);
        viewPager=findViewById(R.id.demo43ViewPager);
        tabLayout=findViewById(R.id.demo43Tablyout);
        addTabLayout(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }
    //viet ham addTabLayout
    public void addTabLayout(ViewPager viewPager){
        //Tao moi adapter
        Fagment3Adapter adapter=new Fagment3Adapter(getSupportFragmentManager());
        //them fragmemt vao adapter
        adapter.addFrag(new BlankFragment1(),"ONE");
        adapter.addFrag(new BlankFragment2(),"TWO");
        adapter.addFrag(new BlankFragment3(),"THREE");
        //dua adapter vao viewpager
        viewPager.setAdapter(adapter);
    }
}