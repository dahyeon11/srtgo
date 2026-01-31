package z4;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.text.style.ForegroundColorSpan;
import com.korail.talk.data.login.DoNotLookAgainData;
import com.korail.talk.data.login.LoginPopUpData;
import com.korail.talk.database.model.DoNotLookAgain;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.ExecuteDao;
import com.korail.talk.network.dao.independent.IndependentService;
import com.korail.talk.ui.menu.DelayDiscountCouponActivity;
import com.korail.talk.ui.refund.RefundActivity;
import java.util.ArrayList;
import java.util.HashMap;
import n4.AbstractC5952c;
import n4.AbstractC5959j;
import q4.C6111b;
import s4.C6217a;
import s4.C6218b;
import s4.C6219c;
import s4.C6220d;
import s4.C6221e;
import s4.C6222f;
import s4.C6223g;

/* renamed from: z4.k */
/* loaded from: classes.dex */
public class C6637k {
    public static final int DIALOG_BUSINESS_TRIP_COUPON_INPUT = 5;
    public static final int DIALOG_CONNECTING_STATION = 6;
    public static final int DIALOG_DELAY_DISCOUNT_COUPON_INPUT = 4;
    public static final int DIALOG_DISCOUNT_COUPON_INPUT = 3;
    public static final int DIALOG_LOST_ARTICLE = 1;
    public static final int DIALOG_PASSENGER_INFO = 8;
    public static final int DIALOG_PERMISSION = 0;
    public static final int DIALOG_SEAT_INFO = 2;
    public static final int DIALOG_TRAIN_FARE = 7;

    /* renamed from: z4.k$a */
    private static class a extends AsyncTask {

        /* renamed from: a */
        private final HashMap f37902a;

        public a(HashMap<String, String> map) {
            this.f37902a = map;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IndependentService independentService = (IndependentService) new ExecuteDao().getService(IndependentService.class);
            if (!"MC".equals(this.f37902a.get("notiTpCd")) && !"MM".equals(this.f37902a.get("notiTpCd")) && !"MS".equals(this.f37902a.get("notiTpCd"))) {
                return null;
            }
            independentService.registerUserInfo(BaseRequest.ANDROID, "250601001", BaseRequest.APP_KEY, this.f37902a);
            return null;
        }
    }

    public static /* synthetic */ void c(ArrayList arrayList, Activity activity, DoNotLookAgain doNotLookAgain, DialogInterface dialogInterface, int i8, boolean z8, int i9) {
        arrayList.remove(0);
        showLoginDialog(activity, arrayList);
        if (102 == i8) {
            Intent intent = new Intent();
            if (i9 == 0) {
                intent = new Intent(activity, (Class<?>) RefundActivity.class);
            } else if (i9 == 1) {
                intent = new Intent(activity, (Class<?>) DelayDiscountCouponActivity.class);
            }
            activity.startActivity(intent);
        }
        if (z8) {
            doNotLookAgain.setConfirmDate(C6634h.addDay("yyyyMMdd", 7));
            C6111b.getInstance().insertDoNotLookAgainData(doNotLookAgain);
        }
    }

    public static /* synthetic */ void d(ArrayList arrayList, Activity activity, LoginPopUpData loginPopUpData, DialogInterface dialogInterface, int i8) {
        arrayList.remove(0);
        showLoginDialog(activity, arrayList);
        if (102 == i8) {
            HashMap<String, String> executeData = loginPopUpData.getExecuteData();
            if (C6630d.isNotNull(executeData)) {
                new a(executeData).execute(new Void[0]);
            }
            Class aClass = loginPopUpData.getAClass();
            if (C6630d.isNotNull(aClass)) {
                Intent intent = new Intent(activity, (Class<?>) aClass);
                if (N.isNotNull(loginPopUpData.getUrl())) {
                    intent.putExtra("IS_CLOSE_VIEW", true);
                    intent.putExtra("WEB_GET_URL", loginPopUpData.getUrl());
                }
                int requestCode = loginPopUpData.getRequestCode();
                if (requestCode >= 0) {
                    activity.startActivityForResult(intent, requestCode);
                } else {
                    activity.startActivity(intent);
                }
            }
        }
    }

    public static C6219c getCDialog(Context context, int i8, int i9, String str) {
        C6219c c6219c = new C6219c(context);
        c6219c.setType(i8);
        c6219c.setTheme(i9);
        c6219c.setTitle(str);
        return c6219c;
    }

    public static C6220d getCImageDialog(Context context, int i8, int i9, String str) {
        C6220d c6220d = new C6220d(context);
        c6220d.setType(i8);
        c6220d.setTheme(i9);
        return c6220d;
    }

