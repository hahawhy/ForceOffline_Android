package com.why.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by why on 2016/4/12.
 */
public class BaseActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    protected void onDestroy(){
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
