package l7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
final class g implements k7.m {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f34020a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34021b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34022c;

    /* renamed from: d, reason: collision with root package name */
    private final f7.p f34023d;

    public static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private int f34024a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f34025b;

        /* renamed from: c, reason: collision with root package name */
        private int f34026c;

        /* renamed from: d, reason: collision with root package name */
        private j7.l f34027d;

        /* renamed from: e, reason: collision with root package name */
        private int f34028e;

        a() {
            int iCoerceIn = j7.s.coerceIn(g.this.f34021b, 0, g.this.f34020a.length());
            this.f34025b = iCoerceIn;
            this.f34026c = iCoerceIn;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f34026c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f34024a = r1
                r0 = 0
                r6.f34027d = r0
                goto L9e
            Lc:
                l7.g r0 = l7.g.this
                int r0 = l7.g.access$getLimit$p(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f34028e
                int r0 = r0 + r3
                r6.f34028e = r0
                l7.g r4 = l7.g.this
                int r4 = l7.g.access$getLimit$p(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f34026c
                l7.g r4 = l7.g.this
                java.lang.CharSequence r4 = l7.g.access$getInput$p(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                j7.l r0 = new j7.l
                int r1 = r6.f34025b
                l7.g r4 = l7.g.this
                java.lang.CharSequence r4 = l7.g.access$getInput$p(r4)
                int r4 = l7.r.getLastIndex(r4)
                r0.<init>(r1, r4)
                r6.f34027d = r0
                r6.f34026c = r2
                goto L9c
            L47:
                l7.g r0 = l7.g.this
                f7.p r0 = l7.g.access$getGetNextMatch$p(r0)
                l7.g r4 = l7.g.this
                java.lang.CharSequence r4 = l7.g.access$getInput$p(r4)
                int r5 = r6.f34026c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                R6.p r0 = (R6.p) r0
                if (r0 != 0) goto L77
                j7.l r0 = new j7.l
                int r1 = r6.f34025b
                l7.g r4 = l7.g.this
                java.lang.CharSequence r4 = l7.g.access$getInput$p(r4)
                int r4 = l7.r.getLastIndex(r4)
                r0.<init>(r1, r4)
                r6.f34027d = r0
                r6.f34026c = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f34025b
                j7.l r4 = j7.s.until(r4, r2)
                r6.f34027d = r4
                int r2 = r2 + r0
                r6.f34025b = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f34026c = r2
            L9c:
                r6.f34024a = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l7.g.a.a():void");
        }

        public final int getCounter() {
            return this.f34028e;
        }

        public final int getCurrentStartIndex() {
            return this.f34025b;
        }

        public final j7.l getNextItem() {
            return this.f34027d;
        }

        public final int getNextSearchIndex() {
            return this.f34026c;
        }

        public final int getNextState() {
            return this.f34024a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f34024a == -1) {
                a();
            }
            return this.f34024a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCounter(int i8) {
            this.f34028e = i8;
        }

        public final void setCurrentStartIndex(int i8) {
            this.f34025b = i8;
        }

        public final void setNextItem(j7.l lVar) {
            this.f34027d = lVar;
        }

        public final void setNextSearchIndex(int i8) {
            this.f34026c = i8;
        }

        public final void setNextState(int i8) {
            this.f34024a = i8;
        }

        @Override // java.util.Iterator
        public j7.l next() {
            if (this.f34024a == -1) {
                a();
            }
            if (this.f34024a == 0) {
                throw new NoSuchElementException();
            }
            j7.l lVar = this.f34027d;
            Intrinsics.checkNotNull(lVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f34027d = null;
            this.f34024a = -1;
            return lVar;
        }
    }

    public g(CharSequence input, int i8, int i9, f7.p getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f34020a = input;
        this.f34021b = i8;
        this.f34022c = i9;
        this.f34023d = getNextMatch;
    }

    @Override // k7.m
    public Iterator<j7.l> iterator() {
        return new a();
    }
}
