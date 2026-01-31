package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Vb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1991Vb0 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f16872a = new HashMap();

    public final C1950Ub0 zza(EnumC1582Lb0 enumC1582Lb0, Context context, C1213Cb0 c1213Cb0, InterfaceC2376bc0 interfaceC2376bc0) {
        C1950Ub0 c1950Ub0 = (C1950Ub0) this.f16872a.get(enumC1582Lb0);
        if (c1950Ub0 != null) {
            return c1950Ub0;
        }
        C1459Ib0 c1459Ib0 = new C1459Ib0(C1704Ob0.zza(enumC1582Lb0, context));
        C1950Ub0 c1950Ub02 = new C1950Ub0(c1459Ib0, new C2605dc0(c1459Ib0, c1213Cb0, interfaceC2376bc0));
        this.f16872a.put(enumC1582Lb0, c1950Ub02);
        return c1950Ub02;
    }
}
