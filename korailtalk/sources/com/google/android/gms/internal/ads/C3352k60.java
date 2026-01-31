package com.google.android.gms.internal.ads;

import D1.a;
import H1.C0591z;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.k60, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3352k60 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20352a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f20353b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f20354c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20355d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20356e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f20357f;

    /* renamed from: g, reason: collision with root package name */
    private final C2523ct f20358g;

    C3352k60(C2523ct c2523ct, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i8, boolean z8, boolean z9) {
        this.f20358g = c2523ct;
        this.f20352a = context;
        this.f20353b = scheduledExecutorService;
        this.f20354c = executor;
        this.f20355d = i8;
        this.f20356e = z8;
        this.f20357f = z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ com.google.android.gms.internal.ads.C3466l60 a(D1.a.C0017a r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.Vh0 r0 = new com.google.android.gms.internal.ads.Vh0
            r0.<init>()
            boolean r1 = r7.f20356e
            if (r1 != 0) goto L1b
            com.google.android.gms.internal.ads.kh r1 = com.google.android.gms.internal.ads.AbstractC4439th.zzcZ
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L31
        L1b:
            boolean r1 = r7.f20356e
            if (r1 == 0) goto L6f
            com.google.android.gms.internal.ads.kh r1 = com.google.android.gms.internal.ads.AbstractC4439th.zzda
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6f
        L31:
            android.content.Context r0 = r7.f20352a     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.Yh0 r1 = com.google.android.gms.internal.ads.C2126Yh0.zzj(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r2 = r8.getId()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            android.content.Context r0 = r7.f20352a     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzdg     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.rh r4 = H1.C.zzc()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Object r0 = r4.zza(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            boolean r6 = r7.f20357f     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.Vh0 r0 = r1.zzi(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            goto L6f
        L5e:
            r0 = move-exception
            goto L61
        L60:
            r0 = move-exception
        L61:
            java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
            com.google.android.gms.internal.ads.mt r2 = G1.u.zzo()
            r2.zzw(r0, r1)
            com.google.android.gms.internal.ads.Vh0 r0 = new com.google.android.gms.internal.ads.Vh0
            r0.<init>()
        L6f:
            com.google.android.gms.internal.ads.l60 r1 = new com.google.android.gms.internal.ads.l60
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3352k60.a(D1.a$a):com.google.android.gms.internal.ads.l60");
    }

    final /* synthetic */ C3466l60 b(Throwable th) {
        C0591z.zzb();
        ContentResolver contentResolver = this.f20352a.getContentResolver();
        return new C3466l60(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new C2003Vh0());
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzaV)).booleanValue()) {
            return AbstractC1483In0.zzg(new Exception("Did not ad Ad ID into query param."));
        }
        return AbstractC1483In0.zze((AbstractC5136zn0) AbstractC1483In0.zzo(AbstractC1483In0.zzm(AbstractC5136zn0.zzu(this.f20358g.zza(this.f20352a, this.f20355d)), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.i60
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                return this.zza.a((a.C0017a) obj);
            }
        }, this.f20354c), ((Long) H1.C.zzc().zza(AbstractC4439th.zzaW)).longValue(), TimeUnit.MILLISECONDS, this.f20353b), Throwable.class, new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.j60
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                return this.zza.b((Throwable) obj);
            }
        }, this.f20354c);
    }
}
