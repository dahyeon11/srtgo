package D6;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c {
    public static String getCharsetFromContentTypeHeader(Map<String, List<String>> map) {
        String[] strArrSplit;
        String str = "utf-8";
        for (String str2 : map.keySet()) {
            if ("Content-Type".equalsIgnoreCase(str2)) {
                Iterator<String> it = map.get(str2).iterator();
                while (it.hasNext()) {
                    String[] strArrSplit2 = it.next().split(";");
                    if (strArrSplit2 != null) {
                        for (String str3 : strArrSplit2) {
                            if (str3.contains("charset") && (strArrSplit = str3.split(SimpleComparison.EQUAL_TO_OPERATION)) != null && strArrSplit[1].length() > 2) {
                                str = strArrSplit[1];
                            }
                        }
                    }
                    if (!C6.a.isRealVersion()) {
                        C6.a.i("HttpConnectionUtil", "encoding type from response : " + str);
                    }
                }
            }
        }
        return str;
    }
}
