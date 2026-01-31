package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ac, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2260ac extends AbstractCallableC4657vc {

    /* renamed from: i, reason: collision with root package name */
    private final C1335Fb f17993i;

    public C2260ac(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9, C1335Fb c1335Fb) {
        super(c1294Eb, "ZdMwT5n8r4APV4u4GhQlb1VCwOIVHkTm7kF7LnArEpyZnsv+C3G3q6fVFgtTcqcc", "O+vmm8flr2e7ZrTWUx/T8ClWwcEwLlJlfjM8sMGjZbg=", c3357k9, i8, 85);
        this.f17993i = c1335Fb;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        long[] jArr = (long[]) this.f23266f.invoke(null, Long.valueOf(this.f17993i.zzd()), Long.valueOf(this.f17993i.zzh()), Long.valueOf(this.f17993i.zzb()), Long.valueOf(this.f17993i.zzf()));
        synchronized (this.f23265e) {
            this.f23265e.zzx(jArr[0]);
            this.f23265e.zzw(jArr[1]);
        }
    }
}
