package z4;

import android.content.Context;
import android.content.res.ColorStateList;
import com.kakao.sdk.user.Constants;
import i.AbstractC5638a;

/* loaded from: classes.dex */
public class I {
    public static int getColor(Context context, int i8) {
        return context.getResources().getColor(i8);
    }

    public static ColorStateList getColorStateList(Context context, int i8) {
        return AbstractC5638a.getColorStateList(context, i8);
    }

    public static int getIntegerId(Context context, String str) {
        return context.getResources().getIdentifier(str, "integer", context.getPackageName());
    }

    public static String getString(Context context, int i8) {
        return context.getString(i8);
    }

    public static String[] getStringArray(Context context, int i8) {
        return context.getResources().getStringArray(i8);
    }

    public static int getStringID(Context context, String str) {
        return context.getResources().getIdentifier(str, "string", context.getPackageName());
    }

    public static int getViewId(Context context, String str) {
        return context.getResources().getIdentifier(str, Constants.ID, context.getPackageName());
    }

    public static String getString(Context context, int i8, Object... objArr) {
        return context.getString(i8, objArr);
    }
}
