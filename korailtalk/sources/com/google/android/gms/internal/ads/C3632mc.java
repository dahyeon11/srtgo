package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3632mc extends AbstractCallableC4657vc {

    /* renamed from: i, reason: collision with root package name */
    private final boolean f20946i;

    public C3632mc(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9) {
        super(c1294Eb, "vvYcBqgI4aoC3GZZ7n1bdLp71k52s6EJLh0/nA6ME39LmvOZf3TBZ+H4xg1YfQXg", "6jGSPrUM0+2YrTO2vsTOKq3+XL/IfUFs5oxZaSEvsQg=", c3357k9, i8, 61);
        this.f20946i = c1294Eb.zzs();
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        long jLongValue = ((Long) this.f23266f.invoke(null, this.f23262b.zzb(), Boolean.valueOf(this.f20946i))).longValue();
        synchronized (this.f23265e) {
            this.f23265e.zzK(jLongValue);
        }
    }
}
