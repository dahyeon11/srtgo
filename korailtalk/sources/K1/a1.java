package K1;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC4439th;
import java.util.Locale;

/* loaded from: classes.dex */
public class a1 extends U0 {
    static final /* synthetic */ WindowInsets b(Activity activity, View view, WindowInsets windowInsets) {
        if (G1.u.zzo().zzi().zzm() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String strConcat = "";
            if (displayCutout != null) {
                InterfaceC0671x0 interfaceC0671x0Zzi = G1.u.zzo().zzi();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String str = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(strConcat)) {
                        strConcat = strConcat.concat("|");
                    }
                    strConcat = strConcat.concat(str);
                }
                interfaceC0671x0Zzi.zzD(strConcat);
            } else {
                G1.u.zzo().zzi().zzD("");
            }
        }
        c(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void c(boolean z8, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i8 = attributes.layoutInDisplayCutoutMode;
        int i9 = true != z8 ? 2 : 1;
        if (i9 != i8) {
            attributes.layoutInDisplayCutoutMode = i9;
            window.setAttributes(attributes);
        }
    }

    @Override // K1.AbstractC0629c
    public final int zzj(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    @Override // K1.AbstractC0629c
    public final void zzk(final Activity activity) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbg)).booleanValue() && G1.u.zzo().zzi().zzm() == null && !activity.isInMultiWindowMode()) {
            c(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: K1.V0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return a1.b(activity, view, windowInsets);
                }
            });
        }
    }
}
