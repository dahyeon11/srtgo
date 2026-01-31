package R1;

import Q7.C0709m;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.AbstractC4805wt;
import com.google.android.gms.internal.ads.FQ;
import com.google.android.gms.internal.ads.QQ;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: h, reason: collision with root package name */
    private final QQ f4331h;

    /* renamed from: i, reason: collision with root package name */
    private Map f4332i;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f4329f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f4330g = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    private final int f4324a = ((Integer) H1.C.zzc().zza(AbstractC4439th.zzhh)).intValue();

    /* renamed from: b, reason: collision with root package name */
    private final long f4325b = ((Long) H1.C.zzc().zza(AbstractC4439th.zzhi)).longValue();

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4326c = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhn)).booleanValue();

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4327d = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhl)).booleanValue();

    /* renamed from: e, reason: collision with root package name */
    private final Map f4328e = Collections.synchronizedMap(new P(this));

    public Q(QQ qq) {
        this.f4331h = qq;
    }

    private final synchronized void d(final FQ fq) {
        if (this.f4326c) {
            ArrayDeque arrayDeque = this.f4330g;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f4329f;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            AbstractC4805wt.zza.execute(new Runnable() { // from class: R1.O
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.zza.c(fq, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    private final void e(FQ fq, ArrayDeque arrayDeque, String str) throws JSONException {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(fq.zzb());
            this.f4332i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f4332i.put("e_r", str);
            this.f4332i.put("e_id", (String) pair2.first);
            if (this.f4327d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(W.zzb(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                g(this.f4332i, "e_type", (String) pair.first);
                g(this.f4332i, "e_agent", (String) pair.second);
            }
            this.f4331h.zzf(this.f4332i);
        }
    }

    private final synchronized void f() {
        long jCurrentTimeMillis = G1.u.zzB().currentTimeMillis();
        try {
            Iterator it = this.f4328e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.f4325b) {
                    break;
                }
                this.f4330g.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e8) {
            G1.u.zzo().zzw(e8, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void g(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    final /* synthetic */ void c(FQ fq, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) throws JSONException {
        e(fq, arrayDeque, "to");
        e(fq, arrayDeque2, "of");
    }

    public final synchronized String zzb(String str, FQ fq) {
        Pair pair = (Pair) this.f4328e.get(str);
        fq.zzb().put("request_id", str);
        if (pair == null) {
            fq.zzb().put("mhit", C0709m.FALSE);
            return null;
        }
        String str2 = (String) pair.second;
        this.f4328e.remove(str);
        fq.zzb().put("mhit", C0709m.TRUE);
        return str2;
    }

    public final synchronized void zzd(String str, String str2, FQ fq) {
        this.f4328e.put(str, new Pair(Long.valueOf(G1.u.zzB().currentTimeMillis()), str2));
        f();
        d(fq);
    }

    public final synchronized void zzf(String str) {
        this.f4328e.remove(str);
    }
}
