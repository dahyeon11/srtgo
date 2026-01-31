package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.yf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5006yf0 implements InterfaceC2120Ye0 {

    /* renamed from: i, reason: collision with root package name */
    private static final C5006yf0 f23985i = new C5006yf0();

    /* renamed from: j, reason: collision with root package name */
    private static final Handler f23986j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f23987k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f23988l = new RunnableC4778wf0();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f23989m = new RunnableC4892xf0();

    /* renamed from: b, reason: collision with root package name */
    private int f23991b;

    /* renamed from: h, reason: collision with root package name */
    private long f23997h;

    /* renamed from: a, reason: collision with root package name */
    private final List f23990a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f23992c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List f23993d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final C4436tf0 f23995f = new C4436tf0();

    /* renamed from: e, reason: collision with root package name */
    private final C2267af0 f23994e = new C2267af0();

    /* renamed from: g, reason: collision with root package name */
    private final C4550uf0 f23996g = new C4550uf0(new C1180Bf0());

    C5006yf0() {
    }

    static /* bridge */ /* synthetic */ void e(C5006yf0 c5006yf0) throws JSONException {
        c5006yf0.f23991b = 0;
        c5006yf0.f23993d.clear();
        c5006yf0.f23992c = false;
        for (C4890xe0 c4890xe0 : C1751Pe0.zza().zzb()) {
        }
        c5006yf0.f23997h = System.nanoTime();
        c5006yf0.f23995f.zzi();
        long jNanoTime = System.nanoTime();
        InterfaceC2161Ze0 interfaceC2161Ze0Zza = c5006yf0.f23994e.zza();
        if (c5006yf0.f23995f.zze().size() > 0) {
            Iterator it = c5006yf0.f23995f.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject jSONObjectZza = interfaceC2161Ze0Zza.zza(null);
                View viewZza = c5006yf0.f23995f.zza(str);
                InterfaceC2161Ze0 interfaceC2161Ze0Zzb = c5006yf0.f23994e.zzb();
                String strZzc = c5006yf0.f23995f.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = interfaceC2161Ze0Zzb.zza(viewZza);
                    AbstractC3297jf0.zzb(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e8) {
                        AbstractC3411kf0.zza("Error with setting not visible reason", e8);
                    }
                    AbstractC3297jf0.zzc(jSONObjectZza, jSONObjectZza2);
                }
                AbstractC3297jf0.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                c5006yf0.f23996g.zzc(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        if (c5006yf0.f23995f.zzf().size() > 0) {
            JSONObject jSONObjectZza3 = interfaceC2161Ze0Zza.zza(null);
            c5006yf0.f(null, interfaceC2161Ze0Zza, jSONObjectZza3, 1, false);
            AbstractC3297jf0.zzf(jSONObjectZza3);
            c5006yf0.f23996g.zzd(jSONObjectZza3, c5006yf0.f23995f.zzf(), jNanoTime);
        } else {
            c5006yf0.f23996g.zzb();
        }
        c5006yf0.f23995f.zzg();
        long jNanoTime2 = System.nanoTime() - c5006yf0.f23997h;
        if (c5006yf0.f23990a.size() > 0) {
            Iterator it2 = c5006yf0.f23990a.iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.f.a(it2.next());
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                throw null;
            }
        }
    }

    private final void f(View view, InterfaceC2161Ze0 interfaceC2161Ze0, JSONObject jSONObject, int i8, boolean z8) {
        interfaceC2161Ze0.zzb(view, jSONObject, this, i8 == 1, z8);
    }

    private static final void g() {
        Handler handler = f23987k;
        if (handler != null) {
            handler.removeCallbacks(f23989m);
            f23987k = null;
        }
    }

    public static C5006yf0 zzd() {
        return f23985i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2120Ye0
    public final void zza(View view, InterfaceC2161Ze0 interfaceC2161Ze0, JSONObject jSONObject, boolean z8) throws JSONException {
        int iZzk;
        boolean z9;
        if (AbstractC4095qf0.zza(view) != null || (iZzk = this.f23995f.zzk(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = interfaceC2161Ze0.zza(view);
        AbstractC3297jf0.zzc(jSONObject, jSONObjectZza);
        String strZzd = this.f23995f.zzd(view);
        if (strZzd != null) {
            AbstractC3297jf0.zzb(jSONObjectZza, strZzd);
            try {
                jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.f23995f.zzj(view)));
            } catch (JSONException e8) {
                AbstractC3411kf0.zza("Error with setting has window focus", e8);
            }
            this.f23995f.zzh();
        } else {
            C4322sf0 c4322sf0Zzb = this.f23995f.zzb(view);
            if (c4322sf0Zzb != null) {
                C1874Se0 c1874Se0Zza = c4322sf0Zzb.zza();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListZzb = c4322sf0Zzb.zzb();
                int size = arrayListZzb.size();
                for (int i8 = 0; i8 < size; i8++) {
                    jSONArray.put((String) arrayListZzb.get(i8));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", c1874Se0Zza.zzd());
                    jSONObjectZza.put("friendlyObstructionPurpose", c1874Se0Zza.zza());
                    jSONObjectZza.put("friendlyObstructionReason", c1874Se0Zza.zzc());
                } catch (JSONException e9) {
                    AbstractC3411kf0.zza("Error with setting friendly obstruction", e9);
                }
                z9 = true;
            } else {
                z9 = false;
            }
            f(view, interfaceC2161Ze0, jSONObjectZza, iZzk, z8 || z9);
        }
        this.f23991b++;
    }

    public final void zzh() {
        g();
    }

    public final void zzi() {
        if (f23987k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f23987k = handler;
            handler.post(f23988l);
            f23987k.postDelayed(f23989m, 200L);
        }
    }

    public final void zzj() {
        g();
        this.f23990a.clear();
        f23986j.post(new RunnableC4664vf0(this));
    }
}
