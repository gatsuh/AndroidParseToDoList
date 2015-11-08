package com.gatsuh.androidparsetodolist;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;

public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "DXZGkZSixT1GhfXlcWXP4lTWgL27hQFnDfCCyRmD", "i90OS41j2EPKCdft6A94z6jShgvAbPX9MWrAKifi");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}