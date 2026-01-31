package q7;

/* renamed from: q7.N */
/* loaded from: classes3.dex */
public interface InterfaceC6128N {
    public static final a Companion = a.f35196a;

    /* renamed from: q7.N$a */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f35196a = new a();

        /* renamed from: b */
        private static final InterfaceC6128N f35197b = new C6129O();

        /* renamed from: c */
        private static final InterfaceC6128N f35198c = new C6130P();

        private a() {
        }

        public static /* synthetic */ InterfaceC6128N WhileSubscribed$default(a aVar, long j8, long j9, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                j8 = 0;
            }
            if ((i8 & 2) != 0) {
                j9 = Long.MAX_VALUE;
            }
            return aVar.WhileSubscribed(j8, j9);
        }

        public final InterfaceC6128N WhileSubscribed(long j8, long j9) {
            return new C6131Q(j8, j9);
        }

        public final InterfaceC6128N getEagerly() {
            return f35197b;
        }

        public final InterfaceC6128N getLazily() {
            return f35198c;
        }
    }

    InterfaceC6147i command(InterfaceC6132S interfaceC6132S);
}
