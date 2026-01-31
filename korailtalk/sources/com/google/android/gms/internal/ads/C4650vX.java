package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vX */
/* loaded from: classes2.dex */
final class C4650vX implements MK {

    /* renamed from: a */
    private final L1.a f23249a;

    /* renamed from: b */
    private final com.google.common.util.concurrent.C f23250b;

    /* renamed from: c */
    private final C4654va0 f23251c;

    /* renamed from: d */
    private final InterfaceC2065Wv f23252d;

    /* renamed from: e */
    private final C1825Ra0 f23253e;

    /* renamed from: f */
    private final C2622dl f23254f;

    /* renamed from: g */
    private final boolean f23255g;

    /* renamed from: h */
    private final GW f23256h;

    C4650vX(L1.a aVar, com.google.common.util.concurrent.C c9, C4654va0 c4654va0, InterfaceC2065Wv interfaceC2065Wv, C1825Ra0 c1825Ra0, boolean z8, C2622dl c2622dl, GW gw) {
        this.f23249a = aVar;
        this.f23250b = c9;
        this.f23251c = c4654va0;
        this.f23252d = interfaceC2065Wv;
        this.f23253e = c1825Ra0;
        this.f23255g = z8;
        this.f23254f = c2622dl;
        this.f23256h = gw;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0070  */
    @Override // com.google.android.gms.internal.ads.MK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(boolean r19, android.content.Context r20, com.google.android.gms.internal.ads.MF r21) {
        /*
            r18 = this;
            r0 = r18
            com.google.common.util.concurrent.C r1 = r0.f23250b
            java.lang.Object r1 = com.google.android.gms.internal.ads.AbstractC1483In0.zzq(r1)
            com.google.android.gms.internal.ads.wB r1 = (com.google.android.gms.internal.ads.AbstractC4728wB) r1
            com.google.android.gms.internal.ads.Wv r2 = r0.f23252d
            r3 = 1
            r2.zzaq(r3)
            G1.k r2 = new G1.k
            boolean r4 = r0.f23255g
            if (r4 == 0) goto L1e
            com.google.android.gms.internal.ads.dl r4 = r0.f23254f
            boolean r4 = r4.zze(r3)
            r5 = r4
            goto L1f
        L1e:
            r5 = r3
        L1f:
            boolean r4 = r0.f23255g
            if (r4 == 0) goto L2b
            com.google.android.gms.internal.ads.dl r6 = r0.f23254f
            boolean r6 = r6.zzd()
        L29:
            r7 = r6
            goto L2d
        L2b:
            r6 = 0
            goto L29
        L2d:
            if (r4 == 0) goto L37
            com.google.android.gms.internal.ads.dl r4 = r0.f23254f
            float r4 = r4.zza()
        L35:
            r8 = r4
            goto L39
        L37:
            r4 = 0
            goto L35
        L39:
            com.google.android.gms.internal.ads.va0 r4 = r0.f23251c
            boolean r11 = r4.zzP
            r12 = 0
            r6 = 1
            r9 = -1
            r4 = r2
            r10 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r21 == 0) goto L4b
            r21.zzf()
        L4b:
            G1.u.zzi()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r15 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.BK r6 = r1.zzg()
            com.google.android.gms.internal.ads.Wv r8 = r0.f23252d
            com.google.android.gms.internal.ads.va0 r1 = r0.f23251c
            int r1 = r1.zzR
            r4 = -1
            if (r1 == r4) goto L5f
        L5d:
            r9 = r1
            goto L7a
        L5f:
            com.google.android.gms.internal.ads.Ra0 r1 = r0.f23253e
            H1.j2 r1 = r1.zzj
            if (r1 == 0) goto L70
            int r1 = r1.zza
            if (r1 != r3) goto L6b
            r1 = 7
            goto L5d
        L6b:
            r4 = 2
            if (r1 != r4) goto L70
            r1 = 6
            goto L5d
        L70:
            java.lang.String r1 = "Error setting app open orientation; no targeting orientation available."
            L1.n.zze(r1)
            com.google.android.gms.internal.ads.va0 r1 = r0.f23251c
            int r1 = r1.zzR
            goto L5d
        L7a:
            L1.a r10 = r0.f23249a
            com.google.android.gms.internal.ads.va0 r1 = r0.f23251c
            java.lang.String r11 = r1.zzC
            com.google.android.gms.internal.ads.Aa0 r4 = r1.zzt
            java.lang.String r13 = r4.zzb
            java.lang.String r14 = r4.zza
            com.google.android.gms.internal.ads.Ra0 r4 = r0.f23253e
            boolean r1 = r1.zzaj
            if (r1 == 0) goto L91
            com.google.android.gms.internal.ads.GW r1 = r0.f23256h
        L8e:
            r17 = r1
            goto L93
        L91:
            r1 = 0
            goto L8e
        L93:
            r7 = 0
            java.lang.String r1 = r4.zzf
            r5 = 0
            r4 = r15
            r12 = r2
            r2 = r15
            r15 = r1
            r16 = r21
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r20
            J1.v.zza(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4650vX.zza(boolean, android.content.Context, com.google.android.gms.internal.ads.MF):void");
    }
}
