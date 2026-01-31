package d1;

import android.graphics.Color;
import e1.AbstractC5342c;

/* renamed from: d1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5312g implements N {
    public static final C5312g INSTANCE = new C5312g();

    private C5312g() {
    }

    @Override // d1.N
    public Integer parse(AbstractC5342c abstractC5342c, float f8) {
        boolean z8 = abstractC5342c.peek() == AbstractC5342c.b.BEGIN_ARRAY;
        if (z8) {
            abstractC5342c.beginArray();
        }
        double dNextDouble = abstractC5342c.nextDouble();
        double dNextDouble2 = abstractC5342c.nextDouble();
        double dNextDouble3 = abstractC5342c.nextDouble();
        double dNextDouble4 = abstractC5342c.peek() == AbstractC5342c.b.NUMBER ? abstractC5342c.nextDouble() : 1.0d;
        if (z8) {
            abstractC5342c.endArray();
        }
        if (dNextDouble <= 1.0d && dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d) {
            dNextDouble *= 255.0d;
            dNextDouble2 *= 255.0d;
            dNextDouble3 *= 255.0d;
            if (dNextDouble4 <= 1.0d) {
                dNextDouble4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dNextDouble4, (int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3));
    }
}
