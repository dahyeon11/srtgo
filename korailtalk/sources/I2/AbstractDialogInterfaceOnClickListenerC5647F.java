package i2;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.fragment.app.Fragment;
import h2.InterfaceC5589f;

/* renamed from: i2.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC5647F implements DialogInterface.OnClickListener {
    public static AbstractDialogInterfaceOnClickListenerC5647F zab(Activity activity, Intent intent, int i8) {
        return new C5644C(intent, activity, i8);
    }

    public static AbstractDialogInterfaceOnClickListenerC5647F zac(Fragment fragment, Intent intent, int i8) {
        return new C5645D(intent, fragment, i8);
    }

    public static AbstractDialogInterfaceOnClickListenerC5647F zad(InterfaceC5589f interfaceC5589f, Intent intent, int i8) {
        return new C5646E(intent, interfaceC5589f, 2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        try {
            zaa();
        } catch (ActivityNotFoundException e8) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e8);
        } finally {
            dialogInterface.dismiss();
        }
    }

    protected abstract void zaa();
}
