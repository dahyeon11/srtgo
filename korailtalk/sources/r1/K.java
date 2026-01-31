package R1;

import Q7.C0709m;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.AbstractC4805wt;
import com.google.android.gms.internal.ads.QQ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import y1.C6527h;
import y1.EnumC6522c;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a */
    private final Map f4304a = new HashMap();

    /* renamed from: b */
    private final Map f4305b = new HashMap();

    /* renamed from: c */
    private final Context f4306c;

    /* renamed from: d */
    private final QQ f4307d;

    /* renamed from: e */
    private final ExecutorService f4308e;

    K(Context context, QQ qq, ExecutorService executorService) {
        this.f4306c = context;
        this.f4307d = qq;
        this.f4308e = executorService;
    }

    private final void f(final boolean z8) {
        Map map = this.f4305b;
        Boolean boolValueOf = Boolean.valueOf(z8);
        if (map.containsKey(boolValueOf)) {
            return;
        }
        this.f4305b.put(boolValueOf, new ArrayList());
        this.f4308e.submit(new Runnable() { // from class: R1.I
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.b(z8);
            }
        });
    }

    private final void g(M m8, Pair pair, boolean z8) {
        m8.zzd();
        T1.a aVarZzb = m8.zzb();
        if (aVarZzb != null) {
            ((T1.b) pair.first).onSuccess(aVarZzb);
        } else {
            ((T1.b) pair.first).onFailure(m8.zzc());
        }
        W.zzd(this.f4307d, null, "sgpcr", new Pair("se", "query_g"), new Pair("ad_format", EnumC6522c.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", C0709m.TRUE), new Pair("lat_ms", Long.toString(G1.u.zzB().currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z8)), new Pair("sgpc_rs", Boolean.toString(m8.zzb() != null)));
    }

    /* renamed from: h */
    public final synchronized void c(boolean z8, boolean z9) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            bundle.putBoolean("accept_3p_cookie", z8);
            Map map = this.f4304a;
            Boolean boolValueOf = Boolean.valueOf(z8);
            M m8 = (M) map.get(boolValueOf);
            int iZza = 0;
            if (z9 && m8 != null) {
                iZza = m8.zza() + 1;
            }
            int i8 = iZza;
            M m9 = (M) this.f4304a.get(boolValueOf);
            final L l8 = new L(this, z8, i8, m9 == null ? null : Boolean.valueOf(m9.zzf()), this.f4307d);
            final C6527h c6527hBuild = ((C6527h.a) new C6527h.a().addNetworkExtrasBundle(AdMobAdapter.class, bundle)).build();
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlb)).booleanValue()) {
                this.f4308e.submit(new Callable() { // from class: R1.J
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.a(c6527hBuild, l8);
                    }
                });
            } else {
                T1.a.generate(this.f4306c, EnumC6522c.BANNER, c6527hBuild, l8);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ Object a(C6527h c6527h, L l8) {
        T1.a.generate(this.f4306c, EnumC6522c.BANNER, c6527h, l8);
        return Boolean.TRUE;
    }

    final /* synthetic */ void b(boolean z8) {
        c(z8, false);
    }

    final /* synthetic */ void d(Object obj, Pair pair) {
        boolean zAcceptThirdPartyCookies = false;
        if (obj instanceof WebView) {
            CookieManager cookieManagerZza = G1.u.zzq().zza(this.f4306c);
            if (cookieManagerZza != null) {
                zAcceptThirdPartyCookies = cookieManagerZza.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = this.f4304a;
        Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
        M m8 = (M) map.get(boolValueOf);
        if (m8 != null && !m8.zze()) {
            g(m8, pair, true);
            return;
        }
        List arrayList = (List) this.f4305b.get(boolValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f4305b.put(boolValueOf, arrayList);
        }
        arrayList.add(pair);
    }

    final synchronized void e(final boolean z8, M m8) {
        try {
            Map map = this.f4304a;
            Boolean boolValueOf = Boolean.valueOf(z8);
            M m9 = (M) map.get(boolValueOf);
            if (m9 == null || m9.zze() || m9.zzb() == null || m8.zzb() != null) {
                this.f4304a.put(boolValueOf, m8);
            }
            int iIntValue = (m8.zzb() != null ? (Integer) H1.C.zzc().zza(AbstractC4439th.zzjS) : (Integer) H1.C.zzc().zza(AbstractC4439th.zzjT)).intValue();
            final boolean z9 = m8.zzb() == null;
            AbstractC4805wt.zzd.schedule(new Runnable() { // from class: R1.C
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.c(z8, z9);
                }
            }, iIntValue, TimeUnit.SECONDS);
            List list = (List) this.f4305b.get(boolValueOf);
            this.f4305b.put(boolValueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    g(m8, (Pair) it.next(), false);
                }
            }
        } finally {
        }
    }

    public final synchronized void zzb() {
        f(true);
        f(false);
    }

    public final synchronized void zzg(final Object obj, T1.b bVar) {
        final Pair pair = new Pair(bVar, Long.valueOf(G1.u.zzB().currentTimeMillis()));
        AbstractC4805wt.zze.execute(new Runnable() { // from class: R1.b
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.d(obj, pair);
            }
        });
    }
}
