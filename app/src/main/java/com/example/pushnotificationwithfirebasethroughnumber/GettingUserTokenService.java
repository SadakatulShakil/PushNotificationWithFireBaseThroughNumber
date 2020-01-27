package com.example.pushnotificationwithfirebasethroughnumber;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.google.firebase.iid.FirebaseInstanceIdService;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class GettingUserTokenService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        String userToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("Device token",userToken);
    }
}
