package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.t */
/* loaded from: classes2.dex */
public final class C4363t {

    /* renamed from: a */
    private final Context f22763a;

    /* renamed from: b */
    private EO f22764b;

    /* renamed from: c */
    private IC f22765c;

    /* renamed from: d */
    private boolean f22766d;

    public C4363t(Context context) {
        this.f22763a = context.getApplicationContext();
    }

    public final F zzc() {
        F10.zzf(!this.f22766d);
        AbstractC4705w abstractC4705w = null;
        if (this.f22765c == null) {
            if (this.f22764b == null) {
                this.f22764b = new C4819x(abstractC4705w);
            }
            this.f22765c = new C4933y(this.f22764b);
        }
        F f8 = new F(this, null);
        this.f22766d = true;
        return f8;
    }
}
