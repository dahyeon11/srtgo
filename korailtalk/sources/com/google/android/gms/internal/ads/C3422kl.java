package com.google.android.gms.internal.ads;

import H1.InterfaceC0517a;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.kl */
/* loaded from: classes2.dex */
final class C3422kl implements J1.F {

    /* renamed from: a */
    boolean f20462a = false;

    /* renamed from: b */
    final /* synthetic */ boolean f20463b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC0517a f20464c;

    /* renamed from: d */
    final /* synthetic */ Map f20465d;

    /* renamed from: e */
    final /* synthetic */ Map f20466e;

    C3422kl(C3764nl c3764nl, boolean z8, InterfaceC0517a interfaceC0517a, Map map, Map map2) {
        this.f20463b = z8;
        this.f20464c = interfaceC0517a;
        this.f20465d = map;
        this.f20466e = map2;
    }

    @Override // J1.F
    public final void zza(boolean z8) {
        if (this.f20462a) {
            return;
        }
        if (z8 && this.f20463b) {
            ((DJ) this.f20464c).zzdG();
        }
        this.f20462a = true;
        this.f20465d.put((String) this.f20466e.get("event_id"), Boolean.valueOf(z8));
        ((InterfaceC4563um) this.f20464c).zzd("openIntentAsync", this.f20465d);
    }

    @Override // J1.F
    public final void zzb(int i8) {
    }
}
