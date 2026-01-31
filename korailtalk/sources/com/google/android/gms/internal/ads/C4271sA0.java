package com.google.android.gms.internal.ads;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.sA0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4271sA0 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f22586a;

    /* renamed from: b, reason: collision with root package name */
    private Object f22587b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC4955yA0 f22588c;

    C4271sA0(AbstractC4955yA0 abstractC4955yA0, Comparable comparable, Object obj) {
        this.f22588c = abstractC4955yA0;
        this.f22586a = comparable;
        this.f22587b = obj;
    }

    private static final boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f22586a.compareTo(((C4271sA0) obj).f22586a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.f22586a, entry.getKey()) && a(this.f22587b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f22586a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f22587b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f22586a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f22587b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f22588c.h();
        Object obj2 = this.f22587b;
        this.f22587b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f22586a) + SimpleComparison.EQUAL_TO_OPERATION + String.valueOf(this.f22587b);
    }

    public final Comparable zza() {
        return this.f22586a;
    }
}
