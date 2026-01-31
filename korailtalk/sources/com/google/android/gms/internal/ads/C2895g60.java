package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.g60, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2895g60 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    final String f19301a;

    /* renamed from: b, reason: collision with root package name */
    final int f19302b;

    /* synthetic */ C2895g60(String str, int i8, AbstractC2780f60 abstractC2780f60) {
        this.f19301a = str;
        this.f19302b = i8;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkt)).booleanValue()) {
            if (!TextUtils.isEmpty(this.f19301a)) {
                bundle.putString("topics", this.f19301a);
            }
            int i8 = this.f19302b;
            if (i8 != -1) {
                bundle.putInt("atps", i8);
            }
        }
    }
}
