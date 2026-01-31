package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import r2.InterfaceC6172a;
import y1.C6527h;
import y1.C6529j;

/* loaded from: classes2.dex */
public final class KS extends H1.N0 {

    /* renamed from: a, reason: collision with root package name */
    final Map f13804a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f13805b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f13806c;

    /* renamed from: d, reason: collision with root package name */
    private final C4987yS f13807d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f13808e;

    /* renamed from: f, reason: collision with root package name */
    private final LS f13809f;

    /* renamed from: g, reason: collision with root package name */
    private C3734nS f13810g;

    KS(Context context, WeakReference weakReference, C4987yS c4987yS, LS ls, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0) {
        this.f13805b = context;
        this.f13806c = weakReference;
        this.f13807d = c4987yS;
        this.f13808e = interfaceExecutorServiceC1974Un0;
        this.f13809f = ls;
    }

    private final Context f() {
        Context context = (Context) this.f13806c.get();
        return context == null ? this.f13805b : context;
    }

    private static C6527h g() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return ((C6527h.a) new C6527h.a().addNetworkExtrasBundle(AdMobAdapter.class, bundle)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String h(Object obj) {
        y1.y responseInfo;
        H1.S0 s0Zzc;
        if (obj instanceof y1.n) {
            responseInfo = ((y1.n) obj).getResponseInfo();
        } else if (obj instanceof A1.a) {
            responseInfo = ((A1.a) obj).getResponseInfo();
        } else if (obj instanceof M1.a) {
            responseInfo = ((M1.a) obj).getResponseInfo();
        } else if (obj instanceof U1.c) {
            responseInfo = ((U1.c) obj).getResponseInfo();
        } else if (obj instanceof V1.a) {
            responseInfo = ((V1.a) obj).getResponseInfo();
        } else if (obj instanceof C6529j) {
            responseInfo = ((C6529j) obj).getResponseInfo();
        } else {
            if (!(obj instanceof Q1.c)) {
                return "";
            }
            responseInfo = ((Q1.c) obj).getResponseInfo();
        }
        if (responseInfo == null || (s0Zzc = responseInfo.zzc()) == null) {
            return "";
        }
        try {
            return s0Zzc.zzh();
        } catch (RemoteException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void i(String str, String str2) {
        try {
            AbstractC1483In0.zzr(this.f13810g.zzb(str), new IS(this, str2), this.f13808e);
        } catch (NullPointerException e8) {
            G1.u.zzo().zzw(e8, "OutOfContextTester.setAdAsOutOfContext");
            this.f13807d.zzk(str2);
        }
    }

    private final synchronized void j(String str, String str2) {
        try {
            AbstractC1483In0.zzr(this.f13810g.zzb(str), new JS(this, str2), this.f13808e);
        } catch (NullPointerException e8) {
            G1.u.zzo().zzw(e8, "OutOfContextTester.setAdAsShown");
            this.f13807d.zzk(str2);
        }
    }

    protected final synchronized void e(String str, Object obj, String str2) {
        this.f13804a.put(str, obj);
        i(h(obj), str2);
    }

    @Override // H1.N0, H1.O0
    public final void zze(String str, InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2) {
        Context context = (Context) r2.b.unwrap(interfaceC6172a);
        ViewGroup viewGroup = (ViewGroup) r2.b.unwrap(interfaceC6172a2);
        if (context == null || viewGroup == null) {
            return;
        }
        Object obj = this.f13804a.get(str);
        if (obj != null) {
            this.f13804a.remove(str);
        }
        if (obj instanceof C6529j) {
            LS.zza(context, viewGroup, (C6529j) obj);
        } else if (obj instanceof Q1.c) {
            LS.zzb(context, viewGroup, (Q1.c) obj);
        }
    }

    public final void zzf(C3734nS c3734nS) {
        this.f13810g = c3734nS;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzh(final java.lang.String r7, java.lang.String r8, final java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.KS.zzh(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final synchronized void zzi(String str, String str2) {
        Object obj;
        try {
            Activity activityZzg = this.f13807d.zzg();
            if (activityZzg != null && (obj = this.f13804a.get(str)) != null) {
                AbstractC3414kh abstractC3414kh = AbstractC4439th.zzjt;
                if (!((Boolean) H1.C.zzc().zza(abstractC3414kh)).booleanValue() || (obj instanceof A1.a) || (obj instanceof M1.a) || (obj instanceof U1.c) || (obj instanceof V1.a)) {
                    this.f13804a.remove(str);
                }
                j(h(obj), str2);
                if (obj instanceof A1.a) {
                    ((A1.a) obj).show(activityZzg);
                    return;
                }
                if (obj instanceof M1.a) {
                    ((M1.a) obj).show(activityZzg);
                    return;
                }
                if (obj instanceof U1.c) {
                    ((U1.c) obj).show(activityZzg, new y1.t() { // from class: com.google.android.gms.internal.ads.AS
                        @Override // y1.t
                        public final void onUserEarnedReward(U1.b bVar) {
                        }
                    });
                    return;
                }
                if (obj instanceof V1.a) {
                    ((V1.a) obj).show(activityZzg, new y1.t() { // from class: com.google.android.gms.internal.ads.BS
                        @Override // y1.t
                        public final void onUserEarnedReward(U1.b bVar) {
                        }
                    });
                    return;
                }
                if (((Boolean) H1.C.zzc().zza(abstractC3414kh)).booleanValue() && ((obj instanceof C6529j) || (obj instanceof Q1.c))) {
                    Intent intent = new Intent();
                    Context contextF = f();
                    intent.setClassName(contextF, OutOfContextTestingActivity.CLASS_NAME);
                    intent.putExtra(OutOfContextTestingActivity.AD_UNIT_KEY, str);
                    G1.u.zzp();
                    K1.K0.zzT(contextF, intent);
                }
            }
        } finally {
        }
    }
}
