package n1;

import java.util.Arrays;
import n1.AbstractC5940p;

/* renamed from: n1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5931g extends AbstractC5940p {

    /* renamed from: a, reason: collision with root package name */
    private final long f34166a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34167b;

    /* renamed from: c, reason: collision with root package name */
    private final long f34168c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f34169d;

    /* renamed from: e, reason: collision with root package name */
    private final String f34170e;

    /* renamed from: f, reason: collision with root package name */
    private final long f34171f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC5945u f34172g;

    /* renamed from: n1.g$b */
    static final class b extends AbstractC5940p.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f34173a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f34174b;

        /* renamed from: c, reason: collision with root package name */
        private Long f34175c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f34176d;

        /* renamed from: e, reason: collision with root package name */
        private String f34177e;

        /* renamed from: f, reason: collision with root package name */
        private Long f34178f;

        /* renamed from: g, reason: collision with root package name */
        private AbstractC5945u f34179g;

        b() {
        }

        @Override // n1.AbstractC5940p.a
        AbstractC5940p.a a(String str) {
            this.f34177e = str;
            return this;
        }

        @Override // n1.AbstractC5940p.a
        AbstractC5940p.a b(byte[] bArr) {
            this.f34176d = bArr;
            return this;
        }

        @Override // n1.AbstractC5940p.a
        public AbstractC5940p.a zza(long j8) {
            this.f34173a = Long.valueOf(j8);
            return this;
        }

        @Override // n1.AbstractC5940p.a
        public AbstractC5940p.a zzb(long j8) {
            this.f34175c = Long.valueOf(j8);
            return this;
        }

        @Override // n1.AbstractC5940p.a
        public AbstractC5940p.a zzc(long j8) {
            this.f34178f = Long.valueOf(j8);
            return this;
        }

        @Override // n1.AbstractC5940p.a
        public AbstractC5940p.a zza(int i8) {
            this.f34174b = Integer.valueOf(i8);
            return this;
        }

        @Override // n1.AbstractC5940p.a
        public AbstractC5940p.a zza(AbstractC5945u abstractC5945u) {
            this.f34179g = abstractC5945u;
            return this;
        }

        @Override // n1.AbstractC5940p.a
        public AbstractC5940p zza() {
            String str = "";
            if (this.f34173a == null) {
                str = " eventTimeMs";
            }
            if (this.f34174b == null) {
                str = str + " eventCode";
            }
            if (this.f34175c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f34178f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C5931g(this.f34173a.longValue(), this.f34174b.intValue(), this.f34175c.longValue(), this.f34176d, this.f34177e, this.f34178f.longValue(), this.f34179g, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    /* synthetic */ C5931g(long j8, int i8, long j9, byte[] bArr, String str, long j10, AbstractC5945u abstractC5945u, a aVar) {
        this.f34166a = j8;
        this.f34167b = i8;
        this.f34168c = j9;
        this.f34169d = bArr;
        this.f34170e = str;
        this.f34171f = j10;
        this.f34172g = abstractC5945u;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5940p)) {
            return false;
        }
        AbstractC5940p abstractC5940p = (AbstractC5940p) obj;
        if (this.f34166a == abstractC5940p.zza()) {
            C5931g c5931g = (C5931g) abstractC5940p;
            if (this.f34167b == c5931g.f34167b && this.f34168c == abstractC5940p.zzb()) {
                if (Arrays.equals(this.f34169d, abstractC5940p instanceof C5931g ? c5931g.f34169d : c5931g.f34169d) && ((str = this.f34170e) != null ? str.equals(c5931g.f34170e) : c5931g.f34170e == null) && this.f34171f == abstractC5940p.zzc()) {
                    AbstractC5945u abstractC5945u = this.f34172g;
                    if (abstractC5945u == null) {
                        if (c5931g.f34172g == null) {
                            return true;
                        }
                    } else if (abstractC5945u.equals(c5931g.f34172g)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        long j8 = this.f34166a;
        int i8 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f34167b) * 1000003;
        long j9 = this.f34168c;
        int iHashCode = (((i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f34169d)) * 1000003;
        String str = this.f34170e;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f34171f;
        int i9 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        AbstractC5945u abstractC5945u = this.f34172g;
        return i9 ^ (abstractC5945u != null ? abstractC5945u.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f34166a + ", eventCode=" + this.f34167b + ", eventUptimeMs=" + this.f34168c + ", sourceExtension=" + Arrays.toString(this.f34169d) + ", sourceExtensionJsonProto3=" + this.f34170e + ", timezoneOffsetSeconds=" + this.f34171f + ", networkConnectionInfo=" + this.f34172g + "}";
    }

    @Override // n1.AbstractC5940p
    public long zza() {
        return this.f34166a;
    }

    @Override // n1.AbstractC5940p
    public long zzb() {
        return this.f34168c;
    }

    @Override // n1.AbstractC5940p
    public long zzc() {
        return this.f34171f;
    }

    public int zzd() {
        return this.f34167b;
    }

    public AbstractC5945u zze() {
        return this.f34172g;
    }

    public byte[] zzf() {
        return this.f34169d;
    }

    public String zzg() {
        return this.f34170e;
    }
}
