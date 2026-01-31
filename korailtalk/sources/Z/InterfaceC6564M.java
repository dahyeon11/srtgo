package z;

import z.C6562K;

/* renamed from: z.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6564M {

    /* renamed from: z.M$a */
    public static final class a implements InterfaceC6564M {

        /* renamed from: a, reason: collision with root package name */
        private final C6562K f37744a = new C6562K.a().build();

        @Override // z.InterfaceC6564M
        public C6562K getCaptureConfig() {
            return this.f37744a;
        }

        @Override // z.InterfaceC6564M
        public int getId() {
            return 0;
        }
    }

    C6562K getCaptureConfig();

    int getId();
}
