package com.google.android.material.button;

import J2.k;
import J2.l;
import a3.C0833a;
import a3.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0923a;
import androidx.core.view.F;
import androidx.core.view.accessibility.H;
import c3.AbstractC1090a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.o;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    private static final String f24481k = "MaterialButtonToggleGroup";

    /* renamed from: l, reason: collision with root package name */
    private static final int f24482l = k.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: a, reason: collision with root package name */
    private final List f24483a;

    /* renamed from: b, reason: collision with root package name */
    private final c f24484b;

    /* renamed from: c, reason: collision with root package name */
    private final f f24485c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashSet f24486d;

    /* renamed from: e, reason: collision with root package name */
    private final Comparator f24487e;

    /* renamed from: f, reason: collision with root package name */
    private Integer[] f24488f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f24489g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f24490h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f24491i;

    /* renamed from: j, reason: collision with root package name */
    private int f24492j;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class b extends C0923a {
        b() {
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, H h8) {
            super.onInitializeAccessibilityNodeInfo(view, h8);
            h8.setCollectionItemInfo(H.f.obtain(0, 1, MaterialButtonToggleGroup.this.l(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private class c implements MaterialButton.a {
        private c() {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void onCheckedChanged(MaterialButton materialButton, boolean z8) {
            if (MaterialButtonToggleGroup.this.f24489g) {
                return;
            }
            if (MaterialButtonToggleGroup.this.f24490h) {
                MaterialButtonToggleGroup.this.f24492j = z8 ? materialButton.getId() : -1;
            }
            if (MaterialButtonToggleGroup.this.r(materialButton.getId(), z8)) {
                MaterialButtonToggleGroup.this.j(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ c(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    private static class d {

        /* renamed from: e, reason: collision with root package name */
        private static final a3.c f24496e = new C0833a(0.0f);

        /* renamed from: a, reason: collision with root package name */
        a3.c f24497a;

        /* renamed from: b, reason: collision with root package name */
        a3.c f24498b;

        /* renamed from: c, reason: collision with root package name */
        a3.c f24499c;

        /* renamed from: d, reason: collision with root package name */
        a3.c f24500d;

        d(a3.c cVar, a3.c cVar2, a3.c cVar3, a3.c cVar4) {
            this.f24497a = cVar;
            this.f24498b = cVar3;
            this.f24499c = cVar4;
            this.f24500d = cVar2;
        }

        public static d bottom(d dVar) {
            a3.c cVar = f24496e;
            return new d(cVar, dVar.f24500d, cVar, dVar.f24499c);
        }

        public static d end(d dVar, View view) {
            return o.isLayoutRtl(view) ? left(dVar) : right(dVar);
        }

        public static d left(d dVar) {
            a3.c cVar = dVar.f24497a;
            a3.c cVar2 = dVar.f24500d;
            a3.c cVar3 = f24496e;
            return new d(cVar, cVar2, cVar3, cVar3);
        }

        public static d right(d dVar) {
            a3.c cVar = f24496e;
            return new d(cVar, cVar, dVar.f24498b, dVar.f24499c);
        }

        public static d start(d dVar, View view) {
            return o.isLayoutRtl(view) ? right(dVar) : left(dVar);
        }

        public static d top(d dVar) {
            a3.c cVar = dVar.f24497a;
            a3.c cVar2 = f24496e;
            return new d(cVar, cVar2, dVar.f24498b, cVar2);
        }
    }

    public interface e {
        void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i8, boolean z8);
    }

    private class f implements MaterialButton.b {
        private f() {
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void onPressedChanged(MaterialButton materialButton, boolean z8) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ f(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    private void g() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i8 = firstVisibleChildIndex + 1; i8 < getChildCount(); i8++) {
            MaterialButton materialButtonK = k(i8);
            int iMin = Math.min(materialButtonK.getStrokeWidth(), k(i8 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsH = h(materialButtonK);
            if (getOrientation() == 0) {
                F.setMarginEnd(layoutParamsH, 0);
                F.setMarginStart(layoutParamsH, -iMin);
                layoutParamsH.topMargin = 0;
            } else {
                layoutParamsH.bottomMargin = 0;
                layoutParamsH.topMargin = -iMin;
                F.setMarginStart(layoutParamsH, 0);
            }
            materialButtonK.setLayoutParams(layoutParamsH);
        }
        o(firstVisibleChildIndex);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            if (n(i8)) {
                return i8;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (n(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            if ((getChildAt(i9) instanceof MaterialButton) && n(i9)) {
                i8++;
            }
        }
        return i8;
    }

    private LinearLayout.LayoutParams h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void i(int i8) {
        p(i8, true);
        r(i8, true);
        setCheckedId(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i8, boolean z8) {
        Iterator it = this.f24486d.iterator();
        while (it.hasNext()) {
            ((e) it.next()).onButtonChecked(this, i8, z8);
        }
    }

    private MaterialButton k(int i8) {
        return (MaterialButton) getChildAt(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int l(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            if (getChildAt(i9) == view) {
                return i8;
            }
            if ((getChildAt(i9) instanceof MaterialButton) && n(i9)) {
                i8++;
            }
        }
        return -1;
    }

    private d m(int i8, int i9, int i10) {
        d dVar = (d) this.f24483a.get(i8);
        if (i9 == i10) {
            return dVar;
        }
        boolean z8 = getOrientation() == 0;
        if (i8 == i9) {
            return z8 ? d.start(dVar, this) : d.top(dVar);
        }
        if (i8 == i10) {
            return z8 ? d.end(dVar, this) : d.bottom(dVar);
        }
        return null;
    }

    private boolean n(int i8) {
        return getChildAt(i8).getVisibility() != 8;
    }

    private void o(int i8) {
        if (getChildCount() == 0 || i8 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) k(i8).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            F.setMarginEnd(layoutParams, 0);
            F.setMarginStart(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void p(int i8, boolean z8) {
        View viewFindViewById = findViewById(i8);
        if (viewFindViewById instanceof MaterialButton) {
            this.f24489g = true;
            ((MaterialButton) viewFindViewById).setChecked(z8);
            this.f24489g = false;
        }
    }

    private static void q(k.b bVar, d dVar) {
        if (dVar == null) {
            bVar.setAllCornerSizes(0.0f);
        } else {
            bVar.setTopLeftCornerSize(dVar.f24497a).setBottomLeftCornerSize(dVar.f24500d).setTopRightCornerSize(dVar.f24498b).setBottomRightCornerSize(dVar.f24499c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(int i8, boolean z8) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.f24491i && checkedButtonIds.isEmpty()) {
            p(i8, true);
            this.f24492j = i8;
            return false;
        }
        if (z8 && this.f24490h) {
            checkedButtonIds.remove(Integer.valueOf(i8));
            Iterator<Integer> it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                p(iIntValue, false);
                j(iIntValue, false);
            }
        }
        return true;
    }

    private void s() {
        TreeMap treeMap = new TreeMap(this.f24487e);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            treeMap.put(k(i8), Integer.valueOf(i8));
        }
        this.f24488f = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setCheckedId(int i8) {
        this.f24492j = i8;
        j(i8, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(AbstractC0985p0.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.addOnCheckedChangeListener(this.f24484b);
        materialButton.setOnPressedChangeListenerInternal(this.f24485c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public void addOnButtonCheckedListener(e eVar) {
        this.f24486d.add(eVar);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f24481k, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i8, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            r(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        a3.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f24483a.add(new d(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel.getBottomRightCornerSize()));
        AbstractC0985p0.setAccessibilityDelegate(materialButton, new b());
    }

    public void check(int i8) {
        if (i8 == this.f24492j) {
            return;
        }
        i(i8);
    }

    public void clearChecked() {
        this.f24489g = true;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            MaterialButton materialButtonK = k(i8);
            materialButtonK.setChecked(false);
            j(materialButtonK.getId(), false);
        }
        this.f24489g = false;
        setCheckedId(-1);
    }

    public void clearOnButtonCheckedListeners() {
        this.f24486d.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        s();
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f24490h) {
            return this.f24492j;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            MaterialButton materialButtonK = k(i8);
            if (materialButtonK.isChecked()) {
                arrayList.add(Integer.valueOf(materialButtonK.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i8, int i9) {
        Integer[] numArr = this.f24488f;
        if (numArr != null && i9 < numArr.length) {
            return numArr[i9].intValue();
        }
        Log.w(f24481k, "Child order wasn't updated");
        return i9;
    }

    public boolean isSelectionRequired() {
        return this.f24491i;
    }

    public boolean isSingleSelection() {
        return this.f24490h;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i8 = this.f24492j;
        if (i8 != -1) {
            i(i8);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        H.wrap(accessibilityNodeInfo).setCollectionInfo(H.e.obtain(1, getVisibleButtonCount(), false, isSingleSelection() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        t();
        g();
        super.onMeasure(i8, i9);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.removeOnCheckedChangeListener(this.f24484b);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f24483a.remove(iIndexOfChild);
        }
        t();
        g();
    }

    public void removeOnButtonCheckedListener(e eVar) {
        this.f24486d.remove(eVar);
    }

    public void setSelectionRequired(boolean z8) {
        this.f24491i = z8;
    }

    public void setSingleSelection(boolean z8) {
        if (this.f24490h != z8) {
            this.f24490h = z8;
            clearChecked();
        }
    }

    void t() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i8 = 0; i8 < childCount; i8++) {
            MaterialButton materialButtonK = k(i8);
            if (materialButtonK.getVisibility() != 8) {
                k.b builder = materialButtonK.getShapeAppearanceModel().toBuilder();
                q(builder, m(i8, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonK.setShapeAppearanceModel(builder.build());
            }
        }
    }

    public void uncheck(int i8) {
        p(i8, false);
        r(i8, false);
        this.f24492j = -1;
        j(i8, false);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, J2.b.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f24482l;
        super(AbstractC1090a.wrap(context, attributeSet, i8, i9), attributeSet, i8);
        this.f24483a = new ArrayList();
        a aVar = null;
        this.f24484b = new c(this, aVar);
        this.f24485c = new f(this, aVar);
        this.f24486d = new LinkedHashSet();
        this.f24487e = new a();
        this.f24489g = false;
        TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.k.obtainStyledAttributes(getContext(), attributeSet, l.MaterialButtonToggleGroup, i8, i9, new int[0]);
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(l.MaterialButtonToggleGroup_singleSelection, false));
        this.f24492j = typedArrayObtainStyledAttributes.getResourceId(l.MaterialButtonToggleGroup_checkedButton, -1);
        this.f24491i = typedArrayObtainStyledAttributes.getBoolean(l.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayObtainStyledAttributes.recycle();
        AbstractC0985p0.setImportantForAccessibility(this, 1);
    }

    public void setSingleSelection(int i8) {
        setSingleSelection(getResources().getBoolean(i8));
    }
}
