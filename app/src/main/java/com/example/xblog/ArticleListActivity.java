package com.example.xblog;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.example.xblog.generals.xblogPrefs;

import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by 馮海睿 on 2017/5/14.
 */

public class ArticleListActivity extends Activity {
    Handler dataHandler=null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_articles);


        init_handler();

    }

    private void init_handler(){
        dataHandler=new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);


            }
        };
    }




}
