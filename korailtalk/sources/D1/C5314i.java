package d1;

import Y0.b;
import e1.AbstractC5342c;

/* renamed from: d1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5314i implements N {
    public static final C5314i INSTANCE = new C5314i();

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5342c.a f29997a = AbstractC5342c.a.of("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private C5314i() {
    }

    @Override // d1.N
    public Y0.b parse(AbstractC5342c abstractC5342c, float f8) {
        b.a aVar = b.a.CENTER;
        abstractC5342c.beginObject();
        b.a aVar2 = aVar;
        String strNextString = null;
        String strNextString2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iD = 0;
        int iD2 = 0;
        boolean zNextBoolean = true;
        while (abstractC5342c.hasNext()) {
            switch (abstractC5342c.selectName(f29997a)) {
                case 0:
                    strNextString = abstractC5342c.nextString();
                    break;
                case 1:
                    strNextString2 = abstractC5342c.nextString();
                    break;
                case 2:
                    fNextDouble = (float) abstractC5342c.nextDouble();
                    break;
                case 3:
                    int iNextInt2 = abstractC5342c.nextInt();
                    aVar2 = b.a.CENTER;
                    if (iNextInt2 <= aVar2.ordinal() && iNextInt2 >= 0) {
                        aVar2 = b.a.values()[iNextInt2];
                        break;
                    } else {
                        break;
                    }
                    break;
                case 4:
                    iNextInt = abstractC5342c.nextInt();
                    break;
                case 5:
                    fNextDouble2 = (float) abstractC5342c.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) abstractC5342c.nextDouble();
                    break;
                case 7:
                    iD = s.d(abstractC5342c);
                    break;
                case 8:
                    iD2 = s.d(abstractC5342c);
                    break;
                case 9:
                    fNextDouble4 = (float) abstractC5342c.nextDouble();
                    break;
                case 10:
                    zNextBoolean = abstractC5342c.nextBoolean();
                    break;
                default:
                    abstractC5342c.skipName();
                    abstractC5342c.skipValue();
                    break;
            }
        }
        abstractC5342c.endObject();
        return new Y0.b(strNextString, strNextString2, fNextDouble, aVar2, iNextInt, fNextDouble2, fNextDouble3, iD, iD2, fNextDouble4, zNextBoolean);
    }
}
