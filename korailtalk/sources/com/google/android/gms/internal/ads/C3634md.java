package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.md */
/* loaded from: classes2.dex */
public final class C3634md {

    /* renamed from: b */
    int f20948b;

    /* renamed from: a */
    private final Object f20947a = new Object();

    /* renamed from: c */
    private final List f20949c = new LinkedList();

    public final C3520ld zza(boolean z8) {
        synchronized (this.f20947a) {
            try {
                C3520ld c3520ld = null;
                if (this.f20949c.isEmpty()) {
                    L1.n.zze("Queue empty");
                    return null;
                }
                int i8 = 0;
                if (this.f20949c.size() < 2) {
                    C3520ld c3520ld2 = (C3520ld) this.f20949c.get(0);
                    if (z8) {
                        this.f20949c.remove(0);
                    } else {
                        c3520ld2.zzi();
                    }
                    return c3520ld2;
                }
                int i9 = Integer.MIN_VALUE;
                int i10 = 0;
                for (C3520ld c3520ld3 : this.f20949c) {
                    int iZzb = c3520ld3.zzb();
                    if (iZzb > i9) {
                        i8 = i10;
                    }
                    int i11 = iZzb > i9 ? iZzb : i9;
                    if (iZzb > i9) {
                        c3520ld = c3520ld3;
                    }
                    i10++;
                    i9 = i11;
                }
                this.f20949c.remove(i8);
                return c3520ld;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(C3520ld c3520ld) {
        synchronized (this.f20947a) {
            try {
                if (this.f20949c.size() >= 10) {
                    L1.n.zze("Queue is full, current size = " + this.f20949c.size());
                    this.f20949c.remove(0);
                }
                int i8 = this.f20948b;
                this.f20948b = i8 + 1;
                c3520ld.zzj(i8);
                c3520ld.zzn();
                this.f20949c.add(c3520ld);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc(C3520ld c3520ld) {
        synchronized (this.f20947a) {
            try {
                Iterator it = this.f20949c.iterator();
                while (it.hasNext()) {
                    C3520ld c3520ld2 = (C3520ld) it.next();
                    if (G1.u.zzo().zzi().zzP()) {
                        if (!G1.u.zzo().zzi().zzQ() && !c3520ld.equals(c3520ld2) && c3520ld2.zzf().equals(c3520ld.zzf())) {
                            it.remove();
                            return true;
                        }
                    } else if (!c3520ld.equals(c3520ld2) && c3520ld2.zzd().equals(c3520ld.zzd())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd(C3520ld c3520ld) {
        synchronized (this.f20947a) {
            try {
                return this.f20949c.contains(c3520ld);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
