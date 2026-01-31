package h5;

import Q7.X;
import android.content.DialogInterface;
import android.os.Bundle;
import com.korail.talk.network.dao.addService.HelpSrvCustDao;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import n4.AbstractC5959j;
import p4.C6054a;
import r4.EnumC6175b;
import s4.C6219c;
import z4.C6637k;
import z4.H;
import z4.N;

/* renamed from: h5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC5617g extends AbstractActivityC5621k {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y0(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            f1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z0(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            h1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a1(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            W0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b1(DialogInterface dialogInterface, int i8, boolean z8) {
        if (z8) {
            H.putBoolean(getApplicationContext(), "IS_ACCUMULATING_KTX_MILEGE", true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c1(DialogInterface dialogInterface, int i8) {
        K0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d1(DialogInterface dialogInterface, int i8) {
        K0();
    }

    private void h1() {
        String strX0 = X0();
        String h_nonstop_msg = ((RsvInquiryResponse.TrainInfo) this.f31586l.get(this.f31585k)).getH_nonstop_msg();
        String h_nonstop_msg_txt = ((RsvInquiryResponse.TrainInfo) this.f31586l.get(this.f31585k)).getH_nonstop_msg_txt();
        if (r4.s.DTRN.toString().equals(strX0) && N.isNotNull(h_nonstop_msg) && "MRT200144".equals(h_nonstop_msg)) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.tour_dmz_train_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: h5.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f31577a.c1(dialogInterface, i8);
                }
            }).showDialog();
            return;
        }
        if (N.isNotNull(h_nonstop_msg) && N.isNotNull(h_nonstop_msg_txt)) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(h_nonstop_msg_txt).setButtonListener(new DialogInterface.OnClickListener() { // from class: h5.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f31578a.d1(dialogInterface, i8);
                }
            }).showDialog();
        } else if ("MRT200159".equals(h_nonstop_msg)) {
            K0();
        } else {
            K0();
        }
    }

    protected abstract void W0();

    protected String X0() {
        return "";
    }

    protected void e1() {
        RsvInquiryResponse.TrainInfo[] trainInfoArrE0;
        try {
            trainInfoArrE0 = E0();
        } catch (IndexOutOfBoundsException unused) {
            if (C6054a.IS_DEBUG_LOG) {
                return;
            } else {
                trainInfoArrE0 = null;
            }
        }
        boolean zEquals = false;
        for (RsvInquiryResponse.TrainInfo trainInfo : trainInfoArrE0) {
            zEquals = "Y".equals(trainInfo.getH_dlay_sale_flg());
            if (zEquals) {
                break;
            }
        }
        if (zEquals) {
            C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.delayed_departure_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: h5.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f31575a.Y0(dialogInterface, i8);
                }
            }).showDialog();
        } else {
            f1();
        }
    }

    protected void f1() {
        String str;
        RsvInquiryResponse.TrainInfo[] trainInfoArrE0 = E0();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int i8 = 0;
        while (true) {
            str = "";
            if (i8 >= trainInfoArrE0.length) {
                break;
            }
            RsvInquiryResponse.TrainInfo trainInfo = trainInfoArrE0[i8];
            if (N.isNotNull(trainInfo.getH_dtour_flg()) && N.isNotNull(trainInfo.getH_info_txt()) && B4.a.isNonStopTrain(trainInfo.getH_dtour_flg())) {
                if (!this.f31591q) {
                    sb.append(i8 == 0 ? "(선행)" : "(후행)");
                }
                sb2.append(sb2.length() == 0 ? trainInfo.getH_info_txt() : "");
            }
            i8++;
        }
        if (sb2.length() == 0) {
            h1();
            return;
        }
        C6219c cDialog = C6637k.getCDialog(K(), 1002, 0, getString(AbstractC5959j.dialog_title));
        StringBuilder sb3 = new StringBuilder();
        if (sb.length() != 0) {
            str = sb.toString() + X.SPACE;
        }
        sb3.append(str);
        sb3.append(sb2.toString());
        cDialog.setContent(sb3.toString()).setButtonListener(new DialogInterface.OnClickListener() { // from class: h5.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.f31576a.Z0(dialogInterface, i9);
            }
        }).showDialog();
    }

    protected boolean g1(Bundle bundle) {
        boolean z8;
        String string = bundle.getString(g5.e.KEY_TRAIN_GP_CODE);
        StringBuilder sb = new StringBuilder();
        if (!bundle.getBoolean(g5.e.KEY_TRAIN_IS_DEPARTURE) || !bundle.getBoolean(g5.e.KEY_TRAIN_IS_ARRIVAL)) {
            sb.append(getString(AbstractC5959j.dialog_simultaneous_stop, bundle.getString(g5.e.KEY_TRAIN_DEPARTURE), bundle.getString(g5.e.KEY_TRAIN_ARRIVAL), !bundle.getBoolean(g5.e.KEY_TRAIN_IS_DEPARTURE) ? getString(AbstractC5959j.dialog_simultaneous_stop_arrival_only, bundle.getString(g5.e.KEY_TRAIN_ORG_DEPARTURE)) : ""));
        }
        String string2 = bundle.getString(g5.e.KEY_TRAIN_STOP_STATION);
        String string3 = bundle.getString(g5.e.KEY_TRAIN_STOP_POPUP_STATION);
        if (N.isNotNull(string2) && N.isNotNull(string) && N.isNotNull(string3) && string3.equals("Y")) {
            if (sb.length() > 0) {
                sb.append("\n\n");
            }
            sb.append(getString(AbstractC5959j.dialog_stop_station, string2));
        }
        if (bundle.getBoolean(g5.e.KEY_RSV_TYPE_FLAG) && (HelpSrvCustDao.HelpSrvCustRequest.f27549D.equals(bundle.getString(g5.e.KEY_CNEC_TRFC_PSB_FLG)) || "A".equals(bundle.getString(g5.e.KEY_CNEC_TRFC_PSB_FLG)))) {
            String string4 = H.getString(getApplicationContext(), "KEY_LIMOUSINE_MSG");
            if (N.isNotNull(string4)) {
                if (sb.length() > 0) {
                    sb.append("\n\n");
                }
                sb.append(string4);
            }
        }
        String string5 = bundle.getString(g5.e.KEY_USE_TIM_CARE_ATCL_CONT);
        if (N.isNotNull(string5)) {
            if (sb.length() > 0) {
                sb.append("\n\n");
            }
            sb.append(string5);
        }
        if (sb.length() > 0) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(sb.toString()).setButtonListener(new DialogInterface.OnClickListener() { // from class: h5.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f31573a.a1(dialogInterface, i8);
                }
            }).showDialog();
            z8 = true;
        } else {
            z8 = false;
        }
        CommonCodeDao.ViewVisibility viewVisibility = (CommonCodeDao.ViewVisibility) z4.q.fromJson(H.getString(getApplicationContext(), "VIEW_VISIBILITY"), CommonCodeDao.ViewVisibility.class);
        if (!H.getBoolean(getApplicationContext(), "IS_ACCUMULATING_KTX_MILEGE") && B0() == EnumC6175b.DEFAULT && r4.s.KTX.getCode().equals(string) && bundle.getInt(g5.e.KEY_TOTAL_PASSENGER_COUNT) > 1 && "Y".equals(viewVisibility.getAcpnMlgLead())) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title_accumulating_ktx_mileage)).setContent(getString(AbstractC5959j.dialog_message_accumulating_ktx_mileage)).setCheckBoxMessage(getString(AbstractC5959j.do_not_show_again_2)).setButtonListener(new C6219c.InterfaceC0421c() { // from class: h5.b
                @Override // s4.C6219c.InterfaceC0421c
                public final void onClick(DialogInterface dialogInterface, int i8, boolean z9) {
                    this.f31574a.b1(dialogInterface, i8, z9);
                }
            }).showDialog();
        }
        return z8;
    }
}
