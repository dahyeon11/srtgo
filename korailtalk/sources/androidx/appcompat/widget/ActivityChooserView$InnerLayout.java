package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f6779a = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(context, attributeSet, f6779a);
        setBackgroundDrawable(r0VarObtainStyledAttributes.getDrawable(0));
        r0VarObtainStyledAttributes.recycle();
    }
}
