package t;

import s.C6203b;
import z.C6562K;
import z.C6571b0;

/* loaded from: classes.dex */
final class Q0 extends U {

    /* renamed from: c */
    static final Q0 f36525c = new Q0(new x.g());

    /* renamed from: b */
    private final x.g f36526b;

    private Q0(x.g gVar) {
        this.f36526b = gVar;
    }

    @Override // t.U, z.C6562K.b
    public void unpack(z.N0 n02, C6562K.a aVar) {
        super.unpack(n02, aVar);
        if (!(n02 instanceof C6571b0)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        C6571b0 c6571b0 = (C6571b0) n02;
        C6203b.a aVar2 = new C6203b.a();
        if (c6571b0.hasCaptureMode()) {
            this.f36526b.toggleHDRPlus(c6571b0.getCaptureMode(), aVar2);
        }
        aVar.addImplementationOptions(aVar2.build());
    }
}
