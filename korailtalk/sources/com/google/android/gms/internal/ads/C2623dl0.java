package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dl0 */
/* loaded from: classes2.dex */
public final class C2623dl0 {

    /* renamed from: a */
    Object[] f18675a;

    /* renamed from: b */
    int f18676b;

    /* renamed from: c */
    C2508cl0 f18677c;

    public C2623dl0() {
        this(4);
    }

    private final void a(int i8) {
        Object[] objArr = this.f18675a;
        int length = objArr.length;
        int i9 = i8 + i8;
        if (i9 > length) {
            this.f18675a = Arrays.copyOf(objArr, AbstractC1968Uk0.a(length, i9));
        }
    }

    public final C2623dl0 zza(Object obj, Object obj2) {
        a(this.f18676b + 1);
        AbstractC4560uk0.b(obj, obj2);
        Object[] objArr = this.f18675a;
        int i8 = this.f18676b;
        int i9 = i8 + i8;
        objArr[i9] = obj;
        objArr[i9 + 1] = obj2;
        this.f18676b = i8 + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C2623dl0 zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            a(this.f18676b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final AbstractC2737el0 zzc() {
        C2508cl0 c2508cl0 = this.f18677c;
        if (c2508cl0 != null) {
            throw c2508cl0.a();
        }
        C1929Tl0 c1929Tl0D = C1929Tl0.d(this.f18676b, this.f18675a, this);
        C2508cl0 c2508cl02 = this.f18677c;
        if (c2508cl02 == null) {
            return c1929Tl0D;
        }
        throw c2508cl02.a();
    }

    C2623dl0(int i8) {
        this.f18675a = new Object[i8 + i8];
        this.f18676b = 0;
    }
}
