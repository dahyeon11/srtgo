package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class Q50 {

    /* renamed from: a */
    private final Context f15728a;

    /* renamed from: b */
    private final Set f15729b;

    /* renamed from: c */
    private final Executor f15730c;

    /* renamed from: d */
    private final RunnableC4660vd0 f15731d;

    /* renamed from: e */
    private final LQ f15732e;

    /* renamed from: f */
    private long f15733f = 0;

    /* renamed from: g */
    private int f15734g = 0;

    public Q50(Context context, Executor executor, Set set, RunnableC4660vd0 runnableC4660vd0, LQ lq) {
        this.f15728a = context;
        this.f15730c = executor;
        this.f15729b = set;
        this.f15731d = runnableC4660vd0;
        this.f15732e = lq;
    }

    public final com.google.common.util.concurrent.C zza(final Object obj, final Bundle bundle) {
        InterfaceC3407kd0 interfaceC3407kd0Zza = AbstractC3293jd0.zza(this.f15728a, EnumC1217Cd0.CUI_NAME_ADREQUEST_SIGNALS);
        interfaceC3407kd0Zza.zzj();
        final ArrayList arrayList = new ArrayList(this.f15729b.size());
        List arrayList2 = new ArrayList();
        AbstractC3414kh abstractC3414kh = AbstractC4439th.zzlM;
        if (!((String) H1.C.zzc().zza(abstractC3414kh)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) H1.C.zzc().zza(abstractC3414kh)).split(","));
        }
        this.f15733f = G1.u.zzB().elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcd)).booleanValue() && bundle != null) {
            long jCurrentTimeMillis = G1.u.zzB().currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong(EnumC4415tQ.CLIENT_SIGNALS_START.zza(), jCurrentTimeMillis);
            } else {
                bundle.putLong(EnumC4415tQ.GMS_SIGNALS_START.zza(), jCurrentTimeMillis);
            }
        }
        for (final N50 n50 : this.f15729b) {
            if (!arrayList2.contains(String.valueOf(n50.zza()))) {
                if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzge)).booleanValue() || n50.zza() != 44) {
                    final long jElapsedRealtime = G1.u.zzB().elapsedRealtime();
                    com.google.common.util.concurrent.C cZzb = n50.zzb();
                    cZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.O50
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzb(jElapsedRealtime, n50, bundle2);
                        }
                    }, AbstractC4805wt.zzf);
                    arrayList.add(cZzb);
                }
            }
        }
        com.google.common.util.concurrent.C cZza = AbstractC1483In0.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.P50
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    M50 m50 = (M50) ((com.google.common.util.concurrent.C) it.next()).get();
                    if (m50 != null) {
                        m50.zzj(obj2);
                    }
                }
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcd)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    long jCurrentTimeMillis2 = G1.u.zzB().currentTimeMillis();
                    if (obj2 instanceof Bundle) {
                        bundle3.putLong(EnumC4415tQ.CLIENT_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                    } else {
                        bundle3.putLong(EnumC4415tQ.GMS_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("gms_sig_latency_key", bundle4);
                    }
                }
                return obj2;
            }
        }, this.f15730c);
        if (RunnableC5002yd0.zza()) {
            AbstractC4546ud0.zzb(cZza, this.f15731d, interfaceC3407kd0Zza);
        }
        return cZza;
    }

    public final void zzb(long j8, N50 n50, Bundle bundle) {
        long jElapsedRealtime = G1.u.zzB().elapsedRealtime() - j8;
        if (((Boolean) AbstractC4327si.zza.zze()).booleanValue()) {
            AbstractC0667v0.zza("Signal runtime (ms) : " + AbstractC1802Qj0.zzc(n50.getClass().getCanonicalName()) + " = " + jElapsedRealtime);
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcd)).booleanValue()) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzce)).booleanValue()) {
                synchronized (this) {
                    bundle.putLong("sig" + n50.zza(), jElapsedRealtime);
                }
            }
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcb)).booleanValue()) {
            KQ kqZza = this.f15732e.zza();
            kqZza.zzb("action", "lat_ms");
            kqZza.zzb("lat_grp", "sig_lat_grp");
            kqZza.zzb("lat_id", String.valueOf(n50.zza()));
            kqZza.zzb("clat_ms", String.valueOf(jElapsedRealtime));
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcc)).booleanValue()) {
                synchronized (this) {
                    this.f15734g++;
                }
                kqZza.zzb("seq_num", G1.u.zzo().zzh().zzd());
                synchronized (this) {
                    try {
                        if (this.f15734g == this.f15729b.size() && this.f15733f != 0) {
                            this.f15734g = 0;
                            String strValueOf = String.valueOf(G1.u.zzB().elapsedRealtime() - this.f15733f);
                            if (n50.zza() <= 39 || n50.zza() >= 52) {
                                kqZza.zzb("lat_clsg", strValueOf);
                            } else {
                                kqZza.zzb("lat_gmssg", strValueOf);
                            }
                        }
                    } finally {
                    }
                }
            }
            kqZza.zzg();
        }
    }
}
