package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
final class QY {

    /* renamed from: c, reason: collision with root package name */
    private final C2514co0 f15812c;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC3058hZ f15815f;

    /* renamed from: h, reason: collision with root package name */
    private final String f15817h;

    /* renamed from: i, reason: collision with root package name */
    private final int f15818i;

    /* renamed from: j, reason: collision with root package name */
    private final C2943gZ f15819j;

    /* renamed from: k, reason: collision with root package name */
    private C4654va0 f15820k;

    /* renamed from: a, reason: collision with root package name */
    private final Map f15810a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f15811b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List f15813d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final Set f15814e = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private int f15816g = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15821l = false;

    QY(C1457Ia0 c1457Ia0, C2943gZ c2943gZ, C2514co0 c2514co0) {
        this.f15818i = c1457Ia0.zzb.zzb.zzq;
        this.f15819j = c2943gZ;
        this.f15812c = c2514co0;
        this.f15817h = C3741nZ.b(c1457Ia0);
        List list = c1457Ia0.zzb.zza;
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f15810a.put((C4654va0) list.get(i8), Integer.valueOf(i8));
        }
        this.f15811b.addAll(list);
    }

    private final synchronized void e() {
        this.f15819j.zzi(this.f15820k);
        InterfaceC3058hZ interfaceC3058hZ = this.f15815f;
        if (interfaceC3058hZ != null) {
            this.f15812c.zzc(interfaceC3058hZ);
        } else {
            this.f15812c.zzd(new C3399kZ(3, this.f15817h));
        }
    }

    private final synchronized boolean f(boolean z8) {
        try {
            for (C4654va0 c4654va0 : this.f15811b) {
                Integer num = (Integer) this.f15810a.get(c4654va0);
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z8 || !this.f15814e.contains(c4654va0.zzau)) {
                    int i8 = this.f15816g;
                    if (iIntValue < i8) {
                        return true;
                    }
                    if (iIntValue > i8) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean g() {
        try {
            Iterator it = this.f15813d.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.f15810a.get((C4654va0) it.next());
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.f15816g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean h() {
        if (!f(true)) {
            if (!g()) {
                return false;
            }
        }
        return true;
    }

    private final synchronized boolean i() {
        if (this.f15821l) {
            return false;
        }
        if (!this.f15811b.isEmpty() && ((C4654va0) this.f15811b.get(0)).zzaw && !this.f15813d.isEmpty()) {
            return false;
        }
        if (!d()) {
            List list = this.f15813d;
            if (list.size() < this.f15818i) {
                if (f(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    final synchronized C4654va0 a() {
        try {
            if (i()) {
                for (int i8 = 0; i8 < this.f15811b.size(); i8++) {
                    C4654va0 c4654va0 = (C4654va0) this.f15811b.get(i8);
                    String str = c4654va0.zzau;
                    if (!this.f15814e.contains(str)) {
                        if (c4654va0.zzaw) {
                            this.f15821l = true;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            this.f15814e.add(str);
                        }
                        this.f15813d.add(c4654va0);
                        return (C4654va0) this.f15811b.remove(i8);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void b(Throwable th, C4654va0 c4654va0) {
        this.f15821l = false;
        this.f15813d.remove(c4654va0);
        this.f15814e.remove(c4654va0.zzau);
        if (d() || h()) {
            return;
        }
        e();
    }

    final synchronized void c(InterfaceC3058hZ interfaceC3058hZ, C4654va0 c4654va0) {
        this.f15821l = false;
        this.f15813d.remove(c4654va0);
        if (d()) {
            interfaceC3058hZ.zzq();
            return;
        }
        Integer num = (Integer) this.f15810a.get(c4654va0);
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (iIntValue > this.f15816g) {
            this.f15819j.zzm(c4654va0);
            return;
        }
        if (this.f15815f != null) {
            this.f15819j.zzm(this.f15820k);
        }
        this.f15816g = iIntValue;
        this.f15815f = interfaceC3058hZ;
        this.f15820k = c4654va0;
        if (h()) {
            return;
        }
        e();
    }

    final synchronized boolean d() {
        return this.f15812c.isDone();
    }
}
