package dev.remaker.sketchubx.util

import android.util.Log
import dev.remaker.sketchubx.BuildConfig

fun Any.logD(message: Any?) {
    logD(message.toString())
}

fun Any.logD(message: String) {
    if (BuildConfig.DEBUG) {
        Log.d(name, message)
    }
}

fun Any.logE(message: String) {
    Log.e(name, message)
}

fun Any.logE(e: Exception) {
    Log.e(name, e.message ?: "Error")
}

private val Any.name: String get() = this::class.java.simpleName
