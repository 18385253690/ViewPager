package com.example.liuyueyue.test10;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by liuyueyue on 2017/8/1.
 */

public class Fragment4 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.view4,container,false);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Main","我销毁了");
    }
}
