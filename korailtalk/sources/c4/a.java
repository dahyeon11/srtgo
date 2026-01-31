package C4;

import J5.d;
import J5.f;
import android.os.Bundle;
import com.korail.talk.data.CreditCardData;
import com.korail.talk.data.PointData;
import com.korail.talk.network.dao.addService.HelpSrvCustDao;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import com.korail.talk.network.request.payment.PaymentMethod;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.ui.ticket.confirm.TicketSelfCheckinStatusActivity;
import p4.C6054a;
import r4.h;
import z4.t;

/* loaded from: classes.dex */
public class a {
    public static PaymentMethod getCardRequest(Bundle bundle, CreditCardData creditCardData, PointData pointData, f fVar) {
        PaymentMethod paymentMethod = new PaymentMethod();
        String pointType = pointData.getPointType();
        paymentMethod.setHidInrecmnsGridcnt(String.valueOf(1));
        paymentMethod.setHidStlMnsSqno(1, String.valueOf(1));
        paymentMethod.setHidStlMnsCd(1, "02");
        paymentMethod.setHidMnsStlAmt(1, bundle.getString("PAYMENT_AMOUNT"));
        paymentMethod.setHidCrdInpWayCd(1, "@");
        paymentMethod.setHidStlCrCrdNo(1, creditCardData.getCardNumber());
        paymentMethod.setHidVanPwd(1, creditCardData.getPassword());
        paymentMethod.setHidCrdVlidTrm(1, creditCardData.getCrdVlidTrm());
        paymentMethod.setHidIsmtMnthNum(1, creditCardData.getInstallmentType());
        paymentMethod.setHidAthnDvCd(1, creditCardData.getCreditCardType());
        paymentMethod.setHidAthnVal(1, creditCardData.getCertNumber());
        if ("3".equals(pointType)) {
            t.e("CITY 결제");
            paymentMethod.setHidPontDvCd(1, "3");
        } else if (!"-1".equals(pointType)) {
            if ("0".equals(pointType)) {
                int useingMileage = fVar.getUseingMileage();
                int useingSamsungMileage = fVar.getUseingSamsungMileage();
                if (useingMileage > 0 && useingSamsungMileage > 0) {
                    paymentMethod.putAll(getPointRequest(2, pointData, fVar, "0"));
                    paymentMethod.putAll(getPointRequest(3, pointData, fVar, StbkAcntDao.CHANGE_PASSWORD));
                } else if ((useingMileage <= 0 && useingSamsungMileage <= 0) || useingMileage > 0) {
                    paymentMethod.putAll(getPointRequest(2, pointData, null, ""));
                } else if (useingSamsungMileage > 0) {
                    paymentMethod.putAll(getPointRequest(2, pointData, fVar, StbkAcntDao.CHANGE_PASSWORD));
                }
            } else {
                paymentMethod.putAll(getPointRequest(2, pointData, null, ""));
            }
        }
        return paymentMethod;
    }

    public static PaymentMethod getCongressRequest(ReservationResponse.Dfpy dfpy) {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.setHidInrecmnsGridcnt(String.valueOf(1));
        paymentMethod.setHidStlMnsSqno(1, String.valueOf(1));
        paymentMethod.setHidStlMnsCd(1, "03");
        paymentMethod.setHidMnsStlAmt(1, String.valueOf(dfpy.getStlAmt()));
        paymentMethod.setHidDscpMgNo(1, dfpy.getDfpyNo());
        paymentMethod.setHidDfpyDscpNo(1, dfpy.getDscpMgNo());
        paymentMethod.setHidfpySrtCd(1, dfpy.getDfpySrtCd());
        return paymentMethod;
    }

