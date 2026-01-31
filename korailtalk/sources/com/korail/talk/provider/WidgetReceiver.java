package com.korail.talk.provider;

import I4.h;
import Q7.X;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;
import androidx.core.view.accessibility.AbstractC0927b;
import com.korail.talk.network.BaseDaoHelper;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.IBase;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.IBaseResult;
import com.korail.talk.network.dao.research.ConvenienceSettingDao;
import com.korail.talk.network.dao.research.ConvenienceSettingDao.ConvenienceSettingRequest;
import m4.C5908a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.g;
import y4.C6536a;
import y4.C6537b;
import y4.C6538c;
import y4.C6539d;
import z4.C6630d;
import z4.H;
import z4.N;

/* loaded from: classes.dex */
public class WidgetReceiver extends BroadcastReceiver implements IBase, IBaseResult {

    /* renamed from: a, reason: collision with root package name */
    private Context f27553a;

    /* renamed from: b, reason: collision with root package name */
    private BaseDaoHelper f27554b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f27555c = {AbstractC5955f.widgetFavoriteText1, AbstractC5955f.widgetFavoriteText2, AbstractC5955f.widgetFavoriteText3};

    /* renamed from: d, reason: collision with root package name */
    private int[] f27556d = {AbstractC5955f.widgetFavoriteBuyText1, AbstractC5955f.widgetFavoriteBuyText2, AbstractC5955f.widgetFavoriteBuyText3};

    /* renamed from: e, reason: collision with root package name */
    private int[] f27557e = {153, 152, 151};

    private void a() {
        ConvenienceSettingDao convenienceSettingDao = new ConvenienceSettingDao();
        ConvenienceSettingDao.ConvenienceSettingRequest convenienceSettingRequest = convenienceSettingDao.new ConvenienceSettingRequest();
        String custNo = h.getInstance().getCustNo();
        if (C6630d.isNotNull(custNo) && !custNo.equals("")) {
            convenienceSettingRequest.setCustMgNo(h.getInstance().getCustNo());
        } else if (!H.getBoolean(this.f27553a, "KEY_AUTO_LOGIN")) {
            b(null);
            return;
        } else {
            Context context = this.f27553a;
            convenienceSettingRequest.setCustMgNo(C5908a.decryptAES(context, H.getString(context, "KEY_LOGIN_CUST_NO")));
        }
        convenienceSettingRequest.setMedDvCd("03");
        convenienceSettingRequest.setReqSqno("0");
        convenienceSettingDao.setRequest(convenienceSettingRequest);
        executeDao(convenienceSettingDao);
    }

