package H5;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.cust.MchdDcntTgtDao;
import com.korail.talk.network.dao.cust.MchdDcntTgtDao.MchdDcntTgtRequest;
import com.korail.talk.network.data.certification.DiscountPriceParams;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.util.ArrayList;
import java.util.List;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import t6.C6367b;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class A extends B {
    public static final String TAG = "MDiscountFragment";

    /* renamed from: B0 */
    private ArrayList f1802B0;

    /* renamed from: C0 */
    private boolean f1803C0;

    /* renamed from: D0 */
    private C6367b f1804D0;

    public /* synthetic */ void N0(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            N1();
        }
    }

    private void W1() {
        this.f1802B0 = new ArrayList();
    }

    private void n2() {
        MchdDcntTgtDao mchdDcntTgtDao = new MchdDcntTgtDao();
        MchdDcntTgtDao.MchdDcntTgtRequest mchdDcntTgtRequest = mchdDcntTgtDao.new MchdDcntTgtRequest();
        mchdDcntTgtRequest.setDptDt(getJrnyInfo().getH_dpt_dt());
        mchdDcntTgtDao.setRequest(mchdDcntTgtRequest);
        mchdDcntTgtDao.setFinishView(true);
        executeDao(mchdDcntTgtDao);
    }

    public static Fragment newInstance() {
        return new A();
    }

    private List o2() {
        ArrayList arrayList = new ArrayList();
        List<ReservationResponse.SeatInfo> seat_info = getJrnyInfo().getSeat_infos().getSeat_info();
        List<MchdDcntTgtDao.Fmly> list = (List) this.f1802B0.clone();
        for (ReservationResponse.SeatInfo seatInfo : seat_info) {
            for (MchdDcntTgtDao.Fmly fmly : list) {
                if ((fmly.getPsgTpCd().equals(seatInfo.getH_psg_tp_cd()) && fmly.getDcntKndCd().equals(seatInfo.getH_dcnt_knd_cd1())) || ("1".equals(fmly.getPsgTpCd()) && fmly.getPsgTpCd().equals(seatInfo.getH_psg_tp_cd()))) {
                    DiscountPriceParams discountPriceParams = new DiscountPriceParams();
                    discountPriceParams.setPsg_tp_dv_cd(seatInfo.getH_psg_tp_cd());
                    discountPriceParams.setPsrm_cl_cd(seatInfo.getH_psrm_cl_cd());
                    discountPriceParams.setDcnt_knd_cd1(seatInfo.getH_dcnt_knd_cd1());
                    String str = "";
                    discountPriceParams.setHidDscpNo("");
                    if ("3".equals(seatInfo.getH_psg_tp_cd()) && "202".equals(seatInfo.getH_dcnt_knd_cd1())) {
                        str = "321";
                    }
                    discountPriceParams.setHidDcntKndCd(str);
                    discountPriceParams.setHidFmlyNo(fmly.getFmlySqno());
                    arrayList.add(discountPriceParams);
                    list.remove(fmly);
                }
            }
        }
        return arrayList;
    }

    public /* synthetic */ void p2(ArrayList arrayList) {
        this.f1803C0 = false;
        this.f1802B0 = arrayList;
        q2(arrayList.size());
    }

    private void q2(int i8) {
        int size = getJrnyInfo().getSeat_infos().getSeat_info().size();
        this.f1486j0.setText(getString(AbstractC5959j.common_seat_select, Integer.valueOf(i8), Integer.valueOf(size)));
        this.f1486j0.setEnabled(i8 == size);
    }

    private void r2(List list) {
        this.f1804D0.setCertificationData(new C6367b.a() { // from class: H5.z
            @Override // t6.C6367b.a
            public final void onClick(ArrayList arrayList) {
                this.f1867a.p2(arrayList);
            }
        }, list);
    }

    @Override // H5.B, H5.s
    void N1() {
        List listO2 = o2();
        if (this.f1803C0) {
            R0();
        } else {
            this.f1807z0 = (DiscountPriceParams[]) listO2.toArray(new DiscountPriceParams[0]);
            k2();
        }
    }

    @Override // H5.s
    protected void P1(ViewGroup viewGroup) {
        C6367b c6367b = new C6367b(getActivity());
        this.f1804D0 = c6367b;
        viewGroup.addView(c6367b);
    }

    @Override // H5.B, H5.s, H5.x, G5.a, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // H5.B, G5.a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            W1();
            q2(0);
            n2();
        }
    }

    @Override // H5.s, H5.x, G5.a, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_payment_bottom1 != view.getId()) {
            super.onClick(view);
            return;
        }
        String strU1 = u1();
        if (!N.isNotNull(strU1)) {
            N1();
        } else if (getString(AbstractC5959j.dialog_payment_check_no_discount).equals(strU1)) {
            C6637k.getCDialog(getActivity(), 1002, 1, getString(AbstractC5959j.dialog_title)).setContent(strU1).setButtonListener(new DialogInterface.OnClickListener() { // from class: H5.y
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f1866a.N0(dialogInterface, i8);
                }
            }).showDialog();
        } else {
            C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(strU1).showDialog();
        }
    }

    @Override // H5.s, H5.x, com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_mchd_dcnt_tgt == id) {
            r2(((MchdDcntTgtDao.MchdDcntTgtResponse) iBaseDao.getResponse()).getFmlyList());
        } else if (AbstractC5955f.dao_discount_price != id) {
            super.onReceive(iBaseDao);
        } else {
            this.f1803C0 = true;
            R0();
        }
    }

    @Override // H5.B, H5.s
    String u1() {
        List<ReservationResponse.SeatInfo> seat_info = getJrnyInfo().getSeat_infos().getSeat_info();
        if (o2().size() != seat_info.size()) {
            return getString(AbstractC5959j.dialog_payment_check_psg_tp_cd);
        }
        if ("000".contains(seat_info.get(0).getH_dcnt_knd_cd1())) {
            return getString(AbstractC5959j.dialog_payment_check_no_discount);
        }
        return null;
    }
}
