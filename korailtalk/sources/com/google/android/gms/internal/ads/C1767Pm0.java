package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Pm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1767Pm0 extends AbstractC1522Jm0 {
    /* synthetic */ C1767Pm0(AbstractC2054Wm0 abstractC2054Wm0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final C1644Mm0 a(AbstractC1972Um0 abstractC1972Um0, C1644Mm0 c1644Mm0) {
        C1644Mm0 c1644Mm02;
        synchronized (abstractC1972Um0) {
            try {
                c1644Mm02 = abstractC1972Um0.f16723b;
                if (c1644Mm02 != c1644Mm0) {
                    abstractC1972Um0.f16723b = c1644Mm0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1644Mm02;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final C1931Tm0 b(AbstractC1972Um0 abstractC1972Um0, C1931Tm0 c1931Tm0) {
        C1931Tm0 c1931Tm02;
        synchronized (abstractC1972Um0) {
            try {
                c1931Tm02 = abstractC1972Um0.f16724c;
                if (c1931Tm02 != c1931Tm0) {
                    abstractC1972Um0.f16724c = c1931Tm0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1931Tm02;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final void c(C1931Tm0 c1931Tm0, C1931Tm0 c1931Tm02) {
        c1931Tm0.f16521b = c1931Tm02;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final void d(C1931Tm0 c1931Tm0, Thread thread) {
        c1931Tm0.f16520a = thread;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final boolean e(AbstractC1972Um0 abstractC1972Um0, C1644Mm0 c1644Mm0, C1644Mm0 c1644Mm02) {
        synchronized (abstractC1972Um0) {
            try {
                if (abstractC1972Um0.f16723b != c1644Mm0) {
                    return false;
                }
                abstractC1972Um0.f16723b = c1644Mm02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final boolean f(AbstractC1972Um0 abstractC1972Um0, Object obj, Object obj2) {
        synchronized (abstractC1972Um0) {
            try {
                if (abstractC1972Um0.f16722a != obj) {
                    return false;
                }
                abstractC1972Um0.f16722a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1522Jm0
    final boolean g(AbstractC1972Um0 abstractC1972Um0, C1931Tm0 c1931Tm0, C1931Tm0 c1931Tm02) {
        synchronized (abstractC1972Um0) {
            try {
                if (abstractC1972Um0.f16724c != c1931Tm0) {
                    return false;
                }
                abstractC1972Um0.f16724c = c1931Tm02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
