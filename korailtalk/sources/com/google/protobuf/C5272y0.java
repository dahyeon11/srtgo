package com.google.protobuf;

/* renamed from: com.google.protobuf.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5272y0 implements InterfaceC5222j1 {

    /* renamed from: b, reason: collision with root package name */
    private static final J0 f27419b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final J0 f27420a;

    /* renamed from: com.google.protobuf.y0$a */
    class a implements J0 {
        a() {
        }

        @Override // com.google.protobuf.J0
        public boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.google.protobuf.J0
        public I0 messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* renamed from: com.google.protobuf.y0$b */
    private static class b implements J0 {

        /* renamed from: a, reason: collision with root package name */
        private J0[] f27421a;

        b(J0... j0Arr) {
            this.f27421a = j0Arr;
        }

        @Override // com.google.protobuf.J0
        public boolean isSupported(Class<?> cls) {
            for (J0 j02 : this.f27421a) {
                if (j02.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.J0
        public I0 messageInfoFor(Class<?> cls) {
            for (J0 j02 : this.f27421a) {
                if (j02.isSupported(cls)) {
                    return j02.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public C5272y0() {
        this(a());
    }

    private static J0 a() {
        return new b(C5203d0.getInstance(), b());
    }

    private static J0 b() {
        try {
            int i8 = C5252v.f26813d;
            return (J0) C5252v.class.getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f27419b;
        }
    }

    private static boolean c(I0 i02) {
        return i02.getSyntax() == EnumC5198b1.PROTO2;
    }

    private static InterfaceC5219i1 d(Class cls, I0 i02) {
        return AbstractC5206e0.class.isAssignableFrom(cls) ? c(i02) ? P0.K(cls, i02, V0.b(), AbstractC5251u0.b(), AbstractC5225k1.unknownFieldSetLiteSchema(), Q.b(), G0.b()) : P0.K(cls, i02, V0.b(), AbstractC5251u0.b(), AbstractC5225k1.unknownFieldSetLiteSchema(), null, G0.b()) : c(i02) ? P0.K(cls, i02, V0.a(), AbstractC5251u0.a(), AbstractC5225k1.proto2UnknownFieldSetSchema(), Q.a(), G0.a()) : P0.K(cls, i02, V0.a(), AbstractC5251u0.a(), AbstractC5225k1.proto3UnknownFieldSetSchema(), null, G0.a());
    }

    @Override // com.google.protobuf.InterfaceC5222j1
    public <T> InterfaceC5219i1 createSchema(Class<T> cls) {
        AbstractC5225k1.requireGeneratedMessage(cls);
        I0 i0MessageInfoFor = this.f27420a.messageInfoFor(cls);
        return i0MessageInfoFor.isMessageSetWireFormat() ? AbstractC5206e0.class.isAssignableFrom(cls) ? Q0.c(AbstractC5225k1.unknownFieldSetLiteSchema(), Q.b(), i0MessageInfoFor.getDefaultInstance()) : Q0.c(AbstractC5225k1.proto2UnknownFieldSetSchema(), Q.a(), i0MessageInfoFor.getDefaultInstance()) : d(cls, i0MessageInfoFor);
    }

    private C5272y0(J0 j02) {
        this.f27420a = (J0) AbstractC5227l0.b(j02, "messageInfoFactory");
    }
}
