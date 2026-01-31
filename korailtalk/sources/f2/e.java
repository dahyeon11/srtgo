package F2;

import android.content.Intent;
import android.os.IBinder;
import f2.C5394d;
import g2.C5539a;
import i2.AbstractC5670c;
import i2.InterfaceC5677j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

/* loaded from: classes2.dex */
public interface e extends C5539a.f {
    @Override // g2.C5539a.f
    /* synthetic */ void connect(AbstractC5670c.InterfaceC0311c interfaceC0311c);

    @Override // g2.C5539a.f
    /* synthetic */ void disconnect();

    @Override // g2.C5539a.f
    /* synthetic */ void disconnect(String str);

    @Override // g2.C5539a.f
    /* synthetic */ void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @Override // g2.C5539a.f
    /* synthetic */ C5394d[] getAvailableFeatures();

    @Override // g2.C5539a.f
    /* synthetic */ String getEndpointPackageName();

    @Override // g2.C5539a.f
    /* synthetic */ String getLastDisconnectMessage();

    @Override // g2.C5539a.f
    /* synthetic */ int getMinApkVersion();

    @Override // g2.C5539a.f
    /* synthetic */ void getRemoteService(InterfaceC5677j interfaceC5677j, Set set);

    @Override // g2.C5539a.f
    /* synthetic */ C5394d[] getRequiredFeatures();

    @Override // g2.C5539a.f
    /* synthetic */ Set getScopesForConnectionlessNonSignIn();

    @Override // g2.C5539a.f
    /* synthetic */ IBinder getServiceBrokerBinder();

    @Override // g2.C5539a.f
    /* synthetic */ Intent getSignInIntent();

    @Override // g2.C5539a.f
    /* synthetic */ boolean isConnected();

    @Override // g2.C5539a.f
    /* synthetic */ boolean isConnecting();

    @Override // g2.C5539a.f
    /* synthetic */ void onUserSignOut(AbstractC5670c.e eVar);

    @Override // g2.C5539a.f
    /* synthetic */ boolean providesSignIn();

    @Override // g2.C5539a.f
    /* synthetic */ boolean requiresAccount();

    @Override // g2.C5539a.f
    /* synthetic */ boolean requiresGooglePlayServices();

    @Override // g2.C5539a.f
    /* synthetic */ boolean requiresSignIn();

    void zaa();

    void zab();

    void zac(InterfaceC5677j interfaceC5677j, boolean z8);

    void zad(G2.f fVar);
}
