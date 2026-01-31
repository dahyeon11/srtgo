package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bA0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2330bA0 implements Mz0 {

    /* renamed from: a, reason: collision with root package name */
    private final Pz0 f18095a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18096b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f18097c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18098d;

    C2330bA0(Pz0 pz0, String str, Object[] objArr) {
        this.f18095a = pz0;
        this.f18096b = str;
        this.f18097c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f18098d = cCharAt;
            return;
        }
        int i8 = cCharAt & 8191;
        int i9 = 1;
        int i10 = 13;
        while (true) {
            int i11 = i9 + 1;
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 55296) {
                this.f18098d = i8 | (cCharAt2 << i10);
                return;
            } else {
                i8 |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i9 = i11;
            }
        }
    }

    final String a() {
        return this.f18096b;
    }

    final Object[] b() {
        return this.f18097c;
    }

    @Override // com.google.android.gms.internal.ads.Mz0
    public final Pz0 zza() {
        return this.f18095a;
    }

    @Override // com.google.android.gms.internal.ads.Mz0
    public final boolean zzb() {
        return (this.f18098d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.Mz0
    public final int zzc() {
        int i8 = this.f18098d;
        if ((i8 & 1) != 0) {
            return 1;
        }
        return (i8 & 4) == 4 ? 3 : 2;
    }
}
