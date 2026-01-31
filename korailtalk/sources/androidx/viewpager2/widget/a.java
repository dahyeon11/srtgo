package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f10971b;

    /* renamed from: a, reason: collision with root package name */
    private LinearLayoutManager f10972a;

    /* renamed from: androidx.viewpager2.widget.a$a, reason: collision with other inner class name */
    class C0173a implements Comparator {
        C0173a() {
        }

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f10971b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    a(LinearLayoutManager linearLayoutManager) {
        this.f10972a = linearLayoutManager;
    }

    private boolean a() {
        int top;
        int i8;
        int bottom;
        int i9;
        int childCount = this.f10972a.getChildCount();
        if (childCount == 0) {
            return true;
        }
        boolean z8 = this.f10972a.getOrientation() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount, 2);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f10972a.getChildAt(i10);
            if (childAt == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f10971b;
            int[] iArr2 = iArr[i10];
            if (z8) {
                top = childAt.getLeft();
                i8 = marginLayoutParams.leftMargin;
            } else {
                top = childAt.getTop();
                i8 = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i8;
            int[] iArr3 = iArr[i10];
            if (z8) {
                bottom = childAt.getRight();
                i9 = marginLayoutParams.rightMargin;
            } else {
                bottom = childAt.getBottom();
                i9 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i9;
        }
        Arrays.sort(iArr, new C0173a());
        for (int i11 = 1; i11 < childCount; i11++) {
            if (iArr[i11 - 1][1] != iArr[i11][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i12 = iArr4[1];
        int i13 = iArr4[0];
        return i13 <= 0 && iArr[childCount - 1][1] >= i12 - i13;
    }

    private boolean b() {
        int childCount = this.f10972a.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            if (c(this.f10972a.getChildAt(i8))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                if (c(viewGroup.getChildAt(i8))) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean d() {
        return (!a() || this.f10972a.getChildCount() <= 1) && b();
    }
}
