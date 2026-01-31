package com.google.android.gms.internal.ads;

import K1.InterfaceC0671x0;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;

/* renamed from: com.google.android.gms.internal.ads.nt */
/* loaded from: classes2.dex */
public final class C3780nt {

    /* renamed from: g */
    final String f21364g;

    /* renamed from: h */
    private final InterfaceC0671x0 f21365h;

    /* renamed from: a */
    long f21358a = -1;

    /* renamed from: b */
    long f21359b = -1;

    /* renamed from: c */
    int f21360c = -1;

    /* renamed from: d */
    int f21361d = -1;

    /* renamed from: e */
    long f21362e = 0;

    /* renamed from: f */
    private final Object f21363f = new Object();

    /* renamed from: i */
    int f21366i = 0;

    /* renamed from: j */
    int f21367j = 0;

    /* renamed from: k */
    int f21368k = 0;

    public C3780nt(String str, InterfaceC0671x0 interfaceC0671x0) {
        this.f21364g = str;
        this.f21365h = interfaceC0671x0;
    }

    private final void a() {
        if (((Boolean) AbstractC4897xi.zza.zze()).booleanValue()) {
            synchronized (this.f21363f) {
                this.f21360c--;
                this.f21361d--;
            }
        }
    }

    public final int zza() {
        int i8;
        synchronized (this.f21363f) {
            i8 = this.f21368k;
        }
        return i8;
    }

    public final Bundle zzb(Context context, String str) {
        Bundle bundle;
        synchronized (this.f21363f) {
            try {
                bundle = new Bundle();
                if (!this.f21365h.zzS()) {
                    bundle.putString("session_id", this.f21364g);
                }
                bundle.putLong("basets", this.f21359b);
                bundle.putLong("currts", this.f21358a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.f21360c);
                bundle.putInt("preqs_in_session", this.f21361d);
                bundle.putLong("time_in_session", this.f21362e);
                bundle.putInt("pclick", this.f21366i);
                bundle.putInt("pimp", this.f21367j);
                Context contextZza = AbstractC3890or.zza(context);
                int identifier = contextZza.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z8 = false;
                if (identifier == 0) {
                    L1.n.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == contextZza.getPackageManager().getActivityInfo(new ComponentName(contextZza.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                            z8 = true;
                        } else {
                            L1.n.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        L1.n.zzj("Fail to fetch AdActivity theme");
                        L1.n.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z8);
                bundle.putInt("consent_form_action_identifier", zza());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final void zzc() {
        synchronized (this.f21363f) {
            this.f21366i++;
        }
    }

    public final void zzd() {
        synchronized (this.f21363f) {
            this.f21367j++;
        }
    }

    public final void zze() {
        a();
    }

    public final void zzf() {
        a();
    }

    public final void zzg(H1.Y1 y12, long j8) {
        Bundle bundle;
        synchronized (this.f21363f) {
            try {
                long jZzd = this.f21365h.zzd();
                long jCurrentTimeMillis = G1.u.zzB().currentTimeMillis();
                if (this.f21359b == -1) {
                    if (jCurrentTimeMillis - jZzd > ((Long) H1.C.zzc().zza(AbstractC4439th.zzaU)).longValue()) {
                        this.f21361d = -1;
                    } else {
                        this.f21361d = this.f21365h.zzc();
                    }
                    this.f21359b = j8;
                    this.f21358a = j8;
                } else {
                    this.f21358a = j8;
                }
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdB)).booleanValue() || (bundle = y12.zzc) == null || bundle.getInt("gw", 2) != 1) {
                    this.f21360c++;
                    int i8 = this.f21361d + 1;
                    this.f21361d = i8;
                    if (i8 == 0) {
                        this.f21362e = 0L;
                        this.f21365h.zzE(jCurrentTimeMillis);
                    } else {
                        this.f21362e = jCurrentTimeMillis - this.f21365h.zze();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzh() {
        synchronized (this.f21363f) {
            this.f21368k++;
        }
    }
}
