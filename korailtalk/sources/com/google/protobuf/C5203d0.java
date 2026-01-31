package com.google.protobuf;

/* renamed from: com.google.protobuf.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5203d0 implements J0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C5203d0 f26403a = new C5203d0();

    private C5203d0() {
    }

    public static C5203d0 getInstance() {
        return f26403a;
    }

    @Override // com.google.protobuf.J0
    public boolean isSupported(Class<?> cls) {
        return AbstractC5206e0.class.isAssignableFrom(cls);
    }

    @Override // com.google.protobuf.J0
    public I0 messageInfoFor(Class<?> cls) {
        if (!AbstractC5206e0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (I0) AbstractC5206e0.l(cls.asSubclass(AbstractC5206e0.class)).c();
        } catch (Exception e8) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e8);
        }
    }
}
