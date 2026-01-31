package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.oC0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3820oC0 implements InterfaceC3335jy0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21432a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3335jy0 f21433b;

    public C3820oC0(Context context) {
        C4050qD0 c4050qD0 = new C4050qD0();
        this.f21432a = context.getApplicationContext();
        this.f21433b = c4050qD0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335jy0
    public final /* bridge */ /* synthetic */ Ky0 zza() {
        return new PC0(this.f21432a, ((C4050qD0) this.f21433b).zza());
    }
}
