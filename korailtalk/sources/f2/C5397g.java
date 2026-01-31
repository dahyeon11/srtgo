package f2;

import I2.AbstractC0608l;
import I2.AbstractC0611o;
import I2.InterfaceC0607k;
import K1.S0;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.r;
import androidx.fragment.app.ActivityC1010e;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C1105c;
import com.google.android.gms.common.api.internal.Z;
import d2.AbstractC5320a;
import g2.AbstractC5543e;
import g2.InterfaceC5545g;
import h2.AbstractC5605w;
import h2.C5606x;
import h2.InterfaceC5589f;
import i2.AbstractC5643B;
import i2.AbstractC5683p;
import i2.AbstractDialogInterfaceOnClickListenerC5647F;
import java.util.ArrayList;
import java.util.Arrays;
import x2.AbstractC6488e;

/* renamed from: f2.g */
/* loaded from: classes.dex */
public class C5397g extends C5398h {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    /* renamed from: b */
    private String f30571b;

    /* renamed from: c */
    private static final Object f30569c = new Object();

    /* renamed from: d */
    private static final C5397g f30570d = new C5397g();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C5398h.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static C5397g getInstance() {
        return f30570d;
    }

    public static final AbstractC0608l zai(InterfaceC5545g interfaceC5545g, InterfaceC5545g... interfaceC5545gArr) {
        AbstractC5683p.checkNotNull(interfaceC5545g, "Requested API must not be null.");
        for (InterfaceC5545g interfaceC5545g2 : interfaceC5545gArr) {
            AbstractC5683p.checkNotNull(interfaceC5545g2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(interfaceC5545gArr.length + 1);
        arrayList.add(interfaceC5545g);
        arrayList.addAll(Arrays.asList(interfaceC5545gArr));
        return C1105c.zal().zao(arrayList);
    }

    final Dialog a(Context context, int i8, AbstractDialogInterfaceOnClickListenerC5647F abstractDialogInterfaceOnClickListenerC5647F, DialogInterface.OnCancelListener onCancelListener) {
        if (i8 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(AbstractC5643B.zad(context, i8));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strZac = AbstractC5643B.zac(context, i8);
        if (strZac != null) {
            builder.setPositiveButton(strZac, abstractDialogInterfaceOnClickListenerC5647F);
        }
        String strZag = AbstractC5643B.zag(context, i8);
        if (strZag != null) {
            builder.setTitle(strZag);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i8)), new IllegalArgumentException());
        return builder.create();
    }

    final void b(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ActivityC1010e) {
                C5405o.newInstance(dialog, onCancelListener).show(((ActivityC1010e) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC5393c.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void c(Context context, int i8, String str, PendingIntent pendingIntent) {
        int i9;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i8), null), new IllegalArgumentException());
        if (i8 == 18) {
            d(context);
            return;
        }
        if (pendingIntent == null) {
            if (i8 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strZaf = AbstractC5643B.zaf(context, i8);
        String strZae = AbstractC5643B.zae(context, i8);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) AbstractC5683p.checkNotNull(context.getSystemService("notification"));
        r.m style = new r.m(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(strZaf).setStyle(new r.k().bigText(strZae));
        if (o2.j.isWearable(context)) {
            AbstractC5683p.checkState(o2.n.isAtLeastKitKatWatch());
            style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
            if (o2.j.isWearableWithoutPlayStore(context)) {
                style.addAction(AbstractC5320a.common_full_open_on_phone, resources.getString(d2.b.common_open_on_phone), pendingIntent);
            } else {
                style.setContentIntent(pendingIntent);
            }
        } else {
            style.setSmallIcon(R.drawable.stat_sys_warning).setTicker(resources.getString(d2.b.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(strZae);
        }
        if (o2.n.isAtLeastO()) {
            AbstractC5683p.checkState(o2.n.isAtLeastO());
            synchronized (f30569c) {
                str2 = this.f30571b;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String strZab = AbstractC5643B.zab(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(S0.a("com.google.android.gms.availability", strZab, 4));
                } else if (!strZab.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(strZab);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            style.setChannelId(str2);
        }
        Notification notificationBuild = style.build();
        if (i8 == 1 || i8 == 2 || i8 == 3) {
            AbstractC5402l.f30574a.set(false);
            i9 = 10436;
        } else {
            i9 = 39789;
        }
        notificationManager.notify(i9, notificationBuild);
    }

    public AbstractC0608l checkApiAvailability(AbstractC5543e abstractC5543e, AbstractC5543e... abstractC5543eArr) {
        return zai(abstractC5543e, abstractC5543eArr).onSuccessTask(new InterfaceC0607k() { // from class: f2.r
            @Override // I2.InterfaceC0607k
            public final AbstractC0608l then(Object obj) {
                int i8 = C5397g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return AbstractC0611o.forResult(null);
            }
        });
    }

    final void d(Context context) {
        new s(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @Override // f2.C5398h
    public int getClientVersion(Context context) {
        return super.getClientVersion(context);
    }

    public Dialog getErrorDialog(Activity activity, int i8, int i9) {
        return getErrorDialog(activity, i8, i9, (DialogInterface.OnCancelListener) null);
    }

    @Override // f2.C5398h
    public Intent getErrorResolutionIntent(Context context, int i8, String str) {
        return super.getErrorResolutionIntent(context, i8, str);
    }

    @Override // f2.C5398h
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i8, int i9) {
        return super.getErrorResolutionPendingIntent(context, i8, i9);
    }

    @Override // f2.C5398h
    public final String getErrorString(int i8) {
        return super.getErrorString(i8);
    }

    @Override // f2.C5398h
    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // f2.C5398h
    public final boolean isUserResolvableError(int i8) {
        return super.isUserResolvableError(i8);
    }

    public AbstractC0608l makeGooglePlayServicesAvailable(Activity activity) {
        int i8 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        AbstractC5683p.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i8);
        if (iIsGooglePlayServicesAvailable == 0) {
            return AbstractC0611o.forResult(null);
        }
        Z zZaa = Z.zaa(activity);
        zZaa.zah(new C5392b(iIsGooglePlayServicesAvailable, null), 0);
        return zZaa.zad();
    }

    public void setDefaultNotificationChannelId(Context context, String str) {
        if (o2.n.isAtLeastO()) {
            AbstractC5683p.checkNotNull(((NotificationManager) AbstractC5683p.checkNotNull(context.getSystemService("notification"))).getNotificationChannel(str));
        }
        synchronized (f30569c) {
            this.f30571b = str;
        }
    }

    public boolean showErrorDialogFragment(Activity activity, int i8, int i9) {
        return showErrorDialogFragment(activity, i8, i9, null);
    }

    public void showErrorNotification(Context context, int i8) {
        c(context, i8, null, getErrorResolutionPendingIntent(context, i8, 0, "n"));
    }

    public final Dialog zab(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(AbstractC5643B.zad(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        b(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final C5606x zac(Context context, AbstractC5605w abstractC5605w) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C5606x c5606x = new C5606x(abstractC5605w);
        context.registerReceiver(c5606x, intentFilter);
        c5606x.zaa(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return c5606x;
        }
        abstractC5605w.zaa();
        c5606x.zab();
        return null;
    }

    public final boolean zag(Activity activity, InterfaceC5589f interfaceC5589f, int i8, int i9, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogA = a(activity, i8, AbstractDialogInterfaceOnClickListenerC5647F.zad(interfaceC5589f, getErrorResolutionIntent(activity, i8, "d"), 2), onCancelListener);
        if (dialogA == null) {
            return false;
        }
        b(activity, dialogA, AbstractC5401k.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final boolean zah(Context context, C5392b c5392b, int i8) {
        PendingIntent errorResolutionPendingIntent;
        if (q2.b.isInstantApp(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, c5392b)) == null) {
            return false;
        }
        c(context, c5392b.getErrorCode(), null, AbstractC6488e.zaa(context, 0, GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i8, true), AbstractC6488e.zaa | 134217728));
        return true;
    }

    public Dialog getErrorDialog(Activity activity, int i8, int i9, DialogInterface.OnCancelListener onCancelListener) {
        return a(activity, i8, AbstractDialogInterfaceOnClickListenerC5647F.zab(activity, getErrorResolutionIntent(activity, i8, "d"), i9), onCancelListener);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, C5392b c5392b) {
        return c5392b.hasResolution() ? c5392b.getResolution() : getErrorResolutionPendingIntent(context, c5392b.getErrorCode(), 0);
    }

    @Override // f2.C5398h
    public int isGooglePlayServicesAvailable(Context context, int i8) {
        return super.isGooglePlayServicesAvailable(context, i8);
    }

    public boolean showErrorDialogFragment(Activity activity, int i8, int i9, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i8, i9, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        b(activity, errorDialog, AbstractC5401k.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public AbstractC0608l checkApiAvailability(InterfaceC5545g interfaceC5545g, InterfaceC5545g... interfaceC5545gArr) {
        return zai(interfaceC5545g, interfaceC5545gArr).onSuccessTask(new InterfaceC0607k() { // from class: f2.q
            @Override // I2.InterfaceC0607k
            public final AbstractC0608l then(Object obj) {
                int i8 = C5397g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return AbstractC0611o.forResult(null);
            }
        });
    }

    public void showErrorNotification(Context context, C5392b c5392b) {
        c(context, c5392b.getErrorCode(), null, getErrorResolutionPendingIntent(context, c5392b));
    }

    public Dialog getErrorDialog(Fragment fragment, int i8, int i9) {
        return getErrorDialog(fragment, i8, i9, (DialogInterface.OnCancelListener) null);
    }

    public Dialog getErrorDialog(Fragment fragment, int i8, int i9, DialogInterface.OnCancelListener onCancelListener) {
        return a(fragment.requireContext(), i8, AbstractDialogInterfaceOnClickListenerC5647F.zac(fragment, getErrorResolutionIntent(fragment.requireContext(), i8, "d"), i9), onCancelListener);
    }
}
