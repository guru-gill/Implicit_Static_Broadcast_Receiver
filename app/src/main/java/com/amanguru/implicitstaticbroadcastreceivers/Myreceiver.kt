package com.amanguru.implicitstaticbroadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class Myreceiver : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(p1.action))
        {
            Toast.makeText(p0,"Boot has Completed",Toast.LENGTH_LONG).show()
        }else if(ConnectivityManager.CONNECTIVITY_ACTION.equals(p1.action))
        {
            Toast.makeText(p0,"Network Status is Changed",Toast.LENGTH_LONG).show()
        }

    }
}