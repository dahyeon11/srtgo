package com.google.android.gms.internal.ads;

import H1.C0591z;
import H1.InterfaceC0517a;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.nl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3764nl implements InterfaceC2278al {

    /* renamed from: a, reason: collision with root package name */
    private final G1.b f21337a;

    /* renamed from: b, reason: collision with root package name */
    private final LQ f21338b;

    /* renamed from: d, reason: collision with root package name */
    private final C4114qp f21340d;

    /* renamed from: e, reason: collision with root package name */
    private final C4535uW f21341e;

    /* renamed from: f, reason: collision with root package name */
    private final IA f21342f;

    /* renamed from: g, reason: collision with root package name */
    private J1.F f21343g = null;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f21344h = AbstractC4805wt.zzf;

    /* renamed from: c, reason: collision with root package name */
    private final L1.s f21339c = new L1.s(null);

    public C3764nl(G1.b bVar, C4114qp c4114qp, C4535uW c4535uW, LQ lq, IA ia) {
        this.f21337a = bVar;
        this.f21340d = c4114qp;
        this.f21341e = c4535uW;
        this.f21338b = lq;
        this.f21342f = ia;
    }

    static Uri a(Context context, C2487cb c2487cb, Uri uri, View view, Activity activity, C1989Va0 c1989Va0) {
        if (c2487cb == null) {
            return uri;
        }
        try {
            if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlW)).booleanValue() || c1989Va0 == null) {
                if (c2487cb.zze(uri)) {
                    uri = c2487cb.zza(uri, context, view, activity);
                }
            } else if (c2487cb.zze(uri)) {
                uri = c1989Va0.zza(uri, context, view, activity);
            }
        } catch (C2602db unused) {
        } catch (Exception e8) {
            G1.u.zzo().zzw(e8, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    static Uri b(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e8) {
            L1.n.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e8);
        }
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.String r29, H1.InterfaceC0517a r30, java.util.Map r31, java.lang.String r32) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3764nl.e(java.lang.String, H1.a, java.util.Map, java.lang.String):void");
    }

    private final void f(Context context, String str, String str2) {
        this.f21341e.zzc(str);
        LQ lq = this.f21338b;
        if (lq != null) {
            GW.zzc(context, lq, this.f21341e, str, "dialog_not_shown", AbstractC2737el0.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0152, code lost:
    
        r21 = r6;
        r10 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g(H1.InterfaceC0517a r20, java.util.Map r21, boolean r22, java.lang.String r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3764nl.g(H1.a, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void h(boolean z8) {
        C4114qp c4114qp = this.f21340d;
        if (c4114qp != null) {
            c4114qp.zza(z8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) H1.C.zzc().zza(com.google.android.gms.internal.ads.AbstractC4439th.zziz)).booleanValue() : ((java.lang.Boolean) H1.C.zzc().zza(com.google.android.gms.internal.ads.AbstractC4439th.zziy)).booleanValue()) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean i(H1.InterfaceC0517a r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3764nl.i(H1.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(int i8) {
        String str;
        LQ lq = this.f21338b;
        if (lq == null) {
            return;
        }
        KQ kqZza = lq.zza();
        kqZza.zzb("action", "cct_action");
        switch (i8) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            default:
                str = "WRONG_EXP_SETUP";
                break;
        }
        kqZza.zzb("cct_open_status", str);
        kqZza.zzf();
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C.equalsIgnoreCase(str) ? 14 : -1;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        InterfaceC0517a interfaceC0517a = (InterfaceC0517a) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) interfaceC0517a;
        if (interfaceC2065Wv.zzD() != null) {
            map2 = interfaceC2065Wv.zzD().zzax;
        }
        String strZzc = AbstractC1489Is.zzc(str, interfaceC2065Wv.getContext(), true, map2);
        String str2 = (String) map.get(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A);
        if (str2 == null) {
            L1.n.zzj("Action missing from an open GMSG.");
            return;
        }
        G1.b bVar = this.f21337a;
        if (bVar == null || bVar.zzc()) {
            AbstractC1483In0.zzr((((Boolean) H1.C.zzc().zza(AbstractC4439th.zzka)).booleanValue() && this.f21342f != null && IA.zzj(strZzc)) ? this.f21342f.zzb(strZzc, C0591z.zze()) : AbstractC1483In0.zzh(strZzc), new C3195il(this, map, interfaceC0517a, str2), this.f21344h);
        } else {
            this.f21337a.zzb(strZzc);
        }
    }
}
