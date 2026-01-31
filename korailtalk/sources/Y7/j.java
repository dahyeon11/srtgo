package Y7;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes3.dex */
public class j extends c {

    /* renamed from: b, reason: collision with root package name */
    private final int f5680b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5681c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5682d;

    public j() {
        this(0, Integer.MAX_VALUE, true);
    }

    public static j above(int i8) {
        return outsideOf(0, i8);
    }

    public static j below(int i8) {
        return outsideOf(i8, Integer.MAX_VALUE);
    }

    public static j between(int i8, int i9) {
        return new j(i8, i9, true);
    }

    public static j outsideOf(int i8, int i9) {
        return new j(i8, i9, false);
    }

    protected String a(int i8) {
        return "\\u" + b.hex(i8);
    }

    @Override // Y7.c
    public boolean translate(int i8, Writer writer) throws IOException {
        if (this.f5682d) {
            if (i8 < this.f5680b || i8 > this.f5681c) {
                return false;
            }
        } else if (i8 >= this.f5680b && i8 <= this.f5681c) {
            return false;
        }
        if (i8 > 65535) {
            writer.write(a(i8));
            return true;
        }
        writer.write("\\u");
        char[] cArr = b.f5660a;
        writer.write(cArr[(i8 >> 12) & 15]);
        writer.write(cArr[(i8 >> 8) & 15]);
        writer.write(cArr[(i8 >> 4) & 15]);
        writer.write(cArr[i8 & 15]);
        return true;
    }

    protected j(int i8, int i9, boolean z8) {
        this.f5680b = i8;
        this.f5681c = i9;
        this.f5682d = z8;
    }
}
