package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class CG0 extends CE0 {
    public static final /* synthetic */ int zzc = 0;

    /* renamed from: f */
    private final int f12505f;

    /* renamed from: g */
    private final int f12506g;

    /* renamed from: h */
    private final int[] f12507h;

    /* renamed from: i */
    private final int[] f12508i;

    /* renamed from: j */
    private final RG[] f12509j;

    /* renamed from: k */
    private final Object[] f12510k;

    /* renamed from: l */
    private final HashMap f12511l;

    /* JADX WARN: Illegal instructions before constructor call */
    public CG0(Collection collection, JN0 jn0) {
        RG[] rgArr = new RG[collection.size()];
        Iterator it = collection.iterator();
        int i8 = 0;
        int i9 = 0;
        while (it.hasNext()) {
            rgArr[i9] = ((InterfaceC3372kG0) it.next()).zza();
            i9++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i8] = ((InterfaceC3372kG0) it2.next()).zzb();
            i8++;
        }
        this(rgArr, objArr, jn0);
    }

    @Override // com.google.android.gms.internal.ads.CE0
    protected final int a(Object obj) {
        Integer num = (Integer) this.f12511l.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.CE0
    protected final int b(int i8) {
        return AbstractC2281am0.zzb(this.f12507h, i8 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.CE0
    protected final int c(int i8) {
        return AbstractC2281am0.zzb(this.f12508i, i8 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.CE0
    protected final int d(int i8) {
        return this.f12507h[i8];
    }

    @Override // com.google.android.gms.internal.ads.CE0
    protected final int e(int i8) {
        return this.f12508i[i8];
    }

    @Override // com.google.android.gms.internal.ads.CE0
    protected final RG f(int i8) {
        return this.f12509j[i8];
    }

    @Override // com.google.android.gms.internal.ads.CE0
    protected final Object g(int i8) {
        return this.f12510k[i8];
    }

    final List j() {
        return Arrays.asList(this.f12509j);
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final int zzb() {
        return this.f12506g;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final int zzc() {
        return this.f12505f;
    }

    public final CG0 zzx(JN0 jn0) {
        RG[] rgArr = new RG[this.f12509j.length];
        int i8 = 0;
        while (true) {
            RG[] rgArr2 = this.f12509j;
            if (i8 >= rgArr2.length) {
                return new CG0(rgArr, this.f12510k, jn0);
            }
            rgArr[i8] = new BG0(this, rgArr2[i8]);
            i8++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private CG0(RG[] rgArr, Object[] objArr, JN0 jn0) {
        super(false, jn0);
        int i8 = 0;
        this.f12509j = rgArr;
        int length = rgArr.length;
        this.f12507h = new int[length];
        this.f12508i = new int[length];
        this.f12510k = objArr;
        this.f12511l = new HashMap();
        int iZzc = 0;
        int iZzb = 0;
        int i9 = 0;
        while (i8 < rgArr.length) {
            RG rg = rgArr[i8];
            this.f12509j[i9] = rg;
            this.f12508i[i9] = iZzc;
            this.f12507h[i9] = iZzb;
            iZzc += rg.zzc();
            iZzb += this.f12509j[i9].zzb();
            this.f12511l.put(objArr[i9], Integer.valueOf(i9));
            i8++;
            i9++;
        }
        this.f12505f = iZzc;
        this.f12506g = iZzb;
    }
}
