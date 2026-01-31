package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import i.AbstractC5638a;

/* renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0848h extends CheckedTextView {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f7125b = {R.attr.checkMark};

    /* renamed from: a, reason: collision with root package name */
    private final I f7126a;

    public C0848h(Context context) {
        this(context, null);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        I i8 = this.f7126a;
        if (i8 != null) {
            i8.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC0852l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i8) {
        setCheckMarkDrawable(AbstractC5638a.getDrawable(getContext(), i8));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        I i9 = this.f7126a;
        if (i9 != null) {
            i9.q(context, i8);
        }
    }

    public C0848h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public C0848h(Context context, AttributeSet attributeSet, int i8) {
        super(o0.wrap(context), attributeSet, i8);
        n0.checkAppCompatTheme(this, getContext());
        I i9 = new I(this);
        this.f7126a = i9;
        i9.m(attributeSet, i8);
        i9.b();
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(getContext(), attributeSet, f7125b, i8, 0);
        setCheckMarkDrawable(r0VarObtainStyledAttributes.getDrawable(0));
        r0VarObtainStyledAttributes.recycle();
    }
}
