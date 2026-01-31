package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.gs0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2981gs0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f19440c = Logger.getLogger(C2981gs0.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final C2981gs0 f19441d = new C2981gs0();

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f19442a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f19443b = new ConcurrentHashMap();

    private final synchronized InterfaceC1157Ao0 a(String str) {
        if (!this.f19442a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (InterfaceC1157Ao0) this.f19442a.get(str);
    }

    private final synchronized void b(InterfaceC1157Ao0 interfaceC1157Ao0, boolean z8, boolean z9) {
        try {
            String str = ((C4007ps0) interfaceC1157Ao0).f21815a;
            if (this.f19443b.containsKey(str) && !((Boolean) this.f19443b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            InterfaceC1157Ao0 interfaceC1157Ao02 = (InterfaceC1157Ao0) this.f19442a.get(str);
            if (interfaceC1157Ao02 != null && !interfaceC1157Ao02.getClass().equals(interfaceC1157Ao0.getClass())) {
                f19440c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, interfaceC1157Ao02.getClass().getName(), interfaceC1157Ao0.getClass().getName()));
            }
            this.f19442a.putIfAbsent(str, interfaceC1157Ao0);
            this.f19443b.put(str, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static C2981gs0 zzc() {
        return f19441d;
    }

    public final InterfaceC1157Ao0 zza(String str, Class cls) throws GeneralSecurityException {
        InterfaceC1157Ao0 interfaceC1157Ao0A = a(str);
        if (interfaceC1157Ao0A.zzb().equals(cls)) {
            return interfaceC1157Ao0A;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(interfaceC1157Ao0A.getClass()) + ", which only supports: " + interfaceC1157Ao0A.zzb().toString());
    }

    public final InterfaceC1157Ao0 zzb(String str) {
        return a(str);
    }

    public final synchronized void zzd(InterfaceC1157Ao0 interfaceC1157Ao0, boolean z8) {
        zzf(interfaceC1157Ao0, 1, true);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.f19443b.get(str)).booleanValue();
    }

    public final synchronized void zzf(InterfaceC1157Ao0 interfaceC1157Ao0, int i8, boolean z8) {
        if (!Zr0.zza(i8)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        b(interfaceC1157Ao0, false, true);
    }
}
