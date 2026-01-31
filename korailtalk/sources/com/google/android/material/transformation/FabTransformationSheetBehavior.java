package com.google.android.material.transformation;

import J2.a;
import K2.h;
import K2.j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC0985p0;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i, reason: collision with root package name */
    private Map f25472i;

    public FabTransformationSheetBehavior() {
    }

    private void C(View view, boolean z8) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z8) {
                this.f25472i = new HashMap(childCount);
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = coordinatorLayout.getChildAt(i8);
                boolean z9 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).getBehavior() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z9) {
                    if (z8) {
                        this.f25472i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        AbstractC0985p0.setImportantForAccessibility(childAt, 4);
                    } else {
                        Map map = this.f25472i;
                        if (map != null && map.containsKey(childAt)) {
                            AbstractC0985p0.setImportantForAccessibility(childAt, ((Integer) this.f25472i.get(childAt)).intValue());
                        }
                    }
                }
            }
            if (z8) {
                return;
            }
            this.f25472i = null;
        }
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected FabTransformationBehavior.e A(Context context, boolean z8) {
        int i8 = z8 ? a.mtrl_fab_transformation_sheet_expand_spec : a.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.timings = h.createFromResource(context, i8);
        eVar.positioning = new j(17, 0.0f, 0.0f);
        return eVar;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    protected boolean d(View view, View view2, boolean z8, boolean z9) {
        C(view2, z8);
        return super.d(view, view2, z8, z9);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
