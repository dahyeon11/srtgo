package z2;

/* loaded from: classes2.dex */
final class j extends h {

    /* renamed from: e */
    static final h f37868e = new j(new Object[0], 0);

    /* renamed from: c */
    final transient Object[] f37869c;

    /* renamed from: d */
    private final transient int f37870d;

    j(Object[] objArr, int i8) {
        this.f37869c = objArr;
        this.f37870d = i8;
    }

    @Override // z2.h, z2.d
    final int a(Object[] objArr, int i8) {
        System.arraycopy(this.f37869c, 0, objArr, 0, this.f37870d);
        return this.f37870d;
    }

    @Override // z2.d
    final int b() {
        return this.f37870d;
    }

    @Override // z2.d
    final int c() {
        return 0;
    }

    @Override // z2.d
    final boolean d() {
        return false;
    }

    @Override // z2.d
    final Object[] e() {
        return this.f37869c;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        w.zza(i8, this.f37870d, "index");
        Object obj = this.f37869c[i8];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37870d;
    }
}
