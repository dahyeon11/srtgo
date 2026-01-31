package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {
    public final Integer navigationBarColor;
    public final Integer navigationBarDividerColor;
    public final Integer secondaryToolbarColor;
    public final Integer toolbarColor;

    /* renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    public static final class C0115a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f7315a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f7316b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f7317c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f7318d;

        public a build() {
            return new a(this.f7315a, this.f7316b, this.f7317c, this.f7318d);
        }

        public C0115a setNavigationBarColor(int i8) {
            this.f7317c = Integer.valueOf(i8 | (-16777216));
            return this;
        }

        public C0115a setNavigationBarDividerColor(int i8) {
            this.f7318d = Integer.valueOf(i8);
            return this;
        }

        public C0115a setSecondaryToolbarColor(int i8) {
            this.f7316b = Integer.valueOf(i8);
            return this;
        }

        public C0115a setToolbarColor(int i8) {
            this.f7315a = Integer.valueOf(i8 | (-16777216));
            return this;
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.toolbarColor = num;
        this.secondaryToolbarColor = num2;
        this.navigationBarColor = num3;
        this.navigationBarDividerColor = num4;
    }

    static a a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new a((Integer) bundle.get(d.EXTRA_TOOLBAR_COLOR), (Integer) bundle.get(d.EXTRA_SECONDARY_TOOLBAR_COLOR), (Integer) bundle.get(d.EXTRA_NAVIGATION_BAR_COLOR), (Integer) bundle.get(d.EXTRA_NAVIGATION_BAR_DIVIDER_COLOR));
    }

    Bundle b() {
        Bundle bundle = new Bundle();
        Integer num = this.toolbarColor;
        if (num != null) {
            bundle.putInt(d.EXTRA_TOOLBAR_COLOR, num.intValue());
        }
        Integer num2 = this.secondaryToolbarColor;
        if (num2 != null) {
            bundle.putInt(d.EXTRA_SECONDARY_TOOLBAR_COLOR, num2.intValue());
        }
        Integer num3 = this.navigationBarColor;
        if (num3 != null) {
            bundle.putInt(d.EXTRA_NAVIGATION_BAR_COLOR, num3.intValue());
        }
        Integer num4 = this.navigationBarDividerColor;
        if (num4 != null) {
            bundle.putInt(d.EXTRA_NAVIGATION_BAR_DIVIDER_COLOR, num4.intValue());
        }
        return bundle;
    }

    a c(a aVar) {
        Integer num = this.toolbarColor;
        if (num == null) {
            num = aVar.toolbarColor;
        }
        Integer num2 = this.secondaryToolbarColor;
        if (num2 == null) {
            num2 = aVar.secondaryToolbarColor;
        }
        Integer num3 = this.navigationBarColor;
        if (num3 == null) {
            num3 = aVar.navigationBarColor;
        }
        Integer num4 = this.navigationBarDividerColor;
        if (num4 == null) {
            num4 = aVar.navigationBarDividerColor;
        }
        return new a(num, num2, num3, num4);
    }
}
