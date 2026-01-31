package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Tk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1927Tk0 extends AbstractC1968Uk0 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f16507a;

    /* renamed from: b, reason: collision with root package name */
    int f16508b = 0;

    /* renamed from: c, reason: collision with root package name */
    boolean f16509c;

    AbstractC1927Tk0(int i8) {
        this.f16507a = new Object[i8];
    }

    private final void c(int i8) {
        Object[] objArr = this.f16507a;
        int length = objArr.length;
        if (length < i8) {
            this.f16507a = Arrays.copyOf(objArr, AbstractC1968Uk0.a(length, i8));
            this.f16509c = false;
        } else if (this.f16509c) {
            this.f16507a = (Object[]) objArr.clone();
            this.f16509c = false;
        }
    }

    final void b(Object[] objArr, int i8) {
        AbstractC1642Ml0.b(objArr, 2);
        c(this.f16508b + 2);
        System.arraycopy(objArr, 0, this.f16507a, this.f16508b, 2);
        this.f16508b += 2;
    }

    public final AbstractC1927Tk0 zza(Object obj) {
        obj.getClass();
        c(this.f16508b + 1);
        Object[] objArr = this.f16507a;
        int i8 = this.f16508b;
        this.f16508b = i8 + 1;
        objArr[i8] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1968Uk0
    public /* bridge */ /* synthetic */ AbstractC1968Uk0 zzb(Object obj) {
        throw null;
    }

    public final AbstractC1968Uk0 zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            c(this.f16508b + collection.size());
            if (collection instanceof AbstractC2009Vk0) {
                this.f16508b = ((AbstractC2009Vk0) collection).a(this.f16507a, this.f16508b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzb(it.next());
        }
        return this;
    }
}
