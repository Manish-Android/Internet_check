package com.Manish.InternetCheck

import android.content.Context
import android.net.ConnectivityManager

class ConnrctivityManager{

    fun CheckConectivity(context: Context):Boolean{

        val connectivityManger = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = connectivityManger.activeNetworkInfo

        if (activeNetwork?.isConnected!= null)
        {
            return activeNetwork.isConnected!!
        }
        else
        {
            return false
        }


    }






}