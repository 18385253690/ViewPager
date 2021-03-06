package com.example.liuyueyue.test10;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements ViewPager.OnPageChangeListener{

private List<View> viewList;
    private ViewPager pager;
    private PagerTabStrip tab;
    private List<String>titleList;
    private List<Fragment>fragList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //通过view对象去作为viewpager的数据源
        viewList = new ArrayList<View>();
        View view1 = View.inflate(this,R.layout.view1,null);
        View view2 = View.inflate(this,R.layout.view2,null);
        View view3 = View.inflate(this,R.layout.view3,null);
        View view4 = View.inflate(this,R.layout.view4,null);

        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);
        viewList.add(view4);

        //通过Fragment作为viewpager的数据源
        fragList = new ArrayList<Fragment>();
        fragList.add(new Fragment1());
        fragList.add(new Fragment2());
        fragList.add(new Fragment3());
        fragList.add(new Fragment4());

        //为ViewPager设置标题
        titleList = new ArrayList<String>();
        titleList.add("聊天");
        titleList.add("通讯录");
        titleList.add("发现");
        titleList.add("我");

        //为PagerTabStrip设置属性
        tab = (PagerTabStrip) findViewById(R.id.tab);
        tab.setBackgroundColor(Color.GRAY);
        tab.setTextColor(Color.BLACK);
        tab.setDrawFullUnderline(false);
        tab.setTabIndicatorColor(Color.BLACK);

        //初始化ViewPager
        pager = (ViewPager) findViewById(R.id.pager);
        //创建PagerAdapter适配器
        MyPagerAdapter adapter = new MyPagerAdapter(viewList,titleList);
        //加载PagerAdapter适配器
        //pager.setAdapter(adapter);
        MyFragmentPagerAdapter adapter1 = new MyFragmentPagerAdapter
                (getSupportFragmentManager(),fragList,titleList);
        //pager.setAdapter(adapter1);

        MyFragmentPagerAdapter2 adapter2 = new MyFragmentPagerAdapter2
                (getSupportFragmentManager(),fragList,titleList);
        pager.setAdapter(adapter2);
        pager.setOnPageChangeListener(this);

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        Toast.makeText(this,"当前是第"+(position+1)+"个页面",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
