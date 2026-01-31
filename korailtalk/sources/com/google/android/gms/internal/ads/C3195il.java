package com.google.android.gms.internal.ads;

import H1.InterfaceC0517a;
import java.net.URISyntaxException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.il, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3195il implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f19969a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC0517a f19970b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f19971c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3764nl f19972d;

    C3195il(C3764nl c3764nl, Map map, InterfaceC0517a interfaceC0517a, String str) {
        this.f19969a = map;
        this.f19970b = interfaceC0517a;
        this.f19971c = str;
        this.f19972d = c3764nl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        G1.u.zzo().zzw(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws URISyntaxException {
        String str = (String) obj;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkb)).booleanValue()) {
            this.f19969a.put("u", str);
        }
        this.f19972d.e(str, this.f19970b, this.f19969a, this.f19971c);
    }
}
