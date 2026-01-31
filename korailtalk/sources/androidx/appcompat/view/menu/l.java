package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public interface l {

    public interface a {
        h getItemData();

        void initialize(h hVar, int i8);

        boolean prefersCondensedTitle();

        void setCheckable(boolean z8);

        void setChecked(boolean z8);

        void setEnabled(boolean z8);

        void setIcon(Drawable drawable);

        void setShortcut(boolean z8, char c9);

        void setTitle(CharSequence charSequence);

        boolean showsIcon();
    }

    int getWindowAnimations();

    void initialize(e eVar);
}
