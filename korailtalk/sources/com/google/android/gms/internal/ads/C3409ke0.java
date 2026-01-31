package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ke0 */
/* loaded from: classes2.dex */
public final class C3409ke0 {

    /* renamed from: a */
    private final C2943gZ f20442a;

    /* renamed from: b */
    private final String f20443b;

    /* renamed from: c */
    private final String f20444c;

    /* renamed from: d */
    private final String f20445d;

    /* renamed from: e */
    private final Context f20446e;

    /* renamed from: f */
    private final C1498Ja0 f20447f;

    /* renamed from: g */
    private final C1539Ka0 f20448g;

    /* renamed from: h */
    private final o2.f f20449h;

    /* renamed from: i */
    private final C2487cb f20450i;

    public C3409ke0(C2943gZ c2943gZ, L1.a aVar, String str, String str2, Context context, C1498Ja0 c1498Ja0, C1539Ka0 c1539Ka0, o2.f fVar, C2487cb c2487cb) {
        this.f20442a = c2943gZ;
        this.f20443b = aVar.afmaVersion;
        this.f20444c = str;
        this.f20445d = str2;
        this.f20446e = context;
        this.f20447f = c1498Ja0;
        this.f20448g = c1539Ka0;
        this.f20449h = fVar;
        this.f20450i = c2487cb;
    }

    public static String c(String str) {
        return TextUtils.isEmpty(str) ? "" : L1.m.zzk() ? "fakeForAdDebugLog" : str;
    }

    private static String d(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public static final List zzf(int i8, int i9, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(d((String) it.next(), "@gw_mpe@", "2." + i9));
        }
        return arrayList;
    }

    public static final List zzg(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(d((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    public static final List zzh(List list, long j8) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(d((String) it.next(), "@gw_ttr@", Long.toString(j8, 10)));
        }
        return arrayList;
    }

    public final List zzc(C1457Ia0 c1457Ia0, C4654va0 c4654va0, List list) {
        return zzd(c1457Ia0, c4654va0, false, "", "", list);
    }

    public final List zzd(C1457Ia0 c1457Ia0, C4654va0 c4654va0, boolean z8, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z9 = true;
            String strD = d(d(d((String) it.next(), "@gw_adlocid@", c1457Ia0.zza.zza.zzf), "@gw_adnetrefresh@", true != z8 ? "0" : "1"), "@gw_sdkver@", this.f20443b);
            if (c4654va0 != null) {
                strD = AbstractC1489Is.zzc(d(d(d(strD, "@gw_qdata@", c4654va0.zzz), "@gw_adnetid@", c4654va0.zzy), "@gw_allocid@", c4654va0.zzx), this.f20446e, c4654va0.zzX, c4654va0.zzax);
            }
            String strD2 = d(d(d(d(strD, "@gw_adnetstatus@", this.f20442a.zzg()), "@gw_ttr@", Long.toString(this.f20442a.zza(), 10)), "@gw_seqnum@", this.f20444c), "@gw_sessid@", this.f20445d);
            boolean z10 = false;
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdx)).booleanValue() && !TextUtils.isEmpty(str)) {
                z10 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z11 = !zIsEmpty;
            if (z10) {
                z9 = z11;
            } else {
                if (!zIsEmpty) {
                }
                arrayList.add(strD2);
            }
            if (this.f20450i.zzf(Uri.parse(strD2))) {
                Uri.Builder builderBuildUpon = Uri.parse(strD2).buildUpon();
                if (z10) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z9) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strD2 = builderBuildUpon.build().toString();
            }
            arrayList.add(strD2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0066 A[LOOP:0: B:36:0x0060->B:38:0x0066, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zze(com.google.android.gms.internal.ads.C4654va0 r11, java.util.List r12, com.google.android.gms.internal.ads.InterfaceC4118qr r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            o2.f r1 = r10.f20449h
            long r1 = r1.currentTimeMillis()
            java.lang.String r3 = r13.zzc()     // Catch: android.os.RemoteException -> Lb1
            int r13 = r13.zzb()     // Catch: android.os.RemoteException -> Lb1
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch: android.os.RemoteException -> Lb1
            com.google.android.gms.internal.ads.kh r4 = com.google.android.gms.internal.ads.AbstractC4439th.zzdy
            com.google.android.gms.internal.ads.rh r5 = H1.C.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L39
            com.google.android.gms.internal.ads.Ka0 r4 = r10.f20448g
            if (r4 != 0) goto L32
            com.google.android.gms.internal.ads.wj0 r4 = com.google.android.gms.internal.ads.AbstractC4786wj0.zzc()
            goto L3c
        L32:
            com.google.android.gms.internal.ads.Ja0 r4 = r4.zza
        L34:
            com.google.android.gms.internal.ads.wj0 r4 = com.google.android.gms.internal.ads.AbstractC4786wj0.zzd(r4)
            goto L3c
        L39:
            com.google.android.gms.internal.ads.Ja0 r4 = r10.f20447f
            goto L34
        L3c:
            com.google.android.gms.internal.ads.he0 r5 = new com.google.android.gms.internal.ads.he0
            r5.<init>()
            com.google.android.gms.internal.ads.wj0 r5 = r4.zza(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.ie0 r7 = new com.google.android.gms.internal.ads.ie0
            r7.<init>()
            com.google.android.gms.internal.ads.wj0 r4 = r4.zza(r7)
            java.lang.Object r4 = r4.zzb(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r12 = r12.iterator()
        L60:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto Lb0
            java.lang.Object r6 = r12.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = d(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = d(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = d(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = d(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = d(r6, r7, r13)
            java.lang.String r7 = r10.f20443b
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = d(r6, r8, r7)
            android.content.Context r7 = r10.f20446e
            boolean r8 = r11.zzX
            java.util.Map r9 = r11.zzax
            java.lang.String r6 = com.google.android.gms.internal.ads.AbstractC1489Is.zzc(r6, r7, r8, r9)
            r0.add(r6)
            goto L60
        Lb0:
            return r0
        Lb1:
            r11 = move-exception
            java.lang.String r12 = "Unable to determine award type and amount."
            L1.n.zzh(r12, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3409ke0.zze(com.google.android.gms.internal.ads.va0, java.util.List, com.google.android.gms.internal.ads.qr):java.util.List");
    }
}
