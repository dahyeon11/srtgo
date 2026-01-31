package c2;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    static int f11448b = 31;

    /* renamed from: a, reason: collision with root package name */
    private int f11449a = 1;

    public b addObject(Object obj) {
        this.f11449a = (f11448b * this.f11449a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int hash() {
        return this.f11449a;
    }

    public final b zaa(boolean z8) {
        this.f11449a = (f11448b * this.f11449a) + (z8 ? 1 : 0);
        return this;
    }
}
