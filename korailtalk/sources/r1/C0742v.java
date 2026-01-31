package R1;

import com.google.android.gms.internal.ads.AbstractC1483In0;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.AbstractC4805wt;
import com.google.android.gms.internal.ads.C1297Ec0;
import com.google.android.gms.internal.ads.C2263ad0;
import com.google.android.gms.internal.ads.C2453cF;
import com.google.android.gms.internal.ads.C2568dF;
import com.google.android.gms.internal.ads.EnumC1952Uc0;
import com.google.android.gms.internal.ads.GD0;
import com.google.android.gms.internal.ads.SJ;
import com.google.android.gms.internal.ads.XD0;
import java.util.concurrent.TimeUnit;

/* renamed from: R1.v */
/* loaded from: classes.dex */
public final class C0742v implements GD0 {

    /* renamed from: a */
    private final XD0 f4417a;

    /* renamed from: b */
    private final XD0 f4418b;

    /* renamed from: c */
    private final XD0 f4419c;

    /* renamed from: d */
    private final XD0 f4420d;

    public C0742v(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04) {
        this.f4417a = xd0;
        this.f4418b = xd02;
        this.f4419c = xd03;
        this.f4420d = xd04;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C2263ad0 c2263ad0 = (C2263ad0) this.f4417a.zzb();
        C0744x c0744xZzb = ((C0745y) this.f4418b).zzb();
        C2453cF c2453cFZzb = ((C2568dF) this.f4419c).zzb();
        SJ sj = (SJ) this.f4420d.zzb();
        C1297Ec0 c1297Ec0Zza = c2263ad0.zzb(EnumC1952Uc0.GENERATE_SIGNALS, c2453cFZzb.zzc()).zzf(c0744xZzb).zzi(((Integer) H1.C.zzc().zza(AbstractC4439th.zzfF)).intValue(), TimeUnit.SECONDS).zza();
        AbstractC1483In0.zzr(c1297Ec0Zza, new C0735n(sj), AbstractC4805wt.zza);
        return c1297Ec0Zza;
    }
}
