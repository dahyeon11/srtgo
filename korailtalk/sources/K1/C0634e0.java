package K1;

import android.content.Context;

/* renamed from: K1.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0634e0 extends B {

    /* renamed from: c, reason: collision with root package name */
    private final L1.s f2808c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2809d;

    public C0634e0(Context context, String str, String str2) {
        this.f2808c = new L1.s(G1.u.zzp().zzc(context, str));
        this.f2809d = str2;
    }

    @Override // K1.B
    public final void zza() {
        this.f2808c.zza(this.f2809d);
    }
}
