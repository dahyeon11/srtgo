package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.oJ0 */
/* loaded from: classes2.dex */
final class C3834oJ0 {
    public static final C3834oJ0 zza;

    /* renamed from: a */
    private final AbstractC2967gl0 f21444a;
    public final int zzb;
    public final int zzc;

    static {
        C3834oJ0 c3834oJ0;
        if (AbstractC2281am0.zza >= 33) {
            C2852fl0 c2852fl0 = new C2852fl0();
            for (int i8 = 1; i8 <= 10; i8++) {
                c2852fl0.zzf(Integer.valueOf(AbstractC2281am0.zzh(i8)));
            }
            c3834oJ0 = new C3834oJ0(2, c2852fl0.zzi());
        } else {
            c3834oJ0 = new C3834oJ0(2, 10);
        }
        zza = c3834oJ0;
    }

    public C3834oJ0(int i8, int i9) {
        this.zzb = i8;
        this.zzc = i9;
        this.f21444a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3834oJ0)) {
            return false;
        }
        C3834oJ0 c3834oJ0 = (C3834oJ0) obj;
        return this.zzb == c3834oJ0.zzb && this.zzc == c3834oJ0.zzc && AbstractC2281am0.zzG(this.f21444a, c3834oJ0.f21444a);
    }

    public final int hashCode() {
        AbstractC2967gl0 abstractC2967gl0 = this.f21444a;
        return (((this.zzb * 31) + this.zzc) * 31) + (abstractC2967gl0 == null ? 0 : abstractC2967gl0.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.zzb + ", maxChannelCount=" + this.zzc + ", channelMasks=" + String.valueOf(this.f21444a) + "]";
    }

    public final int zza(int i8, C3940pF0 c3940pF0) {
        if (this.f21444a != null) {
            return this.zzc;
        }
        if (AbstractC2281am0.zza >= 29) {
            return AbstractC2921gJ0.zza(this.zzb, i8, c3940pF0);
        }
        Integer num = (Integer) C4289sJ0.f22618d.getOrDefault(Integer.valueOf(this.zzb), 0);
        num.getClass();
        return num.intValue();
    }

    public final boolean zzb(int i8) {
        if (this.f21444a == null) {
            return i8 <= this.zzc;
        }
        int iZzh = AbstractC2281am0.zzh(i8);
        if (iZzh == 0) {
            return false;
        }
        return this.f21444a.contains(Integer.valueOf(iZzh));
    }

    public C3834oJ0(int i8, Set set) {
        this.zzb = i8;
        AbstractC2967gl0 abstractC2967gl0Zzl = AbstractC2967gl0.zzl(set);
        this.f21444a = abstractC2967gl0Zzl;
        AbstractC3311jm0 it = abstractC2967gl0Zzl.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }
}
