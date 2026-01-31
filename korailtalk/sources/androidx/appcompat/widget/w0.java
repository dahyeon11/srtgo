package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import h.AbstractC5566d;
import h.AbstractC5568f;
import h.AbstractC5569g;
import h.AbstractC5571i;

/* loaded from: classes.dex */
class w0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7274a;

    /* renamed from: b, reason: collision with root package name */
    private final View f7275b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f7276c;

    /* renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f7277d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f7278e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f7279f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f7280g;

    w0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f7277d = layoutParams;
        this.f7278e = new Rect();
        this.f7279f = new int[2];
        this.f7280g = new int[2];
        this.f7274a = context;
        View viewInflate = LayoutInflater.from(context).inflate(AbstractC5569g.abc_tooltip, (ViewGroup) null);
        this.f7275b = viewInflate;
        this.f7276c = (TextView) viewInflate.findViewById(AbstractC5568f.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = AbstractC5571i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    private void a(View view, int i8, int i9, boolean z8, WindowManager.LayoutParams layoutParams) throws Resources.NotFoundException {
        int height;
        int i10;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f7274a.getResources().getDimensionPixelOffset(AbstractC5566d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i8 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f7274a.getResources().getDimensionPixelOffset(AbstractC5566d.tooltip_precise_anchor_extra_offset);
            height = i9 + dimensionPixelOffset2;
            i10 = i9 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i10 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f7274a.getResources().getDimensionPixelOffset(z8 ? AbstractC5566d.tooltip_y_offset_touch : AbstractC5566d.tooltip_y_offset_non_touch);
        View viewB = b(view);
        if (viewB == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f7278e);
        Rect rect = this.f7278e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f7274a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f7278e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f7280g);
        view.getLocationOnScreen(this.f7279f);
        int[] iArr = this.f7279f;
        int i11 = iArr[0];
        int[] iArr2 = this.f7280g;
        int i12 = i11 - iArr2[0];
        iArr[0] = i12;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i12 + i8) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f7275b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f7275b.getMeasuredHeight();
        int i13 = this.f7279f[1];
        int i14 = ((i10 + i13) - dimensionPixelOffset3) - measuredHeight;
        int i15 = i13 + height + dimensionPixelOffset3;
        if (z8) {
            if (i14 >= 0) {
                layoutParams.y = i14;
                return;
            } else {
                layoutParams.y = i15;
                return;
            }
        }
        if (measuredHeight + i15 <= this.f7278e.height()) {
            layoutParams.y = i15;
        } else {
            layoutParams.y = i14;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f7274a.getSystemService("window")).removeView(this.f7275b);
        }
    }

    boolean d() {
        return this.f7275b.getParent() != null;
    }

    void e(View view, int i8, int i9, boolean z8, CharSequence charSequence) throws Resources.NotFoundException {
        if (d()) {
            c();
        }
        this.f7276c.setText(charSequence);
        a(view, i8, i9, z8, this.f7277d);
        ((WindowManager) this.f7274a.getSystemService("window")).addView(this.f7275b, this.f7277d);
    }
}
