package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Tu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1941Tu extends H8 {

    /* renamed from: c, reason: collision with root package name */
    static final C1941Tu f16540c = new C1941Tu();

    C1941Tu() {
    }

    @Override // com.google.android.gms.internal.ads.H8
    public final L8 zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new N8() : "mvhd".equals(str) ? new O8() : new P8(str);
    }
}
