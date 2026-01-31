package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.Ab0 */
/* loaded from: classes2.dex */
public final class C1131Ab0 implements CF {

    /* renamed from: a */
    private final HashSet f12196a = new HashSet();

    /* renamed from: b */
    private final Context f12197b;

    /* renamed from: c */
    private final C4122qt f12198c;

    public C1131Ab0(Context context, C4122qt c4122qt) {
        this.f12197b = context;
        this.f12198c = c4122qt;
    }

    public final Bundle zzb() {
        return this.f12198c.zzn(this.f12197b, this);
    }

    public final synchronized void zzc(HashSet hashSet) {
        this.f12196a.clear();
        this.f12196a.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.CF
    public final synchronized void zzdB(C0534f1 c0534f1) {
        if (c0534f1.zza != 3) {
            this.f12198c.zzl(this.f12196a);
        }
    }
}
