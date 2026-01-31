package i4;

import java.lang.reflect.Array;

/* renamed from: i4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5696b {

    /* renamed from: a, reason: collision with root package name */
    private final byte[][] f31893a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31894b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31895c;

    public C5696b(int i8, int i9) {
        this.f31893a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i9, i8);
        this.f31894b = i8;
        this.f31895c = i9;
    }

    public void clear(byte b9) {
        for (int i8 = 0; i8 < this.f31895c; i8++) {
            for (int i9 = 0; i9 < this.f31894b; i9++) {
                this.f31893a[i8][i9] = b9;
            }
        }
    }

    public byte get(int i8, int i9) {
        return this.f31893a[i9][i8];
    }

    public byte[][] getArray() {
        return this.f31893a;
    }

    public int getHeight() {
        return this.f31895c;
    }

    public int getWidth() {
        return this.f31894b;
    }

    public void set(int i8, int i9, byte b9) {
        this.f31893a[i9][i8] = b9;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f31894b * 2 * this.f31895c) + 2);
        for (int i8 = 0; i8 < this.f31895c; i8++) {
            for (int i9 = 0; i9 < this.f31894b; i9++) {
                byte b9 = this.f31893a[i8][i9];
                if (b9 == 0) {
                    sb.append(" 0");
                } else if (b9 != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public void set(int i8, int i9, int i10) {
        this.f31893a[i9][i8] = (byte) i10;
    }

    public void set(int i8, int i9, boolean z8) {
        this.f31893a[i9][i8] = z8 ? (byte) 1 : (byte) 0;
    }
}
