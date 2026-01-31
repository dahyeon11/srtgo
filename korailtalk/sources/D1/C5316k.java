package d1;

import e1.AbstractC5342c;

/* renamed from: d1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5316k {

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC5342c.a f30003f = AbstractC5342c.a.of("ef");

    /* renamed from: g, reason: collision with root package name */
    private static final AbstractC5342c.a f30004g = AbstractC5342c.a.of("nm", "v");

    /* renamed from: a, reason: collision with root package name */
    private Z0.a f30005a;

    /* renamed from: b, reason: collision with root package name */
    private Z0.b f30006b;

    /* renamed from: c, reason: collision with root package name */
    private Z0.b f30007c;

    /* renamed from: d, reason: collision with root package name */
    private Z0.b f30008d;

    /* renamed from: e, reason: collision with root package name */
    private Z0.b f30009e;

    private void a(AbstractC5342c abstractC5342c, T0.h hVar) {
        abstractC5342c.beginObject();
        String strNextString = "";
        while (abstractC5342c.hasNext()) {
            int iSelectName = abstractC5342c.selectName(f30004g);
            if (iSelectName == 0) {
                strNextString = abstractC5342c.nextString();
            } else if (iSelectName == 1) {
                strNextString.hashCode();
                switch (strNextString) {
                    case "Distance":
                        this.f30008d = AbstractC5309d.parseFloat(abstractC5342c, hVar);
                        break;
                    case "Opacity":
                        this.f30006b = AbstractC5309d.parseFloat(abstractC5342c, hVar, false);
                        break;
                    case "Direction":
                        this.f30007c = AbstractC5309d.parseFloat(abstractC5342c, hVar, false);
                        break;
                    case "Shadow Color":
                        this.f30005a = AbstractC5309d.c(abstractC5342c, hVar);
                        break;
                    case "Softness":
                        this.f30009e = AbstractC5309d.parseFloat(abstractC5342c, hVar);
                        break;
                    default:
                        abstractC5342c.skipValue();
                        break;
                }
            } else {
                abstractC5342c.skipName();
                abstractC5342c.skipValue();
            }
        }
        abstractC5342c.endObject();
    }

    C5315j b(AbstractC5342c abstractC5342c, T0.h hVar) {
        Z0.b bVar;
        Z0.b bVar2;
        Z0.b bVar3;
        Z0.b bVar4;
        while (abstractC5342c.hasNext()) {
            if (abstractC5342c.selectName(f30003f) != 0) {
                abstractC5342c.skipName();
                abstractC5342c.skipValue();
            } else {
                abstractC5342c.beginArray();
                while (abstractC5342c.hasNext()) {
                    a(abstractC5342c, hVar);
                }
                abstractC5342c.endArray();
            }
        }
        Z0.a aVar = this.f30005a;
        if (aVar == null || (bVar = this.f30006b) == null || (bVar2 = this.f30007c) == null || (bVar3 = this.f30008d) == null || (bVar4 = this.f30009e) == null) {
            return null;
        }
        return new C5315j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
