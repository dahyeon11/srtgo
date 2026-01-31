package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4819x implements EO {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC1843Rj0 f23590a = AbstractC1966Uj0.zza(new InterfaceC1843Rj0() { // from class: com.google.android.gms.internal.ads.v
        @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
        public final Object zza() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                if (objInvoke != null) {
                    return (EO) objInvoke;
                }
                throw null;
            } catch (Exception e8) {
                throw new IllegalStateException(e8);
            }
        }
    });

    /* synthetic */ C4819x(AbstractC4705w abstractC4705w) {
    }
}
