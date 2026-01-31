package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.r0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements e.b, l, AdapterView.OnItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f6522c = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    private e f6523a;

    /* renamed from: b, reason: collision with root package name */
    private int f6524b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.l
    public int getWindowAnimations() {
        return this.f6524b;
    }

    @Override // androidx.appcompat.view.menu.l
    public void initialize(e eVar) {
        this.f6523a = eVar;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean invokeItem(h hVar) {
        return this.f6523a.performItemAction(hVar, 0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
        invokeItem((h) getAdapter().getItem(i8));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(context, attributeSet, f6522c, i8, 0);
        if (r0VarObtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable(r0VarObtainStyledAttributes.getDrawable(0));
        }
        if (r0VarObtainStyledAttributes.hasValue(1)) {
            setDivider(r0VarObtainStyledAttributes.getDrawable(1));
        }
        r0VarObtainStyledAttributes.recycle();
    }
}
