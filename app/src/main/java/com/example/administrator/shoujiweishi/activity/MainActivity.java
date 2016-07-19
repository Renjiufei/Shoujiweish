package com.example.administrator.shoujiweishi.activity;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.administrator.shoujiweishi.R;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends Activity implements View.OnClickListener {
    private GridView gv;
    private ImageView mIvMainLogo;
    private static final Integer[] ICONID = new Integer[]{R.drawable.sjfd,
            R.drawable.srlj, R.drawable.rjgj, R.drawable.jcgl, R.drawable.lltj,
            R.drawable.sjfd, R.drawable.hcql, R.drawable.cygj};
    private static final String[] TITLES = new String[]{"手机防盗", "骚扰拦截",
            "软件管家", "进程管理", "流量统计", "手机杀毒", "缓存清理", "常用工具"};

    private static final String[] DESCS = new String[]{"远程定位手机", "全面拦截骚扰",
            "管理您的软件", "管理运行进程", "流量一目了然", "病毒无处藏身", "系统快如火箭", "工具大全"};
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private void initView() {

//         gv=(GridView)findViewById(R.id.gv_main);
        mIvMainLogo=(ImageView) findViewById(R.id.tv_main_logo);
        ObjectAnimator objani=ObjectAnimator.ofFloat(mIvMainLogo,"rotationY",0,70,180,720);
        //设置动画时间
        objani.setDuration(2000 );
        //设置重复次数
        objani.setRepeatCount(ObjectAnimator.INFINITE);
        objani.setRepeatMode(ObjectAnimator.RESTART);
        objani.start();
    }
    public void openSetting(View v) {


    }

    @Override
    public void onClick(View v) {

    }



}
