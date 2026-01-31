package com.google.protobuf;

/* loaded from: classes2.dex */
interface R0 {
    public static final R0 IMMUTABLE = new a();

    class a implements R0 {
        a() {
        }

        @Override // com.google.protobuf.R0
        public void ensureMutable() {
            throw new UnsupportedOperationException();
        }
    }

    void ensureMutable();
}
