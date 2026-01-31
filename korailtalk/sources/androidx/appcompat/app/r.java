package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.kakao.sdk.template.Constants;
import java.util.Calendar;

/* loaded from: classes.dex */
class r {

    /* renamed from: d, reason: collision with root package name */
    private static r f6452d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f6453a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f6454b;

    /* renamed from: c, reason: collision with root package name */
    private final a f6455c = new a();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f6456a;

        /* renamed from: b, reason: collision with root package name */
        long f6457b;

        /* renamed from: c, reason: collision with root package name */
        long f6458c;

        /* renamed from: d, reason: collision with root package name */
        long f6459d;

        /* renamed from: e, reason: collision with root package name */
        long f6460e;

        /* renamed from: f, reason: collision with root package name */
        long f6461f;

        a() {
        }
    }

    r(Context context, LocationManager locationManager) {
        this.f6453a = context;
        this.f6454b = locationManager;
    }

    static r a(Context context) {
        if (f6452d == null) {
            Context applicationContext = context.getApplicationContext();
            f6452d = new r(applicationContext, (LocationManager) applicationContext.getSystemService(Constants.TYPE_LOCATION));
        }
        return f6452d;
    }

    private Location b() {
        Location locationC = androidx.core.content.e.checkSelfPermission(this.f6453a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = androidx.core.content.e.checkSelfPermission(this.f6453a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f6454b.isProviderEnabled(str)) {
                return this.f6454b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean e() {
        return this.f6455c.f6461f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j8;
        a aVar = this.f6455c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        q qVarA = q.a();
        qVarA.calculateTwilight(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j9 = qVarA.sunset;
        qVarA.calculateTwilight(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z8 = qVarA.state == 1;
        long j10 = qVarA.sunrise;
        long j11 = qVarA.sunset;
        qVarA.calculateTwilight(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j12 = qVarA.sunrise;
        if (j10 == -1 || j11 == -1) {
            j8 = 43200000 + jCurrentTimeMillis;
        } else {
            j8 = (jCurrentTimeMillis > j11 ? j12 : jCurrentTimeMillis > j10 ? j11 : j10) + 60000;
        }
        aVar.f6456a = z8;
        aVar.f6457b = j9;
        aVar.f6458c = j10;
        aVar.f6459d = j11;
        aVar.f6460e = j12;
        aVar.f6461f = j8;
    }

    boolean d() {
        a aVar = this.f6455c;
        if (e()) {
            return aVar.f6456a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f6456a;
        }
        int i8 = Calendar.getInstance().get(11);
        return i8 < 6 || i8 >= 22;
    }
}
