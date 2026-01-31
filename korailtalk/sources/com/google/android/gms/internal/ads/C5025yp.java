package com.google.android.gms.internal.ads;

import Q1.c;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.yp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5025yp extends c.a {

    /* renamed from: a, reason: collision with root package name */
    private final List f24013a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private String f24014b;

    public C5025yp(InterfaceC2004Vi interfaceC2004Vi) {
        try {
            this.f24014b = interfaceC2004Vi.zzg();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            this.f24014b = "";
        }
        try {
            for (Object obj : interfaceC2004Vi.zzh()) {
                InterfaceC2503cj interfaceC2503cjZzg = obj instanceof IBinder ? AbstractBinderC2389bj.zzg((IBinder) obj) : null;
                if (interfaceC2503cjZzg != null) {
                    this.f24013a.add(new C1158Ap(interfaceC2503cjZzg));
                }
            }
        } catch (RemoteException e9) {
            L1.n.zzh("", e9);
        }
    }

    @Override // Q1.c.a
    public final List<c.b> getImages() {
        return this.f24013a;
    }

    @Override // Q1.c.a
    public final CharSequence getText() {
        return this.f24014b;
    }
}
