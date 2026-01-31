package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.md0 */
/* loaded from: classes2.dex */
public final class C3635md0 implements InterfaceC3407kd0 {

    /* renamed from: a */
    private final Context f20950a;

    /* renamed from: b */
    private final EnumC1217Cd0 f20951b;

    /* renamed from: c */
    private long f20952c = 0;

    /* renamed from: d */
    private long f20953d = -1;

    /* renamed from: e */
    private boolean f20954e = false;

    /* renamed from: f */
    private EnumC1299Ed0 f20955f = EnumC1299Ed0.FORMAT_UNKNOWN;

    /* renamed from: g */
    private EnumC1381Gd0 f20956g = EnumC1381Gd0.ORIENTATION_UNKNOWN;

    /* renamed from: h */
    private int f20957h = 0;

    /* renamed from: i */
    private String f20958i = "";

    /* renamed from: j */
    private String f20959j = "";

    /* renamed from: k */
    private String f20960k = "";

    /* renamed from: l */
    private String f20961l = "";

    /* renamed from: m */
    private EnumC1586Ld0 f20962m = EnumC1586Ld0.SCAR_REQUEST_TYPE_UNSPECIFIED;

    /* renamed from: n */
    private String f20963n = "";

    /* renamed from: o */
    private String f20964o = "";

    /* renamed from: p */
    private String f20965p = "";

    /* renamed from: q */
    private boolean f20966q = false;

    /* renamed from: r */
    private boolean f20967r = false;

    C3635md0(Context context, EnumC1217Cd0 enumC1217Cd0) {
        this.f20950a = context;
        this.f20951b = enumC1217Cd0;
    }

    public final synchronized C3635md0 zzA() {
        Configuration configuration;
        try {
            this.f20957h = G1.u.zzq().zzm(this.f20950a);
            Resources resources = this.f20950a.getResources();
            EnumC1381Gd0 enumC1381Gd0 = (resources == null || (configuration = resources.getConfiguration()) == null) ? EnumC1381Gd0.ORIENTATION_UNKNOWN : configuration.orientation == 2 ? EnumC1381Gd0.ORIENTATION_LANDSCAPE : EnumC1381Gd0.ORIENTATION_PORTRAIT;
            this.f20956g = enumC1381Gd0;
            this.f20952c = G1.u.zzB().elapsedRealtime();
            this.f20967r = true;
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized C3635md0 zzB() {
        this.f20953d = G1.u.zzB().elapsedRealtime();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407kd0
    public final /* bridge */ /* synthetic */ InterfaceC3407kd0 zza(C0534f1 c0534f1) {
        zzr(c0534f1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407kd0
    public final /* bridge */ /* synthetic */ InterfaceC3407kd0 zzb(C1416Ha0 c1416Ha0) {
        zzs(c1416Ha0);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407kd0
    public final /* bridge */ /* synthetic */ InterfaceC3407kd0 zzc(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407kd0
    public final /* bridge */ /* synthetic */ InterfaceC3407kd0 zzd(EnumC1299Ed0 enumC1299Ed0) {
        zzu(enumC1299Ed0);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407kd0
    public final /* bridge */ /* synthetic */ InterfaceC3407kd0 zze(String str) {
        zzv(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407kd0
    public final /* bridge */ /* synthetic */ InterfaceC3407kd0 zzf(String str) {
        zzw(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407kd0
    public final /* bridge */ /* synthetic */ InterfaceC3407kd0 zzg(EnumC1586Ld0 enumC1586Ld0) {
        zzx(enumC1586Ld0);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407kd0
    public final /* bridge */ /* synthetic */ InterfaceC3407kd0 zzh(boolean z8) {
        zzy(z8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407kd0
    public final /* bridge */ /* synthetic */ InterfaceC3407kd0 zzi(Throwable th) {
        zzz(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407kd0
    public final /* bridge */ /* synthetic */ InterfaceC3407kd0 zzj() {
        zzA();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407kd0
    public final /* bridge */ /* synthetic */ InterfaceC3407kd0 zzk() {
        zzB();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407kd0
    public final synchronized boolean zzl() {
        return this.f20967r;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407kd0
    public final boolean zzm() {
        return !TextUtils.isEmpty(this.f20960k);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407kd0
    public final synchronized C3863od0 zzn() {
        try {
            if (this.f20966q) {
                return null;
            }
            this.f20966q = true;
            if (!this.f20967r) {
                zzA();
            }
            if (this.f20953d < 0) {
                zzB();
            }
            return new C3863od0(this, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized C3635md0 zzr(C0534f1 c0534f1) {
        try {
            IBinder iBinder = c0534f1.zze;
            if (iBinder != null) {
                BinderC4280sF binderC4280sF = (BinderC4280sF) iBinder;
                String strZzk = binderC4280sF.zzk();
                if (!TextUtils.isEmpty(strZzk)) {
                    this.f20958i = strZzk;
                }
                String strZzi = binderC4280sF.zzi();
                if (!TextUtils.isEmpty(strZzi)) {
                    this.f20959j = strZzi;
                }
            }
        } finally {
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x002e, code lost:
    
        r2.f20959j = r0.zzac;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.C3635md0 zzs(com.google.android.gms.internal.ads.C1416Ha0 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.ya0 r0 = r3.zzb     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L12
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            com.google.android.gms.internal.ads.ya0 r0 = r3.zzb     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L12
            r2.f20958i = r0     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r3 = move-exception
            goto L34
        L14:
            java.util.List r3 = r3.zza     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L12
        L1a:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.internal.ads.va0 r0 = (com.google.android.gms.internal.ads.C4654va0) r0     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r0.zzac     // Catch: java.lang.Throwable -> L12
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L1a
            java.lang.String r3 = r0.zzac     // Catch: java.lang.Throwable -> L12
            r2.f20959j = r3     // Catch: java.lang.Throwable -> L12
        L32:
            monitor-exit(r2)
            return r2
        L34:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3635md0.zzs(com.google.android.gms.internal.ads.Ha0):com.google.android.gms.internal.ads.md0");
    }

    public final synchronized C3635md0 zzt(String str) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziP)).booleanValue()) {
            this.f20965p = str;
        }
        return this;
    }

    public final synchronized C3635md0 zzu(EnumC1299Ed0 enumC1299Ed0) {
        this.f20955f = enumC1299Ed0;
        return this;
    }

    public final synchronized C3635md0 zzv(String str) {
        this.f20960k = str;
        return this;
    }

    public final synchronized C3635md0 zzw(String str) {
        this.f20961l = str;
        return this;
    }

    public final synchronized C3635md0 zzx(EnumC1586Ld0 enumC1586Ld0) {
        this.f20962m = enumC1586Ld0;
        return this;
    }

    public final synchronized C3635md0 zzy(boolean z8) {
        this.f20954e = z8;
        return this;
    }

    public final synchronized C3635md0 zzz(Throwable th) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziP)).booleanValue()) {
            this.f20964o = C4116qq.zzf(th);
            this.f20963n = (String) C1720Oj0.zzc(AbstractC3533lj0.zzc('\n')).zzd(C4116qq.zze(th)).iterator().next();
        }
        return this;
    }
}
