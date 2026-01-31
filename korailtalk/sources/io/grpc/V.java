package io.grpc;

import io.grpc.C5728h0;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class V {
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public static final h3.b BASE64_ENCODING_OMIT_PADDING = C5728h0.f32130d;

    public interface a extends C5728h0.m {
        @Override // io.grpc.C5728h0.m
        /* synthetic */ Object parseAsciiString(byte[] bArr);

        @Override // io.grpc.C5728h0.m
        /* synthetic */ byte[] toAsciiString(Object obj);
    }

    public static int headerCount(C5728h0 c5728h0) {
        return c5728h0.j();
    }

    public static <T> C5728h0.i keyOf(String str, a aVar) {
        boolean z8 = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z8 = true;
        }
        return C5728h0.i.e(str, z8, aVar);
    }

    public static C5728h0 newMetadata(byte[]... bArr) {
        return new C5728h0(bArr);
    }

    public static C5728h0 newMetadataWithParsedValues(int i8, Object[] objArr) {
        return new C5728h0(i8, objArr);
    }

    public static <T> Object parsedValue(C5728h0.g gVar, T t8) {
        return new C5728h0.k(gVar, t8);
    }

    public static byte[][] serialize(C5728h0 c5728h0) {
        return c5728h0.p();
    }

    public static Object[] serializePartial(C5728h0 c5728h0) {
        return c5728h0.q();
    }

    public static C5728h0 newMetadata(int i8, byte[]... bArr) {
        return new C5728h0(i8, bArr);
    }

    public static <T> C5728h0.i keyOf(String str, C5728h0.d dVar) {
        boolean z8 = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z8 = true;
        }
        return C5728h0.i.d(str, z8, dVar);
    }
}
