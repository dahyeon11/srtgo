package z4;

import Q7.X;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.korail.talk.data.DiscountObjectData;
import com.korail.talk.network.dao.cart.CartListDao;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import com.korail.talk.network.data.certification.DiscountPriceParams;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC5959j;

/* loaded from: classes.dex */
public class D extends C6632f {
    private static DiscountObjectData c(int i8, String str, ReservationResponse.SeatInfo seatInfo) {
        DiscountObjectData discountObjectData = new DiscountObjectData();
        discountObjectData.setIndex(i8);
        discountObjectData.setTitle(str);
        discountObjectData.setObject(seatInfo);
        return discountObjectData;
    }

    private static String d(Context context, List list, int i8) {
        String str;
        Iterator it = list.iterator();
        String str2 = null;
        int integer = 0;
        while (it.hasNext()) {
            ReservationResponse.SeatInfo seatInfo = ((ReservationResponse.JrnyInfo) it.next()).getSeat_infos().getSeat_info().get(i8);
            if (N.isNull(str2)) {
                str = "";
            } else {
                str = str2 + ", ";
            }
            str2 = str + Integer.parseInt(seatInfo.getH_srcar_no()) + C6632f.a(context, AbstractC5959j.payment_train_number) + X.SPACE + seatInfo.getH_seat_no();
            integer += N.getInteger(seatInfo.getH_rcvd_amt());
        }
        return str2 + "/" + N.getDecimalFormatString(integer);
    }

