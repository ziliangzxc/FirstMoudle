package com.haier.firstlib;

import android.content.Context;
import android.widget.Toast;

public class MsgUtils {
    public static  void show(Context context,String content){
        Toast.makeText(context,content,Toast.LENGTH_SHORT).show();
    }
}
