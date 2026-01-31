package com.google.android.gms.internal.ads;

import H1.C0525c1;
import H1.C0591z;
import android.content.Context;
import android.os.RemoteException;
import r2.InterfaceC6172a;
import y1.EnumC6522c;

/* renamed from: com.google.android.gms.internal.ads.jq */
/* loaded from: classes2.dex */
public final class C3318jq {

    /* renamed from: e */
    private static InterfaceC1939Ts f20314e;

    /* renamed from: a */
    private final Context f20315a;

    /* renamed from: b */
    private final EnumC6522c f20316b;

    /* renamed from: c */
    private final C0525c1 f20317c;

    /* renamed from: d */
    private final String f20318d;

    public C3318jq(Context context, EnumC6522c enumC6522c, C0525c1 c0525c1, String str) {
        this.f20315a = context;
        this.f20316b = enumC6522c;
        this.f20317c = c0525c1;
        this.f20318d = str;
    }

    public static InterfaceC1939Ts zza(Context context) {
        InterfaceC1939Ts interfaceC1939Ts;
        synchronized (C3318jq.class) {
            try {
                if (f20314e == null) {
                    f20314e = C0591z.zza().zzr(context, new BinderC1686Nn());
                }
                interfaceC1939Ts = f20314e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1939Ts;
    }

    public final void zzb(T1.b bVar) {
        H1.Y1 y1Zza;
        InterfaceC1939Ts interfaceC1939TsZza = zza(this.f20315a);
        if (interfaceC1939TsZza == null) {
            bVar.onFailure("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.f20315a;
        C0525c1 c0525c1 = this.f20317c;
        InterfaceC6172a interfaceC6172aWrap = r2.b.wrap(context);
        if (c0525c1 == null) {
            H1.Z1 z12 = new H1.Z1();
            z12.zzg(System.currentTimeMillis());
            y1Zza = z12.zza();
        } else {
            y1Zza = H1.c2.zza.zza(this.f20315a, c0525c1);
        }
        try {
            interfaceC1939TsZza.zzf(interfaceC6172aWrap, new C2103Xs(this.f20318d, this.f20316b.name(), null, y1Zza), new BinderC3205iq(this, bVar));
        } catch (RemoteException unused) {
            bVar.onFailure("Internal Error.");
        }
    }
}
