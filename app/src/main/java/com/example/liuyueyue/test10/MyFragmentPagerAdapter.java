package com.example.liuyueyue.test10;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by liuyueyue on 2017/8/1.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter{
        private List<Fragment>fragList;
    private List<String>titleList;

    public MyFragmentPagerAdapter(FragmentManager fm,List<Fragment>fragList,List<String>titleList) {
        super(fm);
        this.fragList = fragList;
        this.titleList = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragList.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }

    @Override
    public int getCount() {
        return fragList.size();
    }
}
