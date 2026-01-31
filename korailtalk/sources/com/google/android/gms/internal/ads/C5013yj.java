package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import y1.C6514A;

/* renamed from: com.google.android.gms.internal.ads.yj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5013yj {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4899xj f24007a;

    /* renamed from: b, reason: collision with root package name */
    private final B1.b f24008b;

    /* renamed from: c, reason: collision with root package name */
    private final C6514A f24009c = new C6514A();

    public C5013yj(InterfaceC4899xj interfaceC4899xj) {
        Context context;
        this.f24007a = interfaceC4899xj;
        B1.b bVar = null;
        try {
            context = (Context) r2.b.unwrap(interfaceC4899xj.zzh());
        } catch (RemoteException | NullPointerException e8) {
            L1.n.zzh("", e8);
            context = null;
        }
        if (context != null) {
            B1.b bVar2 = new B1.b(context);
            try {
                if (true == this.f24007a.zzs(r2.b.wrap(bVar2))) {
                    bVar = bVar2;
                }
            } catch (RemoteException e9) {
                L1.n.zzh("", e9);
            }
        }
        this.f24008b = bVar;
    }

    public final InterfaceC4899xj zza() {
        return this.f24007a;
    }

    public final String zzb() {
        try {
            return this.f24007a.zzi();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }
}
