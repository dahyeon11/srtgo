package D2;

import B2.n0;
import E2.c;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final n0 f909a;

    /* renamed from: D2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0018a extends E2.b {
    }

    public interface b extends c {
    }

    public a(n0 n0Var) {
        this.f909a = n0Var;
    }

    public static a getInstance(Context context) {
        return n0.zzg(context, null, null, null, null).zzd();
    }

    public void beginAdUnitExposure(String str) {
        this.f909a.zzu(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f909a.zzv(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.f909a.zzw(str);
    }

    public long generateEventId() {
        return this.f909a.zzb();
    }

    public String getAppIdOrigin() {
        return this.f909a.zzj();
    }

    public String getAppInstanceId() {
        return this.f909a.zzl();
    }

    public List<Bundle> getConditionalUserProperties(String str, String str2) {
        return this.f909a.zzp(str, str2);
    }

    public String getCurrentScreenClass() {
        return this.f909a.zzm();
    }

    public String getCurrentScreenName() {
        return this.f909a.zzn();
    }

    public String getGmpAppId() {
        return this.f909a.zzo();
    }

    public int getMaxUserProperties(String str) {
        return this.f909a.zza(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z8) {
        return this.f909a.zzq(str, str2, z8);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        this.f909a.zzy(str, str2, bundle);
    }

    public void logEventNoInterceptor(String str, String str2, Bundle bundle, long j8) {
        this.f909a.zzz(str, str2, bundle, j8);
    }

    public void performAction(Bundle bundle) {
        this.f909a.zzc(bundle, false);
    }

    public Bundle performActionWithResponse(Bundle bundle) {
        return this.f909a.zzc(bundle, true);
    }

    public void registerOnMeasurementEventListener(b bVar) {
        this.f909a.zzB(bVar);
    }

    public void setConditionalUserProperty(Bundle bundle) {
        this.f909a.zzD(bundle);
    }

    public void setConsent(Bundle bundle) {
        this.f909a.zzE(bundle);
    }

    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f909a.zzG(activity, str, str2);
    }

    public void setEventInterceptor(InterfaceC0018a interfaceC0018a) {
        this.f909a.zzJ(interfaceC0018a);
    }

    public void setMeasurementEnabled(Boolean bool) {
        this.f909a.zzK(bool);
    }

    public void setUserProperty(String str, String str2, Object obj) {
        this.f909a.zzN(str, str2, obj, true);
    }

    public void unregisterOnMeasurementEventListener(b bVar) {
        this.f909a.zzO(bVar);
    }

    public final void zza(boolean z8) {
        this.f909a.zzH(z8);
    }

    public void setMeasurementEnabled(boolean z8) {
        this.f909a.zzK(Boolean.valueOf(z8));
    }

    public static a getInstance(Context context, String str, String str2, String str3, Bundle bundle) {
        return n0.zzg(context, str, str2, str3, bundle).zzd();
    }
}
