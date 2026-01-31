package z2;

import java.util.List;

/* loaded from: classes2.dex */
final class g extends h {

    /* renamed from: c */
    final transient int f37864c;

    /* renamed from: d */
    final transient int f37865d;

    /* renamed from: e */
    final /* synthetic */ h f37866e;

    g(h hVar, int i8, int i9) {
        this.f37866e = hVar;
        this.f37864c = i8;
        this.f37865d = i9;
    }

    @Override // z2.d
    final int b() {
        return this.f37866e.c() + this.f37864c + this.f37865d;
    }

    @Override // z2.d
    final int c() {
        return this.f37866e.c() + this.f37864c;
    }

    @Override // z2.d
    final boolean d() {
        return true;
    }

    @Override // z2.d
    final Object[] e() {
        return this.f37866e.e();
    }

    @Override // java.util.List
    public final Object get(int i8) {
        w.zza(i8, this.f37865d, "index");
        return this.f37866e.get(i8 + this.f37864c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37865d;
    }

    @Override // z2.h, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }

    @Override // z2.h
    /* renamed from: zzh */
    public final h subList(int i8, int i9) {
        w.zzc(i8, i9, this.f37865d);
        int i10 = this.f37864c;
        return this.f37866e.subList(i8 + i10, i9 + i10);
    }
}
