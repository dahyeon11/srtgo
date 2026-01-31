package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.yA0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4955yA0 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private final int f23851a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23854d;

    /* renamed from: e, reason: collision with root package name */
    private volatile C4727wA0 f23855e;

    /* renamed from: b, reason: collision with root package name */
    private List f23852b = Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    private Map f23853c = Collections.emptyMap();

    /* renamed from: f, reason: collision with root package name */
    private Map f23856f = Collections.emptyMap();

    private final int e(Comparable comparable) {
        int size = this.f23852b.size();
        int i8 = size - 1;
        int i9 = 0;
        if (i8 >= 0) {
            int iCompareTo = comparable.compareTo(((C4271sA0) this.f23852b.get(i8)).zza());
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i8;
            }
        }
        while (i9 <= i8) {
            int i10 = (i9 + i8) / 2;
            int iCompareTo2 = comparable.compareTo(((C4271sA0) this.f23852b.get(i10)).zza());
            if (iCompareTo2 < 0) {
                i8 = i10 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i10;
                }
                i9 = i10 + 1;
            }
        }
        return -(i9 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(int i8) {
        h();
        Object value = ((C4271sA0) this.f23852b.remove(i8)).getValue();
        if (!this.f23853c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            List list = this.f23852b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C4271sA0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap g() {
        h();
        if (this.f23853c.isEmpty() && !(this.f23853c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f23853c = treeMap;
            this.f23856f = treeMap.descendingMap();
        }
        return (SortedMap) this.f23853c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        if (this.f23854d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (!this.f23852b.isEmpty()) {
            this.f23852b.clear();
        }
        if (this.f23853c.isEmpty()) {
            return;
        }
        this.f23853c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f23853c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f23855e == null) {
            this.f23855e = new C4727wA0(this, null);
        }
        return this.f23855e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4955yA0)) {
            return super.equals(obj);
        }
        AbstractC4955yA0 abstractC4955yA0 = (AbstractC4955yA0) obj;
        int size = size();
        if (size != abstractC4955yA0.size()) {
            return false;
        }
        int iZzb = zzb();
        if (iZzb != abstractC4955yA0.zzb()) {
            return entrySet().equals(abstractC4955yA0.entrySet());
        }
        for (int i8 = 0; i8 < iZzb; i8++) {
            if (!zzg(i8).equals(abstractC4955yA0.zzg(i8))) {
                return false;
            }
        }
        if (iZzb != size) {
            return this.f23853c.equals(abstractC4955yA0.f23853c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((C4271sA0) this.f23852b.get(iE)).getValue() : this.f23853c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iZzb = zzb();
        int iHashCode = 0;
        for (int i8 = 0; i8 < iZzb; i8++) {
            iHashCode += ((C4271sA0) this.f23852b.get(i8)).hashCode();
        }
        return this.f23853c.size() > 0 ? iHashCode + this.f23853c.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return f(iE);
        }
        if (this.f23853c.isEmpty()) {
            return null;
        }
        return this.f23853c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f23852b.size() + this.f23853c.size();
    }

    public void zza() {
        if (this.f23854d) {
            return;
        }
        this.f23853c = this.f23853c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f23853c);
        this.f23856f = this.f23856f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f23856f);
        this.f23854d = true;
    }

    public final int zzb() {
        return this.f23852b.size();
    }

    public final Iterable zzc() {
        return this.f23853c.isEmpty() ? AbstractC4157rA0.a() : this.f23853c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((C4271sA0) this.f23852b.get(iE)).setValue(obj);
        }
        h();
        if (this.f23852b.isEmpty() && !(this.f23852b instanceof ArrayList)) {
            this.f23852b = new ArrayList(this.f23851a);
        }
        int i8 = -(iE + 1);
        if (i8 >= this.f23851a) {
            return g().put(comparable, obj);
        }
        int size = this.f23852b.size();
        int i9 = this.f23851a;
        if (size == i9) {
            C4271sA0 c4271sA0 = (C4271sA0) this.f23852b.remove(i9 - 1);
            g().put(c4271sA0.zza(), c4271sA0.getValue());
        }
        this.f23852b.add(i8, new C4271sA0(this, comparable, obj));
        return null;
    }

    public final Map.Entry zzg(int i8) {
        return (Map.Entry) this.f23852b.get(i8);
    }

    public final boolean zzj() {
        return this.f23854d;
    }
}
