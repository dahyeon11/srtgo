package K1;

import com.google.android.gms.internal.ads.C1203Bt;
import com.google.android.gms.internal.ads.C2210a8;
import com.google.android.gms.internal.ads.G7;
import java.util.Map;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    private static C2210a8 f2796a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f2797b = new Object();

    @Deprecated
    public static final N zza = new K();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:17:0x003b, B:16:0x0036, B:18:0x003d), top: B:22:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.getApplicationContext()
            if (r0 == 0) goto Ld
            android.content.Context r4 = r4.getApplicationContext()
        Ld:
            java.lang.Object r0 = K1.T.f2797b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.a8 r1 = K1.T.f2796a     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L3d
            com.google.android.gms.internal.ads.AbstractC4439th.zza(r4)     // Catch: java.lang.Throwable -> L34
            boolean r1 = o2.e.isPackageSide()     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L36
            com.google.android.gms.internal.ads.kh r1 = com.google.android.gms.internal.ads.AbstractC4439th.zzew     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L34
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L36
            com.google.android.gms.internal.ads.a8 r4 = K1.A.zzb(r4)     // Catch: java.lang.Throwable -> L34
            goto L3b
        L34:
            r4 = move-exception
            goto L3f
        L36:
            r1 = 0
            com.google.android.gms.internal.ads.a8 r4 = com.google.android.gms.internal.ads.F8.zza(r4, r1)     // Catch: java.lang.Throwable -> L34
        L3b:
            K1.T.f2796a = r4     // Catch: java.lang.Throwable -> L34
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.T.<init>(android.content.Context):void");
    }

    public final com.google.common.util.concurrent.C zza(String str) {
        C1203Bt c1203Bt = new C1203Bt();
        f2796a.zza(new S(str, null, c1203Bt));
        return c1203Bt;
    }

    public final com.google.common.util.concurrent.C zzb(int i8, String str, Map map, byte[] bArr) {
        P p8 = new P(null);
        L l8 = new L(this, str, p8);
        L1.m mVar = new L1.m(null);
        M m8 = new M(this, i8, str, p8, l8, bArr, map, mVar);
        if (L1.m.zzk()) {
            try {
                mVar.zzd(str, "GET", m8.zzl(), m8.zzx());
            } catch (G7 e8) {
                L1.n.zzj(e8.getMessage());
            }
        }
        f2796a.zza(m8);
        return p8;
    }
}
