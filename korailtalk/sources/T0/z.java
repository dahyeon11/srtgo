package T0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4847a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f4848b;

    public z(Object obj) {
        this.f4847a = obj;
        this.f4848b = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (getValue() != null && getValue().equals(zVar.getValue())) {
            return true;
        }
        if (getException() == null || zVar.getException() == null) {
            return false;
        }
        return getException().toString().equals(getException().toString());
    }

    public Throwable getException() {
        return this.f4848b;
    }

    public Object getValue() {
        return this.f4847a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getValue(), getException()});
    }

    public z(Throwable th) {
        this.f4848b = th;
        this.f4847a = null;
    }
}
