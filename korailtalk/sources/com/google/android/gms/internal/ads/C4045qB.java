package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.qB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4045qB implements InterfaceC1992Vc {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC2065Wv f21871a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f21872b;

    /* renamed from: c, reason: collision with root package name */
    private final C2331bB f21873c;

    /* renamed from: d, reason: collision with root package name */
    private final o2.f f21874d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21875e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21876f = false;

    /* renamed from: g, reason: collision with root package name */
    private final C2674eB f21877g = new C2674eB();

    public C4045qB(Executor executor, C2331bB c2331bB, o2.f fVar) {
        this.f21872b = executor;
        this.f21873c = c2331bB;
        this.f21874d = fVar;
    }

    private final void b() {
        try {
            final JSONObject jSONObjectZzb = this.f21873c.zzb(this.f21877g);
            if (this.f21871a != null) {
                this.f21872b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.pB
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.a(jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e8) {
            AbstractC0667v0.zzb("Failed to call video active view js", e8);
        }
    }

    final /* synthetic */ void a(JSONObject jSONObject) {
        this.f21871a.zzl("AFMA_updateActiveView", jSONObject);
    }

    public final void zza() {
        this.f21875e = false;
    }

    public final void zzb() {
        this.f21875e = true;
        b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992Vc
    public final void zzdp(C1951Uc c1951Uc) {
        boolean z8 = this.f21876f ? false : c1951Uc.zzj;
        C2674eB c2674eB = this.f21877g;
        c2674eB.zza = z8;
        c2674eB.zzd = this.f21874d.elapsedRealtime();
        this.f21877g.zzf = c1951Uc;
        if (this.f21875e) {
            b();
        }
    }

    public final void zze(boolean z8) {
        this.f21876f = z8;
    }

    public final void zzf(InterfaceC2065Wv interfaceC2065Wv) {
        this.f21871a = interfaceC2065Wv;
    }
}
