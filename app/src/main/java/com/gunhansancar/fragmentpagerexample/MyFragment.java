package com.gunhansancar.fragmentpagerexample;

/**
 * Created by gunhansancar on 26/10/2017.
 */

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;

/**
 * Sample fragment to demonstrate the instantiation of fragments with arguments
 * <p>
 * Created by Günhan on 28.10.2015.
 */
public class MyFragment extends Fragment {

    private String name;
    private int age;

    private TextView mNameTextView;
    private TextView mAgeTextView;

    public static MyFragment newInstance(String name, int age) {
        Bundle bundle = new Bundle();
        bundle.putString("name", name);
        bundle.putInt("age", age);

        MyFragment fragment = new MyFragment();
        fragment.setArguments(bundle);

        return fragment;
    }

    private void readBundle(Bundle bundle) {
        if (bundle != null) {
            name = bundle.getString("name");
            age = bundle.getInt("age");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.myfragment_layout, container, false);
        mNameTextView = (TextView) view.findViewById(R.id.nameTextView);
        mAgeTextView = (TextView) view.findViewById(R.id.ageTextView);

        readBundle(getArguments());

        mNameTextView.setText(String.format("Name: %s", name));
        mAgeTextView.setText(String.format("Age: %d", age));


        view.setBackgroundColor(getRandomColor());

        return view;
    }

    private int getRandomColor() {
        Random random = new Random();
        return Color.rgb(random.nextInt() % 255, random.nextInt() % 255, random.nextInt() % 255);
    }
}
