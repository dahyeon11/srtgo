package y6;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import z4.I;

/* renamed from: y6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6541a extends FrameLayout {
    public C6541a(Context context) {
        super(context);
    }

    protected String a(int i8) {
        return I.getString(getContext(), i8);
    }

    protected String b(int i8, Object... objArr) {
        return I.getString(getContext(), i8, objArr);
    }

    protected String[] c(int i8) {
        return getResources().getStringArray(i8);
    }

    public C6541a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C6541a(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
