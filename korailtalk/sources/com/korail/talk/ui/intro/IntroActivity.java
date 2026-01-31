package com.korail.talk.ui.intro;

import I4.h;
import Q7.X;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.AbstractC0918b;
import com.korail.talk.application.KTApplication;
import com.korail.talk.data.ReceiveSRTData;
import com.korail.talk.data.login.LoginPopUpData;
import com.korail.talk.database.model.MainPopupData;
import com.korail.talk.database.model.StationData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.cache.AppDataDao;
import com.korail.talk.network.dao.cache.NoticeDao;
import com.korail.talk.network.dao.cache.ServiceCheckDao;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.network.dao.common.CommonCodeDao.CommonCodeRequest;
import com.korail.talk.network.dao.common.StationDataDao;
import com.korail.talk.network.dao.common.StationInfoDao;
import com.korail.talk.network.dao.login.AutoLoginDao;
import com.korail.talk.network.dao.login.LoginDao;
import com.korail.talk.network.dao.schedule.TrainCalendarDao;
import com.korail.talk.ui.booking.mainBooking.MainBookingActivity;
import com.korail.talk.ui.booking.mainBooking.OldMainBookingActivity;
import com.korail.talk.ui.login.member.LoginActivity;
import com.korail.talk.view.base.BaseActivity;
import f2.C5397g;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kr.scripters.dynapath.sdk.android.DynaPathException;
import kr.scripters.dynapath.sdk.android.DynaPathMobileSDK;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import org.json.JSONException;
import org.json.JSONObject;
import p4.C6054a;
import q4.C6111b;
import r4.g;
import z4.C6630d;
import z4.C6631e;
import z4.C6634h;
import z4.C6637k;
import z4.C6641o;
import z4.E;
import z4.G;
import z4.H;
import z4.N;
import z4.P;
import z4.q;
import z4.t;
import z4.u;
import z4.y;

/* loaded from: classes.dex */
public class IntroActivity extends BaseActivity {
    public static final String INTRO_TEXT_COLOR = "#456d63";

