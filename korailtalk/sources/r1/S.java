package R1;

import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.FQ;
import com.google.android.gms.internal.ads.PJ;

/* loaded from: classes.dex */
public final class S implements PJ {

    /* renamed from: a, reason: collision with root package name */
    private final FQ f4333a;

    /* renamed from: b, reason: collision with root package name */
    private final Q f4334b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4335c;

    public S(FQ fq, Q q8, String str) {
        this.f4333a = fq;
        this.f4334b = q8;
        this.f4335c = str;
    }

    @Override // com.google.android.gms.internal.ads.PJ
    public final void zze(C0746z c0746z) {
        if (c0746z != null) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhg)).booleanValue()) {
                this.f4334b.zzd(this.f4335c, c0746z.zzb, this.f4333a);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.PJ
    public final void zzf(String str) {
    }
}
