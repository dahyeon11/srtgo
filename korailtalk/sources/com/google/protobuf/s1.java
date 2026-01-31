package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class s1 implements I0 {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC5198b1 f26722a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26723b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f26724c;

    /* renamed from: d, reason: collision with root package name */
    private final S[] f26725d;

    /* renamed from: e, reason: collision with root package name */
    private final K0 f26726e;

    s1(EnumC5198b1 enumC5198b1, boolean z8, int[] iArr, S[] sArr, Object obj) {
        this.f26722a = enumC5198b1;
        this.f26723b = z8;
        this.f26724c = iArr;
        this.f26725d = sArr;
        this.f26726e = (K0) AbstractC5227l0.b(obj, "defaultInstance");
    }

    public static a newBuilder() {
        return new a();
    }

    public int[] getCheckInitialized() {
        return this.f26724c;
    }

    @Override // com.google.protobuf.I0
    public K0 getDefaultInstance() {
        return this.f26726e;
    }

    public S[] getFields() {
        return this.f26725d;
    }

    @Override // com.google.protobuf.I0
    public EnumC5198b1 getSyntax() {
        return this.f26722a;
    }

    @Override // com.google.protobuf.I0
    public boolean isMessageSetWireFormat() {
        return this.f26723b;
    }

    public static a newBuilder(int i8) {
        return new a(i8);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f26727a;

        /* renamed from: b, reason: collision with root package name */
        private EnumC5198b1 f26728b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f26729c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f26730d;

        /* renamed from: e, reason: collision with root package name */
        private int[] f26731e;

        /* renamed from: f, reason: collision with root package name */
        private Object f26732f;

        public a() {
            this.f26731e = null;
            this.f26727a = new ArrayList();
        }

        public s1 build() {
            if (this.f26729c) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.f26728b == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.f26729c = true;
            Collections.sort(this.f26727a);
            return new s1(this.f26728b, this.f26730d, this.f26731e, (S[]) this.f26727a.toArray(new S[0]), this.f26732f);
        }

        public void withCheckInitialized(int[] iArr) {
            this.f26731e = iArr;
        }

        public void withDefaultInstance(Object obj) {
            this.f26732f = obj;
        }

        public void withField(S s8) {
            if (this.f26729c) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.f26727a.add(s8);
        }

        public void withMessageSetWireFormat(boolean z8) {
            this.f26730d = z8;
        }

        public void withSyntax(EnumC5198b1 enumC5198b1) {
            this.f26728b = (EnumC5198b1) AbstractC5227l0.b(enumC5198b1, "syntax");
        }

        public a(int i8) {
            this.f26731e = null;
            this.f26727a = new ArrayList(i8);
        }
    }
}
