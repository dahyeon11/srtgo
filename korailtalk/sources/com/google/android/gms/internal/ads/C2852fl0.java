package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.fl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2852fl0 extends AbstractC1927Tk0 {

    /* renamed from: d, reason: collision with root package name */
    Object[] f19238d;

    /* renamed from: e, reason: collision with root package name */
    private int f19239e;

    public C2852fl0() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1927Tk0, com.google.android.gms.internal.ads.AbstractC1968Uk0
    public final /* bridge */ /* synthetic */ AbstractC1968Uk0 zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final C2852fl0 zzf(Object obj) {
        obj.getClass();
        if (this.f19238d != null) {
            int iE = AbstractC2967gl0.e(this.f16508b);
            Object[] objArr = this.f19238d;
            if (iE <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iA = AbstractC1886Sk0.a(iHashCode);
                while (true) {
                    int i8 = iA & length;
                    Object[] objArr2 = this.f19238d;
                    Object obj2 = objArr2[i8];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        iA = i8 + 1;
                    } else {
                        objArr2[i8] = obj;
                        this.f19239e += iHashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.f19238d = null;
        super.zza(obj);
        return this;
    }

    public final C2852fl0 zzg(Object... objArr) {
        if (this.f19238d != null) {
            for (int i8 = 0; i8 < 2; i8++) {
                zzf(objArr[i8]);
            }
        } else {
            b(objArr, 2);
        }
        return this;
    }

    public final C2852fl0 zzh(Iterable iterable) {
        iterable.getClass();
        if (this.f19238d != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final AbstractC2967gl0 zzi() {
        AbstractC2967gl0 abstractC2967gl0J;
        int i8 = this.f16508b;
        if (i8 == 0) {
            return C1970Ul0.f16709i;
        }
        if (i8 == 1) {
            Object obj = this.f16507a[0];
            Objects.requireNonNull(obj);
            return new C2969gm0(obj);
        }
        if (this.f19238d == null || AbstractC2967gl0.e(i8) != this.f19238d.length) {
            abstractC2967gl0J = AbstractC2967gl0.j(this.f16508b, this.f16507a);
            this.f16508b = abstractC2967gl0J.size();
        } else {
            int i9 = this.f16508b;
            Object[] objArrCopyOf = this.f16507a;
            if (AbstractC2967gl0.k(i9, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i9);
            }
            abstractC2967gl0J = new C1970Ul0(objArrCopyOf, this.f19239e, this.f19238d, r6.length - 1, this.f16508b);
        }
        this.f16509c = true;
        this.f19238d = null;
        return abstractC2967gl0J;
    }

    C2852fl0(int i8) {
        super(i8);
        this.f19238d = new Object[AbstractC2967gl0.e(i8)];
    }
}
