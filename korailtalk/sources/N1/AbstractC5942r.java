package n1;

import java.util.List;
import n1.C5932h;

/* renamed from: n1.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5942r {

    /* renamed from: n1.r$a */
    public static abstract class a {
        abstract a a(int i8);

        abstract a b(String str);

        public abstract a zza(long j8);

        public abstract a zza(List<AbstractC5940p> list);

        public abstract a zza(EnumC5926b enumC5926b);

        public abstract a zza(AbstractC5937m abstractC5937m);

        public abstract AbstractC5942r zza();

        public a zzb(int i8) {
            return a(i8);
        }

        public abstract a zzb(long j8);

        public a zzb(String str) {
            return b(str);
        }
    }

    public static a zza() {
        return new C5932h.b().a(Integer.MIN_VALUE);
    }
}
