package h2;

import g2.C5539a;
import i2.AbstractC5681n;

/* renamed from: h2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5585b {

    /* renamed from: a, reason: collision with root package name */
    private final int f31421a;

    /* renamed from: b, reason: collision with root package name */
    private final C5539a f31422b;

    /* renamed from: c, reason: collision with root package name */
    private final C5539a.d f31423c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31424d;

    private C5585b(C5539a c5539a, C5539a.d dVar, String str) {
        this.f31422b = c5539a;
        this.f31423c = dVar;
        this.f31424d = str;
        this.f31421a = AbstractC5681n.hashCode(c5539a, dVar, str);
    }

    public static <O extends C5539a.d> C5585b zaa(C5539a c5539a, O o8, String str) {
        return new C5585b(c5539a, o8, str);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5585b)) {
            return false;
        }
        C5585b c5585b = (C5585b) obj;
        return AbstractC5681n.equal(this.f31422b, c5585b.f31422b) && AbstractC5681n.equal(this.f31423c, c5585b.f31423c) && AbstractC5681n.equal(this.f31424d, c5585b.f31424d);
    }

    public final int hashCode() {
        return this.f31421a;
    }

    public final String zab() {
        return this.f31422b.zad();
    }
}
