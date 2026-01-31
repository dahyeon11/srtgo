package j4;

/* loaded from: classes2.dex */
public class s implements Comparable {
    public final int height;
    public final int width;

    public s(int i8, int i9) {
        this.width = i8;
        this.height = i9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.width == sVar.width && this.height == sVar.height;
    }

    public boolean fitsIn(s sVar) {
        return this.width <= sVar.width && this.height <= sVar.height;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    public s rotate() {
        return new s(this.height, this.width);
    }

    public s scale(int i8, int i9) {
        return new s((this.width * i8) / i9, (this.height * i8) / i9);
    }

    public s scaleCrop(s sVar) {
        int i8 = this.width;
        int i9 = sVar.height;
        int i10 = i8 * i9;
        int i11 = sVar.width;
        int i12 = this.height;
        return i10 <= i11 * i12 ? new s(i11, (i12 * i11) / i8) : new s((i8 * i9) / i12, i9);
    }

    public s scaleFit(s sVar) {
        int i8 = this.width;
        int i9 = sVar.height;
        int i10 = i8 * i9;
        int i11 = sVar.width;
        int i12 = this.height;
        return i10 >= i11 * i12 ? new s(i11, (i12 * i11) / i8) : new s((i8 * i9) / i12, i9);
    }

    public String toString() {
        return this.width + "x" + this.height;
    }

    @Override // java.lang.Comparable
    public int compareTo(s sVar) {
        int i8 = this.height * this.width;
        int i9 = sVar.height * sVar.width;
        if (i9 < i8) {
            return 1;
        }
        return i9 > i8 ? -1 : 0;
    }
}
