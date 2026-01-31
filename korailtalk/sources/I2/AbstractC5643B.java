package i2;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import f2.AbstractC5401k;
import f2.AbstractC5404n;
import java.util.Locale;

/* renamed from: i2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5643B {

    /* renamed from: a, reason: collision with root package name */
    private static final O.h f31690a = new O.h();

    /* renamed from: b, reason: collision with root package name */
    private static Locale f31691b;

    private static String a(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strB = b(context, str);
        if (strB == null) {
            strB = resources.getString(AbstractC5404n.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strB, str2);
    }

    private static String b(Context context, String str) {
        O.h hVar = f31690a;
        synchronized (hVar) {
            try {
                Locale locale = androidx.core.os.f.getLocales(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(f31691b)) {
                    hVar.clear();
                    f31691b = locale;
                }
                String str2 = (String) hVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources remoteResource = AbstractC5401k.getRemoteResource(context);
                if (remoteResource == null) {
                    return null;
                }
                int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                    return null;
                }
                String string = remoteResource.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                    return null;
                }
                hVar.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return q2.e.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String zab(Context context) {
        return context.getResources().getString(d2.b.common_google_play_services_notification_channel_name);
    }

    public static String zac(Context context, int i8) {
        Resources resources = context.getResources();
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? resources.getString(R.string.ok) : resources.getString(d2.b.common_google_play_services_enable_button) : resources.getString(d2.b.common_google_play_services_update_button) : resources.getString(d2.b.common_google_play_services_install_button);
    }

    public static String zad(Context context, int i8) {
        Resources resources = context.getResources();
        String strZaa = zaa(context);
        if (i8 == 1) {
            return resources.getString(d2.b.common_google_play_services_install_text, strZaa);
        }
        if (i8 == 2) {
            return o2.j.isWearableWithoutPlayStore(context) ? resources.getString(d2.b.common_google_play_services_wear_update_text) : resources.getString(d2.b.common_google_play_services_update_text, strZaa);
        }
        if (i8 == 3) {
            return resources.getString(d2.b.common_google_play_services_enable_text, strZaa);
        }
        if (i8 == 5) {
            return a(context, "common_google_play_services_invalid_account_text", strZaa);
        }
        if (i8 == 7) {
            return a(context, "common_google_play_services_network_error_text", strZaa);
        }
        if (i8 == 9) {
            return resources.getString(d2.b.common_google_play_services_unsupported_text, strZaa);
        }
        if (i8 == 20) {
            return a(context, "common_google_play_services_restricted_profile_text", strZaa);
        }
        switch (i8) {
            case 16:
                return a(context, "common_google_play_services_api_unavailable_text", strZaa);
            case 17:
                return a(context, "common_google_play_services_sign_in_failed_text", strZaa);
            case 18:
                return resources.getString(d2.b.common_google_play_services_updating_text, strZaa);
            default:
                return resources.getString(AbstractC5404n.common_google_play_services_unknown_issue, strZaa);
        }
    }

    public static String zae(Context context, int i8) {
        return (i8 == 6 || i8 == 19) ? a(context, "common_google_play_services_resolution_required_text", zaa(context)) : zad(context, i8);
    }

    public static String zaf(Context context, int i8) {
        String strB = i8 == 6 ? b(context, "common_google_play_services_resolution_required_title") : zag(context, i8);
        return strB == null ? context.getResources().getString(d2.b.common_google_play_services_notification_ticker) : strB;
    }

    public static String zag(Context context, int i8) {
        Resources resources = context.getResources();
        switch (i8) {
            case 1:
                return resources.getString(d2.b.common_google_play_services_install_title);
            case 2:
                return resources.getString(d2.b.common_google_play_services_update_title);
            case 3:
                return resources.getString(d2.b.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return b(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return b(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i8);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return b(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return b(context, "common_google_play_services_restricted_profile_title");
        }
    }
}
