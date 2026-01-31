package com.google.android.gms.internal.ads;

import K1.InterfaceC0671x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class VQ {

    /* renamed from: e, reason: collision with root package name */
    private final String f16855e;

    /* renamed from: f, reason: collision with root package name */
    private final QQ f16856f;

    /* renamed from: b, reason: collision with root package name */
    private final List f16852b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f16853c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16854d = false;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0671x0 f16851a = G1.u.zzo().zzi();

    public VQ(String str, QQ qq) {
        this.f16855e = str;
        this.f16856f = qq;
    }

    private final Map a() {
        Map mapZza = this.f16856f.zza();
        mapZza.put("tms", Long.toString(G1.u.zzB().elapsedRealtime(), 10));
        mapZza.put("tid", this.f16851a.zzS() ? "" : this.f16855e);
        return mapZza;
    }

    public final synchronized void zza(String str) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzca)).booleanValue()) {
            Map mapA = a();
            mapA.put("action", "aaia");
            mapA.put("aair", "MalformedJson");
            this.f16852b.add(mapA);
        }
    }

    public final synchronized void zzb(String str, String str2) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzca)).booleanValue()) {
            Map mapA = a();
            mapA.put("action", "adapter_init_finished");
            mapA.put("ancn", str);
            mapA.put("rqe", str2);
            this.f16852b.add(mapA);
        }
    }

    public final synchronized void zzc(String str) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzca)).booleanValue()) {
            Map mapA = a();
            mapA.put("action", "adapter_init_started");
            mapA.put("ancn", str);
            this.f16852b.add(mapA);
        }
    }

    public final synchronized void zzd(String str) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzca)).booleanValue()) {
            Map mapA = a();
            mapA.put("action", "adapter_init_finished");
            mapA.put("ancn", str);
            this.f16852b.add(mapA);
        }
    }

    public final synchronized void zze() {
        try {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzca)).booleanValue() && !this.f16854d) {
                Map mapA = a();
                mapA.put("action", "init_finished");
                this.f16852b.add(mapA);
                Iterator it = this.f16852b.iterator();
                while (it.hasNext()) {
                    this.f16856f.zzf((Map) it.next());
                }
                this.f16854d = true;
            }
        } finally {
        }
    }

    public final synchronized void zzf() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzca)).booleanValue() && !this.f16853c) {
            Map mapA = a();
            mapA.put("action", "init_started");
            this.f16852b.add(mapA);
            this.f16853c = true;
        }
    }
}
