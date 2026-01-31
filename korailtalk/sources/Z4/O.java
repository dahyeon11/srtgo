package z4;

import android.content.Context;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class O {
    private static String a(String str) {
        String code = r4.s.ALL.getCode();
        for (r4.s sVar : r4.s.values()) {
            if (N.isNotNull(str) && str.equals(sVar.getName())) {
                return sVar.getCode();
            }
        }
        return code;
    }

    public static String getSequenceNo(String str) {
        return N.addZero(3, Integer.parseInt(str));
    }

    public static String getTrainGroupCode(Context context) {
        return a(H.getString(context, "TrainType"));
    }

    public static String[] getTrainGroupFilterData() {
        r4.s[] sVarArrValues = r4.s.values();
        ArrayList arrayList = new ArrayList();
        for (r4.s sVar : sVarArrValues) {
            if (r4.s.ALL == sVar || r4.s.KTX == sVar || r4.s.SAEMAUL == sVar || r4.s.MUGUNGHWA == sVar || r4.s.ITX_YOUTH == sVar) {
                arrayList.add(sVar.getName());
            }
        }
        String[] strArr = new String[arrayList.size()];
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            strArr[i8] = (String) arrayList.get(i8);
        }
        return strArr;
    }

    public static int getTrainGroupFilterIndex(String str) {
        if (r4.s.KTX.getCode().equals(str)) {
            return 1;
        }
        if (r4.s.SAEMAUL.getCode().equals(str)) {
            return 2;
        }
        if (r4.s.MUGUNGHWA.getCode().equals(str)) {
            return 3;
        }
        return r4.s.ITX_YOUTH.getCode().equals(str) ? 4 : 0;
    }

    public static String getTrainGroupName(String str) {
        for (r4.s sVar : r4.s.values()) {
            if (str.equals(sVar.getCode())) {
                return sVar.getName();
            }
        }
        return "";
    }

    public static String[] getTrainGroupTransferFilterData() {
        r4.s[] sVarArrValues = r4.s.values();
        ArrayList arrayList = new ArrayList();
        for (r4.s sVar : sVarArrValues) {
            if (r4.s.ALL == sVar || r4.s.KTX == sVar || r4.s.SAEMAUL == sVar || r4.s.MUGUNGHWA == sVar) {
                arrayList.add(sVar.getName());
            }
        }
        String[] strArr = new String[arrayList.size()];
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            strArr[i8] = (String) arrayList.get(i8);
        }
        return strArr;
    }

    public static boolean isLimousine(ReservationResponse.JrnyInfo jrnyInfo) {
        return isLimousine(jrnyInfo.getH_trn_clsf_cd()) || isLimousine(jrnyInfo.getH_stlb_trn_clsf_cd());
    }

    public static boolean isSuperiorClass(String str, String str2) {
        return "16".equals(str) && r4.o.SPECIAL.getCode().equals(str2);
    }

    public static boolean isTourTrainGroup(String str) {
        if (!N.isNotNull(str)) {
            return false;
        }
        boolean z8 = false;
        for (r4.s sVar : r4.s.values()) {
            if ((r4.s.VTRN.equals(sVar) || r4.s.STRN.equals(sVar) || r4.s.DTRN.equals(sVar) || r4.s.ATRN.equals(sVar) || r4.s.GTRN.equals(sVar) || r4.s.XTRN.equals(sVar)) && sVar.getCode().equals(str)) {
                z8 = true;
            }
        }
        return z8;
    }

    public static boolean isLimousine(String str) {
        return "98".equals(str);
    }
}
