package Q;

import Q.b;
import Q7.X;
import java.util.Arrays;

/* loaded from: classes.dex */
public class j implements b.a {

    /* renamed from: n, reason: collision with root package name */
    private static float f3889n = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    private final int f3890a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f3891b = 16;

    /* renamed from: c, reason: collision with root package name */
    private int f3892c = 16;

    /* renamed from: d, reason: collision with root package name */
    int[] f3893d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    int[] f3894e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f3895f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    float[] f3896g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    int[] f3897h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f3898i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int f3899j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f3900k = -1;

    /* renamed from: l, reason: collision with root package name */
    private final b f3901l;

    /* renamed from: m, reason: collision with root package name */
    protected final c f3902m;

    j(b bVar, c cVar) {
        this.f3901l = bVar;
        this.f3902m = cVar;
        clear();
    }

    private void a(i iVar, int i8) {
        int[] iArr;
        int i9 = iVar.id % this.f3892c;
        int[] iArr2 = this.f3893d;
        int i10 = iArr2[i9];
        if (i10 == -1) {
            iArr2[i9] = i8;
        } else {
            while (true) {
                iArr = this.f3894e;
                int i11 = iArr[i10];
                if (i11 == -1) {
                    break;
                } else {
                    i10 = i11;
                }
            }
            iArr[i10] = i8;
        }
        this.f3894e[i8] = -1;
    }

    private void b(int i8, i iVar, float f8) {
        this.f3895f[i8] = iVar.id;
        this.f3896g[i8] = f8;
        this.f3897h[i8] = -1;
        this.f3898i[i8] = -1;
        iVar.addToRow(this.f3901l);
        iVar.usageInRowCount++;
        this.f3899j++;
    }

    private int c() {
        for (int i8 = 0; i8 < this.f3891b; i8++) {
            if (this.f3895f[i8] == -1) {
                return i8;
            }
        }
        return -1;
    }

    private void d() {
        int i8 = this.f3891b * 2;
        this.f3895f = Arrays.copyOf(this.f3895f, i8);
        this.f3896g = Arrays.copyOf(this.f3896g, i8);
        this.f3897h = Arrays.copyOf(this.f3897h, i8);
        this.f3898i = Arrays.copyOf(this.f3898i, i8);
        this.f3894e = Arrays.copyOf(this.f3894e, i8);
        for (int i9 = this.f3891b; i9 < i8; i9++) {
            this.f3895f[i9] = -1;
            this.f3894e[i9] = -1;
        }
        this.f3891b = i8;
    }

    private void e(int i8, i iVar, float f8) {
        int iC = c();
        b(iC, iVar, f8);
        if (i8 != -1) {
            this.f3897h[iC] = i8;
            int[] iArr = this.f3898i;
            iArr[iC] = iArr[i8];
            iArr[i8] = iC;
        } else {
            this.f3897h[iC] = -1;
            if (this.f3899j > 0) {
                this.f3898i[iC] = this.f3900k;
                this.f3900k = iC;
            } else {
                this.f3898i[iC] = -1;
            }
        }
        int i9 = this.f3898i[iC];
        if (i9 != -1) {
            this.f3897h[i9] = iC;
        }
        a(iVar, iC);
    }

    private void f(i iVar) {
        int[] iArr;
        int i8;
        int i9 = iVar.id;
        int i10 = i9 % this.f3892c;
        int[] iArr2 = this.f3893d;
        int i11 = iArr2[i10];
        if (i11 == -1) {
            return;
        }
        if (this.f3895f[i11] == i9) {
            int[] iArr3 = this.f3894e;
            iArr2[i10] = iArr3[i11];
            iArr3[i11] = -1;
            return;
        }
        while (true) {
            iArr = this.f3894e;
            i8 = iArr[i11];
            if (i8 == -1 || this.f3895f[i8] == i9) {
                break;
            } else {
                i11 = i8;
            }
        }
        if (i8 == -1 || this.f3895f[i8] != i9) {
            return;
        }
        iArr[i11] = iArr[i8];
        iArr[i8] = -1;
    }

