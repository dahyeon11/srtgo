package N0;

import H0.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: j, reason: collision with root package name */
    static final String f3164j = l.tagWithPrefix("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    private final ConnectivityManager f3165g;

    /* renamed from: h, reason: collision with root package name */
    private b f3166h;

    /* renamed from: i, reason: collision with root package name */
    private a f3167i;

    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            l.get().debug(e.f3164j, "Network broadcast received", new Throwable[0]);
            e eVar = e.this;
            eVar.setState(eVar.a());
        }
    }

    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            l.get().debug(e.f3164j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            e eVar = e.this;
            eVar.setState(eVar.a());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            l.get().debug(e.f3164j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.setState(eVar.a());
        }
    }

    public e(Context context, R0.a aVar) {
        super(context, aVar);
        this.f3165g = (ConnectivityManager) this.f3158b.getSystemService("connectivity");
        if (c()) {
            this.f3166h = new b();
        } else {
            this.f3167i = new a();
        }
    }

    private static boolean c() {
        return true;
    }

    L0.b a() {
        NetworkInfo activeNetworkInfo = this.f3165g.getActiveNetworkInfo();
        boolean z8 = false;
        boolean z9 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zB = b();
        boolean zIsActiveNetworkMetered = androidx.core.net.a.isActiveNetworkMetered(this.f3165g);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z8 = true;
        }
        return new L0.b(z9, zB, zIsActiveNetworkMetered, z8);
    }

    boolean b() {
        try {
            NetworkCapabilities networkCapabilities = this.f3165g.getNetworkCapabilities(this.f3165g.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException e8) {
            l.get().error(f3164j, "Unable to validate active network", e8);
            return false;
        }
    }

    @Override // N0.d
    public void startTracking() {
        if (!c()) {
            l.get().debug(f3164j, "Registering broadcast receiver", new Throwable[0]);
            this.f3158b.registerReceiver(this.f3167i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            l.get().debug(f3164j, "Registering network callback", new Throwable[0]);
            this.f3165g.registerDefaultNetworkCallback(this.f3166h);
        } catch (IllegalArgumentException | SecurityException e8) {
            l.get().error(f3164j, "Received exception while registering network callback", e8);
        }
    }

    @Override // N0.d
    public void stopTracking() {
        if (!c()) {
            l.get().debug(f3164j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f3158b.unregisterReceiver(this.f3167i);
            return;
        }
        try {
            l.get().debug(f3164j, "Unregistering network callback", new Throwable[0]);
            this.f3165g.unregisterNetworkCallback(this.f3166h);
        } catch (IllegalArgumentException | SecurityException e8) {
            l.get().error(f3164j, "Received exception while unregistering network callback", e8);
        }
    }

    @Override // N0.d
    public L0.b getInitialState() {
        return a();
    }
}
