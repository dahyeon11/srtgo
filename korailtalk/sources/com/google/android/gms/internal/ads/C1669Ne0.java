package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Ne0 */
/* loaded from: classes2.dex */
public final class C1669Ne0 implements InterfaceC1792Qe0 {

    /* renamed from: f */
    private static final C1669Ne0 f14933f = new C1669Ne0(new C1833Re0());

    /* renamed from: a */
    protected final C3867of0 f14934a = new C3867of0();

    /* renamed from: b */
    private Date f14935b;

    /* renamed from: c */
    private boolean f14936c;

    /* renamed from: d */
    private final C1833Re0 f14937d;

    /* renamed from: e */
    private boolean f14938e;

    private C1669Ne0(C1833Re0 c1833Re0) {
        this.f14937d = c1833Re0;
    }

    public static C1669Ne0 zza() {
        return f14933f;
    }

    public final Date zzb() {
        Date date = this.f14935b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1792Qe0
    public final void zzc(boolean z8) {
        if (!this.f14938e && z8) {
            Date date = new Date();
            Date date2 = this.f14935b;
            if (date2 == null || date.after(date2)) {
                this.f14935b = date;
                if (this.f14936c) {
                    Iterator it = C1751Pe0.zza().zzb().iterator();
                    while (it.hasNext()) {
                        ((C4890xe0) it.next()).zzg().zzg(zzb());
                    }
                }
            }
        }
        this.f14938e = z8;
    }

    public final void zzd(Context context) {
        if (this.f14936c) {
            return;
        }
        this.f14937d.zzd(context);
        this.f14937d.zze(this);
        this.f14937d.zzf();
        this.f14938e = this.f14937d.f16142b;
        this.f14936c = true;
    }
}
