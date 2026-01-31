package z4;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class H {
    public static boolean getBoolean(Context context, String str) {
        return getBoolean(context, str, false);
    }

    public static int getInt(Context context, String str) {
        return getInt(context, str, 0);
    }

    public static ArrayList<Integer> getIntList(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(getString(context, str, ""));
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                arrayList.add(Integer.valueOf(jSONArray.optInt(i8, 0)));
            }
        } catch (JSONException e8) {
            t.e(e8.getMessage());
        }
        return arrayList;
    }

    public static String getString(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(str, "");
    }

    public static void putBoolean(Context context, String str, boolean z8) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putBoolean(str, z8);
        editorEdit.commit();
    }

    public static void putInt(Context context, String str, int i8) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putInt(str, i8);
        editorEdit.commit();
    }

    public static void putIntList(Context context, String str, ArrayList<Integer> arrayList) {
        JSONArray jSONArray = new JSONArray();
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        putString(context, str, jSONArray.toString());
    }

    public static void putString(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        if (str2 == null) {
            str2 = "";
        }
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }

    public static boolean getBoolean(Context context, String str, boolean z8) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, z8);
    }

    public static int getInt(Context context, String str, int i8) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(str, i8);
    }

    public static String getString(Context context, String str, String str2) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
    }
}
