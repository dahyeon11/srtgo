package com.google.android.gms.internal.ads;

import K1.InterfaceC0671x0;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class F40 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f12918a;

    /* renamed from: b, reason: collision with root package name */
    private final C1825Ra0 f12919b;

    /* renamed from: c, reason: collision with root package name */
    private final PackageInfo f12920c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0671x0 f12921d;

    public F40(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, C1825Ra0 c1825Ra0, PackageInfo packageInfo, InterfaceC0671x0 interfaceC0671x0) {
        this.f12918a = interfaceExecutorServiceC1974Un0;
        this.f12919b = c1825Ra0;
        this.f12920c = packageInfo;
        this.f12921d = interfaceC0671x0;
    }

    public static /* synthetic */ G40 zzc(final F40 f40) {
        final ArrayList arrayList = f40.f12919b.zzg;
        return arrayList == null ? new G40() { // from class: com.google.android.gms.internal.ads.C40
            @Override // com.google.android.gms.internal.ads.G40, com.google.android.gms.internal.ads.M50
            public final void zzj(Object obj) {
            }
        } : arrayList.isEmpty() ? new G40() { // from class: com.google.android.gms.internal.ads.D40
            @Override // com.google.android.gms.internal.ads.G40, com.google.android.gms.internal.ads.M50
            public final void zzj(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new G40() { // from class: com.google.android.gms.internal.ads.E40
            @Override // com.google.android.gms.internal.ads.G40, com.google.android.gms.internal.ads.M50
            public final void zzj(Object obj) {
                this.zza.a(arrayList, (Bundle) obj);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void a(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.F40.a(java.util.ArrayList, android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f12918a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.B40
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return F40.zzc(this.zza);
            }
        });
    }
}
