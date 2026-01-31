package z4;

import com.google.gson.Gson;

/* loaded from: classes.dex */
public class q {
    public static <T> T fromJson(String str, Class<T> cls) {
        return (T) new Gson().fromJson(str, (Class) cls);
    }

    public static String toJson(Object obj) {
        return new Gson().toJson(obj);
    }
}
