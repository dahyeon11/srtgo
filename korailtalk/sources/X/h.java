package x;

import android.util.Size;
import w.s;
import z.H0;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final s f37485a;

    public h() {
        this((s) w.i.get(s.class));
    }

    public Size getMaxPreviewResolution(Size size) {
        Size sizeSelectResolution;
        s sVar = this.f37485a;
        return (sVar == null || (sizeSelectResolution = sVar.selectResolution(H0.b.PRIV)) == null || sizeSelectResolution.getWidth() * sizeSelectResolution.getHeight() <= size.getWidth() * size.getHeight()) ? size : sizeSelectResolution;
    }

    h(s sVar) {
        this.f37485a = sVar;
    }
}
