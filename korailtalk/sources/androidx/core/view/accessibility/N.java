package androidx.core.view.accessibility;

import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import java.util.List;

/* loaded from: classes.dex */
public class N {

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityRecord f9166a;

    @Deprecated
    public N(Object obj) {
        this.f9166a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static N obtain(N n8) {
        return new N(AccessibilityRecord.obtain(n8.f9166a));
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n8 = (N) obj;
        AccessibilityRecord accessibilityRecord = this.f9166a;
        return accessibilityRecord == null ? n8.f9166a == null : accessibilityRecord.equals(n8.f9166a);
    }

    @Deprecated
    public int getAddedCount() {
        return this.f9166a.getAddedCount();
    }

    @Deprecated
    public CharSequence getBeforeText() {
        return this.f9166a.getBeforeText();
    }

    @Deprecated
    public CharSequence getClassName() {
        return this.f9166a.getClassName();
    }

    @Deprecated
    public CharSequence getContentDescription() {
        return this.f9166a.getContentDescription();
    }

    @Deprecated
    public int getCurrentItemIndex() {
        return this.f9166a.getCurrentItemIndex();
    }

    @Deprecated
    public int getFromIndex() {
        return this.f9166a.getFromIndex();
    }

    @Deprecated
    public Object getImpl() {
        return this.f9166a;
    }

    @Deprecated
    public int getItemCount() {
        return this.f9166a.getItemCount();
    }

    @Deprecated
    public int getMaxScrollX() {
        return getMaxScrollX(this.f9166a);
    }

    @Deprecated
    public int getMaxScrollY() {
        return getMaxScrollY(this.f9166a);
    }

    @Deprecated
    public Parcelable getParcelableData() {
        return this.f9166a.getParcelableData();
    }

    @Deprecated
    public int getRemovedCount() {
        return this.f9166a.getRemovedCount();
    }

    @Deprecated
    public int getScrollX() {
        return this.f9166a.getScrollX();
    }

    @Deprecated
    public int getScrollY() {
        return this.f9166a.getScrollY();
    }

    @Deprecated
    public H getSource() {
        return H.l(this.f9166a.getSource());
    }

    @Deprecated
    public List<CharSequence> getText() {
        return this.f9166a.getText();
    }

    @Deprecated
    public int getToIndex() {
        return this.f9166a.getToIndex();
    }

    @Deprecated
    public int getWindowId() {
        return this.f9166a.getWindowId();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f9166a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public boolean isChecked() {
        return this.f9166a.isChecked();
    }

    @Deprecated
    public boolean isEnabled() {
        return this.f9166a.isEnabled();
    }

    @Deprecated
    public boolean isFullScreen() {
        return this.f9166a.isFullScreen();
    }

    @Deprecated
    public boolean isPassword() {
        return this.f9166a.isPassword();
    }

    @Deprecated
    public boolean isScrollable() {
        return this.f9166a.isScrollable();
    }

    @Deprecated
    public void recycle() {
        this.f9166a.recycle();
    }

    @Deprecated
    public void setAddedCount(int i8) {
        this.f9166a.setAddedCount(i8);
    }

    @Deprecated
    public void setBeforeText(CharSequence charSequence) {
        this.f9166a.setBeforeText(charSequence);
    }

    @Deprecated
    public void setChecked(boolean z8) {
        this.f9166a.setChecked(z8);
    }

    @Deprecated
    public void setClassName(CharSequence charSequence) {
        this.f9166a.setClassName(charSequence);
    }

    @Deprecated
    public void setContentDescription(CharSequence charSequence) {
        this.f9166a.setContentDescription(charSequence);
    }

    @Deprecated
    public void setCurrentItemIndex(int i8) {
        this.f9166a.setCurrentItemIndex(i8);
    }

    @Deprecated
    public void setEnabled(boolean z8) {
        this.f9166a.setEnabled(z8);
    }

    @Deprecated
    public void setFromIndex(int i8) {
        this.f9166a.setFromIndex(i8);
    }

    @Deprecated
    public void setFullScreen(boolean z8) {
        this.f9166a.setFullScreen(z8);
    }

    @Deprecated
    public void setItemCount(int i8) {
        this.f9166a.setItemCount(i8);
    }

    @Deprecated
    public void setMaxScrollX(int i8) {
        setMaxScrollX(this.f9166a, i8);
    }

    @Deprecated
    public void setMaxScrollY(int i8) {
        setMaxScrollY(this.f9166a, i8);
    }

    @Deprecated
    public void setParcelableData(Parcelable parcelable) {
        this.f9166a.setParcelableData(parcelable);
    }

    @Deprecated
    public void setPassword(boolean z8) {
        this.f9166a.setPassword(z8);
    }

    @Deprecated
    public void setRemovedCount(int i8) {
        this.f9166a.setRemovedCount(i8);
    }

    @Deprecated
    public void setScrollX(int i8) {
        this.f9166a.setScrollX(i8);
    }

    @Deprecated
    public void setScrollY(int i8) {
        this.f9166a.setScrollY(i8);
    }

    @Deprecated
    public void setScrollable(boolean z8) {
        this.f9166a.setScrollable(z8);
    }

    @Deprecated
    public void setSource(View view) {
        this.f9166a.setSource(view);
    }

    @Deprecated
    public void setToIndex(int i8) {
        this.f9166a.setToIndex(i8);
    }

    public static int getMaxScrollX(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    public static int getMaxScrollY(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    @Deprecated
    public static N obtain() {
        return new N(AccessibilityRecord.obtain());
    }

    public static void setMaxScrollX(AccessibilityRecord accessibilityRecord, int i8) {
        accessibilityRecord.setMaxScrollX(i8);
    }

    public static void setMaxScrollY(AccessibilityRecord accessibilityRecord, int i8) {
        accessibilityRecord.setMaxScrollY(i8);
    }

    @Deprecated
    public void setSource(View view, int i8) {
        setSource(this.f9166a, view, i8);
    }

    public static void setSource(AccessibilityRecord accessibilityRecord, View view, int i8) {
        accessibilityRecord.setSource(view, i8);
    }
}
