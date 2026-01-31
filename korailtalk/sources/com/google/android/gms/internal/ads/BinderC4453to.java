package com.google.android.gms.internal.ads;

import H1.C0591z;
import N1.AbstractC0676a;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import r2.InterfaceC6172a;
import y1.AbstractC6517D;
import y1.C6528i;

/* renamed from: com.google.android.gms.internal.ads.to */
/* loaded from: classes2.dex */
public final class BinderC4453to extends AbstractBinderC1932Tn {

    /* renamed from: a */
    private final Object f22926a;

    /* renamed from: b */
    private C4567uo f22927b;

    /* renamed from: c */
    private InterfaceC1201Br f22928c;

    /* renamed from: d */
    private InterfaceC6172a f22929d;

    /* renamed from: e */
    private View f22930e;

    /* renamed from: f */
    private N1.D f22931f;

    /* renamed from: g */
    private N1.z f22932g;

    /* renamed from: h */
    private final String f22933h = "";

    public BinderC4453to(AbstractC0676a abstractC0676a) {
        this.f22926a = abstractC0676a;
    }

    private final Bundle f(H1.Y1 y12) {
        Bundle bundle;
        Bundle bundle2 = y12.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f22926a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle g(String str, H1.Y1 y12, String str2) throws RemoteException {
        L1.n.zze("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f22926a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (y12 != null) {
                    bundle.putInt("tagForChildDirectedTreatment", y12.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            L1.n.zzh("", th);
            throw new RemoteException();
        }
    }

    private static final boolean h(H1.Y1 y12) {
        if (y12.zzf) {
            return true;
        }
        C0591z.zzb();
        return L1.g.zzs();
    }

    private static final String i(String str, H1.Y1 y12) {
        String str2 = y12.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzA(InterfaceC6172a interfaceC6172a, H1.Y1 y12, String str, InterfaceC2096Xn interfaceC2096Xn) throws RemoteException {
        Object obj = this.f22926a;
        if (!(obj instanceof AbstractC0676a)) {
            L1.n.zzj(AbstractC0676a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        L1.n.zze("Requesting rewarded ad from adapter.");
        try {
            ((AbstractC0676a) this.f22926a).loadRewardedAd(new N1.y((Context) r2.b.unwrap(interfaceC6172a), "", g(str, y12, null), f(y12), h(y12), y12.zzk, y12.zzg, y12.zzt, i(str, y12), ""), new C4225ro(this, interfaceC2096Xn));
        } catch (Exception e8) {
            L1.n.zzh("", e8);
            AbstractC1727On.zza(interfaceC6172a, e8, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzB(H1.Y1 y12, String str, String str2) throws RemoteException {
        Object obj = this.f22926a;
        if (obj instanceof AbstractC0676a) {
            zzA(this.f22929d, y12, str, new BinderC4681vo((AbstractC0676a) obj, this.f22928c));
            return;
        }
        L1.n.zzj(AbstractC0676a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzC(InterfaceC6172a interfaceC6172a, H1.Y1 y12, String str, InterfaceC2096Xn interfaceC2096Xn) throws RemoteException {
        Object obj = this.f22926a;
        if (obj instanceof AbstractC0676a) {
            L1.n.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                ((AbstractC0676a) this.f22926a).loadRewardedInterstitialAd(new N1.y((Context) r2.b.unwrap(interfaceC6172a), "", g(str, y12, null), f(y12), h(y12), y12.zzk, y12.zzg, y12.zzt, i(str, y12), ""), new C4225ro(this, interfaceC2096Xn));
                return;
            } catch (Exception e8) {
                AbstractC1727On.zza(interfaceC6172a, e8, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        L1.n.zzj(AbstractC0676a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzD(InterfaceC6172a interfaceC6172a) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzE() throws RemoteException {
        Object obj = this.f22926a;
        if (obj instanceof N1.g) {
            try {
                ((N1.g) obj).onPause();
            } catch (Throwable th) {
                L1.n.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzF() throws RemoteException {
        Object obj = this.f22926a;
        if (obj instanceof N1.g) {
            try {
                ((N1.g) obj).onResume();
            } catch (Throwable th) {
                L1.n.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzG(boolean z8) {
        Object obj = this.f22926a;
        if (obj instanceof N1.C) {
            try {
                ((N1.C) obj).onImmersiveModeUpdated(z8);
                return;
            } catch (Throwable th) {
                L1.n.zzh("", th);
                return;
            }
        }
        L1.n.zze(N1.C.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzH(InterfaceC6172a interfaceC6172a) throws RemoteException {
        Object obj = this.f22926a;
        if (obj instanceof AbstractC0676a) {
            L1.n.zze("Show app open ad from adapter.");
            L1.n.zzg("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        L1.n.zzj(AbstractC0676a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzI() throws RemoteException {
        Object obj = this.f22926a;
        if (obj instanceof MediationInterstitialAdapter) {
            L1.n.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f22926a).showInterstitial();
                return;
            } catch (Throwable th) {
                L1.n.zzh("", th);
                throw new RemoteException();
            }
        }
        L1.n.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzJ(InterfaceC6172a interfaceC6172a) throws RemoteException {
        Object obj = this.f22926a;
        if ((obj instanceof AbstractC0676a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                zzI();
                return;
            } else {
                L1.n.zze("Show interstitial ad from adapter.");
                L1.n.zzg("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        L1.n.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + AbstractC0676a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzK(InterfaceC6172a interfaceC6172a) throws RemoteException {
        Object obj = this.f22926a;
        if (obj instanceof AbstractC0676a) {
            L1.n.zze("Show rewarded ad from adapter.");
            L1.n.zzg("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        L1.n.zzj(AbstractC0676a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzL() throws RemoteException {
        Object obj = this.f22926a;
        if (obj instanceof AbstractC0676a) {
            L1.n.zzg("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        L1.n.zzj(AbstractC0676a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final boolean zzM() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final boolean zzN() throws RemoteException {
        Object obj = this.f22926a;
        if ((obj instanceof AbstractC0676a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f22928c != null;
        }
        Object obj2 = this.f22926a;
        L1.n.zzj(AbstractC0676a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final C2513co zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final C2742eo zzP() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final H1.V0 zzh() {
        Object obj = this.f22926a;
        if (obj instanceof N1.E) {
            try {
                return ((N1.E) obj).getVideoController();
            } catch (Throwable th) {
                L1.n.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final InterfaceC4899xj zzi() {
        C5013yj c5013yjZzc;
        C4567uo c4567uo = this.f22927b;
        if (c4567uo == null || (c5013yjZzc = c4567uo.zzc()) == null) {
            return null;
        }
        return c5013yjZzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final InterfaceC2284ao zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final InterfaceC3087ho zzk() {
        N1.D dZza;
        Object obj = this.f22926a;
        if (obj instanceof MediationNativeAdapter) {
            C4567uo c4567uo = this.f22927b;
            if (c4567uo == null || (dZza = c4567uo.zza()) == null) {
                return null;
            }
            return new BinderC5023yo(dZza);
        }
        if (!(obj instanceof AbstractC0676a)) {
            return null;
        }
        N1.z zVar = this.f22932g;
        if (zVar != null) {
            return new BinderC4795wo(zVar);
        }
        N1.D d9 = this.f22931f;
        if (d9 != null) {
            return new BinderC5023yo(d9);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final C2974gp zzl() {
        Object obj = this.f22926a;
        if (obj instanceof AbstractC0676a) {
            return C2974gp.zza(((AbstractC0676a) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final C2974gp zzm() {
        Object obj = this.f22926a;
        if (obj instanceof AbstractC0676a) {
            return C2974gp.zza(((AbstractC0676a) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final InterfaceC6172a zzn() throws RemoteException {
        Object obj = this.f22926a;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return r2.b.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                L1.n.zzh("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof AbstractC0676a) {
            return r2.b.wrap(this.f22930e);
        }
        L1.n.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + AbstractC0676a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzo() throws RemoteException {
        Object obj = this.f22926a;
        if (obj instanceof N1.g) {
            try {
                ((N1.g) obj).onDestroy();
            } catch (Throwable th) {
                L1.n.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzp(InterfaceC6172a interfaceC6172a, H1.Y1 y12, String str, InterfaceC1201Br interfaceC1201Br, String str2) throws RemoteException {
        Object obj = this.f22926a;
        if ((obj instanceof AbstractC0676a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f22929d = interfaceC6172a;
            this.f22928c = interfaceC1201Br;
            interfaceC1201Br.zzl(r2.b.wrap(this.f22926a));
            return;
        }
        Object obj2 = this.f22926a;
        L1.n.zzj(AbstractC0676a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0070  */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzq(r2.InterfaceC6172a r6, com.google.android.gms.internal.ads.InterfaceC2280am r7, java.util.List r8) throws android.os.RemoteException {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f22926a
            boolean r0 = r0 instanceof N1.AbstractC0676a
            if (r0 == 0) goto Lb8
            com.google.android.gms.internal.ads.mo r0 = new com.google.android.gms.internal.ads.mo
            r0.<init>(r5, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r8.iterator()
        L14:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Laa
            java.lang.Object r1 = r8.next()
            com.google.android.gms.internal.ads.gm r1 = (com.google.android.gms.internal.ads.C2968gm) r1
            java.lang.String r2 = r1.zza
            int r3 = r2.hashCode()
            switch(r3) {
                case -1396342996: goto L66;
                case -1052618729: goto L5c;
                case -239580146: goto L52;
                case 604727084: goto L48;
                case 1167692200: goto L3e;
                case 1778294298: goto L34;
                case 1911491517: goto L2a;
                default: goto L29;
            }
        L29:
            goto L70
        L2a:
            java.lang.String r3 = "rewarded_interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 3
            goto L71
        L34:
            java.lang.String r3 = "app_open_ad"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 6
            goto L71
        L3e:
            java.lang.String r3 = "app_open"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 5
            goto L71
        L48:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 1
            goto L71
        L52:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 2
            goto L71
        L5c:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 4
            goto L71
        L66:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 0
            goto L71
        L70:
            r2 = -1
        L71:
            r3 = 0
            switch(r2) {
                case 0: goto L9a;
                case 1: goto L97;
                case 2: goto L94;
                case 3: goto L91;
                case 4: goto L8e;
                case 5: goto L8b;
                case 6: goto L76;
                default: goto L75;
            }
        L75:
            goto L9c
        L76:
            com.google.android.gms.internal.ads.kh r2 = com.google.android.gms.internal.ads.AbstractC4439th.zzlN
            com.google.android.gms.internal.ads.rh r4 = H1.C.zzc()
            java.lang.Object r2 = r4.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L9c
            y1.c r3 = y1.EnumC6522c.APP_OPEN_AD
            goto L9c
        L8b:
            y1.c r3 = y1.EnumC6522c.APP_OPEN_AD
            goto L9c
        L8e:
            y1.c r3 = y1.EnumC6522c.NATIVE
            goto L9c
        L91:
            y1.c r3 = y1.EnumC6522c.REWARDED_INTERSTITIAL
            goto L9c
        L94:
            y1.c r3 = y1.EnumC6522c.REWARDED
            goto L9c
        L97:
            y1.c r3 = y1.EnumC6522c.INTERSTITIAL
            goto L9c
        L9a:
            y1.c r3 = y1.EnumC6522c.BANNER
        L9c:
            if (r3 == 0) goto L14
            N1.n r2 = new N1.n
            android.os.Bundle r1 = r1.zzb
            r2.<init>(r3, r1)
            r7.add(r2)
            goto L14
        Laa:
            java.lang.Object r8 = r5.f22926a
            N1.a r8 = (N1.AbstractC0676a) r8
            java.lang.Object r6 = r2.b.unwrap(r6)
            android.content.Context r6 = (android.content.Context) r6
            r8.initialize(r6, r0, r7)
            return
        Lb8:
            android.os.RemoteException r6 = new android.os.RemoteException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC4453to.zzq(r2.a, com.google.android.gms.internal.ads.am, java.util.List):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzr(InterfaceC6172a interfaceC6172a, InterfaceC1201Br interfaceC1201Br, List list) throws RemoteException {
        L1.n.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzs(H1.Y1 y12, String str) throws RemoteException {
        zzB(y12, str, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzt(InterfaceC6172a interfaceC6172a, H1.Y1 y12, String str, InterfaceC2096Xn interfaceC2096Xn) throws RemoteException {
        Object obj = this.f22926a;
        if (!(obj instanceof AbstractC0676a)) {
            L1.n.zzj(AbstractC0676a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        L1.n.zze("Requesting app open ad from adapter.");
        try {
            ((AbstractC0676a) this.f22926a).loadAppOpenAd(new N1.j((Context) r2.b.unwrap(interfaceC6172a), "", g(str, y12, null), f(y12), h(y12), y12.zzk, y12.zzg, y12.zzt, i(str, y12), ""), new C4339so(this, interfaceC2096Xn));
        } catch (Exception e8) {
            L1.n.zzh("", e8);
            AbstractC1727On.zza(interfaceC6172a, e8, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzu(InterfaceC6172a interfaceC6172a, H1.d2 d2Var, H1.Y1 y12, String str, InterfaceC2096Xn interfaceC2096Xn) throws RemoteException {
        zzv(interfaceC6172a, d2Var, y12, str, null, interfaceC2096Xn);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzv(InterfaceC6172a interfaceC6172a, H1.d2 d2Var, H1.Y1 y12, String str, String str2, InterfaceC2096Xn interfaceC2096Xn) throws RemoteException {
        Object obj = this.f22926a;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof AbstractC0676a)) {
            L1.n.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + AbstractC0676a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        L1.n.zze("Requesting banner ad from adapter.");
        C6528i c6528iZzd = d2Var.zzn ? AbstractC6517D.zzd(d2Var.zze, d2Var.zzb) : AbstractC6517D.zzc(d2Var.zze, d2Var.zzb, d2Var.zza);
        Object obj2 = this.f22926a;
        if (!(obj2 instanceof MediationBannerAdapter)) {
            if (obj2 instanceof AbstractC0676a) {
                try {
                    ((AbstractC0676a) obj2).loadBannerAd(new N1.l((Context) r2.b.unwrap(interfaceC6172a), "", g(str, y12, str2), f(y12), h(y12), y12.zzk, y12.zzg, y12.zzt, i(str, y12), c6528iZzd, this.f22933h), new C3770no(this, interfaceC2096Xn));
                    return;
                } catch (Throwable th) {
                    L1.n.zzh("", th);
                    AbstractC1727On.zza(interfaceC6172a, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
            List list = y12.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j8 = y12.zzb;
            C3428ko c3428ko = new C3428ko(j8 == -1 ? null : new Date(j8), y12.zzd, hashSet, y12.zzk, h(y12), y12.zzg, y12.zzr, y12.zzt, i(str, y12));
            Bundle bundle = y12.zzm;
            mediationBannerAdapter.requestBannerAd((Context) r2.b.unwrap(interfaceC6172a), new C4567uo(interfaceC2096Xn), g(str, y12, str2), c6528iZzd, c3428ko, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            L1.n.zzh("", th2);
            AbstractC1727On.zza(interfaceC6172a, th2, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzw(InterfaceC6172a interfaceC6172a, H1.d2 d2Var, H1.Y1 y12, String str, String str2, InterfaceC2096Xn interfaceC2096Xn) throws RemoteException {
        Object obj = this.f22926a;
        if (!(obj instanceof AbstractC0676a)) {
            L1.n.zzj(AbstractC0676a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        L1.n.zze("Requesting interscroller ad from adapter.");
        try {
            AbstractC0676a abstractC0676a = (AbstractC0676a) this.f22926a;
            abstractC0676a.loadInterscrollerAd(new N1.l((Context) r2.b.unwrap(interfaceC6172a), "", g(str, y12, str2), f(y12), h(y12), y12.zzk, y12.zzg, y12.zzt, i(str, y12), AbstractC6517D.zze(d2Var.zze, d2Var.zzb), ""), new C3542lo(this, interfaceC2096Xn, abstractC0676a));
        } catch (Exception e8) {
            L1.n.zzh("", e8);
            AbstractC1727On.zza(interfaceC6172a, e8, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzx(InterfaceC6172a interfaceC6172a, H1.Y1 y12, String str, InterfaceC2096Xn interfaceC2096Xn) throws RemoteException {
        zzy(interfaceC6172a, y12, str, null, interfaceC2096Xn);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzy(InterfaceC6172a interfaceC6172a, H1.Y1 y12, String str, String str2, InterfaceC2096Xn interfaceC2096Xn) throws RemoteException {
        Object obj = this.f22926a;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof AbstractC0676a)) {
            L1.n.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + AbstractC0676a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        L1.n.zze("Requesting interstitial ad from adapter.");
        Object obj2 = this.f22926a;
        if (!(obj2 instanceof MediationInterstitialAdapter)) {
            if (obj2 instanceof AbstractC0676a) {
                try {
                    ((AbstractC0676a) obj2).loadInterstitialAd(new N1.r((Context) r2.b.unwrap(interfaceC6172a), "", g(str, y12, str2), f(y12), h(y12), y12.zzk, y12.zzg, y12.zzt, i(str, y12), this.f22933h), new C3884oo(this, interfaceC2096Xn));
                    return;
                } catch (Throwable th) {
                    L1.n.zzh("", th);
                    AbstractC1727On.zza(interfaceC6172a, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
            List list = y12.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j8 = y12.zzb;
            C3428ko c3428ko = new C3428ko(j8 == -1 ? null : new Date(j8), y12.zzd, hashSet, y12.zzk, h(y12), y12.zzg, y12.zzr, y12.zzt, i(str, y12));
            Bundle bundle = y12.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((Context) r2.b.unwrap(interfaceC6172a), new C4567uo(interfaceC2096Xn), g(str, y12, str2), c3428ko, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            L1.n.zzh("", th2);
            AbstractC1727On.zza(interfaceC6172a, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1932Tn, com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzz(InterfaceC6172a interfaceC6172a, H1.Y1 y12, String str, String str2, InterfaceC2096Xn interfaceC2096Xn, C1840Ri c1840Ri, List list) throws RemoteException {
        Object obj = this.f22926a;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof AbstractC0676a)) {
            L1.n.zzj(MediationNativeAdapter.class.getCanonicalName() + " or " + AbstractC0676a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        L1.n.zze("Requesting native ad from adapter.");
        Object obj2 = this.f22926a;
        if (obj2 instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                List list2 = y12.zze;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j8 = y12.zzb;
                C4909xo c4909xo = new C4909xo(j8 == -1 ? null : new Date(j8), y12.zzd, hashSet, y12.zzk, h(y12), y12.zzg, c1840Ri, list, y12.zzr, y12.zzt, i(str, y12));
                Bundle bundle = y12.zzm;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f22927b = new C4567uo(interfaceC2096Xn);
                mediationNativeAdapter.requestNativeAd((Context) r2.b.unwrap(interfaceC6172a), this.f22927b, g(str, y12, str2), c4909xo, bundle2);
                return;
            } catch (Throwable th) {
                L1.n.zzh("", th);
                AbstractC1727On.zza(interfaceC6172a, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (obj2 instanceof AbstractC0676a) {
            try {
                ((AbstractC0676a) obj2).loadNativeAdMapper(new N1.u((Context) r2.b.unwrap(interfaceC6172a), "", g(str, y12, str2), f(y12), h(y12), y12.zzk, y12.zzg, y12.zzt, i(str, y12), this.f22933h, c1840Ri), new C4112qo(this, interfaceC2096Xn));
            } catch (Throwable th2) {
                L1.n.zzh("", th2);
                AbstractC1727On.zza(interfaceC6172a, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    ((AbstractC0676a) this.f22926a).loadNativeAd(new N1.u((Context) r2.b.unwrap(interfaceC6172a), "", g(str, y12, str2), f(y12), h(y12), y12.zzk, y12.zzg, y12.zzt, i(str, y12), this.f22933h, c1840Ri), new C3998po(this, interfaceC2096Xn));
                } catch (Throwable th3) {
                    L1.n.zzh("", th3);
                    AbstractC1727On.zza(interfaceC6172a, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    public BinderC4453to(N1.g gVar) {
        this.f22926a = gVar;
    }
}
