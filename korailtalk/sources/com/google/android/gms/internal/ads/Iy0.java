package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Iy0 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile Iy0 f13551b;

    /* renamed from: c, reason: collision with root package name */
    static final Iy0 f13552c = new Iy0(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f13553a = Collections.emptyMap();

    Iy0(boolean z8) {
    }

    public static Iy0 zza() {
        return f13552c;
    }

    public static Iy0 zzb() {
        Iy0 iy0 = f13551b;
        if (iy0 != null) {
            return iy0;
        }
        synchronized (Iy0.class) {
            try {
                Iy0 iy02 = f13551b;
                if (iy02 != null) {
                    return iy02;
                }
                Iy0 iy0B = Ry0.b(Iy0.class);
                f13551b = iy0B;
                return iy0B;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Xy0 zzc(Pz0 pz0, int i8) {
        return (Xy0) this.f13553a.get(new Hy0(pz0, i8));
    }
}
