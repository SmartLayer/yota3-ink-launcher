package com.wondertek.paper;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.hudway.online");
        startActivity( launchIntent );
        //setContentView(R.layout.activity_main);
    }
}
