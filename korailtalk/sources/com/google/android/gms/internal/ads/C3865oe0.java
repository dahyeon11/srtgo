package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.oe0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3865oe0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21540a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f21541b;

    /* renamed from: c, reason: collision with root package name */
    private final L1.s f21542c;

    /* renamed from: d, reason: collision with root package name */
    private final RunnableC5002yd0 f21543d;

    C3865oe0(Context context, Executor executor, L1.s sVar, RunnableC5002yd0 runnableC5002yd0) {
        this.f21540a = context;
        this.f21541b = executor;
        this.f21542c = sVar;
        this.f21543d = runnableC5002yd0;
    }

    final /* synthetic */ void a(String str) {
        this.f21542c.zza(str);
    }

    final /* synthetic */ void b(String str, RunnableC4660vd0 runnableC4660vd0) {
        InterfaceC3407kd0 interfaceC3407kd0Zza = AbstractC3293jd0.zza(this.f21540a, EnumC1217Cd0.CUI_NAME_PING);
        interfaceC3407kd0Zza.zzj();
        interfaceC3407kd0Zza.zzh(this.f21542c.zza(str));
        if (runnableC4660vd0 == null) {
            this.f21543d.zzb(interfaceC3407kd0Zza.zzn());
        } else {
            runnableC4660vd0.zza(interfaceC3407kd0Zza);
            runnableC4660vd0.zzi();
        }
    }

    public final void zzc(final String str, final RunnableC4660vd0 runnableC4660vd0) {
        if (RunnableC5002yd0.zza() && ((Boolean) AbstractC3302ji.zzd.zze()).booleanValue()) {
            this.f21541b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ne0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.b(str, runnableC4660vd0);
                }
            });
        } else {
            this.f21541b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.me0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.a(str);
                }
            });
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), null);
        }
    }
}
