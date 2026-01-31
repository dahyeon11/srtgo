package io.grpc;

/* renamed from: io.grpc.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5803u {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC5802t f33352a;

    /* renamed from: b, reason: collision with root package name */
    private final J0 f33353b;

    private C5803u(EnumC5802t enumC5802t, J0 j02) {
        this.f33352a = (EnumC5802t) e3.w.checkNotNull(enumC5802t, "state is null");
        this.f33353b = (J0) e3.w.checkNotNull(j02, "status is null");
    }

    public static C5803u forNonError(EnumC5802t enumC5802t) {
        e3.w.checkArgument(enumC5802t != EnumC5802t.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new C5803u(enumC5802t, J0.OK);
    }

    public static C5803u forTransientFailure(J0 j02) {
        e3.w.checkArgument(!j02.isOk(), "The error status must not be OK");
        return new C5803u(EnumC5802t.TRANSIENT_FAILURE, j02);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5803u)) {
            return false;
        }
        C5803u c5803u = (C5803u) obj;
        return this.f33352a.equals(c5803u.f33352a) && this.f33353b.equals(c5803u.f33353b);
    }

    public EnumC5802t getState() {
        return this.f33352a;
    }

    public J0 getStatus() {
        return this.f33353b;
    }

    public int hashCode() {
        return this.f33352a.hashCode() ^ this.f33353b.hashCode();
    }

    public String toString() {
        if (this.f33353b.isOk()) {
            return this.f33352a.toString();
        }
        return this.f33352a + "(" + this.f33353b + ")";
    }
}