    @Override // Q.b.a
    public void add(i iVar, float f8, boolean z8) {
        float f9 = f3889n;
        if (f8 <= (-f9) || f8 >= f9) {
            int iIndexOf = indexOf(iVar);
            if (iIndexOf == -1) {
                put(iVar, f8);
                return;
            }
            float[] fArr = this.f3896g;
            float f10 = fArr[iIndexOf] + f8;
            fArr[iIndexOf] = f10;
            float f11 = f3889n;
            if (f10 <= (-f11) || f10 >= f11) {
                return;
            }
            fArr[iIndexOf] = 0.0f;
            remove(iVar, z8);
        }
    }

    @Override // Q.b.a
    public void clear() {
        int i8 = this.f3899j;
        for (int i9 = 0; i9 < i8; i9++) {
            i variable = getVariable(i9);
            if (variable != null) {
                variable.removeFromRow(this.f3901l);
            }
        }
        for (int i10 = 0; i10 < this.f3891b; i10++) {
            this.f3895f[i10] = -1;
            this.f3894e[i10] = -1;
        }
        for (int i11 = 0; i11 < this.f3892c; i11++) {
            this.f3893d[i11] = -1;
        }
        this.f3899j = 0;
        this.f3900k = -1;
    }

    @Override // Q.b.a
    public boolean contains(i iVar) {
        return indexOf(iVar) != -1;
    }

    @Override // Q.b.a
    public void display() {
        int i8 = this.f3899j;
        System.out.print("{ ");
        for (int i9 = 0; i9 < i8; i9++) {
            i variable = getVariable(i9);
            if (variable != null) {
                System.out.print(variable + " = " + getVariableValue(i9) + X.SPACE);
            }
        }
        System.out.println(" }");
    }

    @Override // Q.b.a
    public void divideByAmount(float f8) {
        int i8 = this.f3899j;
        int i9 = this.f3900k;
        for (int i10 = 0; i10 < i8; i10++) {
            float[] fArr = this.f3896g;
            fArr[i9] = fArr[i9] / f8;
            i9 = this.f3898i[i9];
            if (i9 == -1) {
                return;
            }
        }
    }

    @Override // Q.b.a
    public float get(i iVar) {
        int iIndexOf = indexOf(iVar);
        if (iIndexOf != -1) {
            return this.f3896g[iIndexOf];
        }
        return 0.0f;
    }

    @Override // Q.b.a
    public int getCurrentSize() {
        return this.f3899j;
    }

