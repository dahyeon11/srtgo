package K1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    private final List f2768a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f2769b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List f2770c = new ArrayList();

    public final H zza(String str, double d9, double d10) {
        int i8 = 0;
        while (i8 < this.f2768a.size()) {
            double dDoubleValue = ((Double) this.f2770c.get(i8)).doubleValue();
            double dDoubleValue2 = ((Double) this.f2769b.get(i8)).doubleValue();
            if (d9 < dDoubleValue || (dDoubleValue == d9 && d10 < dDoubleValue2)) {
                break;
            }
            i8++;
        }
        this.f2768a.add(i8, str);
        this.f2770c.add(i8, Double.valueOf(d9));
        this.f2769b.add(i8, Double.valueOf(d10));
        return this;
    }

    public final J zzb() {
        return new J(this, null);
    }
}
