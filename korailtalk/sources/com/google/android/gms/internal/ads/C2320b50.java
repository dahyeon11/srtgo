package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.b50 */
/* loaded from: classes2.dex */
public final class C2320b50 implements N50 {

    /* renamed from: a */
    private final Context f18085a;

    /* renamed from: b */
    private final InterfaceExecutorServiceC1974Un0 f18086b;

    /* renamed from: c */
    private final C1825Ra0 f18087c;

    /* renamed from: d */
    private final L1.a f18088d;

    C2320b50(Context context, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, C1825Ra0 c1825Ra0, L1.a aVar) {
        this.f18085a = context;
        this.f18086b = interfaceExecutorServiceC1974Un0;
        this.f18087c = c1825Ra0;
        this.f18088d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0059 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:40:0x0000, B:42:0x0015, B:44:0x0027, B:48:0x0033, B:53:0x0059, B:54:0x007d, B:56:0x008f, B:58:0x00a5, B:60:0x00ae, B:65:0x00d4, B:67:0x00ee, B:68:0x0112, B:70:0x011d, B:63:0x00c2, B:51:0x0047), top: B:74:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d4 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:40:0x0000, B:42:0x0015, B:44:0x0027, B:48:0x0033, B:53:0x0059, B:54:0x007d, B:56:0x008f, B:58:0x00a5, B:60:0x00ae, B:65:0x00d4, B:67:0x00ee, B:68:0x0112, B:70:0x011d, B:63:0x00c2, B:51:0x0047), top: B:74:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ com.google.android.gms.internal.ads.C2434c50 a() {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2320b50.a():com.google.android.gms.internal.ads.c50");
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f18086b.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.a50
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
    }
}
