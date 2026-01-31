package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public interface b {
    Context getActionBarThemedContext();

    Drawable getThemeUpIndicator();

    boolean isNavigationVisible();

    void setActionBarDescription(int i8);

    void setActionBarUpIndicator(Drawable drawable, int i8);
}
