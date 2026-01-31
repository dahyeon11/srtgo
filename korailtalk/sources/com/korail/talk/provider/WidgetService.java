package com.korail.talk.provider;

import I4.h;
import K1.S0;
import Q7.X;
import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.app.r;
import androidx.core.view.accessibility.AbstractC0927b;
import com.korail.talk.network.BaseDaoHelper;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.IBase;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.IBaseResult;
import com.korail.talk.network.dao.research.ConvenienceSettingDao;
import com.korail.talk.network.dao.research.ConvenienceSettingDao.ConvenienceSettingRequest;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import n4.C5950a;
import r4.g;
import y4.C6536a;
import y4.C6537b;
import y4.C6538c;
import y4.C6539d;
import z4.C6630d;
import z4.H;
import z4.N;

/* loaded from: classes.dex */
public class WidgetService extends IntentService implements IBase, IBaseResult {

    /* renamed from: a, reason: collision with root package name */
    private BaseDaoHelper f27558a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f27559b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f27560c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f27561d;

    public WidgetService() {
        super("WidgetService");
        this.f27559b = new int[]{AbstractC5955f.widgetFavoriteText1, AbstractC5955f.widgetFavoriteText2, AbstractC5955f.widgetFavoriteText3};
        this.f27560c = new int[]{AbstractC5955f.widgetFavoriteBuyText1, AbstractC5955f.widgetFavoriteBuyText2, AbstractC5955f.widgetFavoriteBuyText3};
        this.f27561d = new int[]{153, 152, 151};
    }

    private void a() {
        if (C6630d.isNotNull(h.getInstance().getCustNo())) {
            ConvenienceSettingDao convenienceSettingDao = new ConvenienceSettingDao();
            ConvenienceSettingDao.ConvenienceSettingRequest convenienceSettingRequest = convenienceSettingDao.new ConvenienceSettingRequest();
            convenienceSettingRequest.setCustMgNo(h.getInstance().getCustNo());
            convenienceSettingRequest.setMedDvCd("03");
            convenienceSettingRequest.setReqSqno("0");
            convenienceSettingDao.setRequest(convenienceSettingRequest);
            executeDao(convenienceSettingDao);
        }
    }

