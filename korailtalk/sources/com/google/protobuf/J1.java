package com.google.protobuf;

import com.google.protobuf.G1;

/* loaded from: classes2.dex */
class J1 extends F1 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f26172a;

    public J1(boolean z8) {
        this.f26172a = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public G1 g(Object obj) {
        return ((AbstractC5209f0) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(G1 g12) {
        return g12.getSerializedSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(G1 g12) {
        return g12.getSerializedSizeAsMessageSet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public G1 k(G1 g12, G1 g13) {
        return g12.toBuilder().mergeFrom(g13).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public G1.b n() {
        return G1.newBuilder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, G1.b bVar) {
        ((AbstractC5209f0) obj).unknownFields = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, G1 g12) {
        ((AbstractC5209f0) obj).unknownFields = g12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public G1 r(G1.b bVar) {
        return bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(G1 g12, R1 r12) {
        g12.b(r12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(G1 g12, R1 r12) {
        g12.c(r12);
    }

    @Override // com.google.protobuf.F1
    void j(Object obj) {
    }

    @Override // com.google.protobuf.F1
    boolean q(InterfaceC5210f1 interfaceC5210f1) {
        return interfaceC5210f1.shouldDiscardUnknownFields();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(G1.b bVar, int i8, int i9) {
        bVar.mergeField(i8, G1.c.newBuilder().addFixed32(i9).build());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(G1.b bVar, int i8, long j8) {
        bVar.mergeField(i8, G1.c.newBuilder().addFixed64(j8).build());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(G1.b bVar, int i8, G1 g12) {
        bVar.mergeField(i8, G1.c.newBuilder().addGroup(g12).build());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(G1.b bVar, int i8, AbstractC5235o abstractC5235o) {
        bVar.mergeField(i8, G1.c.newBuilder().addLengthDelimited(abstractC5235o).build());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(G1.b bVar, int i8, long j8) {
        bVar.mergeField(i8, G1.c.newBuilder().addVarint(j8).build());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.F1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public G1.b f(Object obj) {
        return ((AbstractC5209f0) obj).unknownFields.toBuilder();
    }
}
