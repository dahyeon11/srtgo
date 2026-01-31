package W3;

import java.util.Map;

/* loaded from: classes2.dex */
public final class t extends y {

    /* renamed from: i, reason: collision with root package name */
    private final y f5348i = new i();

    private static F3.q n(F3.q qVar) throws F3.h {
        String text = qVar.getText();
        if (text.charAt(0) == '0') {
            return new F3.q(text.substring(1), null, qVar.getResultPoints(), F3.a.UPC_A);
        }
        throw F3.h.getFormatInstance();
    }

    @Override // W3.r, F3.o
    public F3.q decode(F3.c cVar) {
        return n(this.f5348i.decode(cVar));
    }

    @Override // W3.y
    public F3.q decodeRow(int i8, M3.a aVar, int[] iArr, Map<F3.e, ?> map) {
        return n(this.f5348i.decodeRow(i8, aVar, iArr, map));
    }

    @Override // W3.y
    protected int i(M3.a aVar, int[] iArr, StringBuilder sb) {
        return this.f5348i.i(aVar, iArr, sb);
    }

    @Override // W3.y
    F3.a m() {
        return F3.a.UPC_A;
    }

    @Override // W3.r, F3.o
    public F3.q decode(F3.c cVar, Map<F3.e, ?> map) {
        return n(this.f5348i.decode(cVar, map));
    }

    @Override // W3.y, W3.r
    public F3.q decodeRow(int i8, M3.a aVar, Map<F3.e, ?> map) {
        return n(this.f5348i.decodeRow(i8, aVar, map));
    }
}
