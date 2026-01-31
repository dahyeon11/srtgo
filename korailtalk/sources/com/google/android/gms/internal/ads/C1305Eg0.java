package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import i2.AbstractC5670c;

/* renamed from: com.google.android.gms.internal.ads.Eg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1305Eg0 extends G1.c {

    /* renamed from: E, reason: collision with root package name */
    private final int f12844E;

    public C1305Eg0(Context context, Looper looper, AbstractC5670c.a aVar, AbstractC5670c.b bVar, int i8) {
        super(context, looper, 116, aVar, bVar, null);
        this.f12844E = i8;
    }

    @Override // i2.AbstractC5670c
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof C1510Jg0 ? (C1510Jg0) iInterfaceQueryLocalInterface : new C1510Jg0(iBinder);
    }

    @Override // i2.AbstractC5670c, g2.C5539a.f
    public final int getMinApkVersion() {
        return this.f12844E;
    }

    @Override // i2.AbstractC5670c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }

    @Override // i2.AbstractC5670c
    protected final String h() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    public final C1510Jg0 zzp() {
        return (C1510Jg0) super.getService();
    }
}
