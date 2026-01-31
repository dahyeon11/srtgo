package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import i2.AbstractC5670c;

/* renamed from: com.google.android.gms.internal.ads.yq */
/* loaded from: classes2.dex */
public final class C5027yq extends G1.c {
    public C5027yq(Context context, Looper looper, AbstractC5670c.a aVar, AbstractC5670c.b bVar) {
        super(AbstractC3890or.zza(context), looper, 8, aVar, bVar, null);
    }

    @Override // i2.AbstractC5670c
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1610Lq ? (InterfaceC1610Lq) iInterfaceQueryLocalInterface : new C1528Jq(iBinder);
    }

    @Override // i2.AbstractC5670c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }

    @Override // i2.AbstractC5670c
    protected final String h() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public final InterfaceC1610Lq zzp() {
        return (InterfaceC1610Lq) super.getService();
    }
}