    private static int e(List list) {
        int h_tk_cnt;
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            CartListDao.CartInfo cartInfo = (CartListDao.CartInfo) it.next();
            if ("1".equals(cartInfo.getH_item_dv_cd()) || StbkAcntDao.CHANGE_PASSWORD.equals(cartInfo.getH_item_dv_cd())) {
                h_tk_cnt = cartInfo.getH_tk_cnt();
                i8 += h_tk_cnt;
            } else if ("2".equals(cartInfo.getH_item_dv_cd()) || StbkAcntDao.ACCOUNT_REGISTER.equals(cartInfo.getH_item_dv_cd())) {
                if (cartInfo.getH_tk_cnt() == 0) {
                    i8++;
                } else {
                    h_tk_cnt = cartInfo.getH_tk_cnt();
                    i8 += h_tk_cnt;
                }
            }
        }
        return i8;
    }

    public static String getCountMessage(List<CartListDao.CartInfo> list, int i8) {
        int iE;
        int iE2;
        StringBuilder sb = new StringBuilder();
        if (C6630d.isNotNull(list) && (iE2 = i8 + (iE = e(list))) > 0) {
            sb.append("총 ");
            sb.append(iE2);
            sb.append("개 ");
            sb.append("(");
            if (i8 > 0) {
                sb.append("승차권 ");
                sb.append(i8);
                if (iE > 0) {
                    sb.append(", ");
                }
            }
            if (iE > 0) {
                sb.append("상품 ");
                sb.append(iE);
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public static int getProductAmount(List<CartListDao.CartInfo> list) {
        int integer = 0;
        for (CartListDao.CartInfo cartInfo : list) {
            if ("1".equals(cartInfo.getH_item_dv_cd()) || StbkAcntDao.CHANGE_PASSWORD.equals(cartInfo.getH_item_dv_cd())) {
                integer += N.getInteger(cartInfo.getH_rcvd_amt());
            }
        }
        return integer;
    }

    public static String getProductMessage(List<CartListDao.CartInfo> list) {
        StringBuilder sb = new StringBuilder();
        int h_tk_cnt = 0;
        for (CartListDao.CartInfo cartInfo : list) {
            if (cartInfo.getH_item_dv_cd().equals("1") || cartInfo.getH_item_dv_cd().equals("2") || cartInfo.getH_item_dv_cd().equals(StbkAcntDao.ACCOUNT_REGISTER)) {
                if (sb.length() != 0) {
                    h_tk_cnt = ((cartInfo.getH_item_dv_cd().equals("2") || cartInfo.getH_item_dv_cd().equals(StbkAcntDao.ACCOUNT_REGISTER)) && cartInfo.getH_tk_cnt() == 0) ? h_tk_cnt + 1 : h_tk_cnt + cartInfo.getH_tk_cnt();
                } else if ((cartInfo.getH_item_dv_cd().equals("2") || cartInfo.getH_item_dv_cd().equals(StbkAcntDao.ACCOUNT_REGISTER)) && cartInfo.getH_tk_cnt() == 0) {
                    sb.append(cartInfo.getH_add_srv_mrk_ent_nm());
                    sb.append("(1개)");
                } else {
                    sb.append(cartInfo.getH_add_srv_mrk_ent_nm());
                    sb.append(" - ");
                    sb.append(cartInfo.getH_gd_nm());
                    sb.append("(");
                    sb.append(cartInfo.getH_tk_cnt());
                    sb.append("개)");
                }
            } else if (cartInfo.getH_item_dv_cd().equals(StbkAcntDao.CHANGE_PASSWORD)) {
                sb.append(cartInfo.getH_add_srv_mrk_ent_nm());
            }
        }
        if (h_tk_cnt > 0) {
            sb.append(" 외 ");
            sb.append(h_tk_cnt);
            sb.append("개");
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<com.korail.talk.data.DiscountObjectData> getTargetUser(android.content.Context r12, java.util.List<com.korail.talk.network.response.certification.ReservationResponse.JrnyInfo> r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.D.getTargetUser(android.content.Context, java.util.List, java.lang.String):java.util.ArrayList");
    }

    public static DiscountPriceParams[] initDiscountParamArray(ReservationResponse.JrnyInfo jrnyInfo, int i8) {
        DiscountPriceParams[] discountPriceParamsArr = new DiscountPriceParams[i8];
        List<ReservationResponse.SeatInfo> seat_info = jrnyInfo.getSeat_infos().getSeat_info();
        for (int i9 = 0; i9 < seat_info.size(); i9++) {
            if (seat_info.get(i9).getH_dcnt_knd_cd1().equals("202")) {
                discountPriceParamsArr[i9] = makeDiscountParams(jrnyInfo, i9, "", "321");
            } else {
                discountPriceParamsArr[i9] = makeDiscountParams(jrnyInfo, i9, "", "");
            }
        }
        return discountPriceParamsArr;
    }

    public static boolean isApproveScheme(Context context, Intent intent) {
        if (!C6630d.isNotNull(intent) || !C6630d.isNotNull(intent.getData())) {
            return false;
        }
        boolean zIsApproveScheme = isApproveScheme(context, intent.getData());
        t.d("isApproveScheme : " + zIsApproveScheme);
        return zIsApproveScheme;
    }

    public static ArrayList<String> makeDellCarNo(List<CartListDao.CartInfo> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (CartListDao.CartInfo cartInfo : list) {
            if ("2".equals(cartInfo.getH_item_dv_cd()) || cartInfo.getH_item_dv_cd().equals(StbkAcntDao.ACCOUNT_REGISTER)) {
                arrayList.add(cartInfo.getH_lump_stl_tgt_no());
            }
        }
        return arrayList;
    }

    public static DiscountPriceParams makeDiscountParams(ReservationResponse.JrnyInfo jrnyInfo, int i8, String str, String str2) {
        ReservationResponse.SeatInfo seatInfo = jrnyInfo.getSeat_infos().getSeat_info().get(i8);
        DiscountPriceParams discountPriceParams = new DiscountPriceParams();
        discountPriceParams.setPsg_tp_dv_cd(seatInfo.getH_psg_tp_cd());
        discountPriceParams.setPsrm_cl_cd(seatInfo.getH_psrm_cl_cd());
        if ("432".equals(str2)) {
            discountPriceParams.setDcnt_knd_cd1("432");
            str2 = "";
        } else {
            discountPriceParams.setDcnt_knd_cd1(A4.a.isMeritIntegratedDC(str2, str) ? "000" : seatInfo.getH_dcnt_knd_cd1());
        }
        discountPriceParams.setHidDscpNo(str);
        discountPriceParams.setHidDcntKndCd(str2);
        discountPriceParams.setHidFmlyNo("");
        return discountPriceParams;
    }

    public static boolean isApproveScheme(Context context, Uri uri) {
        return context.getString(AbstractC5959j.korailtalk_scheme_approve).equals(uri.getScheme() + "://" + uri.getAuthority());
    }
}
