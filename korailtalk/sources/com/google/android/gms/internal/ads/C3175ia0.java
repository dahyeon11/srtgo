package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.ia0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3175ia0 implements InterfaceC4823x10 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19947a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f19948b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC2302ax f19949c;

    /* renamed from: d, reason: collision with root package name */
    private final X90 f19950d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3358k90 f19951e;

    /* renamed from: f, reason: collision with root package name */
    private final C1498Ja0 f19952f;

    /* renamed from: g, reason: collision with root package name */
    private final RunnableC5002yd0 f19953g;

    /* renamed from: h, reason: collision with root package name */
    private final C1743Pa0 f19954h;

    /* renamed from: i, reason: collision with root package name */
    private com.google.common.util.concurrent.C f19955i;

    public C3175ia0(Context context, Executor executor, AbstractC2302ax abstractC2302ax, InterfaceC3358k90 interfaceC3358k90, X90 x90, C1743Pa0 c1743Pa0, C1498Ja0 c1498Ja0) {
        this.f19947a = context;
        this.f19948b = executor;
        this.f19949c = abstractC2302ax;
        this.f19951e = interfaceC3358k90;
        this.f19950d = x90;
        this.f19954h = c1743Pa0;
        this.f19952f = c1498Ja0;
        this.f19953g = abstractC2302ax.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QO h(InterfaceC3131i90 interfaceC3131i90) {
        QO qoZzi = this.f19949c.zzi();
        C2912gF c2912gF = new C2912gF();
        c2912gF.zze(this.f19947a);
        c2912gF.zzi(((C3060ha0) interfaceC3131i90).zza);
        c2912gF.zzh(this.f19952f);
        qoZzi.zzd(c2912gF.zzj());
        qoZzi.zzc(new C4514uI().zzn());
        return qoZzi;
    }

    final /* synthetic */ void f() {
        this.f19950d.zzdB(AbstractC4542ub0.zzd(6, null, null));
    }

    final void g(int i8) {
        this.f19954h.zzp().zza(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4823x10
    public final boolean zza() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4823x10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(H1.Y1 r8, java.lang.String r9, com.google.android.gms.internal.ads.C4595v10 r10, com.google.android.gms.internal.ads.InterfaceC4709w10 r11) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3175ia0.zzb(H1.Y1, java.lang.String, com.google.android.gms.internal.ads.v10, com.google.android.gms.internal.ads.w10):boolean");
    }
}
