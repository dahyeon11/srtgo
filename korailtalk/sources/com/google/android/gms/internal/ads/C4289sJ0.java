package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.Uri;
import android.provider.Settings;
import android.util.SparseArray;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.sJ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4289sJ0 {

    /* renamed from: d, reason: collision with root package name */
    static final AbstractC2737el0 f22618d;

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray f22619a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22620b;
    public static final C4289sJ0 zza = new C4289sJ0(AbstractC2394bl0.zzn(C3834oJ0.zza));

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC2394bl0 f22617c = AbstractC2394bl0.zzp(2, 5, 6);

    static {
        C2623dl0 c2623dl0 = new C2623dl0();
        c2623dl0.zza(5, 6);
        c2623dl0.zza(17, 6);
        c2623dl0.zza(7, 6);
        c2623dl0.zza(30, 10);
        c2623dl0.zza(18, 6);
        c2623dl0.zza(6, 8);
        c2623dl0.zza(8, 8);
        c2623dl0.zza(14, 8);
        f22618d = c2623dl0.zzc();
    }

    static Uri a() {
        if (e()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    static C4289sJ0 b(Context context, C3940pF0 c3940pF0, AJ0 aj0) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c3940pF0, aj0);
    }

    static C4289sJ0 c(Context context, Intent intent, C3940pF0 c3940pF0, AJ0 aj0) {
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (aj0 == null) {
            aj0 = AbstractC2281am0.zza >= 33 ? AbstractC3720nJ0.zzb(audioManager, c3940pF0) : null;
        }
        int i8 = AbstractC2281am0.zza;
        if (i8 >= 33 && (AbstractC2281am0.zzN(context) || AbstractC2281am0.zzJ(context))) {
            return AbstractC3720nJ0.zza(audioManager, c3940pF0);
        }
        if (i8 >= 23 && AbstractC2691eJ0.zza(audioManager, aj0)) {
            return zza;
        }
        C2852fl0 c2852fl0 = new C2852fl0();
        c2852fl0.zzf(2);
        if (i8 >= 29 && (AbstractC2281am0.zzN(context) || AbstractC2281am0.zzJ(context))) {
            c2852fl0.zzh(AbstractC2921gJ0.zzb(c3940pF0));
            return new C4289sJ0(d(AbstractC1235Cm0.zzg(c2852fl0.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z8 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z8 || e()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            c2852fl0.zzh(f22617c);
        }
        if (intent == null || z8 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C4289sJ0(d(AbstractC1235Cm0.zzg(c2852fl0.zzi()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            c2852fl0.zzh(AbstractC1235Cm0.zzf(intArrayExtra));
        }
        return new C4289sJ0(d(AbstractC1235Cm0.zzg(c2852fl0.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    private static AbstractC2394bl0 d(int[] iArr, int i8) {
        C2091Xk0 c2091Xk0 = new C2091Xk0();
        for (int i9 : iArr) {
            c2091Xk0.zzf(new C3834oJ0(i9, i8));
        }
        return c2091Xk0.zzi();
    }

    private static boolean e() {
        String str = AbstractC2281am0.zzc;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.ads.C4289sJ0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.sJ0 r9 = (com.google.android.gms.internal.ads.C4289sJ0) r9
            android.util.SparseArray r1 = r8.f22619a
            android.util.SparseArray r3 = r9.f22619a
            int r4 = com.google.android.gms.internal.ads.AbstractC2281am0.zza
            r5 = 31
            if (r4 < r5) goto L1d
            boolean r1 = com.google.android.gms.internal.ads.AbstractC4062qJ0.a(r1, r3)
            if (r1 == 0) goto L46
            goto L3f
        L1d:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L46
            r5 = r2
        L28:
            if (r5 >= r4) goto L3f
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L46
            int r5 = r5 + 1
            goto L28
        L3f:
            int r1 = r8.f22620b
            int r9 = r9.f22620b
            if (r1 != r9) goto L46
            return r0
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4289sJ0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iContentHashCode;
        int i8 = AbstractC2281am0.zza;
        SparseArray sparseArray = this.f22619a;
        if (i8 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iKeyAt = 17;
            for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i9)) * 31) + Objects.hashCode(sparseArray.valueAt(i9));
            }
            iContentHashCode = iKeyAt;
        }
        return this.f22620b + (iContentHashCode * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f22620b + ", audioProfiles=" + this.f22619a.toString() + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[PHI: r0
  0x003a: PHI (r0v3 int) = (r0v2 int), (r0v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair zzb(com.google.android.gms.internal.ads.Q5 r9, com.google.android.gms.internal.ads.C3940pF0 r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.zzn
            r0.getClass()
            java.lang.String r1 = r9.zzk
            int r0 = com.google.android.gms.internal.ads.AbstractC4239rv.zza(r0, r1)
            com.google.android.gms.internal.ads.el0 r1 = com.google.android.gms.internal.ads.C4289sJ0.f22618d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L19
            goto Lc3
        L19:
            r1 = 7
            r2 = 8
            r3 = 6
            r4 = 18
            if (r0 != r4) goto L2c
            android.util.SparseArray r0 = r8.f22619a
            boolean r0 = com.google.android.gms.internal.ads.AbstractC2281am0.zzH(r0, r4)
            if (r0 != 0) goto L2b
            r0 = r3
            goto L47
        L2b:
            r0 = r4
        L2c:
            if (r0 != r2) goto L3a
            android.util.SparseArray r0 = r8.f22619a
            boolean r0 = com.google.android.gms.internal.ads.AbstractC2281am0.zzH(r0, r2)
            if (r0 == 0) goto L38
            r0 = r2
            goto L3a
        L38:
            r0 = r1
            goto L47
        L3a:
            r5 = 30
            if (r0 != r5) goto L47
            android.util.SparseArray r6 = r8.f22619a
            boolean r5 = com.google.android.gms.internal.ads.AbstractC2281am0.zzH(r6, r5)
            if (r5 != 0) goto L47
            goto L38
        L47:
            android.util.SparseArray r5 = r8.f22619a
            boolean r5 = com.google.android.gms.internal.ads.AbstractC2281am0.zzH(r5, r0)
            if (r5 == 0) goto Lc3
            android.util.SparseArray r5 = r8.f22619a
            java.lang.Object r5 = r5.get(r0)
            com.google.android.gms.internal.ads.oJ0 r5 = (com.google.android.gms.internal.ads.C3834oJ0) r5
            r5.getClass()
            int r6 = r9.zzA
            r7 = -1
            if (r6 == r7) goto L7e
            if (r0 != r4) goto L62
            goto L7e
        L62:
            java.lang.String r9 = r9.zzn
            java.lang.String r10 = "audio/vnd.dts.uhd;profile=p2"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L77
            int r9 = com.google.android.gms.internal.ads.AbstractC2281am0.zza
            r10 = 33
            if (r9 >= r10) goto L77
            r9 = 10
            if (r6 <= r9) goto L89
            goto Lc3
        L77:
            boolean r9 = r5.zzb(r6)
            if (r9 != 0) goto L89
            goto Lc3
        L7e:
            int r9 = r9.zzB
            if (r9 != r7) goto L85
            r9 = 48000(0xbb80, float:6.7262E-41)
        L85:
            int r6 = r5.zza(r9, r10)
        L89:
            int r9 = com.google.android.gms.internal.ads.AbstractC2281am0.zza
            r10 = 28
            if (r9 > r10) goto L9d
            if (r6 != r1) goto L92
            goto L9e
        L92:
            r10 = 3
            if (r6 == r10) goto L9b
            r10 = 4
            if (r6 == r10) goto L9b
            r10 = 5
            if (r6 != r10) goto L9d
        L9b:
            r2 = r3
            goto L9e
        L9d:
            r2 = r6
        L9e:
            r10 = 26
            if (r9 > r10) goto Lb0
            java.lang.String r9 = "fugu"
            java.lang.String r10 = com.google.android.gms.internal.ads.AbstractC2281am0.zzb
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lb0
            r9 = 1
            if (r2 != r9) goto Lb0
            r2 = 2
        Lb0:
            int r9 = com.google.android.gms.internal.ads.AbstractC2281am0.zzh(r2)
            if (r9 == 0) goto Lc3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r10, r9)
            return r9
        Lc3:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4289sJ0.zzb(com.google.android.gms.internal.ads.Q5, com.google.android.gms.internal.ads.pF0):android.util.Pair");
    }

    private C4289sJ0(List list) {
        this.f22619a = new SparseArray();
        for (int i8 = 0; i8 < list.size(); i8++) {
            C3834oJ0 c3834oJ0 = (C3834oJ0) list.get(i8);
            this.f22619a.put(c3834oJ0.zzb, c3834oJ0);
        }
        int iMax = 0;
        for (int i9 = 0; i9 < this.f22619a.size(); i9++) {
            iMax = Math.max(iMax, ((C3834oJ0) this.f22619a.valueAt(i9)).zzc);
        }
        this.f22620b = iMax;
    }
}
