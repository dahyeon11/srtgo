package p1;

import android.content.Context;
import w1.InterfaceC6458a;

/* loaded from: classes.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34577a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6458a f34578b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6458a f34579c;

    i(Context context, InterfaceC6458a interfaceC6458a, InterfaceC6458a interfaceC6458a2) {
        this.f34577a = context;
        this.f34578b = interfaceC6458a;
        this.f34579c = interfaceC6458a2;
    }

    h a(String str) {
        return h.create(this.f34577a, this.f34578b, this.f34579c, str);
    }
}