    private void b(ConvenienceSettingDao.ConvenienceSettingResponse convenienceSettingResponse) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(this, (Class<?>) WidgetProvider.class));
        for (int i8 = 0; i8 < appWidgetIds.length; i8++) {
            RemoteViews remoteViews = new RemoteViews(getPackageName(), AbstractC5957h.widget_layout);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(getString(H.getBoolean(getApplicationContext(), "KEY_AUTO_LOGIN") ? AbstractC5959j.navigation_web_view : AbstractC5959j.navigation_booking)));
            intent.setFlags(872415232);
            intent.putExtra("WEB_POST_URL", g.CONVENIENCE_SETTING_URL);
            remoteViews.setOnClickPendingIntent(AbstractC5955f.favorite_layout, PendingIntent.getActivity(this, appWidgetIds[i8], intent, AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL));
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(getString(AbstractC5959j.navigation_booking)));
            intent2.setFlags(872415232);
            remoteViews.setOnClickPendingIntent(AbstractC5955f.search_ticket_layout, PendingIntent.getActivity(this, appWidgetIds[i8], intent2, AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL));
            Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse(getString(AbstractC5959j.navigation_ticket)));
            intent3.setFlags(872415232);
            remoteViews.setOnClickPendingIntent(AbstractC5955f.check_ticket_layout, PendingIntent.getActivity(this, appWidgetIds[i8], intent3, AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL));
            Intent intent4 = new Intent("android.intent.action.VIEW", Uri.parse(getString(AbstractC5959j.navigation_member_card)));
            intent4.setFlags(872415232);
            remoteViews.setOnClickPendingIntent(AbstractC5955f.membership_layout, PendingIntent.getActivity(this, appWidgetIds[i8], intent4, AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL));
            Intent intent5 = new Intent(this, (Class<?>) WidgetProvider.class);
            intent5.setAction("APPWIDGET_CLICK");
            intent5.putExtra("appWidgetId", appWidgetIds[i8]);
            remoteViews.setOnClickPendingIntent(AbstractC5955f.appwidget_refresh, PendingIntent.getBroadcast(this, appWidgetIds[i8], intent5, AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL));
            if (C6630d.isNotNull(convenienceSettingResponse) && C6630d.isNotNull(convenienceSettingResponse.getMainList())) {
                for (int i9 = 0; i9 < convenienceSettingResponse.getMainList().size(); i9++) {
                    ConvenienceSettingDao.CustTripInfo custTripInfo = convenienceSettingResponse.getMainList().get(i9);
                    remoteViews.setTextViewText(this.f27559b[i9], custTripInfo.getPtwtTtl() + X.SPACE + custTripInfo.getDptStnNm() + " → " + custTripInfo.getArvStnNm());
                    remoteViews.setViewVisibility(this.f27559b[i9], 0);
                    remoteViews.setViewVisibility(this.f27560c[i9], 0);
                    Intent intent6 = new Intent("android.intent.action.VIEW", Uri.parse(getString(AbstractC5959j.navigation_booking)));
                    intent6.putExtra("FAVORITE_SELECT_INDEX", i9);
                    intent6.setFlags(1006632960);
                    remoteViews.setOnClickPendingIntent(this.f27559b[i9], PendingIntent.getActivity(this, this.f27561d[i9], intent6, AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL));
                }
            } else {
                int i10 = 0;
                while (true) {
                    int[] iArr = this.f27559b;
                    if (i10 < iArr.length) {
                        remoteViews.setViewVisibility(iArr[i10], 8);
                        remoteViews.setViewVisibility(this.f27560c[i10], 8);
                        i10++;
                    }
                }
            }
            appWidgetManager.updateAppWidget(appWidgetIds[i8], remoteViews);
        }
    }

    @Override // com.korail.talk.network.IBase
    public void executeDao(IBaseDao iBaseDao) {
        iBaseDao.setBase(this);
        iBaseDao.setINetworkResult(this);
        this.f27558a.executeDao(iBaseDao);
    }

    @Override // com.korail.talk.network.IBase
    public void executeRetryDao() {
    }

    @Override // com.korail.talk.network.IBase
    public boolean isFinishing() {
        return false;
    }

    @Override // com.korail.talk.network.IBase
    public void onCancelDao() {
        if (C6630d.isNotNull(this.f27558a)) {
            this.f27558a.onCancelDao();
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(S0.a(C5950a.APPLICATION_ID, "일반공지", 0));
            startForeground(1, new r.m(this, C5950a.APPLICATION_ID).build());
        }
        b(null);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        this.f27558a = new BaseDaoHelper();
        a();
    }

    @Override // com.korail.talk.network.IBaseResult
    public void onIntegrationResult(IBaseDao iBaseDao, C6536a c6536a) {
        if (C6630d.isNull(c6536a)) {
            BaseResponse response = iBaseDao.getResponse();
            String strResult = response.getStrResult();
            String str = response.gethMsgCd();
            if (C6630d.isNull(response)) {
                c6536a = new C6537b();
            } else if (!"P058".equals(response.gethMsgCd()) && ("WRC000288".equals(str) || BaseResponse.FAIL.equals(strResult))) {
                String str2 = response.gethMsgTxt();
                c6536a = new C6536a(N.isNull(str2) ? "알수없는 오류가 발생하였습니다." : str2.replaceAll("<br>", X.LF));
            } else {
                c6536a = null;
            }
        }
        if (isFinishing()) {
            return;
        }
        if (C6630d.isNull(c6536a)) {
            onReceive(iBaseDao);
        } else {
            if ((c6536a instanceof C6537b) || (c6536a instanceof C6539d) || (c6536a instanceof C6538c)) {
                return;
            }
            onReceiveError(iBaseDao, c6536a);
        }
    }

    @Override // com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        b((ConvenienceSettingDao.ConvenienceSettingResponse) iBaseDao.getResponse());
    }

    @Override // com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        b(null);
    }
}
