package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4467tv implements InterfaceC2227aG0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2703eP0 f22945a = new C2703eP0(true, 65536);

    /* renamed from: b, reason: collision with root package name */
    private long f22946b = 15000000;

    /* renamed from: c, reason: collision with root package name */
    private long f22947c = 30000000;

    /* renamed from: d, reason: collision with root package name */
    private long f22948d = 2500000;

    /* renamed from: e, reason: collision with root package name */
    private long f22949e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    private int f22950f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22951g;

    C4467tv() {
    }

    final void a(boolean z8) {
        this.f22950f = 0;
        this.f22951g = false;
        if (z8) {
            this.f22945a.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2227aG0
    public final long zzb(C2577dJ0 c2577dJ0) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2227aG0
    public final void zzc(C2577dJ0 c2577dJ0) {
        a(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2227aG0
    public final void zzd(C2577dJ0 c2577dJ0) {
        a(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2227aG0
    public final void zze(C2577dJ0 c2577dJ0) {
        a(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2227aG0
    public final void zzf(C2577dJ0 c2577dJ0, RG rg, NM0 nm0, EG0[] eg0Arr, SN0 sn0, PO0[] po0Arr) {
        int i8 = 0;
        this.f22950f = 0;
        while (true) {
            int length = eg0Arr.length;
            if (i8 >= 2) {
                this.f22945a.zzf(this.f22950f);
                return;
            } else {
                if (po0Arr[i8] != null) {
                    this.f22950f += eg0Arr[i8].zzb() != 1 ? 131072000 : 13107200;
                }
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2227aG0
    public final boolean zzg(C2577dJ0 c2577dJ0) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2227aG0
    public final boolean zzh(C2577dJ0 c2577dJ0, RG rg, NM0 nm0, long j8, long j9, float f8) {
        boolean z8 = true;
        char c9 = j9 > this.f22947c ? (char) 0 : j9 < this.f22946b ? (char) 2 : (char) 1;
        int iZza = this.f22945a.zza();
        int i8 = this.f22950f;
        if (c9 != 2 && (c9 != 1 || !this.f22951g || iZza >= i8)) {
            z8 = false;
        }
        this.f22951g = z8;
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2227aG0
    public final boolean zzi(C2577dJ0 c2577dJ0, RG rg, NM0 nm0, long j8, float f8, boolean z8, long j9) {
        long j10 = z8 ? this.f22949e : this.f22948d;
        return j10 <= 0 || j8 >= j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2227aG0
    public final C2703eP0 zzj() {
        return this.f22945a;
    }

    public final synchronized void zzk(int i8) {
        this.f22948d = i8 * 1000;
    }

    public final synchronized void zzl(int i8) {
        this.f22949e = i8 * 1000;
    }

    public final synchronized void zzm(int i8) {
        this.f22947c = i8 * 1000;
    }

    public final synchronized void zzn(int i8) {
        this.f22946b = i8 * 1000;
    }
}
