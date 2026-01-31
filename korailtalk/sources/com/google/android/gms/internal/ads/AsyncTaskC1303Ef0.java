package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ef0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AsyncTaskC1303Ef0 extends AbstractAsyncTaskC5120zf0 {
    public AsyncTaskC1303Ef0(C4550uf0 c4550uf0, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(c4550uf0, hashSet, jSONObject, j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC1139Af0
    /* renamed from: a */
    public final void onPostExecute(String str) {
        C1751Pe0 c1751Pe0Zza;
        if (!TextUtils.isEmpty(str) && (c1751Pe0Zza = C1751Pe0.zza()) != null) {
            for (C4890xe0 c4890xe0 : c1751Pe0Zza.zzc()) {
                if (this.f24193c.contains(c4890xe0.zzh())) {
                    c4890xe0.zzg().zzh(str, this.f24195e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (AbstractC3297jf0.zzg(this.f24194d, this.f12204b.zza())) {
            return null;
        }
        this.f12204b.zze(this.f24194d);
        return this.f24194d.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC1139Af0, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
