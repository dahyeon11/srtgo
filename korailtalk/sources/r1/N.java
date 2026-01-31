package R1;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC4805wt;
import com.google.android.gms.internal.ads.C2990gx;
import com.google.android.gms.internal.ads.GD0;
import com.google.android.gms.internal.ads.InterfaceExecutorServiceC1974Un0;
import com.google.android.gms.internal.ads.OD0;
import com.google.android.gms.internal.ads.QQ;
import com.google.android.gms.internal.ads.XD0;

/* loaded from: classes.dex */
public final class N implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f4320a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f4321b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f4322c;

    public N(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f4320a = xd0;
        this.f4321b = xd02;
        this.f4322c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((C2990gx) this.f4320a).zza();
        QQ qq = (QQ) this.f4321b.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new K(contextZza, qq, interfaceExecutorServiceC1974Un0);
    }
}
