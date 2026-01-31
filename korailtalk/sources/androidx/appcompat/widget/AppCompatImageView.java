package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.InterfaceC0973l0;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements InterfaceC0973l0, androidx.core.widget.l {

    /* renamed from: a, reason: collision with root package name */
    private final C0845e f6780a;

    /* renamed from: b, reason: collision with root package name */
    private final C0854n f6781b;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0845e c0845e = this.f6780a;
        if (c0845e != null) {
            c0845e.b();
        }
        C0854n c0854n = this.f6781b;
        if (c0854n != null) {
            c0854n.b();
        }
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public ColorStateList getSupportBackgroundTintList() {
        C0845e c0845e = this.f6780a;
        if (c0845e != null) {
            return c0845e.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0845e c0845e = this.f6780a;
        if (c0845e != null) {
            return c0845e.d();
        }
        return null;
    }

    @Override // androidx.core.widget.l
    public ColorStateList getSupportImageTintList() {
        C0854n c0854n = this.f6781b;
        if (c0854n != null) {
            return c0854n.c();
        }
        return null;
    }

    @Override // androidx.core.widget.l
    public PorterDuff.Mode getSupportImageTintMode() {
        C0854n c0854n = this.f6781b;
        if (c0854n != null) {
            return c0854n.d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f6781b.e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0845e c0845e = this.f6780a;
        if (c0845e != null) {
            c0845e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C0845e c0845e = this.f6780a;
        if (c0845e != null) {
            c0845e.g(i8);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0854n c0854n = this.f6781b;
        if (c0854n != null) {
            c0854n.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0854n c0854n = this.f6781b;
        if (c0854n != null) {
            c0854n.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i8) {
        C0854n c0854n = this.f6781b;
        if (c0854n != null) {
            c0854n.setImageResource(i8);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0854n c0854n = this.f6781b;
        if (c0854n != null) {
            c0854n.b();
        }
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0845e c0845e = this.f6780a;
        if (c0845e != null) {
            c0845e.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0973l0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0845e c0845e = this.f6780a;
        if (c0845e != null) {
            c0845e.j(mode);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0854n c0854n = this.f6781b;
        if (c0854n != null) {
            c0854n.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0854n c0854n = this.f6781b;
        if (c0854n != null) {
            c0854n.g(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i8) {
        super(o0.wrap(context), attributeSet, i8);
        n0.checkAppCompatTheme(this, getContext());
        C0845e c0845e = new C0845e(this);
        this.f6780a = c0845e;
        c0845e.e(attributeSet, i8);
        C0854n c0854n = new C0854n(this);
        this.f6781b = c0854n;
        c0854n.loadFromAttributes(attributeSet, i8);
    }
}
