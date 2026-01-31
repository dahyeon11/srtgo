package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0951e;
import androidx.core.view.InterfaceC0973l0;
import h.AbstractC5563a;

/* renamed from: androidx.appcompat.widget.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0851k extends EditText implements InterfaceC0973l0, androidx.core.view.Y {

    /* renamed from: a, reason: collision with root package name */
    private final C0845e f7176a;

    /* renamed from: b, reason: collision with root package name */
    private final I f7177b;

    /* renamed from: c, reason: collision with root package name */
    private final C f7178c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.core.widget.i f7179d;

    public C0851k(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0845e c0845e = this.f7176a;
        if (c0845e != null) {
            c0845e.b();
        }
        I i8 = this.f7177b;
        if (i8 != null) {
            i8.b();
        }
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public ColorStateList getSupportBackgroundTintList() {
        C0845e c0845e = this.f7176a;
        if (c0845e != null) {
            return c0845e.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0845e c0845e = this.f7176a;
        if (c0845e != null) {
            return c0845e.d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C c9;
        return (Build.VERSION.SDK_INT >= 28 || (c9 = this.f7178c) == null) ? super.getTextClassifier() : c9.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f7177b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = AbstractC0852l.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        String[] onReceiveContentMimeTypes = AbstractC0985p0.getOnReceiveContentMimeTypes(this);
        if (inputConnectionA == null || onReceiveContentMimeTypes == null) {
            return inputConnectionA;
        }
        androidx.core.view.inputmethod.c.setContentMimeTypes(editorInfo, onReceiveContentMimeTypes);
        return androidx.core.view.inputmethod.e.createWrapper(inputConnectionA, editorInfo, AbstractC0860u.a(this));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (AbstractC0860u.b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // androidx.core.view.Y
    public C0951e onReceiveContent(C0951e c0951e) {
        return this.f7179d.onReceiveContent(this, c0951e);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i8) {
        if (AbstractC0860u.c(this, i8)) {
            return true;
        }
        return super.onTextContextMenuItem(i8);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0845e c0845e = this.f7176a;
        if (c0845e != null) {
            c0845e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C0845e c0845e = this.f7176a;
        if (c0845e != null) {
            c0845e.g(i8);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0845e c0845e = this.f7176a;
        if (c0845e != null) {
            c0845e.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0845e c0845e = this.f7176a;
        if (c0845e != null) {
            c0845e.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        I i9 = this.f7177b;
        if (i9 != null) {
            i9.q(context, i8);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C c9;
        if (Build.VERSION.SDK_INT >= 28 || (c9 = this.f7178c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c9.setTextClassifier(textClassifier);
        }
    }

    public C0851k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5563a.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public C0851k(Context context, AttributeSet attributeSet, int i8) {
        super(o0.wrap(context), attributeSet, i8);
        n0.checkAppCompatTheme(this, getContext());
        C0845e c0845e = new C0845e(this);
        this.f7176a = c0845e;
        c0845e.e(attributeSet, i8);
        I i9 = new I(this);
        this.f7177b = i9;
        i9.m(attributeSet, i8);
        i9.b();
        this.f7178c = new C(this);
        this.f7179d = new androidx.core.widget.i();
    }
}
