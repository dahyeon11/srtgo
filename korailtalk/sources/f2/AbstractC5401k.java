package f2;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.VisibleForTesting;
import i2.AbstractDialogInterfaceOnClickListenerC5647F;

/* renamed from: f2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5401k extends AbstractC5402l {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = AbstractC5402l.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    @Deprecated
    public static Dialog getErrorDialog(int i8, Activity activity, int i9) {
        return getErrorDialog(i8, activity, i9, null);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i8, Context context, int i9) {
        return AbstractC5402l.getErrorPendingIntent(i8, context, i9);
    }

    @VisibleForTesting
    @Deprecated
    public static String getErrorString(int i8) {
        return AbstractC5402l.getErrorString(i8);
    }

    public static Context getRemoteContext(Context context) {
        return AbstractC5402l.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return AbstractC5402l.getRemoteResource(context);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return AbstractC5402l.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i8) {
        return AbstractC5402l.isUserRecoverableError(i8);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i8, Activity activity, int i9) {
        return showErrorDialogFragment(i8, activity, i9, null);
    }

    @Deprecated
    public static void showErrorNotification(int i8, Context context) {
        C5397g c5397g = C5397g.getInstance();
        if (AbstractC5402l.isPlayServicesPossiblyUpdating(context, i8) || AbstractC5402l.isPlayStorePossiblyUpdating(context, i8)) {
            c5397g.d(context);
        } else {
            c5397g.showErrorNotification(context, i8);
        }
    }

    @Deprecated
    public static Dialog getErrorDialog(int i8, Activity activity, int i9, DialogInterface.OnCancelListener onCancelListener) {
        if (true == AbstractC5402l.isPlayServicesPossiblyUpdating(activity, i8)) {
            i8 = 18;
        }
        return C5397g.getInstance().getErrorDialog(activity, i8, i9, onCancelListener);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i8) {
        return AbstractC5402l.isGooglePlayServicesAvailable(context, i8);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i8, Activity activity, int i9, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i8, activity, null, i9, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i8, Activity activity, Fragment fragment, int i9, DialogInterface.OnCancelListener onCancelListener) {
        if (true == AbstractC5402l.isPlayServicesPossiblyUpdating(activity, i8)) {
            i8 = 18;
        }
        C5397g c5397g = C5397g.getInstance();
        if (fragment == null) {
            return c5397g.showErrorDialogFragment(activity, i8, i9, onCancelListener);
        }
        Dialog dialogA = c5397g.a(activity, i8, AbstractDialogInterfaceOnClickListenerC5647F.zac(fragment, C5397g.getInstance().getErrorResolutionIntent(activity, i8, "d"), i9), onCancelListener);
        if (dialogA == null) {
            return false;
        }
        c5397g.b(activity, dialogA, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
