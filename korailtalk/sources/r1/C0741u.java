package R1;

import com.google.android.gms.internal.ads.AbstractC4805wt;
import com.google.android.gms.internal.ads.C4630vJ;
import com.google.android.gms.internal.ads.GD0;
import com.google.android.gms.internal.ads.InterfaceExecutorServiceC1974Un0;
import com.google.android.gms.internal.ads.OD0;
import com.google.android.gms.internal.ads.XD0;

/* renamed from: R1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0741u implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f4415a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f4416b;

    public C0741u(XD0 xd0, XD0 xd02) {
        this.f4415a = xd0;
        this.f4416b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        S s8 = (S) this.f4415a.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C4630vJ(s8, interfaceExecutorServiceC1974Un0);
    }
}
