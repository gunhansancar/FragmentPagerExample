package com.gunhansancar.fragmentpagerexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by gunhansancar on 26/10/2017.
 */

public class MyViewPagerAdapter extends FragmentStatePagerAdapter {

    private List<MyPagerItem> list;

    public MyViewPagerAdapter(FragmentManager fm, List<MyPagerItem> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        MyPagerItem item = list.get(position);
        return MyFragment.newInstance(item.getName(), item.getAge());
    }

    @Override
    public int getCount() {
        return list != null ? list.size() : 0;
    }
}
