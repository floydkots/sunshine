package com.example.android.sunshine.sync;
// COMPLETED TODO (9) Create a class called SunshineSyncUtils
    // COMPLETED  TODO (10) Create a public static void method called startImmediateSync
    // COMPLETED  TODO (11) Within that method, start the SunshineSyncIntentService

import android.content.Context;
import android.content.Intent;

import com.example.android.sunshine.sync.SunshineSyncIntentService;

public class SunshineSyncUtils {
    public static void startImmediateSync(final Context context) {
        Intent intentToSyncImmediately = new Intent(context, SunshineSyncIntentService.class);
        context.startService(intentToSyncImmediately);
    }
}