package N6;

import com.google.protobuf.C5230m0;
import com.google.protobuf.K0;
import com.google.protobuf.M;
import com.google.protobuf.Z0;
import com.google.protobuf.r;
import e3.w;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.J0;
import io.grpc.Z;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    static volatile M f3272a = M.getEmptyRegistry();

    private static final class a implements C5730i0.e {

        /* renamed from: d, reason: collision with root package name */
        private static final ThreadLocal f3273d = new ThreadLocal();

        /* renamed from: a, reason: collision with root package name */
        private final Z0 f3274a;

        /* renamed from: b, reason: collision with root package name */
        private final K0 f3275b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3276c;

        a(K0 k02, int i8) {
            this.f3275b = (K0) w.checkNotNull(k02, "defaultInstance cannot be null");
            this.f3274a = k02.getParserForType();
            this.f3276c = i8;
        }

        private K0 a(r rVar) throws C5230m0 {
            K0 k02 = (K0) this.f3274a.parseFrom(rVar, b.f3272a);
            try {
                rVar.checkLastTagWas(0);
                return k02;
            } catch (C5230m0 e8) {
                e8.setUnfinishedMessage(k02);
                throw e8;
            }
        }

        @Override // io.grpc.C5730i0.e, io.grpc.C5730i0.f
        public Class<K0> getMessageClass() {
            return this.f3275b.getClass();
        }

        @Override // io.grpc.C5730i0.e
        public K0 getMessagePrototype() {
            return this.f3275b;
        }

        @Override // io.grpc.C5730i0.e, io.grpc.C5730i0.f, io.grpc.C5730i0.c
        public K0 parse(InputStream inputStream) throws IOException {
            r rVarNewInstance;
            byte[] bArr;
            if ((inputStream instanceof N6.a) && ((N6.a) inputStream).b() == this.f3274a) {
                try {
                    return ((N6.a) inputStream).a();
                } catch (IllegalStateException unused) {
                }
            }
            try {
                if (inputStream instanceof Z) {
                    int iAvailable = inputStream.available();
                    if (iAvailable <= 0 || iAvailable > 4194304) {
                        if (iAvailable == 0) {
                            return this.f3275b;
                        }
                        rVarNewInstance = null;
                    } else {
                        ThreadLocal threadLocal = f3273d;
                        Reference reference = (Reference) threadLocal.get();
                        if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                            bArr = new byte[iAvailable];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i8 = iAvailable;
                        while (i8 > 0) {
                            int i9 = inputStream.read(bArr, iAvailable - i8, i8);
                            if (i9 == -1) {
                                break;
                            }
                            i8 -= i9;
                        }
                        if (i8 != 0) {
                            throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i8));
                        }
                        rVarNewInstance = r.newInstance(bArr, 0, iAvailable);
                    }
                } else {
                    rVarNewInstance = null;
                }
                if (rVarNewInstance == null) {
                    rVarNewInstance = r.newInstance(inputStream);
                }
                rVarNewInstance.setSizeLimit(Integer.MAX_VALUE);
                int i10 = this.f3276c;
                if (i10 >= 0) {
                    rVarNewInstance.setRecursionLimit(i10);
                }
                try {
                    return a(rVarNewInstance);
                } catch (C5230m0 e8) {
                    throw J0.INTERNAL.withDescription("Invalid protobuf byte sequence").withCause(e8).asRuntimeException();
                }
            } catch (IOException e9) {
                throw new RuntimeException(e9);
            }
        }

        @Override // io.grpc.C5730i0.e, io.grpc.C5730i0.f, io.grpc.C5730i0.c
        public InputStream stream(K0 k02) {
            return new N6.a(k02, this.f3274a);
        }
    }

    /* renamed from: N6.b$b, reason: collision with other inner class name */
    private static final class C0055b implements C5728h0.f {

        /* renamed from: a, reason: collision with root package name */
        private final K0 f3277a;

        C0055b(K0 k02) {
            this.f3277a = k02;
        }

        @Override // io.grpc.C5728h0.f
        public K0 parseBytes(byte[] bArr) {
            try {
                return (K0) this.f3277a.getParserForType().parseFrom(bArr, b.f3272a);
            } catch (C5230m0 e8) {
                throw new IllegalArgumentException(e8);
            }
        }

        @Override // io.grpc.C5728h0.f
        public byte[] toBytes(K0 k02) {
            return k02.toByteArray();
        }
    }

    static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        w.checkNotNull(inputStream, "inputStream cannot be null!");
        w.checkNotNull(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j8 = 0;
        while (true) {
            int i8 = inputStream.read(bArr);
            if (i8 == -1) {
                return j8;
            }
            outputStream.write(bArr, 0, i8);
            j8 += i8;
        }
    }

    public static <T extends K0> C5730i0.c marshaller(T t8) {
        return new a(t8, -1);
    }

    public static <T extends K0> C5730i0.c marshallerWithRecursionLimit(T t8, int i8) {
        return new a(t8, i8);
    }

    public static <T extends K0> C5728h0.f metadataMarshaller(T t8) {
        return new C0055b(t8);
    }

    public static void setExtensionRegistry(M m8) {
        f3272a = (M) w.checkNotNull(m8, "newRegistry");
    }
}
