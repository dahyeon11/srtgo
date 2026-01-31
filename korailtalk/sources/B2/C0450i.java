package B2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;
import r2.InterfaceC6172a;

/* renamed from: B2.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0450i extends AbstractC0442a implements InterfaceC0452k {
    C0450i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // B2.InterfaceC0452k
    public final void beginAdUnitExposure(String str, long j8) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeLong(j8);
        c(23, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        AbstractC0444c.zze(parcelA, bundle);
        c(9, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void clearMeasurementEnabled(long j8) {
        Parcel parcelA = a();
        parcelA.writeLong(j8);
        c(43, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void endAdUnitExposure(String str, long j8) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeLong(j8);
        c(24, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void generateEventId(InterfaceC0455n interfaceC0455n) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC0455n);
        c(22, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void getAppInstanceId(InterfaceC0455n interfaceC0455n) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC0455n);
        c(20, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void getCachedAppInstanceId(InterfaceC0455n interfaceC0455n) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC0455n);
        c(19, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void getConditionalUserProperties(String str, String str2, InterfaceC0455n interfaceC0455n) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        AbstractC0444c.zzf(parcelA, interfaceC0455n);
        c(10, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void getCurrentScreenClass(InterfaceC0455n interfaceC0455n) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC0455n);
        c(17, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void getCurrentScreenName(InterfaceC0455n interfaceC0455n) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC0455n);
        c(16, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void getGmpAppId(InterfaceC0455n interfaceC0455n) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC0455n);
        c(21, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void getMaxUserProperties(String str, InterfaceC0455n interfaceC0455n) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        AbstractC0444c.zzf(parcelA, interfaceC0455n);
        c(6, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void getTestFlag(InterfaceC0455n interfaceC0455n, int i8) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC0455n);
        parcelA.writeInt(i8);
        c(38, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void getUserProperties(String str, String str2, boolean z8, InterfaceC0455n interfaceC0455n) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        AbstractC0444c.zzd(parcelA, z8);
        AbstractC0444c.zzf(parcelA, interfaceC0455n);
        c(5, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void initForTests(Map map) {
        throw null;
    }

    @Override // B2.InterfaceC0452k
    public final void initialize(InterfaceC6172a interfaceC6172a, C0460t c0460t, long j8) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC6172a);
        AbstractC0444c.zze(parcelA, c0460t);
        parcelA.writeLong(j8);
        c(1, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void isDataCollectionEnabled(InterfaceC0455n interfaceC0455n) {
        throw null;
    }

    @Override // B2.InterfaceC0452k
    public final void logEvent(String str, String str2, Bundle bundle, boolean z8, boolean z9, long j8) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        AbstractC0444c.zze(parcelA, bundle);
        AbstractC0444c.zzd(parcelA, z8);
        AbstractC0444c.zzd(parcelA, z9);
        parcelA.writeLong(j8);
        c(2, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC0455n interfaceC0455n, long j8) {
        throw null;
    }

    @Override // B2.InterfaceC0452k
    public final void logHealthData(int i8, String str, InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2, InterfaceC6172a interfaceC6172a3) {
        Parcel parcelA = a();
        parcelA.writeInt(5);
        parcelA.writeString(str);
        AbstractC0444c.zzf(parcelA, interfaceC6172a);
        AbstractC0444c.zzf(parcelA, interfaceC6172a2);
        AbstractC0444c.zzf(parcelA, interfaceC6172a3);
        c(33, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void onActivityCreated(InterfaceC6172a interfaceC6172a, Bundle bundle, long j8) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC6172a);
        AbstractC0444c.zze(parcelA, bundle);
        parcelA.writeLong(j8);
        c(27, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void onActivityDestroyed(InterfaceC6172a interfaceC6172a, long j8) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC6172a);
        parcelA.writeLong(j8);
        c(28, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void onActivityPaused(InterfaceC6172a interfaceC6172a, long j8) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC6172a);
        parcelA.writeLong(j8);
        c(29, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void onActivityResumed(InterfaceC6172a interfaceC6172a, long j8) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC6172a);
        parcelA.writeLong(j8);
        c(30, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void onActivitySaveInstanceState(InterfaceC6172a interfaceC6172a, InterfaceC0455n interfaceC0455n, long j8) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC6172a);
        AbstractC0444c.zzf(parcelA, interfaceC0455n);
        parcelA.writeLong(j8);
        c(31, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void onActivityStarted(InterfaceC6172a interfaceC6172a, long j8) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC6172a);
        parcelA.writeLong(j8);
        c(25, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void onActivityStopped(InterfaceC6172a interfaceC6172a, long j8) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC6172a);
        parcelA.writeLong(j8);
        c(26, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void performAction(Bundle bundle, InterfaceC0455n interfaceC0455n, long j8) {
        Parcel parcelA = a();
        AbstractC0444c.zze(parcelA, bundle);
        AbstractC0444c.zzf(parcelA, interfaceC0455n);
        parcelA.writeLong(j8);
        c(32, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void registerOnMeasurementEventListener(InterfaceC0458q interfaceC0458q) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC0458q);
        c(35, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void resetAnalyticsData(long j8) {
        Parcel parcelA = a();
        parcelA.writeLong(j8);
        c(12, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void setConditionalUserProperty(Bundle bundle, long j8) {
        Parcel parcelA = a();
        AbstractC0444c.zze(parcelA, bundle);
        parcelA.writeLong(j8);
        c(8, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void setConsent(Bundle bundle, long j8) {
        Parcel parcelA = a();
        AbstractC0444c.zze(parcelA, bundle);
        parcelA.writeLong(j8);
        c(44, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void setConsentThirdParty(Bundle bundle, long j8) {
        Parcel parcelA = a();
        AbstractC0444c.zze(parcelA, bundle);
        parcelA.writeLong(j8);
        c(45, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void setCurrentScreen(InterfaceC6172a interfaceC6172a, String str, String str2, long j8) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC6172a);
        parcelA.writeString(str);
        parcelA.writeString(str2);
        parcelA.writeLong(j8);
        c(15, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void setDataCollectionEnabled(boolean z8) {
        Parcel parcelA = a();
        AbstractC0444c.zzd(parcelA, z8);
        c(39, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelA = a();
        AbstractC0444c.zze(parcelA, bundle);
        c(42, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void setEventInterceptor(InterfaceC0458q interfaceC0458q) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC0458q);
        c(34, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void setInstanceIdProvider(InterfaceC0459s interfaceC0459s) {
        throw null;
    }

    @Override // B2.InterfaceC0452k
    public final void setMeasurementEnabled(boolean z8, long j8) {
        Parcel parcelA = a();
        AbstractC0444c.zzd(parcelA, z8);
        parcelA.writeLong(j8);
        c(11, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void setMinimumSessionDuration(long j8) {
        throw null;
    }

    @Override // B2.InterfaceC0452k
    public final void setSessionTimeoutDuration(long j8) {
        Parcel parcelA = a();
        parcelA.writeLong(j8);
        c(14, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void setUserId(String str, long j8) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeLong(j8);
        c(7, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void setUserProperty(String str, String str2, InterfaceC6172a interfaceC6172a, boolean z8, long j8) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        AbstractC0444c.zzf(parcelA, interfaceC6172a);
        AbstractC0444c.zzd(parcelA, z8);
        parcelA.writeLong(j8);
        c(4, parcelA);
    }

    @Override // B2.InterfaceC0452k
    public final void unregisterOnMeasurementEventListener(InterfaceC0458q interfaceC0458q) {
        Parcel parcelA = a();
        AbstractC0444c.zzf(parcelA, interfaceC0458q);
        c(36, parcelA);
    }
}
