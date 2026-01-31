package com.google.android.gms.internal.ads;

import K1.AbstractC0633e;
import K1.InterfaceC0671x0;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: com.google.android.gms.internal.ads.ss, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC4347ss implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22693a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f22694b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0671x0 f22695c;

    /* renamed from: d, reason: collision with root package name */
    private String f22696d = "-1";

    /* renamed from: e, reason: collision with root package name */
    private int f22697e = -1;

    SharedPreferencesOnSharedPreferenceChangeListenerC4347ss(Context context, InterfaceC0671x0 interfaceC0671x0) {
        this.f22694b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f22695c = interfaceC0671x0;
        this.f22693a = context;
    }

    private final void b() {
        this.f22695c.zzI(true);
        AbstractC0633e.zzc(this.f22693a);
    }

    private final void c(String str, int i8) {
        Context context;
        boolean z8 = true;
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzax)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i8 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z8 = false;
        }
        this.f22695c.zzI(z8);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgs)).booleanValue() && z8 && (context = this.f22693a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    final void a() {
        this.f22694b.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.f22694b, "gad_has_consent_for_cookies");
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzaz)).booleanValue()) {
            onSharedPreferenceChanged(this.f22694b, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(this.f22694b, "IABTCF_PurposeConsents");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "IABTCF_PurposeConsents"
            com.google.android.gms.internal.ads.kh r1 = com.google.android.gms.internal.ads.AbstractC4439th.zzaz     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "-1"
            r3 = -1
            java.lang.String r4 = "gad_has_consent_for_cookies"
            if (r1 == 0) goto L59
            boolean r0 = java.util.Objects.equals(r10, r4)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L38
            int r9 = r9.getInt(r4, r3)     // Catch: java.lang.Throwable -> L2f
            K1.x0 r10 = r8.f22695c     // Catch: java.lang.Throwable -> L2f
            int r10 = r10.zzb()     // Catch: java.lang.Throwable -> L2f
            if (r9 == r10) goto L32
            r8.b()     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r9 = move-exception
            goto Lbd
        L32:
            K1.x0 r10 = r8.f22695c     // Catch: java.lang.Throwable -> L2f
            r10.zzF(r9)     // Catch: java.lang.Throwable -> L2f
            return
        L38:
            java.lang.String r0 = "IABTCF_TCString"
            boolean r0 = java.util.Objects.equals(r10, r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto Lbc
            java.lang.String r9 = r9.getString(r10, r2)     // Catch: java.lang.Throwable -> L2f
            K1.x0 r10 = r8.f22695c     // Catch: java.lang.Throwable -> L2f
            java.lang.String r10 = r10.zzp()     // Catch: java.lang.Throwable -> L2f
            boolean r10 = java.util.Objects.equals(r9, r10)     // Catch: java.lang.Throwable -> L2f
            if (r10 != 0) goto L53
            r8.b()     // Catch: java.lang.Throwable -> L2f
        L53:
            K1.x0 r10 = r8.f22695c     // Catch: java.lang.Throwable -> L2f
            r10.zzO(r9)     // Catch: java.lang.Throwable -> L2f
            return
        L59:
            java.lang.String r1 = r9.getString(r0, r2)     // Catch: java.lang.Throwable -> L2f
            int r9 = r9.getInt(r4, r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L2f
            int r5 = r10.hashCode()     // Catch: java.lang.Throwable -> L2f
            r6 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r7 = 1
            if (r5 == r6) goto L7d
            r0 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r5 == r0) goto L75
            goto L85
        L75:
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L85
            r10 = r7
            goto L86
        L7d:
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L85
            r10 = 0
            goto L86
        L85:
            r10 = r3
        L86:
            if (r10 == 0) goto La9
            if (r10 == r7) goto L8b
            goto Lbc
        L8b:
            com.google.android.gms.internal.ads.kh r10 = com.google.android.gms.internal.ads.AbstractC4439th.zzax     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.ads.rh r0 = H1.C.zzc()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r10 = r0.zza(r10)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L2f
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L2f
            if (r10 == 0) goto Lbc
            if (r9 == r3) goto Lbc
            int r10 = r8.f22697e     // Catch: java.lang.Throwable -> L2f
            if (r10 == r9) goto Lbc
            r8.f22697e = r9     // Catch: java.lang.Throwable -> L2f
            r8.c(r1, r9)     // Catch: java.lang.Throwable -> L2f
            return
        La9:
            boolean r10 = r1.equals(r2)     // Catch: java.lang.Throwable -> L2f
            if (r10 != 0) goto Lbc
            java.lang.String r10 = r8.f22696d     // Catch: java.lang.Throwable -> L2f
            boolean r10 = r10.equals(r1)     // Catch: java.lang.Throwable -> L2f
            if (r10 != 0) goto Lbc
            r8.f22696d = r1     // Catch: java.lang.Throwable -> L2f
            r8.c(r1, r9)     // Catch: java.lang.Throwable -> L2f
        Lbc:
            return
        Lbd:
            java.lang.String r10 = "AdMobPlusIdlessListener.onSharedPreferenceChanged"
            com.google.android.gms.internal.ads.mt r0 = G1.u.zzo()
            r0.zzw(r9, r10)
            java.lang.String r10 = "onSharedPreferenceChanged, errorMessage = "
            K1.AbstractC0667v0.zzb(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC4347ss.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }
}
