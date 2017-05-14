package com.example.xblog;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.xblog.generals.ThreeButton;

public class MainActivity extends Activity  implements ThreeButton{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void on_home(View v) {


    }

    @Override
    public void on_articles(View v) {
        Intent read_articles=new Intent(this,ArticleListActivity.class);
        startActivity(read_articles);
    }

    @Override
    public void on_member(View v) {

    }
}
