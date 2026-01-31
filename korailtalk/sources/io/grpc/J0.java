package io.grpc;

import Q7.C0709m;
import com.kakao.sdk.auth.Constants;
import e3.AbstractC5358c;
import e3.AbstractC5364f;
import e3.p;
import io.grpc.C5728h0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: f, reason: collision with root package name */
    static final C5728h0.i f31976f;

    /* renamed from: g, reason: collision with root package name */
    private static final C5728h0.m f31977g;

    /* renamed from: h, reason: collision with root package name */
    static final C5728h0.i f31978h;

    /* renamed from: a, reason: collision with root package name */
    private final b f31979a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31980b;

    /* renamed from: c, reason: collision with root package name */
    private final Throwable f31981c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f31974d = Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", C0709m.FALSE));

    /* renamed from: e, reason: collision with root package name */
    private static final List f31975e = c();
    public static final J0 OK = b.OK.toStatus();
    public static final J0 CANCELLED = b.CANCELLED.toStatus();
    public static final J0 UNKNOWN = b.UNKNOWN.toStatus();
    public static final J0 INVALID_ARGUMENT = b.INVALID_ARGUMENT.toStatus();
    public static final J0 DEADLINE_EXCEEDED = b.DEADLINE_EXCEEDED.toStatus();
    public static final J0 NOT_FOUND = b.NOT_FOUND.toStatus();
    public static final J0 ALREADY_EXISTS = b.ALREADY_EXISTS.toStatus();
    public static final J0 PERMISSION_DENIED = b.PERMISSION_DENIED.toStatus();
    public static final J0 UNAUTHENTICATED = b.UNAUTHENTICATED.toStatus();
    public static final J0 RESOURCE_EXHAUSTED = b.RESOURCE_EXHAUSTED.toStatus();
    public static final J0 FAILED_PRECONDITION = b.FAILED_PRECONDITION.toStatus();
    public static final J0 ABORTED = b.ABORTED.toStatus();
    public static final J0 OUT_OF_RANGE = b.OUT_OF_RANGE.toStatus();
    public static final J0 UNIMPLEMENTED = b.UNIMPLEMENTED.toStatus();
    public static final J0 INTERNAL = b.INTERNAL.toStatus();
    public static final J0 UNAVAILABLE = b.UNAVAILABLE.toStatus();
    public static final J0 DATA_LOSS = b.DATA_LOSS.toStatus();

    public enum b {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* renamed from: a, reason: collision with root package name */
        private final int f31983a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f31984b;

        b(int i8) {
            this.f31983a = i8;
            this.f31984b = Integer.toString(i8).getBytes(AbstractC5364f.US_ASCII);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] b() {
            return this.f31984b;
        }

        public J0 toStatus() {
            return (J0) J0.f31975e.get(this.f31983a);
        }

        public int value() {
            return this.f31983a;
        }
    }

    private static final class c implements C5728h0.m {
        private c() {
        }

        @Override // io.grpc.C5728h0.m
        public J0 parseAsciiString(byte[] bArr) {
            return J0.e(bArr);
        }

        @Override // io.grpc.C5728h0.m
        public byte[] toAsciiString(J0 j02) {
            return j02.getCode().b();
        }
    }

    private static final class d implements C5728h0.m {

        /* renamed from: a, reason: collision with root package name */
        private static final byte[] f31985a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        private d() {
        }

        private static boolean a(byte b9) {
            return b9 < 32 || b9 >= 126 || b9 == 37;
        }

        private static String b(byte[] bArr) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
            int i8 = 0;
            while (i8 < bArr.length) {
                if (bArr[i8] == 37 && i8 + 2 < bArr.length) {
                    try {
                        byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i8 + 1, 2, AbstractC5364f.US_ASCII), 16));
                        i8 += 3;
                    } catch (NumberFormatException unused) {
                    }
                }
                byteBufferAllocate.put(bArr[i8]);
                i8++;
            }
            return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), AbstractC5364f.UTF_8);
        }

        private static byte[] c(byte[] bArr, int i8) {
            byte[] bArr2 = new byte[((bArr.length - i8) * 3) + i8];
            if (i8 != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i8);
            }
            int i9 = i8;
            while (i8 < bArr.length) {
                byte b9 = bArr[i8];
                if (a(b9)) {
                    bArr2[i9] = 37;
                    byte[] bArr3 = f31985a;
                    bArr2[i9 + 1] = bArr3[(b9 >> 4) & 15];
                    bArr2[i9 + 2] = bArr3[b9 & AbstractC5358c.SI];
                    i9 += 3;
                } else {
                    bArr2[i9] = b9;
                    i9++;
                }
                i8++;
            }
            return Arrays.copyOf(bArr2, i9);
        }

        @Override // io.grpc.C5728h0.m
        public String parseAsciiString(byte[] bArr) {
            for (int i8 = 0; i8 < bArr.length; i8++) {
                byte b9 = bArr[i8];
                if (b9 < 32 || b9 >= 126 || (b9 == 37 && i8 + 2 < bArr.length)) {
                    return b(bArr);
                }
            }
            return new String(bArr, 0);
        }

        @Override // io.grpc.C5728h0.m
        public byte[] toAsciiString(String str) {
            byte[] bytes = str.getBytes(AbstractC5364f.UTF_8);
            for (int i8 = 0; i8 < bytes.length; i8++) {
                if (a(bytes[i8])) {
                    return c(bytes, i8);
                }
            }
            return bytes;
        }
    }

    static {
        f31976f = C5728h0.i.e("grpc-status", false, new c());
        d dVar = new d();
        f31977g = dVar;
        f31978h = C5728h0.i.e("grpc-message", false, dVar);
    }

    private J0(b bVar) {
        this(bVar, null, null);
    }

    private static List c() {
        TreeMap treeMap = new TreeMap();
        for (b bVar : b.values()) {
            J0 j02 = (J0) treeMap.put(Integer.valueOf(bVar.value()), new J0(bVar));
            if (j02 != null) {
                throw new IllegalStateException("Code value duplication between " + j02.getCode().name() + " & " + bVar.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    static String d(J0 j02) {
        if (j02.f31980b == null) {
            return j02.f31979a.toString();
        }
        return j02.f31979a + ": " + j02.f31980b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static J0 e(byte[] bArr) {
        return (bArr.length == 1 && bArr[0] == 48) ? OK : f(bArr);
    }

    private static J0 f(byte[] bArr) {
        int i8;
        byte b9;
        int length = bArr.length;
        char c9 = 1;
        if (length != 1) {
            i8 = (length == 2 && (b9 = bArr[0]) >= 48 && b9 <= 57) ? (b9 - 48) * 10 : 0;
            return UNKNOWN.withDescription("Unknown code " + new String(bArr, AbstractC5364f.US_ASCII));
        }
        c9 = 0;
        byte b10 = bArr[c9];
        if (b10 >= 48 && b10 <= 57) {
            int i9 = i8 + (b10 - 48);
            List list = f31975e;
            if (i9 < list.size()) {
                return (J0) list.get(i9);
            }
        }
        return UNKNOWN.withDescription("Unknown code " + new String(bArr, AbstractC5364f.US_ASCII));
    }

    public static J0 fromCode(b bVar) {
        return bVar.toStatus();
    }

    public static J0 fromCodeValue(int i8) {
        if (i8 >= 0) {
            List list = f31975e;
            if (i8 < list.size()) {
                return (J0) list.get(i8);
            }
        }
        return UNKNOWN.withDescription("Unknown code " + i8);
    }

    public static J0 fromThrowable(Throwable th) {
        for (Throwable cause = (Throwable) e3.w.checkNotNull(th, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof K0) {
                return ((K0) cause).getStatus();
            }
            if (cause instanceof L0) {
                return ((L0) cause).getStatus();
            }
        }
        return UNKNOWN.withCause(th);
    }

    public static C5728h0 trailersFromThrowable(Throwable th) {
        for (Throwable cause = (Throwable) e3.w.checkNotNull(th, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof K0) {
                return ((K0) cause).getTrailers();
            }
            if (cause instanceof L0) {
                return ((L0) cause).getTrailers();
            }
        }
        return null;
    }

    public K0 asException() {
        return new K0(this);
    }

    public L0 asRuntimeException() {
        return new L0(this);
    }

    public J0 augmentDescription(String str) {
        if (str == null) {
            return this;
        }
        if (this.f31980b == null) {
            return new J0(this.f31979a, str, this.f31981c);
        }
        return new J0(this.f31979a, this.f31980b + Q7.X.LF + str, this.f31981c);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Throwable getCause() {
        return this.f31981c;
    }

    public b getCode() {
        return this.f31979a;
    }

    public String getDescription() {
        return this.f31980b;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean isOk() {
        return b.OK == this.f31979a;
    }

    public String toString() {
        p.b bVarAdd = e3.p.toStringHelper(this).add(Constants.CODE, this.f31979a.name()).add(com.kakao.sdk.template.Constants.DESCRIPTION, this.f31980b);
        Throwable th = this.f31981c;
        Object stackTraceAsString = th;
        if (th != null) {
            stackTraceAsString = e3.F.getStackTraceAsString(th);
        }
        return bVarAdd.add("cause", stackTraceAsString).toString();
    }

    public J0 withCause(Throwable th) {
        return e3.r.equal(this.f31981c, th) ? this : new J0(this.f31979a, this.f31980b, th);
    }

    public J0 withDescription(String str) {
        return e3.r.equal(this.f31980b, str) ? this : new J0(this.f31979a, str, this.f31981c);
    }

    private J0(b bVar, String str, Throwable th) {
        this.f31979a = (b) e3.w.checkNotNull(bVar, Constants.CODE);
        this.f31980b = str;
        this.f31981c = th;
    }

    public K0 asException(C5728h0 c5728h0) {
        return new K0(this, c5728h0);
    }

    public L0 asRuntimeException(C5728h0 c5728h0) {
        return new L0(this, c5728h0);
    }
}
