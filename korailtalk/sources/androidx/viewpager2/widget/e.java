package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.g;
import java.util.Locale;

/* loaded from: classes.dex */
final class e extends RecyclerView.u {

    /* renamed from: a */
    private g.i f10984a;

    /* renamed from: b */
    private final g f10985b;

    /* renamed from: c */
    private final RecyclerView f10986c;

    /* renamed from: d */
    private final LinearLayoutManager f10987d;

    /* renamed from: e */
    private int f10988e;

    /* renamed from: f */
    private int f10989f;

    /* renamed from: g */
    private a f10990g;

    /* renamed from: h */
    private int f10991h;

    /* renamed from: i */
    private int f10992i;

    /* renamed from: j */
    private boolean f10993j;

    /* renamed from: k */
    private boolean f10994k;

    /* renamed from: l */
    private boolean f10995l;

    /* renamed from: m */
    private boolean f10996m;

    private static final class a {

        /* renamed from: a */
        int f10997a;

        /* renamed from: b */
        float f10998b;

        /* renamed from: c */
        int f10999c;

        a() {
        }

        void a() {
            this.f10997a = -1;
            this.f10998b = 0.0f;
            this.f10999c = 0;
        }
    }

    e(g gVar) {
        this.f10985b = gVar;
        RecyclerView recyclerView = gVar.f11010j;
        this.f10986c = recyclerView;
        this.f10987d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f10990g = new a();
        o();
    }

    private void a(int i8, float f8, int i9) {
        g.i iVar = this.f10984a;
        if (iVar != null) {
            iVar.onPageScrolled(i8, f8, i9);
        }
    }

    private void b(int i8) {
        g.i iVar = this.f10984a;
        if (iVar != null) {
            iVar.onPageSelected(i8);
        }
    }

    private void c(int i8) {
        if ((this.f10988e == 3 && this.f10989f == 0) || this.f10989f == i8) {
            return;
        }
        this.f10989f = i8;
        g.i iVar = this.f10984a;
        if (iVar != null) {
            iVar.onPageScrollStateChanged(i8);
        }
    }

    private int d() {
        return this.f10987d.findFirstVisibleItemPosition();
    }

    private boolean j() {
        int i8 = this.f10988e;
        return i8 == 1 || i8 == 4;
    }

    private void o() {
        this.f10988e = 0;
        this.f10989f = 0;
        this.f10990g.a();
        this.f10991h = -1;
        this.f10992i = -1;
        this.f10993j = false;
        this.f10994k = false;
        this.f10996m = false;
        this.f10995l = false;
    }

    private void q(boolean z8) {
        this.f10996m = z8;
        this.f10988e = z8 ? 4 : 1;
        int i8 = this.f10992i;
        if (i8 != -1) {
            this.f10991h = i8;
            this.f10992i = -1;
        } else if (this.f10991h == -1) {
            this.f10991h = d();
        }
        c(1);
    }

