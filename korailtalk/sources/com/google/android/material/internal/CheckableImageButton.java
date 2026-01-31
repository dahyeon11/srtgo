package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.C0853m;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0923a;
import androidx.core.view.accessibility.H;
import c0.AbstractC1087a;
import h.AbstractC5563a;

/* loaded from: classes2.dex */
public class CheckableImageButton extends C0853m implements Checkable {

    /* renamed from: f */
    private static final int[] f24913f = {R.attr.state_checked};

    /* renamed from: c */
    private boolean f24914c;

    /* renamed from: d */
    private boolean f24915d;

    /* renamed from: e */
    private boolean f24916e;

    class a extends C0923a {
        a() {
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, H h8) {
            super.onInitializeAccessibilityNodeInfo(view, h8);
            h8.setCheckable(CheckableImageButton.this.isCheckable());
            h8.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends AbstractC1087a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: b */
        boolean f24918b;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public b[] newArray(int i8) {
                return new b[i8];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f24918b = parcel.readInt() == 1;
        }

        @Override // c0.AbstractC1087a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f24918b ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public boolean isCheckable() {
        return this.f24915d;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f24914c;
    }

    public boolean isPressable() {
        return this.f24916e;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i8) {
        if (!this.f24914c) {
            return super.onCreateDrawableState(i8);
        }
        int[] iArr = f24913f;
        return View.mergeDrawableStates(super.onCreateDrawableState(i8 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setChecked(bVar.f24918b);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f24918b = this.f24914c;
        return bVar;
    }

    public void setCheckable(boolean z8) {
        if (this.f24915d != z8) {
            this.f24915d = z8;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        if (!this.f24915d || this.f24914c == z8) {
            return;
        }
        this.f24914c = z8;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z8) {
        this.f24916e = z8;
    }

    @Override // android.view.View
    public void setPressed(boolean z8) {
        if (this.f24916e) {
            super.setPressed(z8);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f24914c);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5563a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f24915d = true;
        this.f24916e = true;
        AbstractC0985p0.setAccessibilityDelegate(this, new a());
    }
}
