package d1;

import android.graphics.Color;
import android.graphics.PointF;
import e1.AbstractC5342c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5342c.a f30019a = AbstractC5342c.a.of("x", "y");

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30020a;

        static {
            int[] iArr = new int[AbstractC5342c.b.values().length];
            f30020a = iArr;
            try {
                iArr[AbstractC5342c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30020a[AbstractC5342c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30020a[AbstractC5342c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static PointF a(AbstractC5342c abstractC5342c, float f8) {
        abstractC5342c.beginArray();
        float fNextDouble = (float) abstractC5342c.nextDouble();
        float fNextDouble2 = (float) abstractC5342c.nextDouble();
        while (abstractC5342c.peek() != AbstractC5342c.b.END_ARRAY) {
            abstractC5342c.skipValue();
        }
        abstractC5342c.endArray();
        return new PointF(fNextDouble * f8, fNextDouble2 * f8);
    }

    private static PointF b(AbstractC5342c abstractC5342c, float f8) {
        float fNextDouble = (float) abstractC5342c.nextDouble();
        float fNextDouble2 = (float) abstractC5342c.nextDouble();
        while (abstractC5342c.hasNext()) {
            abstractC5342c.skipValue();
        }
        return new PointF(fNextDouble * f8, fNextDouble2 * f8);
    }

    private static PointF c(AbstractC5342c abstractC5342c, float f8) {
        abstractC5342c.beginObject();
        float fG = 0.0f;
        float fG2 = 0.0f;
        while (abstractC5342c.hasNext()) {
            int iSelectName = abstractC5342c.selectName(f30019a);
            if (iSelectName == 0) {
                fG = g(abstractC5342c);
            } else if (iSelectName != 1) {
                abstractC5342c.skipName();
                abstractC5342c.skipValue();
            } else {
                fG2 = g(abstractC5342c);
            }
        }
        abstractC5342c.endObject();
        return new PointF(fG * f8, fG2 * f8);
    }

    static int d(AbstractC5342c abstractC5342c) {
        abstractC5342c.beginArray();
        int iNextDouble = (int) (abstractC5342c.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (abstractC5342c.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (abstractC5342c.nextDouble() * 255.0d);
        while (abstractC5342c.hasNext()) {
            abstractC5342c.skipValue();
        }
        abstractC5342c.endArray();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    static PointF e(AbstractC5342c abstractC5342c, float f8) {
        int i8 = a.f30020a[abstractC5342c.peek().ordinal()];
        if (i8 == 1) {
            return b(abstractC5342c, f8);
        }
        if (i8 == 2) {
            return a(abstractC5342c, f8);
        }
        if (i8 == 3) {
            return c(abstractC5342c, f8);
        }
        throw new IllegalArgumentException("Unknown point starts with " + abstractC5342c.peek());
    }

    static List f(AbstractC5342c abstractC5342c, float f8) {
        ArrayList arrayList = new ArrayList();
        abstractC5342c.beginArray();
        while (abstractC5342c.peek() == AbstractC5342c.b.BEGIN_ARRAY) {
            abstractC5342c.beginArray();
            arrayList.add(e(abstractC5342c, f8));
            abstractC5342c.endArray();
        }
        abstractC5342c.endArray();
        return arrayList;
    }

    static float g(AbstractC5342c abstractC5342c) {
        AbstractC5342c.b bVarPeek = abstractC5342c.peek();
        int i8 = a.f30020a[bVarPeek.ordinal()];
        if (i8 == 1) {
            return (float) abstractC5342c.nextDouble();
        }
        if (i8 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + bVarPeek);
        }
        abstractC5342c.beginArray();
        float fNextDouble = (float) abstractC5342c.nextDouble();
        while (abstractC5342c.hasNext()) {
            abstractC5342c.skipValue();
        }
        abstractC5342c.endArray();
        return fNextDouble;
    }
}
