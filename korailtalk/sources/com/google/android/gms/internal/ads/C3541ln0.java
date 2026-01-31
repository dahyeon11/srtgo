package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ln0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3541ln0 extends AbstractC3200in0 {
    /* synthetic */ C3541ln0(AbstractC3427kn0 abstractC3427kn0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3200in0
    final int a(AbstractC3655mn0 abstractC3655mn0) {
        int i8;
        synchronized (abstractC3655mn0) {
            i8 = abstractC3655mn0.f20984i - 1;
            abstractC3655mn0.f20984i = i8;
        }
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3200in0
    final void b(AbstractC3655mn0 abstractC3655mn0, Set set, Set set2) {
        synchronized (abstractC3655mn0) {
            try {
                if (abstractC3655mn0.f20983h == null) {
                    abstractC3655mn0.f20983h = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
