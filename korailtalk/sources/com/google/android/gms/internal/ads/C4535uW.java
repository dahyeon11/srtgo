package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.uW, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4535uW extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23061a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f23062b;

    public C4535uW(Context context, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) H1.C.zzc().zza(AbstractC4439th.zziv)).intValue());
        this.f23061a = context;
        this.f23062b = interfaceExecutorServiceC1974Un0;
    }

    static /* synthetic */ Void b(L1.s sVar, SQLiteDatabase sQLiteDatabase) {
        g(sQLiteDatabase, sVar);
        return null;
    }

    static /* synthetic */ void d(SQLiteDatabase sQLiteDatabase, String str, L1.s sVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        g(sQLiteDatabase, sVar);
    }

    static final void f(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void g(SQLiteDatabase sQLiteDatabase, L1.s sVar) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor cursorQuery = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = cursorQuery.getCount();
            String[] strArr = new String[count];
            int i8 = 0;
            while (cursorQuery.moveToNext()) {
                int columnIndex = cursorQuery.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i8] = cursorQuery.getString(columnIndex);
                }
                i8++;
            }
            cursorQuery.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (int i9 = 0; i9 < count; i9++) {
                sVar.zza(strArr[i9]);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    final /* synthetic */ Void a(C4877xW c4877xW, SQLiteDatabase sQLiteDatabase) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(c4877xW.zza));
        contentValues.put("gws_query_id", c4877xW.zzb);
        contentValues.put("url", c4877xW.zzc);
        contentValues.put("event_state", Integer.valueOf(c4877xW.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        G1.u.zzp();
        K1.W wZzz = K1.K0.zzz(this.f23061a);
        if (wZzz != null) {
            try {
                wZzz.zze(r2.b.wrap(this.f23061a));
            } catch (RemoteException e8) {
                AbstractC0667v0.zzb("Failed to schedule offline ping sender.", e8);
            }
        }
        return null;
    }

    final void c(InterfaceC1215Cc0 interfaceC1215Cc0) {
        AbstractC1483In0.zzr(this.f23062b.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.qW
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.getWritableDatabase();
            }
        }), new C4421tW(this, interfaceC1215Cc0), this.f23062b);
    }

    final void e(final SQLiteDatabase sQLiteDatabase, final L1.s sVar, final String str) {
        this.f23062b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.rW
            @Override // java.lang.Runnable
            public final void run() {
                C4535uW.d(sQLiteDatabase, str, sVar);
            }
        });
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void zzc(final String str) {
        c(new InterfaceC1215Cc0() { // from class: com.google.android.gms.internal.ads.sW
            @Override // com.google.android.gms.internal.ads.InterfaceC1215Cc0
            public final Object zza(Object obj) {
                C4535uW.f((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final C4877xW c4877xW) {
        c(new InterfaceC1215Cc0() { // from class: com.google.android.gms.internal.ads.oW
            @Override // com.google.android.gms.internal.ads.InterfaceC1215Cc0
            public final Object zza(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                this.zza.a(c4877xW, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final void zzh(final L1.s sVar, final String str) {
        c(new InterfaceC1215Cc0() { // from class: com.google.android.gms.internal.ads.pW
            @Override // com.google.android.gms.internal.ads.InterfaceC1215Cc0
            public final Object zza(Object obj) {
                this.zza.e((SQLiteDatabase) obj, sVar, str);
                return null;
            }
        });
    }
}
