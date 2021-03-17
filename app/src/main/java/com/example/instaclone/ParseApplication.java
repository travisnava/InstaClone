package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        // Register your parse models
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("NTFil7RaxLV17rC592DlQnj473OH0J38szhNXRul")
                .clientKey("AzbiZn6AB9cvHKSRlpdL2LAv9WuCZVjRi031g7wE")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
