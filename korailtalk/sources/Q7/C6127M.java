package q7;

import p7.EnumC6064b;

/* renamed from: q7.M, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6127M {
    public final W6.g context;
    public final int extraBufferCapacity;
    public final EnumC6064b onBufferOverflow;
    public final InterfaceC6147i upstream;

    public C6127M(InterfaceC6147i interfaceC6147i, int i8, EnumC6064b enumC6064b, W6.g gVar) {
        this.upstream = interfaceC6147i;
        this.extraBufferCapacity = i8;
        this.onBufferOverflow = enumC6064b;
        this.context = gVar;
    }
}
