package I2;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes2.dex */
final class M {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2008a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue f2009b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2010c;

    M() {
    }

    public final void zza(L l8) {
        synchronized (this.f2008a) {
            try {
                if (this.f2009b == null) {
                    this.f2009b = new ArrayDeque();
                }
                this.f2009b.add(l8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(AbstractC0608l abstractC0608l) {
        L l8;
        synchronized (this.f2008a) {
            if (this.f2009b != null && !this.f2010c) {
                this.f2010c = true;
                while (true) {
                    synchronized (this.f2008a) {
                        try {
                            l8 = (L) this.f2009b.poll();
                            if (l8 == null) {
                                this.f2010c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    l8.zzd(abstractC0608l);
                }
            }
        }
    }
}
