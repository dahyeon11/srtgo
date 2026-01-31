package com.google.android.gms.internal.ads;

import com.korail.talk.network.dao.research.CmtrInfoDao;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.Sm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1890Sm0 extends AbstractC1522Jm0 {

    /* renamed from: a, reason: collision with root package name */
    static final Unsafe f16337a;

    /* renamed from: b, reason: collision with root package name */
    static final long f16338b;

    /* renamed from: c, reason: collision with root package name */
    static final long f16339c;

    /* renamed from: d, reason: collision with root package name */
    static final long f16340d;

    /* renamed from: e, reason: collision with root package name */
    static final long f16341e;

    /* renamed from: f, reason: collision with root package name */
    static final long f16342f;

    /* renamed from: com.google.android.gms.internal.ads.Sm0$a */
    class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Object run() throws IllegalAccessException, SecurityException, IllegalArgumentException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f16339c = unsafe.objectFieldOffset(AbstractC1972Um0.class.getDeclaredField(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C));
                f16338b = unsafe.objectFieldOffset(AbstractC1972Um0.class.getDeclaredField(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B));
                f16340d = unsafe.objectFieldOffset(AbstractC1972Um0.class.getDeclaredField(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A));
                f16341e = unsafe.objectFieldOffset(C1931Tm0.class.getDeclaredField(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A));
                f16342f = unsafe.objectFieldOffset(C1931Tm0.class.getDeclaredField(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B));
                f16337a = unsafe;
            } catch (NoSuchFieldException e8) {
                throw new RuntimeException(e8);
            }
        } catch (PrivilegedActionException e9) {
            throw new RuntimeException("Could not initialize intrinsics", e9.getCause());
        }
    }

    /* synthetic */ C1890Sm0(AbstractC2177Zm0 abstractC2177Zm0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final C1644Mm0 a(AbstractC1972Um0 abstractC1972Um0, C1644Mm0 c1644Mm0) {
        C1644Mm0 c1644Mm02;
        do {
            c1644Mm02 = abstractC1972Um0.f16723b;
            if (c1644Mm0 == c1644Mm02) {
                break;
            }
        } while (!e(abstractC1972Um0, c1644Mm02, c1644Mm0));
        return c1644Mm02;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final C1931Tm0 b(AbstractC1972Um0 abstractC1972Um0, C1931Tm0 c1931Tm0) {
        C1931Tm0 c1931Tm02;
        do {
            c1931Tm02 = abstractC1972Um0.f16724c;
            if (c1931Tm0 == c1931Tm02) {
                break;
            }
        } while (!g(abstractC1972Um0, c1931Tm02, c1931Tm0));
        return c1931Tm02;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final void c(C1931Tm0 c1931Tm0, C1931Tm0 c1931Tm02) {
        f16337a.putObject(c1931Tm0, f16342f, c1931Tm02);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final void d(C1931Tm0 c1931Tm0, Thread thread) {
        f16337a.putObject(c1931Tm0, f16341e, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final boolean e(AbstractC1972Um0 abstractC1972Um0, C1644Mm0 c1644Mm0, C1644Mm0 c1644Mm02) {
        return AbstractC2136Ym0.zza(f16337a, abstractC1972Um0, f16338b, c1644Mm0, c1644Mm02);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final boolean f(AbstractC1972Um0 abstractC1972Um0, Object obj, Object obj2) {
        return AbstractC2136Ym0.zza(f16337a, abstractC1972Um0, f16340d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final boolean g(AbstractC1972Um0 abstractC1972Um0, C1931Tm0 c1931Tm0, C1931Tm0 c1931Tm02) {
        return AbstractC2136Ym0.zza(f16337a, abstractC1972Um0, f16339c, c1931Tm0, c1931Tm02);
    }
}
