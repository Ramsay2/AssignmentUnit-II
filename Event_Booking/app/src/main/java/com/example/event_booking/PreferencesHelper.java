package com.example.event_booking;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesHelper {

    private static final String SHARED_PREFERENCE_KEY = "com.example.event_booking";

    public static SharedPreferences getSharedPreference(Context context) {
        return context.getSharedPreferences(SHARED_PREFERENCE_KEY, Context.MODE_PRIVATE);
    }


    public static void writeEmailToPreference(Context context, String key, String value) {
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(key, value);
        editor.apply();
    }


    public static void writeFirstNameToPreference(Context context, String key, String value) {
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(key, value);
        editor.apply();
    }
    public static void writeLastNameToPreference(Context context, String key, String value) {
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(key, value);
        editor.apply();
    }


    public static String getStringFromPreference(Context context, String key) {
        return getSharedPreference(context).getString(key, null);
    }

    public static int getIntFromPreference(Context context, String key) {
        return getSharedPreference(context).getInt(key, 0);
    }
}