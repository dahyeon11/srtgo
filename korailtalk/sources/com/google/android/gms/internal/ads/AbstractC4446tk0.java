package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.tk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4446tk0 implements InterfaceC1151Al0 {

    /* renamed from: a, reason: collision with root package name */
    private transient Set f22910a;

    /* renamed from: b, reason: collision with root package name */
    private transient Collection f22911b;

    /* renamed from: c, reason: collision with root package name */
    private transient Map f22912c;

    AbstractC4446tk0() {
    }

    abstract Collection a();

    abstract Iterator b();

    abstract Map c();

    abstract Set d();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC1151Al0) {
            return zzs().equals(((InterfaceC1151Al0) obj).zzs());
        }
        return false;
    }

    public final int hashCode() {
        return zzs().hashCode();
    }

    public final String toString() {
        return zzs().toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1151Al0
    public abstract /* synthetic */ int zze();

    @Override // com.google.android.gms.internal.ads.InterfaceC1151Al0
    public abstract /* synthetic */ void zzp();

    @Override // com.google.android.gms.internal.ads.InterfaceC1151Al0
    public boolean zzq(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1151Al0
    public final Collection zzr() {
        Collection collection = this.f22911b;
        if (collection != null) {
            return collection;
        }
        Collection collectionA = a();
        this.f22911b = collectionA;
        return collectionA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1151Al0
    public final Map zzs() {
        Map map = this.f22912c;
        if (map != null) {
            return map;
        }
        Map mapC = c();
        this.f22912c = mapC;
        return mapC;
    }

    public final Set zzt() {
        Set set = this.f22910a;
        if (set != null) {
            return set;
        }
        Set setD = d();
        this.f22910a = setD;
        return setD;
    }
}
