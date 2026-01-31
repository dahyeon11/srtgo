package y6;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import z4.I;
import z4.N;

/* renamed from: y6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6542b extends LinearLayout {
    public C6542b(Context context) {
        super(context);
    }

    protected int a(int i8) {
        return androidx.core.content.a.getColor(getContext(), i8);
    }

    protected String b(int i8) {
        return I.getString(getContext(), i8);
    }

    protected String c(int i8, Object... objArr) {
        return I.getString(getContext(), i8, objArr);
    }

    protected String[] d(int i8) {
        return I.getStringArray(getContext(), i8);
    }

    protected String e(TextView textView) {
        return N.getText(textView);
    }

    protected int f(String str) {
        return I.getViewId(getContext(), str);
    }

    public C6542b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C6542b(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
