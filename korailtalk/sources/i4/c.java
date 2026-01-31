package I4;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.kakao.sdk.template.Constants;
import z4.C6630d;
import z4.t;

/* loaded from: classes.dex */
public class c implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    private LocationManager f2059a;

    /* renamed from: b, reason: collision with root package name */
    private Location f2060b;

    /* renamed from: c, reason: collision with root package name */
    private Location f2061c;

    private boolean a(String str) {
        return C6630d.isNotNull(this.f2059a) && this.f2059a.isProviderEnabled(str);
    }

    public Location getLastKnownLocation() {
        return this.f2060b;
    }

    public Location getLocation() {
        return this.f2061c;
    }

    public boolean isProviderEnabled() {
        return a("network") || a("gps");
    }

    public boolean isProviderEnabledLastKnownLocation() {
        return C6630d.isNotNull(this.f2059a) && isProviderEnabled() && C6630d.isNotNull(this.f2060b);
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        removeUpdates(this);
    }

    public void removeUpdates(LocationListener locationListener) {
        if (C6630d.isNotNull(this.f2059a)) {
            this.f2059a.removeUpdates(locationListener);
        }
    }

    public void requestLocationUpdates(Context context) {
        requestLocationUpdates(context, this);
    }

    public void setLocation(Location location) {
        this.f2061c = location;
    }

    public void requestLocationUpdates(Context context, LocationListener locationListener) {
        try {
            this.f2059a = (LocationManager) context.getSystemService(Constants.TYPE_LOCATION);
            boolean zA = a("network");
            boolean zA2 = a("gps");
            if (androidx.core.content.a.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 && androidx.core.content.a.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                if (zA) {
                    this.f2059a.requestLocationUpdates("network", 0L, 0.0f, locationListener);
                    Location lastKnownLocation = this.f2059a.getLastKnownLocation("network");
                    if (C6630d.isNotNull(lastKnownLocation)) {
                        this.f2060b = lastKnownLocation;
                    }
                } else if (zA2) {
                    this.f2059a.requestLocationUpdates("gps", 0L, 0.0f, locationListener);
                    Location lastKnownLocation2 = this.f2059a.getLastKnownLocation("gps");
                    if (C6630d.isNotNull(lastKnownLocation2)) {
                        this.f2060b = lastKnownLocation2;
                    }
                }
            }
        } catch (Exception e8) {
            t.e(e8.getMessage());
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i8, Bundle bundle) {
    }
}
