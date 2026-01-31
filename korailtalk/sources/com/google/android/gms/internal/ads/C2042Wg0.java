package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Wg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2042Wg0 {

    /* renamed from: g, reason: collision with root package name */
    private static final HashMap f17042g = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f17043a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2083Xg0 f17044b;

    /* renamed from: c, reason: collision with root package name */
    private final C1876Sf0 f17045c;

    /* renamed from: d, reason: collision with root package name */
    private final C1426Hf0 f17046d;

    /* renamed from: e, reason: collision with root package name */
    private C1551Kg0 f17047e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f17048f = new Object();

    public C2042Wg0(Context context, InterfaceC2083Xg0 interfaceC2083Xg0, C1876Sf0 c1876Sf0, C1426Hf0 c1426Hf0) {
        this.f17043a = context;
        this.f17044b = interfaceC2083Xg0;
        this.f17045c = c1876Sf0;
        this.f17046d = c1426Hf0;
    }

    private final synchronized Class a(C1592Lg0 c1592Lg0) {
        try {
            String strZzk = c1592Lg0.zza().zzk();
            HashMap map = f17042g;
            Class cls = (Class) map.get(strZzk);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.f17046d.zza(c1592Lg0.zzc())) {
                    throw new C2001Vg0(2026, "VM did not pass signature verification");
                }
                try {
                    File fileZzb = c1592Lg0.zzb();
                    if (!fileZzb.exists()) {
                        fileZzb.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(c1592Lg0.zzc().getAbsolutePath(), fileZzb.getAbsolutePath(), null, this.f17043a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strZzk, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e8) {
                    e = e8;
                    throw new C2001Vg0(2008, e);
                } catch (IllegalArgumentException e9) {
                    e = e9;
                    throw new C2001Vg0(2008, e);
                } catch (SecurityException e10) {
                    e = e10;
                    throw new C2001Vg0(2008, e);
                }
            } catch (GeneralSecurityException e11) {
                throw new C2001Vg0(2026, e11);
            }
        } finally {
        }
    }

    public final InterfaceC1999Vf0 zza() {
        C1551Kg0 c1551Kg0;
        synchronized (this.f17048f) {
            c1551Kg0 = this.f17047e;
        }
        return c1551Kg0;
    }

    public final C1592Lg0 zzb() {
        synchronized (this.f17048f) {
            try {
                C1551Kg0 c1551Kg0 = this.f17047e;
                if (c1551Kg0 == null) {
                    return null;
                }
                return c1551Kg0.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc(C1592Lg0 c1592Lg0) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException, C2001Vg0 {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                C1551Kg0 c1551Kg0 = new C1551Kg0(a(c1592Lg0).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f17043a, "msa-r", c1592Lg0.zze(), null, new Bundle(), 2), c1592Lg0, this.f17044b, this.f17045c);
                if (!c1551Kg0.b()) {
                    throw new C2001Vg0(4000, "init failed");
                }
                int iZze = c1551Kg0.zze();
                if (iZze != 0) {
                    throw new C2001Vg0(4001, "ci: " + iZze);
                }
                synchronized (this.f17048f) {
                    C1551Kg0 c1551Kg02 = this.f17047e;
                    if (c1551Kg02 != null) {
                        try {
                            c1551Kg02.zzg();
                        } catch (C2001Vg0 e8) {
                            this.f17045c.zzc(e8.zza(), -1L, e8);
                        }
                        this.f17047e = c1551Kg0;
                    } else {
                        this.f17047e = c1551Kg0;
                    }
                }
                this.f17045c.zzd(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e9) {
                throw new C2001Vg0(2004, e9);
            }
        } catch (C2001Vg0 e10) {
            this.f17045c.zzc(e10.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e10);
            return false;
        } catch (Exception e11) {
            this.f17045c.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e11);
            return false;
        }
    }
}
