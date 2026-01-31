package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3074hh0 extends AbstractC3871oh0 {

    /* renamed from: a, reason: collision with root package name */
    private String f19835a;

    /* renamed from: b, reason: collision with root package name */
    private byte f19836b;

    /* renamed from: c, reason: collision with root package name */
    private int f19837c;

    C3074hh0() {
    }

    public final AbstractC3871oh0 zza(String str) {
        this.f19835a = "";
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3871oh0
    public final AbstractC3871oh0 zzb(boolean z8) {
        this.f19836b = (byte) (this.f19836b | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3871oh0
    public final AbstractC3871oh0 zzc(boolean z8) {
        this.f19836b = (byte) (this.f19836b | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3871oh0
    public final AbstractC3985ph0 zzd() {
        if (this.f19836b == 3 && this.f19835a != null && this.f19837c != 0) {
            return new C3301jh0(this.f19835a, false, false, null, null, this.f19837c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f19835a == null) {
            sb.append(" fileOwner");
        }
        if ((this.f19836b & 1) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if ((this.f19836b & 2) == 0) {
            sb.append(" skipChecks");
        }
        if (this.f19837c == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3871oh0
    public final AbstractC3871oh0 zze(int i8) {
        this.f19837c = 1;
        return this;
    }
}
