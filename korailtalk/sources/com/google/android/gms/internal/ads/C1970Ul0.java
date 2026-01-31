package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Ul0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1970Ul0 extends AbstractC2967gl0 {

    /* renamed from: h, reason: collision with root package name */
    private static final Object[] f16708h;

    /* renamed from: i, reason: collision with root package name */
    static final C1970Ul0 f16709i;

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f16710c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f16711d;

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f16712e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f16713f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f16714g;

    static {
        Object[] objArr = new Object[0];
        f16708h = objArr;
        f16709i = new C1970Ul0(objArr, 0, objArr, 0, 0);
    }

    C1970Ul0(Object[] objArr, int i8, Object[] objArr2, int i9, int i10) {
        this.f16710c = objArr;
        this.f16711d = i8;
        this.f16712e = objArr2;
        this.f16713f = i9;
        this.f16714g = i10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final int a(Object[] objArr, int i8) {
        System.arraycopy(this.f16710c, 0, objArr, i8, this.f16714g);
        return i8 + this.f16714g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final int b() {
        return this.f16714g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final int c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f16712e;
            if (objArr.length != 0) {
                int iB = AbstractC1886Sk0.b(obj);
                while (true) {
                    int i8 = iB & this.f16713f;
                    Object obj2 = objArr[i8];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iB = i8 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final Object[] d() {
        return this.f16710c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2967gl0
    final AbstractC2394bl0 f() {
        return AbstractC2394bl0.e(this.f16710c, this.f16714g);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2967gl0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f16711d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2967gl0
    final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2967gl0, com.google.android.gms.internal.ads.AbstractC2009Vk0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f16714g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2967gl0, com.google.android.gms.internal.ads.AbstractC2009Vk0
    /* renamed from: zze */
    public final AbstractC3311jm0 iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final boolean zzf() {
        return false;
    }
}
