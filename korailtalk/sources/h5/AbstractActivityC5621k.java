package h5;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.korail.talk.data.DisabilityReservationData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.addService.HelpSrvCustDao;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import com.korail.talk.ui.menu.ReservedTicketActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import r4.EnumC6175b;
import y4.C6536a;
import z4.C6630d;
import z4.C6637k;

/* renamed from: h5.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC5621k extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    protected boolean f31583i;

    /* renamed from: j, reason: collision with root package name */
    protected boolean f31584j;

    /* renamed from: k, reason: collision with root package name */
    protected int f31585k;

    /* renamed from: l, reason: collision with root package name */
    protected List f31586l;

    /* renamed from: m, reason: collision with root package name */
    protected ArrayList f31587m;

    /* renamed from: n, reason: collision with root package name */
    protected r4.c f31588n;

    /* renamed from: o, reason: collision with root package name */
    protected ReservationResponse f31589o;

    /* renamed from: p, reason: collision with root package name */
    protected ReservationResponse f31590p;

    /* renamed from: q, reason: collision with root package name */
    protected boolean f31591q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f31592r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f31593s;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(Intent intent) {
        ReservationResponse reservationResponse = (ReservationResponse) z4.q.fromJson(((DisabilityReservationData) intent.getSerializableExtra("RESERVATION_DATA")).getReservationResponse(), ReservationResponse.class);
        reservationResponse.getPsgDiscAdd_infos().getPsgDiscAdd_info().clear();
        O0(reservationResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(DialogInterface dialogInterface, int i8) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) ReservedTicketActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(DialogInterface dialogInterface, int i8) {
        N0(E0());
        if (102 == i8) {
            K0();
        }
    }

    private void L0() {
        this.f31584j = true;
        this.f31585k = -1;
        this.f31586l = new ArrayList();
        this.f31587m = new ArrayList();
        Intent intent = getIntent();
        this.f31591q = intent.getBooleanExtra("IS_DIRECT", true);
        this.f31592r = intent.getBooleanExtra("IS_TRANSFER", true);
        this.f31593s = intent.getBooleanExtra("IS_SELECT_TRANSFER", false);
    }

    protected String A0() {
        return "11";
    }

    protected EnumC6175b B0() {
        return EnumC6175b.DEFAULT;
    }

    protected r4.c C0() {
        return r4.c.RSV_DEFAULT;
    }

    protected Bundle D0() {
        return (Bundle) this.f31587m.get(this.f31585k);
    }

    protected RsvInquiryResponse.TrainInfo[] E0() {
        return this.f31591q ? new RsvInquiryResponse.TrainInfo[]{(RsvInquiryResponse.TrainInfo) this.f31586l.get(this.f31585k)} : new RsvInquiryResponse.TrainInfo[]{(RsvInquiryResponse.TrainInfo) this.f31586l.get(this.f31585k * 2), (RsvInquiryResponse.TrainInfo) this.f31586l.get((this.f31585k * 2) + 1)};
    }

    protected boolean F0() {
        if (this.f31585k <= 0) {
            return false;
        }
        Bundle bundleD0 = D0();
        return (HelpSrvCustDao.HelpSrvCustRequest.f27549D.equals(bundleD0.getString(g5.e.KEY_CNEC_TRFC_PSB_FLG)) || "A".equals(bundleD0.getString(g5.e.KEY_CNEC_TRFC_PSB_FLG))) && bundleD0.getBoolean(g5.e.KEY_RSV_TYPE_FLAG);
    }

    protected boolean G0() {
        if (!this.f31591q) {
            return false;
        }
        Bundle bundleD0 = D0();
        return bundleD0.getBundle(g5.e.KEY_SEAT_STANDARD).getBoolean(g5.e.KEY_SEAT_WAITING, false) || bundleD0.getBundle(g5.e.KEY_SEAT_SUITE).getBoolean(g5.e.KEY_SEAT_WAITING, false);
    }

    protected abstract void K0();

    protected void M0(boolean z8) {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(AbstractC5955f.collapsingToolbar);
        AppBarLayout.d dVar = (AppBarLayout.d) collapsingToolbarLayout.getLayoutParams();
        dVar.setScrollFlags(z8 ? 0 : 3);
        collapsingToolbarLayout.setLayoutParams(dVar);
        findViewById(AbstractC5955f.noContentMsgTxt).setVisibility(z8 ? 0 : 8);
    }

    protected abstract void N0(RsvInquiryResponse.TrainInfo... trainInfoArr);

    protected abstract void O0(ReservationResponse reservationResponse);

    protected void P0(List list) {
        ArrayList arrayList = new ArrayList();
        if (this.f31591q) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RsvInquiryResponse.TrainInfo trainInfo = (RsvInquiryResponse.TrainInfo) it.next();
                Bundle bundleMakeTrainBundle = B4.a.makeTrainBundle(getApplicationContext(), trainInfo, C0());
                bundleMakeTrainBundle.putBoolean(g5.e.KEY_TRAIN_IS_DEPARTURE, z0().equals(trainInfo.getH_dpt_rs_stn_nm()) || z0().equals("광명+리무진"));
                if (!z0().equals(trainInfo.getH_dpt_rs_stn_nm())) {
                    bundleMakeTrainBundle.putString(g5.e.KEY_TRAIN_ORG_DEPARTURE, z0());
                }
                bundleMakeTrainBundle.putBoolean(g5.e.KEY_TRAIN_IS_ARRIVAL, x0().equals(trainInfo.getH_arv_rs_stn_nm()) || x0().equals("광명+리무진"));
                arrayList.add(bundleMakeTrainBundle);
            }
        } else {
            Bundle bundle = new Bundle();
            Bundle[] bundleArr = new Bundle[2];
            for (int i8 = 0; i8 < list.size(); i8++) {
                int i9 = i8 % 2;
                if (i9 == 0) {
                    bundle = new Bundle();
                    bundleArr = new Bundle[2];
                    bundle.putParcelableArray("TRAIN_DATA", bundleArr);
                }
                bundleArr[i9] = B4.a.makeTrainBundle(getApplicationContext(), (RsvInquiryResponse.TrainInfo) list.get(i8), C0());
                if (i9 == 1) {
                    arrayList.add(bundle);
                }
            }
        }
        this.f31587m.addAll(arrayList);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, final Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (-1 == i9) {
            if (112 == i8) {
                new Handler().postDelayed(new Runnable() { // from class: h5.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31579a.H0(intent);
                    }
                }, 500L);
            }
        } else if (112 == i8) {
            w0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            L0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_reservation != id && AbstractC5955f.dao_l_reservation != id && AbstractC5955f.dao_seat_assign_reservation != id) {
            super.onReceiveError(iBaseDao, c6536a);
            return;
        }
        String str = iBaseDao.getResponse().gethMsgCd();
        if ("WRR800029".equals(str) || "ERR911531".equals(str) || "ERR911051".equals(str)) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(c6536a.getMessage()).setButtonListener(new DialogInterface.OnClickListener() { // from class: h5.i
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f31581a.I0(dialogInterface, i8);
                }
            }).showDialog();
        } else if ("ERR911081".equals(str)) {
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.tss_dialog_no_seat_not_allowed_time)).setButtonListener(new DialogInterface.OnClickListener() { // from class: h5.j
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f31582a.J0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    protected void v0() {
        this.f31584j = true;
        this.f31587m.clear();
        this.f31586l.clear();
        this.f31585k = -1;
    }

    protected abstract void w0();

    protected abstract String x0();

    protected abstract String y0();

    protected abstract String z0();

    @Override // com.korail.talk.view.base.BaseActivity
    public void onLoginFail(boolean z8) {
    }
}
