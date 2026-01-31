package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.xl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4904xl0 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private transient Set f23784a;

    /* renamed from: b, reason: collision with root package name */
    private transient Set f23785b;

    /* renamed from: c, reason: collision with root package name */
    private transient Collection f23786c;

    AbstractC4904xl0() {
    }

    abstract Set a();

    Set b() {
        return new C4676vl0(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f23784a;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f23784a = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f23785b;
        if (set != null) {
            return set;
        }
        Set setB = b();
        this.f23785b = setB;
        return setB;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f23786c;
        if (collection != null) {
            return collection;
        }
        C4790wl0 c4790wl0 = new C4790wl0(this);
        this.f23786c = c4790wl0;
        return c4790wl0;
    }
}
