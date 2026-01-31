package ai.maum.m2u.cdk.utils;

import com.google.gson.Gson;
import com.google.gson.e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GsonUtil {
    private static final String TAG = "GsonUtil";
    private static Gson mGson;

    public static Gson getGson() {
        if (mGson == null) {
            mGson = new e().create();
        }
        return mGson;
    }

    public static void gsonLog(Object obj) {
        try {
            new JSONObject(getGson().toJson(obj));
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    public static String jsonStringFromObject(Object obj) {
        try {
            return new JSONObject(getGson().toJson(obj)).toString();
        } catch (JSONException e8) {
            e8.printStackTrace();
            return "";
        }
    }
}
