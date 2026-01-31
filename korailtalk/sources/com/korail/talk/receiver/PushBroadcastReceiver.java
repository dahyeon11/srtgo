package com.korail.talk.receiver;

import K1.S0;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import androidx.core.app.r;
import androidx.core.app.w;
import com.h2osystech.smartalimi.aidllib.MSGVo;
import com.h2osystech.smartalimi.common.Const;
import n4.AbstractC5954e;
import n4.AbstractC5958i;
import n4.AbstractC5959j;
import n4.C5950a;
import n6.i;
import org.json.JSONException;
import org.json.JSONObject;
import z4.C6630d;
import z4.C6641o;
import z4.N;
import z4.t;
import z4.z;

/* loaded from: classes.dex */
public class PushBroadcastReceiver extends i {
    private PendingIntent e(MSGVo mSGVo) {
        Intent pushIntent = C6641o.getPushIntent(a(), N.getInteger(mSGVo.getTaskName()));
        String url = mSGVo.getUrl();
        if (N.isNull(url) || url.isEmpty()) {
            pushIntent.putExtra("msg_vo", mSGVo);
        } else {
            try {
                if (new JSONObject(mSGVo.getParam()).optString("isExternalBrowser").equals("Y")) {
                    pushIntent.setData(Uri.parse(url));
                    pushIntent.addFlags(268435456);
                } else {
                    pushIntent.setData(Uri.parse(c(AbstractC5959j.navigation_web_view)));
                    pushIntent.putExtra("WEB_POST_URL", z.getWebHost() + url);
                }
            } catch (JSONException e8) {
                t.e(e8.getMessage());
            }
        }
        return PendingIntent.getActivity(a(), 0, pushIntent, 201326592);
    }

    private void f(MSGVo mSGVo, int i8) {
        r.m number;
        String title = mSGVo.getTitle();
        String content = mSGVo.getContent();
        NotificationManager notificationManager = (NotificationManager) d("notification");
        notificationManager.cancelAll();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 26 || i8 <= 0) {
            if (i9 >= 26) {
                NotificationChannel notificationChannelA = S0.a(C5950a.APPLICATION_ID, "일반공지", 4);
                notificationChannelA.setShowBadge(false);
                notificationManager.createNotificationChannel(notificationChannelA);
            }
            number = new r.m(a(), C5950a.APPLICATION_ID).setContentTitle(title).setContentText(content).setTicker(mSGVo.getDate()).setSmallIcon(AbstractC5954e.ic_carrier).setLargeIcon(BitmapFactory.decodeResource(b(), AbstractC5958i.ic_launcher)).setContentIntent(e(mSGVo)).setStyle(new r.k().bigText(content)).setAutoCancel(true).setWhen(System.currentTimeMillis()).setSound(RingtoneManager.getDefaultUri(2)).setPriority(2).setNumber(i8);
            t.d("[2]setNumber : " + i8);
        } else {
            NotificationChannel notificationChannelA2 = S0.a("com.korail.talkemergency", "긴급공지", 4);
            notificationChannelA2.setShowBadge(true);
            notificationManager.createNotificationChannel(notificationChannelA2);
            number = new r.m(a(), "com.korail.talkemergency").setContentTitle(title).setContentText(content).setTicker(mSGVo.getDate()).setSmallIcon(AbstractC5954e.ic_carrier).setLargeIcon(BitmapFactory.decodeResource(b(), AbstractC5958i.ic_launcher)).setContentIntent(e(mSGVo)).setStyle(new r.k().bigText(content)).setAutoCancel(true).setWhen(System.currentTimeMillis()).setSound(RingtoneManager.getDefaultUri(2)).setPriority(2).setNumber(i8);
            t.d("[1]setNumber : " + i8);
        }
        w.from(a()).notify(1002, number.build());
        g();
    }

    private void g() {
        ((PowerManager) d("power")).newWakeLock(805306374, a().getClass().getName()).acquire(3000L);
    }

    @Override // n6.i, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if (intent.hasExtra(r.CATEGORY_MESSAGE)) {
            MSGVo mSGVo = (MSGVo) intent.getParcelableExtra(r.CATEGORY_MESSAGE);
            String param = mSGVo.getParam();
            int integer = N.getInteger(mSGVo.getNotiType());
            int integer2 = N.getInteger(mSGVo.getTaskName());
            int intExtra = intent.getIntExtra("badge", 0);
            Const.updateBadgetCount(context, intExtra);
            C6630d.printBundleData(intent.getExtras());
            t.e("badgeCount : " + intExtra + ", messageId : " + integer2 + ", notiType : " + integer + ", param : " + param);
            if (9 != integer) {
                f(mSGVo, intExtra);
            }
        }
    }
}
