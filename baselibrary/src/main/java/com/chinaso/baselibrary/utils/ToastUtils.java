package com.chinaso.baselibrary.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.StringRes;
import android.widget.Toast;


public final class ToastUtils {

    public static void show(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void show(Context context, @StringRes int id) {
        Toast.makeText(context, context.getResources().getString(id), Toast.LENGTH_SHORT).show();
    }

    public static void showLong(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }


}
