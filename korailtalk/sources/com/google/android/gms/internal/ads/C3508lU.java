package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.lU, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3508lU {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f20672a;

    /* renamed from: b, reason: collision with root package name */
    private final OT f20673b;

    /* renamed from: c, reason: collision with root package name */
    private final AD0 f20674c;

    /* renamed from: d, reason: collision with root package name */
    private final RunnableC5002yd0 f20675d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f20676e;

    /* renamed from: f, reason: collision with root package name */
    private final L1.a f20677f;

    public C3508lU(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, OT ot, AD0 ad0, RunnableC5002yd0 runnableC5002yd0, Context context, L1.a aVar) {
        this.f20672a = interfaceExecutorServiceC1974Un0;
        this.f20673b = ot;
        this.f20674c = ad0;
        this.f20675d = runnableC5002yd0;
        this.f20676e = context;
        this.f20677f = aVar;
    }

    private final com.google.common.util.concurrent.C e(final C2519cr c2519cr, InterfaceC3394kU interfaceC3394kU, final InterfaceC3394kU interfaceC3394kU2, final InterfaceC3997pn0 interfaceC3997pn0) {
        String str = c2519cr.zzd;
        G1.u.zzp();
        return AbstractC1483In0.zzf(AbstractC1483In0.zzn(AbstractC1483In0.zzn(AbstractC5136zn0.zzu(K1.K0.zzC(str) ? AbstractC1483In0.zzg(new YT(1)) : AbstractC1483In0.zzf(interfaceC3394kU.zza(c2519cr), ExecutionException.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.jU
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return AbstractC1483In0.zzg(cause);
            }
        }, this.f20672a)), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.hU
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return AbstractC1483In0.zzh(((ZT) obj).zzb());
            }
        }, this.f20672a), interfaceC3997pn0, this.f20672a), YT.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.iU
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.a(interfaceC3394kU2, c2519cr, interfaceC3997pn0, (YT) obj);
            }
        }, this.f20672a);
    }

    final /* synthetic */ com.google.common.util.concurrent.C a(InterfaceC3394kU interfaceC3394kU, C2519cr c2519cr, InterfaceC3997pn0 interfaceC3997pn0, YT yt) {
        return AbstractC1483In0.zzn(interfaceC3394kU.zza(c2519cr), interfaceC3997pn0, this.f20672a);
    }

    final /* synthetic */ com.google.common.util.concurrent.C b(C2519cr c2519cr) {
        return ((BinderC3281jV) this.f20674c.zzb()).zzb(c2519cr, Binder.getCallingUid());
    }

    final /* synthetic */ com.google.common.util.concurrent.C c(C2519cr c2519cr) {
        return this.f20673b.zzd(c2519cr.zzh);
    }

    final /* synthetic */ com.google.common.util.concurrent.C d(C2519cr c2519cr) {
        return ((BinderC3281jV) this.f20674c.zzb()).zzi(c2519cr.zzh);
    }

    public final com.google.common.util.concurrent.C zza(final C2519cr c2519cr) {
        InterfaceC3997pn0 interfaceC3997pn0 = new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.eU
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                String str = new String(AbstractC3767nm0.zzb((InputStream) obj), AbstractC3647mj0.zzc);
                C2519cr c2519cr2 = c2519cr;
                c2519cr2.zzj = str;
                return AbstractC1483In0.zzh(c2519cr2);
            }
        };
        final OT ot = this.f20673b;
        Objects.requireNonNull(ot);
        return e(c2519cr, new InterfaceC3394kU() { // from class: com.google.android.gms.internal.ads.fU
            @Override // com.google.android.gms.internal.ads.InterfaceC3394kU
            public final com.google.common.util.concurrent.C zza(C2519cr c2519cr2) {
                return ot.zza(c2519cr2);
            }
        }, new InterfaceC3394kU() { // from class: com.google.android.gms.internal.ads.gU
            @Override // com.google.android.gms.internal.ads.InterfaceC3394kU
            public final com.google.common.util.concurrent.C zza(C2519cr c2519cr2) {
                return this.zza.b(c2519cr2);
            }
        }, interfaceC3997pn0);
    }

    public final com.google.common.util.concurrent.C zzb(JSONObject jSONObject) {
        return AbstractC1483In0.zzn(AbstractC5136zn0.zzu(AbstractC1483In0.zzh(jSONObject)), G1.u.zzf().zza(this.f20676e, this.f20677f, this.f20675d).zza("AFMA_getAdDictionary", AbstractC4110qn.zza, new InterfaceC3426kn() { // from class: com.google.android.gms.internal.ads.aU
            @Override // com.google.android.gms.internal.ads.InterfaceC3426kn
            public final Object zza(JSONObject jSONObject2) {
                return new C2863fr(jSONObject2);
            }
        }), this.f20672a);
    }

    public final com.google.common.util.concurrent.C zzg(C2519cr c2519cr) {
        return e(c2519cr, new InterfaceC3394kU() { // from class: com.google.android.gms.internal.ads.cU
            @Override // com.google.android.gms.internal.ads.InterfaceC3394kU
            public final com.google.common.util.concurrent.C zza(C2519cr c2519cr2) {
                return this.zza.c(c2519cr2);
            }
        }, new InterfaceC3394kU() { // from class: com.google.android.gms.internal.ads.dU
            @Override // com.google.android.gms.internal.ads.InterfaceC3394kU
            public final com.google.common.util.concurrent.C zza(C2519cr c2519cr2) {
                return this.zza.d(c2519cr2);
            }
        }, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.bU
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return AbstractC1483In0.zzh(null);
            }
        });
    }
}
