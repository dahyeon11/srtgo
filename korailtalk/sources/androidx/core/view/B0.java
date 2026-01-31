package androidx.core.view;

import android.view.ViewStructure;

/* loaded from: classes.dex */
public class B0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f9080a;

    private static class a {
        static void a(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        static void b(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void c(ViewStructure viewStructure, int i8, int i9, int i10, int i11, int i12, int i13) {
            viewStructure.setDimens(i8, i9, i10, i11, i12, i13);
        }

        static void d(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }
    }

    private B0(ViewStructure viewStructure) {
        this.f9080a = viewStructure;
    }

    public static B0 toViewStructureCompat(ViewStructure viewStructure) {
        return new B0(viewStructure);
    }

    public void setClassName(String str) {
        a.a((ViewStructure) this.f9080a, str);
    }

    public void setContentDescription(CharSequence charSequence) {
        a.b((ViewStructure) this.f9080a, charSequence);
    }

    public void setDimens(int i8, int i9, int i10, int i11, int i12, int i13) {
        a.c((ViewStructure) this.f9080a, i8, i9, i10, i11, i12, i13);
    }

    public void setText(CharSequence charSequence) {
        a.d((ViewStructure) this.f9080a, charSequence);
    }

    public ViewStructure toViewStructure() {
        return (ViewStructure) this.f9080a;
    }
}
