package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.pA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3929pA implements InterfaceC2069Wz {

    /* renamed from: a, reason: collision with root package name */
    private final C4540ua0 f21682a;

    public C3929pA(C4540ua0 c4540ua0) {
        this.f21682a = c4540ua0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069Wz
    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f21682a.zzb(Boolean.parseBoolean(str));
        } catch (Exception e8) {
            throw new IllegalStateException("Invalid render_in_browser state", e8);
        }
    }
}