    @Override // Q.b.a
    public i getVariable(int i8) {
        int i9 = this.f3899j;
        if (i9 == 0) {
            return null;
        }
        int i10 = this.f3900k;
        for (int i11 = 0; i11 < i9; i11++) {
            if (i11 == i8 && i10 != -1) {
                return this.f3902m.f3847d[this.f3895f[i10]];
            }
            i10 = this.f3898i[i10];
            if (i10 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // Q.b.a
    public float getVariableValue(int i8) {
        int i9 = this.f3899j;
        int i10 = this.f3900k;
        for (int i11 = 0; i11 < i9; i11++) {
            if (i11 == i8) {
                return this.f3896g[i10];
            }
            i10 = this.f3898i[i10];
            if (i10 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // Q.b.a
    public int indexOf(i iVar) {
        if (this.f3899j != 0 && iVar != null) {
            int i8 = iVar.id;
            int i9 = this.f3893d[i8 % this.f3892c];
            if (i9 == -1) {
                return -1;
            }
            if (this.f3895f[i9] == i8) {
                return i9;
            }
            do {
                i9 = this.f3894e[i9];
                if (i9 == -1) {
                    break;
                }
            } while (this.f3895f[i9] != i8);
            if (i9 != -1 && this.f3895f[i9] == i8) {
                return i9;
            }
        }
        return -1;
    }

    @Override // Q.b.a
    public void invert() {
        int i8 = this.f3899j;
        int i9 = this.f3900k;
        for (int i10 = 0; i10 < i8; i10++) {
            float[] fArr = this.f3896g;
            fArr[i9] = fArr[i9] * (-1.0f);
            i9 = this.f3898i[i9];
            if (i9 == -1) {
                return;
            }
        }
    }

    @Override // Q.b.a
    public void put(i iVar, float f8) {
        float f9 = f3889n;
        if (f8 > (-f9) && f8 < f9) {
            remove(iVar, true);
            return;
        }
        if (this.f3899j == 0) {
            b(0, iVar, f8);
            a(iVar, 0);
            this.f3900k = 0;
            return;
        }
        int iIndexOf = indexOf(iVar);
        if (iIndexOf != -1) {
            this.f3896g[iIndexOf] = f8;
            return;
        }
        if (this.f3899j + 1 >= this.f3891b) {
            d();
        }
        int i8 = this.f3899j;
        int i9 = this.f3900k;
        int i10 = -1;
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = this.f3895f[i9];
            int i13 = iVar.id;
            if (i12 == i13) {
                this.f3896g[i9] = f8;
                return;
            }
            if (i12 < i13) {
                i10 = i9;
            }
            i9 = this.f3898i[i9];
            if (i9 == -1) {
                break;
            }
        }
        e(i10, iVar, f8);
    }

    @Override // Q.b.a
    public float remove(i iVar, boolean z8) {
        int iIndexOf = indexOf(iVar);
        if (iIndexOf == -1) {
            return 0.0f;
        }
        f(iVar);
        float f8 = this.f3896g[iIndexOf];
        if (this.f3900k == iIndexOf) {
            this.f3900k = this.f3898i[iIndexOf];
        }
        this.f3895f[iIndexOf] = -1;
        int[] iArr = this.f3897h;
        int i8 = iArr[iIndexOf];
        if (i8 != -1) {
            int[] iArr2 = this.f3898i;
            iArr2[i8] = iArr2[iIndexOf];
        }
        int i9 = this.f3898i[iIndexOf];
        if (i9 != -1) {
            iArr[i9] = iArr[iIndexOf];
        }
        this.f3899j--;
        iVar.usageInRowCount--;
        if (z8) {
            iVar.removeFromRow(this.f3901l);
        }
        return f8;
    }

    @Override // Q.b.a
    public int sizeInBytes() {
        return 0;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i8 = this.f3899j;
        for (int i9 = 0; i9 < i8; i9++) {
            i variable = getVariable(i9);
            if (variable != null) {
                String str2 = str + variable + " = " + getVariableValue(i9) + X.SPACE;
                int iIndexOf = indexOf(variable);
                String str3 = str2 + "[p: ";
                String str4 = (this.f3897h[iIndexOf] != -1 ? str3 + this.f3902m.f3847d[this.f3895f[this.f3897h[iIndexOf]]] : str3 + "none") + ", n: ";
                str = (this.f3898i[iIndexOf] != -1 ? str4 + this.f3902m.f3847d[this.f3895f[this.f3898i[iIndexOf]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }

    @Override // Q.b.a
    public float use(b bVar, boolean z8) {
        float f8 = get(bVar.f3839a);
        remove(bVar.f3839a, z8);
        j jVar = (j) bVar.variables;
        int currentSize = jVar.getCurrentSize();
        int i8 = 0;
        int i9 = 0;
        while (i8 < currentSize) {
            int i10 = jVar.f3895f[i9];
            if (i10 != -1) {
                add(this.f3902m.f3847d[i10], jVar.f3896g[i9] * f8, z8);
                i8++;
            }
            i9++;
        }
        return f8;
    }
}
