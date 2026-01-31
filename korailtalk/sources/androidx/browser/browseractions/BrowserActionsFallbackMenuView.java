package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import q.AbstractC6101a;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f7313a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7314b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7313a = getResources().getDimensionPixelOffset(AbstractC6101a.browser_actions_context_menu_min_padding);
        this.f7314b = getResources().getDimensionPixelOffset(AbstractC6101a.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f7313a * 2), this.f7314b), 1073741824), i9);
    }
}
