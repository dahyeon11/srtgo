package androidx.core.widget;

import android.os.Build;

/* loaded from: classes.dex */
public interface b {

    @Deprecated
    public static final boolean PLATFORM_SUPPORTS_AUTOSIZE;

    static {
        PLATFORM_SUPPORTS_AUTOSIZE = Build.VERSION.SDK_INT >= 27;
    }

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i8, int i9, int i10, int i11);

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i8);

    void setAutoSizeTextTypeWithDefaults(int i8);
}
