package s7;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: s7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6243d extends AbstractC6249j {
    public static final C6243d INSTANCE = new C6243d();

    /* renamed from: a, reason: collision with root package name */
    private static final a f36340a = new a();

    /* renamed from: s7.d$a */
    public static final class a extends ClassValue {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ClassValue
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f7.l computeValue(Class cls) {
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            return AbstractC6254o.a(cls);
        }
    }

    private C6243d() {
    }

    @Override // s7.AbstractC6249j
    public f7.l get(Class<? extends Throwable> cls) {
        return (f7.l) f36340a.get(cls);
    }
}
