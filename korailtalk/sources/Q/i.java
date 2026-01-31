package Q;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class i {
    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;

    /* renamed from: l, reason: collision with root package name */
    private static int f3876l = 1;

    /* renamed from: a, reason: collision with root package name */
    private String f3877a;

    /* renamed from: b, reason: collision with root package name */
    int f3878b;

    /* renamed from: c, reason: collision with root package name */
    float[] f3879c;
    public float computedValue;

    /* renamed from: d, reason: collision with root package name */
    float[] f3880d;

    /* renamed from: e, reason: collision with root package name */
    a f3881e;

    /* renamed from: f, reason: collision with root package name */
    b[] f3882f;

    /* renamed from: g, reason: collision with root package name */
    int f3883g;

    /* renamed from: h, reason: collision with root package name */
    boolean f3884h;

    /* renamed from: i, reason: collision with root package name */
    int f3885i;
    public int id;
    public boolean inGoal;
    public boolean isFinalValue;

    /* renamed from: j, reason: collision with root package name */
    float f3886j;

    /* renamed from: k, reason: collision with root package name */
    HashSet f3887k;
    public int strength;
    public int usageInRowCount;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(String str, a aVar) {
        this.id = -1;
        this.f3878b = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.f3879c = new float[9];
        this.f3880d = new float[9];
        this.f3882f = new b[16];
        this.f3883g = 0;
        this.usageInRowCount = 0;
        this.f3884h = false;
        this.f3885i = -1;
        this.f3886j = 0.0f;
        this.f3887k = null;
        this.f3877a = str;
        this.f3881e = aVar;
    }

    static void a() {
        f3876l++;
    }

    public final void addToRow(b bVar) {
        int i8 = 0;
        while (true) {
            int i9 = this.f3883g;
            if (i8 >= i9) {
                b[] bVarArr = this.f3882f;
                if (i9 >= bVarArr.length) {
                    this.f3882f = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f3882f;
                int i10 = this.f3883g;
                bVarArr2[i10] = bVar;
                this.f3883g = i10 + 1;
                return;
            }
            if (this.f3882f[i8] == bVar) {
                return;
            } else {
                i8++;
            }
        }
    }

    public String getName() {
        return this.f3877a;
    }

    public final void removeFromRow(b bVar) {
        int i8 = this.f3883g;
        int i9 = 0;
        while (i9 < i8) {
            if (this.f3882f[i9] == bVar) {
                while (i9 < i8 - 1) {
                    b[] bVarArr = this.f3882f;
                    int i10 = i9 + 1;
                    bVarArr[i9] = bVarArr[i10];
                    i9 = i10;
                }
                this.f3883g--;
                return;
            }
            i9++;
        }
    }

    public void reset() {
        this.f3877a = null;
        this.f3881e = a.UNKNOWN;
        this.strength = 0;
        this.id = -1;
        this.f3878b = -1;
        this.computedValue = 0.0f;
        this.isFinalValue = false;
        this.f3884h = false;
        this.f3885i = -1;
        this.f3886j = 0.0f;
        int i8 = this.f3883g;
        for (int i9 = 0; i9 < i8; i9++) {
            this.f3882f[i9] = null;
        }
        this.f3883g = 0;
        this.usageInRowCount = 0;
        this.inGoal = false;
        Arrays.fill(this.f3880d, 0.0f);
    }

    public void setFinalValue(d dVar, float f8) {
        this.computedValue = f8;
        this.isFinalValue = true;
        this.f3884h = false;
        this.f3885i = -1;
        this.f3886j = 0.0f;
        int i8 = this.f3883g;
        this.f3878b = -1;
        for (int i9 = 0; i9 < i8; i9++) {
            this.f3882f[i9].updateFromFinalVariable(dVar, this, false);
        }
        this.f3883g = 0;
    }

    public void setName(String str) {
        this.f3877a = str;
    }

    public void setSynonym(d dVar, i iVar, float f8) {
        this.f3884h = true;
        this.f3885i = iVar.id;
        this.f3886j = f8;
        int i8 = this.f3883g;
        this.f3878b = -1;
        for (int i9 = 0; i9 < i8; i9++) {
            this.f3882f[i9].updateFromSynonymVariable(dVar, this, false);
        }
        this.f3883g = 0;
        dVar.displayReadableRows();
    }

    public void setType(a aVar, String str) {
        this.f3881e = aVar;
    }

    public String toString() {
        if (this.f3877a != null) {
            return "" + this.f3877a;
        }
        return "" + this.id;
    }

    public final void updateReferencesWithNewDefinition(d dVar, b bVar) {
        int i8 = this.f3883g;
        for (int i9 = 0; i9 < i8; i9++) {
            this.f3882f[i9].updateFromRow(dVar, bVar, false);
        }
        this.f3883g = 0;
    }

    public i(a aVar, String str) {
        this.id = -1;
        this.f3878b = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.f3879c = new float[9];
        this.f3880d = new float[9];
        this.f3882f = new b[16];
        this.f3883g = 0;
        this.usageInRowCount = 0;
        this.f3884h = false;
        this.f3885i = -1;
        this.f3886j = 0.0f;
        this.f3887k = null;
        this.f3881e = aVar;
    }
}
