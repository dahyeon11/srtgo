package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.vv */
/* loaded from: classes2.dex */
public final class C4695vv extends Dv0 {

    /* renamed from: e */
    private final Context f23352e;

    /* renamed from: f */
    private final Ky0 f23353f;

    /* renamed from: g */
    private final String f23354g;

    /* renamed from: h */
    private final int f23355h;

    /* renamed from: i */
    private final boolean f23356i;

    /* renamed from: j */
    private InputStream f23357j;

    /* renamed from: k */
    private boolean f23358k;

    /* renamed from: l */
    private Uri f23359l;

    /* renamed from: m */
    private volatile C3067he f23360m;

    /* renamed from: n */
    private boolean f23361n;

    /* renamed from: o */
    private boolean f23362o;

    /* renamed from: p */
    private boolean f23363p;

    /* renamed from: q */
    private boolean f23364q;

    /* renamed from: r */
    private long f23365r;

    /* renamed from: s */
    private com.google.common.util.concurrent.C f23366s;

    /* renamed from: t */
    private final AtomicLong f23367t;

    /* renamed from: u */
    private final C1410Gv f23368u;

    public C4695vv(Context context, Ky0 ky0, String str, int i8, InterfaceC4279sE0 interfaceC4279sE0, C1410Gv c1410Gv) {
        super(false);
        this.f23352e = context;
        this.f23353f = ky0;
        this.f23368u = c1410Gv;
        this.f23354g = str;
        this.f23355h = i8;
        this.f23361n = false;
        this.f23362o = false;
        this.f23363p = false;
        this.f23364q = false;
        this.f23365r = 0L;
        this.f23367t = new AtomicLong(-1L);
        this.f23366s = null;
        this.f23356i = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbR)).booleanValue();
        zzf(interfaceC4279sE0);
    }

    private final boolean e() {
        if (!this.f23356i) {
            return false;
        }
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzer)).booleanValue() || this.f23363p) {
            return ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzes)).booleanValue() && !this.f23364q;
        }
        return true;
    }

    final /* synthetic */ Long d() {
        return Long.valueOf(G1.u.zzc().zza(this.f23360m));
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0, com.google.android.gms.internal.ads.UL0
    public final int zza(byte[] bArr, int i8, int i9) throws IOException {
        if (!this.f23358k) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f23357j;
        int iZza = inputStream != null ? inputStream.read(bArr, i8, i9) : this.f23353f.zza(bArr, i8, i9);
        if (!this.f23356i || this.f23357j != null) {
            zzg(iZza);
        }
        return iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01eb  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.NB0 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4695vv.zzb(com.google.android.gms.internal.ads.NB0):long");
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final Uri zzc() {
        return this.f23359l;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final void zzd() throws IOException {
        if (!this.f23358k) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f23358k = false;
        this.f23359l = null;
        boolean z8 = (this.f23356i && this.f23357j == null) ? false : true;
        InputStream inputStream = this.f23357j;
        if (inputStream != null) {
            o2.l.closeQuietly(inputStream);
            this.f23357j = null;
        } else {
            this.f23353f.zzd();
        }
        if (z8) {
            a();
        }
    }

    public final long zzk() {
        return this.f23365r;
    }

    public final long zzl() {
        if (this.f23360m != null) {
            if (this.f23367t.get() != -1) {
                return this.f23367t.get();
            }
            synchronized (this) {
                try {
                    if (this.f23366s == null) {
                        this.f23366s = AbstractC4805wt.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.uv
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.zza.d();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f23366s.isDone()) {
                try {
                    this.f23367t.compareAndSet(-1L, ((Long) this.f23366s.get()).longValue());
                    return this.f23367t.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    public final boolean zzn() {
        return this.f23361n;
    }

    public final boolean zzo() {
        return this.f23364q;
    }

    public final boolean zzp() {
        return this.f23363p;
    }

    public final boolean zzq() {
        return this.f23362o;
    }
}
