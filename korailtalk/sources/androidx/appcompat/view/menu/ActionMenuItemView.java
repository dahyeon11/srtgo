package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.Z;
import androidx.appcompat.widget.u0;
import h.AbstractC5572j;

/* loaded from: classes.dex */
public class ActionMenuItemView extends J implements l.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: f, reason: collision with root package name */
    h f6510f;

    /* renamed from: g, reason: collision with root package name */
    private CharSequence f6511g;

    /* renamed from: h, reason: collision with root package name */
    private Drawable f6512h;

    /* renamed from: i, reason: collision with root package name */
    e.b f6513i;

    /* renamed from: j, reason: collision with root package name */
    private Z f6514j;

    /* renamed from: k, reason: collision with root package name */
    b f6515k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6516l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6517m;

    /* renamed from: n, reason: collision with root package name */
    private int f6518n;

    /* renamed from: o, reason: collision with root package name */
    private int f6519o;

    /* renamed from: p, reason: collision with root package name */
    private int f6520p;

    private class a extends Z {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.Z
        public m.e getPopup() {
            b bVar = ActionMenuItemView.this.f6515k;
            if (bVar != null) {
                return bVar.getPopup();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.Z
        protected boolean onForwardingStarted() {
            m.e popup;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f6513i;
            return bVar != null && bVar.invokeItem(actionMenuItemView.f6510f) && (popup = getPopup()) != null && popup.isShowing();
        }
    }

    public static abstract class b {
        public abstract m.e getPopup();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    private boolean b() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        return i8 >= 480 || (i8 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void c() {
        boolean z8 = true;
        boolean z9 = !TextUtils.isEmpty(this.f6511g);
        if (this.f6512h != null && (!this.f6510f.showsTextAsAction() || (!this.f6516l && !this.f6517m))) {
            z8 = false;
        }
        boolean z10 = z9 & z8;
        setText(z10 ? this.f6511g : null);
        CharSequence contentDescription = this.f6510f.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z10 ? null : this.f6510f.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f6510f.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            u0.setTooltipText(this, z10 ? null : this.f6510f.getTitle());
        } else {
            u0.setTooltipText(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.view.menu.l.a
    public h getItemData() {
        return this.f6510f;
    }

    public boolean hasText() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.l.a
    public void initialize(h hVar, int i8) {
        this.f6510f = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.e(this));
        setId(hVar.getItemId());
        setVisibility(hVar.isVisible() ? 0 : 8);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.f6514j == null) {
            this.f6514j = new a();
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean needsDividerAfter() {
        return hasText();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean needsDividerBefore() {
        return hasText() && this.f6510f.getIcon() == null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f6513i;
        if (bVar != null) {
            bVar.invokeItem(this.f6510f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f6516l = b();
        c();
    }

    @Override // androidx.appcompat.widget.J, android.widget.TextView, android.view.View
    protected void onMeasure(int i8, int i9) {
        int i10;
        boolean zHasText = hasText();
        if (zHasText && (i10 = this.f6519o) >= 0) {
            super.setPadding(i10, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i8, i9);
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f6518n) : this.f6518n;
        if (mode != 1073741824 && this.f6518n > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i9);
        }
        if (zHasText || this.f6512h == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f6512h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Z z8;
        if (this.f6510f.hasSubMenu() && (z8 = this.f6514j) != null && z8.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.l.a
    public boolean prefersCondensedTitle() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.l.a
    public void setCheckable(boolean z8) {
    }

    @Override // androidx.appcompat.view.menu.l.a
    public void setChecked(boolean z8) {
    }

    public void setExpandedFormat(boolean z8) {
        if (this.f6517m != z8) {
            this.f6517m = z8;
            h hVar = this.f6510f;
            if (hVar != null) {
                hVar.actionFormatChanged();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.l.a
    public void setIcon(Drawable drawable) {
        this.f6512h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i8 = this.f6520p;
            if (intrinsicWidth > i8) {
                intrinsicHeight = (int) (intrinsicHeight * (i8 / intrinsicWidth));
                intrinsicWidth = i8;
            }
            if (intrinsicHeight > i8) {
                intrinsicWidth = (int) (intrinsicWidth * (i8 / intrinsicHeight));
            } else {
                i8 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i8);
        }
        setCompoundDrawables(drawable, null, null, null);
        c();
    }

    public void setItemInvoker(e.b bVar) {
        this.f6513i = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i8, int i9, int i10, int i11) {
        this.f6519o = i8;
        super.setPadding(i8, i9, i10, i11);
    }

    public void setPopupCallback(b bVar) {
        this.f6515k = bVar;
    }

    @Override // androidx.appcompat.view.menu.l.a
    public void setShortcut(boolean z8, char c9) {
    }

    @Override // androidx.appcompat.view.menu.l.a
    public void setTitle(CharSequence charSequence) {
        this.f6511g = charSequence;
        c();
    }

    @Override // androidx.appcompat.view.menu.l.a
    public boolean showsIcon() {
        return true;
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        Resources resources = context.getResources();
        this.f6516l = b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5572j.ActionMenuItemView, i8, 0);
        this.f6518n = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5572j.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f6520p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f6519o = -1;
        setSaveEnabled(false);
    }
}
