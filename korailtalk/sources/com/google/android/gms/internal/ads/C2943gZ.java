package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.gZ */
/* loaded from: classes2.dex */
public final class C2943gZ {

    /* renamed from: a */
    private final o2.f f19367a;

    /* renamed from: b */
    private final C3173iZ f19368b;

    /* renamed from: c */
    private final C3865oe0 f19369c;

    /* renamed from: d */
    private final LinkedHashMap f19370d = new LinkedHashMap();

    /* renamed from: e */
    private final boolean f19371e = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhb)).booleanValue();

    /* renamed from: f */
    private final C3739nX f19372f;

    /* renamed from: g */
    private boolean f19373g;

    /* renamed from: h */
    private long f19374h;

    /* renamed from: i */
    private long f19375i;

    public C2943gZ(o2.f fVar, C3173iZ c3173iZ, C3739nX c3739nX, C3865oe0 c3865oe0) {
        this.f19367a = fVar;
        this.f19368b = c3173iZ;
        this.f19372f = c3739nX;
        this.f19369c = c3865oe0;
    }

    public final synchronized boolean j(C4654va0 c4654va0) {
        C2828fZ c2828fZ = (C2828fZ) this.f19370d.get(c4654va0);
        if (c2828fZ == null) {
            return false;
        }
        return c2828fZ.f19200c == 8;
    }

    final synchronized com.google.common.util.concurrent.C e(C1457Ia0 c1457Ia0, C4654va0 c4654va0, com.google.common.util.concurrent.C c9, C3409ke0 c3409ke0) {
        C4996ya0 c4996ya0 = c1457Ia0.zzb.zzb;
        long jElapsedRealtime = this.f19367a.elapsedRealtime();
        String str = c4654va0.zzx;
        if (str != null) {
            this.f19370d.put(c4654va0, new C2828fZ(str, c4654va0.zzag, 9, 0L, null));
            AbstractC1483In0.zzr(c9, new C2713eZ(this, jElapsedRealtime, c4996ya0, c4654va0, str, c3409ke0, c1457Ia0), AbstractC4805wt.zzf);
        }
        return c9;
    }

    public final synchronized long zza() {
        return this.f19374h;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f19370d.entrySet().iterator();
            while (it.hasNext()) {
                C2828fZ c2828fZ = (C2828fZ) ((Map.Entry) it.next()).getValue();
                if (c2828fZ.f19200c != Integer.MAX_VALUE) {
                    arrayList.add(c2828fZ.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void zzi(C4654va0 c4654va0) {
        try {
            this.f19374h = this.f19367a.elapsedRealtime() - this.f19375i;
            if (c4654va0 != null) {
                this.f19372f.zze(c4654va0);
            }
            this.f19373g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzj() {
        this.f19374h = this.f19367a.elapsedRealtime() - this.f19375i;
    }

    public final synchronized void zzk(List list) {
        this.f19375i = this.f19367a.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4654va0 c4654va0 = (C4654va0) it.next();
            if (!TextUtils.isEmpty(c4654va0.zzx)) {
                this.f19370d.put(c4654va0, new C2828fZ(c4654va0.zzx, c4654va0.zzag, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzl() {
        this.f19375i = this.f19367a.elapsedRealtime();
    }

    public final synchronized void zzm(C4654va0 c4654va0) {
        C2828fZ c2828fZ = (C2828fZ) this.f19370d.get(c4654va0);
        if (c2828fZ == null || this.f19373g) {
            return;
        }
        c2828fZ.f19200c = 8;
    }
}
