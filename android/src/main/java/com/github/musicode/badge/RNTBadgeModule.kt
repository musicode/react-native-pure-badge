package com.github.musicode.badge

import com.facebook.react.bridge.*
import me.leolin.shortcutbadger.ShortcutBadger

class RNTBadgeModule(private val reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String {
        return "RNTBadge"
    }

    @ReactMethod
    fun setBadge(value: Int) {
        ShortcutBadger.applyCount(reactContext, value)
    }

}