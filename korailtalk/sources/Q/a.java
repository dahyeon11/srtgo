package Q;

import Q.b;
import Q7.X;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l, reason: collision with root package name */
    private static float f3827l = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final b f3829b;

    /* renamed from: c, reason: collision with root package name */
    protected final c f3830c;

    /* renamed from: a, reason: collision with root package name */
    int f3828a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f3831d = 8;

    /* renamed from: e, reason: collision with root package name */
    private i f3832e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f3833f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f3834g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f3835h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f3836i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f3837j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3838k = false;

    a(b bVar, c cVar) {
        this.f3829b = bVar;
        this.f3830c = cVar;
    }

    @Override // Q.b.a
    public void add(i iVar, float f8, boolean z8) {
        float f9 = f3827l;
        if (f8 <= (-f9) || f8 >= f9) {
            int i8 = this.f3836i;
            if (i8 == -1) {
                this.f3836i = 0;
                this.f3835h[0] = f8;
                this.f3833f[0] = iVar.id;
                this.f3834g[0] = -1;
                iVar.usageInRowCount++;
                iVar.addToRow(this.f3829b);
                this.f3828a++;
                if (this.f3838k) {
                    return;
                }
                int i9 = this.f3837j + 1;
                this.f3837j = i9;
                int[] iArr = this.f3833f;
                if (i9 >= iArr.length) {
                    this.f3838k = true;
                    this.f3837j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i10 = -1;
            for (int i11 = 0; i8 != -1 && i11 < this.f3828a; i11++) {
                int i12 = this.f3833f[i8];
                int i13 = iVar.id;
                if (i12 == i13) {
                    float[] fArr = this.f3835h;
                    float f10 = fArr[i8] + f8;
                    float f11 = f3827l;
                    if (f10 > (-f11) && f10 < f11) {
                        f10 = 0.0f;
                    }
                    fArr[i8] = f10;
                    if (f10 == 0.0f) {
                        if (i8 == this.f3836i) {
                            this.f3836i = this.f3834g[i8];
                        } else {
                            int[] iArr2 = this.f3834g;
                            iArr2[i10] = iArr2[i8];
                        }
                        if (z8) {
                            iVar.removeFromRow(this.f3829b);
                        }
                        if (this.f3838k) {
                            this.f3837j = i8;
                        }
                        iVar.usageInRowCount--;
                        this.f3828a--;
                        return;
                    }
                    return;
                }
                if (i12 < i13) {
                    i10 = i8;
                }
                i8 = this.f3834g[i8];
            }
            int length = this.f3837j;
            int i14 = length + 1;
            if (this.f3838k) {
                int[] iArr3 = this.f3833f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i14;
            }
            int[] iArr4 = this.f3833f;
            if (length >= iArr4.length && this.f3828a < iArr4.length) {
                int i15 = 0;
                while (true) {
                    int[] iArr5 = this.f3833f;
                    if (i15 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i15] == -1) {
                        length = i15;
                        break;
                    }
                    i15++;
                }
            }
            int[] iArr6 = this.f3833f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i16 = this.f3831d * 2;
                this.f3831d = i16;
                this.f3838k = false;
                this.f3837j = length - 1;
                this.f3835h = Arrays.copyOf(this.f3835h, i16);
                this.f3833f = Arrays.copyOf(this.f3833f, this.f3831d);
                this.f3834g = Arrays.copyOf(this.f3834g, this.f3831d);
            }
            this.f3833f[length] = iVar.id;
            this.f3835h[length] = f8;
            if (i10 != -1) {
                int[] iArr7 = this.f3834g;
                iArr7[length] = iArr7[i10];
                iArr7[i10] = length;
            } else {
                this.f3834g[length] = this.f3836i;
                this.f3836i = length;
            }
            iVar.usageInRowCount++;
            iVar.addToRow(this.f3829b);
            this.f3828a++;
            if (!this.f3838k) {
                this.f3837j++;
            }
            int i17 = this.f3837j;
            int[] iArr8 = this.f3833f;
            if (i17 >= iArr8.length) {
                this.f3838k = true;
                this.f3837j = iArr8.length - 1;
            }
        }
    }

    @Override // Q.b.a
    public final void clear() {
        int i8 = this.f3836i;
        for (int i9 = 0; i8 != -1 && i9 < this.f3828a; i9++) {
            i iVar = this.f3830c.f3847d[this.f3833f[i8]];
            if (iVar != null) {
                iVar.removeFromRow(this.f3829b);
            }
            i8 = this.f3834g[i8];
        }
        this.f3836i = -1;
        this.f3837j = -1;
        this.f3838k = false;
        this.f3828a = 0;
    }

    @Override // Q.b.a
    public boolean contains(i iVar) {
        int i8 = this.f3836i;
        if (i8 == -1) {
            return false;
        }
        for (int i9 = 0; i8 != -1 && i9 < this.f3828a; i9++) {
            if (this.f3833f[i8] == iVar.id) {
                return true;
            }
            i8 = this.f3834g[i8];
        }
        return false;
    }

    @Override // Q.b.a
    public void display() {
        int i8 = this.f3828a;
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
        int i8 = this.f3836i;
        for (int i9 = 0; i8 != -1 && i9 < this.f3828a; i9++) {
            float[] fArr = this.f3835h;
            fArr[i8] = fArr[i8] / f8;
            i8 = this.f3834g[i8];
        }
    }

    @Override // Q.b.a
    public final float get(i iVar) {
        int i8 = this.f3836i;
        for (int i9 = 0; i8 != -1 && i9 < this.f3828a; i9++) {
            if (this.f3833f[i8] == iVar.id) {
                return this.f3835h[i8];
            }
            i8 = this.f3834g[i8];
        }
        return 0.0f;
    }

    @Override // Q.b.a
    public int getCurrentSize() {
        return this.f3828a;
    }

    public int getHead() {
        return this.f3836i;
    }

    public final int getId(int i8) {
        return this.f3833f[i8];
    }

    public final int getNextIndice(int i8) {
        return this.f3834g[i8];
    }

    public final float getValue(int i8) {
        return this.f3835h[i8];
    }

    @Override // Q.b.a
    public i getVariable(int i8) {
        int i9 = this.f3836i;
        for (int i10 = 0; i9 != -1 && i10 < this.f3828a; i10++) {
            if (i10 == i8) {
                return this.f3830c.f3847d[this.f3833f[i9]];
            }
            i9 = this.f3834g[i9];
        }
        return null;
    }

    @Override // Q.b.a
    public float getVariableValue(int i8) {
        int i9 = this.f3836i;
        for (int i10 = 0; i9 != -1 && i10 < this.f3828a; i10++) {
            if (i10 == i8) {
                return this.f3835h[i9];
            }
            i9 = this.f3834g[i9];
        }
        return 0.0f;
    }

    @Override // Q.b.a
    public int indexOf(i iVar) {
        int i8 = this.f3836i;
        if (i8 == -1) {
            return -1;
        }
        for (int i9 = 0; i8 != -1 && i9 < this.f3828a; i9++) {
            if (this.f3833f[i8] == iVar.id) {
                return i8;
            }
            i8 = this.f3834g[i8];
        }
        return -1;
    }

    @Override // Q.b.a
    public void invert() {
        int i8 = this.f3836i;
        for (int i9 = 0; i8 != -1 && i9 < this.f3828a; i9++) {
            float[] fArr = this.f3835h;
            fArr[i8] = fArr[i8] * (-1.0f);
            i8 = this.f3834g[i8];
        }
    }

    @Override // Q.b.a
    public final void put(i iVar, float f8) {
        if (f8 == 0.0f) {
            remove(iVar, true);
            return;
        }
        int i8 = this.f3836i;
        if (i8 == -1) {
            this.f3836i = 0;
            this.f3835h[0] = f8;
            this.f3833f[0] = iVar.id;
            this.f3834g[0] = -1;
            iVar.usageInRowCount++;
            iVar.addToRow(this.f3829b);
            this.f3828a++;
            if (this.f3838k) {
                return;
            }
            int i9 = this.f3837j + 1;
            this.f3837j = i9;
            int[] iArr = this.f3833f;
            if (i9 >= iArr.length) {
                this.f3838k = true;
                this.f3837j = iArr.length - 1;
                return;
            }
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i8 != -1 && i11 < this.f3828a; i11++) {
            int i12 = this.f3833f[i8];
            int i13 = iVar.id;
            if (i12 == i13) {
                this.f3835h[i8] = f8;
                return;
            }
            if (i12 < i13) {
                i10 = i8;
            }
            i8 = this.f3834g[i8];
        }
        int length = this.f3837j;
        int i14 = length + 1;
        if (this.f3838k) {
            int[] iArr2 = this.f3833f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i14;
        }
        int[] iArr3 = this.f3833f;
        if (length >= iArr3.length && this.f3828a < iArr3.length) {
            int i15 = 0;
            while (true) {
                int[] iArr4 = this.f3833f;
                if (i15 >= iArr4.length) {
                    break;
                }
                if (iArr4[i15] == -1) {
                    length = i15;
                    break;
                }
                i15++;
            }
        }
        int[] iArr5 = this.f3833f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i16 = this.f3831d * 2;
            this.f3831d = i16;
            this.f3838k = false;
            this.f3837j = length - 1;
            this.f3835h = Arrays.copyOf(this.f3835h, i16);
            this.f3833f = Arrays.copyOf(this.f3833f, this.f3831d);
            this.f3834g = Arrays.copyOf(this.f3834g, this.f3831d);
        }
        this.f3833f[length] = iVar.id;
        this.f3835h[length] = f8;
        if (i10 != -1) {
            int[] iArr6 = this.f3834g;
            iArr6[length] = iArr6[i10];
            iArr6[i10] = length;
        } else {
            this.f3834g[length] = this.f3836i;
            this.f3836i = length;
        }
        iVar.usageInRowCount++;
        iVar.addToRow(this.f3829b);
        int i17 = this.f3828a + 1;
        this.f3828a = i17;
        if (!this.f3838k) {
            this.f3837j++;
        }
        int[] iArr7 = this.f3833f;
        if (i17 >= iArr7.length) {
            this.f3838k = true;
        }
        if (this.f3837j >= iArr7.length) {
            this.f3838k = true;
            this.f3837j = iArr7.length - 1;
        }
    }

    @Override // Q.b.a
    public final float remove(i iVar, boolean z8) {
        if (this.f3832e == iVar) {
            this.f3832e = null;
        }
        int i8 = this.f3836i;
        if (i8 == -1) {
            return 0.0f;
        }
        int i9 = 0;
        int i10 = -1;
        while (i8 != -1 && i9 < this.f3828a) {
            if (this.f3833f[i8] == iVar.id) {
                if (i8 == this.f3836i) {
                    this.f3836i = this.f3834g[i8];
                } else {
                    int[] iArr = this.f3834g;
                    iArr[i10] = iArr[i8];
                }
                if (z8) {
                    iVar.removeFromRow(this.f3829b);
                }
                iVar.usageInRowCount--;
                this.f3828a--;
                this.f3833f[i8] = -1;
                if (this.f3838k) {
                    this.f3837j = i8;
                }
                return this.f3835h[i8];
            }
            i9++;
            i10 = i8;
            i8 = this.f3834g[i8];
        }
        return 0.0f;
    }

    @Override // Q.b.a
    public int sizeInBytes() {
        return (this.f3833f.length * 12) + 36;
    }

    public String toString() {
        int i8 = this.f3836i;
        String str = "";
        for (int i9 = 0; i8 != -1 && i9 < this.f3828a; i9++) {
            str = ((str + " -> ") + this.f3835h[i8] + " : ") + this.f3830c.f3847d[this.f3833f[i8]];
            i8 = this.f3834g[i8];
        }
        return str;
    }

    @Override // Q.b.a
    public float use(b bVar, boolean z8) {
        float f8 = get(bVar.f3839a);
        remove(bVar.f3839a, z8);
        b.a aVar = bVar.variables;
        int currentSize = aVar.getCurrentSize();
        for (int i8 = 0; i8 < currentSize; i8++) {
            i variable = aVar.getVariable(i8);
            add(variable, aVar.get(variable) * f8, z8);
        }
        return f8;
    }
}
