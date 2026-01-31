package com.google.android.material.chip;

import J2.k;
import J2.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.accessibility.H;
import c3.AbstractC1090a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ChipGroup extends com.google.android.material.internal.c {

    /* renamed from: m */
    private static final int f24575m = k.Widget_MaterialComponents_ChipGroup;

    /* renamed from: e */
    private int f24576e;

    /* renamed from: f */
    private int f24577f;

    /* renamed from: g */
    private boolean f24578g;

    /* renamed from: h */
    private boolean f24579h;

    /* renamed from: i */
    private final b f24580i;

    /* renamed from: j */
    private e f24581j;

    /* renamed from: k */
    private int f24582k;

    /* renamed from: l */
    private boolean f24583l;

    private class b implements CompoundButton.OnCheckedChangeListener {
        private b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
            if (ChipGroup.this.f24583l) {
                return;
            }
            if (ChipGroup.this.getCheckedChipIds().isEmpty() && ChipGroup.this.f24579h) {
                ChipGroup.this.m(compoundButton.getId(), true);
                ChipGroup.this.l(compoundButton.getId(), false);
                return;
            }
            int id = compoundButton.getId();
            if (!z8) {
                if (ChipGroup.this.f24582k == id) {
                    ChipGroup.this.setCheckedId(-1);
                }
            } else {
                if (ChipGroup.this.f24582k != -1 && ChipGroup.this.f24582k != id && ChipGroup.this.f24578g) {
                    ChipGroup chipGroup = ChipGroup.this;
                    chipGroup.m(chipGroup.f24582k, false);
                }
                ChipGroup.this.setCheckedId(id);
            }
        }

        /* synthetic */ b(ChipGroup chipGroup, a aVar) {
            this();
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i8, int i9) {
            super(i8, i9);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public interface d {
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a */
        private ViewGroup.OnHierarchyChangeListener f24585a;

        private e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(AbstractC0985p0.generateViewId());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).check(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.f24580i);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24585a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24585a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        /* synthetic */ e(ChipGroup chipGroup, a aVar) {
            this();
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getChipCount() {
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            if (getChildAt(i9) instanceof Chip) {
                i8++;
            }
        }
        return i8;
    }

    public void l(int i8, boolean z8) {
        this.f24582k = i8;
    }

    public void m(int i8, boolean z8) {
        View viewFindViewById = findViewById(i8);
        if (viewFindViewById instanceof Chip) {
            this.f24583l = true;
            ((Chip) viewFindViewById).setChecked(z8);
            this.f24583l = false;
        }
    }

    public void setCheckedId(int i8) {
        l(i8, true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i9 = this.f24582k;
                if (i9 != -1 && this.f24578g) {
                    m(i9, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i8, layoutParams);
    }

    public void check(int i8) {
        int i9 = this.f24582k;
        if (i8 == i9) {
            return;
        }
        if (i9 != -1 && this.f24578g) {
            m(i9, false);
        }
        if (i8 != -1) {
            m(i8, true);
        }
        setCheckedId(i8);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    public void clearCheck() {
        this.f24583l = true;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f24583l = false;
        setCheckedId(-1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f24578g) {
            return this.f24582k;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f24578g) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f24576e;
    }

    public int getChipSpacingVertical() {
        return this.f24577f;
    }

    public boolean isSelectionRequired() {
        return this.f24579h;
    }

    @Override // com.google.android.material.internal.c
    public boolean isSingleLine() {
        return super.isSingleLine();
    }

    public boolean isSingleSelection() {
        return this.f24578g;
    }

    int k(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            if (getChildAt(i9) instanceof Chip) {
                if (((Chip) getChildAt(i9)) == view) {
                    return i8;
                }
                i8++;
            }
        }
        return -1;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i8 = this.f24582k;
        if (i8 != -1) {
            m(i8, true);
            setCheckedId(this.f24582k);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        H.wrap(accessibilityNodeInfo).setCollectionInfo(H.e.obtain(getRowCount(), isSingleLine() ? getChipCount() : -1, false, isSingleSelection() ? 1 : 2));
    }

    public void setChipSpacing(int i8) {
        setChipSpacingHorizontal(i8);
        setChipSpacingVertical(i8);
    }

    public void setChipSpacingHorizontal(int i8) {
        if (this.f24576e != i8) {
            this.f24576e = i8;
            setItemSpacing(i8);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i8) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i8));
    }

    public void setChipSpacingResource(int i8) {
        setChipSpacing(getResources().getDimensionPixelOffset(i8));
    }

    public void setChipSpacingVertical(int i8) {
        if (this.f24577f != i8) {
            this.f24577f = i8;
            setLineSpacing(i8);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i8) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i8));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i8) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(d dVar) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f24581j.f24585a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z8) {
        this.f24579h = z8;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i8) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i8) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.c
    public void setSingleLine(boolean z8) {
        super.setSingleLine(z8);
    }

    public void setSingleSelection(boolean z8) {
        if (this.f24578g != z8) {
            this.f24578g = z8;
            clearCheck();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, J2.b.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(int i8) {
        setSingleLine(getResources().getBoolean(i8));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f24575m;
        super(AbstractC1090a.wrap(context, attributeSet, i8, i9), attributeSet, i8);
        this.f24580i = new b();
        this.f24581j = new e();
        this.f24582k = -1;
        this.f24583l = false;
        TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.k.obtainStyledAttributes(getContext(), attributeSet, l.ChipGroup, i8, i9, new int[0]);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(l.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(l.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayObtainStyledAttributes.getDimensionPixelOffset(l.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(typedArrayObtainStyledAttributes.getBoolean(l.ChipGroup_singleLine, false));
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(l.ChipGroup_singleSelection, false));
        setSelectionRequired(typedArrayObtainStyledAttributes.getBoolean(l.ChipGroup_selectionRequired, false));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.f24582k = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        super.setOnHierarchyChangeListener(this.f24581j);
        AbstractC0985p0.setImportantForAccessibility(this, 1);
    }

    public void setSingleSelection(int i8) {
        setSingleSelection(getResources().getBoolean(i8));
    }
}
