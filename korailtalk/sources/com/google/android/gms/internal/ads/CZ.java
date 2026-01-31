package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class CZ implements InterfaceC3397kX {

    /* renamed from: a, reason: collision with root package name */
    private final Map f12543a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final C5098zP f12544b;

    public CZ(C5098zP c5098zP) {
        this.f12544b = c5098zP;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3397kX
    public final C3511lX zza(String str, JSONObject jSONObject) {
        C3511lX c3511lX;
        synchronized (this) {
            try {
                c3511lX = (C3511lX) this.f12543a.get(str);
                if (c3511lX == null) {
                    c3511lX = new C3511lX(this.f12544b.zzc(str, jSONObject), new BinderC3057hY(), str);
                    this.f12543a.put(str, c3511lX);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3511lX;
    }
}
