package G0;

import java.util.Objects;

/* loaded from: classes.dex */
public class f {
    public static final int TYPE_ARRAY_BUFFER = 1;
    public static final int TYPE_STRING = 0;

    /* renamed from: a, reason: collision with root package name */
    private final g[] f1381a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1382b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f1383c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1384d;

    public f(String str) {
        this(str, (g[]) null);
    }

    private void a(int i8) {
        if (i8 == this.f1384d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + b(this.f1384d) + " expected, but got " + b(i8));
    }

    private String b(int i8) {
        return i8 != 0 ? i8 != 1 ? "Unknown" : "ArrayBuffer" : "String";
    }

    public byte[] getArrayBuffer() {
        a(1);
        Objects.requireNonNull(this.f1383c);
        return this.f1383c;
    }

    public String getData() {
        a(0);
        return this.f1382b;
    }

    public g[] getPorts() {
        return this.f1381a;
    }

    public int getType() {
        return this.f1384d;
    }

    public f(String str, g[] gVarArr) {
        this.f1382b = str;
        this.f1383c = null;
        this.f1381a = gVarArr;
        this.f1384d = 0;
    }

    public f(byte[] bArr) {
        this(bArr, (g[]) null);
    }

    public f(byte[] bArr, g[] gVarArr) {
        Objects.requireNonNull(bArr);
        this.f1383c = bArr;
        this.f1382b = null;
        this.f1381a = gVarArr;
        this.f1384d = 1;
    }
}
