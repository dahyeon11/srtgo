package x0;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public abstract class f {
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    public static void appendPlaceholders(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            sb.append("?");
            if (i9 < i8 - 1) {
                sb.append(",");
            }
        }
    }

    public static String joinIntoString(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        if (size == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < size; i8++) {
            sb.append(Integer.toString(list.get(i8).intValue()));
            if (i8 < size - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static StringBuilder newStringBuilder() {
        return new StringBuilder();
    }

    public static List<Integer> splitToIntList(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreElements()) {
            try {
                arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
            } catch (NumberFormatException e8) {
                Log.e("ROOM", "Malformed integer list", e8);
            }
        }
        return arrayList;
    }
}