    public static PaymentMethod getEasyRequest(Bundle bundle, PointData pointData, d dVar, f fVar) {
        PaymentMethod paymentMethod = new PaymentMethod();
        String pointType = pointData.getPointType();
        String string = bundle.getString("type");
        paymentMethod.setHidInrecmnsGridcnt(String.valueOf(1));
        paymentMethod.setHidStlMnsSqno(1, String.valueOf(1));
        t.d("간편결제 payType : " + string);
        if ("shinhanfan".equals(string)) {
            t.e("간편 결제 SHINHAN_FAN_PAY");
            try {
                String string2 = bundle.getString("out_nm1");
                String string3 = bundle.getString("out_nm2");
                paymentMethod.setHidStlMnsCd(1, "02");
                paymentMethod.setHidMnsStlAmt(1, bundle.getString("PAYMENT_AMOUNT"));
                paymentMethod.setHidCrdInpWayCd(1, "@");
                paymentMethod.setHidIsmtMnthNum(1, getInstallmentType(dVar.getInstallmentOption().getSelectedDropDownId()));
                paymentMethod.setHidAthnDvCd(1, "J");
                paymentMethod.setShStlCrCrdNo(1, string2);
                paymentMethod.setShCrdVldTrm(1, string3);
            } catch (Exception e8) {
                t.e(e8.getMessage());
            }
        } else if ("paybooc".equals(string)) {
            t.e("간편 결제 PAYBOOC");
            paymentMethod.setHidStlMnsCd(1, "02");
            paymentMethod.setHidMnsStlAmt(1, bundle.getString("PAYMENT_AMOUNT"));
            paymentMethod.setHidCrdInpWayCd(1, HelpSrvCustDao.HelpSrvCustRequest.f27549D);
            paymentMethod.setHidStlCrCrdNo(1, bundle.getString("pybcCardTknNo"));
            paymentMethod.setHidCrdVlidTrm(1, bundle.getString("cardValdYymm"));
            paymentMethod.setHidIsmtMnthNum(1, getInstallmentType(dVar.getInstallmentOption().getSelectedDropDownId()));
            paymentMethod.setStSpayGridCnt(String.valueOf(1));
            paymentMethod.setSpayDvCd("11");
            paymentMethod.setSpayCphdDatVal(bundle.getString("spaycphdDataVal"));
        } else if ("kbpay".equals(string)) {
            t.e("간편 결제 KB PAY");
            try {
                paymentMethod.setHidStlMnsCd(1, "02");
                paymentMethod.setHidMnsStlAmt(1, bundle.getString("PAYMENT_AMOUNT"));
                paymentMethod.setHidCrdInpWayCd(1, "@");
                paymentMethod.setHidIsmtMnthNum(1, getInstallmentType(dVar.getInstallmentOption().getSelectedDropDownId()));
                paymentMethod.setHidCrdVlidTrm(1, bundle.getString("VALID_TRM"));
                paymentMethod.setStSpayGridCnt(String.valueOf(1));
                paymentMethod.setSpayDvCd(C6054a.AFTER_DEPARTURE);
                paymentMethod.setSpayCphdDatVal(bundle.getString("OTC"));
            } catch (Exception e9) {
                t.e(e9.getMessage());
            }
        } else {
            if ("railplus".equals(string)) {
                t.e("간편 결제 RAIL_PLUS_PAY");
                String string4 = bundle.getString("CARD_NO");
                paymentMethod.setHidStlMnsCd(1, "13");
                paymentMethod.setHidMnsStlAmt(1, bundle.getString("PAYMENT_AMOUNT"));
                paymentMethod.setHidCrdInpWayCd(1, "@");
                paymentMethod.setHidStlCrCrdNo(1, string4);
                paymentMethod.setSpayDvCd("00");
            } else {
                boolean zEqualsIgnoreCase = "payco".equalsIgnoreCase(string);
                String str = TicketSelfCheckinStatusActivity.CHECKIN_STATUS_EXCEED;
                if (zEqualsIgnoreCase) {
                    t.e("간편 결제 PAYCO_PAY");
                    boolean zEquals = "31".equals(bundle.getString("mainPgCode"));
                    if (zEquals) {
                        str = "02";
                    }
                    paymentMethod.setHidStlMnsCd(1, str);
                    paymentMethod.setHidMnsStlAmt(1, bundle.getString("PAYMENT_AMOUNT"));
                    paymentMethod.setHidCrdInpWayCd(1, HelpSrvCustDao.HelpSrvCustRequest.f27549D);
                    paymentMethod.setHidStlCrCrdNo(1, bundle.getString("cardBin"));
                    paymentMethod.setStSpayGridCnt(String.valueOf(1));
                    paymentMethod.setSpayDvCd(zEquals ? "02" : "07");
                    paymentMethod.setSpayCphdDatVal(bundle.getString("spaycphdDataVal"));
                } else if ("kakao".equalsIgnoreCase(string)) {
                    t.e("간편 결제 KAKAOPAY");
                    boolean zEquals2 = "MONEY".equals(bundle.getString("payment_method_type").toUpperCase());
                    paymentMethod.setHidStlMnsCd(1, zEquals2 ? TicketSelfCheckinStatusActivity.CHECKIN_STATUS_EXCEED : "02");
                    paymentMethod.setHidMnsStlAmt(1, bundle.getString("PAYMENT_AMOUNT"));
                    paymentMethod.setHidCrdInpWayCd(1, HelpSrvCustDao.HelpSrvCustRequest.f27549D);
                    paymentMethod.setHidStlCrCrdNo(1, "");
                    paymentMethod.setStSpayGridCnt(String.valueOf(1));
                    paymentMethod.setSpayDvCd(!zEquals2 ? TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE : "08");
                    paymentMethod.setSpayCphdDatVal(bundle.getString("spaycphdDataVal"));
                } else if ("stbk".equalsIgnoreCase(string)) {
                    t.e("간편 결제 세틀뱅크");
                    paymentMethod.setHidStlMnsCd(1, TicketSelfCheckinStatusActivity.CHECKIN_STATUS_EXCEED);
                    paymentMethod.setHidMnsStlAmt(1, bundle.getString("PAYMENT_AMOUNT"));
                    paymentMethod.setHidAthnVal(1, bundle.getString("password"));
                    paymentMethod.setStSpayGridCnt(String.valueOf(1));
                    paymentMethod.setSpayDvCd("03");
                    paymentMethod.setSpayCphdDatVal(bundle.getString("bankCode"));
                } else if ("stbkAcnt".equalsIgnoreCase(string)) {
                    t.e("간편 결제 세틀뱅크 내통장결제");
                    paymentMethod.setHidStlMnsCd(1, TicketSelfCheckinStatusActivity.CHECKIN_STATUS_EXCEED);
                    paymentMethod.setHidMnsStlAmt(1, bundle.getString("PAYMENT_AMOUNT"));
                    paymentMethod.setStSpayGridCnt(String.valueOf(1));
                    paymentMethod.setSpayDvCd("10");
                    paymentMethod.setSpayCphdDatVal(bundle.getString("ordNo") + bundle.getString("authNo"));
                } else if ("railplus_zeropay".equalsIgnoreCase(string)) {
                    t.e("간편 결제 제로페이");
                    paymentMethod.setHidStlMnsCd(1, TicketSelfCheckinStatusActivity.CHECKIN_STATUS_EXCEED);
                    paymentMethod.setHidMnsStlAmt(1, bundle.getString("PAYMENT_AMOUNT"));
                    paymentMethod.setStSpayGridCnt(String.valueOf(1));
                    paymentMethod.setSpayDvCd("04");
                    paymentMethod.setSpayCphdDatVal(bundle.getString("ZERO_PAY_QR_TOKEN"));
                } else if ("naverPay".equalsIgnoreCase(string)) {
                    t.e("간편 결제 네이버페이");
                    paymentMethod.setHidStlMnsCd(1, "02");
                    paymentMethod.setHidMnsStlAmt(1, bundle.getString("PAYMENT_AMOUNT"));
                    paymentMethod.setHidCrdInpWayCd(1, HelpSrvCustDao.HelpSrvCustRequest.f27549D);
                    paymentMethod.setStSpayGridCnt(String.valueOf(1));
                    paymentMethod.setSpayDvCd(TicketSelfCheckinStatusActivity.CHECKIN_STATUS_USING);
                    paymentMethod.setSpayCphdDatVal(bundle.getString("paymentId"));
                } else if ("naverPayMoney".equalsIgnoreCase(string)) {
                    t.e("간편 결제 네이버페이 머니 ");
                    paymentMethod.setHidStlMnsCd(1, TicketSelfCheckinStatusActivity.CHECKIN_STATUS_EXCEED);
                    paymentMethod.setHidMnsStlAmt(1, bundle.getString("PAYMENT_AMOUNT"));
                    paymentMethod.setHidCrdInpWayCd(1, HelpSrvCustDao.HelpSrvCustRequest.f27549D);
                    paymentMethod.setStSpayGridCnt(String.valueOf(1));
                    paymentMethod.setSpayDvCd("16");
                    paymentMethod.setSpayCphdDatVal(bundle.getString("paymentId"));
                } else if ("tosspay".equalsIgnoreCase(string) || "tosspay_auto".equalsIgnoreCase(string)) {
                    t.e("간편 결제 토스페이(일반tosspay, 자동tosspay_auto)");
                    boolean zEquals3 = "TOSS_MONEY".equals(bundle.getString("payMethod").toUpperCase());
                    paymentMethod.setHidStlMnsCd(1, zEquals3 ? TicketSelfCheckinStatusActivity.CHECKIN_STATUS_EXCEED : "02");
                    paymentMethod.setHidMnsStlAmt(1, bundle.getString("PAYMENT_AMOUNT"));
                    paymentMethod.setHidCrdInpWayCd(1, HelpSrvCustDao.HelpSrvCustRequest.f27549D);
                    paymentMethod.setHidStlCrCrdNo(1, bundle.getString("stlCrdNo"));
                    paymentMethod.setStSpayGridCnt(String.valueOf(1));
                    paymentMethod.setSpayDvCd(zEquals3 ? "13" : "12");
                    StringBuilder sb = new StringBuilder();
                    sb.append("tosspay".equals(string) ? "N" : "Y");
                    sb.append(bundle.getString("spayTid"));
                    paymentMethod.setSpayCphdDatVal(sb.toString());
                }
            }
        }
        if (!"-1".equals(pointType)) {
            if ("0".equals(pointType)) {
                int useingMileage = fVar.getUseingMileage();
                int useingSamsungMileage = fVar.getUseingSamsungMileage();
                if (useingMileage > 0 && useingSamsungMileage > 0) {
                    paymentMethod.putAll(getPointRequest(2, pointData, fVar, "0"));
                    paymentMethod.putAll(getPointRequest(3, pointData, fVar, StbkAcntDao.CHANGE_PASSWORD));
                } else if ((useingMileage <= 0 && useingSamsungMileage <= 0) || useingMileage > 0) {
                    paymentMethod.putAll(getPointRequest(2, pointData, null, ""));
                } else if (useingSamsungMileage > 0) {
                    paymentMethod.putAll(getPointRequest(2, pointData, fVar, StbkAcntDao.CHANGE_PASSWORD));
                }
            } else {
                paymentMethod.putAll(getPointRequest(2, pointData, null, ""));
            }
        }
        return paymentMethod;
    }

