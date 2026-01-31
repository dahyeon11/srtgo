package V7;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes3.dex */
public class c implements a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Object f5238a;

    public c() {
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() == obj.getClass()) {
            return Objects.equals(this.f5238a, ((c) obj).f5238a);
        }
        return false;
    }

    @Override // V7.a
    public Object getValue() {
        return this.f5238a;
    }

    public int hashCode() {
        return Objects.hashCode(this.f5238a);
    }

    @Override // V7.a
    public void setValue(Object obj) {
        this.f5238a = obj;
    }

    public String toString() {
        return Objects.toString(this.f5238a);
    }

    public c(Object obj) {
        this.f5238a = obj;
    }
}
