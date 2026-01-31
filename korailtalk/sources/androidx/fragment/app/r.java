package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1019h;

/* loaded from: classes.dex */
public abstract class r extends androidx.viewpager.widget.a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;

    /* renamed from: c, reason: collision with root package name */
    private final FragmentManager f9761c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9762d;

    /* renamed from: e, reason: collision with root package name */
    private x f9763e;

    /* renamed from: f, reason: collision with root package name */
    private Fragment f9764f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9765g;

    @Deprecated
    public r(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    private static String b(int i8, long j8) {
        return "android:switcher:" + i8 + ":" + j8;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(ViewGroup viewGroup, int i8, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f9763e == null) {
            this.f9763e = this.f9761c.beginTransaction();
        }
        this.f9763e.detach(fragment);
        if (fragment.equals(this.f9764f)) {
            this.f9764f = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void finishUpdate(ViewGroup viewGroup) {
        x xVar = this.f9763e;
        if (xVar != null) {
            if (!this.f9765g) {
                try {
                    this.f9765g = true;
                    xVar.commitNowAllowingStateLoss();
                } finally {
                    this.f9765g = false;
                }
            }
            this.f9763e = null;
        }
    }

    public abstract Fragment getItem(int i8);

    public long getItemId(int i8) {
        return i8;
    }

    @Override // androidx.viewpager.widget.a
    public Object instantiateItem(ViewGroup viewGroup, int i8) {
        if (this.f9763e == null) {
            this.f9763e = this.f9761c.beginTransaction();
        }
        long itemId = getItemId(i8);
        Fragment fragmentFindFragmentByTag = this.f9761c.findFragmentByTag(b(viewGroup.getId(), itemId));
        if (fragmentFindFragmentByTag != null) {
            this.f9763e.attach(fragmentFindFragmentByTag);
        } else {
            fragmentFindFragmentByTag = getItem(i8);
            this.f9763e.add(viewGroup.getId(), fragmentFindFragmentByTag, b(viewGroup.getId(), itemId));
        }
        if (fragmentFindFragmentByTag != this.f9764f) {
            fragmentFindFragmentByTag.setMenuVisibility(false);
            if (this.f9762d == 1) {
                this.f9763e.setMaxLifecycle(fragmentFindFragmentByTag, AbstractC1019h.b.STARTED);
            } else {
                fragmentFindFragmentByTag.setUserVisibleHint(false);
            }
        }
        return fragmentFindFragmentByTag;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable saveState() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public void setPrimaryItem(ViewGroup viewGroup, int i8, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f9764f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f9762d == 1) {
                    if (this.f9763e == null) {
                        this.f9763e = this.f9761c.beginTransaction();
                    }
                    this.f9763e.setMaxLifecycle(this.f9764f, AbstractC1019h.b.STARTED);
                } else {
                    this.f9764f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f9762d == 1) {
                if (this.f9763e == null) {
                    this.f9763e = this.f9761c.beginTransaction();
                }
                this.f9763e.setMaxLifecycle(fragment, AbstractC1019h.b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f9764f = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public r(FragmentManager fragmentManager, int i8) {
        this.f9763e = null;
        this.f9764f = null;
        this.f9761c = fragmentManager;
        this.f9762d = i8;
    }
}