    /* renamed from: e */
    private final int f28071e = 1004;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(IntroActivity.this.getApplicationContext(), IntroActivity.this.getString(AbstractC5959j.main_login_disable), 1).show();
        }
    }

    private class b extends AsyncTask {
        private b() {
        }

        private void a(List list) {
            C6111b c6111b = C6111b.getInstance();
            c6111b.deleteAllStationList();
            for (int i8 = 0; i8 < list.size(); i8++) {
                StationDataDao.STN stn = (StationDataDao.STN) list.get(i8);
                StationData stationData = new StationData();
                stationData.setId(i8);
                stationData.setStnCd(stn.getStn_cd());
                stationData.setStnNm(stn.getStn_nm());
                stationData.setLongitude(stn.getLongitude());
                stationData.setLatitude(stn.getLatitude());
                stationData.setGroup(stn.getGroup());
                stationData.setMajor(stn.getMajor());
                stationData.setPopupType(stn.getPopupType());
                stationData.setPopupMessage(stn.getPopupMessage());
                stationData.setDoNotLookADay("");
                stationData.setDoNotLookAgain(false);
                stationData.setPopupLinkTitle(stn.getPopupLinkTitle());
                stationData.setPopupLinkUrl(stn.getPopupLinkUrl());
                c6111b.insertStationList(stationData);
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public Void doInBackground(List... listArr) {
            a(listArr[0]);
            return null;
        }

        @Override // android.os.AsyncTask
        /* renamed from: c */
        public void onPostExecute(Void r22) {
            super.onPostExecute(r22);
            if (H.getBoolean(IntroActivity.this.getApplicationContext(), "KEY_AUTO_LOGIN")) {
                IntroActivity.this.I();
            } else {
                IntroActivity.this.v0();
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            ((TextView) IntroActivity.this.findViewById(AbstractC5955f.loadingMsgTxt)).setText(IntroActivity.this.getString(AbstractC5959j.intro_saving_station_info));
        }

        /* synthetic */ b(IntroActivity introActivity, a aVar) {
            this();
        }
    }

    private static class c extends AsyncTask {

        /* renamed from: a */
        private final int f28074a;

        /* renamed from: b */
        private final Context f28075b;

        /* renamed from: c */
        private final CommonCodeDao.ImageDownLoadData f28076c;

        /* synthetic */ c(Context context, CommonCodeDao.ImageDownLoadData imageDownLoadData, a aVar) {
            this(context, imageDownLoadData);
        }

        /* JADX WARN: Removed duplicated region for block: B:84:0x00c8 A[PHI: r0
  0x00c8: PHI (r0v5 javax.net.ssl.HttpsURLConnection) = (r0v4 javax.net.ssl.HttpsURLConnection), (r0v9 javax.net.ssl.HttpsURLConnection) binds: [B:87:0x00d7, B:83:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Void doInBackground(java.lang.Void... r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.String r11 = "thumbs"
                com.korail.talk.network.dao.common.CommonCodeDao$ImageDownLoadData r0 = r10.f28076c
                boolean r0 = z4.C6630d.isNotNull(r0)
                r1 = 0
                if (r0 == 0) goto Le4
                java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
                com.korail.talk.network.dao.common.CommonCodeDao$ImageDownLoadData r2 = r10.f28076c     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
                java.lang.String r2 = r2.getUrl()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
                r3 = 30
                if (r2 > r3) goto L2f
                java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
                com.korail.talk.network.dao.common.CommonCodeDao$ImageDownLoadData r2 = r10.f28076c     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
                java.lang.String r2 = r2.getSubUrl()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
                goto L2f
            L28:
                r11 = move-exception
                goto Lda
            L2b:
                r11 = move-exception
                r0 = r1
                goto Lcc
            L2f:
                java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
                javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
                r2 = 10000(0x2710, float:1.4013E-41)
                r0.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                r0.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                r2 = 1
                r0.setDoInput(r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                r0.connect()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                int r2 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                r4 = 200(0xc8, float:2.8E-43)
                if (r4 != r2) goto Lc2
                java.lang.String r2 = "루트 안의 이전 이미지 삭제"
                z4.t.e(r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                android.content.Context r2 = r10.f28075b     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                java.io.File r2 = z4.C6639m.getFolder(r2, r11)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                z4.C6639m.deleteDir(r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                java.io.InputStream r2 = r0.getInputStream()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                r4.<init>()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                r5 = 4096(0x1000, float:5.74E-42)
                byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            L67:
                int r6 = r2.read(r5)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                r7 = -1
                if (r6 == r7) goto L78
                r7 = 0
                r4.write(r5, r7, r6)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                goto L67
            L73:
                r11 = move-exception
                r1 = r0
                goto Lda
            L76:
                r11 = move-exception
                goto Lcc
            L78:
                android.content.Context r5 = r10.f28075b     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                com.korail.talk.network.dao.common.CommonCodeDao$ImageDownLoadData r6 = r10.f28076c     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                java.lang.String r6 = r6.getUrl()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                java.io.File r5 = z4.C6639m.getMD5File(r5, r11, r6)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                if (r6 > r3) goto L94
                android.content.Context r3 = r10.f28075b     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                com.korail.talk.network.dao.common.CommonCodeDao$ImageDownLoadData r5 = r10.f28076c     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                java.lang.String r5 = r5.getSubUrl()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                java.io.File r5 = z4.C6639m.getMD5File(r3, r11, r5)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            L94:
                boolean r11 = z4.C6630d.isNotNull(r5)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                if (r11 == 0) goto Lbc
                java.io.File r11 = r5.getParentFile()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                long r6 = z4.C6639m.getAvailableStorageSize(r11)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                byte[] r11 = r4.toByteArray()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                int r11 = r11.length     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                long r8 = (long) r11     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r11 < 0) goto Lbc
                java.lang.String r11 = "저장 이미지 확보"
                z4.t.e(r11)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                r11.<init>(r5)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                r4.writeTo(r11)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                r11.close()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            Lbc:
                r2.close()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                r4.close()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            Lc2:
                boolean r11 = z4.C6630d.isNotNull(r0)
                if (r11 == 0) goto Le4
            Lc8:
                r0.disconnect()
                goto Le4
            Lcc:
                java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> L73
                z4.t.e(r11)     // Catch: java.lang.Throwable -> L73
                boolean r11 = z4.C6630d.isNotNull(r0)
                if (r11 == 0) goto Le4
                goto Lc8
            Lda:
                boolean r0 = z4.C6630d.isNotNull(r1)
                if (r0 == 0) goto Le3
                r1.disconnect()
            Le3:
                throw r11
            Le4:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.korail.talk.ui.intro.IntroActivity.c.doInBackground(java.lang.Void[]):java.lang.Void");
        }

        private c(Context context, CommonCodeDao.ImageDownLoadData imageDownLoadData) {
            this.f28074a = 4096;
            this.f28075b = context;
            this.f28076c = imageDownLoadData;
        }
    }

    public /* synthetic */ void A0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            finish();
            return;
        }
        if (102 == i8) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 33) {
                AbstractC0918b.requestPermissions(K(), E.requestRequiredPermissions(), E.REQUEST_PERMISSION_33);
                return;
            }
            if (i9 >= 30) {
                AbstractC0918b.requestPermissions(K(), E.requestRequiredPermissions(), E.REQUEST_PERMISSION_30);
            } else if (E.doNotShowAgainRequiredPermissions(K())) {
                C6630d.runApplicationDetailSetting(K());
            } else {
                AbstractC0918b.requestPermissions(K(), E.requestRequiredPermissions(), E.REQUEST_PERMISSION);
            }
        }
    }

    private void B0(String str) {
        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(str).setButtonListener(new DialogInterface.OnClickListener() { // from class: o5.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f34478a.y0(dialogInterface, i8);
            }
        }).showDialog();
    }

    private void C0(String str) {
        C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(str).setButtonListener(new DialogInterface.OnClickListener() { // from class: o5.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f34476a.z0(dialogInterface, i8);
            }
        }).showDialog();
    }

    private void D0() {
        if (g.SERVER_TYPE == K4.a.STAGING) {
            q0();
        } else {
            p0();
        }
    }

    private void E0() {
        Object[] downLoadImageData = getDownLoadImageData();
        Bitmap bitmap = (Bitmap) ((WeakReference) downLoadImageData[0]).get();
        String str = (String) downLoadImageData[1];
        ((ImageView) findViewById(AbstractC5955f.iv_intro)).setImageBitmap(bitmap);
        ((TextView) findViewById(AbstractC5955f.loadingMsgTxt)).setTextColor(Color.parseColor(str));
    }

    private void F0() {
        C6637k.getDialog(0, K(), 1002, 0, getString(AbstractC5959j.permission_dialog_title_req)).setButtonListener(new DialogInterface.OnClickListener() { // from class: o5.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f34477a.A0(dialogInterface, i8);
            }
        }).showDialog();
    }

    private void G0() {
        if ((Build.FINGERPRINT.contains("generic") && C6054a.IS_DEBUG_LOG) || n0()) {
            KTApplication.getInstance().clearCookie();
            h.getInstance().setLogin(false);
            H.putBoolean(getApplicationContext(), "CONVENIENCE_SETTING_UPDATE", true);
            D0();
        }
    }

    private void m0() {
        if (E.grantRequiredPermissions(K())) {
            G0();
        } else {
            F0();
        }
    }

    private boolean n0() {
        C5397g c5397g = C5397g.getInstance();
        int iIsGooglePlayServicesAvailable = c5397g.isGooglePlayServicesAvailable(getApplicationContext());
        if (iIsGooglePlayServicesAvailable != 0) {
            c5397g.getErrorDialog(this, iIsGooglePlayServicesAvailable, 1004, new DialogInterface.OnCancelListener() { // from class: o5.a
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f34475a.x0(dialogInterface);
                }
            }).show();
        }
        return iIsGooglePlayServicesAvailable == 0;
    }

    private void o0() {
        AppDataDao appDataDao = new AppDataDao();
        appDataDao.setFinishView(true);
        executeDao(appDataDao);
    }

    private void p0() {
        executeDao(new ServiceCheckDao());
    }

    private void q0() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        CommonCodeDao commonCodeDao = new CommonCodeDao();
        CommonCodeDao.CommonCodeRequest commonCodeRequest = commonCodeDao.new CommonCodeRequest();
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommonCodeDao.IMAGE_DOWN_LOAD_DATA);
        arrayList.add(CommonCodeDao.MENU_RAILPOINT);
        arrayList.add(CommonCodeDao.MAIN_POPUP);
        arrayList.add(CommonCodeDao.IS_NAVER_SHOW);
        arrayList.add(CommonCodeDao.KORAIL_BOSS);
        arrayList.add(CommonCodeDao.BUY_NOW);
        arrayList.add(CommonCodeDao.LOST_ARTICLE);
        arrayList.add(CommonCodeDao.EASY_PAY);
        arrayList.add(CommonCodeDao.ATHN);
        arrayList.add(CommonCodeDao.VIEW_VISIBILITY);
        arrayList.add(CommonCodeDao.MENU_BIZ);
        arrayList.add(CommonCodeDao.POINT);
        arrayList.add(CommonCodeDao.DATA);
        arrayList.add(CommonCodeDao.LOGIN);
        arrayList.add(CommonCodeDao.REPORT);
        arrayList.add(CommonCodeDao.HOLIDAY_POPUP);
        int i8 = Build.VERSION.SDK_INT;
        arrayList.add(CommonCodeDao.MAAS_TEST);
        arrayList.add(CommonCodeDao.LIMOUSINE_MAIN_MSG);
        commonCodeRequest.setCodeList(arrayList);
        commonCodeRequest.setOSVersion(i8);
        commonCodeRequest.setDeviceWidth(displayMetrics.widthPixels);
        commonCodeRequest.setDeviceHeight(displayMetrics.heightPixels);
        commonCodeDao.setRequest(commonCodeRequest);
        commonCodeDao.setPending(false);
        commonCodeDao.setFinishView(true);
        executeDao(commonCodeDao);
    }

    private void r0() {
        NoticeDao noticeDao = new NoticeDao();
        noticeDao.setFinishView(true);
        executeDao(noticeDao);
    }

    private void s0() {
        StationDataDao stationDataDao = new StationDataDao();
        stationDataDao.setFinishView(true);
        executeDao(stationDataDao);
    }

    private void t0() {
        StationInfoDao stationInfoDao = new StationInfoDao();
        stationInfoDao.setFinishView(true);
        executeDao(stationInfoDao);
    }

    private void u0() {
        TrainCalendarDao trainCalendarDao = new TrainCalendarDao();
        trainCalendarDao.setFinishView(true);
        executeDao(trainCalendarDao);
    }

    public void v0() {
        if (C6054a.IS_OLD_MAIN_ACTIVITY) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) OldMainBookingActivity.class);
            if ((1048576 & getIntent().getFlags()) == 0) {
                String stringExtra = getIntent().getStringExtra("PARAM");
                t.e("rawSRTData : " + stringExtra);
                if (!TextUtils.isEmpty(stringExtra)) {
                    intent.putExtra("data_from_SRT", (ReceiveSRTData) q.fromJson(stringExtra, ReceiveSRTData.class));
                } else if (y.isNavigation(getIntent()) || getIntent().hasExtra("POPUP_DATA")) {
                    intent.putExtras(getIntent().getExtras());
                }
            }
            startActivity(intent);
            finish();
            return;
        }
        Intent intent2 = new Intent(getApplicationContext(), (Class<?>) MainBookingActivity.class);
        if ((1048576 & getIntent().getFlags()) == 0) {
            String stringExtra2 = getIntent().getStringExtra("PARAM");
            t.e("rawSRTData : " + stringExtra2);
            if (!TextUtils.isEmpty(stringExtra2)) {
                intent2.putExtra("data_from_SRT", (ReceiveSRTData) q.fromJson(stringExtra2, ReceiveSRTData.class));
            } else if (y.isNavigation(getIntent()) || getIntent().hasExtra("POPUP_DATA") || getIntent().hasExtra("POPUP_COUPON")) {
                intent2.putExtras(getIntent().getExtras());
            }
        }
        startActivity(intent2);
        finish();
    }

    private boolean w0(StationInfoDao.StationInfoResponse stationInfoResponse) throws NumberFormatException {
        int i8 = Integer.parseInt(stationInfoResponse.getMap_version());
        int i9 = H.getInt(getApplicationContext(), "MAP_VERSION");
        int count = stationInfoResponse.getCount();
        int size = C6111b.getInstance().getAllStationList().size();
        if (i9 != 0 && count == size && i8 <= i9) {
            return false;
        }
        H.putInt(getApplicationContext(), "MAP_VERSION", i8);
        return true;
    }

    public /* synthetic */ void x0(DialogInterface dialogInterface) {
        finish();
    }

    public /* synthetic */ void y0(DialogInterface dialogInterface, int i8) {
        G.moveToGooglePlay(K(), getPackageName());
        finish();
    }

    public /* synthetic */ void z0(DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            r0();
        } else if (102 == i8) {
            G.moveToGooglePlay(K(), getPackageName());
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object[] getDownLoadImageData() {
        /*
            r10 = this;
            java.lang.String r0 = "thumbs"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 1
            r3 = 0
            android.content.Context r4 = r10.getApplicationContext()     // Catch: java.lang.Exception -> L44
            java.lang.String r5 = "IMAGE_DOWN_LOAD_DATA"
            java.lang.String r4 = z4.H.getString(r4, r5)     // Catch: java.lang.Exception -> L44
            java.lang.Class<com.korail.talk.network.dao.common.CommonCodeDao$ImageDownLoadData> r5 = com.korail.talk.network.dao.common.CommonCodeDao.ImageDownLoadData.class
            java.lang.Object r4 = z4.q.fromJson(r4, r5)     // Catch: java.lang.Exception -> L44
            com.korail.talk.network.dao.common.CommonCodeDao$ImageDownLoadData r4 = (com.korail.talk.network.dao.common.CommonCodeDao.ImageDownLoadData) r4     // Catch: java.lang.Exception -> L44
            java.lang.String r5 = "Y"
            java.lang.String r6 = r4.getIsApply()     // Catch: java.lang.Exception -> L44
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Exception -> L44
            if (r5 == 0) goto L8b
            android.content.Context r5 = r10.getApplicationContext()     // Catch: java.lang.Exception -> L44
            java.lang.String r6 = r4.getUrl()     // Catch: java.lang.Exception -> L44
            java.io.File r5 = z4.C6639m.getMD5File(r5, r0, r6)     // Catch: java.lang.Exception -> L44
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L44
            r7 = 30
            if (r6 > r7) goto L47
            android.content.Context r5 = r10.getApplicationContext()     // Catch: java.lang.Exception -> L44
            java.lang.String r6 = r4.getSubUrl()     // Catch: java.lang.Exception -> L44
            java.io.File r5 = z4.C6639m.getMD5File(r5, r0, r6)     // Catch: java.lang.Exception -> L44
            goto L47
        L44:
            r0 = move-exception
            r4 = r3
            goto L8d
        L47:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L44
            r0.<init>()     // Catch: java.lang.Exception -> L44
            java.lang.String r6 = "size = "
            r0.append(r6)     // Catch: java.lang.Exception -> L44
            long r6 = r5.length()     // Catch: java.lang.Exception -> L44
            r0.append(r6)     // Catch: java.lang.Exception -> L44
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L44
            z4.t.d(r0)     // Catch: java.lang.Exception -> L44
            boolean r0 = r5.exists()     // Catch: java.lang.Exception -> L44
            if (r0 == 0) goto L8b
            long r6 = r5.length()     // Catch: java.lang.Exception -> L44
            long r8 = r4.getFileSize()     // Catch: java.lang.Exception -> L44
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L8b
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> L88
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Exception -> L88
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFile(r5)     // Catch: java.lang.Exception -> L88
            r0.<init>(r5)     // Catch: java.lang.Exception -> L88
            r1[r3] = r0     // Catch: java.lang.Exception -> L88
            java.lang.String r0 = r4.getTextColor()     // Catch: java.lang.Exception -> L88
            r1[r2] = r0     // Catch: java.lang.Exception -> L88
            r0 = r2
            goto L95
        L88:
            r0 = move-exception
            r4 = r2
            goto L8d
        L8b:
            r0 = r3
            goto L95
        L8d:
            java.lang.String r0 = r0.getMessage()
            z4.t.e(r0)
            r0 = r4
        L95:
            if (r0 != 0) goto Lac
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            android.content.res.Resources r4 = r10.getResources()
            int r5 = n4.AbstractC5954e.splash_intro
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeResource(r4, r5)
            r0.<init>(r4)
            r1[r3] = r0
            java.lang.String r0 = "#456d63"
            r1[r2] = r0
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.korail.talk.ui.intro.IntroActivity.getDownLoadImageData():java.lang.Object[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0106 A[PHI: r5
  0x0106: PHI (r5v4 boolean) = (r5v2 boolean), (r5v6 boolean) binds: [B:77:0x0128, B:70:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isDownLoadImage(com.korail.talk.network.dao.common.CommonCodeDao.ImageDownLoadData r13) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.korail.talk.ui.intro.IntroActivity.isDownLoadImage(com.korail.talk.network.dao.common.CommonCodeDao$ImageDownLoadData):boolean");
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        t.e("");
        if (i8 == 1004) {
            if (n0()) {
                D0();
            }
        } else if (i8 == 110) {
            if (E.grantRequiredPermissions(K())) {
                G0();
            } else {
                finish();
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_intro);
        try {
            DynaPathMobileSDK.Companion.initialize(getApplication());
        } catch (DynaPathException e8) {
            t.d(String.format(com.google.android.material.timepicker.c.NUMBER_FORMAT, Integer.valueOf(e8.getCode())) + ", " + e8.getMessage());
        }
        E0();
        if (C6630d.isNull(bundle)) {
            m0();
        } else {
            m0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.appcompat.app.e, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onDestroy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        P.recycleAllView(findViewById(AbstractC5955f.iv_intro));
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9, types: [org.json.JSONObject] */
    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_check_service == id) {
            q0();
            return;
        }
        if (AbstractC5955f.dao_common_code == id) {
            CommonCodeDao.CommonCodeResponse commonCodeResponse = (CommonCodeDao.CommonCodeResponse) iBaseDao.getResponse();
            CommonCodeDao.ImageDownLoadData imageDownLoadData = commonCodeResponse.getImageDownLoadData();
            boolean zIsDownLoadImage = isDownLoadImage(imageDownLoadData);
            H.putString(getApplicationContext(), "MENU_RAIL_POINT", q.toJson(commonCodeResponse.getMenuRailPoint()));
            H.putString(getApplicationContext(), "EASY_LOGIN", q.toJson(commonCodeResponse.getEasyLoginShow()));
            H.putString(getApplicationContext(), "KORAIL_BOSS", q.toJson(commonCodeResponse.getKorailBoss()));
            H.putBoolean(getApplicationContext(), "CONVENIENCE_SETTING_VISIBLE", "Y".equals(commonCodeResponse.getBuyNow().getIsApply()));
            H.putString(getApplicationContext(), "LOST_ARTICLE", q.toJson(commonCodeResponse.getLostArticle()));
            H.putString(getApplicationContext(), "EASY_PAY_OPTION", q.toJson(commonCodeResponse.getEasyPay()));
            H.putString(getApplicationContext(), "HOLIDAY_POPUP_DATA", q.toJson(commonCodeResponse.getHolidayPopup()));
            H.putString(getApplicationContext(), "ATHN", q.toJson(commonCodeResponse.getAthn()));
            H.putString(getApplicationContext(), "VIEW_VISIBILITY", q.toJson(commonCodeResponse.getViewVisibility()));
            H.putString(getApplicationContext(), "MENU_BIZ", q.toJson(commonCodeResponse.getMenuBiz()));
            H.putString(getApplicationContext(), "POINT_PAY_OPTION", q.toJson(commonCodeResponse.getPoint()));
            H.putString(getApplicationContext(), "VAR_DATA", q.toJson(commonCodeResponse.getData()));
            H.putString(getApplicationContext(), "LOGIN_DATA", q.toJson(commonCodeResponse.getLogin()));
            H.putString(getApplicationContext(), "REPORT_DATA", q.toJson(commonCodeResponse.getReport()));
            CommonCodeDao.MainPopup mainPopup = commonCodeResponse.getMainPopup();
            MainPopupData mainPopupData = C6111b.getInstance().getMainPopupData();
            t.e("mainPopupData : " + mainPopupData + X.SPACE + mainPopup.getShow());
            H.putString(getApplicationContext(), "KEY_LIMOUSINE_MAIN_MSG", commonCodeResponse.getLimousineMainMsg());
            if ("N".equals(mainPopup.getShow())) {
                C6111b.getInstance().deleteMainPopupData();
            } else if ("Y".equals(mainPopup.getShow()) && (C6630d.isNull(mainPopupData) || mainPopup.getNoticeId() != mainPopupData.getNoticeId() || !C6634h.isBefore(C6634h.getToday("yyyyMMdd"), mainPopupData.getConfirmDate()))) {
                C6111b.getInstance().deleteMainPopupData();
                MainPopupData mainPopupData2 = new MainPopupData();
                mainPopupData2.setNoticeId(mainPopup.getNoticeId());
                mainPopupData2.setShow(mainPopup.getShow());
                mainPopupData2.setTitle(mainPopup.getTitle());
                mainPopupData2.setMessage(mainPopup.getMessage());
                mainPopupData2.setLinkUrl(mainPopup.getLinkUrl());
                mainPopupData2.setExternalBrowser(mainPopup.getIsExternalBrowser());
                mainPopupData2.setConfirmDate(C6634h.getToday("yyyyMMdd"));
                mainPopupData2.setImageUrl(mainPopup.getImageUrl());
                mainPopupData2.setLinkTitle(mainPopup.getLinkTitle());
                mainPopupData2.setButtonType(mainPopup.getButtonType());
                mainPopupData2.setCheckType(mainPopup.getCheckType());
                mainPopupData2.setSize(mainPopup.getSize());
                mainPopupData2.setClsBtn(mainPopup.getClsBtn());
                mainPopupData2.setVoice(mainPopup.getVoice());
                C6111b.getInstance().insertMainPopupData(mainPopupData2);
            }
            if (zIsDownLoadImage) {
                new c(getApplicationContext(), imageDownLoadData, null).execute(new Void[0]);
            }
            C6054a.IS_AUTO_REFRESH_ACTIVE = (commonCodeResponse.getData().getAutoRefresh() != null ? commonCodeResponse.getData().getAutoRefresh() : "N").equals("Y");
            C6054a.IS_MACRO_ACTIVE = (commonCodeResponse.getData().getIsMacroEnable() != null ? commonCodeResponse.getData().getIsMacroEnable() : "N").equals("Y");
            o0();
            return;
        }
        if (AbstractC5955f.dao_app_data == id) {
            AppDataDao.AppDataResponse appDataResponse = (AppDataDao.AppDataResponse) iBaseDao.getResponse();
            AppDataDao.Version version = appDataResponse.getVersion();
            H.putString(getApplicationContext(), "KEY_RAIL_PLUS_CARD_INFO", appDataResponse.getRailPlusCardInfo());
            H.putString(getApplicationContext(), "DISABILITY_CERTIFICATION_MSG", appDataResponse.getDisability_certification_msg());
            H.putString(getApplicationContext(), "KEY_LIMOUSINE_MSG", appDataResponse.getLimousine());
            String string = C6630d.isNull(version.getAMessage()) ? getResources().getString(AbstractC5959j.msg_korailtalk_plus_update) : version.getAMessage();
            String newdversion = version.getNEWDVERSION();
            String versionName = C6630d.getVersionName();
            if (C6630d.isMajorUpdate(versionName, newdversion)) {
                B0(string);
                return;
            } else if (C6630d.isMinorUpdate(versionName, newdversion)) {
                C0(string);
                return;
            } else {
                r0();
                return;
            }
        }
        if (AbstractC5955f.dao_notice_data == id) {
            NoticeDao.NoticeResponse noticeResponse = (NoticeDao.NoticeResponse) iBaseDao.getResponse();
            JSONObject jSONObject = new JSONObject();
            try {
                try {
                    jSONObject.put("NOTICE_MESSAGE", noticeResponse.getPtwtTtl());
                    jSONObject.put("NOTICE_POST_DATA", noticeResponse.getNoticePostData());
                } catch (JSONException e8) {
                    t.e(e8.getMessage());
                }
                return;
            } finally {
                H.putString(getApplicationContext(), "NOTICE_DATA", jSONObject.toString());
                u0();
            }
        }
        if (AbstractC5955f.dao_train_calendar == id) {
            C6631e.makeAvailableDatesFactory(((TrainCalendarDao.TrainCalendarResponse) iBaseDao.getResponse()).getRunningCalendarList());
            t0();
            return;
        }
        if (AbstractC5955f.dao_station_info == id) {
            if (w0((StationInfoDao.StationInfoResponse) iBaseDao.getResponse())) {
                s0();
                return;
            } else if (H.getBoolean(getApplicationContext(), "KEY_AUTO_LOGIN")) {
                I();
                return;
            } else {
                v0();
                return;
            }
        }
        if (AbstractC5955f.dao_station_data == id) {
            new b(this, null).execute(((StationDataDao.StationDataResponse) iBaseDao.getResponse()).getStns().getStn());
            return;
        }
        if (AbstractC5955f.dao_auto_login == id) {
            AutoLoginDao autoLoginDao = (AutoLoginDao) iBaseDao;
            LoginDao.LoginResponse loginResponse = (LoginDao.LoginResponse) autoLoginDao.getResponse();
            String str = loginResponse.gethMsgCd();
            if ("Y".equals(loginResponse.getCoupClsFlg())) {
                Intent intent = getIntent();
                intent.putExtra("POPUP_COUPON", loginResponse.getCoupClsFlg());
                intent.putExtra("POPUP_COUPON_NAME", loginResponse.getStrCustNm());
                setIntent(intent);
            }
            if (u.isLoginSuccess(str)) {
                Toast.makeText(getApplicationContext(), getString(AbstractC5959j.main_auto_login), 0).show();
                if (N.isNotNull(loginResponse.getStrSubtDcsClCd()) || "E".equals(loginResponse.getStrAthnFlg7())) {
                    new Handler().postDelayed(new a(), 2000L);
                }
                ArrayList<LoginPopUpData> loginSuccessPopupData = u.getLoginSuccessPopupData(getApplicationContext(), loginResponse, true);
                if (!loginSuccessPopupData.isEmpty()) {
                    Intent intent2 = getIntent();
                    intent2.putExtra("POPUP_DATA", loginSuccessPopupData);
                    setIntent(intent2);
                }
            } else {
                String strRedirectUrl = loginResponse.getStrRedirectUrl();
                if (N.isNotNull(strRedirectUrl)) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("WEB_POST_URL", strRedirectUrl);
                    bundle.putSerializable("WEB_POST_PARAMETER", u.getLoginAuthenticationPostData(autoLoginDao));
                    Intent intent3 = new Intent();
                    intent3.putExtras(C6641o.getIntentBundle(LoginActivity.class, bundle));
                    setIntent(intent3);
                }
            }
            v0();
        }
    }

    @Override // androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        if (i8 == E.REQUEST_PERMISSION || i8 == E.REQUEST_PERMISSION_30 || i8 == E.REQUEST_PERMISSION_33) {
            H.putBoolean(getApplicationContext(), "REQUIRED_PERMISSIONS", true);
            for (int i9 = 0; i9 < strArr.length; i9++) {
                if (-1 == iArr[i9]) {
                    Toast.makeText(getApplicationContext(), getString(AbstractC5959j.permission_toast_check_content), 0).show();
                    finish();
                    return;
                }
            }
            G0();
        }
    }
}
