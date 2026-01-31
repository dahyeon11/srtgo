package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Wi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2045Wi extends B1.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2004Vi f17058a;

    /* renamed from: b, reason: collision with root package name */
    private final List f17059b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private String f17060c;

    public C2045Wi(InterfaceC2004Vi interfaceC2004Vi) {
        IBinder iBinder;
        this.f17058a = interfaceC2004Vi;
        try {
            this.f17060c = interfaceC2004Vi.zzg();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            this.f17060c = "";
        }
        try {
            for (Object obj : interfaceC2004Vi.zzh()) {
                InterfaceC2503cj c2274aj = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    c2274aj = iInterfaceQueryLocalInterface instanceof InterfaceC2503cj ? (InterfaceC2503cj) iInterfaceQueryLocalInterface : new C2274aj(iBinder);
                }
                if (c2274aj != null) {
                    this.f17059b.add(new C2618dj(c2274aj));
                }
            }
        } catch (RemoteException e9) {
            L1.n.zzh("", e9);
        }
    }

    @Override // B1.c
    public final List<B1.d> getImages() {
        return this.f17059b;
    }

    @Override // B1.c
    public final CharSequence getText() {
        return this.f17060c;
    }
}
