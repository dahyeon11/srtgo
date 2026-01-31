package com.google.android.gms.internal.ads;

import A1.a;
import H1.C0525c1;
import H1.C0591z;
import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Xd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2076Xd {

    /* renamed from: a, reason: collision with root package name */
    private H1.X f17263a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f17264b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17265c;

    /* renamed from: d, reason: collision with root package name */
    private final C0525c1 f17266d;

    /* renamed from: e, reason: collision with root package name */
    private final int f17267e;

    /* renamed from: f, reason: collision with root package name */
    private final a.AbstractC0004a f17268f;

    /* renamed from: g, reason: collision with root package name */
    private final BinderC1686Nn f17269g = new BinderC1686Nn();

    /* renamed from: h, reason: collision with root package name */
    private final H1.c2 f17270h = H1.c2.zza;

    public C2076Xd(Context context, String str, C0525c1 c0525c1, int i8, a.AbstractC0004a abstractC0004a) {
        this.f17264b = context;
        this.f17265c = str;
        this.f17266d = c0525c1;
        this.f17267e = i8;
        this.f17268f = abstractC0004a;
    }

    public final void zza() {
        try {
            H1.X xZzd = C0591z.zza().zzd(this.f17264b, H1.d2.zzb(), this.f17265c, this.f17269g);
            this.f17263a = xZzd;
            if (xZzd != null) {
                if (this.f17267e != 3) {
                    this.f17263a.zzI(new H1.j2(this.f17267e));
                }
                this.f17263a.zzH(new BinderC1544Kd(this.f17268f, this.f17265c));
                this.f17263a.zzab(this.f17270h.zza(this.f17264b, this.f17266d));
            }
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }
}
