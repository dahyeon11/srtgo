package N1;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.internal.ads.C1840Ri;

/* loaded from: classes.dex */
public class u extends C0679d {

    /* renamed from: j, reason: collision with root package name */
    private final C1840Ri f3206j;

    public u(Context context, String str, Bundle bundle, Bundle bundle2, boolean z8, Location location, int i8, int i9, String str2, String str3, C1840Ri c1840Ri) {
        super(context, str, bundle, bundle2, z8, location, i8, i9, str2, str3);
        this.f3206j = c1840Ri;
    }

    public Q1.d getNativeAdOptions() {
        return C1840Ri.zza(this.f3206j);
    }
}
