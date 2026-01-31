package h7;

import java.io.Serializable;
import java.util.Random;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class d extends AbstractC5637a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final a f31659c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final Random f31660b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(Random impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f31660b = impl;
    }

    @Override // h7.AbstractC5637a
    public Random getImpl() {
        return this.f31660b;
    }
}
