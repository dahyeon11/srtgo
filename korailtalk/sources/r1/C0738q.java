package R1;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: R1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0738q {

    /* renamed from: a, reason: collision with root package name */
    private final String f4411a;

    /* synthetic */ C0738q(C0736o c0736o, AbstractC0737p abstractC0737p) {
        this.f4411a = c0736o.f4410a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.EnumC1382Ge zza() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f4411a
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 1
            r4 = 3
            switch(r1) {
                case -1999289321: goto L2b;
                case -1372958932: goto L21;
                case 543046670: goto L17;
                case 1951953708: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L35
        Ld:
            java.lang.String r1 = "BANNER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = 0
            goto L36
        L17:
            java.lang.String r1 = "REWARDED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = r4
            goto L36
        L21:
            java.lang.String r1 = "INTERSTITIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = r3
            goto L36
        L2b:
            java.lang.String r1 = "NATIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = r2
            goto L36
        L35:
            r0 = -1
        L36:
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L47
            if (r0 == r2) goto L44
            if (r0 == r4) goto L41
            com.google.android.gms.internal.ads.Ge r0 = com.google.android.gms.internal.ads.EnumC1382Ge.AD_INITIATER_UNSPECIFIED
            return r0
        L41:
            com.google.android.gms.internal.ads.Ge r0 = com.google.android.gms.internal.ads.EnumC1382Ge.REWARD_BASED_VIDEO_AD
            return r0
        L44:
            com.google.android.gms.internal.ads.Ge r0 = com.google.android.gms.internal.ads.EnumC1382Ge.AD_LOADER
            return r0
        L47:
            com.google.android.gms.internal.ads.Ge r0 = com.google.android.gms.internal.ads.EnumC1382Ge.INTERSTITIAL
            return r0
        L4a:
            com.google.android.gms.internal.ads.Ge r0 = com.google.android.gms.internal.ads.EnumC1382Ge.BANNER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.C0738q.zza():com.google.android.gms.internal.ads.Ge");
    }

    public final String zzb() {
        return this.f4411a.toLowerCase(Locale.ROOT);
    }

    public final Set zzc() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f4411a.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
