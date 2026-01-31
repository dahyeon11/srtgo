package z4;

import android.content.Context;
import android.os.Bundle;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC5959j;

/* renamed from: z4.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6626B extends C6632f {
    public static final String ELDER = "E";

    public static Bundle getPassengerBundleData() {
        return getPassengerBundleData(new Bundle());
    }

    public static String getPassengerNm(Context context, ReservationResponse.SeatInfo seatInfo) {
        String h_psg_tp_cd = seatInfo.getH_psg_tp_cd();
        String h_dcnt_knd_cd1 = seatInfo.getH_dcnt_knd_cd1();
        String strA = C6632f.a(context, AbstractC5959j.common_adult);
        return "1".equals(h_psg_tp_cd) ? "508".equals(h_dcnt_knd_cd1) ? context.getString(AbstractC5959j.common_teen) : "204".equals(h_dcnt_knd_cd1) ? context.getString(AbstractC5959j.common_elder) : "205".equals(h_dcnt_knd_cd1) ? context.getString(AbstractC5959j.common_disabled_1_3) : "206".equals(h_dcnt_knd_cd1) ? context.getString(AbstractC5959j.common_disabled_4_6) : "210".equals(h_dcnt_knd_cd1) ? context.getString(AbstractC5959j.common_guide_dog) : strA : "3".equals(h_psg_tp_cd) ? "202".equals(h_dcnt_knd_cd1) ? context.getString(AbstractC5959j.common_child_accompany) : context.getString(AbstractC5959j.common_child) : strA;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.os.Bundle getPassengerBundleData(android.os.Bundle r8) {
        /*
            boolean r0 = z4.C6630d.isNotNull(r8)
            if (r0 == 0) goto L15
            java.lang.String r0 = "data_from_SRT"
            boolean r1 = r8.containsKey(r0)
            if (r1 == 0) goto L15
            java.io.Serializable r8 = r8.getSerializable(r0)
            com.korail.talk.data.ReceiveSRTData r8 = (com.korail.talk.data.ReceiveSRTData) r8
            goto L16
        L15:
            r8 = 0
        L16:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            I4.h r1 = I4.h.getInstance()
            boolean r1 = r1.isLogin()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L87
            I4.h r1 = I4.h.getInstance()
            java.lang.String r1 = r1.getDisableGrade()
            boolean r1 = z4.C6630d.isNull(r1)
            if (r1 != 0) goto L87
            I4.h r1 = I4.h.getInstance()
            java.lang.String r1 = r1.getDisableGrade()
            int r1 = z4.N.getInteger(r1)
            I4.h r4 = I4.h.getInstance()
            java.lang.String r4 = r4.getStrAthnFlg7()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "disableGrade : "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = "passengerType : "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            z4.t.d(r5)
            if (r1 < r2) goto L6f
            r5 = 3
            if (r1 > r5) goto L6f
            r4 = r2
            r1 = r3
            r2 = r1
            r5 = r2
            goto L8a
        L6f:
            r5 = 4
            if (r1 < r5) goto L7a
            r5 = 6
            if (r1 > r5) goto L7a
            r5 = r2
            r1 = r3
            r2 = r1
            r4 = r2
            goto L8a
        L7a:
            java.lang.String r1 = "E"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L87
            r1 = r2
            r2 = r3
            r4 = r2
        L85:
            r5 = r4
            goto L8a
        L87:
            r1 = r3
            r4 = r1
            goto L85
        L8a:
            boolean r6 = z4.C6630d.isNotNull(r8)
            if (r6 == 0) goto La9
            int r2 = r8.getAdultCount()
            int r1 = r8.getChildCount()
            int r4 = r8.getSeniorCount()
            int r5 = r8.getHighDisabledCount()
            int r6 = r8.getLowDisabledCount()
            int r8 = r8.getChildAccompanyCount()
            goto Lae
        La9:
            r8 = r3
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r8
        Lae:
            java.lang.String r7 = "ADULT_COUNT"
            r0.putInt(r7, r2)
            java.lang.String r7 = "CHILD_COUNT"
            r0.putInt(r7, r1)
            java.lang.String r7 = "CHILD_ACCOMPANY_COUNT"
            r0.putInt(r7, r8)
            java.lang.String r7 = "SENIOR_COUNT"
            r0.putInt(r7, r4)
            java.lang.String r7 = "HIGH_DISABLE_COUNT"
            r0.putInt(r7, r5)
            java.lang.String r7 = "LOW_DISABLE_COUNT"
            r0.putInt(r7, r6)
            java.lang.String r7 = "GUIDE_DOG_COUNT"
            r0.putInt(r7, r3)
            int r2 = r2 + r1
            int r2 = r2 + r8
            int r2 = r2 + r4
            int r2 = r2 + r5
            int r2 = r2 + r6
            java.lang.String r8 = "TOTAL_PERSON_COUNT"
            r0.putInt(r8, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C6626B.getPassengerBundleData(android.os.Bundle):android.os.Bundle");
    }

    public static Bundle getPassengerBundleData(ArrayList<TicketDetailDao.TicketDetailResponse> arrayList) {
        Iterator<TicketDetailDao.TicketDetailResponse> it = arrayList.iterator();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (it.hasNext()) {
            TicketDetailDao.TicketSeatInfo ticketSeatInfo = it.next().getTicket_infos().getTicket_info().get(0).getTk_seat_info().get(0);
            String h_psg_tp_cd = ticketSeatInfo.getH_psg_tp_cd();
            String h_dcnt_knd_cd = ticketSeatInfo.getH_dcnt_knd_cd();
            if ("1".equals(h_psg_tp_cd)) {
                if ("204".equals(h_dcnt_knd_cd)) {
                    i11++;
                } else if ("205".equals(h_dcnt_knd_cd)) {
                    i12++;
                } else if ("206".equals(h_dcnt_knd_cd)) {
                    i13++;
                } else {
                    i8++;
                }
            } else if ("3".equals(h_psg_tp_cd)) {
                if ("202".equals(h_dcnt_knd_cd)) {
                    i10++;
                } else {
                    i9++;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("ADULT_COUNT", i8);
        bundle.putInt("CHILD_COUNT", i9);
        bundle.putInt("CHILD_ACCOMPANY_COUNT", i10);
        bundle.putInt("SENIOR_COUNT", i11);
        bundle.putInt("HIGH_DISABLE_COUNT", i12);
        bundle.putInt("LOW_DISABLE_COUNT", i13);
        return bundle;
    }

    public static Bundle getPassengerBundleData(List<ReservationResponse.SeatInfo> list) {
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (ReservationResponse.SeatInfo seatInfo : list) {
            String h_psg_tp_cd = seatInfo.getH_psg_tp_cd();
            String h_dcnt_knd_cd1 = seatInfo.getH_dcnt_knd_cd1();
            if ("1".equals(h_psg_tp_cd)) {
                if ("204".equals(h_dcnt_knd_cd1)) {
                    i11++;
                } else if ("205".equals(h_dcnt_knd_cd1)) {
                    i12++;
                } else if ("206".equals(h_dcnt_knd_cd1)) {
                    i13++;
                } else {
                    i8++;
                }
            } else if ("3".equals(h_psg_tp_cd)) {
                if ("202".equals(h_dcnt_knd_cd1)) {
                    i10++;
                } else {
                    i9++;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("ADULT_COUNT", i8);
        bundle.putInt("CHILD_COUNT", i9);
        bundle.putInt("CHILD_ACCOMPANY_COUNT", i10);
        bundle.putInt("SENIOR_COUNT", i11);
        bundle.putInt("HIGH_DISABLE_COUNT", i12);
        bundle.putInt("LOW_DISABLE_COUNT", i13);
        return bundle;
    }
}
