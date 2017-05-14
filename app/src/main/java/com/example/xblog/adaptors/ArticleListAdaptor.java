package com.example.xblog.adaptors;

import android.app.Activity;
import android.content.Context;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.xblog.R;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by 馮海睿 on 2017/5/14.
 */

public class ArticleListAdaptor extends BaseAdapter {
    JSONObject info[]=null;
    Activity home;
    public ArticleListAdaptor(JSONObject[] sourceInfo,Activity root){
            info=sourceInfo;
            home=root;
    }

    @Override
    public int getCount() {
        return info.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if(view==null){
            view= home.getLayoutInflater().inflate(R.layout.layout_articles,null);
        }
        TextView tv=(TextView)view.findViewById(R.id.article_title);
        try {
            tv.setText(info[position].getString("aritcleid"));
        }catch(JSONException ex){
            Log.d("JSON",ex.getMessage());
        }
        return view;
    }

}
