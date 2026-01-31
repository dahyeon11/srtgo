package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Wf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2040Wf0 extends AbstractC1917Tf0 {

    /* renamed from: a, reason: collision with root package name */
    private String f17038a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17039b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17040c;

    /* renamed from: d, reason: collision with root package name */
    private byte f17041d;

    C2040Wf0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1917Tf0
    public final AbstractC1917Tf0 zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.f17038a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1917Tf0
    public final AbstractC1917Tf0 zzb(boolean z8) {
        this.f17040c = true;
        this.f17041d = (byte) (this.f17041d | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1917Tf0
    public final AbstractC1917Tf0 zzc(boolean z8) {
        this.f17039b = z8;
        this.f17041d = (byte) (this.f17041d | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1917Tf0
    public final AbstractC1958Uf0 zzd() {
        String str;
        if (this.f17041d == 3 && (str = this.f17038a) != null) {
            return new C2122Yf0(str, this.f17039b, this.f17040c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f17038a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f17041d & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f17041d & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
