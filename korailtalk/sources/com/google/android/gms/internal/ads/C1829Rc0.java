package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Rc0 */
/* loaded from: classes2.dex */
public final class C1829Rc0 {

    /* renamed from: a */
    private final Object f16135a;

    /* renamed from: b */
    private final String f16136b;

    /* renamed from: c */
    private final com.google.common.util.concurrent.C f16137c;

    /* renamed from: d */
    private final List f16138d;

    /* renamed from: e */
    private final com.google.common.util.concurrent.C f16139e;

    /* renamed from: f */
    final /* synthetic */ AbstractC1870Sc0 f16140f;

    /* JADX INFO: Access modifiers changed from: private */
    C1829Rc0(AbstractC1870Sc0 abstractC1870Sc0, Object obj, String str, com.google.common.util.concurrent.C c9, List list, com.google.common.util.concurrent.C c10) {
        this.f16140f = abstractC1870Sc0;
        this.f16135a = obj;
        this.f16136b = str;
        this.f16137c = c9;
        this.f16138d = list;
        this.f16139e = c10;
    }

    public final C1297Ec0 zza() {
        Object obj = this.f16135a;
        String strD = this.f16136b;
        if (strD == null) {
            strD = this.f16140f.d(obj);
        }
        final C1297Ec0 c1297Ec0 = new C1297Ec0(obj, strD, this.f16139e);
        this.f16140f.f16311c.zza(c1297Ec0);
        com.google.common.util.concurrent.C c9 = this.f16137c;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.Oc0
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.f16140f.f16311c.zzc(c1297Ec0);
            }
        };
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zzf;
        c9.addListener(runnable, interfaceExecutorServiceC1974Un0);
        AbstractC1483In0.zzr(c1297Ec0, new C1747Pc0(this, c1297Ec0), interfaceExecutorServiceC1974Un0);
        return c1297Ec0;
    }

    public final C1829Rc0 zzb(Object obj) {
        return this.f16140f.zzb(obj, zza());
    }

    public final C1829Rc0 zzc(Class cls, InterfaceC3997pn0 interfaceC3997pn0) {
        return new C1829Rc0(this.f16140f, this.f16135a, this.f16136b, this.f16137c, this.f16138d, AbstractC1483In0.zzf(this.f16139e, cls, interfaceC3997pn0, this.f16140f.f16309a));
    }

    public final C1829Rc0 zzd(final com.google.common.util.concurrent.C c9) {
        return zzg(new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.Nc0
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return c9;
            }
        }, AbstractC4805wt.zzf);
    }

    public final C1829Rc0 zze(final InterfaceC1215Cc0 interfaceC1215Cc0) {
        return zzf(new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.Mc0
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return AbstractC1483In0.zzh(interfaceC1215Cc0.zza(obj));
            }
        });
    }

    public final C1829Rc0 zzf(InterfaceC3997pn0 interfaceC3997pn0) {
        return zzg(interfaceC3997pn0, this.f16140f.f16309a);
    }

    public final C1829Rc0 zzg(InterfaceC3997pn0 interfaceC3997pn0, Executor executor) {
        return new C1829Rc0(this.f16140f, this.f16135a, this.f16136b, this.f16137c, this.f16138d, AbstractC1483In0.zzn(this.f16139e, interfaceC3997pn0, executor));
    }

    public final C1829Rc0 zzh(String str) {
        return new C1829Rc0(this.f16140f, this.f16135a, str, this.f16137c, this.f16138d, this.f16139e);
    }

    public final C1829Rc0 zzi(long j8, TimeUnit timeUnit) {
        return new C1829Rc0(this.f16140f, this.f16135a, this.f16136b, this.f16137c, this.f16138d, AbstractC1483In0.zzo(this.f16139e, j8, timeUnit, this.f16140f.f16310b));
    }

    /* synthetic */ C1829Rc0(AbstractC1870Sc0 abstractC1870Sc0, Object obj, String str, com.google.common.util.concurrent.C c9, List list, com.google.common.util.concurrent.C c10, AbstractC1788Qc0 abstractC1788Qc0) {
        this(abstractC1870Sc0, obj, null, c9, list, c10);
    }
}
