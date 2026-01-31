package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.Pe0 */
/* loaded from: classes2.dex */
public final class C1751Pe0 {

    /* renamed from: c */
    private static final C1751Pe0 f15386c = new C1751Pe0();

    /* renamed from: a */
    private final ArrayList f15387a = new ArrayList();

    /* renamed from: b */
    private final ArrayList f15388b = new ArrayList();

    private C1751Pe0() {
    }

    public static C1751Pe0 zza() {
        return f15386c;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.f15388b);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.f15387a);
    }

    public final void zzd(C4890xe0 c4890xe0) {
        this.f15387a.add(c4890xe0);
    }

    public final void zze(C4890xe0 c4890xe0) {
        ArrayList arrayList = this.f15387a;
        boolean zZzg = zzg();
        arrayList.remove(c4890xe0);
        this.f15388b.remove(c4890xe0);
        if (!zZzg || zzg()) {
            return;
        }
        C2079Xe0.zzb().zzg();
    }

    public final void zzf(C4890xe0 c4890xe0) {
        ArrayList arrayList = this.f15388b;
        boolean zZzg = zzg();
        arrayList.add(c4890xe0);
        if (zZzg) {
            return;
        }
        C2079Xe0.zzb().zzf();
    }

    public final boolean zzg() {
        return this.f15388b.size() > 0;
    }
}
