package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2833fc extends AbstractCallableC4657vc {

    /* renamed from: i, reason: collision with root package name */
    private final C4655vb f19215i;

    public C2833fc(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9, C4655vb c4655vb) {
        super(c1294Eb, "QcEEfK1PwFv2Eb+NZQ+4kWKAUUVvycYqoBzmAjBexJV/sKEjaFlajeD5MAZYWXy5", "361aY1ErIwpwsXwpamiiDSCpkl/IcdBM93dd8sW9a/Y=", c3357k9, i8, 94);
        this.f19215i = c4655vb;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        int iIntValue = ((Integer) this.f23266f.invoke(null, this.f19215i.zza())).intValue();
        synchronized (this.f23265e) {
            this.f23265e.zzD(D9.zzb(iIntValue));
        }
    }
}
