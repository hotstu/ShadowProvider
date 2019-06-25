package github.hotstu.shadowprovider.demo

import android.app.Application
import android.content.Context
import android.util.Log

/**
 * @author hglf [hglf](https://github.com/hotstu)
 * @since 6/21/19
 * @desc
 */
class App : Application() {
    override fun attachBaseContext(base: Context?) {
        Log.d("App", "attachBaseContext: ${base?.javaClass?.canonicalName}")
        super.attachBaseContext(base)
    }

    override fun onCreate() {
        Log.d("App", "onCreate")
        super.onCreate()
    }
}