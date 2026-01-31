package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.google.android.gms.internal.ads.tW */
/* loaded from: classes2.dex */
final class C4421tW implements InterfaceC1319En0 {

    /* renamed from: a */
    final /* synthetic */ InterfaceC1215Cc0 f22873a;

    C4421tW(C4535uW c4535uW, InterfaceC1215Cc0 interfaceC1215Cc0) {
        this.f22873a = interfaceC1215Cc0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        L1.n.zzg("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f22873a.zza((SQLiteDatabase) obj);
        } catch (Exception e8) {
            L1.n.zzg("Error executing function on offline buffered ping database: ".concat(String.valueOf(e8.getMessage())));
        }
    }
}
