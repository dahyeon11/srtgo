package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {
    public static final b NONE = new b(0, 0, 0, 0);
    public final int bottom;
    public final int left;
    public final int right;
    public final int top;

    static class a {
        static Insets a(int i8, int i9, int i10, int i11) {
            return Insets.of(i8, i9, i10, i11);
        }
    }

    private b(int i8, int i9, int i10, int i11) {
        this.left = i8;
        this.top = i9;
        this.right = i10;
        this.bottom = i11;
    }

    public static b add(b bVar, b bVar2) {
        return of(bVar.left + bVar2.left, bVar.top + bVar2.top, bVar.right + bVar2.right, bVar.bottom + bVar2.bottom);
    }

    public static b max(b bVar, b bVar2) {
        return of(Math.max(bVar.left, bVar2.left), Math.max(bVar.top, bVar2.top), Math.max(bVar.right, bVar2.right), Math.max(bVar.bottom, bVar2.bottom));
    }

    public static b min(b bVar, b bVar2) {
        return of(Math.min(bVar.left, bVar2.left), Math.min(bVar.top, bVar2.top), Math.min(bVar.right, bVar2.right), Math.min(bVar.bottom, bVar2.bottom));
    }

    public static b of(int i8, int i9, int i10, int i11) {
        return (i8 == 0 && i9 == 0 && i10 == 0 && i11 == 0) ? NONE : new b(i8, i9, i10, i11);
    }

    public static b subtract(b bVar, b bVar2) {
        return of(bVar.left - bVar2.left, bVar.top - bVar2.top, bVar.right - bVar2.right, bVar.bottom - bVar2.bottom);
    }

    public static b toCompatInsets(Insets insets) {
        return of(insets.left, insets.top, insets.right, insets.bottom);
    }

    @Deprecated
    public static b wrap(Insets insets) {
        return toCompatInsets(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.bottom == bVar.bottom && this.left == bVar.left && this.right == bVar.right && this.top == bVar.top;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public Insets toPlatformInsets() {
        return a.a(this.left, this.top, this.right, this.bottom);
    }

    public String toString() {
        return "Insets{left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
    }

    public static b of(Rect rect) {
        return of(rect.left, rect.top, rect.right, rect.bottom);
    }
}
