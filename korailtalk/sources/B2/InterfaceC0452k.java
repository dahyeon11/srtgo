package B2;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import r2.InterfaceC6172a;

/* renamed from: B2.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0452k extends IInterface {
    void beginAdUnitExposure(String str, long j8);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j8);

    void endAdUnitExposure(String str, long j8);

    void generateEventId(InterfaceC0455n interfaceC0455n);

    void getAppInstanceId(InterfaceC0455n interfaceC0455n);

    void getCachedAppInstanceId(InterfaceC0455n interfaceC0455n);

    void getConditionalUserProperties(String str, String str2, InterfaceC0455n interfaceC0455n);

    void getCurrentScreenClass(InterfaceC0455n interfaceC0455n);

    void getCurrentScreenName(InterfaceC0455n interfaceC0455n);

    void getGmpAppId(InterfaceC0455n interfaceC0455n);

    void getMaxUserProperties(String str, InterfaceC0455n interfaceC0455n);

    void getTestFlag(InterfaceC0455n interfaceC0455n, int i8);

    void getUserProperties(String str, String str2, boolean z8, InterfaceC0455n interfaceC0455n);

    void initForTests(Map map);

    void initialize(InterfaceC6172a interfaceC6172a, C0460t c0460t, long j8);

    void isDataCollectionEnabled(InterfaceC0455n interfaceC0455n);

    void logEvent(String str, String str2, Bundle bundle, boolean z8, boolean z9, long j8);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC0455n interfaceC0455n, long j8);

    void logHealthData(int i8, String str, InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2, InterfaceC6172a interfaceC6172a3);

    void onActivityCreated(InterfaceC6172a interfaceC6172a, Bundle bundle, long j8);

    void onActivityDestroyed(InterfaceC6172a interfaceC6172a, long j8);

    void onActivityPaused(InterfaceC6172a interfaceC6172a, long j8);

    void onActivityResumed(InterfaceC6172a interfaceC6172a, long j8);

    void onActivitySaveInstanceState(InterfaceC6172a interfaceC6172a, InterfaceC0455n interfaceC0455n, long j8);

    void onActivityStarted(InterfaceC6172a interfaceC6172a, long j8);

    void onActivityStopped(InterfaceC6172a interfaceC6172a, long j8);

    void performAction(Bundle bundle, InterfaceC0455n interfaceC0455n, long j8);

    void registerOnMeasurementEventListener(InterfaceC0458q interfaceC0458q);

    void resetAnalyticsData(long j8);

    void setConditionalUserProperty(Bundle bundle, long j8);

    void setConsent(Bundle bundle, long j8);

    void setConsentThirdParty(Bundle bundle, long j8);

    void setCurrentScreen(InterfaceC6172a interfaceC6172a, String str, String str2, long j8);

    void setDataCollectionEnabled(boolean z8);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(InterfaceC0458q interfaceC0458q);

    void setInstanceIdProvider(InterfaceC0459s interfaceC0459s);

    void setMeasurementEnabled(boolean z8, long j8);

    void setMinimumSessionDuration(long j8);

    void setSessionTimeoutDuration(long j8);

    void setUserId(String str, long j8);

    void setUserProperty(String str, String str2, InterfaceC6172a interfaceC6172a, boolean z8, long j8);

    void unregisterOnMeasurementEventListener(InterfaceC0458q interfaceC0458q);
}
