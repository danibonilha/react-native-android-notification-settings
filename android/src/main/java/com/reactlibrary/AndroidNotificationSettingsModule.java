package com.reactlibrary;

import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class AndroidNotificationSettingsModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public AndroidNotificationSettingsModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "AndroidNotificationSettings";
    }

    @ReactMethod
    public void openNotificationSettings() {
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_NO_HISTORY);

        // Support Android API 21 - 25
        intent.putExtra("app_package", reactContext.getPackageName());
        intent.putExtra("app_uid", reactContext.getApplicationInfo().uid);
        
        // Support Android API >= 26 
        intent.putExtra("android.provider.extra.APP_PACKAGE", reactContext.getPackageName()); 

        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }    
}
