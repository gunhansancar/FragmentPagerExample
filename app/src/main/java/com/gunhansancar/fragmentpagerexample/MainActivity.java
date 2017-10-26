package com.gunhansancar.fragmentpagerexample;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<MyPagerItem> list = new ArrayList<>();
        list.add(new MyPagerItem("Gunhan", 30));
        list.add(new MyPagerItem("Sancar", 40));
        list.add(new MyPagerItem("Foo", 50));
        list.add(new MyPagerItem("Bar", 60));
        list.add(new MyPagerItem("Test", 70));
        list.add(new MyPagerItem("Android", 80));
        list.add(new MyPagerItem("Studio", 90));

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager(), list));
    }
}
