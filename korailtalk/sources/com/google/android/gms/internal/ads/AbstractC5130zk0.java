package com.google.android.gms.internal.ads;

import java.util.Collection;

/* renamed from: com.google.android.gms.internal.ads.zk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5130zk0 {
    static boolean a(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
