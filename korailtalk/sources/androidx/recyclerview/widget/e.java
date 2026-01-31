package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class e implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    static final ThreadLocal f10582e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    static Comparator f10583f = new a();

    /* renamed from: b, reason: collision with root package name */
    long f10585b;

    /* renamed from: c, reason: collision with root package name */
    long f10586c;

    /* renamed from: a, reason: collision with root package name */
    ArrayList f10584a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f10587d = new ArrayList();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.view;
            if ((recyclerView == null) != (cVar2.view == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z8 = cVar.immediate;
            if (z8 != cVar2.immediate) {
                return z8 ? -1 : 1;
            }
            int i8 = cVar2.viewVelocity - cVar.viewVelocity;
            if (i8 != 0) {
                return i8;
            }
            int i9 = cVar.distanceToItem - cVar2.distanceToItem;
            if (i9 != 0) {
                return i9;
            }
            return 0;
        }
    }

    static class b implements RecyclerView.p.c {

        /* renamed from: a, reason: collision with root package name */
        int f10588a;

        /* renamed from: b, reason: collision with root package name */
        int f10589b;

        /* renamed from: c, reason: collision with root package name */
        int[] f10590c;

        /* renamed from: d, reason: collision with root package name */
        int f10591d;

        b() {
        }

        void a() {
            int[] iArr = this.f10590c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f10591d = 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void addPosition(int i8, int i9) {
            if (i8 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i9 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i10 = this.f10591d;
            int i11 = i10 * 2;
            int[] iArr = this.f10590c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f10590c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i11 >= iArr.length) {
                int[] iArr3 = new int[i10 * 4];
                this.f10590c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f10590c;
            iArr4[i11] = i8;
            iArr4[i11 + 1] = i9;
            this.f10591d++;
        }

        void b(RecyclerView recyclerView, boolean z8) {
            this.f10591d = 0;
            int[] iArr = this.f10590c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.f10289m;
            if (recyclerView.f10287l == null || pVar == null || !pVar.isItemPrefetchEnabled()) {
                return;
            }
            if (z8) {
                if (!recyclerView.f10271d.m()) {
                    pVar.collectInitialPrefetchPositions(recyclerView.f10287l.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                pVar.collectAdjacentPrefetchPositions(this.f10588a, this.f10589b, recyclerView.f10280h0, this);
            }
            int i8 = this.f10591d;
            if (i8 > pVar.f10404m) {
                pVar.f10404m = i8;
                pVar.f10405n = z8;
                recyclerView.f10267b.E();
            }
        }

        boolean c(int i8) {
            if (this.f10590c != null) {
                int i9 = this.f10591d * 2;
                for (int i10 = 0; i10 < i9; i10 += 2) {
                    if (this.f10590c[i10] == i8) {
                        return true;
                    }
                }
            }
            return false;
        }

        void d(int i8, int i9) {
            this.f10588a = i8;
            this.f10589b = i9;
        }
    }

    static class c {
        public int distanceToItem;
        public boolean immediate;
        public int position;
        public RecyclerView view;
        public int viewVelocity;

        c() {
        }

        public void clear() {
            this.immediate = false;
            this.viewVelocity = 0;
            this.distanceToItem = 0;
            this.view = null;
            this.position = 0;
        }
    }

    e() {
    }

    private void a() {
        c cVar;
        int size = this.f10584a.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView recyclerView = (RecyclerView) this.f10584a.get(i9);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f10278g0.b(recyclerView, false);
                i8 += recyclerView.f10278g0.f10591d;
            }
        }
        this.f10587d.ensureCapacity(i8);
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f10584a.get(i11);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f10278g0;
                int iAbs = Math.abs(bVar.f10588a) + Math.abs(bVar.f10589b);
                for (int i12 = 0; i12 < bVar.f10591d * 2; i12 += 2) {
                    if (i10 >= this.f10587d.size()) {
                        cVar = new c();
                        this.f10587d.add(cVar);
                    } else {
                        cVar = (c) this.f10587d.get(i10);
                    }
                    int[] iArr = bVar.f10590c;
                    int i13 = iArr[i12 + 1];
                    cVar.immediate = i13 <= iAbs;
                    cVar.viewVelocity = iAbs;
                    cVar.distanceToItem = i13;
                    cVar.view = recyclerView2;
                    cVar.position = iArr[i12];
                    i10++;
                }
            }
        }
        Collections.sort(this.f10587d, f10583f);
    }

    private void b(c cVar, long j8) {
        RecyclerView.E eH = h(cVar.view, cVar.position, cVar.immediate ? Long.MAX_VALUE : j8);
        if (eH == null || eH.f10357a == null || !eH.n() || eH.o()) {
            return;
        }
        g((RecyclerView) eH.f10357a.get(), j8);
    }

    private void c(long j8) {
        for (int i8 = 0; i8 < this.f10587d.size(); i8++) {
            c cVar = (c) this.f10587d.get(i8);
            if (cVar.view == null) {
                return;
            }
            b(cVar, j8);
            cVar.clear();
        }
    }

    static boolean d(RecyclerView recyclerView, int i8) {
        int iJ = recyclerView.f10273e.j();
        for (int i9 = 0; i9 < iJ; i9++) {
            RecyclerView.E eS = RecyclerView.S(recyclerView.f10273e.i(i9));
            if (eS.f10358b == i8 && !eS.o()) {
                return true;
            }
        }
        return false;
    }

    private void g(RecyclerView recyclerView, long j8) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f10245D && recyclerView.f10273e.j() != 0) {
            recyclerView.z0();
        }
        b bVar = recyclerView.f10278g0;
        bVar.b(recyclerView, true);
        if (bVar.f10591d != 0) {
            try {
                androidx.core.os.q.beginSection("RV Nested Prefetch");
                recyclerView.f10280h0.b(recyclerView.f10287l);
                for (int i8 = 0; i8 < bVar.f10591d * 2; i8 += 2) {
                    h(recyclerView, bVar.f10590c[i8], j8);
                }
            } finally {
                androidx.core.os.q.endSection();
            }
        }
    }

    private RecyclerView.E h(RecyclerView recyclerView, int i8, long j8) {
        if (d(recyclerView, i8)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.f10267b;
        try {
            recyclerView.n0();
            RecyclerView.E eC = wVar.C(i8, false, j8);
            if (eC != null) {
                if (!eC.n() || eC.o()) {
                    wVar.a(eC, false);
                } else {
                    wVar.recycleView(eC.itemView);
                }
            }
            recyclerView.p0(false);
            return eC;
        } catch (Throwable th) {
            recyclerView.p0(false);
            throw th;
        }
    }

    public void add(RecyclerView recyclerView) {
        this.f10584a.add(recyclerView);
    }

    void e(RecyclerView recyclerView, int i8, int i9) {
        if (recyclerView.isAttachedToWindow() && this.f10585b == 0) {
            this.f10585b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f10278g0.d(i8, i9);
    }

    void f(long j8) {
        a();
        c(j8);
    }

    public void remove(RecyclerView recyclerView) {
        this.f10584a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            androidx.core.os.q.beginSection("RV Prefetch");
            if (!this.f10584a.isEmpty()) {
                int size = this.f10584a.size();
                long jMax = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    RecyclerView recyclerView = (RecyclerView) this.f10584a.get(i8);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    f(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f10586c);
                    this.f10585b = 0L;
                    androidx.core.os.q.endSection();
                }
            }
        } finally {
            this.f10585b = 0L;
            androidx.core.os.q.endSection();
        }
    }
}
