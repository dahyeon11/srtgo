package com.google.protobuf;

import com.google.protobuf.AbstractC5235o;
import com.google.protobuf.K0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.b */
/* loaded from: classes2.dex */
public abstract class AbstractC5196b implements K0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.b$a */
    public static abstract class a implements K0.a {
        private static void a(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        @Deprecated
        protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }

        private String b(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        protected static E1 newUninitializedMessageException(K0 k02) {
            return new E1(k02);
        }

        @Override // com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public abstract /* synthetic */ K0 build();

        @Override // com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public abstract /* synthetic */ K0 buildPartial();

        @Override // com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public abstract /* synthetic */ K0.a clear();

        @Override // 
        /* renamed from: clone */
        public abstract a mo3clone();

        @Override // com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public abstract /* synthetic */ K0 getDefaultInstanceForType();

        protected abstract a internalMergeFrom(AbstractC5196b abstractC5196b);

        @Override // com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public abstract /* synthetic */ boolean isInitialized();

        @Override // com.google.protobuf.K0.a
        public boolean mergeDelimitedFrom(InputStream inputStream, M m8) throws IOException {
            int i8 = inputStream.read();
            if (i8 == -1) {
                return false;
            }
            mergeFrom((InputStream) new C0219a(inputStream, r.readRawVarint32(i8, inputStream)), m8);
            return true;
        }

        @Override // com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public abstract a mergeFrom(r rVar, M m8);

        protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            AbstractC5227l0.a(iterable);
            if (!(iterable instanceof InterfaceC5249t0)) {
                if (iterable instanceof InterfaceC5195a1) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    a(iterable, list);
                    return;
                }
            }
            List<?> underlyingElements = ((InterfaceC5249t0) iterable).getUnderlyingElements();
            InterfaceC5249t0 interfaceC5249t0 = (InterfaceC5249t0) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC5249t0.size() - size) + " is null.";
                    for (int size2 = interfaceC5249t0.size() - 1; size2 >= size; size2--) {
                        interfaceC5249t0.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC5235o) {
                    interfaceC5249t0.add((AbstractC5235o) obj);
                } else {
                    interfaceC5249t0.add((InterfaceC5249t0) obj);
                }
            }
        }

        /* renamed from: com.google.protobuf.b$a$a */
        static final class C0219a extends FilterInputStream {

            /* renamed from: a */
            private int f26379a;

            C0219a(InputStream inputStream, int i8) {
                super(inputStream);
                this.f26379a = i8;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f26379a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f26379a <= 0) {
                    return -1;
                }
                int i8 = super.read();
                if (i8 >= 0) {
                    this.f26379a--;
                }
                return i8;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j8) {
                int iSkip = (int) super.skip(Math.min(j8, this.f26379a));
                if (iSkip >= 0) {
                    this.f26379a -= iSkip;
                }
                return iSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i8, int i9) throws IOException {
                int i10 = this.f26379a;
                if (i10 <= 0) {
                    return -1;
                }
                int i11 = super.read(bArr, i8, Math.min(i9, i10));
                if (i11 >= 0) {
                    this.f26379a -= i11;
                }
                return i11;
            }
        }

        @Override // com.google.protobuf.K0.a
        public boolean mergeDelimitedFrom(InputStream inputStream) {
            return mergeDelimitedFrom(inputStream, M.getEmptyRegistry());
        }

        @Override // com.google.protobuf.K0.a
        public a mergeFrom(r rVar) {
            return mergeFrom(rVar, M.getEmptyRegistry());
        }

        @Override // com.google.protobuf.K0.a
        public a mergeFrom(AbstractC5235o abstractC5235o) throws C5230m0 {
            try {
                r rVarNewCodedInput = abstractC5235o.newCodedInput();
                mergeFrom(rVarNewCodedInput);
                rVarNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (C5230m0 e8) {
                throw e8;
            } catch (IOException e9) {
                throw new RuntimeException(b("ByteString"), e9);
            }
        }

        @Override // com.google.protobuf.K0.a
        public a mergeFrom(AbstractC5235o abstractC5235o, M m8) throws C5230m0 {
            try {
                r rVarNewCodedInput = abstractC5235o.newCodedInput();
                mergeFrom(rVarNewCodedInput, m8);
                rVarNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (C5230m0 e8) {
                throw e8;
            } catch (IOException e9) {
                throw new RuntimeException(b("ByteString"), e9);
            }
        }

        @Override // com.google.protobuf.K0.a
        public a mergeFrom(byte[] bArr) {
            return mergeFrom(bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.K0.a
        public a mergeFrom(byte[] bArr, int i8, int i9) throws C5230m0 {
            try {
                r rVarNewInstance = r.newInstance(bArr, i8, i9);
                mergeFrom(rVarNewInstance);
                rVarNewInstance.checkLastTagWas(0);
                return this;
            } catch (C5230m0 e8) {
                throw e8;
            } catch (IOException e9) {
                throw new RuntimeException(b("byte array"), e9);
            }
        }

        @Override // com.google.protobuf.K0.a
        public a mergeFrom(byte[] bArr, M m8) {
            return mergeFrom(bArr, 0, bArr.length, m8);
        }

        @Override // com.google.protobuf.K0.a
        public a mergeFrom(byte[] bArr, int i8, int i9, M m8) throws C5230m0 {
            try {
                r rVarNewInstance = r.newInstance(bArr, i8, i9);
                mergeFrom(rVarNewInstance, m8);
                rVarNewInstance.checkLastTagWas(0);
                return this;
            } catch (C5230m0 e8) {
                throw e8;
            } catch (IOException e9) {
                throw new RuntimeException(b("byte array"), e9);
            }
        }

        @Override // com.google.protobuf.K0.a
        public a mergeFrom(InputStream inputStream) {
            r rVarNewInstance = r.newInstance(inputStream);
            mergeFrom(rVarNewInstance);
            rVarNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // com.google.protobuf.K0.a
        public a mergeFrom(InputStream inputStream, M m8) {
            r rVarNewInstance = r.newInstance(inputStream);
            mergeFrom(rVarNewInstance, m8);
            rVarNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // com.google.protobuf.K0.a
        public a mergeFrom(K0 k02) {
            if (getDefaultInstanceForType().getClass().isInstance(k02)) {
                return internalMergeFrom((AbstractC5196b) k02);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* renamed from: com.google.protobuf.b$b */
    public interface InterfaceC0220b {
        int getNumber();
    }

    private String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Deprecated
    protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        a.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(AbstractC5235o abstractC5235o) {
        if (!abstractC5235o.isValidUtf8()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    @Override // com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public abstract /* synthetic */ K0 getDefaultInstanceForType();

    int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.K0, com.google.protobuf.H0
    public abstract /* synthetic */ Z0 getParserForType();

    @Override // com.google.protobuf.K0, com.google.protobuf.H0
    public abstract /* synthetic */ int getSerializedSize();

    int getSerializedSize(InterfaceC5219i1 interfaceC5219i1) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int serializedSize = interfaceC5219i1.getSerializedSize(this);
        setMemoizedSerializedSize(serializedSize);
        return serializedSize;
    }

    @Override // com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public abstract /* synthetic */ boolean isInitialized();

    @Override // com.google.protobuf.K0, com.google.protobuf.H0
    public abstract /* synthetic */ K0.a newBuilderForType();

    E1 newUninitializedMessageException() {
        return new E1(this);
    }

    void setMemoizedSerializedSize(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.K0, com.google.protobuf.H0
    public abstract /* synthetic */ K0.a toBuilder();

    @Override // com.google.protobuf.K0
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            AbstractC5248t abstractC5248tNewInstance = AbstractC5248t.newInstance(bArr);
            writeTo(abstractC5248tNewInstance);
            abstractC5248tNewInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException(a("byte array"), e8);
        }
    }

    @Override // com.google.protobuf.K0
    public AbstractC5235o toByteString() {
        try {
            AbstractC5235o.h hVarJ = AbstractC5235o.j(getSerializedSize());
            writeTo(hVarJ.getCodedOutput());
            return hVarJ.build();
        } catch (IOException e8) {
            throw new RuntimeException(a("ByteString"), e8);
        }
    }

    @Override // com.google.protobuf.K0
    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        AbstractC5248t abstractC5248tNewInstance = AbstractC5248t.newInstance(outputStream, AbstractC5248t.g(AbstractC5248t.computeUInt32SizeNoTag(serializedSize) + serializedSize));
        abstractC5248tNewInstance.writeUInt32NoTag(serializedSize);
        writeTo(abstractC5248tNewInstance);
        abstractC5248tNewInstance.flush();
    }

    @Override // com.google.protobuf.K0, com.google.protobuf.H0
    public abstract /* synthetic */ void writeTo(AbstractC5248t abstractC5248t);

    @Override // com.google.protobuf.K0
    public void writeTo(OutputStream outputStream) {
        AbstractC5248t abstractC5248tNewInstance = AbstractC5248t.newInstance(outputStream, AbstractC5248t.g(getSerializedSize()));
        writeTo(abstractC5248tNewInstance);
        abstractC5248tNewInstance.flush();
    }

    protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        a.addAll((Iterable) iterable, (List) list);
    }
}
