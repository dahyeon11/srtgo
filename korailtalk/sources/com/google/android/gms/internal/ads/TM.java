package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class TM implements VF {

    /* renamed from: a, reason: collision with root package name */
    private final SL f16455a;

    /* renamed from: b, reason: collision with root package name */
    private final XL f16456b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f16457c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f16458d;

    public TM(SL sl, XL xl, Executor executor, Executor executor2) {
        this.f16455a = sl;
        this.f16456b = xl;
        this.f16457c = executor;
        this.f16458d = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final InterfaceC2065Wv interfaceC2065Wv) {
        this.f16457c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.RM
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC2065Wv.zzd("onSdkImpression", new O.a());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.VF
    public final void zzr() {
        if (this.f16456b.zzd()) {
            SL sl = this.f16455a;
            C2597dX c2597dXZzu = sl.zzu();
            if (c2597dXZzu == null && sl.zzw() != null && ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfi)).booleanValue()) {
                SL sl2 = this.f16455a;
                com.google.common.util.concurrent.C cZzw = sl2.zzw();
                C1203Bt c1203BtZzp = sl2.zzp();
                if (cZzw == null || c1203BtZzp == null) {
                    return;
                }
                AbstractC1483In0.zzr(AbstractC1483In0.zzl(cZzw, c1203BtZzp), new SM(this), this.f16458d);
                return;
            }
            if (c2597dXZzu != null) {
                SL sl3 = this.f16455a;
                InterfaceC2065Wv interfaceC2065WvZzr = sl3.zzr();
                InterfaceC2065Wv interfaceC2065WvZzs = sl3.zzs();
                if (interfaceC2065WvZzr == null) {
                    interfaceC2065WvZzr = interfaceC2065WvZzs != null ? interfaceC2065WvZzs : null;
                }
                if (interfaceC2065WvZzr != null) {
                    b(interfaceC2065WvZzr);
                }
            }
        }
    }
}
