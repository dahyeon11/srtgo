package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;

/* renamed from: com.google.android.gms.internal.ads.cm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2510cm0 extends AbstractSet {
    AbstractC2510cm0() {
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return AbstractC2854fm0.c(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
