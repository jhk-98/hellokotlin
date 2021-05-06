package com.example.hellokotlin;

import android.widget.Toast;

public class ToastUtilJava {
    public static void toast_short(String s) {
        Toast.makeText(MainApplication.getAppContext(), s, Toast.LENGTH_SHORT).show();
    }

    public static void toast_long(String s) {
        Toast.makeText(MainApplication.getAppContext(), s, Toast.LENGTH_LONG).show();
    }
}

