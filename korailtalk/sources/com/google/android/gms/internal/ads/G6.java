package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class G6 implements InterfaceC4490u6 {

    /* renamed from: b, reason: collision with root package name */
    private K1 f13111b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13112c;

    /* renamed from: e, reason: collision with root package name */
    private int f13114e;

    /* renamed from: f, reason: collision with root package name */
    private int f13115f;

    /* renamed from: a, reason: collision with root package name */
    private final C4099qh0 f13110a = new C4099qh0(10);

    /* renamed from: d, reason: collision with root package name */
    private long f13113d = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zza(C4099qh0 c4099qh0) {
        F10.zzb(this.f13111b);
        if (this.f13112c) {
            int iZzb = c4099qh0.zzb();
            int i8 = this.f13115f;
            if (i8 < 10) {
                int iMin = Math.min(iZzb, 10 - i8);
                System.arraycopy(c4099qh0.zzM(), c4099qh0.zzd(), this.f13110a.zzM(), this.f13115f, iMin);
                if (this.f13115f + iMin == 10) {
                    this.f13110a.zzK(0);
                    if (this.f13110a.zzm() != 73 || this.f13110a.zzm() != 68 || this.f13110a.zzm() != 51) {
                        AbstractC2834fc0.zzf("Id3Reader", "Discarding invalid ID3 tag");
                        this.f13112c = false;
                        return;
                    } else {
                        this.f13110a.zzL(3);
                        this.f13114e = this.f13110a.zzl() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iZzb, this.f13114e - this.f13115f);
            this.f13111b.zzq(c4099qh0, iMin2);
            this.f13115f += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzb(InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
        c3011h7.zzc();
        K1 k1Zzw = interfaceC2769f1.zzw(c3011h7.zza(), 5);
        this.f13111b = k1Zzw;
        O4 o42 = new O4();
        o42.zzK(c3011h7.zzb());
        o42.zzX("application/id3");
        k1Zzw.zzl(o42.zzad());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzc() {
        int i8;
        F10.zzb(this.f13111b);
        if (this.f13112c && (i8 = this.f13114e) != 0 && this.f13115f == i8) {
            F10.zzf(this.f13113d != -9223372036854775807L);
            this.f13111b.zzs(this.f13113d, 1, this.f13114e, 0, null);
            this.f13112c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzd(long j8, int i8) {
        if ((i8 & 4) == 0) {
            return;
        }
        this.f13112c = true;
        this.f13113d = j8;
        this.f13114e = 0;
        this.f13115f = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zze() {
        this.f13112c = false;
        this.f13113d = -9223372036854775807L;
    }
}
