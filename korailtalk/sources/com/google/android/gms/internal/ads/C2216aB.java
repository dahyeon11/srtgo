package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.aB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2216aB {

    /* renamed from: a, reason: collision with root package name */
    private final String f17914a;

    /* renamed from: b, reason: collision with root package name */
    private final C1236Cn f17915b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f17916c;

    /* renamed from: d, reason: collision with root package name */
    private C2904gB f17917d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2278al f17918e = new XA(this);

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC2278al f17919f = new ZA(this);

    public C2216aB(String str, C1236Cn c1236Cn, Executor executor) {
        this.f17914a = str;
        this.f17915b = c1236Cn;
        this.f17916c = executor;
    }

    static /* bridge */ /* synthetic */ boolean c(C2216aB c2216aB, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(c2216aB.f17914a);
    }

    public final void zzc(C2904gB c2904gB) {
        this.f17915b.zzb("/updateActiveView", this.f17918e);
        this.f17915b.zzb("/untrackActiveViewUnit", this.f17919f);
        this.f17917d = c2904gB;
    }

    public final void zzd(InterfaceC2065Wv interfaceC2065Wv) {
        interfaceC2065Wv.zzag("/updateActiveView", this.f17918e);
        interfaceC2065Wv.zzag("/untrackActiveViewUnit", this.f17919f);
    }

    public final void zze() {
        this.f17915b.zzc("/updateActiveView", this.f17918e);
        this.f17915b.zzc("/untrackActiveViewUnit", this.f17919f);
    }

    public final void zzf(InterfaceC2065Wv interfaceC2065Wv) {
        interfaceC2065Wv.zzaz("/updateActiveView", this.f17918e);
        interfaceC2065Wv.zzaz("/untrackActiveViewUnit", this.f17919f);
    }
}
