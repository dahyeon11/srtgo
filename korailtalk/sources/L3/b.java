package l3;

import android.content.Context;
import u3.InterfaceC6416a;

/* loaded from: classes2.dex */
final /* synthetic */ class b implements InterfaceC6416a {

    /* renamed from: a, reason: collision with root package name */
    private final c f33954a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f33955b;

    private b(c cVar, Context context) {
        this.f33954a = cVar;
        this.f33955b = context;
    }

    public static InterfaceC6416a lambdaFactory$(c cVar, Context context) {
        return new b(cVar, context);
    }

    @Override // u3.InterfaceC6416a
    public Object get() {
        return c.h(this.f33954a, this.f33955b);
    }
}
