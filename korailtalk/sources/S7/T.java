package s7;

import kotlin.jvm.internal.Intrinsics;
import n7.Q0;

/* loaded from: classes3.dex */
final class T {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f36334a;

    /* renamed from: b, reason: collision with root package name */
    private final Q0[] f36335b;

    /* renamed from: c, reason: collision with root package name */
    private int f36336c;
    public final W6.g context;

    public T(W6.g gVar, int i8) {
        this.context = gVar;
        this.f36334a = new Object[i8];
        this.f36335b = new Q0[i8];
    }

    public final void append(Q0 q02, Object obj) {
        Object[] objArr = this.f36334a;
        int i8 = this.f36336c;
        objArr[i8] = obj;
        Q0[] q0Arr = this.f36335b;
        this.f36336c = i8 + 1;
        Intrinsics.checkNotNull(q02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        q0Arr[i8] = q02;
    }

    public final void restore(W6.g gVar) {
        int length = this.f36335b.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i8 = length - 1;
            Q0 q02 = this.f36335b[length];
            Intrinsics.checkNotNull(q02);
            q02.c(gVar, this.f36334a[length]);
            if (i8 < 0) {
                return;
            } else {
                length = i8;
            }
        }
    }
}
