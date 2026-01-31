package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;

/* loaded from: classes.dex */
interface c {
    ColorStateList getBackgroundColor(b bVar);

    float getElevation(b bVar);

    float getMaxElevation(b bVar);

    float getMinHeight(b bVar);

    float getMinWidth(b bVar);

    float getRadius(b bVar);

    void initStatic();

    void initialize(b bVar, Context context, ColorStateList colorStateList, float f8, float f9, float f10);

    void onCompatPaddingChanged(b bVar);

    void onPreventCornerOverlapChanged(b bVar);

    void setBackgroundColor(b bVar, ColorStateList colorStateList);

    void setElevation(b bVar, float f8);

    void setMaxElevation(b bVar, float f8);

    void setRadius(b bVar, float f8);

    void updatePadding(b bVar);
}
