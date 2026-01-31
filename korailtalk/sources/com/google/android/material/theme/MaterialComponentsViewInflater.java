package com.google.android.material.theme;

import N2.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.l;
import androidx.appcompat.widget.C0844d;
import androidx.appcompat.widget.C0846f;
import androidx.appcompat.widget.C0847g;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.r;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.g;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends l {
    @Override // androidx.appcompat.app.l
    protected C0844d b(Context context, AttributeSet attributeSet) {
        return new g(context, attributeSet);
    }

    @Override // androidx.appcompat.app.l
    protected C0846f c(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.l
    protected C0847g d(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.l
    protected r j(Context context, AttributeSet attributeSet) {
        return new W2.a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.l
    protected J n(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
