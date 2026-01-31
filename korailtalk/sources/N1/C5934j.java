package n1;

import n1.AbstractC5945u;

/* renamed from: n1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5934j extends AbstractC5945u {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5945u.c f34195a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5945u.b f34196b;

    /* renamed from: n1.j$b */
    static final class b extends AbstractC5945u.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC5945u.c f34197a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5945u.b f34198b;

        b() {
        }

        @Override // n1.AbstractC5945u.a
        public AbstractC5945u.a zza(AbstractC5945u.c cVar) {
            this.f34197a = cVar;
            return this;
        }

        @Override // n1.AbstractC5945u.a
        public AbstractC5945u.a zza(AbstractC5945u.b bVar) {
            this.f34198b = bVar;
            return this;
        }

        @Override // n1.AbstractC5945u.a
        public AbstractC5945u zza() {
            return new C5934j(this.f34197a, this.f34198b, null);
        }
    }

    /* synthetic */ C5934j(AbstractC5945u.c cVar, AbstractC5945u.b bVar, a aVar) {
        this.f34195a = cVar;
        this.f34196b = bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5945u)) {
            return false;
        }
        AbstractC5945u.c cVar = this.f34195a;
        if (cVar != null ? cVar.equals(((C5934j) obj).f34195a) : ((C5934j) obj).f34195a == null) {
            AbstractC5945u.b bVar = this.f34196b;
            if (bVar == null) {
                if (((C5934j) obj).f34196b == null) {
                    return true;
                }
            } else if (bVar.equals(((C5934j) obj).f34196b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC5945u.c cVar = this.f34195a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC5945u.b bVar = this.f34196b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f34195a + ", mobileSubtype=" + this.f34196b + "}";
    }

    public AbstractC5945u.b zzb() {
        return this.f34196b;
    }

    public AbstractC5945u.c zzc() {
        return this.f34195a;
    }
}
