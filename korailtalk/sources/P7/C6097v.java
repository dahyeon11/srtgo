package p7;

import n7.C5998o;
import n7.W0;
import s7.H;

/* renamed from: p7.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6097v implements W0 {
    public final C5998o cont;

    public C6097v(C5998o c5998o) {
        this.cont = c5998o;
    }

    @Override // n7.W0
    public void invokeOnCancellation(H h8, int i8) {
        this.cont.invokeOnCancellation(h8, i8);
    }
}
