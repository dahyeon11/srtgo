package y1;

import H1.C0591z;
import H1.d2;
import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;

/* renamed from: y1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6528i {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;

    /* renamed from: a, reason: collision with root package name */
    private final int f37578a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37579b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37580c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f37581d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f37582e;

    /* renamed from: f, reason: collision with root package name */
    private int f37583f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f37584g;

    /* renamed from: h, reason: collision with root package name */
    private int f37585h;
    public static final C6528i BANNER = new C6528i(320, 50, "320x50_mb");
    public static final C6528i FULL_BANNER = new C6528i(468, 60, "468x60_as");
    public static final C6528i LARGE_BANNER = new C6528i(320, 100, "320x100_as");
    public static final C6528i LEADERBOARD = new C6528i(728, 90, "728x90_as");
    public static final C6528i MEDIUM_RECTANGLE = new C6528i(300, 250, "300x250_as");
    public static final C6528i WIDE_SKYSCRAPER = new C6528i(160, 600, "160x600_as");

    @Deprecated
    public static final C6528i SMART_BANNER = new C6528i(-1, -2, "smart_banner");
    public static final C6528i FLUID = new C6528i(-3, -4, "fluid");
    public static final C6528i INVALID = new C6528i(0, 0, "invalid");
    public static final C6528i zza = new C6528i(50, 50, "50x50_mb");
    public static final C6528i SEARCH = new C6528i(-3, 0, "search_v2");

    public C6528i(int i8, int i9) {
        this(i8, i9, (i8 == -1 ? "FULL" : String.valueOf(i8)) + "x" + (i9 == -2 ? "AUTO" : String.valueOf(i9)) + "_as");
    }

    public static C6528i getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i8) {
        C6528i c6528iZzd = L1.g.zzd(context, i8, 50, 0);
        c6528iZzd.f37581d = true;
        return c6528iZzd;
    }

    public static C6528i getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i8) {
        int iZza = L1.g.zza(context, 0);
        if (iZza == -1) {
            return INVALID;
        }
        C6528i c6528i = new C6528i(i8, 0);
        c6528i.f37583f = iZza;
        c6528i.f37582e = true;
        return c6528i;
    }

    public static C6528i getCurrentOrientationInterscrollerAdSize(Context context, int i8) {
        return j(i8, L1.g.zza(context, 0));
    }

    public static C6528i getInlineAdaptiveBannerAdSize(int i8, int i9) {
        C6528i c6528i = new C6528i(i8, 0);
        c6528i.f37583f = i9;
        c6528i.f37582e = true;
        if (i9 < 32) {
            L1.n.zzj("The maximum height set for the inline adaptive ad size was " + i9 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return c6528i;
    }

    public static C6528i getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i8) {
        C6528i c6528iZzd = L1.g.zzd(context, i8, 50, 2);
        c6528iZzd.f37581d = true;
        return c6528iZzd;
    }

    public static C6528i getLandscapeInlineAdaptiveBannerAdSize(Context context, int i8) {
        int iZza = L1.g.zza(context, 2);
        C6528i c6528i = new C6528i(i8, 0);
        if (iZza == -1) {
            return INVALID;
        }
        c6528i.f37583f = iZza;
        c6528i.f37582e = true;
        return c6528i;
    }

    public static C6528i getLandscapeInterscrollerAdSize(Context context, int i8) {
        return j(i8, L1.g.zza(context, 2));
    }

    public static C6528i getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i8) {
        C6528i c6528iZzd = L1.g.zzd(context, i8, 50, 1);
        c6528iZzd.f37581d = true;
        return c6528iZzd;
    }

    public static C6528i getPortraitInlineAdaptiveBannerAdSize(Context context, int i8) {
        int iZza = L1.g.zza(context, 1);
        C6528i c6528i = new C6528i(i8, 0);
        if (iZza == -1) {
            return INVALID;
        }
        c6528i.f37583f = iZza;
        c6528i.f37582e = true;
        return c6528i;
    }

    public static C6528i getPortraitInterscrollerAdSize(Context context, int i8) {
        return j(i8, L1.g.zza(context, 1));
    }

    private static C6528i j(int i8, int i9) {
        if (i9 == -1) {
            return INVALID;
        }
        C6528i c6528i = new C6528i(i8, 0);
        c6528i.f37585h = i9;
        c6528i.f37584g = true;
        return c6528i;
    }

    final int a() {
        return this.f37585h;
    }

    final int b() {
        return this.f37583f;
    }

    final void c(int i8) {
        this.f37583f = i8;
    }

    final void d(int i8) {
        this.f37585h = i8;
    }

    final void e(boolean z8) {
        this.f37582e = true;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6528i)) {
            return false;
        }
        C6528i c6528i = (C6528i) obj;
        return this.f37578a == c6528i.f37578a && this.f37579b == c6528i.f37579b && this.f37580c.equals(c6528i.f37580c);
    }

    final void f(boolean z8) {
        this.f37584g = true;
    }

    final boolean g() {
        return this.f37581d;
    }

    public int getHeight() {
        return this.f37579b;
    }

    public int getHeightInPixels(Context context) {
        int i8 = this.f37579b;
        if (i8 == -4 || i8 == -3) {
            return -1;
        }
        if (i8 == -2) {
            return d2.zza(context.getResources().getDisplayMetrics());
        }
        C0591z.zzb();
        return L1.g.zzy(context, i8);
    }

    public int getWidth() {
        return this.f37578a;
    }

    public int getWidthInPixels(Context context) {
        int i8 = this.f37578a;
        if (i8 == -3) {
            return -1;
        }
        if (i8 != -1) {
            C0591z.zzb();
            return L1.g.zzy(context, i8);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<d2> creator = d2.CREATOR;
        return displayMetrics.widthPixels;
    }

    final boolean h() {
        return this.f37582e;
    }

    public int hashCode() {
        return this.f37580c.hashCode();
    }

    final boolean i() {
        return this.f37584g;
    }

    public boolean isAutoHeight() {
        return this.f37579b == -2;
    }

    public boolean isFluid() {
        return this.f37578a == -3 && this.f37579b == -4;
    }

    public boolean isFullWidth() {
        return this.f37578a == -1;
    }

    public String toString() {
        return this.f37580c;
    }

    C6528i(int i8, int i9, String str) {
        if (i8 < 0 && i8 != -1 && i8 != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i8);
        }
        if (i9 < 0 && i9 != -2 && i9 != -4) {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i9);
        }
        this.f37578a = i8;
        this.f37579b = i9;
        this.f37580c = str;
    }
}
