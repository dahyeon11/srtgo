package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import i2.AbstractC5670c;

/* renamed from: com.google.android.gms.internal.ads.Hl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1437Hl extends G1.c {
    C1437Hl(Context context, Looper looper, AbstractC5670c.a aVar, AbstractC5670c.b bVar) {
        super(AbstractC3890or.zza(context), looper, 166, aVar, bVar, null);
    }

    @Override // i2.AbstractC5670c
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return iInterfaceQueryLocalInterface instanceof C1764Pl ? (C1764Pl) iInterfaceQueryLocalInterface : new C1764Pl(iBinder);
    }

    @Override // i2.AbstractC5670c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    @Override // i2.AbstractC5670c
    protected final String h() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    public final C1764Pl zzp() {
        return (C1764Pl) super.getService();
    }
}
