package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* renamed from: com.google.android.gms.internal.ads.eZ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2713eZ implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f18780a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4996ya0 f18781b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4654va0 f18782c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f18783d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3409ke0 f18784e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C1457Ia0 f18785f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C2943gZ f18786g;

    C2713eZ(C2943gZ c2943gZ, long j8, C4996ya0 c4996ya0, C4654va0 c4654va0, String str, C3409ke0 c3409ke0, C1457Ia0 c1457Ia0) {
        this.f18780a = j8;
        this.f18781b = c4996ya0;
        this.f18782c = c4654va0;
        this.f18783d = str;
        this.f18784e = c3409ke0;
        this.f18785f = c1457Ia0;
        this.f18786g = c2943gZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062 A[PHI: r7
  0x0062: PHI (r7v1 int) = (r7v0 int), (r7v3 int), (r7v3 int), (r7v3 int) binds: [B:16:0x002f, B:21:0x004a, B:23:0x004e, B:25:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.Throwable r17) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2713eZ.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zzb(Object obj) {
        long jElapsedRealtime = this.f18786g.f19367a.elapsedRealtime() - this.f18780a;
        synchronized (this.f18786g) {
            try {
                C2943gZ c2943gZ = this.f18786g;
                if (c2943gZ.f19371e) {
                    c2943gZ.f19368b.zza(this.f18781b, this.f18782c, 0, null, jElapsedRealtime);
                }
                C2943gZ c2943gZ2 = this.f18786g;
                if (c2943gZ2.f19373g) {
                    return;
                }
                if (c2943gZ2.j(this.f18782c)) {
                    ((C2828fZ) this.f18786g.f19370d.get(this.f18782c)).f19201d = jElapsedRealtime;
                } else {
                    LinkedHashMap linkedHashMap = this.f18786g.f19370d;
                    C4654va0 c4654va0 = this.f18782c;
                    linkedHashMap.put(c4654va0, new C2828fZ(this.f18783d, c4654va0.zzag, 0, jElapsedRealtime, null));
                }
                this.f18786g.f19372f.zzg(this.f18782c, jElapsedRealtime, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
