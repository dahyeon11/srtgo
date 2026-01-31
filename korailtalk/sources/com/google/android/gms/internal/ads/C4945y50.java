package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.y50, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4945y50 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final C1407Gs f23836a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f23837b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f23838c;

    public C4945y50(C1407Gs c1407Gs, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, Context context) {
        this.f23836a = c1407Gs;
        this.f23837b = interfaceExecutorServiceC1974Un0;
        this.f23838c = context;
    }

    final /* synthetic */ C5059z50 a() {
        if (!this.f23836a.zzp(this.f23838c)) {
            return new C5059z50(null, null, null, null, null);
        }
        String strZzd = this.f23836a.zzd(this.f23838c);
        String str = strZzd == null ? "" : strZzd;
        String strZzb = this.f23836a.zzb(this.f23838c);
        String str2 = strZzb == null ? "" : strZzb;
        String strZza = this.f23836a.zza(this.f23838c);
        String str3 = strZza == null ? "" : strZza;
        String str4 = true != this.f23836a.zzp(this.f23838c) ? null : "fa";
        return new C5059z50(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) H1.C.zzc().zza(AbstractC4439th.zzag) : null);
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f23837b.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.x50
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
    }
}
