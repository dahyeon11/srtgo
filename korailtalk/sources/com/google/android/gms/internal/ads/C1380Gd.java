package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.Gd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1380Gd implements Comparator {
    public C1380Gd(C1421Hd c1421Hd) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C4773wd c4773wd = (C4773wd) obj;
        C4773wd c4773wd2 = (C4773wd) obj2;
        if (c4773wd.d() < c4773wd2.d()) {
            return -1;
        }
        if (c4773wd.d() <= c4773wd2.d()) {
            if (c4773wd.b() < c4773wd2.b()) {
                return -1;
            }
            if (c4773wd.b() <= c4773wd2.b()) {
                float fA = (c4773wd.a() - c4773wd.d()) * (c4773wd.c() - c4773wd.b());
                float fA2 = (c4773wd2.a() - c4773wd2.d()) * (c4773wd2.c() - c4773wd2.b());
                if (fA > fA2) {
                    return -1;
                }
                if (fA >= fA2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
