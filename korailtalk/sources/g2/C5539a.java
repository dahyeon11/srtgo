package g2;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import f2.C5394d;
import g2.AbstractC5544f;
import h2.InterfaceC5587d;
import h2.InterfaceC5591h;
import i2.AbstractC5670c;
import i2.AbstractC5683p;
import i2.C5671d;
import i2.InterfaceC5677j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5539a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0301a f31277a;

    /* renamed from: b, reason: collision with root package name */
    private final g f31278b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31279c;

    /* renamed from: g2.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0301a extends e {
        @Deprecated
        public f buildClient(Context context, Looper looper, C5671d c5671d, Object obj, AbstractC5544f.b bVar, AbstractC5544f.c cVar) {
            return buildClient(context, looper, c5671d, obj, (InterfaceC5587d) bVar, (InterfaceC5591h) cVar);
        }

        public f buildClient(Context context, Looper looper, C5671d c5671d, Object obj, InterfaceC5587d interfaceC5587d, InterfaceC5591h interfaceC5591h) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: g2.a$b */
    public interface b {
    }

    /* renamed from: g2.a$c */
    public static class c {
    }

    /* renamed from: g2.a$d */
    public interface d {
        public static final b NO_OPTIONS = new b(null);

        /* renamed from: g2.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0302a extends d {
        }

        /* renamed from: g2.a$d$b */
        public static final class b implements d {
            /* synthetic */ b(t tVar) {
            }
        }
    }

    /* renamed from: g2.a$e */
    public static abstract class e {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public List<Scope> getImpliedScopes(Object obj) {
            return Collections.emptyList();
        }

        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: g2.a$f */
    public interface f extends b {
        void connect(AbstractC5670c.InterfaceC0311c interfaceC0311c);

        void disconnect();

        void disconnect(String str);

        void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        C5394d[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(InterfaceC5677j interfaceC5677j, Set<Scope> set);

        C5394d[] getRequiredFeatures();

        Set<Scope> getScopesForConnectionlessNonSignIn();

        IBinder getServiceBrokerBinder();

        Intent getSignInIntent();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(AbstractC5670c.e eVar);

        boolean providesSignIn();

        boolean requiresAccount();

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* renamed from: g2.a$g */
    public static final class g extends c {
    }

    public <C extends f> C5539a(String str, AbstractC0301a abstractC0301a, g gVar) {
        AbstractC5683p.checkNotNull(abstractC0301a, "Cannot construct an Api with a null ClientBuilder");
        AbstractC5683p.checkNotNull(gVar, "Cannot construct an Api with a null ClientKey");
        this.f31279c = str;
        this.f31277a = abstractC0301a;
        this.f31278b = gVar;
    }

    public final AbstractC0301a zaa() {
        return this.f31277a;
    }

    public final c zab() {
        return this.f31278b;
    }

    public final e zac() {
        return this.f31277a;
    }

    public final String zad() {
        return this.f31279c;
    }
}
