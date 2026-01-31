package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import y1.EnumC6522c;

/* renamed from: com.google.android.gms.internal.ads.vd0 */
/* loaded from: classes2.dex */
public final class RunnableC4660vd0 implements Runnable {

    /* renamed from: b */
    private final RunnableC5002yd0 f23287b;

    /* renamed from: d */
    private String f23289d;

    /* renamed from: f */
    private String f23291f;

    /* renamed from: g */
    private C1416Ha0 f23292g;

    /* renamed from: h */
    private C0534f1 f23293h;

    /* renamed from: i */
    private Future f23294i;

    /* renamed from: a */
    private final List f23286a = new ArrayList();

    /* renamed from: c */
    private EnumC1299Ed0 f23288c = EnumC1299Ed0.FORMAT_UNKNOWN;

    /* renamed from: e */
    private EnumC1586Ld0 f23290e = EnumC1586Ld0.SCAR_REQUEST_TYPE_UNSPECIFIED;

    RunnableC4660vd0(RunnableC5002yd0 runnableC5002yd0) {
        this.f23287b = runnableC5002yd0;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzi();
    }

    public final synchronized RunnableC4660vd0 zza(InterfaceC3407kd0 interfaceC3407kd0) {
        try {
            if (((Boolean) AbstractC3302ji.zzc.zze()).booleanValue()) {
                List list = this.f23286a;
                interfaceC3407kd0.zzk();
                list.add(interfaceC3407kd0);
                Future future = this.f23294i;
                if (future != null) {
                    future.cancel(false);
                }
                this.f23294i = AbstractC4805wt.zzd.schedule(this, ((Integer) H1.C.zzc().zza(AbstractC4439th.zziN)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized RunnableC4660vd0 zzb(String str) {
        if (((Boolean) AbstractC3302ji.zzc.zze()).booleanValue() && AbstractC4546ud0.zzf(str)) {
            this.f23289d = str;
        }
        return this;
    }

    public final synchronized RunnableC4660vd0 zzc(C0534f1 c0534f1) {
        if (((Boolean) AbstractC3302ji.zzc.zze()).booleanValue()) {
            this.f23293h = c0534f1;
        }
        return this;
    }

    public final synchronized RunnableC4660vd0 zzd(EnumC1299Ed0 enumC1299Ed0) {
        if (((Boolean) AbstractC3302ji.zzc.zze()).booleanValue()) {
            this.f23288c = enumC1299Ed0;
        }
        return this;
    }

    public final synchronized RunnableC4660vd0 zze(ArrayList arrayList) {
        try {
            if (((Boolean) AbstractC3302ji.zzc.zze()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(EnumC6522c.BANNER.name())) {
                    this.f23288c = EnumC1299Ed0.FORMAT_BANNER;
                } else if (arrayList.contains("interstitial") || arrayList.contains(EnumC6522c.INTERSTITIAL.name())) {
                    this.f23288c = EnumC1299Ed0.FORMAT_INTERSTITIAL;
                } else if (arrayList.contains("native") || arrayList.contains(EnumC6522c.NATIVE.name())) {
                    this.f23288c = EnumC1299Ed0.FORMAT_NATIVE;
                } else if (arrayList.contains("rewarded") || arrayList.contains(EnumC6522c.REWARDED.name())) {
                    this.f23288c = EnumC1299Ed0.FORMAT_REWARDED;
                } else if (arrayList.contains("app_open_ad")) {
                    this.f23288c = EnumC1299Ed0.FORMAT_APP_OPEN;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(EnumC6522c.REWARDED_INTERSTITIAL.name())) {
                    this.f23288c = EnumC1299Ed0.FORMAT_REWARDED_INTERSTITIAL;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized RunnableC4660vd0 zzf(String str) {
        if (((Boolean) AbstractC3302ji.zzc.zze()).booleanValue()) {
            this.f23291f = str;
        }
        return this;
    }

    public final synchronized RunnableC4660vd0 zzg(Bundle bundle) {
        if (((Boolean) AbstractC3302ji.zzc.zze()).booleanValue()) {
            this.f23290e = R1.W.zza(bundle);
        }
        return this;
    }

    public final synchronized RunnableC4660vd0 zzh(C1416Ha0 c1416Ha0) {
        if (((Boolean) AbstractC3302ji.zzc.zze()).booleanValue()) {
            this.f23292g = c1416Ha0;
        }
        return this;
    }

    public final synchronized void zzi() {
        try {
            if (((Boolean) AbstractC3302ji.zzc.zze()).booleanValue()) {
                Future future = this.f23294i;
                if (future != null) {
                    future.cancel(false);
                }
                for (InterfaceC3407kd0 interfaceC3407kd0 : this.f23286a) {
                    EnumC1299Ed0 enumC1299Ed0 = this.f23288c;
                    if (enumC1299Ed0 != EnumC1299Ed0.FORMAT_UNKNOWN) {
                        interfaceC3407kd0.zzd(enumC1299Ed0);
                    }
                    if (!TextUtils.isEmpty(this.f23289d)) {
                        interfaceC3407kd0.zzf(this.f23289d);
                    }
                    if (!TextUtils.isEmpty(this.f23291f) && !interfaceC3407kd0.zzm()) {
                        interfaceC3407kd0.zze(this.f23291f);
                    }
                    C1416Ha0 c1416Ha0 = this.f23292g;
                    if (c1416Ha0 != null) {
                        interfaceC3407kd0.zzb(c1416Ha0);
                    } else {
                        C0534f1 c0534f1 = this.f23293h;
                        if (c0534f1 != null) {
                            interfaceC3407kd0.zza(c0534f1);
                        }
                    }
                    interfaceC3407kd0.zzg(this.f23290e);
                    this.f23287b.zzb(interfaceC3407kd0.zzn());
                }
                this.f23286a.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
