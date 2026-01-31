package X3;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f5439a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5440b;

    public b(int i8, int i9) {
        this.f5439a = i8;
        this.f5440b = i9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5439a == bVar.f5439a && this.f5440b == bVar.f5440b;
    }

    public final int getChecksumPortion() {
        return this.f5440b;
    }

    public final int getValue() {
        return this.f5439a;
    }

    public final int hashCode() {
        return this.f5439a ^ this.f5440b;
    }

    public final String toString() {
        return this.f5439a + "(" + this.f5440b + ')';
    }
}
