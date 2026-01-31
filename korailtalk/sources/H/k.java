package H;

import android.content.Context;
import z.InterfaceC6565N;
import z.O0;
import z.r0;
import z.v0;

/* loaded from: classes.dex */
public final class k implements O0 {

    /* renamed from: a */
    private final l f1538a;

    /* renamed from: b */
    private final m f1539b;

    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1540a;

        static {
            int[] iArr = new int[O0.b.values().length];
            f1540a = iArr;
            try {
                iArr[O0.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1540a[O0.b.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1540a[O0.b.VIDEO_CAPTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public k(int i8, n nVar, Context context) {
        this.f1538a = new l(i8, nVar, context);
        this.f1539b = new m(i8, nVar, context);
    }

    @Override // z.O0
    public InterfaceC6565N getConfig(O0.b bVar) {
        r0 r0VarFrom;
        int i8 = a.f1540a[bVar.ordinal()];
        if (i8 == 1) {
            r0VarFrom = r0.from((InterfaceC6565N) this.f1538a.getConfig());
        } else {
            if (i8 != 2) {
                if (i8 != 3) {
                    return null;
                }
                throw new IllegalArgumentException("CameraX Extensions doesn't support VideoCapture!");
            }
            r0VarFrom = r0.from((InterfaceC6565N) this.f1539b.getConfig());
        }
        return v0.from(r0VarFrom);
    }
}
