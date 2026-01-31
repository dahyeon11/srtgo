package I6;

import com.kakao.sdk.common.Constants;
import e3.w;
import io.grpc.C5728h0;
import io.grpc.V;
import io.grpc.internal.T0;
import io.grpc.internal.U;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
abstract class d {
    public static final K6.d CONTENT_TYPE_HEADER;
    public static final K6.d HTTPS_SCHEME_HEADER;
    public static final K6.d HTTP_SCHEME_HEADER;
    public static final K6.d METHOD_GET_HEADER;
    public static final K6.d METHOD_HEADER;
    public static final K6.d TE_HEADER;

    static {
        P7.f fVar = K6.d.TARGET_SCHEME;
        HTTPS_SCHEME_HEADER = new K6.d(fVar, Constants.SCHEME);
        HTTP_SCHEME_HEADER = new K6.d(fVar, "http");
        P7.f fVar2 = K6.d.TARGET_METHOD;
        METHOD_HEADER = new K6.d(fVar2, U.HTTP_METHOD);
        METHOD_GET_HEADER = new K6.d(fVar2, "GET");
        CONTENT_TYPE_HEADER = new K6.d(U.CONTENT_TYPE_KEY.name(), U.CONTENT_TYPE_GRPC);
        TE_HEADER = new K6.d("te", U.TE_TRAILERS);
    }

    private static List a(List list, C5728h0 c5728h0) {
        byte[][] http2Headers = T0.toHttp2Headers(c5728h0);
        for (int i8 = 0; i8 < http2Headers.length; i8 += 2) {
            P7.f fVarOf = P7.f.of(http2Headers[i8]);
            if (fVarOf.size() != 0 && fVarOf.getByte(0) != 58) {
                list.add(new K6.d(fVarOf, P7.f.of(http2Headers[i8 + 1])));
            }
        }
        return list;
    }

    private static void b(C5728h0 c5728h0) {
        c5728h0.discardAll(U.CONTENT_TYPE_KEY);
        c5728h0.discardAll(U.TE_HEADER);
        c5728h0.discardAll(U.USER_AGENT_KEY);
    }

    public static List<K6.d> createHttpResponseHeaders(int i8, String str, C5728h0 c5728h0) {
        ArrayList arrayList = new ArrayList(V.headerCount(c5728h0) + 2);
        arrayList.add(new K6.d(K6.d.RESPONSE_STATUS, "" + i8));
        arrayList.add(new K6.d(U.CONTENT_TYPE_KEY.name(), str));
        return a(arrayList, c5728h0);
    }

    public static List<K6.d> createRequestHeaders(C5728h0 c5728h0, String str, String str2, String str3, boolean z8, boolean z9) {
        w.checkNotNull(c5728h0, "headers");
        w.checkNotNull(str, "defaultPath");
        w.checkNotNull(str2, "authority");
        b(c5728h0);
        ArrayList arrayList = new ArrayList(V.headerCount(c5728h0) + 7);
        if (z9) {
            arrayList.add(HTTP_SCHEME_HEADER);
        } else {
            arrayList.add(HTTPS_SCHEME_HEADER);
        }
        if (z8) {
            arrayList.add(METHOD_GET_HEADER);
        } else {
            arrayList.add(METHOD_HEADER);
        }
        arrayList.add(new K6.d(K6.d.TARGET_AUTHORITY, str2));
        arrayList.add(new K6.d(K6.d.TARGET_PATH, str));
        arrayList.add(new K6.d(U.USER_AGENT_KEY.name(), str3));
        arrayList.add(CONTENT_TYPE_HEADER);
        arrayList.add(TE_HEADER);
        return a(arrayList, c5728h0);
    }

    public static List<K6.d> createResponseHeaders(C5728h0 c5728h0) {
        b(c5728h0);
        ArrayList arrayList = new ArrayList(V.headerCount(c5728h0) + 2);
        arrayList.add(new K6.d(K6.d.RESPONSE_STATUS, "200"));
        arrayList.add(CONTENT_TYPE_HEADER);
        return a(arrayList, c5728h0);
    }

    public static List<K6.d> createResponseTrailers(C5728h0 c5728h0, boolean z8) {
        if (!z8) {
            return createResponseHeaders(c5728h0);
        }
        b(c5728h0);
        return a(new ArrayList(V.headerCount(c5728h0)), c5728h0);
    }
}
