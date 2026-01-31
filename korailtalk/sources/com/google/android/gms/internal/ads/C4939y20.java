package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.y20, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4939y20 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f23822a;

    /* renamed from: b, reason: collision with root package name */
    private final C3666mt f23823b;

    C4939y20(Executor executor, C3666mt c3666mt) {
        this.f23822a = executor;
        this.f23823b = c3666mt;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcJ)).booleanValue() ? AbstractC1483In0.zzh(null) : AbstractC1483In0.zzm(this.f23823b.zzk(), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.x20
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new M50() { // from class: com.google.android.gms.internal.ads.w20
                    @Override // com.google.android.gms.internal.ads.M50
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.f23822a);
    }
}
