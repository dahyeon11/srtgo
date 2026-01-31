package com.google.protobuf;

/* loaded from: classes2.dex */
class I1 extends F1 {
    I1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public H1 g(Object obj) {
        return ((AbstractC5206e0) obj).f26409b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(H1 h12) {
        return h12.getSerializedSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(H1 h12) {
        return h12.getSerializedSizeAsMessageSet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public H1 k(H1 h12, H1 h13) {
        return H1.getDefaultInstance().equals(h13) ? h12 : H1.getDefaultInstance().equals(h12) ? H1.f(h12, h13) : h12.e(h13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public H1 n() {
        return H1.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, H1 h12) {
        p(obj, h12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, H1 h12) {
        ((AbstractC5206e0) obj).f26409b = h12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public H1 r(H1 h12) {
        h12.makeImmutable();
        return h12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(H1 h12, R1 r12) {
        h12.l(r12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(H1 h12, R1 r12) {
        h12.writeTo(r12);
    }

    @Override // com.google.protobuf.F1
    void j(Object obj) {
        g(obj).makeImmutable();
    }

    @Override // com.google.protobuf.F1
    boolean q(InterfaceC5210f1 interfaceC5210f1) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(H1 h12, int i8, int i9) {
        h12.j(P1.a(i8, 5), Integer.valueOf(i9));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(H1 h12, int i8, long j8) {
        h12.j(P1.a(i8, 1), Long.valueOf(j8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(H1 h12, int i8, H1 h13) {
        h12.j(P1.a(i8, 3), h13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(H1 h12, int i8, AbstractC5235o abstractC5235o) {
        h12.j(P1.a(i8, 2), abstractC5235o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(H1 h12, int i8, long j8) {
        h12.j(P1.a(i8, 0), Long.valueOf(j8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public H1 f(Object obj) {
        H1 h1G = g(obj);
        if (h1G != H1.getDefaultInstance()) {
            return h1G;
        }
        H1 h1G2 = H1.g();
        p(obj, h1G2);
        return h1G2;
    }
}
