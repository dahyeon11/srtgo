package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* renamed from: com.google.android.gms.internal.ads.Af0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractAsyncTaskC1139Af0 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    private C1180Bf0 f12203a;

    /* renamed from: b, reason: collision with root package name */
    protected final C4550uf0 f12204b;

    public AbstractAsyncTaskC1139Af0(C4550uf0 c4550uf0) {
        this.f12204b = c4550uf0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        C1180Bf0 c1180Bf0 = this.f12203a;
        if (c1180Bf0 != null) {
            c1180Bf0.zza(this);
        }
    }

    public final void zzb(C1180Bf0 c1180Bf0) {
        this.f12203a = c1180Bf0;
    }
}
