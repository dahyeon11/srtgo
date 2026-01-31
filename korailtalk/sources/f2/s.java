package f2;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
final class s extends x2.j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30585a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5397g f30586b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C5397g c5397g, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f30586b = c5397g;
        this.f30585a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i8 = message.what;
        if (i8 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i8);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int iIsGooglePlayServicesAvailable = this.f30586b.isGooglePlayServicesAvailable(this.f30585a);
        if (this.f30586b.isUserResolvableError(iIsGooglePlayServicesAvailable)) {
            this.f30586b.showErrorNotification(this.f30585a, iIsGooglePlayServicesAvailable);
        }
    }
}
