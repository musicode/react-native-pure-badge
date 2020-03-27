package com.github.musicode.badge

import android.os.Build
import com.facebook.react.bridge.*
import android.view.Display
import android.content.Context.WINDOW_SERVICE
import android.graphics.Point
import android.graphics.Rect
import android.view.WindowManager
import java.lang.Exception

class RNTBadgeModule(private val reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String {
        return "RNTBadge"
    }

    @ReactMethod
    fun setBadge(value: Int) {



    }

}