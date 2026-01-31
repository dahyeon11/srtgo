package K1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f2771a;

    /* renamed from: b, reason: collision with root package name */
    private final double[] f2772b;

    /* renamed from: c, reason: collision with root package name */
    private final double[] f2773c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f2774d;

    /* renamed from: e, reason: collision with root package name */
    private int f2775e;

    /* synthetic */ J(H h8, I i8) {
        int size = h8.f2769b.size();
        this.f2771a = (String[]) h8.f2768a.toArray(new String[size]);
        this.f2772b = a(h8.f2769b);
        this.f2773c = a(h8.f2770c);
        this.f2774d = new int[size];
        this.f2775e = 0;
    }

    private static final double[] a(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i8 = 0; i8 < size; i8++) {
            dArr[i8] = ((Double) list.get(i8)).doubleValue();
        }
        return dArr;
    }

    public final List zza() {
        J j8 = this;
        ArrayList arrayList = new ArrayList(j8.f2771a.length);
        int i8 = 0;
        while (true) {
            String[] strArr = j8.f2771a;
            if (i8 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i8];
            double[] dArr = j8.f2773c;
            double[] dArr2 = j8.f2772b;
            int[] iArr = j8.f2774d;
            double d9 = dArr[i8];
            double d10 = dArr2[i8];
            int i9 = iArr[i8];
            arrayList.add(new G(str, d9, d10, i9 / j8.f2775e, i9));
            i8++;
            j8 = this;
        }
    }

    public final void zzb(double d9) {
        this.f2775e++;
        int i8 = 0;
        while (true) {
            double[] dArr = this.f2773c;
            if (i8 >= dArr.length) {
                return;
            }
            double d10 = dArr[i8];
            if (d10 <= d9 && d9 < this.f2772b[i8]) {
                int[] iArr = this.f2774d;
                iArr[i8] = iArr[i8] + 1;
            }
            if (d9 < d10) {
                return;
            } else {
                i8++;
            }
        }
    }
}
