package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
class k implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    final FragmentManager f9735a;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f9736a;

        a(v vVar) {
            this.f9736a = vVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.f9736a.k();
            this.f9736a.m();
            D.m((ViewGroup) fragmentK.f9464H.getParent(), k.this.f9735a).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    k(FragmentManager fragmentManager) {
        this.f9735a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        v vVarT;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f9735a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.c.Fragment);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(f0.c.Fragment_android_name);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(f0.c.Fragment_android_id, -1);
        String string = typedArrayObtainStyledAttributes.getString(f0.c.Fragment_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !i.a(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentFindFragmentById = resourceId != -1 ? this.f9735a.findFragmentById(resourceId) : null;
        if (fragmentFindFragmentById == null && string != null) {
            fragmentFindFragmentById = this.f9735a.findFragmentByTag(string);
        }
        if (fragmentFindFragmentById == null && id != -1) {
            fragmentFindFragmentById = this.f9735a.findFragmentById(id);
        }
        if (fragmentFindFragmentById == null) {
            fragmentFindFragmentById = this.f9735a.getFragmentFactory().instantiate(context.getClassLoader(), attributeValue);
            fragmentFindFragmentById.f9496n = true;
            fragmentFindFragmentById.f9505w = resourceId != 0 ? resourceId : id;
            fragmentFindFragmentById.f9506x = id;
            fragmentFindFragmentById.f9507y = string;
            fragmentFindFragmentById.f9497o = true;
            FragmentManager fragmentManager = this.f9735a;
            fragmentFindFragmentById.f9501s = fragmentManager;
            fragmentFindFragmentById.f9502t = fragmentManager.n0();
            fragmentFindFragmentById.onInflate(this.f9735a.n0().b(), attributeSet, fragmentFindFragmentById.f9484b);
            vVarT = this.f9735a.g(fragmentFindFragmentById);
            if (FragmentManager.x0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(fragmentFindFragmentById);
                sb.append(" has been inflated via the <fragment> tag: id=0x");
                sb.append(Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentFindFragmentById.f9497o) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentFindFragmentById.f9497o = true;
            FragmentManager fragmentManager2 = this.f9735a;
            fragmentFindFragmentById.f9501s = fragmentManager2;
            fragmentFindFragmentById.f9502t = fragmentManager2.n0();
            fragmentFindFragmentById.onInflate(this.f9735a.n0().b(), attributeSet, fragmentFindFragmentById.f9484b);
            vVarT = this.f9735a.t(fragmentFindFragmentById);
            if (FragmentManager.x0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Retained Fragment ");
                sb2.append(fragmentFindFragmentById);
                sb2.append(" has been re-attached via the <fragment> tag: id=0x");
                sb2.append(Integer.toHexString(resourceId));
            }
        }
        fragmentFindFragmentById.f9463G = (ViewGroup) view;
        vVarT.m();
        vVarT.j();
        View view2 = fragmentFindFragmentById.f9464H;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentFindFragmentById.f9464H.getTag() == null) {
            fragmentFindFragmentById.f9464H.setTag(string);
        }
        fragmentFindFragmentById.f9464H.addOnAttachStateChangeListener(new a(vVarT));
        return fragmentFindFragmentById.f9464H;
    }
}
