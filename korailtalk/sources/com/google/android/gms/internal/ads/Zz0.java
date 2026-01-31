package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
final class Zz0 {

    /* renamed from: c */
    private static final Zz0 f17855c = new Zz0();

    /* renamed from: b */
    private final ConcurrentMap f17857b = new ConcurrentHashMap();

    /* renamed from: a */
    private final InterfaceC3588mA0 f17856a = new Hz0();

    private Zz0() {
    }

    public static Zz0 zza() {
        return f17855c;
    }

    public final InterfaceC3360kA0 zzb(Class cls) {
        AbstractC3793nz0.b(cls, "messageType");
        InterfaceC3360kA0 interfaceC3360kA0Zza = (InterfaceC3360kA0) this.f17857b.get(cls);
        if (interfaceC3360kA0Zza == null) {
            interfaceC3360kA0Zza = this.f17856a.zza(cls);
            AbstractC3793nz0.b(cls, "messageType");
            InterfaceC3360kA0 interfaceC3360kA0 = (InterfaceC3360kA0) this.f17857b.putIfAbsent(cls, interfaceC3360kA0Zza);
            if (interfaceC3360kA0 != null) {
                return interfaceC3360kA0;
            }
        }
        return interfaceC3360kA0Zza;
    }
}
