package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4756wP {

    /* renamed from: a, reason: collision with root package name */
    private final Map f23511a = new HashMap();

    C4756wP() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized void a(java.lang.String r6, com.google.android.gms.internal.ads.C4087qb0 r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map r0 = r5.f23511a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            com.google.android.gms.internal.ads.vP r0 = new com.google.android.gms.internal.ads.vP     // Catch: java.lang.Throwable -> L17
            r1 = 0
            if (r7 != 0) goto L12
        L10:
            r2 = r1
            goto L19
        L12:
            com.google.android.gms.internal.ads.gp r2 = r7.zze()     // Catch: com.google.android.gms.internal.ads.C2112Ya0 -> L10 java.lang.Throwable -> L17
            goto L19
        L17:
            r6 = move-exception
            goto L46
        L19:
            if (r7 != 0) goto L1c
            goto L20
        L1c:
            com.google.android.gms.internal.ads.gp r1 = r7.zzf()     // Catch: java.lang.Throwable -> L17 com.google.android.gms.internal.ads.C2112Ya0 -> L20
        L20:
            com.google.android.gms.internal.ads.kh r3 = com.google.android.gms.internal.ads.AbstractC4439th.zzjr     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.ads.rh r4 = H1.C.zzc()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L17
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L34
            goto L3c
        L34:
            r3 = 0
            if (r7 != 0) goto L39
        L37:
            r4 = r3
            goto L3c
        L39:
            r7.zzC()     // Catch: java.lang.Throwable -> L17 com.google.android.gms.internal.ads.C2112Ya0 -> L37
        L3c:
            r0.<init>(r6, r2, r1, r4)     // Catch: java.lang.Throwable -> L17
            java.util.Map r7 = r5.f23511a     // Catch: java.lang.Throwable -> L17
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r5)
            return
        L46:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L17
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4756wP.a(java.lang.String, com.google.android.gms.internal.ads.qb0):void");
    }

    final synchronized void b(String str, InterfaceC1852Ro interfaceC1852Ro) {
        if (this.f23511a.containsKey(str)) {
            return;
        }
        try {
            this.f23511a.put(str, new C4642vP(str, interfaceC1852Ro.zzf(), interfaceC1852Ro.zzg(), true));
        } catch (Throwable unused) {
        }
    }

    public final synchronized C4642vP zza(String str) {
        return (C4642vP) this.f23511a.get(str);
    }

    public final String zzb(String str) {
        C2974gp c2974gp;
        C4642vP c4642vPZza = zza(str);
        return (c4642vPZza == null || (c2974gp = c4642vPZza.zzb) == null) ? "" : c2974gp.toString();
    }
}
