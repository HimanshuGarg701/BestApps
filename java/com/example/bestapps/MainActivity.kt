package com.example.bestapps

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getAppData = GetData()

        getAppData.execute("http://ax.itunes.apple.com/WebObjects/MZStoreServices.woa/ws/RSS/topfreeapplications/limit=10/xml")
    }

    companion object{
        private  class GetData : AsyncTask<String, Void, String>(){
            override fun doInBackground(vararg params: String?): String {
                val data = downloadData(params[0])
                if(data.isEmpty()){
                    Log.e("ERROR" , "Do In background failed")
                }
                Log.d("SUCCESS-MSG", "$data")
                return data
            }

        }

        private fun downloadData(url : String?) : String{
            return URL(url).readText()
        }
    }


}
