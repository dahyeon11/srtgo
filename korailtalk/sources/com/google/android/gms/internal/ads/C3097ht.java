package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ht, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3097ht extends K1.B {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3666mt f19856c;

    C3097ht(C3666mt c3666mt) {
        this.f19856c = c3666mt;
    }

    @Override // K1.B
    public final void zza() {
        C3666mt c3666mt = this.f19856c;
        C4781wh c4781wh = new C4781wh(c3666mt.f21020e, c3666mt.f21021f.afmaVersion);
        synchronized (this.f19856c.f21016a) {
            try {
                G1.u.zze();
                C5123zh.zza(this.f19856c.f21023h, c4781wh);
            } catch (IllegalArgumentException e8) {
                L1.n.zzk("Cannot config CSI reporter.", e8);
            }
        }
    }
}
