package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.v50, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4603v50 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final String f23169a;

    public C4603v50(String str) {
        this.f23169a = str;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.f23169a)) {
            return;
        }
        bundle.putString("query_info", this.f23169a);
    }
}
