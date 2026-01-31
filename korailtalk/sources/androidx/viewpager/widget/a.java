package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a {
    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;

    /* renamed from: a, reason: collision with root package name */
    private final DataSetObservable f10940a = new DataSetObservable();

    /* renamed from: b, reason: collision with root package name */
    private DataSetObserver f10941b;

    void a(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f10941b = dataSetObserver;
        }
    }

    public void destroyItem(ViewGroup viewGroup, int i8, Object obj) {
        destroyItem((View) viewGroup, i8, obj);
    }

    @Deprecated
    public void finishUpdate(View view) {
    }

    public abstract int getCount();

    public int getItemPosition(Object obj) {
        return -1;
    }

    public CharSequence getPageTitle(int i8) {
        return null;
    }

    public float getPageWidth(int i8) {
        return 1.0f;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i8) {
        return instantiateItem((View) viewGroup, i8);
    }

    public abstract boolean isViewFromObject(View view, Object obj);

    public void notifyDataSetChanged() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f10941b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f10940a.notifyChanged();
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f10940a.registerObserver(dataSetObserver);
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    @Deprecated
    public void setPrimaryItem(View view, int i8, Object obj) {
    }

    @Deprecated
    public void startUpdate(View view) {
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f10940a.unregisterObserver(dataSetObserver);
    }

    @Deprecated
    public void destroyItem(View view, int i8, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void finishUpdate(ViewGroup viewGroup) {
        finishUpdate((View) viewGroup);
    }

    @Deprecated
    public Object instantiateItem(View view, int i8) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i8, Object obj) {
        setPrimaryItem((View) viewGroup, i8, obj);
    }

    public void startUpdate(ViewGroup viewGroup) {
        startUpdate((View) viewGroup);
    }
}
