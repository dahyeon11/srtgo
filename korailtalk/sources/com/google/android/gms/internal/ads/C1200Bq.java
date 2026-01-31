package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import i2.AbstractC5670c;

/* renamed from: com.google.android.gms.internal.ads.Bq */
/* loaded from: classes2.dex */
public final class C1200Bq extends AbstractC5670c {
    /* JADX WARN: Illegal instructions before constructor call */
    public C1200Bq(Context context, Looper looper, AbstractC5670c.a aVar, AbstractC5670c.b bVar) {
        Context applicationContext = context.getApplicationContext();
        super(applicationContext != null ? applicationContext : context, looper, 8, aVar, bVar, null);
    }

    @Override // i2.AbstractC5670c
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1773Pq ? (InterfaceC1773Pq) iInterfaceQueryLocalInterface : new C1691Nq(iBinder);
    }

    @Override // i2.AbstractC5670c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.ADS";
    }

    @Override // i2.AbstractC5670c
    protected final String h() {
        return "com.google.android.gms.ads.internal.request.IAdsService";
    }

    public final InterfaceC1773Pq zzp() {
        return (InterfaceC1773Pq) super.getService();
    }
}
