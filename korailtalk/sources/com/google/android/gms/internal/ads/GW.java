package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.r;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import r2.InterfaceC6172a;

/* loaded from: classes2.dex */
public final class GW extends AbstractBinderC1527Jp {

    /* renamed from: a */
    final Map f13161a = new HashMap();

    /* renamed from: b */
    private final Context f13162b;

    /* renamed from: c */
    private final LQ f13163c;

    /* renamed from: d */
    private final L1.s f13164d;

    /* renamed from: e */
    private final C4535uW f13165e;

    /* renamed from: f */
    private String f13166f;

    /* renamed from: g */
    private String f13167g;

    public GW(Context context, C4535uW c4535uW, L1.s sVar, LQ lq) {
        this.f13162b = context;
        this.f13163c = lq;
        this.f13164d = sVar;
        this.f13165e = c4535uW;
    }

    private static String h(int i8, String str) {
        Resources resourcesZze = G1.u.zzo().zze();
        return resourcesZze == null ? str : resourcesZze.getString(i8);
    }

    private final void i(String str, String str2, Map map) {
        zzc(this.f13162b, this.f13163c, this.f13165e, str, str2, map);
    }

    private final void j(final Activity activity, final J1.u uVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        G1.u.zzp();
        if (androidx.core.app.w.from(activity).areNotificationsEnabled()) {
            zzu();
            k(activity, uVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                i(this.f13166f, "asnpdi", AbstractC2737el0.zzd());
                return;
            }
            G1.u.zzp();
            AlertDialog.Builder builderZzK = K1.K0.zzK(activity);
            builderZzK.setTitle(h(E1.d.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(h(E1.d.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zW
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                    this.zza.b(activity, uVar, dialogInterface, i8);
                }
            }).setNegativeButton(h(E1.d.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.AW
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.zza.c(uVar, dialogInterface, i8);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.BW
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.zza.d(uVar, dialogInterface);
                }
            });
            builderZzK.create().show();
            i(this.f13166f, "rtsdi", AbstractC2737el0.zzd());
        }
    }

