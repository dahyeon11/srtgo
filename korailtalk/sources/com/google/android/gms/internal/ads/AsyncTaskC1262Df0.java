package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Df0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AsyncTaskC1262Df0 extends AbstractAsyncTaskC5120zf0 {
    public AsyncTaskC1262Df0(C4550uf0 c4550uf0, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(c4550uf0, hashSet, jSONObject, j8);
    }

    private final void b(String str) {
        C1751Pe0 c1751Pe0Zza = C1751Pe0.zza();
        if (c1751Pe0Zza != null) {
            for (C4890xe0 c4890xe0 : c1751Pe0Zza.zzc()) {
                if (this.f24193c.contains(c4890xe0.zzh())) {
                    c4890xe0.zzg().zzd(str, this.f24195e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC1139Af0
    /* renamed from: a */
    public final void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f24194d.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC1139Af0, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        b(str);
        super.onPostExecute(str);
    }
}
