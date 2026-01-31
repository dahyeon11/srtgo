package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xK0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4861xK0 {

    /* renamed from: a, reason: collision with root package name */
    private final NS[] f23687a;

    /* renamed from: b, reason: collision with root package name */
    private final VK0 f23688b;

    /* renamed from: c, reason: collision with root package name */
    private final C4191rU f23689c;

    public C4861xK0(NS... nsArr) {
        VK0 vk0 = new VK0();
        C4191rU c4191rU = new C4191rU();
        NS[] nsArr2 = {vk0, c4191rU};
        this.f23687a = nsArr2;
        System.arraycopy(nsArr, 0, nsArr2, 0, 0);
        this.f23688b = vk0;
        this.f23689c = c4191rU;
    }

    public final long zza(long j8) {
        return this.f23689c.zzi(j8);
    }

    public final long zzb() {
        return this.f23688b.zzo();
    }

    public final C2149Yx zzc(C2149Yx c2149Yx) {
        this.f23689c.zzk(c2149Yx.zzc);
        this.f23689c.zzj(c2149Yx.zzd);
        return c2149Yx;
    }

    public final boolean zzd(boolean z8) {
        this.f23688b.zzp(z8);
        return z8;
    }

    public final NS[] zze() {
        return this.f23687a;
    }
}
