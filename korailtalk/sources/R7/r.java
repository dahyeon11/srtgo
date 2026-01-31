package r7;

import p7.EnumC6064b;
import q7.InterfaceC6147i;
import q7.InterfaceC6148j;

/* loaded from: classes3.dex */
public interface r extends InterfaceC6147i {

    public static final class a {
        public static /* synthetic */ InterfaceC6147i fuse$default(r rVar, W6.g gVar, int i8, EnumC6064b enumC6064b, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i9 & 1) != 0) {
                gVar = W6.h.INSTANCE;
            }
            if ((i9 & 2) != 0) {
                i8 = -3;
            }
            if ((i9 & 4) != 0) {
                enumC6064b = EnumC6064b.SUSPEND;
            }
            return rVar.fuse(gVar, i8, enumC6064b);
        }
    }

    @Override // q7.InterfaceC6147i
    /* synthetic */ Object collect(InterfaceC6148j interfaceC6148j, W6.d dVar);

    InterfaceC6147i fuse(W6.g gVar, int i8, EnumC6064b enumC6064b);
}
