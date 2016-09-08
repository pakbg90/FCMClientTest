package com.pakbg.study.fcmclienttest;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidget();
        initFcm();

    }

    private void initFcm() {
//        FirebaseMessaging.getInstance().subscribeToTopic("news");
        FirebaseInstanceId.getInstance().getToken();


    }

    private void initWidget() {

        findViewById(R.id.btn_vive).setOnClickListener(listenerClick);

    }

    private View.OnClickListener listenerClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("QWE", "onclick1");
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(2000);


        }
    };

}
