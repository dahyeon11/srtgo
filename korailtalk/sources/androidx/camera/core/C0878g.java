package androidx.camera.core;

import androidx.camera.core.AbstractC0905u;

/* renamed from: androidx.camera.core.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0878g extends AbstractC0905u.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f7608a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f7609b;

    C0878g(int i8, Throwable th) {
        this.f7608a = i8;
        this.f7609b = th;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0905u.b)) {
            return false;
        }
        AbstractC0905u.b bVar = (AbstractC0905u.b) obj;
        if (this.f7608a == bVar.getCode()) {
            Throwable th = this.f7609b;
            if (th == null) {
                if (bVar.getCause() == null) {
                    return true;
                }
            } else if (th.equals(bVar.getCause())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.AbstractC0905u.b
    public Throwable getCause() {
        return this.f7609b;
    }

    @Override // androidx.camera.core.AbstractC0905u.b
    public int getCode() {
        return this.f7608a;
    }

    public int hashCode() {
        int i8 = (this.f7608a ^ 1000003) * 1000003;
        Throwable th = this.f7609b;
        return i8 ^ (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f7608a + ", cause=" + this.f7609b + "}";
    }
}
