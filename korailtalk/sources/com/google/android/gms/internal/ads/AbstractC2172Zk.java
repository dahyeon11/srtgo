package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import K1.C0634e0;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Zk */
/* loaded from: classes2.dex */
public abstract class AbstractC2172Zk {
    public static final InterfaceC2278al zza = new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.wk
        @Override // com.google.android.gms.internal.ads.InterfaceC2278al
        public final void zza(Object obj, Map map) {
            InterfaceC1411Gw interfaceC1411Gw = (InterfaceC1411Gw) obj;
            InterfaceC2278al interfaceC2278al = AbstractC2172Zk.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                L1.n.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(",");
            HashMap map2 = new HashMap();
            PackageManager packageManager = interfaceC1411Gw.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                Boolean boolValueOf = Boolean.valueOf(packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) != null);
                map2.put(str2, boolValueOf);
                AbstractC0667v0.zza("/canOpenURLs;" + str2 + ";" + boolValueOf);
            }
            ((InterfaceC4563um) interfaceC1411Gw).zzd("openableURLs", map2);
        }
    };
    public static final InterfaceC2278al zzb = new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.yk
        @Override // com.google.android.gms.internal.ads.InterfaceC2278al
        public final void zza(Object obj, Map map) {
            InterfaceC1411Gw interfaceC1411Gw = (InterfaceC1411Gw) obj;
            InterfaceC2278al interfaceC2278al = AbstractC2172Zk.zza;
            if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzio)).booleanValue()) {
                L1.n.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                L1.n.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(interfaceC1411Gw.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            AbstractC0667v0.zza("/canOpenApp;" + str + ";" + boolValueOf);
            ((InterfaceC4563um) interfaceC1411Gw).zzd("openableApp", map2);
        }
    };
    public static final InterfaceC2278al zzc = new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.Bk
        @Override // com.google.android.gms.internal.ads.InterfaceC2278al
        public final void zza(Object obj, Map map) throws JSONException, URISyntaxException {
            AbstractC2172Zk.a((InterfaceC1411Gw) obj, map);
        }
    };
    public static final InterfaceC2278al zzd = new C1844Rk();
    public static final InterfaceC2278al zze = new C1885Sk();
    public static final InterfaceC2278al zzf = new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.Ck
        @Override // com.google.android.gms.internal.ads.InterfaceC2278al
        public final void zza(Object obj, Map map) {
            InterfaceC1411Gw interfaceC1411Gw = (InterfaceC1411Gw) obj;
            InterfaceC2278al interfaceC2278al = AbstractC2172Zk.zza;
            String str = (String) map.get("u");
            if (str == null) {
                L1.n.zzj("URL missing from httpTrack GMSG.");
            } else {
                new C0634e0(interfaceC1411Gw.getContext(), ((InterfaceC1697Nw) interfaceC1411Gw).zzn().afmaVersion, str).zzb();
            }
        }
    };
    public static final InterfaceC2278al zzg = new C1926Tk();
    public static final InterfaceC2278al zzh = new C1967Uk();
    public static final InterfaceC2278al zzi = new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.Ak
        @Override // com.google.android.gms.internal.ads.InterfaceC2278al
        public final void zza(Object obj, Map map) throws NumberFormatException {
            InterfaceC1656Mw interfaceC1656Mw = (InterfaceC1656Mw) obj;
            InterfaceC2278al interfaceC2278al = AbstractC2172Zk.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i8 = Integer.parseInt(str);
                int i9 = Integer.parseInt(str2);
                int i10 = Integer.parseInt(str3);
                C2487cb c2487cbZzI = interfaceC1656Mw.zzI();
                if (c2487cbZzI != null) {
                    c2487cbZzI.zzc().zzl(i8, i9, i10);
                }
            } catch (NumberFormatException unused) {
                L1.n.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final InterfaceC2278al zzj = new C2008Vk();
    public static final InterfaceC2278al zzk = new C2049Wk();
    public static final InterfaceC2278al zzl = new C1982Uu();
    public static final InterfaceC2278al zzm = new C2023Vu();
    public static final InterfaceC2278al zzn = new C4331sk();
    public static final C4219rl zzo = new C4219rl();
    public static final InterfaceC2278al zzp = new C2090Xk();
    public static final InterfaceC2278al zzq = new C2131Yk();
    public static final InterfaceC2278al zzr = new C1271Dk();
    public static final InterfaceC2278al zzs = new C1312Ek();
    public static final InterfaceC2278al zzt = new C1353Fk();
    public static final InterfaceC2278al zzu = new C1394Gk();
    public static final InterfaceC2278al zzv = new C1435Hk();
    public static final InterfaceC2278al zzw = new C1476Ik();
    public static final InterfaceC2278al zzx = new C1517Jk();
    public static final InterfaceC2278al zzy = new C1599Lk();
    public static final InterfaceC2278al zzz = new C1639Mk();
    public static final InterfaceC2278al zzA = new C1680Nk();
    public static final InterfaceC2278al zzB = new C1762Pk();
    public static final InterfaceC2278al zzC = new C1803Qk();

    /* JADX WARN: Removed duplicated region for block: B:114:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void a(com.google.android.gms.internal.ads.InterfaceC1411Gw r16, java.util.Map r17) throws org.json.JSONException, java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2172Zk.a(com.google.android.gms.internal.ads.Gw, java.util.Map):void");
    }

    public static com.google.common.util.concurrent.C zza(InterfaceC2065Wv interfaceC2065Wv, String str) {
        Uri uriZza = Uri.parse(str);
        try {
            C2487cb c2487cbZzI = interfaceC2065Wv.zzI();
            C1989Va0 c1989Va0ZzS = interfaceC2065Wv.zzS();
            if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlW)).booleanValue() || c1989Va0ZzS == null) {
                if (c2487cbZzI != null && c2487cbZzI.zzf(uriZza)) {
                    uriZza = c2487cbZzI.zza(uriZza, interfaceC2065Wv.getContext(), interfaceC2065Wv.zzF(), interfaceC2065Wv.zzi());
                }
            } else if (c2487cbZzI != null && c2487cbZzI.zzf(uriZza)) {
                uriZza = c1989Va0ZzS.zza(uriZza, interfaceC2065Wv.getContext(), interfaceC2065Wv.zzF(), interfaceC2065Wv.zzi());
            }
        } catch (C2602db unused) {
            L1.n.zzj("Unable to append parameter to URL: ".concat(str));
        }
        Map map = new HashMap();
        if (interfaceC2065Wv.zzD() != null) {
            map = interfaceC2065Wv.zzD().zzax;
        }
        final String strZzb = AbstractC1489Is.zzb(uriZza, interfaceC2065Wv.getContext(), map);
        long jLongValue = ((Long) AbstractC3986pi.zze.zze()).longValue();
        if (jLongValue <= 0 || jLongValue > 241806202) {
            return AbstractC1483In0.zzh(strZzb);
        }
        AbstractC5136zn0 abstractC5136zn0Zzu = AbstractC5136zn0.zzu(interfaceC2065Wv.zzT());
        InterfaceC3875oj0 interfaceC3875oj0 = new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.tk
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                InterfaceC2278al interfaceC2278al = AbstractC2172Zk.zza;
                if (!((Boolean) AbstractC3986pi.zzk.zze()).booleanValue()) {
                    return "failure_click_attok";
                }
                G1.u.zzo().zzw(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        };
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zzf;
        return AbstractC1483In0.zze(AbstractC1483In0.zzm(AbstractC1483In0.zze(abstractC5136zn0Zzu, Throwable.class, interfaceC3875oj0, interfaceExecutorServiceC1974Un0), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.uk
            /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.String r6 = (java.lang.String) r6
                    com.google.android.gms.internal.ads.al r0 = com.google.android.gms.internal.ads.AbstractC2172Zk.zza
                    java.lang.String r0 = r1
                    if (r6 != 0) goto L9
                    goto L74
                L9:
                    com.google.android.gms.internal.ads.ai r1 = com.google.android.gms.internal.ads.AbstractC3986pi.zzf
                    java.lang.Object r1 = r1.zze()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L18
                    goto L39
                L18:
                    java.lang.String r1 = ".googleadservices.com"
                    java.lang.String r2 = ".googlesyndication.com"
                    java.lang.String r3 = ".doubleclick.net"
                    java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
                    android.net.Uri r2 = android.net.Uri.parse(r0)
                    java.lang.String r2 = r2.getHost()
                    r3 = 0
                L2b:
                    r4 = 3
                    if (r3 >= r4) goto L74
                    r4 = r1[r3]
                    boolean r4 = r2.endsWith(r4)
                    if (r4 != 0) goto L39
                    int r3 = r3 + 1
                    goto L2b
                L39:
                    com.google.android.gms.internal.ads.ai r1 = com.google.android.gms.internal.ads.AbstractC3986pi.zza
                    java.lang.Object r1 = r1.zze()
                    java.lang.String r1 = (java.lang.String) r1
                    com.google.android.gms.internal.ads.ai r2 = com.google.android.gms.internal.ads.AbstractC3986pi.zzb
                    java.lang.Object r2 = r2.zze()
                    java.lang.String r2 = (java.lang.String) r2
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L53
                    java.lang.String r0 = r0.replace(r1, r6)
                L53:
                    boolean r1 = android.text.TextUtils.isEmpty(r2)
                    if (r1 != 0) goto L74
                    android.net.Uri r1 = android.net.Uri.parse(r0)
                    java.lang.String r3 = r1.getQueryParameter(r2)
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto L74
                    android.net.Uri$Builder r0 = r1.buildUpon()
                    android.net.Uri$Builder r6 = r0.appendQueryParameter(r2, r6)
                    java.lang.String r6 = r6.toString()
                    return r6
                L74:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4559uk.apply(java.lang.Object):java.lang.Object");
            }
        }, interfaceExecutorServiceC1974Un0), Throwable.class, new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.vk
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                InterfaceC2278al interfaceC2278al = AbstractC2172Zk.zza;
                if (((Boolean) AbstractC3986pi.zzk.zze()).booleanValue()) {
                    G1.u.zzo().zzw(th, "prepareClickUrl.attestation2");
                }
                return strZzb;
            }
        }, interfaceExecutorServiceC1974Un0);
    }

    public static void zzc(Map map, DJ dj) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkL)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && dj != null) {
            dj.zzdG();
        }
    }
}
