package K2;

import android.util.Property;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class d extends Property {
    public static final Property<ViewGroup, Float> CHILDREN_ALPHA = new d("childrenAlpha");

    private d(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    public Float get(ViewGroup viewGroup) {
        Float f8 = (Float) viewGroup.getTag(J2.f.mtrl_internal_children_alpha_tag);
        return f8 != null ? f8 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public void set(ViewGroup viewGroup, Float f8) {
        float fFloatValue = f8.floatValue();
        viewGroup.setTag(J2.f.mtrl_internal_children_alpha_tag, f8);
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            viewGroup.getChildAt(i8).setAlpha(fFloatValue);
        }
    }
}
