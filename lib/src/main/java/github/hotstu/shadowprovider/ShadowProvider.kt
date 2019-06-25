package github.hotstu.shadowprovider

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import android.util.Log

/**
 * @author hglf [hglf](https://github.com/hotstu)
 * @since 6/21/19
 * @desc
 */
class ShadowProvider : ContentProvider() {


    override fun onCreate(): Boolean {
        Log.d("ShadowProvider", "onCreate with context:${context.javaClass.canonicalName}")
        return false
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? = null

    override fun query(
        uri: Uri,
        projection: Array<String>?,
        selection: String?,
        selectionArgs: Array<String>?,
        sortOrder: String?
    ): Cursor? = null



    override fun update(uri: Uri, values: ContentValues?, selection: String?, selectionArgs: Array<String>?): Int  = 0
    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<String>?): Int = 0

    override fun getType(uri: Uri): String?  = null

}