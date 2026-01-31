package N1;

import android.location.Location;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public interface A extends f {
    float getAdVolume();

    @Override // N1.f
    @Deprecated
    /* synthetic */ Date getBirthday();

    @Override // N1.f
    @Deprecated
    /* synthetic */ int getGender();

    @Override // N1.f
    /* synthetic */ Set getKeywords();

    @Override // N1.f
    /* synthetic */ Location getLocation();

    @Deprecated
    B1.e getNativeAdOptions();

    Q1.d getNativeAdRequestOptions();

    boolean isAdMuted();

    @Override // N1.f
    @Deprecated
    /* synthetic */ boolean isDesignedForFamilies();

    @Override // N1.f
    /* synthetic */ boolean isTesting();

    boolean isUnifiedNativeAdRequested();

    @Override // N1.f
    /* synthetic */ int taggedForChildDirectedTreatment();

    Map zza();

    boolean zzb();
}
