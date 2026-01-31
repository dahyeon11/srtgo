package com.korail.talk.provider;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import java.util.Iterator;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.C6630d;

/* loaded from: classes.dex */
public class WidgetProvider extends AppWidgetProvider {
    private boolean a(Context context) {
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (WidgetService.class.getName().equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i8;
        String action = intent.getAction();
        if (C6630d.isNotNull(action) && "APPWIDGET_CLICK".equals(action) && (("APPWIDGET_CLICK".equals(action) || "android.appwidget.action.APPWIDGET_UPDATE".equals(action)) && !a(context) && (i8 = Build.VERSION.SDK_INT) < 31)) {
            if (i8 >= 26) {
                context.startForegroundService(new Intent(context, (Class<?>) WidgetService.class));
            } else {
                context.startService(new Intent(context, (Class<?>) WidgetService.class));
            }
        }
        super.onReceive(context, intent);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 31) {
            if (i8 >= 26) {
                context.startForegroundService(new Intent(context, (Class<?>) WidgetService.class));
                return;
            } else {
                context.startService(new Intent(context, (Class<?>) WidgetService.class));
                return;
            }
        }
        for (int i9 : iArr) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), AbstractC5957h.widget_layout);
            Intent intent = new Intent(context, (Class<?>) WidgetReceiver.class);
            intent.setAction("my.widget.action.FAVORITE_CLICK");
            remoteViews.setOnClickPendingIntent(AbstractC5955f.favorite_layout, PendingIntent.getBroadcast(context, 0, intent, 201326592));
            Intent intent2 = new Intent(context, (Class<?>) WidgetReceiver.class);
            intent2.setAction("my.widget.action.SEARCH_CLICK");
            remoteViews.setOnClickPendingIntent(AbstractC5955f.search_ticket_layout, PendingIntent.getBroadcast(context, 0, intent2, 201326592));
            Intent intent3 = new Intent(context, (Class<?>) WidgetReceiver.class);
            intent3.setAction("my.widget.action.CHECK_CLICK");
            remoteViews.setOnClickPendingIntent(AbstractC5955f.check_ticket_layout, PendingIntent.getBroadcast(context, 0, intent3, 201326592));
            Intent intent4 = new Intent(context, (Class<?>) WidgetReceiver.class);
            intent4.setAction("my.widget.action.MEMBERSHIP_CLICK");
            remoteViews.setOnClickPendingIntent(AbstractC5955f.membership_layout, PendingIntent.getBroadcast(context, 0, intent4, 201326592));
            Intent intent5 = new Intent(context, (Class<?>) WidgetReceiver.class);
            intent5.setAction("APPWIDGET_CLICK");
            remoteViews.setOnClickPendingIntent(AbstractC5955f.appwidget_refresh, PendingIntent.getBroadcast(context, 0, intent5, 201326592));
            appWidgetManager.updateAppWidget(i9, remoteViews);
        }
    }
}
