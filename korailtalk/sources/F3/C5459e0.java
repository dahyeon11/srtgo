package f3;

import java.io.Serializable;

/* renamed from: f3.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5459e0 extends AbstractC5460f implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Object f30927a;

    /* renamed from: b, reason: collision with root package name */
    final Object f30928b;

    C5459e0(Object obj, Object obj2) {
        this.f30927a = obj;
        this.f30928b = obj2;
    }

    @Override // f3.AbstractC5460f, java.util.Map.Entry
    public final Object getKey() {
        return this.f30927a;
    }

    @Override // f3.AbstractC5460f, java.util.Map.Entry
    public final Object getValue() {
        return this.f30928b;
    }

    @Override // f3.AbstractC5460f, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
