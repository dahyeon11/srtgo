package Y7;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes3.dex */
public class g extends c {

    /* renamed from: b, reason: collision with root package name */
    private final int f5675b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5676c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5677d;

    public g() {
        this(0, Integer.MAX_VALUE, true);
    }

    public static g above(int i8) {
        return outsideOf(0, i8);
    }

    public static g below(int i8) {
        return outsideOf(i8, Integer.MAX_VALUE);
    }

    public static g between(int i8, int i9) {
        return new g(i8, i9, true);
    }

    public static g outsideOf(int i8, int i9) {
        return new g(i8, i9, false);
    }

    @Override // Y7.c
    public boolean translate(int i8, Writer writer) throws IOException {
        if (this.f5677d) {
            if (i8 < this.f5675b || i8 > this.f5676c) {
                return false;
            }
        } else if (i8 >= this.f5675b && i8 <= this.f5676c) {
            return false;
        }
        writer.write("&#");
        writer.write(Integer.toString(i8, 10));
        writer.write(59);
        return true;
    }

    private g(int i8, int i9, boolean z8) {
        this.f5675b = i8;
        this.f5676c = i9;
        this.f5677d = z8;
    }
}
