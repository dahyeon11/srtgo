package I4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import com.h2osystech.smartalimi.aidllib.MSGVo;
import com.h2osystech.smartalimi.aidllib.SmartAgentInterface;
import com.h2osystech.smartalimi.servicealimi.MessageManager;
import java.util.ArrayList;
import java.util.Iterator;
import p4.C6054a;
import z4.C6630d;
import z4.t;
import z4.z;

/* loaded from: classes.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    private static g f2069c;

    /* renamed from: a, reason: collision with root package name */
    private ServiceConnection f2070a;

    /* renamed from: b, reason: collision with root package name */
    private SmartAgentInterface f2071b;

    class a implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f2072a;

        a(Context context) {
            this.f2072a = context;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            g.this.loginSmartAgent(this.f2072a, iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            g.this.f2071b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(IBinder iBinder, Context context) {
        try {
            SmartAgentInterface smartAgentInterfaceAsInterface = SmartAgentInterface.Stub.asInterface(iBinder, context);
            this.f2071b = smartAgentInterfaceAsInterface;
            smartAgentInterfaceAsInterface.enableLog(C6054a.IS_DEBUG_LOG);
            this.f2071b.setAppType(r4.g.PUSH_APPTYPE);
            this.f2071b.setServerIPPort(z.getPushAddress(), r4.g.PUSH_PORT);
            this.f2071b.setPhoneNumber("");
            this.f2071b.setBedgeCountPackage(context.getPackageName() + ".IntroActivity");
            this.f2071b.enableLog(C6054a.IS_DEBUG_LOG);
            boolean z8 = true;
            int login = this.f2071b.setLogin(h.getInstance().getCustNo(), "1", 1);
            if (C6630d.isNotNull(this.f2071b.getAllMsg())) {
                Iterator it = ((ArrayList) this.f2071b.getAllMsg()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z8 = false;
                        break;
                    } else if (((MSGVo) it.next()).getReadYN().equals("N")) {
                        break;
                    }
                }
                t.d("Push notificati : " + z8);
                h.getInstance().setNotificationExist(z8);
            } else {
                h.getInstance().setNotificationExist(false);
            }
            t.d("Push Login Result - " + login + " (Success = 0)");
        } catch (Exception e8) {
            t.e(e8.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(final IBinder iBinder, final Context context) {
        new Thread(new Runnable() { // from class: I4.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f2066a.e(iBinder, context);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        try {
            if (C6630d.isNotNull(this.f2071b)) {
                boolean logout = this.f2071b.setLogout();
                this.f2071b = null;
                h.getInstance().setNotificationExist(false);
                t.d("Push Logout Result - " + logout);
            }
        } catch (RemoteException e8) {
            t.e(e8.getMessage());
        }
    }

    public static g getInstance() {
        if (C6630d.isNull(f2069c)) {
            f2069c = new g();
        }
        return f2069c;
    }

    public void bindService(Context context) {
        t.e("bindService");
        this.f2070a = new a(context);
        context.bindService(new Intent(context, (Class<?>) MessageManager.class), this.f2070a, 1);
    }

    public SmartAgentInterface getSmartAgentInterface() {
        return this.f2071b;
    }

    public void loginSmartAgent(final Context context, final IBinder iBinder) {
        t.e("loginSmartAgent");
        new Handler().postDelayed(new Runnable() { // from class: I4.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f2063a.f(iBinder, context);
            }
        }, 1000L);
    }

    public void logoutSmartAgent() {
        t.e("logoutSmartAgent");
        new Thread(new Runnable() { // from class: I4.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f2062a.g();
            }
        }).start();
    }

    public void unBindService(Context context) {
        t.e("unBindService");
        if (C6630d.isNotNull(this.f2070a)) {
            try {
                context.unbindService(this.f2070a);
            } catch (Exception e8) {
                t.e(e8.getMessage());
            }
        }
    }
}
