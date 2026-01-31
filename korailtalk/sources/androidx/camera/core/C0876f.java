package androidx.camera.core;

import androidx.camera.core.AbstractC0905u;

/* renamed from: androidx.camera.core.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0876f extends AbstractC0905u {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0905u.c f7603a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC0905u.b f7604b;

    C0876f(AbstractC0905u.c cVar, AbstractC0905u.b bVar) {
        if (cVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f7603a = cVar;
        this.f7604b = bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0905u)) {
            return false;
        }
        AbstractC0905u abstractC0905u = (AbstractC0905u) obj;
        if (this.f7603a.equals(abstractC0905u.getType())) {
            AbstractC0905u.b bVar = this.f7604b;
            if (bVar == null) {
                if (abstractC0905u.getError() == null) {
                    return true;
                }
            } else if (bVar.equals(abstractC0905u.getError())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.AbstractC0905u
    public AbstractC0905u.b getError() {
        return this.f7604b;
    }

    @Override // androidx.camera.core.AbstractC0905u
    public AbstractC0905u.c getType() {
        return this.f7603a;
    }

    public int hashCode() {
        int iHashCode = (this.f7603a.hashCode() ^ 1000003) * 1000003;
        AbstractC0905u.b bVar = this.f7604b;
        return iHashCode ^ (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f7603a + ", error=" + this.f7604b + "}";
    }
}
