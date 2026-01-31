package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import h.AbstractC5572j;
import l.AbstractC5876b;

/* loaded from: classes.dex */
public abstract class a {
    public static final int DISPLAY_HOME_AS_UP = 4;
    public static final int DISPLAY_SHOW_CUSTOM = 16;
    public static final int DISPLAY_SHOW_HOME = 2;
    public static final int DISPLAY_SHOW_TITLE = 8;
    public static final int DISPLAY_USE_LOGO = 1;

    @Deprecated
    public static final int NAVIGATION_MODE_LIST = 1;

    @Deprecated
    public static final int NAVIGATION_MODE_STANDARD = 0;

    @Deprecated
    public static final int NAVIGATION_MODE_TABS = 2;

    public interface b {
    }

    public interface c {
    }

    public static abstract class d {
        public static final int INVALID_POSITION = -1;

        public abstract CharSequence getContentDescription();

        public abstract View getCustomView();

        public abstract Drawable getIcon();

        public abstract int getPosition();

        public abstract Object getTag();

        public abstract CharSequence getText();

        public abstract void select();

        public abstract d setContentDescription(int i8);

        public abstract d setContentDescription(CharSequence charSequence);

        public abstract d setCustomView(int i8);

        public abstract d setCustomView(View view);

        public abstract d setIcon(int i8);

        public abstract d setIcon(Drawable drawable);

        public abstract d setTabListener(e eVar);

        public abstract d setTag(Object obj);

        public abstract d setText(int i8);

        public abstract d setText(CharSequence charSequence);
    }

    public interface e {
    }

    void a() {
    }

    public abstract void addOnMenuVisibilityListener(b bVar);

    @Deprecated
    public abstract void addTab(d dVar);

    @Deprecated
    public abstract void addTab(d dVar, int i8);

    @Deprecated
    public abstract void addTab(d dVar, int i8, boolean z8);

    @Deprecated
    public abstract void addTab(d dVar, boolean z8);

    public boolean closeOptionsMenu() {
        return false;
    }

    public boolean collapseActionView() {
        return false;
    }

    public void dispatchMenuVisibilityChanged(boolean z8) {
    }

    public abstract View getCustomView();

    public abstract int getDisplayOptions();

    public float getElevation() {
        return 0.0f;
    }

    public abstract int getHeight();

    public int getHideOffset() {
        return 0;
    }

    @Deprecated
    public abstract int getNavigationItemCount();

    @Deprecated
    public abstract int getNavigationMode();

    @Deprecated
    public abstract int getSelectedNavigationIndex();

    @Deprecated
    public abstract d getSelectedTab();

    public abstract CharSequence getSubtitle();

    @Deprecated
    public abstract d getTabAt(int i8);

    @Deprecated
    public abstract int getTabCount();

    public Context getThemedContext() {
        return null;
    }

    public abstract CharSequence getTitle();

    public abstract void hide();

    public boolean invalidateOptionsMenu() {
        return false;
    }

    public boolean isHideOnContentScrollEnabled() {
        return false;
    }

    public abstract boolean isShowing();

    public boolean isTitleTruncated() {
        return false;
    }

    @Deprecated
    public abstract d newTab();

    public void onConfigurationChanged(Configuration configuration) {
    }

    public boolean onKeyShortcut(int i8, KeyEvent keyEvent) {
        return false;
    }

    public boolean onMenuKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    public boolean openOptionsMenu() {
        return false;
    }

    @Deprecated
    public abstract void removeAllTabs();

    public abstract void removeOnMenuVisibilityListener(b bVar);

    @Deprecated
    public abstract void removeTab(d dVar);

    @Deprecated
    public abstract void removeTabAt(int i8);

    @Deprecated
    public abstract void selectTab(d dVar);

    public abstract void setBackgroundDrawable(Drawable drawable);

    public abstract void setCustomView(int i8);

    public abstract void setCustomView(View view);

    public abstract void setCustomView(View view, C0110a c0110a);

    public void setDefaultDisplayHomeAsUpEnabled(boolean z8) {
    }

    public abstract void setDisplayHomeAsUpEnabled(boolean z8);

    public abstract void setDisplayOptions(int i8);

    public abstract void setDisplayOptions(int i8, int i9);

    public abstract void setDisplayShowCustomEnabled(boolean z8);

    public abstract void setDisplayShowHomeEnabled(boolean z8);

    public abstract void setDisplayShowTitleEnabled(boolean z8);

    public abstract void setDisplayUseLogoEnabled(boolean z8);

    public void setElevation(float f8) {
        if (f8 != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public void setHideOffset(int i8) {
        if (i8 != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    public void setHideOnContentScrollEnabled(boolean z8) {
        if (z8) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    public void setHomeActionContentDescription(int i8) {
    }

    public void setHomeAsUpIndicator(int i8) {
    }

    public void setHomeButtonEnabled(boolean z8) {
    }

    public abstract void setIcon(int i8);

    public abstract void setIcon(Drawable drawable);

    @Deprecated
    public abstract void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, c cVar);

    public abstract void setLogo(int i8);

    public abstract void setLogo(Drawable drawable);

    @Deprecated
    public abstract void setNavigationMode(int i8);

    @Deprecated
    public abstract void setSelectedNavigationItem(int i8);

    public void setShowHideAnimationEnabled(boolean z8) {
    }

    public void setSplitBackgroundDrawable(Drawable drawable) {
    }

    public void setStackedBackgroundDrawable(Drawable drawable) {
    }

    public abstract void setSubtitle(int i8);

    public abstract void setSubtitle(CharSequence charSequence);

    public abstract void setTitle(int i8);

    public abstract void setTitle(CharSequence charSequence);

    public void setWindowTitle(CharSequence charSequence) {
    }

    public abstract void show();

    public AbstractC5876b startActionMode(AbstractC5876b.a aVar) {
        return null;
    }

    public void setHomeActionContentDescription(CharSequence charSequence) {
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
    }

    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0110a extends ViewGroup.MarginLayoutParams {
        public int gravity;

        public C0110a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5572j.ActionBarLayout);
            this.gravity = typedArrayObtainStyledAttributes.getInt(AbstractC5572j.ActionBarLayout_android_layout_gravity, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0110a(int i8, int i9) {
            super(i8, i9);
            this.gravity = 8388627;
        }

        public C0110a(int i8, int i9, int i10) {
            super(i8, i9);
            this.gravity = i10;
        }

        public C0110a(int i8) {
            this(-2, -1, i8);
        }

        public C0110a(C0110a c0110a) {
            super((ViewGroup.MarginLayoutParams) c0110a);
            this.gravity = 0;
            this.gravity = c0110a.gravity;
        }

        public C0110a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }
    }
}
