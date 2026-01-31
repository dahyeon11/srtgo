package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tD0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4391tD0 extends AbstractC4961yD0 {

    /* renamed from: a, reason: collision with root package name */
    final String f22796a;

    public C4391tD0(String str) {
        this.f22796a = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4961yD0
    public final void zza(String str) {
        String str2 = this.f22796a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
    }
}
