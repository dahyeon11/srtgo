package i4;

import g4.h;
import g4.j;

/* renamed from: i4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5700f {
    public static final int NUM_MASK_PATTERNS = 8;

    /* renamed from: a, reason: collision with root package name */
    private h f31902a;

    /* renamed from: b, reason: collision with root package name */
    private g4.f f31903b;

    /* renamed from: c, reason: collision with root package name */
    private j f31904c;

    /* renamed from: d, reason: collision with root package name */
    private int f31905d = -1;

    /* renamed from: e, reason: collision with root package name */
    private C5696b f31906e;

    public static boolean isValidMaskPattern(int i8) {
        return i8 >= 0 && i8 < 8;
    }

    public g4.f getECLevel() {
        return this.f31903b;
    }

    public int getMaskPattern() {
        return this.f31905d;
    }

    public C5696b getMatrix() {
        return this.f31906e;
    }

    public h getMode() {
        return this.f31902a;
    }

    public j getVersion() {
        return this.f31904c;
    }

    public void setECLevel(g4.f fVar) {
        this.f31903b = fVar;
    }

    public void setMaskPattern(int i8) {
        this.f31905d = i8;
    }

    public void setMatrix(C5696b c5696b) {
        this.f31906e = c5696b;
    }

    public void setMode(h hVar) {
        this.f31902a = hVar;
    }

    public void setVersion(j jVar) {
        this.f31904c = jVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f31902a);
        sb.append("\n ecLevel: ");
        sb.append(this.f31903b);
        sb.append("\n version: ");
        sb.append(this.f31904c);
        sb.append("\n maskPattern: ");
        sb.append(this.f31905d);
        if (this.f31906e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f31906e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
