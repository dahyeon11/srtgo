package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5196b;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.AbstractC5227l0;
import com.google.protobuf.C5240p1;
import com.google.protobuf.C5253v0;
import com.google.protobuf.C5269x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class N1 extends AbstractC5209f0 implements O1 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;

    /* renamed from: d, reason: collision with root package name */
    private static final N1 f26222d = new N1();

    /* renamed from: e, reason: collision with root package name */
    private static final Z0 f26223e = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f26224a;

    /* renamed from: b, reason: collision with root package name */
    private Object f26225b;

    /* renamed from: c, reason: collision with root package name */
    private byte f26226c;

    class a extends AbstractC5199c {
        a() {
        }

        @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
        public N1 parsePartialFrom(r rVar, M m8) throws C5230m0 {
            c cVarNewBuilder = N1.newBuilder();
            try {
                cVarNewBuilder.mergeFrom(rVar, m8);
                return cVarNewBuilder.buildPartial();
            } catch (E1 e8) {
                throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(cVarNewBuilder.buildPartial());
            } catch (C5230m0 e9) {
                throw e9.setUnfinishedMessage(cVarNewBuilder.buildPartial());
            } catch (IOException e10) {
                throw new C5230m0(e10).setUnfinishedMessage(cVarNewBuilder.buildPartial());
            }
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26227a;

        static {
            int[] iArr = new int[d.values().length];
            f26227a = iArr;
            try {
                iArr[d.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26227a[d.NUMBER_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26227a[d.STRING_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26227a[d.BOOL_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26227a[d.STRUCT_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26227a[d.LIST_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26227a[d.KIND_NOT_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class c extends AbstractC5209f0.b implements O1 {

        /* renamed from: a, reason: collision with root package name */
        private int f26228a;

        /* renamed from: b, reason: collision with root package name */
        private Object f26229b;

        /* renamed from: c, reason: collision with root package name */
        private int f26230c;

        /* renamed from: d, reason: collision with root package name */
        private C5228l1 f26231d;

        /* renamed from: e, reason: collision with root package name */
        private C5228l1 f26232e;

        /* synthetic */ c(AbstractC5209f0.c cVar, a aVar) {
            this(cVar);
        }

        private void e(N1 n12) {
        }

        private void f(N1 n12) {
            C5228l1 c5228l1;
            C5228l1 c5228l12;
            n12.f26224a = this.f26228a;
            n12.f26225b = this.f26229b;
            if (this.f26228a == 5 && (c5228l12 = this.f26231d) != null) {
                n12.f26225b = c5228l12.build();
            }
            if (this.f26228a != 6 || (c5228l1 = this.f26232e) == null) {
                return;
            }
            n12.f26225b = c5228l1.build();
        }

        private C5228l1 g() {
            if (this.f26232e == null) {
                if (this.f26228a != 6) {
                    this.f26229b = C5253v0.getDefaultInstance();
                }
                this.f26232e = new C5228l1((C5253v0) this.f26229b, getParentForChildren(), isClean());
                this.f26229b = null;
            }
            this.f26228a = 6;
            onChanged();
            return this.f26232e;
        }

        public static final C5269x.b getDescriptor() {
            return AbstractC5245r1.f26708e;
        }

        private C5228l1 h() {
            if (this.f26231d == null) {
                if (this.f26228a != 5) {
                    this.f26229b = C5240p1.getDefaultInstance();
                }
                this.f26231d = new C5228l1((C5240p1) this.f26229b, getParentForChildren(), isClean());
                this.f26229b = null;
            }
            this.f26228a = 5;
            onChanged();
            return this.f26231d;
        }

        public c clearBoolValue() {
            if (this.f26228a == 4) {
                this.f26228a = 0;
                this.f26229b = null;
                onChanged();
            }
            return this;
        }

        public c clearKind() {
            this.f26228a = 0;
            this.f26229b = null;
            onChanged();
            return this;
        }

        public c clearListValue() {
            C5228l1 c5228l1 = this.f26232e;
            if (c5228l1 != null) {
                if (this.f26228a == 6) {
                    this.f26228a = 0;
                    this.f26229b = null;
                }
                c5228l1.clear();
            } else if (this.f26228a == 6) {
                this.f26228a = 0;
                this.f26229b = null;
                onChanged();
            }
            return this;
        }

        public c clearNullValue() {
            if (this.f26228a == 1) {
                this.f26228a = 0;
                this.f26229b = null;
                onChanged();
            }
            return this;
        }

        public c clearNumberValue() {
            if (this.f26228a == 2) {
                this.f26228a = 0;
                this.f26229b = null;
                onChanged();
            }
            return this;
        }

        public c clearStringValue() {
            if (this.f26228a == 3) {
                this.f26228a = 0;
                this.f26229b = null;
                onChanged();
            }
            return this;
        }

        public c clearStructValue() {
            C5228l1 c5228l1 = this.f26231d;
            if (c5228l1 != null) {
                if (this.f26228a == 5) {
                    this.f26228a = 0;
                    this.f26229b = null;
                }
                c5228l1.clear();
            } else if (this.f26228a == 5) {
                this.f26228a = 0;
                this.f26229b = null;
                onChanged();
            }
            return this;
        }

        @Override // com.google.protobuf.O1
        public boolean getBoolValue() {
            if (this.f26228a == 4) {
                return ((Boolean) this.f26229b).booleanValue();
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return AbstractC5245r1.f26708e;
        }

        @Override // com.google.protobuf.O1
        public d getKindCase() {
            return d.forNumber(this.f26228a);
        }

        @Override // com.google.protobuf.O1
        public C5253v0 getListValue() {
            C5228l1 c5228l1 = this.f26232e;
            return c5228l1 == null ? this.f26228a == 6 ? (C5253v0) this.f26229b : C5253v0.getDefaultInstance() : this.f26228a == 6 ? (C5253v0) c5228l1.getMessage() : C5253v0.getDefaultInstance();
        }

        public C5253v0.b getListValueBuilder() {
            return (C5253v0.b) g().getBuilder();
        }

        @Override // com.google.protobuf.O1
        public InterfaceC5268w0 getListValueOrBuilder() {
            C5228l1 c5228l1;
            int i8 = this.f26228a;
            return (i8 != 6 || (c5228l1 = this.f26232e) == null) ? i8 == 6 ? (C5253v0) this.f26229b : C5253v0.getDefaultInstance() : (InterfaceC5268w0) c5228l1.getMessageOrBuilder();
        }

        @Override // com.google.protobuf.O1
        public X0 getNullValue() {
            if (this.f26228a != 1) {
                return X0.NULL_VALUE;
            }
            X0 x0ForNumber = X0.forNumber(((Integer) this.f26229b).intValue());
            return x0ForNumber == null ? X0.UNRECOGNIZED : x0ForNumber;
        }

        @Override // com.google.protobuf.O1
        public int getNullValueValue() {
            if (this.f26228a == 1) {
                return ((Integer) this.f26229b).intValue();
            }
            return 0;
        }

        @Override // com.google.protobuf.O1
        public double getNumberValue() {
            if (this.f26228a == 2) {
                return ((Double) this.f26229b).doubleValue();
            }
            return 0.0d;
        }

        @Override // com.google.protobuf.O1
        public String getStringValue() {
            String str = this.f26228a == 3 ? this.f26229b : "";
            if (str instanceof String) {
                return (String) str;
            }
            String stringUtf8 = ((AbstractC5235o) str).toStringUtf8();
            if (this.f26228a == 3) {
                this.f26229b = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.O1
        public AbstractC5235o getStringValueBytes() {
            String str = this.f26228a == 3 ? this.f26229b : "";
            if (!(str instanceof String)) {
                return (AbstractC5235o) str;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) str);
            if (this.f26228a == 3) {
                this.f26229b = abstractC5235oCopyFromUtf8;
            }
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.O1
        public C5240p1 getStructValue() {
            C5228l1 c5228l1 = this.f26231d;
            return c5228l1 == null ? this.f26228a == 5 ? (C5240p1) this.f26229b : C5240p1.getDefaultInstance() : this.f26228a == 5 ? (C5240p1) c5228l1.getMessage() : C5240p1.getDefaultInstance();
        }

        public C5240p1.b getStructValueBuilder() {
            return (C5240p1.b) h().getBuilder();
        }

        @Override // com.google.protobuf.O1
        public InterfaceC5243q1 getStructValueOrBuilder() {
            C5228l1 c5228l1;
            int i8 = this.f26228a;
            return (i8 != 5 || (c5228l1 = this.f26231d) == null) ? i8 == 5 ? (C5240p1) this.f26229b : C5240p1.getDefaultInstance() : (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
        }

        @Override // com.google.protobuf.O1
        public boolean hasBoolValue() {
            return this.f26228a == 4;
        }

        @Override // com.google.protobuf.O1
        public boolean hasListValue() {
            return this.f26228a == 6;
        }

        @Override // com.google.protobuf.O1
        public boolean hasNullValue() {
            return this.f26228a == 1;
        }

        @Override // com.google.protobuf.O1
        public boolean hasNumberValue() {
            return this.f26228a == 2;
        }

        @Override // com.google.protobuf.O1
        public boolean hasStringValue() {
            return this.f26228a == 3;
        }

        @Override // com.google.protobuf.O1
        public boolean hasStructValue() {
            return this.f26228a == 5;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return AbstractC5245r1.f26709f.ensureFieldAccessorsInitialized(N1.class, c.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            return true;
        }

        public c mergeListValue(C5253v0 c5253v0) {
            C5228l1 c5228l1 = this.f26232e;
            if (c5228l1 == null) {
                if (this.f26228a != 6 || this.f26229b == C5253v0.getDefaultInstance()) {
                    this.f26229b = c5253v0;
                } else {
                    this.f26229b = C5253v0.newBuilder((C5253v0) this.f26229b).mergeFrom(c5253v0).buildPartial();
                }
                onChanged();
            } else if (this.f26228a == 6) {
                c5228l1.mergeFrom(c5253v0);
            } else {
                c5228l1.setMessage(c5253v0);
            }
            this.f26228a = 6;
            return this;
        }

        public c mergeStructValue(C5240p1 c5240p1) {
            C5228l1 c5228l1 = this.f26231d;
            if (c5228l1 == null) {
                if (this.f26228a != 5 || this.f26229b == C5240p1.getDefaultInstance()) {
                    this.f26229b = c5240p1;
                } else {
                    this.f26229b = C5240p1.newBuilder((C5240p1) this.f26229b).mergeFrom(c5240p1).buildPartial();
                }
                onChanged();
            } else if (this.f26228a == 5) {
                c5228l1.mergeFrom(c5240p1);
            } else {
                c5228l1.setMessage(c5240p1);
            }
            this.f26228a = 5;
            return this;
        }

        public c setBoolValue(boolean z8) {
            this.f26228a = 4;
            this.f26229b = Boolean.valueOf(z8);
            onChanged();
            return this;
        }

        public c setListValue(C5253v0 c5253v0) {
            C5228l1 c5228l1 = this.f26232e;
            if (c5228l1 == null) {
                c5253v0.getClass();
                this.f26229b = c5253v0;
                onChanged();
            } else {
                c5228l1.setMessage(c5253v0);
            }
            this.f26228a = 6;
            return this;
        }

        public c setNullValue(X0 x02) {
            x02.getClass();
            this.f26228a = 1;
            this.f26229b = Integer.valueOf(x02.getNumber());
            onChanged();
            return this;
        }

        public c setNullValueValue(int i8) {
            this.f26228a = 1;
            this.f26229b = Integer.valueOf(i8);
            onChanged();
            return this;
        }

        public c setNumberValue(double d9) {
            this.f26228a = 2;
            this.f26229b = Double.valueOf(d9);
            onChanged();
            return this;
        }

        public c setStringValue(String str) {
            str.getClass();
            this.f26228a = 3;
            this.f26229b = str;
            onChanged();
            return this;
        }

        public c setStringValueBytes(AbstractC5235o abstractC5235o) {
            abstractC5235o.getClass();
            AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
            this.f26228a = 3;
            this.f26229b = abstractC5235o;
            onChanged();
            return this;
        }

        public c setStructValue(C5240p1 c5240p1) {
            C5228l1 c5228l1 = this.f26231d;
            if (c5228l1 == null) {
                c5240p1.getClass();
                this.f26229b = c5240p1;
                onChanged();
            } else {
                c5228l1.setMessage(c5240p1);
            }
            this.f26228a = 5;
            return this;
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        private c() {
            this.f26228a = 0;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public N1 build() {
            N1 n1BuildPartial = buildPartial();
            if (n1BuildPartial.isInitialized()) {
                return n1BuildPartial;
            }
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) n1BuildPartial);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public N1 buildPartial() {
            N1 n12 = new N1(this, null);
            if (this.f26230c != 0) {
                e(n12);
            }
            f(n12);
            onBuilt();
            return n12;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public N1 getDefaultInstanceForType() {
            return N1.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public final c setUnknownFields(G1 g12) {
            return (c) super.setUnknownFields(g12);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public final c mergeUnknownFields(G1 g12) {
            return (c) super.mergeUnknownFields(g12);
        }

        private c(AbstractC5209f0.c cVar) {
            super(cVar);
            this.f26228a = 0;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public c clear() {
            super.clear();
            this.f26230c = 0;
            C5228l1 c5228l1 = this.f26231d;
            if (c5228l1 != null) {
                c5228l1.clear();
            }
            C5228l1 c5228l12 = this.f26232e;
            if (c5228l12 != null) {
                c5228l12.clear();
            }
            this.f26228a = 0;
            this.f26229b = null;
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public c mergeFrom(H0 h02) {
            if (h02 instanceof N1) {
                return mergeFrom((N1) h02);
            }
            super.mergeFrom(h02);
            return this;
        }

        public c setListValue(C5253v0.b bVar) {
            C5228l1 c5228l1 = this.f26232e;
            if (c5228l1 == null) {
                this.f26229b = bVar.build();
                onChanged();
            } else {
                c5228l1.setMessage(bVar.build());
            }
            this.f26228a = 6;
            return this;
        }

        public c setStructValue(C5240p1.b bVar) {
            C5228l1 c5228l1 = this.f26231d;
            if (c5228l1 == null) {
                this.f26229b = bVar.build();
                onChanged();
            } else {
                c5228l1.setMessage(bVar.build());
            }
            this.f26228a = 5;
            return this;
        }

        public c mergeFrom(N1 n12) {
            if (n12 == N1.getDefaultInstance()) {
                return this;
            }
            switch (b.f26227a[n12.getKindCase().ordinal()]) {
                case 1:
                    setNullValueValue(n12.getNullValueValue());
                    break;
                case 2:
                    setNumberValue(n12.getNumberValue());
                    break;
                case 3:
                    this.f26228a = 3;
                    this.f26229b = n12.f26225b;
                    onChanged();
                    break;
                case 4:
                    setBoolValue(n12.getBoolValue());
                    break;
                case 5:
                    mergeStructValue(n12.getStructValue());
                    break;
                case 6:
                    mergeListValue(n12.getListValue());
                    break;
            }
            mergeUnknownFields(n12.getUnknownFields());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public c mergeFrom(r rVar, M m8) {
            m8.getClass();
            boolean z8 = false;
            while (!z8) {
                try {
                    try {
                        int tag = rVar.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                int i8 = rVar.readEnum();
                                this.f26228a = 1;
                                this.f26229b = Integer.valueOf(i8);
                            } else if (tag == 17) {
                                this.f26229b = Double.valueOf(rVar.readDouble());
                                this.f26228a = 2;
                            } else if (tag == 26) {
                                String stringRequireUtf8 = rVar.readStringRequireUtf8();
                                this.f26228a = 3;
                                this.f26229b = stringRequireUtf8;
                            } else if (tag == 32) {
                                this.f26229b = Boolean.valueOf(rVar.readBool());
                                this.f26228a = 4;
                            } else if (tag == 42) {
                                rVar.readMessage(h().getBuilder(), m8);
                                this.f26228a = 5;
                            } else if (tag != 50) {
                                if (!super.parseUnknownField(rVar, m8, tag)) {
                                }
                            } else {
                                rVar.readMessage(g().getBuilder(), m8);
                                this.f26228a = 6;
                            }
                        }
                        z8 = true;
                    } catch (C5230m0 e8) {
                        throw e8.unwrapIOException();
                    }
                } catch (Throwable th) {
                    onChanged();
                    throw th;
                }
            }
            onChanged();
            return this;
        }
    }

    public enum d implements AbstractC5227l0.c, AbstractC5196b.InterfaceC0220b {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        private final int f26234a;

        d(int i8) {
            this.f26234a = i8;
        }

        public static d forNumber(int i8) {
            switch (i8) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.AbstractC5227l0.c
        public int getNumber() {
            return this.f26234a;
        }

        @Deprecated
        public static d valueOf(int i8) {
            return forNumber(i8);
        }
    }

    /* synthetic */ N1(AbstractC5209f0.b bVar, a aVar) {
        this(bVar);
    }

    public static N1 getDefaultInstance() {
        return f26222d;
    }

    public static final C5269x.b getDescriptor() {
        return AbstractC5245r1.f26708e;
    }

    public static c newBuilder() {
        return f26222d.toBuilder();
    }

    public static N1 parseDelimitedFrom(InputStream inputStream) {
        return (N1) AbstractC5209f0.parseDelimitedWithIOException(f26223e, inputStream);
    }

    public static N1 parseFrom(ByteBuffer byteBuffer) {
        return (N1) f26223e.parseFrom(byteBuffer);
    }

    public static Z0 parser() {
        return f26223e;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N1)) {
            return super.equals(obj);
        }
        N1 n12 = (N1) obj;
        if (!getKindCase().equals(n12.getKindCase())) {
            return false;
        }
        switch (this.f26224a) {
            case 1:
                if (getNullValueValue() != n12.getNullValueValue()) {
                    return false;
                }
                break;
            case 2:
                if (Double.doubleToLongBits(getNumberValue()) != Double.doubleToLongBits(n12.getNumberValue())) {
                    return false;
                }
                break;
            case 3:
                if (!getStringValue().equals(n12.getStringValue())) {
                    return false;
                }
                break;
            case 4:
                if (getBoolValue() != n12.getBoolValue()) {
                    return false;
                }
                break;
            case 5:
                if (!getStructValue().equals(n12.getStructValue())) {
                    return false;
                }
                break;
            case 6:
                if (!getListValue().equals(n12.getListValue())) {
                    return false;
                }
                break;
        }
        return getUnknownFields().equals(n12.getUnknownFields());
    }

    @Override // com.google.protobuf.O1
    public boolean getBoolValue() {
        if (this.f26224a == 4) {
            return ((Boolean) this.f26225b).booleanValue();
        }
        return false;
    }

    @Override // com.google.protobuf.O1
    public d getKindCase() {
        return d.forNumber(this.f26224a);
    }

    @Override // com.google.protobuf.O1
    public C5253v0 getListValue() {
        return this.f26224a == 6 ? (C5253v0) this.f26225b : C5253v0.getDefaultInstance();
    }

    @Override // com.google.protobuf.O1
    public InterfaceC5268w0 getListValueOrBuilder() {
        return this.f26224a == 6 ? (C5253v0) this.f26225b : C5253v0.getDefaultInstance();
    }

    @Override // com.google.protobuf.O1
    public X0 getNullValue() {
        if (this.f26224a != 1) {
            return X0.NULL_VALUE;
        }
        X0 x0ForNumber = X0.forNumber(((Integer) this.f26225b).intValue());
        return x0ForNumber == null ? X0.UNRECOGNIZED : x0ForNumber;
    }

    @Override // com.google.protobuf.O1
    public int getNullValueValue() {
        if (this.f26224a == 1) {
            return ((Integer) this.f26225b).intValue();
        }
        return 0;
    }

    @Override // com.google.protobuf.O1
    public double getNumberValue() {
        if (this.f26224a == 2) {
            return ((Double) this.f26225b).doubleValue();
        }
        return 0.0d;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        return f26223e;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int i8 = this.memoizedSize;
        if (i8 != -1) {
            return i8;
        }
        int iComputeEnumSize = this.f26224a == 1 ? AbstractC5248t.computeEnumSize(1, ((Integer) this.f26225b).intValue()) : 0;
        if (this.f26224a == 2) {
            iComputeEnumSize += AbstractC5248t.computeDoubleSize(2, ((Double) this.f26225b).doubleValue());
        }
        if (this.f26224a == 3) {
            iComputeEnumSize += AbstractC5209f0.computeStringSize(3, this.f26225b);
        }
        if (this.f26224a == 4) {
            iComputeEnumSize += AbstractC5248t.computeBoolSize(4, ((Boolean) this.f26225b).booleanValue());
        }
        if (this.f26224a == 5) {
            iComputeEnumSize += AbstractC5248t.computeMessageSize(5, (C5240p1) this.f26225b);
        }
        if (this.f26224a == 6) {
            iComputeEnumSize += AbstractC5248t.computeMessageSize(6, (C5253v0) this.f26225b);
        }
        int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.O1
    public String getStringValue() {
        String str = this.f26224a == 3 ? this.f26225b : "";
        if (str instanceof String) {
            return (String) str;
        }
        String stringUtf8 = ((AbstractC5235o) str).toStringUtf8();
        if (this.f26224a == 3) {
            this.f26225b = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.O1
    public AbstractC5235o getStringValueBytes() {
        String str = this.f26224a == 3 ? this.f26225b : "";
        if (!(str instanceof String)) {
            return (AbstractC5235o) str;
        }
        AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) str);
        if (this.f26224a == 3) {
            this.f26225b = abstractC5235oCopyFromUtf8;
        }
        return abstractC5235oCopyFromUtf8;
    }

    @Override // com.google.protobuf.O1
    public C5240p1 getStructValue() {
        return this.f26224a == 5 ? (C5240p1) this.f26225b : C5240p1.getDefaultInstance();
    }

    @Override // com.google.protobuf.O1
    public InterfaceC5243q1 getStructValueOrBuilder() {
        return this.f26224a == 5 ? (C5240p1) this.f26225b : C5240p1.getDefaultInstance();
    }

    @Override // com.google.protobuf.O1
    public boolean hasBoolValue() {
        return this.f26224a == 4;
    }

    @Override // com.google.protobuf.O1
    public boolean hasListValue() {
        return this.f26224a == 6;
    }

    @Override // com.google.protobuf.O1
    public boolean hasNullValue() {
        return this.f26224a == 1;
    }

    @Override // com.google.protobuf.O1
    public boolean hasNumberValue() {
        return this.f26224a == 2;
    }

    @Override // com.google.protobuf.O1
    public boolean hasStringValue() {
        return this.f26224a == 3;
    }

    @Override // com.google.protobuf.O1
    public boolean hasStructValue() {
        return this.f26224a == 5;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public int hashCode() {
        int i8;
        int nullValueValue;
        int i9 = this.memoizedHashCode;
        if (i9 != 0) {
            return i9;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        switch (this.f26224a) {
            case 1:
                i8 = ((iHashCode * 37) + 1) * 53;
                nullValueValue = getNullValueValue();
                break;
            case 2:
                i8 = ((iHashCode * 37) + 2) * 53;
                nullValueValue = AbstractC5227l0.hashLong(Double.doubleToLongBits(getNumberValue()));
                break;
            case 3:
                i8 = ((iHashCode * 37) + 3) * 53;
                nullValueValue = getStringValue().hashCode();
                break;
            case 4:
                i8 = ((iHashCode * 37) + 4) * 53;
                nullValueValue = AbstractC5227l0.hashBoolean(getBoolValue());
                break;
            case 5:
                i8 = ((iHashCode * 37) + 5) * 53;
                nullValueValue = getStructValue().hashCode();
                break;
            case 6:
                i8 = ((iHashCode * 37) + 6) * 53;
                nullValueValue = getListValue().hashCode();
                break;
            default:
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
        }
        iHashCode = i8 + nullValueValue;
        int iHashCode22 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode22;
        return iHashCode22;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected AbstractC5209f0.g internalGetFieldAccessorTable() {
        return AbstractC5245r1.f26709f.ensureFieldAccessorsInitialized(N1.class, c.class);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public final boolean isInitialized() {
        byte b9 = this.f26226c;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        this.f26226c = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected Object newInstance(AbstractC5209f0.h hVar) {
        return new N1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.AbstractC5209f0
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public c newBuilderForType(AbstractC5209f0.c cVar) {
        return new c(cVar, null);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        if (this.f26224a == 1) {
            abstractC5248t.writeEnum(1, ((Integer) this.f26225b).intValue());
        }
        if (this.f26224a == 2) {
            abstractC5248t.writeDouble(2, ((Double) this.f26225b).doubleValue());
        }
        if (this.f26224a == 3) {
            AbstractC5209f0.writeString(abstractC5248t, 3, this.f26225b);
        }
        if (this.f26224a == 4) {
            abstractC5248t.writeBool(4, ((Boolean) this.f26225b).booleanValue());
        }
        if (this.f26224a == 5) {
            abstractC5248t.writeMessage(5, (C5240p1) this.f26225b);
        }
        if (this.f26224a == 6) {
            abstractC5248t.writeMessage(6, (C5253v0) this.f26225b);
        }
        getUnknownFields().writeTo(abstractC5248t);
    }

    private N1(AbstractC5209f0.b bVar) {
        super(bVar);
        this.f26224a = 0;
        this.f26226c = (byte) -1;
    }

    public static c newBuilder(N1 n12) {
        return f26222d.toBuilder().mergeFrom(n12);
    }

    public static N1 parseFrom(ByteBuffer byteBuffer, M m8) {
        return (N1) f26223e.parseFrom(byteBuffer, m8);
    }

    public static N1 parseDelimitedFrom(InputStream inputStream, M m8) {
        return (N1) AbstractC5209f0.parseDelimitedWithIOException(f26223e, inputStream, m8);
    }

    public static N1 parseFrom(AbstractC5235o abstractC5235o) {
        return (N1) f26223e.parseFrom(abstractC5235o);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public N1 getDefaultInstanceForType() {
        return f26222d;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public c toBuilder() {
        a aVar = null;
        return this == f26222d ? new c(aVar) : new c(aVar).mergeFrom(this);
    }

    public static N1 parseFrom(AbstractC5235o abstractC5235o, M m8) {
        return (N1) f26223e.parseFrom(abstractC5235o, m8);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public c newBuilderForType() {
        return newBuilder();
    }

    private N1() {
        this.f26224a = 0;
        this.f26226c = (byte) -1;
    }

    public static N1 parseFrom(byte[] bArr) {
        return (N1) f26223e.parseFrom(bArr);
    }

    public static N1 parseFrom(byte[] bArr, M m8) {
        return (N1) f26223e.parseFrom(bArr, m8);
    }

    public static N1 parseFrom(InputStream inputStream) {
        return (N1) AbstractC5209f0.parseWithIOException(f26223e, inputStream);
    }

    public static N1 parseFrom(InputStream inputStream, M m8) {
        return (N1) AbstractC5209f0.parseWithIOException(f26223e, inputStream, m8);
    }

    public static N1 parseFrom(r rVar) {
        return (N1) AbstractC5209f0.parseWithIOException(f26223e, rVar);
    }

    public static N1 parseFrom(r rVar, M m8) {
        return (N1) AbstractC5209f0.parseWithIOException(f26223e, rVar, m8);
    }
}
