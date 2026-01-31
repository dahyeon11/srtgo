package com.google.android.gms.internal.ads;

import K1.AbstractC0633e;
import K1.AbstractC0667v0;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class TQ {

    /* renamed from: c */
    protected final Context f16470c;

    /* renamed from: d */
    protected final Executor f16471d;

    /* renamed from: e */
    protected final L1.s f16472e;

    /* renamed from: g */
    private final S1.c f16474g;

    /* renamed from: a */
    protected final String f16468a = (String) AbstractC3416ki.zzb.zze();

    /* renamed from: b */
    protected final Map f16469b = new HashMap();

    /* renamed from: j */
    private final AtomicBoolean f16477j = new AtomicBoolean();

    /* renamed from: k */
    private final AtomicReference f16478k = new AtomicReference(new Bundle());

    /* renamed from: f */
    protected final boolean f16473f = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbY)).booleanValue();

    /* renamed from: h */
    private final boolean f16475h = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcb)).booleanValue();

    /* renamed from: i */
    private final boolean f16476i = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhk)).booleanValue();

    protected TQ(Executor executor, L1.s sVar, S1.c cVar, Context context) {
        this.f16471d = executor;
        this.f16472e = sVar;
        this.f16474g = cVar;
        this.f16470c = context;
    }

    private final void a(Map map, boolean z8) {
        if (map.isEmpty()) {
            L1.n.zze("Empty paramMap.");
            return;
        }
        if (map.isEmpty()) {
            L1.n.zze("Empty or null paramMap.");
        } else {
            if (!this.f16477j.getAndSet(true)) {
                final String str = (String) H1.C.zzc().zza(AbstractC4439th.zzkz);
                this.f16478k.set(AbstractC0633e.zza(this.f16470c, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.SQ
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                        this.zza.c(str, sharedPreferences, str2);
                    }
                }));
            }
            Bundle bundle = (Bundle) this.f16478k.get();
            for (String str2 : bundle.keySet()) {
                map.put(str2, String.valueOf(bundle.get(str2)));
            }
        }
        final String strGenerateUrl = this.f16474g.generateUrl(map);
        AbstractC0667v0.zza(strGenerateUrl);
        boolean z9 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f16473f) {
            if (!z8 || this.f16475h) {
                if (!z9 || this.f16476i) {
                    this.f16471d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.RQ
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.f16472e.zza(strGenerateUrl);
                        }
                    });
                }
            }
        }
    }

    protected final String b(Map map) {
        return this.f16474g.generateUrl(map);
    }

    final /* synthetic */ void c(String str, SharedPreferences sharedPreferences, String str2) {
        this.f16478k.set(AbstractC0633e.zzb(this.f16470c, str));
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.f16469b);
    }

    public final void zze(Map map) {
        a(map, true);
    }

    public final void zzf(Map map) {
        a(map, false);
    }
}
