package S6;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class i0 {

    static final class a extends Y6.k implements f7.p {

        /* renamed from: c */
        Object f4711c;

        /* renamed from: d */
        Object f4712d;

        /* renamed from: e */
        int f4713e;

        /* renamed from: f */
        int f4714f;

        /* renamed from: g */
        private /* synthetic */ Object f4715g;

        /* renamed from: h */
        final /* synthetic */ int f4716h;

        /* renamed from: i */
        final /* synthetic */ int f4717i;

        /* renamed from: j */
        final /* synthetic */ Iterator f4718j;

        /* renamed from: k */
        final /* synthetic */ boolean f4719k;

        /* renamed from: l */
        final /* synthetic */ boolean f4720l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8, int i9, Iterator it, boolean z8, boolean z9, W6.d dVar) {
            super(2, dVar);
            this.f4716h = i8;
            this.f4717i = i9;
            this.f4718j = it;
            this.f4719k = z8;
            this.f4720l = z9;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            a aVar = new a(this.f4716h, this.f4717i, this.f4718j, this.f4719k, this.f4720l, dVar);
            aVar.f4715g = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:117:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x00d7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:142:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x014e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x00a2 -> B:111:0x0055). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x0117 -> B:154:0x011a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x0145 -> B:167:0x0148). Please report as a decompilation issue!!! */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 358
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: S6.i0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(k7.o oVar, W6.d<? super R6.G> dVar) {
            return ((a) create(oVar, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    public static final class b implements k7.m {

        /* renamed from: a */
        final /* synthetic */ k7.m f4721a;

        /* renamed from: b */
        final /* synthetic */ int f4722b;

        /* renamed from: c */
        final /* synthetic */ int f4723c;

        /* renamed from: d */
        final /* synthetic */ boolean f4724d;

        /* renamed from: e */
        final /* synthetic */ boolean f4725e;

        public b(k7.m mVar, int i8, int i9, boolean z8, boolean z9) {
            this.f4721a = mVar;
            this.f4722b = i8;
            this.f4723c = i9;
            this.f4724d = z8;
            this.f4725e = z9;
        }

        @Override // k7.m
        public Iterator<List<? extends T>> iterator() {
            return i0.windowedIterator(this.f4721a.iterator(), this.f4722b, this.f4723c, this.f4724d, this.f4725e);
        }
    }

    public static final void checkWindowSizeStep(int i8, int i9) {
        String str;
        if (i8 <= 0 || i9 <= 0) {
            if (i8 != i9) {
                str = "Both size " + i8 + " and step " + i9 + " must be greater than zero.";
            } else {
                str = "size " + i8 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final <T> Iterator<List<T>> windowedIterator(Iterator<? extends T> iterator, int i8, int i9, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return !iterator.hasNext() ? D.INSTANCE : k7.p.iterator(new a(i8, i9, iterator, z9, z8, null));
    }

    public static final <T> k7.m windowedSequence(k7.m mVar, int i8, int i9, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        checkWindowSizeStep(i8, i9);
        return new b(mVar, i8, i9, z8, z9);
    }
}
