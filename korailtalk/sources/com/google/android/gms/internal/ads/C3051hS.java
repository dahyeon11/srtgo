package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.hS, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3051hS {

    /* renamed from: a, reason: collision with root package name */
    private final RR f19814a;

    /* renamed from: b, reason: collision with root package name */
    private final C4756wP f19815b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f19816c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final List f19817d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private boolean f19818e;

    C3051hS(RR rr, C4756wP c4756wP) {
        this.f19814a = rr;
        this.f19815b = c4756wP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(List list) {
        C4642vP c4642vPZza;
        C4642vP c4642vPZza2;
        C2974gp c2974gp;
        synchronized (this.f19816c) {
            try {
                if (this.f19818e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C2051Wl c2051Wl = (C2051Wl) it.next();
                    String string = (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjq)).booleanValue() || (c4642vPZza2 = this.f19815b.zza(c2051Wl.zza)) == null || (c2974gp = c4642vPZza2.zzc) == null) ? "" : c2974gp.toString();
                    String str = string;
                    boolean z8 = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjr)).booleanValue() && (c4642vPZza = this.f19815b.zza(c2051Wl.zza)) != null && c4642vPZza.zzd;
                    List list2 = this.f19817d;
                    String str2 = c2051Wl.zza;
                    list2.add(new C2936gS(str2, str, this.f19815b.zzb(str2), c2051Wl.zzb ? 1 : 0, c2051Wl.zzd, c2051Wl.zzc, z8));
                }
                this.f19818e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[Catch: all -> 0x001e, LOOP:0: B:15:0x002b->B:17:0x0031, LOOP_END, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0008, B:6:0x000c, B:8:0x0014, B:11:0x0020, B:12:0x0023, B:14:0x0025, B:15:0x002b, B:17:0x0031, B:18:0x003f), top: B:22:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONArray zza() {
        /*
            r4 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Object r1 = r4.f19816c
            monitor-enter(r1)
            boolean r2 = r4.f19818e     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L25
            com.google.android.gms.internal.ads.RR r2 = r4.f19814a     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.zzt()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L20
            com.google.android.gms.internal.ads.RR r2 = r4.f19814a     // Catch: java.lang.Throwable -> L1e
            java.util.List r2 = r2.zzg()     // Catch: java.lang.Throwable -> L1e
            r4.b(r2)     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r0 = move-exception
            goto L41
        L20:
            r4.zzc()     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            goto L40
        L25:
            java.util.List r2 = r4.f19817d     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1e
        L2b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.gS r3 = (com.google.android.gms.internal.ads.C2936gS) r3     // Catch: java.lang.Throwable -> L1e
            org.json.JSONObject r3 = r3.zza()     // Catch: java.lang.Throwable -> L1e
            r0.put(r3)     // Catch: java.lang.Throwable -> L1e
            goto L2b
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
        L40:
            return r0
        L41:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3051hS.zza():org.json.JSONArray");
    }

    public final void zzc() {
        this.f19814a.zzs(new BinderC2821fS(this));
    }
}
