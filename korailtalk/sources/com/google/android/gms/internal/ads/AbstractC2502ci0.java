package com.google.android.gms.internal.ads;

import I2.AbstractC0608l;
import I2.C0598b;
import I2.InterfaceC0602f;

/* renamed from: com.google.android.gms.internal.ads.ci0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2502ci0 {
    public static com.google.common.util.concurrent.C zza(AbstractC0608l abstractC0608l, C0598b c0598b) {
        final C2388bi0 c2388bi0 = new C2388bi0(abstractC0608l, null);
        abstractC0608l.addOnCompleteListener(AbstractC2285ao0.zzb(), new InterfaceC0602f() { // from class: com.google.android.gms.internal.ads.ai0
            @Override // I2.InterfaceC0602f
            public final void onComplete(AbstractC0608l abstractC0608l2) {
                C2388bi0 c2388bi02 = c2388bi0;
                if (abstractC0608l2.isCanceled()) {
                    c2388bi02.cancel(false);
                    return;
                }
                if (abstractC0608l2.isSuccessful()) {
                    c2388bi02.zzc(abstractC0608l2.getResult());
                    return;
                }
                Exception exception = abstractC0608l2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                c2388bi02.zzd(exception);
            }
        });
        return c2388bi0;
    }
}
