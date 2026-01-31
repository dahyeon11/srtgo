package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.To0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1935To0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f16524a = Logger.getLogger(AbstractC1935To0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap f16525b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Set f16526c;
    public static final /* synthetic */ int zza = 0;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(InterfaceC3885oo0.class);
        hashSet.add(InterfaceC4682vo0.class);
        hashSet.add(InterfaceC2017Vo0.class);
        hashSet.add(InterfaceC4910xo0.class);
        hashSet.add(InterfaceC4796wo0.class);
        hashSet.add(InterfaceC1689No0.class);
        hashSet.add(Uu0.class);
        hashSet.add(InterfaceC1812Qo0.class);
        hashSet.add(InterfaceC1894So0.class);
        f16526c = Collections.unmodifiableSet(hashSet);
    }

    public static Class zza(Class cls) {
        try {
            return Gs0.zza().zzb(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object zzb(C3673mw0 c3673mw0, Class cls) {
        String strZzg = c3673mw0.zzg();
        return C2981gs0.zzc().zza(strZzg, cls).zzc(c3673mw0.zzf());
    }
}
