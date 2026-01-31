package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.sF */
/* loaded from: classes2.dex */
public final class BinderC4280sF extends H1.R0 {

    /* renamed from: a */
    private final String f22605a;

    /* renamed from: b */
    private final String f22606b;

    /* renamed from: c */
    private final String f22607c;

    /* renamed from: d */
    private final String f22608d;

    /* renamed from: e */
    private final List f22609e;

    /* renamed from: f */
    private final long f22610f;

    /* renamed from: g */
    private final String f22611g;

    /* renamed from: h */
    private final C3739nX f22612h;

    /* renamed from: i */
    private final Bundle f22613i;

    public BinderC4280sF(C4654va0 c4654va0, String str, C3739nX c3739nX, C4996ya0 c4996ya0, String str2) throws JSONException {
        String string = null;
        this.f22606b = c4654va0 == null ? null : c4654va0.zzac;
        this.f22607c = str2;
        this.f22608d = c4996ya0 == null ? null : c4996ya0.zzb;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                string = c4654va0.zzw.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f22605a = string != null ? string : str;
        this.f22609e = c3739nX.zzc();
        this.f22612h = c3739nX;
        this.f22610f = G1.u.zzB().currentTimeMillis() / 1000;
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgZ)).booleanValue() || c4996ya0 == null) {
            this.f22613i = new Bundle();
        } else {
            this.f22613i = c4996ya0.zzj;
        }
        this.f22611g = (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjl)).booleanValue() || c4996ya0 == null || TextUtils.isEmpty(c4996ya0.zzh)) ? "" : c4996ya0.zzh;
    }

    public final long zzc() {
        return this.f22610f;
    }

    public final String zzd() {
        return this.f22611g;
    }

    @Override // H1.R0, H1.S0
    public final Bundle zze() {
        return this.f22613i;
    }

    @Override // H1.R0, H1.S0
    public final H1.h2 zzf() {
        C3739nX c3739nX = this.f22612h;
        if (c3739nX != null) {
            return c3739nX.zza();
        }
        return null;
    }

    @Override // H1.R0, H1.S0
    public final String zzg() {
        return this.f22605a;
    }

    @Override // H1.R0, H1.S0
    public final String zzh() {
        return this.f22607c;
    }

    @Override // H1.R0, H1.S0
    public final String zzi() {
        return this.f22606b;
    }

    @Override // H1.R0, H1.S0
    public final List zzj() {
        return this.f22609e;
    }

    public final String zzk() {
        return this.f22608d;
    }
}
