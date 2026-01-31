package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.k;
import androidx.core.view.A;
import androidx.core.view.AbstractC0985p0;
import h.AbstractC5563a;
import h.AbstractC5566d;

/* loaded from: classes.dex */
public class j implements g {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6668a;

    /* renamed from: b, reason: collision with root package name */
    private final e f6669b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6670c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6671d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6672e;

    /* renamed from: f, reason: collision with root package name */
    private View f6673f;

    /* renamed from: g, reason: collision with root package name */
    private int f6674g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6675h;

    /* renamed from: i, reason: collision with root package name */
    private k.a f6676i;

    /* renamed from: j, reason: collision with root package name */
    private i f6677j;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f6678k;

    /* renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f6679l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            j.this.b();
        }
    }

    public j(Context context, e eVar) {
        this(context, eVar, null, false, AbstractC5563a.popupMenuStyle, 0);
    }

    private i a() {
        Display defaultDisplay = ((WindowManager) this.f6668a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        i bVar = Math.min(point.x, point.y) >= this.f6668a.getResources().getDimensionPixelSize(AbstractC5566d.abc_cascading_menus_min_smallest_width) ? new b(this.f6668a, this.f6673f, this.f6671d, this.f6672e, this.f6670c) : new m(this.f6668a, this.f6669b, this.f6673f, this.f6671d, this.f6672e, this.f6670c);
        bVar.addMenu(this.f6669b);
        bVar.setOnDismissListener(this.f6679l);
        bVar.setAnchorView(this.f6673f);
        bVar.setCallback(this.f6676i);
        bVar.setForceShowIcon(this.f6675h);
        bVar.setGravity(this.f6674g);
        return bVar;
    }

    private void c(int i8, int i9, boolean z8, boolean z9) {
        i popup = getPopup();
        popup.setShowTitle(z9);
        if (z8) {
            if ((A.getAbsoluteGravity(this.f6674g, AbstractC0985p0.getLayoutDirection(this.f6673f)) & 7) == 5) {
                i8 -= this.f6673f.getWidth();
            }
            popup.setHorizontalOffset(i8);
            popup.setVerticalOffset(i9);
            int i10 = (int) ((this.f6668a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            popup.setEpicenterBounds(new Rect(i8 - i10, i9 - i10, i8 + i10, i9 + i10));
        }
        popup.show();
    }

    protected void b() {
        this.f6677j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f6678k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public void dismiss() {
        if (isShowing()) {
            this.f6677j.dismiss();
        }
    }

    public int getGravity() {
        return this.f6674g;
    }

    public ListView getListView() {
        return getPopup().getListView();
    }

    public i getPopup() {
        if (this.f6677j == null) {
            this.f6677j = a();
        }
        return this.f6677j;
    }

    public boolean isShowing() {
        i iVar = this.f6677j;
        return iVar != null && iVar.isShowing();
    }

    public void setAnchorView(View view) {
        this.f6673f = view;
    }

    public void setForceShowIcon(boolean z8) {
        this.f6675h = z8;
        i iVar = this.f6677j;
        if (iVar != null) {
            iVar.setForceShowIcon(z8);
        }
    }

    public void setGravity(int i8) {
        this.f6674g = i8;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f6678k = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.g
    public void setPresenterCallback(k.a aVar) {
        this.f6676i = aVar;
        i iVar = this.f6677j;
        if (iVar != null) {
            iVar.setCallback(aVar);
        }
    }

    public void show() {
        if (!tryShow()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean tryShow() {
        if (isShowing()) {
            return true;
        }
        if (this.f6673f == null) {
            return false;
        }
        c(0, 0, false, false);
        return true;
    }

    public j(Context context, e eVar, View view) {
        this(context, eVar, view, false, AbstractC5563a.popupMenuStyle, 0);
    }

    public j(Context context, e eVar, View view, boolean z8, int i8) {
        this(context, eVar, view, z8, i8, 0);
    }

    public void show(int i8, int i9) {
        if (!tryShow(i8, i9)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public j(Context context, e eVar, View view, boolean z8, int i8, int i9) {
        this.f6674g = A.START;
        this.f6679l = new a();
        this.f6668a = context;
        this.f6669b = eVar;
        this.f6673f = view;
        this.f6670c = z8;
        this.f6671d = i8;
        this.f6672e = i9;
    }

    public boolean tryShow(int i8, int i9) {
        if (isShowing()) {
            return true;
        }
        if (this.f6673f == null) {
            return false;
        }
        c(i8, i9, true, true);
        return true;
    }
}
