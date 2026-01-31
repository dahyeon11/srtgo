package o4;

import android.content.Context;
import com.korail.talk.database.model.CreditCard;
import com.korail.talk.database.model.IssueList;
import com.korail.talk.database.model.TicketDetail;
import com.korail.talk.network.dao.myTicket.TicketListDao;
import com.korail.talk.network.dao.myTicket.TicketListDao.ReservationList;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import g5.e;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m4.C5908a;
import q4.C6111b;
import z4.C6630d;
import z4.N;
import z4.q;

/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6038a {
    private static boolean a(Context context, CreditCard creditCard) {
        return (N.isNull(C5908a.decryptAES(context, creditCard.getCardNickname())) || N.isNull(C5908a.decryptAES(context, creditCard.getCardNumber())) || N.isNull(C5908a.decryptAES(context, creditCard.getCardValidateMonth())) || N.isNull(C5908a.decryptAES(context, creditCard.getCardValidateYear()))) ? false : true;
    }

    public static List<TicketDetailDao.TicketDetailResponse> decryptIssueDetailListData(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        TicketDetail ticketDetailByPnrNo = C6111b.getInstance().getTicketDetailByPnrNo(str);
        if (!C6630d.isNotNull(ticketDetailByPnrNo)) {
            return arrayList;
        }
        String strDecryptAES = C5908a.decryptAES(context, ticketDetailByPnrNo.getTicketDetail());
        if (!N.isNotNull(strDecryptAES)) {
            return arrayList;
        }
        TicketDetailDao.TicketDetailResponse[] ticketDetailResponseArr = (TicketDetailDao.TicketDetailResponse[]) q.fromJson(strDecryptAES, TicketDetailDao.TicketDetailResponse[].class);
        return (C6630d.isNull(ticketDetailResponseArr) || ticketDetailResponseArr.length == 0) ? arrayList : Arrays.asList(ticketDetailResponseArr);
    }

    public static List<TicketListDao.ReservationList> decryptIssueListData(Context context) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        List<IssueList> allIssueList = C6111b.getInstance().getAllIssueList();
        if (!C6630d.isNull(allIssueList) && !allIssueList.isEmpty()) {
            Iterator<IssueList> it = allIssueList.iterator();
            while (it.hasNext()) {
                String strDecryptAES = C5908a.decryptAES(context, it.next().getIssueList());
                if (N.isNotNull(strDecryptAES)) {
                    List<TicketListDao.ReservationList> reservation_list = ((TicketListDao.TicketListResponse) q.fromJson(strDecryptAES, TicketListDao.TicketListResponse.class)).getReservation_list();
                    if (!C6630d.isNull(reservation_list) && !reservation_list.isEmpty()) {
                        arrayList.addAll(getReorderTicketList("1", reservation_list));
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<CreditCard> getCreditCardList(Context context) {
        ArrayList arrayList = new ArrayList();
        for (CreditCard creditCard : C6111b.getInstance().getCreditCardList()) {
            if (a(context, creditCard)) {
                arrayList.add(creditCard);
            }
        }
        return arrayList;
    }

    public static List<TicketListDao.ReservationList> getReorderTicketList(String str, List<TicketListDao.ReservationList> list) {
        TicketListDao ticketListDao;
        int i8;
        int i9;
        ArrayList arrayList;
        ArrayList arrayList2;
        TicketListDao ticketListDao2;
        int i10;
        int i11;
        ArrayList arrayList3;
        TicketListDao ticketListDao3;
        int i12;
        int i13;
        TicketListDao.ReservationList reservationList;
        int i14;
        String str2 = str;
        List<TicketListDao.ReservationList> list2 = list;
        ArrayList arrayList4 = new ArrayList();
        TicketListDao ticketListDao4 = new TicketListDao();
        int i15 = 0;
        int i16 = 0;
        while (i16 < list.size()) {
            String h_pbp_acep_tgt_flg = list2.get(i16).getTicket_list().get(i15).getTrain_info().get(i15).getH_pbp_acep_tgt_flg();
            if ("1".equals(str2)) {
                "Y".equals(h_pbp_acep_tgt_flg);
            } else {
                if ("2".equals(str2) && "F".equals(h_pbp_acep_tgt_flg)) {
                    arrayList = arrayList4;
                    int i17 = i16;
                    ticketListDao = ticketListDao4;
                    i9 = i15;
                    i8 = i17;
                }
                int i18 = i8 + 1;
                i15 = i9;
                ticketListDao4 = ticketListDao;
                i16 = i18;
                arrayList4 = arrayList;
                str2 = str;
            }
            if (arrayList4.size() == 0) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.add(list2.get(i16).getTicket_list().get(i15));
                TicketListDao.ReservationList reservationList2 = ticketListDao4.new ReservationList();
                reservationList2.setTicket_list(arrayList5);
                arrayList4.add(reservationList2);
                arrayList = arrayList4;
                int i172 = i16;
                ticketListDao = ticketListDao4;
                i9 = i15;
                i8 = i172;
                int i182 = i8 + 1;
                i15 = i9;
                ticketListDao4 = ticketListDao;
                i16 = i182;
                arrayList4 = arrayList;
                str2 = str;
            } else {
                int i19 = i15;
                int i20 = i19;
                while (i19 < arrayList4.size()) {
                    String h_tk_knd_cd = list2.get(i16).getTicket_list().get(i15).getTrain_info().get(i15).getH_tk_knd_cd();
                    if (("72".equals(h_tk_knd_cd) || "74".equals(h_tk_knd_cd) || "75".equals(h_tk_knd_cd) || "13".equals(h_tk_knd_cd) || "87".equals(h_tk_knd_cd) || "89".equals(h_tk_knd_cd) || "94".equals(h_tk_knd_cd) || "90".equals(h_tk_knd_cd) || "92".equals(h_tk_knd_cd) || "93".equals(h_tk_knd_cd) || "22".equals(h_tk_knd_cd)) && ((TicketListDao.ReservationList) arrayList4.get(i19)).getTicket_list().get(i15).getTrain_info().get(i15).getH_pnr_no().equals(list2.get(i16).getTicket_list().get(i15).getTrain_info().get(i15).getH_pnr_no())) {
                        TicketListDao.ReservationList reservationList3 = (TicketListDao.ReservationList) arrayList4.get(i19);
                        reservationList3.getTicket_list().add(list2.get(i16).getTicket_list().get(i15));
                        List<TicketListDao.TicketList> ticket_list = reservationList3.getTicket_list();
                        ArrayList arrayList6 = new ArrayList();
                        int i21 = i15;
                        while (i21 < ticket_list.size()) {
                            if (i21 == 0) {
                                arrayList6.add(ticket_list.get(i15));
                            }
                            int i22 = i15;
                            while (true) {
                                if (i22 >= arrayList6.size()) {
                                    arrayList3 = arrayList4;
                                    ticketListDao3 = ticketListDao4;
                                    i12 = i16;
                                    i13 = i19;
                                    reservationList = reservationList3;
                                    break;
                                }
                                ArrayList arrayList7 = new ArrayList();
                                TicketListDao.TrainInfo trainInfo = ticket_list.get(i21).getTrain_info().get(i15);
                                TicketListDao.TrainInfo trainInfo2 = arrayList6.get(i22).getTrain_info().get(i15);
                                String h_orgtk_ret_pwd = trainInfo.getH_orgtk_ret_pwd();
                                String h_orgtk_ret_pwd2 = trainInfo2.getH_orgtk_ret_pwd();
                                String h_orgtk_ret_sale_dt = trainInfo.getH_orgtk_ret_sale_dt();
                                arrayList3 = arrayList4;
                                String h_orgtk_ret_sale_dt2 = trainInfo2.getH_orgtk_ret_sale_dt();
                                ticketListDao3 = ticketListDao4;
                                String h_orgtk_wct_no = trainInfo.getH_orgtk_wct_no();
                                String h_orgtk_wct_no2 = trainInfo2.getH_orgtk_wct_no();
                                i12 = i16;
                                String h_orgtk_sale_sqno = trainInfo.getH_orgtk_sale_sqno();
                                i13 = i19;
                                String h_orgtk_sale_sqno2 = trainInfo2.getH_orgtk_sale_sqno();
                                if (i21 == i22) {
                                    reservationList = reservationList3;
                                } else {
                                    reservationList = reservationList3;
                                    if (!h_orgtk_ret_pwd.equals(h_orgtk_ret_pwd2) || !h_orgtk_ret_sale_dt.equals(h_orgtk_ret_sale_dt2) || !h_orgtk_wct_no.equals(h_orgtk_wct_no2) || !h_orgtk_sale_sqno.equals(h_orgtk_sale_sqno2)) {
                                        int i23 = 0;
                                        while (i23 < arrayList6.size()) {
                                            String h_orgtk_ret_pwd3 = arrayList6.get(i23).getTrain_info().get(0).getH_orgtk_ret_pwd();
                                            String h_orgtk_ret_sale_dt3 = arrayList6.get(i23).getTrain_info().get(0).getH_orgtk_ret_sale_dt();
                                            String h_orgtk_wct_no3 = arrayList6.get(i23).getTrain_info().get(0).getH_orgtk_wct_no();
                                            i14 = i22;
                                            String h_orgtk_sale_sqno3 = arrayList6.get(i23).getTrain_info().get(0).getH_orgtk_sale_sqno();
                                            if (h_orgtk_ret_pwd.equals(h_orgtk_ret_pwd3) && h_orgtk_ret_sale_dt.equals(h_orgtk_ret_sale_dt3) && h_orgtk_wct_no.equals(h_orgtk_wct_no3) && h_orgtk_sale_sqno.equals(h_orgtk_sale_sqno3)) {
                                                if (trainInfo.getH_tk_sqno().equals("00001")) {
                                                    arrayList7.add(ticket_list.get(i21).getTrain_info().get(0));
                                                    arrayList7.add(arrayList6.get(i23).getTrain_info().get(0));
                                                } else {
                                                    arrayList7.add(arrayList6.get(i23).getTrain_info().get(0));
                                                    arrayList7.add(ticket_list.get(i21).getTrain_info().get(0));
                                                }
                                                arrayList6.get(i23).setTrain_info(null);
                                                arrayList6.get(i23).setTrain_info(arrayList7);
                                                i22 = i14 + 1;
                                                arrayList4 = arrayList3;
                                                ticketListDao4 = ticketListDao3;
                                                i16 = i12;
                                                i19 = i13;
                                                reservationList3 = reservationList;
                                                i15 = 0;
                                            } else {
                                                i23++;
                                                i22 = i14;
                                            }
                                        }
                                        arrayList6.add(ticket_list.get(i21));
                                        break;
                                    }
                                    if (trainInfo.getH_tk_sqno().equals("00001")) {
                                        arrayList7.add(trainInfo);
                                        arrayList7.add(trainInfo2);
                                    } else {
                                        arrayList7.add(trainInfo2);
                                        arrayList7.add(trainInfo);
                                    }
                                    arrayList6.get(i22).setTrain_info(null);
                                    arrayList6.get(i22).setTrain_info(arrayList7);
                                }
                                i14 = i22;
                                i22 = i14 + 1;
                                arrayList4 = arrayList3;
                                ticketListDao4 = ticketListDao3;
                                i16 = i12;
                                i19 = i13;
                                reservationList3 = reservationList;
                                i15 = 0;
                            }
                            i21++;
                            arrayList4 = arrayList3;
                            ticketListDao4 = ticketListDao3;
                            i16 = i12;
                            i19 = i13;
                            reservationList3 = reservationList;
                            i15 = 0;
                        }
                        arrayList2 = arrayList4;
                        ticketListDao2 = ticketListDao4;
                        i10 = i16;
                        i11 = i19;
                        reservationList3.setTicket_list(arrayList6);
                        i20 = 1;
                    } else {
                        arrayList2 = arrayList4;
                        ticketListDao2 = ticketListDao4;
                        i10 = i16;
                        i11 = i19;
                    }
                    i19 = i11 + 1;
                    list2 = list;
                    arrayList4 = arrayList2;
                    ticketListDao4 = ticketListDao2;
                    i16 = i10;
                    i15 = 0;
                }
                ArrayList arrayList8 = arrayList4;
                TicketListDao ticketListDao5 = ticketListDao4;
                int i24 = i16;
                if (i20 == 0) {
                    ArrayList arrayList9 = new ArrayList();
                    list2 = list;
                    i8 = i24;
                    i9 = 0;
                    arrayList9.add(list2.get(i8).getTicket_list().get(0));
                    ticketListDao = ticketListDao5;
                    TicketListDao.ReservationList reservationList4 = ticketListDao.new ReservationList();
                    reservationList4.setTicket_list(arrayList9);
                    arrayList = arrayList8;
                    arrayList.add(reservationList4);
                } else {
                    list2 = list;
                    arrayList = arrayList8;
                    ticketListDao = ticketListDao5;
                    i8 = i24;
                    i9 = 0;
                }
                int i1822 = i8 + 1;
                i15 = i9;
                ticketListDao4 = ticketListDao;
                i16 = i1822;
                arrayList4 = arrayList;
                str2 = str;
            }
        }
        return arrayList4;
    }

    public static String[] getReturnNo(String str) {
        return new String[]{str.substring(0, 5), str.substring(5, 9), str.substring(9, 14), str.substring(14, 16)};
    }

    public static String getReturnNumber(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2.length() > 4) {
            str2 = str2.substring(str2.length() - 4);
        }
        sb.append(str2);
        sb.append(N.getInteger(str3));
        sb.append(str4);
        return sb.toString();
    }

    public static String getReturnNumberWithDash(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(e.STATE_NAME_NONE);
        if (str2.length() > 4) {
            str2 = str2.substring(str2.length() - 4);
        }
        sb.append(str2);
        sb.append(e.STATE_NAME_NONE);
        sb.append(N.getInteger(str3));
        sb.append(e.STATE_NAME_NONE);
        sb.append(str4);
        return sb.toString();
    }
}
