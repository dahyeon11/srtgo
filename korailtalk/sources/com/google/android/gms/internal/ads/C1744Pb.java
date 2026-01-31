package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Pb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1744Pb extends AbstractCallableC4657vc {

    /* renamed from: i, reason: collision with root package name */
    private final Activity f15381i;

    /* renamed from: j, reason: collision with root package name */
    private final View f15382j;

    public C1744Pb(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9, View view, Activity activity) {
        super(c1294Eb, "GC4CZUnPsyUcm5NrWw7C8gSktjb/gtBCDrSKBLlqImuOnQy7zHyo6XlIzkH3EMVH", "Kx8fghNUQq+sA+EfmK6qh0KjuKvw753ECuaCFV8szVM=", c3357k9, i8, 62);
        this.f15382j = view;
        this.f15381i = activity;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        if (this.f15382j == null) {
            return;
        }
        Boolean bool = (Boolean) H1.C.zzc().zza(AbstractC4439th.zzcC);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f23266f.invoke(null, this.f15382j, this.f15381i, bool);
        synchronized (this.f23265e) {
            try {
                this.f23265e.zzc(((Long) objArr[0]).longValue());
                this.f23265e.zze(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    this.f23265e.zzd((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
