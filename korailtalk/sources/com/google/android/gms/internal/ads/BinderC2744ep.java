package com.google.android.gms.internal.ads;

import H1.C0591z;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import r2.InterfaceC6172a;
import y1.AbstractC6517D;

/* renamed from: com.google.android.gms.internal.ads.ep */
/* loaded from: classes2.dex */
public final class BinderC2744ep extends AbstractBinderC1811Qo {

    /* renamed from: a */
    private final RtbAdapter f18826a;

    /* renamed from: b */
    private String f18827b = "";

    public BinderC2744ep(RtbAdapter rtbAdapter) {
        this.f18826a = rtbAdapter;
    }

    private final Bundle b(H1.Y1 y12) {
        Bundle bundle;
        Bundle bundle2 = y12.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f18826a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle c(String str) throws RemoteException {
        L1.n.zzj("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e8) {
            L1.n.zzh("", e8);
            throw new RemoteException();
        }
    }

    private static final boolean d(H1.Y1 y12) {
        if (y12.zzf) {
            return true;
        }
        C0591z.zzb();
        return L1.g.zzs();
    }

    private static final String e(String str, H1.Y1 y12) {
        String str2 = y12.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1811Qo, com.google.android.gms.internal.ads.InterfaceC1852Ro
    public final H1.V0 zze() {
        Object obj = this.f18826a;
        if (obj instanceof N1.E) {
            try {
                return ((N1.E) obj).getVideoController();
            } catch (Throwable th) {
                L1.n.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1811Qo, com.google.android.gms.internal.ads.InterfaceC1852Ro
    public final C2974gp zzf() {
        return C2974gp.zza(this.f18826a.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1811Qo, com.google.android.gms.internal.ads.InterfaceC1852Ro
    public final C2974gp zzg() {
        return C2974gp.zza(this.f18826a.getSDKVersionInfo());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0057  */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1811Qo, com.google.android.gms.internal.ads.InterfaceC1852Ro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(r2.InterfaceC6172a r5, java.lang.String r6, android.os.Bundle r7, android.os.Bundle r8, H1.d2 r9, com.google.android.gms.internal.ads.InterfaceC1975Uo r10) throws android.os.RemoteException {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.cp r0 = new com.google.android.gms.internal.ads.cp     // Catch: java.lang.Throwable -> L71
            r0.<init>(r4, r10)     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r10 = r4.f18826a     // Catch: java.lang.Throwable -> L71
            N1.n r1 = new N1.n     // Catch: java.lang.Throwable -> L71
            int r2 = r6.hashCode()     // Catch: java.lang.Throwable -> L71
            switch(r2) {
                case -1396342996: goto L4d;
                case -1052618729: goto L43;
                case -239580146: goto L39;
                case 604727084: goto L2f;
                case 1167692200: goto L25;
                case 1778294298: goto L1b;
                case 1911491517: goto L11;
                default: goto L10;
            }
        L10:
            goto L57
        L11:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 3
            goto L58
        L1b:
            java.lang.String r2 = "app_open_ad"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 6
            goto L58
        L25:
            java.lang.String r2 = "app_open"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 5
            goto L58
        L2f:
            java.lang.String r2 = "interstitial"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 1
            goto L58
        L39:
            java.lang.String r2 = "rewarded"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 2
            goto L58
        L43:
            java.lang.String r2 = "native"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 4
            goto L58
        L4d:
            java.lang.String r2 = "banner"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 0
            goto L58
        L57:
            r6 = -1
        L58:
            switch(r6) {
                case 0: goto L8a;
                case 1: goto L87;
                case 2: goto L84;
                case 3: goto L81;
                case 4: goto L7e;
                case 5: goto L7b;
                case 6: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L73
        L5c:
            com.google.android.gms.internal.ads.kh r6 = com.google.android.gms.internal.ads.AbstractC4439th.zzlN     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r6 = r2.zza(r6)     // Catch: java.lang.Throwable -> L71
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L71
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L71
            if (r6 == 0) goto L73
            y1.c r6 = y1.EnumC6522c.APP_OPEN_AD     // Catch: java.lang.Throwable -> L71
            goto L8c
        L71:
            r6 = move-exception
            goto Lb0
        L73:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L71
            java.lang.String r7 = "Internal Error"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L71
            throw r6     // Catch: java.lang.Throwable -> L71
        L7b:
            y1.c r6 = y1.EnumC6522c.APP_OPEN_AD     // Catch: java.lang.Throwable -> L71
            goto L8c
        L7e:
            y1.c r6 = y1.EnumC6522c.NATIVE     // Catch: java.lang.Throwable -> L71
            goto L8c
        L81:
            y1.c r6 = y1.EnumC6522c.REWARDED_INTERSTITIAL     // Catch: java.lang.Throwable -> L71
            goto L8c
        L84:
            y1.c r6 = y1.EnumC6522c.REWARDED     // Catch: java.lang.Throwable -> L71
            goto L8c
        L87:
            y1.c r6 = y1.EnumC6522c.INTERSTITIAL     // Catch: java.lang.Throwable -> L71
            goto L8c
        L8a:
            y1.c r6 = y1.EnumC6522c.BANNER     // Catch: java.lang.Throwable -> L71
        L8c:
            r1.<init>(r6, r8)     // Catch: java.lang.Throwable -> L71
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L71
            r6.<init>()     // Catch: java.lang.Throwable -> L71
            r6.add(r1)     // Catch: java.lang.Throwable -> L71
            P1.a r8 = new P1.a     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r2.b.unwrap(r5)     // Catch: java.lang.Throwable -> L71
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> L71
            int r2 = r9.zze     // Catch: java.lang.Throwable -> L71
            int r3 = r9.zzb     // Catch: java.lang.Throwable -> L71
            java.lang.String r9 = r9.zza     // Catch: java.lang.Throwable -> L71
            y1.i r9 = y1.AbstractC6517D.zzc(r2, r3, r9)     // Catch: java.lang.Throwable -> L71
            r8.<init>(r1, r6, r7, r9)     // Catch: java.lang.Throwable -> L71
            r10.collectSignals(r8, r0)     // Catch: java.lang.Throwable -> L71
            return
        Lb0:
            java.lang.String r7 = "Error generating signals for RTB"
            L1.n.zzh(r7, r6)
            java.lang.String r7 = "adapter.collectSignals"
            com.google.android.gms.internal.ads.AbstractC1727On.zza(r5, r6, r7)
            android.os.RemoteException r5 = new android.os.RemoteException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC2744ep.zzh(r2.a, java.lang.String, android.os.Bundle, android.os.Bundle, H1.d2, com.google.android.gms.internal.ads.Uo):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1811Qo, com.google.android.gms.internal.ads.InterfaceC1852Ro
    public final void zzi(String str, String str2, H1.Y1 y12, InterfaceC6172a interfaceC6172a, InterfaceC1197Bo interfaceC1197Bo, InterfaceC2096Xn interfaceC2096Xn) throws RemoteException {
        try {
            this.f18826a.loadRtbAppOpenAd(new N1.j((Context) r2.b.unwrap(interfaceC6172a), str, c(str2), b(y12), d(y12), y12.zzk, y12.zzg, y12.zzt, e(str2, y12), this.f18827b), new C2401bp(this, interfaceC1197Bo, interfaceC2096Xn));
        } catch (Throwable th) {
            L1.n.zzh("Adapter failed to render app open ad.", th);
            AbstractC1727On.zza(interfaceC6172a, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1811Qo, com.google.android.gms.internal.ads.InterfaceC1852Ro
    public final void zzj(String str, String str2, H1.Y1 y12, InterfaceC6172a interfaceC6172a, InterfaceC1320Eo interfaceC1320Eo, InterfaceC2096Xn interfaceC2096Xn, H1.d2 d2Var) throws RemoteException {
        try {
            this.f18826a.loadRtbBannerAd(new N1.l((Context) r2.b.unwrap(interfaceC6172a), str, c(str2), b(y12), d(y12), y12.zzk, y12.zzg, y12.zzt, e(str2, y12), AbstractC6517D.zzc(d2Var.zze, d2Var.zzb, d2Var.zza), this.f18827b), new C2057Wo(this, interfaceC1320Eo, interfaceC2096Xn));
        } catch (Throwable th) {
            L1.n.zzh("Adapter failed to render banner ad.", th);
            AbstractC1727On.zza(interfaceC6172a, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1811Qo, com.google.android.gms.internal.ads.InterfaceC1852Ro
    public final void zzk(String str, String str2, H1.Y1 y12, InterfaceC6172a interfaceC6172a, InterfaceC1320Eo interfaceC1320Eo, InterfaceC2096Xn interfaceC2096Xn, H1.d2 d2Var) throws RemoteException {
        try {
            this.f18826a.loadRtbInterscrollerAd(new N1.l((Context) r2.b.unwrap(interfaceC6172a), str, c(str2), b(y12), d(y12), y12.zzk, y12.zzg, y12.zzt, e(str2, y12), AbstractC6517D.zzc(d2Var.zze, d2Var.zzb, d2Var.zza), this.f18827b), new C2098Xo(this, interfaceC1320Eo, interfaceC2096Xn));
        } catch (Throwable th) {
            L1.n.zzh("Adapter failed to render interscroller ad.", th);
            AbstractC1727On.zza(interfaceC6172a, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1811Qo, com.google.android.gms.internal.ads.InterfaceC1852Ro
    public final void zzl(String str, String str2, H1.Y1 y12, InterfaceC6172a interfaceC6172a, InterfaceC1443Ho interfaceC1443Ho, InterfaceC2096Xn interfaceC2096Xn) throws RemoteException {
        try {
            this.f18826a.loadRtbInterstitialAd(new N1.r((Context) r2.b.unwrap(interfaceC6172a), str, c(str2), b(y12), d(y12), y12.zzk, y12.zzg, y12.zzt, e(str2, y12), this.f18827b), new C2139Yo(this, interfaceC1443Ho, interfaceC2096Xn));
        } catch (Throwable th) {
            L1.n.zzh("Adapter failed to render interstitial ad.", th);
            AbstractC1727On.zza(interfaceC6172a, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1811Qo, com.google.android.gms.internal.ads.InterfaceC1852Ro
    public final void zzm(String str, String str2, H1.Y1 y12, InterfaceC6172a interfaceC6172a, InterfaceC1566Ko interfaceC1566Ko, InterfaceC2096Xn interfaceC2096Xn) throws RemoteException {
        zzn(str, str2, y12, interfaceC6172a, interfaceC1566Ko, interfaceC2096Xn, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1811Qo, com.google.android.gms.internal.ads.InterfaceC1852Ro
    public final void zzn(String str, String str2, H1.Y1 y12, InterfaceC6172a interfaceC6172a, InterfaceC1566Ko interfaceC1566Ko, InterfaceC2096Xn interfaceC2096Xn, C1840Ri c1840Ri) throws RemoteException {
        try {
            this.f18826a.loadRtbNativeAdMapper(new N1.u((Context) r2.b.unwrap(interfaceC6172a), str, c(str2), b(y12), d(y12), y12.zzk, y12.zzg, y12.zzt, e(str2, y12), this.f18827b, c1840Ri), new C2180Zo(this, interfaceC1566Ko, interfaceC2096Xn));
        } catch (Throwable th) {
            L1.n.zzh("Adapter failed to render native ad.", th);
            AbstractC1727On.zza(interfaceC6172a, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                this.f18826a.loadRtbNativeAd(new N1.u((Context) r2.b.unwrap(interfaceC6172a), str, c(str2), b(y12), d(y12), y12.zzk, y12.zzg, y12.zzt, e(str2, y12), this.f18827b, c1840Ri), new C2286ap(this, interfaceC1566Ko, interfaceC2096Xn));
            } catch (Throwable th2) {
                L1.n.zzh("Adapter failed to render native ad.", th2);
                AbstractC1727On.zza(interfaceC6172a, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1811Qo, com.google.android.gms.internal.ads.InterfaceC1852Ro
    public final void zzo(String str, String str2, H1.Y1 y12, InterfaceC6172a interfaceC6172a, InterfaceC1729Oo interfaceC1729Oo, InterfaceC2096Xn interfaceC2096Xn) throws RemoteException {
        try {
            this.f18826a.loadRtbRewardedInterstitialAd(new N1.y((Context) r2.b.unwrap(interfaceC6172a), str, c(str2), b(y12), d(y12), y12.zzk, y12.zzg, y12.zzt, e(str2, y12), this.f18827b), new C2629dp(this, interfaceC1729Oo, interfaceC2096Xn));
        } catch (Throwable th) {
            L1.n.zzh("Adapter failed to render rewarded interstitial ad.", th);
            AbstractC1727On.zza(interfaceC6172a, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1811Qo, com.google.android.gms.internal.ads.InterfaceC1852Ro
    public final void zzp(String str, String str2, H1.Y1 y12, InterfaceC6172a interfaceC6172a, InterfaceC1729Oo interfaceC1729Oo, InterfaceC2096Xn interfaceC2096Xn) throws RemoteException {
        try {
            this.f18826a.loadRtbRewardedAd(new N1.y((Context) r2.b.unwrap(interfaceC6172a), str, c(str2), b(y12), d(y12), y12.zzk, y12.zzg, y12.zzt, e(str2, y12), this.f18827b), new C2629dp(this, interfaceC1729Oo, interfaceC2096Xn));
        } catch (Throwable th) {
            L1.n.zzh("Adapter failed to render rewarded ad.", th);
            AbstractC1727On.zza(interfaceC6172a, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1811Qo, com.google.android.gms.internal.ads.InterfaceC1852Ro
    public final void zzq(String str) {
        this.f18827b = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1811Qo, com.google.android.gms.internal.ads.InterfaceC1852Ro
    public final boolean zzr(InterfaceC6172a interfaceC6172a) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1811Qo, com.google.android.gms.internal.ads.InterfaceC1852Ro
    public final boolean zzs(InterfaceC6172a interfaceC6172a) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1811Qo, com.google.android.gms.internal.ads.InterfaceC1852Ro
    public final boolean zzt(InterfaceC6172a interfaceC6172a) {
        return false;
    }
}
