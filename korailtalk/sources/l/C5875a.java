package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import h.AbstractC5563a;
import h.AbstractC5564b;
import h.AbstractC5566d;
import h.AbstractC5572j;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5875a {

    /* renamed from: a, reason: collision with root package name */
    private Context f33831a;

    private C5875a(Context context) {
        this.f33831a = context;
    }

    public static C5875a get(Context context) {
        return new C5875a(context);
    }

    public boolean enableHomeButtonByDefault() {
        return this.f33831a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int getEmbeddedMenuWidthLimit() {
        return this.f33831a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int getMaxActionButtons() {
        Configuration configuration = this.f33831a.getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i8 > 600) {
            return 5;
        }
        if (i8 > 960 && i9 > 720) {
            return 5;
        }
        if (i8 > 720 && i9 > 960) {
            return 5;
        }
        if (i8 >= 500) {
            return 4;
        }
        if (i8 > 640 && i9 > 480) {
            return 4;
        }
        if (i8 <= 480 || i9 <= 640) {
            return i8 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int getStackedTabMaxWidth() {
        return this.f33831a.getResources().getDimensionPixelSize(AbstractC5566d.abc_action_bar_stacked_tab_max_width);
    }

    public int getTabContainerHeight() {
        TypedArray typedArrayObtainStyledAttributes = this.f33831a.obtainStyledAttributes(null, AbstractC5572j.ActionBar, AbstractC5563a.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(AbstractC5572j.ActionBar_height, 0);
        Resources resources = this.f33831a.getResources();
        if (!hasEmbeddedTabs()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(AbstractC5566d.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean hasEmbeddedTabs() {
        return this.f33831a.getResources().getBoolean(AbstractC5564b.abc_action_bar_embed_tabs);
    }

    public boolean showsOverflowMenuButton() {
        return true;
    }
}
