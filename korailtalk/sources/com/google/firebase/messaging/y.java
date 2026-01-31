package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.AbstractC5186c;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f25821a;

    public y(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f25821a = new Bundle(bundle);
    }

    private static int a(String str) {
        int color = Color.parseColor(str);
        if (color != -16777216) {
            return color;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    private static boolean f(String str) {
        return str.startsWith("google.c.a.") || str.equals(AbstractC5186c.a.FROM);
    }

    private static boolean g(String str) {
        return str.startsWith(AbstractC5186c.a.RESERVED_CLIENT_LIB_PREFIX) || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    private static String h(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    private String i(String str) {
        if (!this.f25821a.containsKey(str) && str.startsWith("gcm.n.")) {
            String strH = h(str);
            if (this.f25821a.containsKey(strH)) {
                return strH;
            }
        }
        return str;
    }

    private static String j(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    int[] b() throws JSONException {
        JSONArray jSONArray = getJSONArray("gcm.n.light_settings");
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArray.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = a(jSONArray.optString(0));
            iArr[1] = jSONArray.optInt(1);
            iArr[2] = jSONArray.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e8) {
            String strValueOf = String.valueOf(jSONArray);
            String message = e8.getMessage();
            StringBuilder sb = new StringBuilder(strValueOf.length() + 60 + String.valueOf(message).length());
            sb.append("LightSettings is invalid: ");
            sb.append(strValueOf);
            sb.append(". ");
            sb.append(message);
            sb.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb.toString());
            return null;
        } catch (JSONException unused) {
            String strValueOf2 = String.valueOf(jSONArray);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 58);
            sb2.append("LightSettings is invalid: ");
            sb2.append(strValueOf2);
            sb2.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    Integer c() {
        Integer integer = getInteger("gcm.n.notification_count");
        if (integer == null) {
            return null;
        }
        if (integer.intValue() >= 0) {
            return integer;
        }
        String strValueOf = String.valueOf(integer);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 67);
        sb.append("notificationCount is invalid: ");
        sb.append(strValueOf);
        sb.append(". Skipping setting notificationCount.");
        Log.w(AbstractC5186c.TAG, sb.toString());
        return null;
    }

    Integer d() {
        Integer integer = getInteger("gcm.n.notification_priority");
        if (integer == null) {
            return null;
        }
        if (integer.intValue() >= -2 && integer.intValue() <= 2) {
            return integer;
        }
        String strValueOf = String.valueOf(integer);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 72);
        sb.append("notificationPriority is invalid ");
        sb.append(strValueOf);
        sb.append(". Skipping setting notificationPriority.");
        Log.w(AbstractC5186c.TAG, sb.toString());
        return null;
    }

    Integer e() {
        Integer integer = getInteger("gcm.n.visibility");
        if (integer == null) {
            return null;
        }
        if (integer.intValue() >= -1 && integer.intValue() <= 1) {
            return integer;
        }
        String strValueOf = String.valueOf(integer);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 53);
        sb.append("visibility is invalid: ");
        sb.append(strValueOf);
        sb.append(". Skipping setting visibility.");
        Log.w("NotificationParams", sb.toString());
        return null;
    }

    public boolean getBoolean(String str) {
        String string = getString(str);
        return "1".equals(string) || Boolean.parseBoolean(string);
    }

    public Integer getInteger(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(string));
        } catch (NumberFormatException unused) {
            String strJ = j(str);
            StringBuilder sb = new StringBuilder(String.valueOf(strJ).length() + 38 + String.valueOf(string).length());
            sb.append("Couldn't parse value of ");
            sb.append(strJ);
            sb.append("(");
            sb.append(string);
            sb.append(") into an int");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public JSONArray getJSONArray(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return new JSONArray(string);
        } catch (JSONException unused) {
            String strJ = j(str);
            StringBuilder sb = new StringBuilder(String.valueOf(strJ).length() + 50 + String.valueOf(string).length());
            sb.append("Malformed JSON for key ");
            sb.append(strJ);
            sb.append(": ");
            sb.append(string);
            sb.append(", falling back to default");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public Uri getLink() {
        String string = getString("gcm.n.link_android");
        if (TextUtils.isEmpty(string)) {
            string = getString("gcm.n.link");
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return Uri.parse(string);
    }

    public Object[] getLocalizationArgsForKey(String str) {
        String strValueOf = String.valueOf(str);
        JSONArray jSONArray = getJSONArray("_loc_args".length() != 0 ? strValueOf.concat("_loc_args") : new String(strValueOf));
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i8 = 0; i8 < length; i8++) {
            strArr[i8] = jSONArray.optString(i8);
        }
        return strArr;
    }

    public String getLocalizationResourceForKey(String str) {
        String strValueOf = String.valueOf(str);
        return getString("_loc_key".length() != 0 ? strValueOf.concat("_loc_key") : new String(strValueOf));
    }

    public String getLocalizedString(Resources resources, String str, String str2) {
        String localizationResourceForKey = getLocalizationResourceForKey(str2);
        if (TextUtils.isEmpty(localizationResourceForKey)) {
            return null;
        }
        int identifier = resources.getIdentifier(localizationResourceForKey, "string", str);
        if (identifier == 0) {
            String strValueOf = String.valueOf(str2);
            String strJ = j("_loc_key".length() != 0 ? strValueOf.concat("_loc_key") : new String(strValueOf));
            StringBuilder sb = new StringBuilder(String.valueOf(strJ).length() + 49 + String.valueOf(str2).length());
            sb.append(strJ);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        Object[] localizationArgsForKey = getLocalizationArgsForKey(str2);
        if (localizationArgsForKey == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, localizationArgsForKey);
        } catch (MissingFormatArgumentException e8) {
            String strJ2 = j(str2);
            String string = Arrays.toString(localizationArgsForKey);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strJ2).length() + 58 + String.valueOf(string).length());
            sb2.append("Missing format argument for ");
            sb2.append(strJ2);
            sb2.append(": ");
            sb2.append(string);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), e8);
            return null;
        }
    }

    public Long getLong(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(string));
        } catch (NumberFormatException unused) {
            String strJ = j(str);
            StringBuilder sb = new StringBuilder(String.valueOf(strJ).length() + 38 + String.valueOf(string).length());
            sb.append("Couldn't parse value of ");
            sb.append(strJ);
            sb.append("(");
            sb.append(string);
            sb.append(") into a long");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public String getNotificationChannelId() {
        return getString("gcm.n.android_channel_id");
    }

    public String getPossiblyLocalizedString(Resources resources, String str, String str2) {
        String string = getString(str2);
        return !TextUtils.isEmpty(string) ? string : getLocalizedString(resources, str, str2);
    }

    public String getSoundResourceName() {
        String string = getString("gcm.n.sound2");
        return TextUtils.isEmpty(string) ? getString("gcm.n.sound") : string;
    }

    public String getString(String str) {
        return this.f25821a.getString(i(str));
    }

    public long[] getVibrateTimings() throws JSONException {
        JSONArray jSONArray = getJSONArray("gcm.n.vibrate_timings");
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArray.length();
            long[] jArr = new long[length];
            for (int i8 = 0; i8 < length; i8++) {
                jArr[i8] = jSONArray.optLong(i8);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            String strValueOf = String.valueOf(jSONArray);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(strValueOf);
            sb.append(". Skipping setting vibrateTimings.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public boolean hasImage() {
        return !TextUtils.isEmpty(getString("gcm.n.image"));
    }

    public boolean isNotification() {
        return getBoolean("gcm.n.e");
    }

    public Bundle paramsForAnalyticsIntent() {
        Bundle bundle = new Bundle(this.f25821a);
        for (String str : this.f25821a.keySet()) {
            if (!f(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle paramsWithReservedKeysRemoved() {
        Bundle bundle = new Bundle(this.f25821a);
        for (String str : this.f25821a.keySet()) {
            if (g(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public static boolean isNotification(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(h("gcm.n.e")));
    }
}
