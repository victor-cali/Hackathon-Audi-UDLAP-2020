package com.example.audimexico;

import android.app.Application;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.aws.AWSApiPlugin;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.datastore.AWSDataStorePlugin;

public class MyAmplifyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        try {
            Amplify.addPlugin(new AWSApiPlugin());
            Amplify.addPlugin(new AWSDataStorePlugin());
            Amplify.configure(getApplicationContext());

            android.util.Log.i("Tutorial", "Initialized Amplify");
        } catch (AmplifyException e) {
            android.util.Log.e("Tutorial", "Could not initialize Amplify", e);
        }
    }
}