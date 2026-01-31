package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.p7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3923p7 implements InterfaceC2425c1 {
    public static final InterfaceC3227j1 zza = new InterfaceC3227j1() { // from class: com.google.android.gms.internal.ads.l7
        @Override // com.google.android.gms.internal.ads.InterfaceC3227j1
        public final /* synthetic */ InterfaceC2425c1[] zza(Uri uri, Map map) {
            return new InterfaceC2425c1[]{new C3923p7()};
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC2769f1 f21665a;

    /* renamed from: b, reason: collision with root package name */
    private K1 f21666b;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC3695n7 f21669e;

    /* renamed from: c, reason: collision with root package name */
    private int f21667c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f21668d = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f21670f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f21671g = -1;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010d  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.InterfaceC2540d1 r19, com.google.android.gms.internal.ads.C5050z1 r20) throws com.google.android.gms.internal.ads.C1901Sv, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3923p7.zzb(com.google.android.gms.internal.ads.d1, com.google.android.gms.internal.ads.z1):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return AbstractC2394bl0.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        this.f21665a = interfaceC2769f1;
        this.f21666b = interfaceC2769f1.zzw(0, 1);
        interfaceC2769f1.zzD();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zze(long j8, long j9) {
        this.f21667c = j8 == 0 ? 0 : 4;
        InterfaceC3695n7 interfaceC3695n7 = this.f21669e;
        if (interfaceC3695n7 != null) {
            interfaceC3695n7.zzb(j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final boolean zzf(InterfaceC2540d1 interfaceC2540d1) {
        return AbstractC4264s7.zzc(interfaceC2540d1);
    }
}
