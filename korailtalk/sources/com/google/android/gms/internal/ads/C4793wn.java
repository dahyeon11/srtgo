package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.wn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4793wn implements InterfaceC4106ql {

    /* renamed from: a, reason: collision with root package name */
    private final C2135Ym f23541a;

    /* renamed from: b, reason: collision with root package name */
    private final C1203Bt f23542b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4907xn f23543c;

    public C4793wn(C4907xn c4907xn, C2135Ym c2135Ym, C1203Bt c1203Bt) {
        this.f23543c = c4907xn;
        this.f23541a = c2135Ym;
        this.f23542b = c1203Bt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4106ql
    public final void zza(String str) {
        try {
            if (str == null) {
                this.f23542b.zzd(new C3085hn());
            } else {
                this.f23542b.zzd(new C3085hn(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.f23541a.zzb();
            throw th;
        }
        this.f23541a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4106ql
    public final void zzb(JSONObject jSONObject) {
        try {
            try {
                this.f23542b.zzc(this.f23543c.f23787a.zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e8) {
                this.f23542b.zzd(e8);
            }
        } finally {
            this.f23541a.zzb();
        }
    }
}
