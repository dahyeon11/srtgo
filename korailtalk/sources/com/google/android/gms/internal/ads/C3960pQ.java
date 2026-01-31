package com.google.android.gms.internal.ads;

import H1.C0534f1;
import H1.InterfaceC0517a;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.pQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3960pQ implements XH, InterfaceC0517a, VF, DF {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21755a;

    /* renamed from: b, reason: collision with root package name */
    private final C3403kb0 f21756b;

    /* renamed from: c, reason: collision with root package name */
    private final LQ f21757c;

    /* renamed from: d, reason: collision with root package name */
    private final C1457Ia0 f21758d;

    /* renamed from: e, reason: collision with root package name */
    private final C4654va0 f21759e;

    /* renamed from: f, reason: collision with root package name */
    private final C4535uW f21760f;

    /* renamed from: g, reason: collision with root package name */
    private final String f21761g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f21762h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f21763i = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzha)).booleanValue();

    public C3960pQ(Context context, C3403kb0 c3403kb0, LQ lq, C1457Ia0 c1457Ia0, C4654va0 c4654va0, C4535uW c4535uW, String str) {
        this.f21755a = context;
        this.f21756b = c3403kb0;
        this.f21757c = lq;
        this.f21758d = c1457Ia0;
        this.f21759e = c4654va0;
        this.f21760f = c4535uW;
        this.f21761g = str;
    }

    private final KQ a(String str) {
        KQ kqZza = this.f21757c.zza();
        kqZza.zzd(this.f21758d.zzb.zzb);
        kqZza.zzc(this.f21759e);
        kqZza.zzb("action", str);
        kqZza.zzb("ad_format", this.f21761g.toUpperCase(Locale.ROOT));
        if (!this.f21759e.zzu.isEmpty()) {
            kqZza.zzb("ancn", (String) this.f21759e.zzu.get(0));
        }
        if (this.f21759e.zzaj) {
            kqZza.zzb("device_connectivity", true != G1.u.zzo().zzA(this.f21755a) ? "offline" : androidx.browser.customtabs.b.ONLINE_EXTRAS_KEY);
            kqZza.zzb("event_timestamp", String.valueOf(G1.u.zzB().currentTimeMillis()));
            kqZza.zzb("offline_ad", "1");
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhj)).booleanValue()) {
            boolean z8 = R1.W.zzf(this.f21758d.zza.zza) != 1;
            kqZza.zzb("scar", String.valueOf(z8));
            if (z8) {
                H1.Y1 y12 = this.f21758d.zza.zza.zzd;
                kqZza.zzb("ragent", y12.zzp);
                kqZza.zzb("rtype", R1.W.zzb(R1.W.zzc(y12)));
            }
        }
        return kqZza;
    }

    private final void b(KQ kq) {
        if (!this.f21759e.zzaj) {
            kq.zzf();
            return;
        }
        this.f21760f.zzd(new C4877xW(G1.u.zzB().currentTimeMillis(), this.f21758d.zzb.zzb.zzb, kq.zze(), 2));
    }

    private final boolean c() {
        String strZzp;
        if (this.f21762h == null) {
            synchronized (this) {
                if (this.f21762h == null) {
                    String str = (String) H1.C.zzc().zza(AbstractC4439th.zzbu);
                    G1.u.zzp();
                    try {
                        strZzp = K1.K0.zzp(this.f21755a);
                    } catch (RemoteException unused) {
                        strZzp = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strZzp != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzp);
                        } catch (RuntimeException e8) {
                            G1.u.zzo().zzw(e8, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f21762h = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f21762h.booleanValue();
    }

    @Override // H1.InterfaceC0517a
    public final void onAdClicked() {
        if (this.f21759e.zzaj) {
            b(a("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.DF
    public final void zza(C0534f1 c0534f1) {
        C0534f1 c0534f12;
        if (this.f21763i) {
            KQ kqA = a("ifts");
            kqA.zzb("reason", "adapter");
            int i8 = c0534f1.zza;
            String str = c0534f1.zzb;
            if (c0534f1.zzc.equals(MobileAds.ERROR_DOMAIN) && (c0534f12 = c0534f1.zzd) != null && !c0534f12.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                C0534f1 c0534f13 = c0534f1.zzd;
                i8 = c0534f13.zza;
                str = c0534f13.zzb;
            }
            if (i8 >= 0) {
                kqA.zzb("arec", String.valueOf(i8));
            }
            String strZza = this.f21756b.zza(str);
            if (strZza != null) {
                kqA.zzb("areec", strZza);
            }
            kqA.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.DF
    public final void zzb() {
        if (this.f21763i) {
            KQ kqA = a("ifts");
            kqA.zzb("reason", "blocked");
            kqA.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.DF
    public final void zzc(LK lk) {
        if (this.f21763i) {
            KQ kqA = a("ifts");
            kqA.zzb("reason", "exception");
            if (!TextUtils.isEmpty(lk.getMessage())) {
                kqA.zzb(androidx.core.app.r.CATEGORY_MESSAGE, lk.getMessage());
            }
            kqA.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.XH
    public final void zzi() {
        if (c()) {
            a("adapter_shown").zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.XH
    public final void zzj() {
        if (c()) {
            a("adapter_impression").zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.VF
    public final void zzr() {
        if (c() || this.f21759e.zzaj) {
            b(a("impression"));
        }
    }
}
