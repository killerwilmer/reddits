package com.killerwilmer.reddits.utils;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/**
 * Created by killerwilmer on 24/02/17.
 */

public class Network {

    public static boolean hasInternet(Activity a) {
        boolean hasConnectedWifi = false;
        boolean hasConnectedMobile = false;
        try {
            ConnectivityManager cm = (ConnectivityManager) a.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo[] netInfo = cm.getAllNetworkInfo();
            for (NetworkInfo ni : netInfo) {
                if (ni.getTypeName().equalsIgnoreCase("wifi"))
                    if (ni.isConnected())
                        hasConnectedWifi = true;
                if (ni.getTypeName().equalsIgnoreCase("mobile"))
                    if (ni.isConnected())
                        hasConnectedMobile = true;
            }
            return hasConnectedWifi || hasConnectedMobile;
        }
        catch (Exception ex) {
            Log.e("Error_internet", ex.getMessage());
        }
        return false;
    }
}
