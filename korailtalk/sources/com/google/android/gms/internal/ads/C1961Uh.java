package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Uh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1961Uh extends T1.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16703a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2002Vh f16704b;

    C1961Uh(C2002Vh c2002Vh, String str) {
        this.f16703a = str;
        this.f16704b = c2002Vh;
    }

    @Override // T1.b
    public final void onFailure(String str) {
        L1.n.zzj("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            C2002Vh c2002Vh = this.f16704b;
            c2002Vh.f16881e.postMessage(c2002Vh.b(this.f16703a, str).toString(), null);
        } catch (JSONException e8) {
            L1.n.zzh("Error creating PACT Error Response JSON: ", e8);
        }
    }

    @Override // T1.b
    public final void onSuccess(T1.a aVar) {
        String query = aVar.getQuery();
        try {
            C2002Vh c2002Vh = this.f16704b;
            c2002Vh.f16881e.postMessage(c2002Vh.c(this.f16703a, query).toString(), null);
        } catch (JSONException e8) {
            L1.n.zzh("Error creating PACT Signal Response JSON: ", e8);
        }
    }
}
