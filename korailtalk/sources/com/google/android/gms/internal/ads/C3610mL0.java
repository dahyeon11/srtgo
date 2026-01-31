package com.google.android.gms.internal.ads;

import android.os.HandlerThread;

/* renamed from: com.google.android.gms.internal.ads.mL0 */
/* loaded from: classes2.dex */
public final class C3610mL0 implements InterfaceC5091zL0 {

    /* renamed from: a */
    private final InterfaceC1843Rj0 f20879a;

    /* renamed from: b */
    private final InterfaceC1843Rj0 f20880b;

    /* renamed from: c */
    private boolean f20881c;

    public C3610mL0(int i8) {
        C3382kL0 c3382kL0 = new C3382kL0(i8);
        C3496lL0 c3496lL0 = new C3496lL0(i8);
        this.f20879a = c3382kL0;
        this.f20880b = c3496lL0;
        this.f20881c = true;
    }

    static /* synthetic */ HandlerThread a(int i8) {
        return new HandlerThread(C3952pL0.d(i8, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    static /* synthetic */ HandlerThread b(int i8) {
        return new HandlerThread(C3952pL0.d(i8, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0040 A[Catch: Exception -> 0x0037, TryCatch #2 {Exception -> 0x0037, blocks: (B:40:0x001d, B:42:0x0021, B:47:0x002e, B:52:0x0039, B:54:0x0050, B:53:0x0040), top: B:70:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.C3952pL0 zzc(com.google.android.gms.internal.ads.C4977yL0 r7) throws java.lang.Exception {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.DL0 r0 = r7.zza
            java.lang.String r0 = r0.zza
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6d
            r2.<init>()     // Catch: java.lang.Exception -> L6d
            java.lang.String r3 = "createCodec:"
            r2.append(r3)     // Catch: java.lang.Exception -> L6d
            r2.append(r0)     // Catch: java.lang.Exception -> L6d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L6d
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Exception -> L6d
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch: java.lang.Exception -> L6d
            boolean r2 = r6.f20881c     // Catch: java.lang.Exception -> L37
            if (r2 == 0) goto L40
            com.google.android.gms.internal.ads.Q5 r2 = r7.zzc     // Catch: java.lang.Exception -> L37
            int r3 = com.google.android.gms.internal.ads.AbstractC2281am0.zza     // Catch: java.lang.Exception -> L37
            r4 = 34
            if (r3 >= r4) goto L2a
            goto L40
        L2a:
            r4 = 35
            if (r3 >= r4) goto L39
            java.lang.String r2 = r2.zzn     // Catch: java.lang.Exception -> L37
            boolean r2 = com.google.android.gms.internal.ads.AbstractC4239rv.zzh(r2)     // Catch: java.lang.Exception -> L37
            if (r2 == 0) goto L40
            goto L39
        L37:
            r7 = move-exception
            goto L6f
        L39:
            com.google.android.gms.internal.ads.lM0 r2 = new com.google.android.gms.internal.ads.lM0     // Catch: java.lang.Exception -> L37
            r2.<init>(r0)     // Catch: java.lang.Exception -> L37
            r3 = 4
            goto L50
        L40:
            com.google.android.gms.internal.ads.tL0 r2 = new com.google.android.gms.internal.ads.tL0     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.Rj0 r3 = r6.f20880b     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.lL0 r3 = (com.google.android.gms.internal.ads.C3496lL0) r3     // Catch: java.lang.Exception -> L37
            int r3 = r3.zza     // Catch: java.lang.Exception -> L37
            android.os.HandlerThread r3 = b(r3)     // Catch: java.lang.Exception -> L37
            r2.<init>(r0, r3)     // Catch: java.lang.Exception -> L37
            r3 = 0
        L50:
            com.google.android.gms.internal.ads.pL0 r4 = new com.google.android.gms.internal.ads.pL0     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.Rj0 r5 = r6.f20879a     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.kL0 r5 = (com.google.android.gms.internal.ads.C3382kL0) r5     // Catch: java.lang.Exception -> L37
            int r5 = r5.zza     // Catch: java.lang.Exception -> L37
            android.os.HandlerThread r5 = a(r5)     // Catch: java.lang.Exception -> L37
            r4.<init>(r0, r5, r2, r1)     // Catch: java.lang.Exception -> L37
            android.os.Trace.endSection()     // Catch: java.lang.Exception -> L6a
            android.media.MediaFormat r2 = r7.zzb     // Catch: java.lang.Exception -> L6a
            android.view.Surface r7 = r7.zzd     // Catch: java.lang.Exception -> L6a
            com.google.android.gms.internal.ads.C3952pL0.c(r4, r2, r7, r1, r3)     // Catch: java.lang.Exception -> L6a
            return r4
        L6a:
            r7 = move-exception
            r1 = r4
            goto L6f
        L6d:
            r7 = move-exception
            r0 = r1
        L6f:
            if (r1 != 0) goto L77
            if (r0 == 0) goto L7a
            r0.release()
            goto L7a
        L77:
            r1.zzl()
        L7a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3610mL0.zzc(com.google.android.gms.internal.ads.yL0):com.google.android.gms.internal.ads.pL0");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5091zL0
    public final /* bridge */ /* synthetic */ AL0 zzd(C4977yL0 c4977yL0) {
        throw null;
    }

    public final void zze(boolean z8) {
        this.f20881c = true;
    }
}
