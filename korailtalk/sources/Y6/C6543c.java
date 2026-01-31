package y6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import z4.I;

/* renamed from: y6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6543c extends RelativeLayout {
    public C6543c(Context context) {
        super(context);
    }

    protected ColorStateList a(int i8) {
        return I.getColorStateList(getContext(), i8);
    }

    protected String b(int i8) {
        return I.getString(getContext(), i8);
    }

    public C6543c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C6543c(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
