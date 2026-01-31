package N1;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;

/* renamed from: N1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0679d {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

    /* renamed from: a, reason: collision with root package name */
    private final String f3194a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f3195b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f3196c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f3197d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f3198e;

    /* renamed from: f, reason: collision with root package name */
    private final int f3199f;

    /* renamed from: g, reason: collision with root package name */
    private final int f3200g;

    /* renamed from: h, reason: collision with root package name */
    private final String f3201h;

    /* renamed from: i, reason: collision with root package name */
    private final String f3202i;

    public C0679d(Context context, String str, Bundle bundle, Bundle bundle2, boolean z8, Location location, int i8, int i9, String str2, String str3) {
        this.f3194a = str;
        this.f3195b = bundle;
        this.f3196c = bundle2;
        this.f3197d = context;
        this.f3198e = z8;
        this.f3199f = i8;
        this.f3200g = i9;
        this.f3201h = str2;
        this.f3202i = str3;
    }

    public String getBidResponse() {
        return this.f3194a;
    }

    public Context getContext() {
        return this.f3197d;
    }

    public String getMaxAdContentRating() {
        return this.f3201h;
    }

    public Bundle getMediationExtras() {
        return this.f3196c;
    }

    public Bundle getServerParameters() {
        return this.f3195b;
    }

    public String getWatermark() {
        return this.f3202i;
    }

    public boolean isTestRequest() {
        return this.f3198e;
    }

    public int taggedForChildDirectedTreatment() {
        return this.f3199f;
    }

    public int taggedForUnderAgeTreatment() {
        return this.f3200g;
    }
}
