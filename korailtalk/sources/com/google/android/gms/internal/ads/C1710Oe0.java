package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Oe0 */
/* loaded from: classes2.dex */
public final class C1710Oe0 extends C1833Re0 {

    /* renamed from: d */
    private static final C1710Oe0 f15144d = new C1710Oe0();

    private C1710Oe0() {
    }

    public static C1710Oe0 zza() {
        return f15144d;
    }

    @Override // com.google.android.gms.internal.ads.C1833Re0
    public final void zzb(boolean z8) {
        Iterator it = C1751Pe0.zza().zzc().iterator();
        while (it.hasNext()) {
            ((C4890xe0) it.next()).zzg().zzk(z8);
        }
    }

    @Override // com.google.android.gms.internal.ads.C1833Re0
    public final boolean zzc() {
        Iterator it = C1751Pe0.zza().zzb().iterator();
        while (it.hasNext()) {
            View viewZzf = ((C4890xe0) it.next()).zzf();
            if (viewZzf != null && viewZzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
