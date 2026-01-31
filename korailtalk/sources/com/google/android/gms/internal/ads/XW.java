package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class XW implements YW {
    static /* synthetic */ C2597dX a(String str, String str2, String str3, ZW zw, String str4, WebView webView, String str5, String str6, EnumC2253aX enumC2253aX) {
        C1383Ge0 c1383Ge0Zza = C1383Ge0.zza("Google", str2);
        EnumC1342Fe0 enumC1342Fe0E = e("javascript");
        EnumC5004ye0 enumC5004ye0C = c(zw.toString());
        EnumC1342Fe0 enumC1342Fe0 = EnumC1342Fe0.NONE;
        if (enumC1342Fe0E == enumC1342Fe0) {
            L1.n.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (enumC5004ye0C == null) {
            L1.n.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zw)));
            return null;
        }
        EnumC1342Fe0 enumC1342Fe0E2 = e(str4);
        if (enumC5004ye0C == EnumC5004ye0.VIDEO && enumC1342Fe0E2 == enumC1342Fe0) {
            L1.n.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        C4662ve0 c4662ve0Zzb = C4662ve0.zzb(c1383Ge0Zza, webView, str5, "");
        return new C2597dX(AbstractC4434te0.zza(C4548ue0.zza(enumC5004ye0C, d(enumC2253aX.toString()), enumC1342Fe0E, enumC1342Fe0E2, true), c4662ve0Zzb), c4662ve0Zzb);
    }

    static /* synthetic */ C2597dX b(String str, String str2, String str3, String str4, ZW zw, WebView webView, String str5, String str6, EnumC2253aX enumC2253aX) {
        C1383Ge0 c1383Ge0Zza = C1383Ge0.zza(str, str2);
        EnumC1342Fe0 enumC1342Fe0E = e("javascript");
        EnumC1342Fe0 enumC1342Fe0E2 = e(str4);
        EnumC5004ye0 enumC5004ye0C = c(zw.toString());
        EnumC1342Fe0 enumC1342Fe0 = EnumC1342Fe0.NONE;
        if (enumC1342Fe0E == enumC1342Fe0) {
            L1.n.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (enumC5004ye0C == null) {
            L1.n.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zw)));
            return null;
        }
        if (enumC5004ye0C == EnumC5004ye0.VIDEO && enumC1342Fe0E2 == enumC1342Fe0) {
            L1.n.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        C4662ve0 c4662ve0Zzc = C4662ve0.zzc(c1383Ge0Zza, webView, str5, "");
        return new C2597dX(AbstractC4434te0.zza(C4548ue0.zza(enumC5004ye0C, d(enumC2253aX.toString()), enumC1342Fe0E, enumC1342Fe0E2, true), c4662ve0Zzc), c4662ve0Zzc);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.EnumC5004ye0 c(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L20
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L43
            if (r4 == r3) goto L40
            if (r4 == r2) goto L3d
            r4 = 0
            return r4
        L3d:
            com.google.android.gms.internal.ads.ye0 r4 = com.google.android.gms.internal.ads.EnumC5004ye0.VIDEO
            return r4
        L40:
            com.google.android.gms.internal.ads.ye0 r4 = com.google.android.gms.internal.ads.EnumC5004ye0.NATIVE_DISPLAY
            return r4
        L43:
            com.google.android.gms.internal.ads.ye0 r4 = com.google.android.gms.internal.ads.EnumC5004ye0.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XW.c(java.lang.String):com.google.android.gms.internal.ads.ye0");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.EnumC1178Be0 d(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 1
            r3 = 2
            if (r0 == r1) goto L2a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L20
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L44
            if (r4 == r2) goto L41
            if (r4 == r3) goto L3e
            com.google.android.gms.internal.ads.Be0 r4 = com.google.android.gms.internal.ads.EnumC1178Be0.UNSPECIFIED
            return r4
        L3e:
            com.google.android.gms.internal.ads.Be0 r4 = com.google.android.gms.internal.ads.EnumC1178Be0.ONE_PIXEL
            return r4
        L41:
            com.google.android.gms.internal.ads.Be0 r4 = com.google.android.gms.internal.ads.EnumC1178Be0.DEFINED_BY_JAVASCRIPT
            return r4
        L44:
            com.google.android.gms.internal.ads.Be0 r4 = com.google.android.gms.internal.ads.EnumC1178Be0.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XW.d(java.lang.String):com.google.android.gms.internal.ads.Be0");
    }

    private static EnumC1342Fe0 e(String str) {
        return "native".equals(str) ? EnumC1342Fe0.NATIVE : "javascript".equals(str) ? EnumC1342Fe0.JAVASCRIPT : EnumC1342Fe0.NONE;
    }

    private static final Object f(VW vw) {
        try {
            return vw.zza();
        } catch (RuntimeException e8) {
            G1.u.zzo().zzv(e8, "omid exception");
            return null;
        }
    }

    private static final void g(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e8) {
            G1.u.zzo().zzv(e8, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.YW
    public final C2597dX zza(final String str, final WebView webView, String str2, String str3, final String str4, final EnumC2253aX enumC2253aX, final ZW zw, final String str5) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeZ)).booleanValue() || !AbstractC4206re0.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (C2597dX) f(new VW(str7, str, str6, zw, str4, webView, str5, str8, enumC2253aX) { // from class: com.google.android.gms.internal.ads.LW
            public final /* synthetic */ String zzb;
            public final /* synthetic */ ZW zzd;
            public final /* synthetic */ String zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ EnumC2253aX zzi;
            public final /* synthetic */ String zza = "Google";
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zw;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = enumC2253aX;
            }

            @Override // com.google.android.gms.internal.ads.VW
            public final Object zza() {
                return XW.a(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YW
    public final C2597dX zzb(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final EnumC2253aX enumC2253aX, final ZW zw, final String str6) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeZ)).booleanValue() || !AbstractC4206re0.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (C2597dX) f(new VW(str5, str, str8, str4, zw, webView, str6, str7, enumC2253aX) { // from class: com.google.android.gms.internal.ads.OW
            public final /* synthetic */ String zza;
            public final /* synthetic */ String zzb;
            public final /* synthetic */ String zzd;
            public final /* synthetic */ ZW zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ EnumC2253aX zzi;
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zw;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = enumC2253aX;
            }

            @Override // com.google.android.gms.internal.ads.VW
            public final Object zza() {
                return XW.b(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YW
    public final C1301Ee0 zze(final L1.a aVar, final WebView webView, boolean z8) {
        final boolean z9 = true;
        return (C1301Ee0) f(new VW(webView, z9) { // from class: com.google.android.gms.internal.ads.TW
            public final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.VW
            public final Object zza() {
                L1.a aVar2 = this.zza;
                return C1301Ee0.zza(C1383Ge0.zza("Google", aVar2.buddyApkVersion + "." + aVar2.clientJarVersion), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YW
    public final String zzf(Context context) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeZ)).booleanValue()) {
            return (String) f(new VW() { // from class: com.google.android.gms.internal.ads.RW
                @Override // com.google.android.gms.internal.ads.VW
                public final Object zza() {
                    return "a.1.4.10-google_20240110";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.YW
    public final void zzg(final AbstractC4434te0 abstractC4434te0, final View view) {
        g(new Runnable() { // from class: com.google.android.gms.internal.ads.KW
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeZ)).booleanValue() && AbstractC4206re0.zzb()) {
                    abstractC4434te0.zzb(view, EnumC1137Ae0.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YW
    public final void zzh(final C1301Ee0 c1301Ee0, final View view) {
        g(new Runnable() { // from class: com.google.android.gms.internal.ads.QW
            @Override // java.lang.Runnable
            public final void run() {
                c1301Ee0.zze(view, EnumC1137Ae0.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YW
    public final void zzi(final AbstractC4434te0 abstractC4434te0) {
        g(new Runnable() { // from class: com.google.android.gms.internal.ads.UW
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeZ)).booleanValue() && AbstractC4206re0.zzb()) {
                    abstractC4434te0.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YW
    public final void zzj(final AbstractC4434te0 abstractC4434te0, final View view) {
        g(new Runnable() { // from class: com.google.android.gms.internal.ads.MW
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeZ)).booleanValue() && AbstractC4206re0.zzb()) {
                    abstractC4434te0.zzd(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YW
    public final void zzk(final AbstractC4434te0 abstractC4434te0) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeZ)).booleanValue() && AbstractC4206re0.zzb()) {
            Objects.requireNonNull(abstractC4434te0);
            g(new Runnable() { // from class: com.google.android.gms.internal.ads.NW
                @Override // java.lang.Runnable
                public final void run() {
                    abstractC4434te0.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.YW
    public final boolean zzl(final Context context) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeZ)).booleanValue()) {
            Boolean bool = (Boolean) f(new VW() { // from class: com.google.android.gms.internal.ads.PW
                @Override // com.google.android.gms.internal.ads.VW
                public final Object zza() {
                    if (AbstractC4206re0.zzb()) {
                        return Boolean.TRUE;
                    }
                    AbstractC4206re0.zza(context);
                    return Boolean.valueOf(AbstractC4206re0.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        L1.n.zzj("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.YW
    public final void zzm(final C1301Ee0 c1301Ee0, final C3786nw c3786nw) {
        g(new Runnable() { // from class: com.google.android.gms.internal.ads.SW
            @Override // java.lang.Runnable
            public final void run() {
                c1301Ee0.zzf(c3786nw);
            }
        });
    }
}
