package B4;

import Q7.X;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.korail.talk.network.dao.delay.CashRfnDao;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import g5.e;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5959j;
import r4.c;
import r4.d;
import r4.o;
import z4.C6634h;
import z4.N;

/* loaded from: classes.dex */
public class a {
    /* JADX WARN: Removed duplicated region for block: B:133:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(android.content.Context r12, com.korail.talk.network.response.seatMovie.RsvInquiryResponse.TrainInfo r13, android.os.Bundle r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B4.a.a(android.content.Context, com.korail.talk.network.response.seatMovie.RsvInquiryResponse$TrainInfo, android.os.Bundle, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x00a0, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.os.Bundle b(android.content.Context r20, com.korail.talk.network.response.seatMovie.RsvInquiryResponse.TrainInfo r21, r4.c r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B4.a.b(android.content.Context, com.korail.talk.network.response.seatMovie.RsvInquiryResponse$TrainInfo, r4.c, boolean):android.os.Bundle");
    }

    private static boolean c(RsvInquiryResponse.TrainInfo trainInfo, RsvInquiryResponse.TrainInfo trainInfo2) {
        return trainInfo.getH_dpt_tm().equals(trainInfo2.getH_dpt_tm()) && trainInfo.getH_arv_tm().equals(trainInfo2.getH_arv_tm()) && trainInfo.getH_dpt_rs_stn_nm().equals(trainInfo2.getH_dpt_rs_stn_nm()) && trainInfo.getH_arv_rs_stn_nm().equals(trainInfo2.getH_arv_rs_stn_nm()) && trainInfo.getH_trn_no().equals(trainInfo2.getH_trn_no()) && trainInfo.getH_trn_gp_cd().equals(trainInfo2.getH_trn_gp_cd());
    }

    public static List<RsvInquiryResponse.TrainInfo> getDirectReorderList(List<RsvInquiryResponse.TrainInfo> list, List<RsvInquiryResponse.TrainInfo> list2) {
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            RsvInquiryResponse.TrainInfo trainInfo = list.get(size);
            for (RsvInquiryResponse.TrainInfo trainInfo2 : list2) {
                if (N.getInteger(trainInfo.getH_dpt_tm()) == N.getInteger(trainInfo2.getH_dpt_tm()) && trainInfo.getH_trn_no().equals(trainInfo2.getH_trn_no()) && trainInfo.getH_dpt_rs_stn_cd().equals(trainInfo2.getH_dpt_rs_stn_cd()) && trainInfo.getH_arv_rs_stn_cd().equals(trainInfo2.getH_arv_rs_stn_cd())) {
                    arrayList.add(trainInfo2);
                }
            }
        }
        list2.removeAll(arrayList);
        return list2;
    }

    public static int getSelectSeatType(Bundle bundle, int i8) {
        return bundle.containsKey("TRAIN_DATA") ? ((Bundle[]) bundle.getParcelableArray("TRAIN_DATA"))[i8].getInt(e.KEY_SELECTED_SEAT_TYPE, -1) : bundle.getInt(e.KEY_SELECTED_SEAT_TYPE, -1);
    }

    public static String getSelectSeatTypeCode(Bundle bundle, int i8) {
        return (getSelectSeatType(bundle, i8) == 0 ? o.GENERAL : o.SPECIAL).getCode();
    }

    public static String getSelectSeatTypeName(Bundle bundle, int i8) {
        int selectSeatType = getSelectSeatType(bundle, i8);
        if (bundle.containsKey("TRAIN_DATA")) {
            bundle = ((Bundle[]) bundle.getParcelableArray("TRAIN_DATA"))[i8];
        }
        return bundle.getBundle(selectSeatType == 0 ? e.KEY_SEAT_STANDARD : e.KEY_SEAT_SUITE).getString(e.KEY_PSRM_CL_NM);
    }

    public static Bundle getTrainInfoBundleData(Bundle bundle, int i8) {
        return bundle.containsKey("TRAIN_DATA") ? ((Bundle[]) bundle.getParcelableArray("TRAIN_DATA"))[i8] : bundle;
    }

    public static Bundle[] getTrainInfoBundleListData(Bundle bundle) {
        return bundle.containsKey("TRAIN_DATA") ? (Bundle[]) bundle.getParcelableArray("TRAIN_DATA") : new Bundle[]{bundle};
    }

    public static RsvInquiryResponse.TrainInfo getTrainInfoData(RsvInquiryResponse.TrainInfo[] trainInfoArr, int i8) {
        return trainInfoArr[i8];
    }

    public static List<RsvInquiryResponse.TrainInfo> getTransferReorderList(List<RsvInquiryResponse.TrainInfo> list, List<RsvInquiryResponse.TrainInfo> list2) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (d.TRANSFER_SQ_NO.getCode().equals(list.get(i8).getH_chg_trn_seq())) {
                RsvInquiryResponse.TrainInfo trainInfo = list.get(i8);
                int i9 = 0;
                while (true) {
                    if (i9 >= list2.size()) {
                        break;
                    }
                    if (d.TRANSFER_SQ_NO.getCode().equals(list2.get(i9).getH_chg_trn_seq()) && c(trainInfo, list2.get(i9))) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(list2.get(i9 - 1));
                        arrayList.add(list2.get(i9));
                        list2.removeAll(arrayList);
                        break;
                    }
                    i9++;
                }
            }
        }
        return list2;
    }

    public static boolean isNonStopTrain(String str) {
        return N.isNotNull(str) && (str.equals("A") || str.equals("S") || str.equals(CashRfnDao.f27551B) || str.equals("C"));
    }

    public static Bundle makeTrainBundle(Context context, RsvInquiryResponse.TrainInfo trainInfo, c cVar) {
        Bundle bundle = new Bundle();
        String dtourTxt = trainInfo.getDtourTxt();
        if (!N.isNull(dtourTxt) && !e.STATE_NAME_NONE.equals(dtourTxt)) {
            bundle.putString(e.KEY_TRAIN_STOP_STATION, dtourTxt);
        }
        String str = trainInfo.getdturViaPopp();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(e.KEY_TRAIN_STOP_POPUP_STATION, str);
        }
        bundle.putBoolean(e.KEY_TRAIN_HAS_SNACKCART, !trainInfo.getH_nonstop_msg().equals("MRT200159"));
        bundle.putString(e.KEY_TRAIN_DEPARTURE_TIME, C6634h.convertFormat(trainInfo.getH_dpt_tm(), "HHmmss", "HH:mm"));
        bundle.putString(e.KEY_TRAIN_DEPARTURE, trainInfo.getH_dpt_rs_stn_nm());
        bundle.putBoolean(e.KEY_TRAIN_IS_DEPARTURE, true);
        bundle.putString(e.KEY_TRAIN_DEPARTURE_CD, trainInfo.getH_dpt_rs_stn_cd());
        bundle.putString(e.KEY_TRAIN_ARRIVAL_TIME, C6634h.convertFormat(trainInfo.getH_arv_tm(), "HHmmss", "HH:mm"));
        bundle.putString(e.KEY_TRAIN_ARRIVAL, trainInfo.getH_arv_rs_stn_nm());
        bundle.putBoolean(e.KEY_TRAIN_IS_ARRIVAL, true);
        bundle.putString(e.KEY_TRAIN_ARRIVAL_CD, trainInfo.getH_arv_rs_stn_cd());
        bundle.putString(e.KEY_SEAT_DELAY, trainInfo.getH_expct_dlay_hr());
        bundle.putString(e.KEY_SEAT_EXPECT_DELAY, trainInfo.getH_expn_dpt_dlay_tnum());
        bundle.putString(e.KEY_H_SMNS_TRN_FLG, trainInfo.getH_smns_trn_flg());
        bundle.putString(e.KEY_TRAIN_NAME, trainInfo.getH_trn_clsf_nm() + X.LF + trainInfo.getH_trn_no());
        bundle.putBoolean(e.KEY_RSV_TYPE_FLAG, cVar == c.RSV_DEFAULT);
        bundle.putString(e.KEY_CNEC_TRFC_PSB_FLG, trainInfo.getH_cnec_trfc_psb_flg());
        bundle.putString(e.KEY_CNEC_TRFC_ND_HM, trainInfo.getH_cnec_trfc_nd_hm());
        bundle.putString(e.KEY_CNEC_TRFC_RCVD_PRC, trainInfo.getH_cnec_trfc_rcvd_prc());
        bundle.putBundle(e.KEY_SEAT_STANDARD, b(context, trainInfo, cVar, true));
        bundle.putBundle(e.KEY_SEAT_SUITE, b(context, trainInfo, cVar, false));
        bundle.putString(e.KEY_TRAIN_GP_CODE, trainInfo.getH_trn_gp_cd());
        int integer = N.getInteger(trainInfo.getH_free_sracar_cnt());
        if (integer > 0) {
            bundle.putString(e.KEY_SEAT_STANDING_FREE_INFO, context.getString(AbstractC5959j.common_free_seat_srcar, Integer.valueOf(integer)));
        }
        String h_run_tm = trainInfo.getH_run_tm();
        if (N.isNotNull(h_run_tm)) {
            bundle.putString(e.KEY_RUN_TIME, context.getString(AbstractC5959j.common_run_time, C6634h.convertFormat(trainInfo.getH_run_tm(), "HHmm", h_run_tm.startsWith("00") ? "m분" : "H시간 m분")));
        } else {
            bundle.putString(e.KEY_RUN_TIME, context.getString(AbstractC5959j.common_empty));
        }
        bundle.putString(e.KEY_USE_TIM_CARE_ATCL_CONT, trainInfo.getH_use_tim_care_atcl_cont());
        bundle.putString(e.KEY_STATION_POPUP_MESSAGE, trainInfo.getH_station_popup_msg());
        bundle.putString(e.KEY_POPUP_MESSAGE, trainInfo.getH_popup_msg());
        bundle.putInt(e.KEY_TOTAL_PASSENGER_COUNT, trainInfo.getTotPsgCnt());
        return bundle;
    }
}
