package z4;

import Q7.X;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.korail.talk.network.dao.common.MaasMenuListDao;
import com.korail.talk.ui.booking.mainBooking.MaasMainCalendarActivity;
import com.korail.talk.ui.booking.mainBooking.MaasSelectStationActivity;
import com.korail.talk.ui.limousine.LimousineActivity;
import com.korail.talk.ui.limousine.RenewalLimousineActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import n4.AbstractC5959j;
import p4.C6054a;
import s4.C6219c;

/* loaded from: classes.dex */
public class w extends C6632f {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Context context, DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            dialogInterface.dismiss();
        } else if (102 == i8) {
            C6641o.moveToLogin(context);
        }
    }

    public static void moveToMaasService(final Context context, MaasMenuListDao.Menu menu, String str, String str2) {
        if (!C6630d.isNotNull(menu) || !"Y".equals(menu.getActive())) {
            t.d(menu.getName() + "'s Active = N");
            return;
        }
        if ("Y".equals(menu.getLogin()) && !I4.h.getInstance().isLogin()) {
            C6219c cDialog = C6637k.getCDialog(context, 1002, 0, context.getString(AbstractC5959j.common_guide));
            cDialog.setContent(context.getString(AbstractC5959j.msg_need_go_login));
            cDialog.setPositiveButtonText(context.getString(AbstractC5959j.msg_need_go_confirm));
            cDialog.setButtonListener(new DialogInterface.OnClickListener() { // from class: z4.v
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    w.d(context, dialogInterface, i8);
                }
            });
            cDialog.showDialog();
            return;
        }
        if ("N".equals(menu.getType())) {
            C6641o.navigation(context, C6054a.IS_LIMOUSINE_TEST ? RenewalLimousineActivity.class : LimousineActivity.class);
            return;
        }
        String info = menu.getInfo() != null ? menu.getInfo() : "";
        String poppImg = menu.getPoppImg() != null ? menu.getPoppImg() : "";
        if ("Y".equals(menu.getAppData())) {
            Intent intent = new Intent(context, (Class<?>) MaasSelectStationActivity.class);
            intent.putExtra("MAAS_TITLE", menu.getName() + X.SPACE + C6632f.a(context, AbstractC5959j.maas_title_station));
            intent.putExtra("MAAS_ADDSRVDVCD", menu.getAddSrvDvCd());
            if (!info.isEmpty()) {
                intent.putExtra("MAAS_INFO", menu.getInfo());
            }
            if (!poppImg.isEmpty()) {
                intent.putExtra("MAAS_POPUP_IMAGE", menu.getPoppImg());
            }
            ((Activity) context).startActivityForResult(intent, 135);
            return;
        }
        if ("C".equals(menu.getAppData())) {
            Intent intent2 = new Intent(context, (Class<?>) MaasMainCalendarActivity.class);
            intent2.putExtra("MAAS_TITLE", menu.getName() + X.SPACE + C6632f.a(context, AbstractC5959j.maas_title_calendar));
            intent2.putExtra("MAAS_CALENDAR", true);
            if (!info.isEmpty()) {
                intent2.putExtra("MAAS_INFO", menu.getInfo());
            }
            if (!poppImg.isEmpty()) {
                intent2.putExtra("MAAS_POPUP_IMAGE", menu.getPoppImg());
            }
            ((Activity) context).startActivityForResult(intent2, 137);
            return;
        }
        if ("길안내".equals(menu.getName())) {
            Intent intent3 = new Intent(context, (Class<?>) IntegrationWebViewActivity.class);
            intent3.putExtra("WEB_GET_URL", menu.getUrl());
            intent3.putExtra("WEB_GET_PARAMETER", "custNo=" + I4.h.getInstance().getCustNo() + "&mbCrdNo=" + I4.h.getInstance().getMemberNum() + "&curLng=" + str2 + "&curLat=" + str);
            if (!info.isEmpty()) {
                intent3.putExtra("MAAS_INFO", menu.getInfo());
            }
            if (!poppImg.isEmpty()) {
                intent3.putExtra("MAAS_POPUP_IMAGE", menu.getPoppImg());
            }
            context.startActivity(intent3);
            return;
        }
        if ("열차위치".equals(menu.getName())) {
            t.d("url : TRAIN_LOCATION_WEBVIEW_URL", menu.getUrl());
            Intent intent4 = new Intent(context, (Class<?>) IntegrationWebViewActivity.class);
            intent4.putExtra("WEB_POST_URL", menu.getUrl());
            intent4.putExtra("IS_MAP_VIEW", true);
            intent4.putExtra("IS_CLOSE_VIEW", true);
            intent4.putExtra("WEB_POST_PARAMETER", "route=main&custNo=" + I4.h.getInstance().getCustNo() + "&mbCrdNo=" + I4.h.getInstance().getMemberNum() + "&lon=" + str2 + "&lat=" + str);
            if (!info.isEmpty()) {
                intent4.putExtra("MAAS_INFO", menu.getInfo());
            }
            if (!poppImg.isEmpty()) {
                intent4.putExtra("MAAS_POPUP_IMAGE", menu.getPoppImg());
            }
            context.startActivity(intent4);
            return;
        }
        if ("M30".equals(menu.getAppData()) || "M10".equals(menu.getAppData())) {
            Intent intent5 = new Intent(context, (Class<?>) MaasSelectStationActivity.class);
            intent5.putExtra("MAAS_TITLE", menu.getName() + X.SPACE + C6632f.a(context, AbstractC5959j.maas_title_station));
            intent5.putExtra("MAAS_ADDSRVDVCD", menu.getAddSrvDvCd());
            intent5.putExtra("MAAS_RENTCAR_UI", menu.getAppData());
            if (!info.isEmpty()) {
                intent5.putExtra("MAAS_INFO", menu.getInfo());
            }
            if (!poppImg.isEmpty()) {
                intent5.putExtra("MAAS_POPUP_IMAGE", menu.getPoppImg());
            }
            ((Activity) context).startActivityForResult(intent5, 135);
            return;
        }
        if (!"커피&빵".equals(menu.getName()) && !menu.getUrl().contains("happyorder.co.kr")) {
            Intent intent6 = new Intent(context, (Class<?>) IntegrationWebViewActivity.class);
            intent6.putExtra("WEB_POST_URL", menu.getUrl());
            if (I4.h.getInstance().getCustNo() != null) {
                intent6.putExtra("WEB_GET_PARAMETER", "custNo=" + I4.h.getInstance().getCustNo() + "&mbCrdNo=" + I4.h.getInstance().getMemberNum());
            }
            if (!info.isEmpty()) {
                intent6.putExtra("MAAS_INFO", menu.getInfo());
            }
            if (!poppImg.isEmpty()) {
                intent6.putExtra("MAAS_POPUP_IMAGE", menu.getPoppImg());
            }
            context.startActivity(intent6);
            return;
        }
        Intent intent7 = new Intent(context, (Class<?>) IntegrationWebViewActivity.class);
        intent7.putExtra("WEB_GET_URL", menu.getUrl());
        intent7.putExtra("IS_MAP_VIEW", true);
        intent7.putExtra("IS_MAAS_URL", true);
        if (I4.h.getInstance().getCustNo() != null) {
            intent7.putExtra("WEB_GET_PARAMETER", "custNo=" + I4.h.getInstance().getCustNo() + "&mbCrdNo=" + I4.h.getInstance().getMemberNum());
        }
        if (!info.isEmpty()) {
            intent7.putExtra("MAAS_INFO", menu.getInfo());
        }
        if (!poppImg.isEmpty()) {
            intent7.putExtra("MAAS_POPUP_IMAGE", menu.getPoppImg());
        }
        context.startActivity(intent7);
    }
}
