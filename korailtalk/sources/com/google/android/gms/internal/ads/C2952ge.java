package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import f2.C5394d;
import i2.AbstractC5670c;
import o2.AbstractC6030b;

/* renamed from: com.google.android.gms.internal.ads.ge */
/* loaded from: classes2.dex */
public final class C2952ge extends G1.c {
    C2952ge(Context context, Looper looper, AbstractC5670c.a aVar, AbstractC5670c.b bVar) {
        super(AbstractC3890or.zza(context), looper, 123, aVar, bVar, null);
    }

    @Override // i2.AbstractC5670c
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof C3408ke ? (C3408ke) iInterfaceQueryLocalInterface : new C3408ke(iBinder);
    }

    @Override // i2.AbstractC5670c
    public final C5394d[] getApiFeatures() {
        return y1.I.zzb;
    }

    @Override // i2.AbstractC5670c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    @Override // i2.AbstractC5670c
    protected final String h() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    public final boolean zzp() {
        return ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbR)).booleanValue() && AbstractC6030b.contains(getAvailableFeatures(), y1.I.zza);
    }

    public final C3408ke zzq() {
        return (C3408ke) super.getService();
    }
}
