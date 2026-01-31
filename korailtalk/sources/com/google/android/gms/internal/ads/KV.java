package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes2.dex */
final class KV implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1215Cc0 f13822a;

    KV(LV lv, InterfaceC1215Cc0 interfaceC1215Cc0) {
        this.f13822a = interfaceC1215Cc0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        L1.n.zzg("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f13822a.zza((SQLiteDatabase) obj);
        } catch (Exception e8) {
            L1.n.zzg("Error executing function on offline signal database: ".concat(String.valueOf(e8.getMessage())));
        }
    }
}
