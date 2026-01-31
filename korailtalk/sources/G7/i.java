package G7;

import C7.A;
import C7.H;
import java.net.Proxy;

/* loaded from: classes3.dex */
public abstract class i {
    private static boolean a(H h8, Proxy.Type type) {
        return !h8.isHttps() && type == Proxy.Type.HTTP;
    }

    public static String get(H h8, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(h8.method());
        sb.append(' ');
        if (a(h8, type)) {
            sb.append(h8.url());
        } else {
            sb.append(requestPath(h8.url()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    public static String requestPath(A a9) {
        String strEncodedPath = a9.encodedPath();
        String strEncodedQuery = a9.encodedQuery();
        if (strEncodedQuery == null) {
            return strEncodedPath;
        }
        return strEncodedPath + '?' + strEncodedQuery;
    }
}
