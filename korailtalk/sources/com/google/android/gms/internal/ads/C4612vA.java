package com.google.android.gms.internal.ads;

import Q7.C0709m;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.vA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4612vA implements InterfaceC2069Wz {

    /* renamed from: a, reason: collision with root package name */
    private final C3734nS f23180a;

    C4612vA(C3734nS c3734nS) {
        this.f23180a = c3734nS;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069Wz
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f23180a.zzo(str.equals(C0709m.TRUE));
    }
}