    private final void k(Activity activity, final J1.u uVar) {
        AlertDialog alertDialogCreate;
        G1.u.zzp();
        AlertDialog.Builder onCancelListener = K1.K0.zzK(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.yW
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                J1.u uVar2 = uVar;
                if (uVar2 != null) {
                    uVar2.zzb();
                }
            }
        });
        int i8 = E1.c.offline_ads_dialog;
        Resources resourcesZze = G1.u.zzo().zze();
        XmlResourceParser layout = resourcesZze == null ? null : resourcesZze.getLayout(i8);
        if (layout == null) {
            onCancelListener.setMessage(h(E1.d.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            alertDialogCreate = onCancelListener.create();
        } else {
            View viewInflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            String strZzr = zzr();
            if (!strZzr.isEmpty()) {
                TextView textView = (TextView) viewInflate.findViewById(E1.b.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(strZzr);
            }
            AbstractC3624mW abstractC3624mW = (AbstractC3624mW) this.f13161a.get(this.f13166f);
            Drawable drawableA = abstractC3624mW != null ? abstractC3624mW.a() : null;
            if (drawableA != null) {
                ((ImageView) viewInflate.findViewById(E1.b.offline_dialog_image)).setImageDrawable(drawableA);
            }
            alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new FW(this, alertDialogCreate, timer, uVar), 3000L);
    }

    public static void zzc(Context context, LQ lq, C4535uW c4535uW, String str, String str2, Map map) {
        String strZze;
        String str3 = true != G1.u.zzo().zzA(context) ? "offline" : androidx.browser.customtabs.b.ONLINE_EXTRAS_KEY;
        if (lq != null) {
            KQ kqZza = lq.zza();
            kqZza.zzb("gqi", str);
            kqZza.zzb("action", str2);
            kqZza.zzb("device_connectivity", str3);
            kqZza.zzb("event_timestamp", String.valueOf(G1.u.zzB().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                kqZza.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            strZze = kqZza.zze();
        } else {
            strZze = "";
        }
        c4535uW.zzd(new C4877xW(G1.u.zzB().currentTimeMillis(), str, strZze, 2));
    }

    public static final PendingIntent zzq(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return AbstractC2617di0.zzb(context, 0, intent, AbstractC2617di0.zza | 1073741824, 0);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return AbstractC2617di0.zza(context, 0, intent, 201326592);
    }

    private final String zzr() {
        AbstractC3624mW abstractC3624mW = (AbstractC3624mW) this.f13161a.get(this.f13166f);
        return abstractC3624mW == null ? "" : abstractC3624mW.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzu() throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r6 = this;
            G1.u.zzp()     // Catch: android.os.RemoteException -> L22
            android.content.Context r0 = r6.f13162b     // Catch: android.os.RemoteException -> L22
            K1.W r0 = K1.K0.zzz(r0)     // Catch: android.os.RemoteException -> L22
            android.content.Context r1 = r6.f13162b     // Catch: android.os.RemoteException -> L22
            r2.a r1 = r2.b.wrap(r1)     // Catch: android.os.RemoteException -> L22
            I1.a r2 = new I1.a     // Catch: android.os.RemoteException -> L22
            java.lang.String r3 = r6.f13167g     // Catch: android.os.RemoteException -> L22
            java.lang.String r4 = r6.f13166f     // Catch: android.os.RemoteException -> L22
            java.util.Map r5 = r6.f13161a     // Catch: android.os.RemoteException -> L22
            java.lang.Object r5 = r5.get(r4)     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.internal.ads.mW r5 = (com.google.android.gms.internal.ads.AbstractC3624mW) r5     // Catch: android.os.RemoteException -> L22
            if (r5 != 0) goto L24
            java.lang.String r5 = ""
            goto L28
        L22:
            r0 = move-exception
            goto L42
        L24:
            java.lang.String r5 = r5.c()     // Catch: android.os.RemoteException -> L22
        L28:
            r2.<init>(r3, r4, r5)     // Catch: android.os.RemoteException -> L22
            boolean r1 = r0.zzg(r1, r2)     // Catch: android.os.RemoteException -> L22
            if (r1 != 0) goto L48
            android.content.Context r2 = r6.f13162b     // Catch: android.os.RemoteException -> L40
            r2.a r2 = r2.b.wrap(r2)     // Catch: android.os.RemoteException -> L40
            java.lang.String r3 = r6.f13167g     // Catch: android.os.RemoteException -> L40
            java.lang.String r4 = r6.f13166f     // Catch: android.os.RemoteException -> L40
            boolean r1 = r0.zzf(r2, r3, r4)     // Catch: android.os.RemoteException -> L40
            goto L48
        L40:
            r0 = move-exception
            goto L43
        L42:
            r1 = 0
        L43:
            java.lang.String r2 = "Failed to schedule offline notification poster."
            L1.n.zzh(r2, r0)
        L48:
            if (r1 != 0) goto L5c
            com.google.android.gms.internal.ads.uW r0 = r6.f13165e
            java.lang.String r1 = r6.f13166f
            r0.zzc(r1)
            java.lang.String r0 = r6.f13166f
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.el0 r2 = com.google.android.gms.internal.ads.AbstractC2737el0.zzd()
            r6.i(r0, r1, r2)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.GW.zzu():void");
    }

    final /* synthetic */ void b(Activity activity, J1.u uVar, DialogInterface dialogInterface, int i8) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        i(this.f13166f, "rtsdc", map);
        activity.startActivity(G1.u.zzq().zzf(activity));
        zzu();
        if (uVar != null) {
            uVar.zzb();
        }
    }

    final /* synthetic */ void c(J1.u uVar, DialogInterface dialogInterface, int i8) {
        this.f13165e.zzc(this.f13166f);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        i(this.f13166f, "rtsdc", map);
        if (uVar != null) {
            uVar.zzb();
        }
    }

    final /* synthetic */ void d(J1.u uVar, DialogInterface dialogInterface) {
        this.f13165e.zzc(this.f13166f);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        i(this.f13166f, "rtsdc", map);
        if (uVar != null) {
            uVar.zzb();
        }
    }

    final /* synthetic */ void e(Activity activity, J1.u uVar, DialogInterface dialogInterface, int i8) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        i(this.f13166f, "dialog_click", map);
        j(activity, uVar);
    }

    final /* synthetic */ void f(J1.u uVar, DialogInterface dialogInterface, int i8) {
        this.f13165e.zzc(this.f13166f);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        i(this.f13166f, "dialog_click", map);
        if (uVar != null) {
            uVar.zzb();
        }
    }

    final /* synthetic */ void g(J1.u uVar, DialogInterface dialogInterface) {
        this.f13165e.zzc(this.f13166f);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        i(this.f13166f, "dialog_click", map);
        if (uVar != null) {
            uVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1527Jp, com.google.android.gms.internal.ads.InterfaceC1568Kp
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zZzA = G1.u.zzo().zzA(this.f13162b);
            HashMap map = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c = true == zZzA ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = this.f13162b.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.f13162b.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            i(stringExtra2, "offline_notification_action", map);
            try {
                SQLiteDatabase writableDatabase = this.f13165e.getWritableDatabase();
                if (c == 1) {
                    this.f13165e.e(writableDatabase, this.f13164d, stringExtra2);
                } else {
                    C4535uW.f(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e8) {
                L1.n.zzg("Failed to get writable offline buffering database: ".concat(e8.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1527Jp, com.google.android.gms.internal.ads.InterfaceC1568Kp
    public final void zzf(String[] strArr, int[] iArr, InterfaceC6172a interfaceC6172a) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (strArr[i8].equals("android.permission.POST_NOTIFICATIONS")) {
                IW iw = (IW) r2.b.unwrap(interfaceC6172a);
                Activity activityZza = iw.zza();
                J1.u uVarZzb = iw.zzb();
                HashMap map = new HashMap();
                if (iArr[i8] == 0) {
                    map.put("dialog_action", "confirm");
                    zzu();
                    k(activityZza, uVarZzb);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (uVarZzb != null) {
                        uVarZzb.zzb();
                    }
                }
                i(this.f13166f, "asnpdc", map);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1527Jp, com.google.android.gms.internal.ads.InterfaceC1568Kp
    public final void zzg(InterfaceC6172a interfaceC6172a) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        IW iw = (IW) r2.b.unwrap(interfaceC6172a);
        final Activity activityZza = iw.zza();
        final J1.u uVarZzb = iw.zzb();
        this.f13166f = iw.zzc();
        this.f13167g = iw.zzd();
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziA)).booleanValue()) {
            j(activityZza, uVarZzb);
            return;
        }
        i(this.f13166f, "dialog_impression", AbstractC2737el0.zzd());
        G1.u.zzp();
        AlertDialog.Builder builderZzK = K1.K0.zzK(activityZza);
        builderZzK.setTitle(h(E1.d.offline_opt_in_title, "Open ad when you're back online.")).setMessage(h(E1.d.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(h(E1.d.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.CW
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                this.zza.e(activityZza, uVarZzb, dialogInterface, i8);
            }
        }).setNegativeButton(h(E1.d.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.DW
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.zza.f(uVarZzb, dialogInterface, i8);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.EW
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.zza.g(uVarZzb, dialogInterface);
            }
        });
        builderZzK.create().show();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1527Jp, com.google.android.gms.internal.ads.InterfaceC1568Kp
    public final void zzh() {
        final L1.s sVar = this.f13164d;
        this.f13165e.c(new InterfaceC1215Cc0() { // from class: com.google.android.gms.internal.ads.nW
            @Override // com.google.android.gms.internal.ads.InterfaceC1215Cc0
            public final Object zza(Object obj) {
                C4535uW.b(sVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1527Jp, com.google.android.gms.internal.ads.InterfaceC1568Kp
    public final void zzi(InterfaceC6172a interfaceC6172a, String str, String str2) {
        zzj(interfaceC6172a, new I1.a(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1527Jp, com.google.android.gms.internal.ads.InterfaceC1568Kp
    public final void zzj(InterfaceC6172a interfaceC6172a, I1.a aVar) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) r2.b.unwrap(interfaceC6172a);
        String str2 = aVar.zza;
        String str3 = aVar.zzb;
        String str4 = aVar.zzc;
        String strZzr = zzr();
        G1.u.zzq().zzh(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntentZzq = zzq(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentZzq2 = zzq(context, "offline_notification_dismissed", str3, str2);
        r.m mVar = new r.m(context, "offline_notification_channel");
        if (strZzr.isEmpty()) {
            mVar.setContentTitle(h(E1.d.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            mVar.setContentTitle(String.format(h(E1.d.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), strZzr));
        }
        mVar.setAutoCancel(true).setDeleteIntent(pendingIntentZzq2).setContentIntent(pendingIntentZzq).setSmallIcon(context.getApplicationInfo().icon).setPriority(((Integer) H1.C.zzc().zza(AbstractC4439th.zziB)).intValue());
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zziD)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                mVar.setLargeIcon(bitmapDecodeStream).setStyle(new r.j().bigPicture(bitmapDecodeStream).bigLargeIcon((Bitmap) null));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, mVar.build());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e8) {
            map.put("notification_not_shown_reason", e8.getMessage());
            str = "offline_notification_failed";
        }
        i(str3, str, map);
    }

    public final void zzp(String str, SL sl) {
        String string = "";
        String strZzx = !TextUtils.isEmpty(sl.zzx()) ? sl.zzx() : sl.zzB() != null ? sl.zzB() : "";
        InterfaceC2503cj interfaceC2503cjZzm = sl.zzm();
        if (interfaceC2503cjZzm != null) {
            try {
                string = interfaceC2503cjZzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        InterfaceC2503cj interfaceC2503cjZzn = sl.zzn();
        Drawable drawable = null;
        if (interfaceC2503cjZzn != null) {
            try {
                InterfaceC6172a interfaceC6172aZzf = interfaceC2503cjZzn.zzf();
                if (interfaceC6172aZzf != null) {
                    drawable = (Drawable) r2.b.unwrap(interfaceC6172aZzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f13161a.put(str, new C3170iW(strZzx, string, drawable));
    }
}
