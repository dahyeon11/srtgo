package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.k8 */
/* loaded from: classes2.dex */
final class C3355k8 implements Y7 {

    /* renamed from: a */
    private final Map f20361a = new HashMap();

    /* renamed from: b */
    private final K7 f20362b;

    /* renamed from: c */
    private final BlockingQueue f20363c;

    /* renamed from: d */
    private final P7 f20364d;

    C3355k8(K7 k72, BlockingQueue blockingQueue, P7 p72) {
        this.f20364d = p72;
        this.f20362b = k72;
        this.f20363c = blockingQueue;
    }

    final synchronized boolean a(Z7 z72) {
        try {
            Map map = this.f20361a;
            String strZzj = z72.zzj();
            if (!map.containsKey(strZzj)) {
                this.f20361a.put(strZzj, null);
                z72.h(this);
                if (C3241j8.zzb) {
                    C3241j8.zza("new request, sending to network %s", strZzj);
                }
                return false;
            }
            List arrayList = (List) this.f20361a.get(strZzj);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            z72.zzm("waiting-for-response");
            arrayList.add(z72);
            this.f20361a.put(strZzj, arrayList);
            if (C3241j8.zzb) {
                C3241j8.zza("Request for cacheKey=%s is in flight, putting on hold.", strZzj);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.Y7
    public final synchronized void zza(Z7 z72) {
        try {
            Map map = this.f20361a;
            String strZzj = z72.zzj();
            List list = (List) map.remove(strZzj);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (C3241j8.zzb) {
                C3241j8.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzj);
            }
            Z7 z73 = (Z7) list.remove(0);
            this.f20361a.put(strZzj, list);
            z73.h(this);
            try {
                this.f20363c.put(z73);
            } catch (InterruptedException e8) {
                C3241j8.zzb("Couldn't add request to queue. %s", e8.toString());
                Thread.currentThread().interrupt();
                this.f20362b.zzb();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.Y7
    public final void zzb(Z7 z72, C2554d8 c2554d8) {
        List list;
        H7 h72 = c2554d8.zzb;
        if (h72 == null || h72.a(System.currentTimeMillis())) {
            zza(z72);
            return;
        }
        String strZzj = z72.zzj();
        synchronized (this) {
            list = (List) this.f20361a.remove(strZzj);
        }
        if (list != null) {
            if (C3241j8.zzb) {
                C3241j8.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzj);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f20364d.zzb((Z7) it.next(), c2554d8, null);
            }
        }
    }
}
