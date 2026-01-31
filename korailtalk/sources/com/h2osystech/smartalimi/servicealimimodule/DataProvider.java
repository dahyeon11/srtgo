package com.h2osystech.smartalimi.servicealimimodule;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.h2osystech.smartalimi.common.LogFile;

/* loaded from: classes2.dex */
public class DataProvider extends ContentProvider {
    public static final Uri CONTENT_URI = Uri.parse("content://com.h2osystech.smartalimi.ServiceAlimiData.korail");
    private static final String authoritis = "com.h2osystech.smartalimi.ServiceAlimiData.korail";
    private static final String providerName = "com.h2osystech.smartalimi.servicealimimodule.DataProvider";
    private SQLiteDatabase dbhelper;
    private final String TAG = "DataProvider";
    private String table = "push.db";

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        DBAdapter dBAdapter = new DBAdapter(getContext());
        dBAdapter.open();
        SQLiteDatabase writableDatabase = dBAdapter.mDbHelper.getWritableDatabase();
        this.dbhelper = writableDatabase;
        int iDelete = writableDatabase.delete(DBAdapter.getTable_NAME(), str, strArr);
        dBAdapter.selectNewMsgCount();
        return iDelete;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        DBAdapter dBAdapter = new DBAdapter(getContext());
        dBAdapter.open();
        SQLiteDatabase readableDatabase = dBAdapter.mDbHelper.getReadableDatabase();
        this.dbhelper = readableDatabase;
        try {
            return readableDatabase.query(true, str, strArr, null, strArr2, null, null, str2, null);
        } catch (Exception e8) {
            LogFile.log("DataProvider", 4, "Query Exe \n[" + e8.getMessage() + "]");
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        DBAdapter dBAdapter = new DBAdapter(getContext());
        dBAdapter.open();
        String str2 = (String) contentValues.get("TableName");
        contentValues.remove("TableName");
        SQLiteDatabase writableDatabase = dBAdapter.mDbHelper.getWritableDatabase();
        this.dbhelper = writableDatabase;
        int iUpdate = writableDatabase.update(str2, contentValues, str, strArr);
        dBAdapter.selectNewMsgCount();
        return iUpdate;
    }
}
