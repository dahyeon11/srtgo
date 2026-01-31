package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2323b7 implements U6 {

    /* renamed from: a, reason: collision with root package name */
    private final C1755Pg0 f18089a = new C1755Pg0(new byte[4], 4);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2552d7 f18090b;

    public C2323b7(C2552d7 c2552d7) {
        this.f18090b = c2552d7;
    }

    @Override // com.google.android.gms.internal.ads.U6
    public final void zza(C4099qh0 c4099qh0) {
        if (c4099qh0.zzm() == 0 && (c4099qh0.zzm() & 128) != 0) {
            c4099qh0.zzL(6);
            int iZzb = c4099qh0.zzb() / 4;
            for (int i8 = 0; i8 < iZzb; i8++) {
                c4099qh0.zzF(this.f18089a, 4);
                C1755Pg0 c1755Pg0 = this.f18089a;
                int iZzd = c1755Pg0.zzd(16);
                c1755Pg0.zzm(3);
                if (iZzd == 0) {
                    this.f18089a.zzm(13);
                } else {
                    int iZzd2 = this.f18089a.zzd(13);
                    if (this.f18090b.f18523f.get(iZzd2) == null) {
                        C2552d7 c2552d7 = this.f18090b;
                        c2552d7.f18523f.put(iZzd2, new V6(new C2437c7(c2552d7, iZzd2)));
                        this.f18090b.f18529l++;
                    }
                }
            }
            this.f18090b.f18523f.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.U6
    public final void zzb(C2132Yk0 c2132Yk0, InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
    }
}
