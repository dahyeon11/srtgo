package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Zk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2173Zk0 extends AbstractC2089Xj0 {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC2394bl0 f17629c;

    C2173Zk0(AbstractC2394bl0 abstractC2394bl0, int i8) {
        super(abstractC2394bl0.size(), i8);
        this.f17629c = abstractC2394bl0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2089Xj0
    protected final Object a(int i8) {
        return this.f17629c.get(i8);
    }
}
