package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import r4.C6174a;

/* renamed from: com.google.android.gms.internal.ads.el0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2737el0 implements Map, Serializable {

    /* renamed from: a */
    private transient AbstractC2967gl0 f18811a;

    /* renamed from: b */
    private transient AbstractC2967gl0 f18812b;

    /* renamed from: c */
    private transient AbstractC2009Vk0 f18813c;

    AbstractC2737el0() {
    }

    public static AbstractC2737el0 zzc(Map map) {
        Set setEntrySet = map.entrySet();
        C2623dl0 c2623dl0 = new C2623dl0(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        c2623dl0.zzb(setEntrySet);
        return c2623dl0.zzc();
    }

    public static AbstractC2737el0 zzd() {
        return C1929Tl0.f16512g;
    }

    public static AbstractC2737el0 zze(Object obj, Object obj2) {
        AbstractC4560uk0.b("dialog_not_shown_reason", obj2);
        return C1929Tl0.d(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    abstract AbstractC2009Vk0 a();

    abstract AbstractC2967gl0 b();

    abstract AbstractC2967gl0 c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC5018yl0.b(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC2854fm0.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        AbstractC4560uk0.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, C6174a.GB));
        sb.append('{');
        boolean z8 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z8) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z8 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    /* renamed from: zzb */
    public final AbstractC2009Vk0 values() {
        AbstractC2009Vk0 abstractC2009Vk0 = this.f18813c;
        if (abstractC2009Vk0 != null) {
            return abstractC2009Vk0;
        }
        AbstractC2009Vk0 abstractC2009Vk0A = a();
        this.f18813c = abstractC2009Vk0A;
        return abstractC2009Vk0A;
    }

    @Override // java.util.Map
    /* renamed from: zzh */
    public final AbstractC2967gl0 entrySet() {
        AbstractC2967gl0 abstractC2967gl0 = this.f18811a;
        if (abstractC2967gl0 != null) {
            return abstractC2967gl0;
        }
        AbstractC2967gl0 abstractC2967gl0B = b();
        this.f18811a = abstractC2967gl0B;
        return abstractC2967gl0B;
    }

    @Override // java.util.Map
    /* renamed from: zzi */
    public final AbstractC2967gl0 keySet() {
        AbstractC2967gl0 abstractC2967gl0 = this.f18812b;
        if (abstractC2967gl0 != null) {
            return abstractC2967gl0;
        }
        AbstractC2967gl0 abstractC2967gl0C = c();
        this.f18812b = abstractC2967gl0C;
        return abstractC2967gl0C;
    }
}
