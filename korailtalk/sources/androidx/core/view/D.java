package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes.dex */
public abstract class D {

    static class a implements LayoutInflater.Factory2 {
        a(E e8) {
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            throw null;
        }

        public String toString() {
            return getClass().getName() + "{" + ((Object) null) + "}";
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            throw null;
        }
    }

    @Deprecated
    public static E getFactory(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof a) {
            ((a) factory).getClass();
        }
        return null;
    }

    @Deprecated
    public static void setFactory(LayoutInflater layoutInflater, E e8) {
        layoutInflater.setFactory2(new a(e8));
    }

    public static void setFactory2(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
