package n1;

import n1.AbstractC5937m;

/* renamed from: n1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5930f extends AbstractC5937m {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5937m.b f34162a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5925a f34163b;

    /* renamed from: n1.f$b */
    static final class b extends AbstractC5937m.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC5937m.b f34164a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5925a f34165b;

        b() {
        }

        @Override // n1.AbstractC5937m.a
        public AbstractC5937m.a zza(AbstractC5937m.b bVar) {
            this.f34164a = bVar;
            return this;
        }

        @Override // n1.AbstractC5937m.a
        public AbstractC5937m.a zza(AbstractC5925a abstractC5925a) {
            this.f34165b = abstractC5925a;
            return this;
        }

        @Override // n1.AbstractC5937m.a
        public AbstractC5937m zza() {
            return new C5930f(this.f34164a, this.f34165b, null);
        }
    }

    /* synthetic */ C5930f(AbstractC5937m.b bVar, AbstractC5925a abstractC5925a, a aVar) {
        this.f34162a = bVar;
        this.f34163b = abstractC5925a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5937m)) {
            return false;
        }
        AbstractC5937m.b bVar = this.f34162a;
        if (bVar != null ? bVar.equals(((C5930f) obj).f34162a) : ((C5930f) obj).f34162a == null) {
            AbstractC5925a abstractC5925a = this.f34163b;
            if (abstractC5925a == null) {
                if (((C5930f) obj).f34163b == null) {
                    return true;
                }
            } else if (abstractC5925a.equals(((C5930f) obj).f34163b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC5937m.b bVar = this.f34162a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC5925a abstractC5925a = this.f34163b;
        return iHashCode ^ (abstractC5925a != null ? abstractC5925a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f34162a + ", androidClientInfo=" + this.f34163b + "}";
    }

    public AbstractC5925a zzb() {
        return this.f34163b;
    }

    public AbstractC5937m.b zzc() {
        return this.f34162a;
    }
}
