package L0;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2998a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2999b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3000c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3001d;

    public b(boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f2998a = z8;
        this.f2999b = z9;
        this.f3000c = z10;
        this.f3001d = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2998a == bVar.f2998a && this.f2999b == bVar.f2999b && this.f3000c == bVar.f3000c && this.f3001d == bVar.f3001d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r02 = this.f2998a;
        int i8 = r02;
        if (this.f2999b) {
            i8 = r02 + 16;
        }
        int i9 = i8;
        if (this.f3000c) {
            i9 = i8 + 256;
        }
        return this.f3001d ? i9 + 4096 : i9;
    }

    public boolean isConnected() {
        return this.f2998a;
    }

    public boolean isMetered() {
        return this.f3000c;
    }

    public boolean isNotRoaming() {
        return this.f3001d;
    }

    public boolean isValidated() {
        return this.f2999b;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f2998a), Boolean.valueOf(this.f2999b), Boolean.valueOf(this.f3000c), Boolean.valueOf(this.f3001d));
    }
}
