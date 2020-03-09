package com.example.bestapps

import android.util.Log
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserFactory

class StoreApps {

    val apps = ArrayList<AppData>()

    fun parseData(xmlString : String) : Boolean{
        var successParse = true

        try {
            val factory = XmlPullParserFactory.newInstance()
            factory.isNamespaceAware = true

            val pullParser = factory.newPullParser()
            pullParser.setInput(xmlString.reader())

            var eventType = pullParser.eventType
            while (eventType != XmlPullParser.END_DOCUMENT) {
                //TODO : Do Something
            }
        }catch(e : Exception){
            successParse = false;
            Log.e("ParseError", "Failed to arse the XML document")
        }
        return successParse
    }


}