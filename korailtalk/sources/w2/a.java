package W2;

import J2.b;
import J2.k;
import J2.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.r;
import androidx.core.widget.c;
import c3.AbstractC1090a;

/* loaded from: classes2.dex */
public class a extends r {

    /* renamed from: f, reason: collision with root package name */
    private static final int f5303f = k.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: g, reason: collision with root package name */
    private static final int[][] f5304g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: d, reason: collision with root package name */
    private ColorStateList f5305d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5306e;

    public a(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5305d == null) {
            int color = Q2.a.getColor(this, b.colorControlActivated);
            int color2 = Q2.a.getColor(this, b.colorOnSurface);
            int color3 = Q2.a.getColor(this, b.colorSurface);
            int[][] iArr = f5304g;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = Q2.a.layer(color3, color, 1.0f);
            iArr2[1] = Q2.a.layer(color3, color2, 0.54f);
            iArr2[2] = Q2.a.layer(color3, color2, 0.38f);
            iArr2[3] = Q2.a.layer(color3, color2, 0.38f);
            this.f5305d = new ColorStateList(iArr, iArr2);
        }
        return this.f5305d;
    }

    public boolean isUseMaterialThemeColors() {
        return this.f5306e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5306e && c.getButtonTintList(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z8) {
        this.f5306e = z8;
        if (z8) {
            c.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            c.setButtonTintList(this, null);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.radioButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f5303f;
        super(AbstractC1090a.wrap(context, attributeSet, i8, i9), attributeSet, i8);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.k.obtainStyledAttributes(context2, attributeSet, l.MaterialRadioButton, i8, i9, new int[0]);
        if (typedArrayObtainStyledAttributes.hasValue(l.MaterialRadioButton_buttonTint)) {
            c.setButtonTintList(this, X2.c.getColorStateList(context2, typedArrayObtainStyledAttributes, l.MaterialRadioButton_buttonTint));
        }
        this.f5306e = typedArrayObtainStyledAttributes.getBoolean(l.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
