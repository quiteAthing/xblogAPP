package com.example.xblog.dataObjects;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Date;

/**
 * Created by 馮海睿 on 2017/5/15.
 */

public class Article {
    public static final int FETCH_LIST=1;
    public static final int FETCH_FULL=2;

    String author=null;
    String title=null;
    Date submitted=null;
    Date lastupdate=null;

    private Article(){}

    private Article(String author,String title,Date submitted,Date lastupdate){
        this.author=author;
        this.title=title;
        this.submitted=submitted;
        this.lastupdate=lastupdate;
    }


    public static Article fromJSON(JSONObject input,int fetchType){
        return null;
    }

    public static Article[] fromJSONArray(JSONArray input,int fetchType){
        return null;
    }
}
