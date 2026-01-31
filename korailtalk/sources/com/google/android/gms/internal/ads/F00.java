package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class F00 extends AbstractBinderC1934To {

    /* renamed from: a, reason: collision with root package name */
    private final String f12904a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1852Ro f12905b;

    /* renamed from: c, reason: collision with root package name */
    private final C1203Bt f12906c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f12907d;

    /* renamed from: e, reason: collision with root package name */
    private final long f12908e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12909f;

    public F00(String str, InterfaceC1852Ro interfaceC1852Ro, C1203Bt c1203Bt, long j8) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.f12907d = jSONObject;
        this.f12909f = false;
        this.f12906c = c1203Bt;
        this.f12904a = str;
        this.f12905b = interfaceC1852Ro;
        this.f12908e = j8;
        try {
            jSONObject.put("adapter_version", interfaceC1852Ro.zzf().toString());
            jSONObject.put("sdk_version", interfaceC1852Ro.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    private final synchronized void b(String str, int i8) {
        try {
            if (this.f12909f) {
                return;
            }
            try {
                this.f12907d.put("signal_error", str);
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbC)).booleanValue()) {
                    this.f12907d.put("latency", G1.u.zzB().elapsedRealtime() - this.f12908e);
                }
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbB)).booleanValue()) {
                    this.f12907d.put("signal_error_code", i8);
                }
            } catch (JSONException unused) {
            }
            this.f12906c.zzc(this.f12907d);
            this.f12909f = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void zzb(String str, C1203Bt c1203Bt) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbB)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                c1203Bt.zzc(jSONObject);
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        b("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.f12909f) {
            return;
        }
        try {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbB)).booleanValue()) {
                this.f12907d.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f12906c.zzc(this.f12907d);
        this.f12909f = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1934To, com.google.android.gms.internal.ads.InterfaceC1975Uo
    public final synchronized void zze(String str) {
        if (this.f12909f) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.f12907d.put("signals", str);
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbC)).booleanValue()) {
                this.f12907d.put("latency", G1.u.zzB().elapsedRealtime() - this.f12908e);
            }
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbB)).booleanValue()) {
                this.f12907d.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f12906c.zzc(this.f12907d);
        this.f12909f = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1934To, com.google.android.gms.internal.ads.InterfaceC1975Uo
    public final synchronized void zzf(String str) {
        b(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1934To, com.google.android.gms.internal.ads.InterfaceC1975Uo
    public final synchronized void zzg(C0534f1 c0534f1) {
        b(c0534f1.zzb, 2);
    }
}
