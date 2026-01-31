package y1;

import java.util.Locale;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    protected final int f37605a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f37606b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f37607c;

    public z(int i8, int i9, int i10) {
        this.f37605a = i8;
        this.f37606b = i9;
        this.f37607c = i10;
    }

    public int getMajorVersion() {
        return this.f37605a;
    }

    public int getMicroVersion() {
        return this.f37607c;
    }

    public int getMinorVersion() {
        return this.f37606b;
    }

    public String toString() {
        return String.format(Locale.US, "%d.%d.%d", Integer.valueOf(this.f37605a), Integer.valueOf(this.f37606b), Integer.valueOf(this.f37607c));
    }
}