    private void r() {
        int top;
        a aVar = this.f10990g;
        int iFindFirstVisibleItemPosition = this.f10987d.findFirstVisibleItemPosition();
        aVar.f10997a = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            aVar.a();
            return;
        }
        View viewFindViewByPosition = this.f10987d.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            aVar.a();
            return;
        }
        int leftDecorationWidth = this.f10987d.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = this.f10987d.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = this.f10987d.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = this.f10987d.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.f10987d.getOrientation() == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - this.f10986c.getPaddingLeft();
            if (this.f10985b.c()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - this.f10986c.getPaddingTop();
        }
        int i8 = -top;
        aVar.f10999c = i8;
        if (i8 >= 0) {
            aVar.f10998b = height == 0 ? 0.0f : i8 / height;
        } else {
            if (!new androidx.viewpager2.widget.a(this.f10987d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f10999c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    double e() {
        r();
        a aVar = this.f10990g;
        return aVar.f10997a + aVar.f10998b;
    }

    int f() {
        return this.f10989f;
    }

    boolean g() {
        return this.f10989f == 1;
    }

    boolean h() {
        return this.f10996m;
    }

    boolean i() {
        return this.f10989f == 0;
    }

    void k() {
        this.f10988e = 4;
        q(true);
    }

    void l() {
        this.f10995l = true;
    }

    void m() {
        if (!g() || this.f10996m) {
            this.f10996m = false;
            r();
            a aVar = this.f10990g;
            if (aVar.f10999c != 0) {
                c(2);
                return;
            }
            int i8 = aVar.f10997a;
            if (i8 != this.f10991h) {
                b(i8);
            }
            c(0);
            o();
        }
    }

    void n(int i8, boolean z8) {
        this.f10988e = z8 ? 2 : 3;
        this.f10996m = false;
        boolean z9 = this.f10992i != i8;
        this.f10992i = i8;
        c(2);
        if (z9) {
            b(i8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
        if (!(this.f10988e == 1 && this.f10989f == 1) && i8 == 1) {
            q(false);
            return;
        }
        if (j() && i8 == 2) {
            if (this.f10994k) {
                c(2);
                this.f10993j = true;
                return;
            }
            return;
        }
        if (j() && i8 == 0) {
            r();
            if (this.f10994k) {
                a aVar = this.f10990g;
                if (aVar.f10999c == 0) {
                    int i9 = this.f10991h;
                    int i10 = aVar.f10997a;
                    if (i9 != i10) {
                        b(i10);
                    }
                }
            } else {
                int i11 = this.f10990g.f10997a;
                if (i11 != -1) {
                    a(i11, 0.0f, 0);
                }
            }
            c(0);
            o();
        }
        if (this.f10988e == 2 && i8 == 0 && this.f10995l) {
            r();
            a aVar2 = this.f10990g;
            if (aVar2.f10999c == 0) {
                int i12 = this.f10992i;
                int i13 = aVar2.f10997a;
                if (i12 != i13) {
                    if (i13 == -1) {
                        i13 = 0;
                    }
                    b(i13);
                }
                c(0);
                o();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f10994k = r4
            r3.r()
            boolean r0 = r3.f10993j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L37
            r3.f10993j = r2
            if (r6 > 0) goto L1f
            if (r6 != 0) goto L29
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            androidx.viewpager2.widget.g r6 = r3.f10985b
            boolean r6 = r6.c()
            if (r5 != r6) goto L29
        L1f:
            androidx.viewpager2.widget.e$a r5 = r3.f10990g
            int r6 = r5.f10999c
            if (r6 == 0) goto L29
            int r5 = r5.f10997a
            int r5 = r5 + r4
            goto L2d
        L29:
            androidx.viewpager2.widget.e$a r5 = r3.f10990g
            int r5 = r5.f10997a
        L2d:
            r3.f10992i = r5
            int r6 = r3.f10991h
            if (r6 == r5) goto L45
            r3.b(r5)
            goto L45
        L37:
            int r5 = r3.f10988e
            if (r5 != 0) goto L45
            androidx.viewpager2.widget.e$a r5 = r3.f10990g
            int r5 = r5.f10997a
            if (r5 != r1) goto L42
            r5 = r2
        L42:
            r3.b(r5)
        L45:
            androidx.viewpager2.widget.e$a r5 = r3.f10990g
            int r6 = r5.f10997a
            if (r6 != r1) goto L4c
            r6 = r2
        L4c:
            float r0 = r5.f10998b
            int r5 = r5.f10999c
            r3.a(r6, r0, r5)
            androidx.viewpager2.widget.e$a r5 = r3.f10990g
            int r6 = r5.f10997a
            int r0 = r3.f10992i
            if (r6 == r0) goto L5d
            if (r0 != r1) goto L6b
        L5d:
            int r5 = r5.f10999c
            if (r5 != 0) goto L6b
            int r5 = r3.f10989f
            if (r5 == r4) goto L6b
            r3.c(r2)
            r3.o()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.e.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    void p(g.i iVar) {
        this.f10984a = iVar;
    }
}
