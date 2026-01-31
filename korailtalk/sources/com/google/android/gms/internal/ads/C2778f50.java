package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.f50, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2778f50 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final String f19128a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19129b;

    public C2778f50(String str, String str2) {
        this.f19128a = str;
        this.f19129b = str2;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhf)).booleanValue()) {
            bundle.putString("request_id", this.f19129b);
        } else {
            bundle.putString("request_id", this.f19128a);
        }
    }
}
