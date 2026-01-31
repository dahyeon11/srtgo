package z4;

import android.content.Intent;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: z4.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6625A {
    public static <T> ArrayList<T> clone(ArrayList<T> arrayList) {
        return (ArrayList) arrayList.clone();
    }

    public static Map<String, String> convertObjectToMap(Object obj) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method[] methods = obj.getClass().getMethods();
        HashMap map = new HashMap();
        for (Method method : methods) {
            if (method.getName().startsWith("get") && !method.getName().startsWith("getClass")) {
                map.put(method.getName().substring(3).toLowerCase(), (String) method.invoke(obj, null));
            }
        }
        return map;
    }

    public static <T> T getParcelableExtra(Intent intent, String str) {
        return (T) intent.getParcelableExtra(str);
    }

    public static <T> T getSerializable(Bundle bundle, String str) {
        return (T) bundle.getSerializable(str);
    }

    public static <T> T getSerializableExtra(Intent intent, String str) {
        return (T) intent.getSerializableExtra(str);
    }

    public static String[] toArray(List<String> list) {
        return (String[]) list.toArray(new String[0]);
    }
}
