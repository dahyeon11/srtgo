package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.n50, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3692n50 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f21198a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f21199b;

    /* renamed from: c, reason: collision with root package name */
    private final B00 f21200c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f21201d;

    /* renamed from: e, reason: collision with root package name */
    private final C1825Ra0 f21202e;

    /* renamed from: f, reason: collision with root package name */
    private final C4821x00 f21203f;

    /* renamed from: g, reason: collision with root package name */
    private final C5098zP f21204g;

    /* renamed from: h, reason: collision with root package name */
    private final TR f21205h;

    /* renamed from: i, reason: collision with root package name */
    final String f21206i;

    C3692n50(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, ScheduledExecutorService scheduledExecutorService, String str, B00 b00, Context context, C1825Ra0 c1825Ra0, C4821x00 c4821x00, C5098zP c5098zP, TR tr) {
        this.f21198a = interfaceExecutorServiceC1974Un0;
        this.f21199b = scheduledExecutorService;
        this.f21206i = str;
        this.f21200c = b00;
        this.f21201d = context;
        this.f21202e = c1825Ra0;
        this.f21203f = c4821x00;
        this.f21204g = c5098zP;
        this.f21205h = tr;
    }

    private final Bundle c(String str) {
        Bundle bundle = this.f21202e.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final AbstractC5136zn0 d(final String str, final List list, final Bundle bundle, final boolean z8, final boolean z9) {
        AbstractC5136zn0 abstractC5136zn0Zzu = AbstractC5136zn0.zzu(AbstractC1483In0.zzk(new InterfaceC3769nn0() { // from class: com.google.android.gms.internal.ads.k50
            @Override // com.google.android.gms.internal.ads.InterfaceC3769nn0
            public final com.google.common.util.concurrent.C zza() {
                return this.zza.a(str, list, bundle, z8, z9);
            }
        }, this.f21198a));
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbA)).booleanValue()) {
            abstractC5136zn0Zzu = (AbstractC5136zn0) AbstractC1483In0.zzo(abstractC5136zn0Zzu, ((Long) H1.C.zzc().zza(AbstractC4439th.zzbt)).longValue(), TimeUnit.MILLISECONDS, this.f21199b);
        }
        return (AbstractC5136zn0) AbstractC1483In0.zze(abstractC5136zn0Zzu, Throwable.class, new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.l50
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                L1.n.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.f21198a);
    }

    private final void e(InterfaceC1852Ro interfaceC1852Ro, Bundle bundle, List list, F00 f00) {
        interfaceC1852Ro.zzh(r2.b.wrap(this.f21201d), this.f21206i, bundle, (Bundle) list.get(0), this.f21202e.zze, f00);
    }

    private final void f(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            G00 g00 = (G00) ((Map.Entry) it.next()).getValue();
            String str = g00.zza;
            list.add(d(str, Collections.singletonList(g00.zze), c(str), g00.zzb, g00.zzc));
        }
    }

    public static /* synthetic */ com.google.common.util.concurrent.C zzc(C3692n50 c3692n50) {
        String lowerCase = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkR)).booleanValue() ? c3692n50.f21202e.zzf.toLowerCase(Locale.ROOT) : c3692n50.f21202e.zzf;
        final Bundle bundleZzg = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbE)).booleanValue() ? c3692n50.f21205h.zzg() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbN)).booleanValue()) {
            c3692n50.f(arrayList, c3692n50.f21200c.zza(c3692n50.f21206i, lowerCase));
        } else {
            for (Map.Entry entry : ((AbstractC2737el0) c3692n50.f21200c.zzb(c3692n50.f21206i, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                arrayList.add(c3692n50.d(str, (List) entry.getValue(), c3692n50.c(str), true, true));
            }
            c3692n50.f(arrayList, c3692n50.f21200c.zzc());
        }
        return AbstractC1483In0.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.i50
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArray = new JSONArray();
                for (com.google.common.util.concurrent.C c9 : arrayList) {
                    if (((JSONObject) c9.get()) != null) {
                        jSONArray.put(c9.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new C3806o50(jSONArray.toString(), bundleZzg);
            }
        }, c3692n50.f21198a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ com.google.common.util.concurrent.C a(java.lang.String r9, final java.util.List r10, final android.os.Bundle r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.Bt r7 = new com.google.android.gms.internal.ads.Bt
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L26
            com.google.android.gms.internal.ads.kh r13 = com.google.android.gms.internal.ads.AbstractC4439th.zzbF
            com.google.android.gms.internal.ads.rh r1 = H1.C.zzc()
            java.lang.Object r13 = r1.zza(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L26
            com.google.android.gms.internal.ads.x00 r13 = r8.f21203f
            r13.zzb(r9)
            com.google.android.gms.internal.ads.x00 r13 = r8.f21203f
            com.google.android.gms.internal.ads.Ro r13 = r13.zza(r9)
            goto L34
        L26:
            com.google.android.gms.internal.ads.zP r13 = r8.f21204g     // Catch: android.os.RemoteException -> L2d
            com.google.android.gms.internal.ads.Ro r13 = r13.zzb(r9)     // Catch: android.os.RemoteException -> L2d
            goto L34
        L2d:
            r13 = move-exception
            java.lang.String r1 = "Couldn't create RTB adapter : "
            K1.AbstractC0667v0.zzb(r1, r13)
            r13 = r0
        L34:
            if (r13 != 0) goto L4e
            com.google.android.gms.internal.ads.kh r10 = com.google.android.gms.internal.ads.AbstractC4439th.zzbv
            com.google.android.gms.internal.ads.rh r11 = H1.C.zzc()
            java.lang.Object r10 = r11.zza(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4d
            com.google.android.gms.internal.ads.F00.zzb(r9, r7)
            goto Lba
        L4d:
            throw r0
        L4e:
            com.google.android.gms.internal.ads.F00 r6 = new com.google.android.gms.internal.ads.F00
            o2.f r0 = G1.u.zzB()
            long r4 = r0.elapsedRealtime()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.kh r9 = com.google.android.gms.internal.ads.AbstractC4439th.zzbA
            com.google.android.gms.internal.ads.rh r0 = H1.C.zzc()
            java.lang.Object r9 = r0.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8d
            java.util.concurrent.ScheduledExecutorService r9 = r8.f21199b
            com.google.android.gms.internal.ads.m50 r0 = new com.google.android.gms.internal.ads.m50
            r0.<init>()
            com.google.android.gms.internal.ads.kh r1 = com.google.android.gms.internal.ads.AbstractC4439th.zzbt
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r0, r1, r3)
        L8d:
            if (r12 == 0) goto Lb7
            com.google.android.gms.internal.ads.kh r9 = com.google.android.gms.internal.ads.AbstractC4439th.zzbH
            com.google.android.gms.internal.ads.rh r12 = H1.C.zzc()
            java.lang.Object r9 = r12.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb3
            com.google.android.gms.internal.ads.Un0 r9 = r8.f21198a
            com.google.android.gms.internal.ads.j50 r12 = new com.google.android.gms.internal.ads.j50
            r0 = r12
            r1 = r8
            r2 = r13
            r3 = r11
            r4 = r10
            r5 = r6
            r6 = r7
            r0.<init>()
            r9.zza(r12)
            goto Lba
        Lb3:
            r8.e(r13, r11, r10, r6)
            goto Lba
        Lb7:
            r6.zzd()
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3692n50.a(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):com.google.common.util.concurrent.C");
    }

    final /* synthetic */ void b(InterfaceC1852Ro interfaceC1852Ro, Bundle bundle, List list, F00 f00, C1203Bt c1203Bt) {
        try {
            e(interfaceC1852Ro, bundle, list, f00);
        } catch (RemoteException e8) {
            c1203Bt.zzd(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        C1825Ra0 c1825Ra0 = this.f21202e;
        if (c1825Ra0.zzr) {
            if (!Arrays.asList(((String) H1.C.zzc().zza(AbstractC4439th.zzbG)).split(",")).contains(R1.W.zzb(R1.W.zzc(c1825Ra0.zzd)))) {
                return AbstractC1483In0.zzh(new C3806o50(new JSONArray().toString(), new Bundle()));
            }
        }
        return AbstractC1483In0.zzk(new InterfaceC3769nn0() { // from class: com.google.android.gms.internal.ads.h50
            @Override // com.google.android.gms.internal.ads.InterfaceC3769nn0
            public final com.google.common.util.concurrent.C zza() {
                return C3692n50.zzc(this.zza);
            }
        }, this.f21198a);
    }
}
