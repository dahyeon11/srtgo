package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2948gc extends AbstractCallableC4657vc {

    /* renamed from: i, reason: collision with root package name */
    private final C2946gb f19377i;

    /* renamed from: j, reason: collision with root package name */
    private final long f19378j;

    /* renamed from: k, reason: collision with root package name */
    private final long f19379k;

    public C2948gc(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9, C2946gb c2946gb, long j8, long j9) {
        super(c1294Eb, "gAg/p/cQzJRjYz9LhE8cRk72DVV1Cpozf/TbzvACqLcTgM3sRjMEb3DCmwYhMmhP", "avDZD6/xoSbFYvWCy23XLncB75oD5DxKdrTKFY2O0hY=", c3357k9, i8, 11);
        this.f19377i = c2946gb;
        this.f19378j = j8;
        this.f19379k = j9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        C2946gb c2946gb = this.f19377i;
        if (c2946gb != null) {
            C2716eb c2716eb = new C2716eb((String) this.f23266f.invoke(null, c2946gb.zzb(), Long.valueOf(this.f19378j), Long.valueOf(this.f19379k)));
            synchronized (this.f23265e) {
                try {
                    this.f23265e.zzE(c2716eb.zza.longValue());
                    if (c2716eb.zzb.longValue() >= 0) {
                        this.f23265e.zzW(c2716eb.zzb.longValue());
                    }
                    if (c2716eb.zzc.longValue() >= 0) {
                        this.f23265e.zzg(c2716eb.zzc.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
