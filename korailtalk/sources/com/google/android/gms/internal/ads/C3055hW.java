package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.hW, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3055hW {

    /* renamed from: a, reason: collision with root package name */
    private final C4775we f19820a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f19821b;

    /* renamed from: c, reason: collision with root package name */
    private final LV f19822c;

    /* renamed from: d, reason: collision with root package name */
    private final L1.a f19823d;

    public C3055hW(Context context, L1.a aVar, C4775we c4775we, LV lv) {
        this.f19821b = context;
        this.f19823d = aVar;
        this.f19820a = c4775we;
        this.f19822c = lv;
    }

    final /* synthetic */ Void a(boolean z8, SQLiteDatabase sQLiteDatabase) {
        if (z8) {
            this.f19821b.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(C1996Ve.zzx(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (C4021pz0 e8) {
                    L1.n.zzg("Unable to deserialize proto from offline signals database:");
                    L1.n.zzg(e8.getMessage());
                }
            }
            cursorQuery.close();
            Context context = this.f19821b;
            C2119Ye c2119YeZzi = C2381bf.zzi();
            c2119YeZzi.zzv(context.getPackageName());
            c2119YeZzi.zzy(Build.MODEL);
            c2119YeZzi.zzA(AbstractC2367bW.zza(sQLiteDatabase, 0));
            c2119YeZzi.zzh(arrayList);
            c2119YeZzi.zzE(AbstractC2367bW.zza(sQLiteDatabase, 1));
            c2119YeZzi.zzx(AbstractC2367bW.zza(sQLiteDatabase, 3));
            c2119YeZzi.zzF(G1.u.zzB().currentTimeMillis());
            c2119YeZzi.zzB(AbstractC2367bW.zzb(sQLiteDatabase, 2));
            final C2381bf c2381bf = (C2381bf) c2119YeZzi.zzbr();
            int size = arrayList.size();
            long jZze = 0;
            for (int i8 = 0; i8 < size; i8++) {
                C1996Ve c1996Ve = (C1996Ve) arrayList.get(i8);
                if (c1996Ve.zzk() == EnumC1631Mg.ENUM_TRUE && c1996Ve.zze() > jZze) {
                    jZze = c1996Ve.zze();
                }
            }
            if (jZze != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(jZze));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            this.f19820a.zzc(new InterfaceC4661ve() { // from class: com.google.android.gms.internal.ads.fW
                @Override // com.google.android.gms.internal.ads.InterfaceC4661ve
                public final void zza(C1713Og c1713Og) {
                    c1713Og.zzW(c2381bf);
                }
            });
            L1.a aVar = this.f19823d;
            C4321sf c4321sfZzd = C4435tf.zzd();
            c4321sfZzd.zzg(aVar.buddyApkVersion);
            c4321sfZzd.zzi(this.f19823d.clientJarVersion);
            c4321sfZzd.zzh(true != this.f19823d.isClientJar ? 2 : 0);
            final C4435tf c4435tf = (C4435tf) c4321sfZzd.zzbr();
            this.f19820a.zzc(new InterfaceC4661ve() { // from class: com.google.android.gms.internal.ads.gW
                @Override // com.google.android.gms.internal.ads.InterfaceC4661ve
                public final void zza(C1713Og c1713Og) {
                    C1304Eg c1304Eg = (C1304Eg) c1713Og.zzg().zzcZ();
                    c1304Eg.zzw(c4435tf);
                    c1713Og.zzK(c1304Eg);
                }
            });
            this.f19820a.zzb(EnumC5003ye.OFFLINE_UPLOAD);
            AbstractC2367bW.zze(sQLiteDatabase);
        }
        return null;
    }

    public final void zzb(final boolean z8) {
        try {
            this.f19822c.zza(new InterfaceC1215Cc0() { // from class: com.google.android.gms.internal.ads.eW
                @Override // com.google.android.gms.internal.ads.InterfaceC1215Cc0
                public final Object zza(Object obj) {
                    this.zza.a(z8, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e8) {
            L1.n.zzg("Error in offline signals database startup: ".concat(String.valueOf(e8.getMessage())));
        }
    }
}