    private void b(ConvenienceSettingDao.ConvenienceSettingResponse convenienceSettingResponse) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.f27553a);
        for (int i8 : appWidgetManager.getAppWidgetIds(new ComponentName(this.f27553a, (Class<?>) WidgetProvider.class))) {
            RemoteViews remoteViews = new RemoteViews(this.f27553a.getPackageName(), AbstractC5957h.widget_layout);
            Intent intent = new Intent(this.f27553a, (Class<?>) WidgetReceiver.class);
            intent.setAction("my.widget.action.FAVORITE_CLICK");
            remoteViews.setOnClickPendingIntent(AbstractC5955f.favorite_layout, PendingIntent.getBroadcast(this.f27553a, 0, intent, 201326592));
            Intent intent2 = new Intent(this.f27553a, (Class<?>) WidgetReceiver.class);
            intent2.setAction("my.widget.action.SEARCH_CLICK");
            remoteViews.setOnClickPendingIntent(AbstractC5955f.search_ticket_layout, PendingIntent.getBroadcast(this.f27553a, 0, intent2, 201326592));
            Intent intent3 = new Intent(this.f27553a, (Class<?>) WidgetReceiver.class);
            intent3.setAction("my.widget.action.CHECK_CLICK");
            remoteViews.setOnClickPendingIntent(AbstractC5955f.check_ticket_layout, PendingIntent.getBroadcast(this.f27553a, 0, intent3, 201326592));
            Intent intent4 = new Intent(this.f27553a, (Class<?>) WidgetReceiver.class);
            intent4.setAction("my.widget.action.MEMBERSHIP_CLICK");
            remoteViews.setOnClickPendingIntent(AbstractC5955f.membership_layout, PendingIntent.getBroadcast(this.f27553a, 0, intent4, 201326592));
            Intent intent5 = new Intent(this.f27553a, (Class<?>) WidgetReceiver.class);
            intent5.setAction("APPWIDGET_CLICK");
            remoteViews.setOnClickPendingIntent(AbstractC5955f.appwidget_refresh, PendingIntent.getBroadcast(this.f27553a, 0, intent5, 201326592));
            if (C6630d.isNotNull(convenienceSettingResponse) && C6630d.isNotNull(convenienceSettingResponse.getMainList())) {
                for (int i9 = 0; i9 < convenienceSettingResponse.getMainList().size(); i9++) {
                    ConvenienceSettingDao.CustTripInfo custTripInfo = convenienceSettingResponse.getMainList().get(i9);
                    remoteViews.setTextViewText(this.f27555c[i9], custTripInfo.getPtwtTtl() + X.SPACE + custTripInfo.getDptStnNm() + " → " + custTripInfo.getArvStnNm());
                    remoteViews.setViewVisibility(this.f27555c[i9], 0);
                    remoteViews.setViewVisibility(this.f27556d[i9], 0);
                    Intent intent6 = new Intent("android.intent.action.VIEW", Uri.parse(this.f27553a.getString(AbstractC5959j.navigation_booking)));
                    intent6.putExtra("FAVORITE_SELECT_INDEX", i9);
                    intent6.setFlags(1006632960);
                    remoteViews.setOnClickPendingIntent(this.f27555c[i9], PendingIntent.getActivity(this.f27553a, this.f27557e[i9], intent6, AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL));
                }
            } else {
                int i10 = 0;
                while (true) {
                    int[] iArr = this.f27555c;
                    if (i10 < iArr.length) {
                        remoteViews.setViewVisibility(iArr[i10], 8);
                        remoteViews.setViewVisibility(this.f27556d[i10], 8);
                        i10++;
                    }
                }
            }
            appWidgetManager.updateAppWidget(i8, remoteViews);
        }
    }

    @Override // com.korail.talk.network.IBase
    public void executeDao(IBaseDao iBaseDao) {
        iBaseDao.setBase(this);
        iBaseDao.setINetworkResult(this);
        this.f27554b.executeDao(iBaseDao);
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
        if (C6630d.isNotNull(this.f27554b)) {
            this.f27554b.onCancelDao();
        }
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

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("my.widget.action.FAVORITE_CLICK".equals(action)) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(context.getString(H.getBoolean(context, "KEY_AUTO_LOGIN") ? AbstractC5959j.navigation_web_view : AbstractC5959j.navigation_booking)));
            intent2.setFlags(872415232);
            intent2.putExtra("WEB_POST_URL", g.CONVENIENCE_SETTING_URL);
            context.startActivity(intent2);
            return;
        }
        if ("my.widget.action.SEARCH_CLICK".equals(action)) {
            Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("korailtalk://navigation?view=booking"));
            intent3.setFlags(872415232);
            context.startActivity(intent3);
            return;
        }
        if ("my.widget.action.CHECK_CLICK".equals(action)) {
            Intent intent4 = new Intent("android.intent.action.VIEW", Uri.parse("korailtalk://navigation?view=ticket"));
            intent4.setFlags(872415232);
            context.startActivity(intent4);
        } else if ("my.widget.action.MEMBERSHIP_CLICK".equals(action)) {
            Intent intent5 = new Intent("android.intent.action.VIEW", Uri.parse(context.getString(AbstractC5959j.navigation_member_card)));
            intent5.setFlags(872415232);
            context.startActivity(intent5);
        } else if ("APPWIDGET_CLICK".equals(action)) {
            this.f27553a = context;
            this.f27554b = new BaseDaoHelper();
            a();
        }
    }

    @Override // com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        b(null);
    }

    @Override // com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        b((ConvenienceSettingDao.ConvenienceSettingResponse) iBaseDao.getResponse());
    }
}
