package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.google.android.gms.internal.ads.bW, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2367bW {
    private static Cursor a(SQLiteDatabase sQLiteDatabase, int i8) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i8 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i8 == 1) {
            strArr2[0] = "total_requests";
        } else if (i8 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    private static void b(SQLiteDatabase sQLiteDatabase, String str, int i8) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    private static void c(SQLiteDatabase sQLiteDatabase, String str, int i8) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    public static int zza(SQLiteDatabase sQLiteDatabase, int i8) {
        int i9 = 0;
        if (i8 == 2) {
            return 0;
        }
        Cursor cursorA = a(sQLiteDatabase, i8);
        if (cursorA.getCount() > 0) {
            cursorA.moveToNext();
            i9 = cursorA.getInt(cursorA.getColumnIndexOrThrow("value"));
        }
        cursorA.close();
        return i9;
    }

    public static long zzb(SQLiteDatabase sQLiteDatabase, int i8) {
        long j8;
        Cursor cursorA = a(sQLiteDatabase, 2);
        if (cursorA.getCount() > 0) {
            cursorA.moveToNext();
            j8 = cursorA.getLong(cursorA.getColumnIndexOrThrow("value"));
        } else {
            j8 = 0;
        }
        cursorA.close();
        return j8;
    }

    public static void zzc(SQLiteDatabase sQLiteDatabase, long j8, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j8));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j8)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void zzd(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase, "failed_requests", 0);
        b(sQLiteDatabase, "total_requests", 0);
        b(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put("value", (Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void zze(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        c(sQLiteDatabase, "failed_requests", 0);
        c(sQLiteDatabase, "total_requests", 0);
        c(sQLiteDatabase, "completed_requests", 0);
    }

    public static void zzf(SQLiteDatabase sQLiteDatabase, boolean z8, boolean z9) throws SQLException {
        if (!z9) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "completed_requests"));
        if (z8) {
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
    }
}
