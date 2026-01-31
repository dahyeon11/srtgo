package E2;

import android.content.Context;
import android.content.res.Resources;
import f2.AbstractC5404n;

/* loaded from: classes2.dex */
public abstract class a {
    public static String zza(Context context) {
        try {
            return context.getResources().getResourcePackageName(AbstractC5404n.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final String zzb(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
