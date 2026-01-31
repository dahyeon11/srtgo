package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.xT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4874xT implements XT {

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f23714h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a, reason: collision with root package name */
    private final WS f23715a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f23716b;

    /* renamed from: c, reason: collision with root package name */
    private final C1825Ra0 f23717c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f23718d;

    /* renamed from: e, reason: collision with root package name */
    private final PV f23719e;

    /* renamed from: f, reason: collision with root package name */
    private final RunnableC4660vd0 f23720f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f23721g;

    C4874xT(Context context, C1825Ra0 c1825Ra0, WS ws, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, ScheduledExecutorService scheduledExecutorService, PV pv, RunnableC4660vd0 runnableC4660vd0) {
        this.f23721g = context;
        this.f23717c = c1825Ra0;
        this.f23715a = ws;
        this.f23716b = interfaceExecutorServiceC1974Un0;
        this.f23718d = scheduledExecutorService;
        this.f23719e = pv;
        this.f23720f = runnableC4660vd0;
    }

    final /* synthetic */ com.google.common.util.concurrent.C b(ZT zt) {
        return AbstractC1483In0.zzh(new C1457Ia0(new C1334Fa0(this.f23717c), C1416Ha0.zza(new InputStreamReader(zt.zzb()), zt.zza())));
    }

    @Override // com.google.android.gms.internal.ads.XT
    public final com.google.common.util.concurrent.C zzb(C2519cr c2519cr) {
        Context context = this.f23721g;
        com.google.common.util.concurrent.C cZzc = this.f23715a.zzc(c2519cr);
        InterfaceC3407kd0 interfaceC3407kd0Zza = AbstractC3293jd0.zza(context, EnumC1217Cd0.CUI_NAME_ADREQUEST_PARSERESPONSE);
        AbstractC4546ud0.zze(cZzc, interfaceC3407kd0Zza);
        com.google.common.util.concurrent.C cZzn = AbstractC1483In0.zzn(cZzc, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.uT
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.b((ZT) obj);
            }
        }, this.f23716b);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfD)).booleanValue()) {
            cZzn = AbstractC1483In0.zzf(AbstractC1483In0.zzo(cZzn, ((Integer) H1.C.zzc().zza(AbstractC4439th.zzfF)).intValue(), TimeUnit.SECONDS, this.f23718d), TimeoutException.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.vT
                @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                public final com.google.common.util.concurrent.C zza(Object obj) {
                    return AbstractC1483In0.zzg(new RS(5));
                }
            }, AbstractC4805wt.zzf);
        }
        AbstractC4546ud0.zzb(cZzn, this.f23720f, interfaceC3407kd0Zza);
        AbstractC1483In0.zzr(cZzn, new C4760wT(this), AbstractC4805wt.zzf);
        return cZzn;
    }
}
