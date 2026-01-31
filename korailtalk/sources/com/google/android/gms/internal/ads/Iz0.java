package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Iz0 extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    private static final Iz0 f13555b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f13556a;

    static {
        Iz0 iz0 = new Iz0();
        f13555b = iz0;
        iz0.f13556a = false;
    }

    private Iz0() {
        this.f13556a = true;
    }

    private static int a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC2650dz0) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = AbstractC3793nz0.zzd;
        int length = bArr.length;
        int iA = AbstractC3793nz0.a(length, bArr, 0, length);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    private final void b() {
        if (!this.f13556a) {
            throw new UnsupportedOperationException();
        }
    }

    public static Iz0 zza() {
        return f13555b;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iA = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iA += a(entry.getValue()) ^ a(entry.getKey());
        }
        return iA;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        byte[] bArr = AbstractC3793nz0.zzd;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        b();
        for (Object obj : map.keySet()) {
            byte[] bArr = AbstractC3793nz0.zzd;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        return super.remove(obj);
    }

    public final Iz0 zzb() {
        return isEmpty() ? new Iz0() : new Iz0(this);
    }

    public final void zzc() {
        this.f13556a = false;
    }

    public final void zzd(Iz0 iz0) {
        b();
        if (iz0.isEmpty()) {
            return;
        }
        putAll(iz0);
    }

    public final boolean zze() {
        return this.f13556a;
    }

    private Iz0(Map map) {
        super(map);
        this.f13556a = true;
    }
}
