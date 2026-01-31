package I6;

import e3.w;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    private final d f2347a;

    /* renamed from: b, reason: collision with root package name */
    private final K6.c f2348b;

    /* renamed from: c, reason: collision with root package name */
    private int f2349c = 65535;

    /* renamed from: d, reason: collision with root package name */
    private final c f2350d = new c(0, 65535, null);

    public interface b {
        void onSentBytes(int i8);
    }

    public final class c {

        /* renamed from: b, reason: collision with root package name */
        private Runnable f2352b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2353c;

        /* renamed from: d, reason: collision with root package name */
        private int f2354d;

        /* renamed from: e, reason: collision with root package name */
        private int f2355e;

        /* renamed from: f, reason: collision with root package name */
        private final b f2356f;

        /* renamed from: a, reason: collision with root package name */
        private final P7.c f2351a = new P7.c();

        /* renamed from: g, reason: collision with root package name */
        private boolean f2357g = false;

        c(int i8, int i9, b bVar) {
            this.f2353c = i8;
            this.f2354d = i9;
            this.f2356f = bVar;
        }

        void a(int i8) {
            this.f2355e += i8;
        }

        int b() {
            return this.f2355e;
        }

        void c() {
            this.f2355e = 0;
        }

        void d(P7.c cVar, int i8, boolean z8) {
            this.f2351a.write(cVar, i8);
            this.f2357g |= z8;
        }

        boolean e() {
            return this.f2351a.size() > 0;
        }

        int f(int i8) {
            if (i8 <= 0 || Integer.MAX_VALUE - i8 >= this.f2354d) {
                int i9 = this.f2354d + i8;
                this.f2354d = i9;
                return i9;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f2353c);
        }

        void g(Runnable runnable) {
            w.checkState(this.f2352b == null, "pending data notification already requested");
            this.f2352b = runnable;
        }

        int h() {
            return Math.max(0, Math.min(this.f2354d, (int) this.f2351a.size()));
        }

        int i() {
            return h() - this.f2355e;
        }

        int j() {
            return this.f2354d;
        }

        int k() {
            return Math.min(this.f2354d, q.this.f2350d.j());
        }

        void l(P7.c cVar, int i8, boolean z8) {
            do {
                int iMin = Math.min(i8, q.this.f2348b.maxDataLength());
                int i9 = -iMin;
                q.this.f2350d.f(i9);
                f(i9);
                try {
                    q.this.f2348b.data(cVar.size() == ((long) iMin) && z8, this.f2353c, cVar, iMin);
                    this.f2356f.onSentBytes(iMin);
                    i8 -= iMin;
                } catch (IOException e8) {
                    throw new RuntimeException(e8);
                }
            } while (i8 > 0);
        }

        int m(int i8, e eVar) {
            Runnable runnable;
            int iMin = Math.min(i8, k());
            int size = 0;
            while (e() && iMin > 0) {
                if (iMin >= this.f2351a.size()) {
                    size += (int) this.f2351a.size();
                    P7.c cVar = this.f2351a;
                    l(cVar, (int) cVar.size(), this.f2357g);
                } else {
                    size += iMin;
                    l(this.f2351a, iMin, false);
                }
                eVar.b();
                iMin = Math.min(i8 - size, k());
            }
            if (!e() && (runnable = this.f2352b) != null) {
                runnable.run();
                this.f2352b = null;
            }
            return size;
        }
    }

    public interface d {
        c[] getActiveStreams();
    }

    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        int f2359a;

        private e() {
        }

        boolean a() {
            return this.f2359a > 0;
        }

        void b() {
            this.f2359a++;
        }
    }

    public q(d dVar, K6.c cVar) {
        this.f2347a = (d) w.checkNotNull(dVar, androidx.core.app.r.CATEGORY_TRANSPORT);
        this.f2348b = (K6.c) w.checkNotNull(cVar, "frameWriter");
    }

    public c createState(b bVar, int i8) {
        return new c(i8, this.f2349c, (b) w.checkNotNull(bVar, "stream"));
    }

    public void data(boolean z8, c cVar, P7.c cVar2, boolean z9) {
        w.checkNotNull(cVar2, "source");
        int iK = cVar.k();
        boolean zE = cVar.e();
        int size = (int) cVar2.size();
        if (zE || iK < size) {
            if (!zE && iK > 0) {
                cVar.l(cVar2, iK, false);
            }
            cVar.d(cVar2, (int) cVar2.size(), z8);
        } else {
            cVar.l(cVar2, size, z8);
        }
        if (z9) {
            flush();
        }
    }

    public void flush() {
        try {
            this.f2348b.flush();
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    public boolean initialOutboundWindowSize(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Invalid initial window size: " + i8);
        }
        int i9 = i8 - this.f2349c;
        this.f2349c = i8;
        for (c cVar : this.f2347a.getActiveStreams()) {
            cVar.f(i9);
        }
        return i9 > 0;
    }

    public void notifyWhenNoPendingData(c cVar, Runnable runnable) {
        w.checkNotNull(runnable, "noPendingDataRunnable");
        if (cVar.e()) {
            cVar.g(runnable);
        } else {
            runnable.run();
        }
    }

    public int windowUpdate(c cVar, int i8) {
        if (cVar == null) {
            int iF = this.f2350d.f(i8);
            writeStreams();
            return iF;
        }
        int iF2 = cVar.f(i8);
        e eVar = new e();
        cVar.m(cVar.k(), eVar);
        if (eVar.a()) {
            flush();
        }
        return iF2;
    }

    public void writeStreams() {
        int i8;
        c[] activeStreams = this.f2347a.getActiveStreams();
        Collections.shuffle(Arrays.asList(activeStreams));
        int iJ = this.f2350d.j();
        int length = activeStreams.length;
        while (true) {
            i8 = 0;
            if (length <= 0 || iJ <= 0) {
                break;
            }
            int iCeil = (int) Math.ceil(iJ / length);
            for (int i9 = 0; i9 < length && iJ > 0; i9++) {
                c cVar = activeStreams[i9];
                int iMin = Math.min(iJ, Math.min(cVar.i(), iCeil));
                if (iMin > 0) {
                    cVar.a(iMin);
                    iJ -= iMin;
                }
                if (cVar.i() > 0) {
                    activeStreams[i8] = cVar;
                    i8++;
                }
            }
            length = i8;
        }
        e eVar = new e();
        c[] activeStreams2 = this.f2347a.getActiveStreams();
        int length2 = activeStreams2.length;
        while (i8 < length2) {
            c cVar2 = activeStreams2[i8];
            cVar2.m(cVar2.b(), eVar);
            cVar2.c();
            i8++;
        }
        if (eVar.a()) {
            flush();
        }
    }
}