    public static C6219c getDialog(int i8, Context context, int i9, int i10, String str) {
        C6219c c6217a = i8 == 0 ? new C6217a(context) : 1 == i8 ? new s4.p(context) : 2 == i8 ? new s4.x(context) : 3 == i8 ? new C6223g(context) : 4 == i8 ? new C6222f(context) : 5 == i8 ? new C6218b(context) : 6 == i8 ? new C6221e(context) : 7 == i8 ? new s4.y(context) : 8 == i8 ? new s4.u(context) : null;
        if (C6630d.isNotNull(c6217a)) {
            c6217a.setType(i9);
            c6217a.setTheme(i10);
            c6217a.setTitle(str);
        }
        return c6217a;
    }

    public static s4.o getLDialog(Context context, int i8, int i9, String str) {
        s4.o oVar = new s4.o(context);
        oVar.setType(i8);
        oVar.setTheme(i9);
        oVar.setTitle(str);
        return oVar;
    }

    public static s4.v getPDialog(Context context, int i8, int i9, String str) {
        s4.v vVar = new s4.v(context);
        vVar.setType(i8);
        vVar.setTheme(i9);
        vVar.setTitle(str);
        return vVar;
    }

    public static s4.w getRDialog(Context context, int i8, int i9, String str) {
        s4.w wVar = new s4.w(context);
        wVar.setType(i8);
        wVar.setTheme(i9);
        wVar.setTitle(str);
        return wVar;
    }

    public static s4.z getTrainPushDialog(Context context, int i8, int i9, int i10, String str) {
        s4.z zVar = new s4.z(context);
        zVar.setType(i8);
        zVar.setPushType(i9);
        zVar.setTheme(i10);
        zVar.setTitle(str);
        return zVar;
    }

    public static void showLoginDialog(final Activity activity, final ArrayList<LoginPopUpData> arrayList) {
        if (!C6630d.isNotNull(activity) || activity.isFinishing() || arrayList.isEmpty()) {
            return;
        }
        final LoginPopUpData loginPopUpData = arrayList.get(0);
        if (!(loginPopUpData instanceof DoNotLookAgainData)) {
            getCDialog(activity, loginPopUpData.getDialogType(), 0, loginPopUpData.getTitle()).setContent(loginPopUpData.isHasHtml() ? androidx.core.text.b.fromHtml(loginPopUpData.getMessage(), 0) : loginPopUpData.getMessage()).setCheckBoxMessage(loginPopUpData.getCheckBoxMessage()).setButtonNames(loginPopUpData.getBtnNames()).setButtonListener(new DialogInterface.OnClickListener() { // from class: z4.j
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    C6637k.d(arrayList, activity, loginPopUpData, dialogInterface, i8);
                }
            }).showDimDialog(loginPopUpData.isDim());
            return;
        }
        DoNotLookAgainData doNotLookAgainData = (DoNotLookAgainData) loginPopUpData;
        if (doNotLookAgainData.getDoNotLookAgainType() == 0) {
            final DoNotLookAgain doNotLookAgain = new DoNotLookAgain();
            doNotLookAgain.setCustMgNo(doNotLookAgainData.getCustMgNo());
            doNotLookAgain.setDoNotLookAgainType(doNotLookAgainData.getDoNotLookAgainType());
            DoNotLookAgain doNotLookAgainData2 = C6111b.getInstance().getDoNotLookAgainData(doNotLookAgain);
            if (C6630d.isNull(doNotLookAgainData2) || !C6634h.isBefore(C6634h.getToday("yyyyMMdd"), doNotLookAgainData2.getConfirmDate())) {
                getRDialog(activity, 1002, 0, loginPopUpData.getTitle()).setRadioGroup(activity.getResources().getStringArray(AbstractC5952c.delay_radio_message), 0).setContent(loginPopUpData.getMessage(), N.applySpannable(activity.getString(AbstractC5959j.dialog_delay_compensate_msg2), new ForegroundColorSpan(Color.parseColor("#fd4a4a")))).setCheckBoxMessage(loginPopUpData.getCheckBoxMessage()).setButtonNames(loginPopUpData.getBtnNames()).setButtonListener(new C6219c.d() { // from class: z4.i
                    @Override // s4.C6219c.d
                    public final void onClick(DialogInterface dialogInterface, int i8, boolean z8, int i9) {
                        C6637k.c(arrayList, activity, doNotLookAgain, dialogInterface, i8, z8, i9);
                    }
                }).showDialog();
            } else {
                arrayList.remove(0);
                showLoginDialog(activity, arrayList);
            }
        }
    }
}