    public static String getInstallmentType(int i8) {
        h hVar = h.INS_0;
        switch (i8) {
            case 1:
                hVar = h.INS_2;
                break;
            case 2:
                hVar = h.INS_3;
                break;
            case 3:
                hVar = h.INS_4;
                break;
            case 4:
                hVar = h.INS_5;
                break;
            case 5:
                hVar = h.INS_6;
                break;
            case 6:
                hVar = h.INS_12;
                break;
            case 7:
                hVar = h.INS_24;
                break;
        }
        return hVar.getCode();
    }

    public static PaymentMethod getPointRequest(int i8, PointData pointData, f fVar, String str) {
        PaymentMethod paymentMethod = new PaymentMethod();
        String pointType = pointData.getPointType();
        paymentMethod.setHidInrecmnsGridcnt(String.valueOf(i8));
        paymentMethod.setHidStlMnsSqno(i8, String.valueOf(i8));
        if ("0".equals(pointType)) {
            pointData.getUsePoint();
            if (fVar == null) {
                paymentMethod.setHidPontDvCd(i8, "0");
                paymentMethod.setHidMnsStlAmt(i8, String.valueOf(pointData.getUsePoint()));
            } else if ("0".equals(str)) {
                int useingMileage = fVar.getUseingMileage();
                paymentMethod.setHidPontDvCd(i8, "0");
                paymentMethod.setHidMnsStlAmt(i8, String.valueOf(useingMileage));
            } else {
                int useingSamsungMileage = fVar.getUseingSamsungMileage();
                paymentMethod.setHidPontDvCd(i8, StbkAcntDao.CHANGE_PASSWORD);
                paymentMethod.setHidMnsStlAmt(i8, String.valueOf(useingSamsungMileage));
            }
            t.e("포인트 KORAIL");
            paymentMethod.setHidStlMnsCd(i8, "12");
            paymentMethod.setHidCrdInpWayCd(i8, "P");
            paymentMethod.setHidIsmtMnthNum(i8, "0");
            paymentMethod.setHidPontInpDvCd(i8, "1");
            paymentMethod.setHidPontCrdPwd(i8, "****");
        } else if ("1".equals(pointType)) {
            t.e("포인트 RAIL");
            paymentMethod.setHidStlMnsCd(i8, "12");
            paymentMethod.setHidMnsStlAmt(i8, String.valueOf(pointData.getUsePoint()));
            paymentMethod.setHidCrdInpWayCd(i8, "P");
            paymentMethod.setHidIsmtMnthNum(i8, "0");
            paymentMethod.setHidPontDvCd(i8, "1");
            paymentMethod.setHidPontInpDvCd(i8, "1");
            paymentMethod.setHidPontCrdPwd(i8, "****");
        } else if ("2".equals(pointType)) {
            t.e("포인트 WOORIMOA");
            paymentMethod.setHidStlMnsCd(i8, "12");
            paymentMethod.setHidMnsStlAmt(i8, String.valueOf(pointData.getUsePoint()));
            paymentMethod.setHidCrdInpWayCd(i8, "@");
            paymentMethod.setHidStlCrCrdNo(i8, pointData.getPointCardNumber());
            paymentMethod.setHidVanPwd(i8, pointData.getPassword());
            paymentMethod.setHidCrdVlidTrm(i8, pointData.getCrdVlidTrm());
            paymentMethod.setHidIsmtMnthNum(i8, "0");
            paymentMethod.setHidPontDvCd(i8, "2");
            paymentMethod.setHidPontInpDvCd(i8, "3");
        } else if (StbkAcntDao.ACCOUNT_REGISTER.equals(pointType)) {
            t.e("포인트 OKCASHBAG");
            paymentMethod.setHidStlMnsCd(i8, "12");
            paymentMethod.setHidMnsStlAmt(i8, String.valueOf(pointData.getUsePoint()));
            paymentMethod.setHidCrdInpWayCd(i8, "@");
            paymentMethod.setHidStlCrCrdNo(i8, pointData.getPointCardNumber());
            paymentMethod.setHidPontDvCd(i8, StbkAcntDao.ACCOUNT_REGISTER);
            paymentMethod.setHidPontInpDvCd(i8, StbkAcntDao.ACCOUNT_REGISTER);
            paymentMethod.setHidPontCrdPwd(i8, pointData.getPassword());
        } else if (StbkAcntDao.CHANGE_PASSWORD.equals(pointType)) {
            t.d("param : " + i8);
            paymentMethod.setHidStlMnsCd(i8, TicketSelfCheckinStatusActivity.CHECKIN_STATUS_EXCEED);
            paymentMethod.setHidMnsStlAmt(i8, String.valueOf(pointData.getUsePoint()));
            paymentMethod.setHidCrdInpWayCd(i8, "@");
            paymentMethod.setHidAthnVal(i8, pointData.getPassword());
            if (i8 == 1) {
                paymentMethod.setStSpayGridCnt(String.valueOf(i8));
                paymentMethod.setSpayDvCd("09");
                paymentMethod.setSpayCphdDatVal(pointData.getCustomerNo());
            } else {
                paymentMethod.setStSpayGridCnt2("1");
                paymentMethod.setSpayDvCd2("09");
                paymentMethod.setSpayCphdDatVal2(pointData.getCustomerNo());
            }
        } else if ("6".equals(pointType)) {
            paymentMethod.setHidStlMnsCd(i8, "12");
            paymentMethod.setHidMnsStlAmt(i8, String.valueOf(pointData.getUsePoint()));
            paymentMethod.setHidCrdInpWayCd(i8, "@");
            paymentMethod.setHidIsmtMnthNum(i8, "0");
            paymentMethod.setHidPontDvCd(i8, "6");
            paymentMethod.setHidPontInpDvCd(i8, StbkAcntDao.CHANGE_PASSWORD);
            paymentMethod.setHidStlCrCrdNo(i8, pointData.getPointCardNumber());
        }
        return paymentMethod;
    }
}
