package I5;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.addService.DealCarBuyDao;
import com.korail.talk.network.dao.addService.DealCarBuyDao.DealCarBuyRequest;
import com.korail.talk.network.dao.cart.CartListDao;
import com.korail.talk.network.dao.cart.CartListDao.CartListRequest;
import com.korail.talk.network.dao.pay.IntgStlDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import r4.i;
import r6.C6180a;
import s6.C6230a;
import s6.C6231b;
import s6.C6233d;
import w6.ViewOnClickListenerC6475c;
import z4.C6630d;
import z4.D;
import z4.t;

/* loaded from: classes.dex */
public class g extends e {
    public static final String TAG = "MaasPaymentFragment";

    /* renamed from: F0 */
    private int f2148F0;

    /* renamed from: G0 */
    private List f2149G0;

    /* renamed from: H0 */
    private ArrayList f2150H0;

    /* renamed from: I0 */
    private C6230a f2151I0;

    /* renamed from: J0 */
    private C6180a f2152J0;

    private void C0() {
        ViewGroup viewGroup = (ViewGroup) p0(AbstractC5955f.v_payment_container);
        if (i.PAYMENT_TICKET_CHANGE.equals(getPaymentType())) {
            this.f2151I0 = new C6233d(getActivity());
        } else {
            this.f2151I0 = new C6231b(getActivity());
        }
        viewGroup.addView(this.f2151I0, 0);
        C6180a c6180a = new C6180a(getActivity());
        this.f2152J0 = c6180a;
        viewGroup.addView(c6180a, 1);
    }

    private void I1() {
        this.f2149G0 = new ArrayList();
        this.f2150H0 = new ArrayList();
    }

    private void Q1() {
        CartListDao cartListDao = new CartListDao();
        CartListDao.CartListRequest cartListRequest = cartListDao.new CartListRequest();
        cartListRequest.setAddSrvReqNo(getArguments().getString("PRODUCT_NO"));
        cartListDao.setRequest(cartListRequest);
        cartListDao.setLoadingCancelable(false);
        executeDao(cartListDao);
    }

    private void R1() {
        DealCarBuyDao dealCarBuyDao = new DealCarBuyDao();
        DealCarBuyDao.DealCarBuyRequest dealCarBuyRequest = dealCarBuyDao.new DealCarBuyRequest();
        dealCarBuyRequest.setAddSrvCnt(this.f2150H0.size());
        dealCarBuyRequest.setAddSrvReqNo(this.f2150H0);
        dealCarBuyDao.setRequest(dealCarBuyRequest);
        dealCarBuyDao.setNotShowDialog(true);
        executeDao(dealCarBuyDao);
    }

    private void S1() {
        int i8 = 8;
        int size = 0;
        this.f2151I0.setVisibility(getReceivedAmount() > 0 ? 0 : 8);
        this.f2148F0 = D.getProductAmount(this.f2149G0);
        this.f2150H0 = D.makeDellCarNo(this.f2149G0);
        this.f2118m0 = getReceivedAmount();
        t.d("mOriginalReceivedAmount : " + this.f2118m0);
        this.f2152J0.setVisibility((this.f2148F0 > 0 || this.f2150H0.size() > 0) ? 0 : 8);
        if (this.f2152J0.getVisibility() == 0) {
            this.f2152J0.setAmount(getActivity(), this.f2148F0);
            this.f2152J0.setProductDetail(D.getProductMessage(this.f2149G0));
        }
        ViewOnClickListenerC6475c viewOnClickListenerC6475c = this.f2127v0;
        if (!disableDiscountPoint() && r1() != 0) {
            i8 = 0;
        }
        viewOnClickListenerC6475c.setVisibility(i8);
        Iterator it = this.f2149G0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((CartListDao.CartInfo) it.next()).getH_item_dv_cd().equals("0")) {
                size = getJrnyInfo().getSeat_infos().getSeat_info().size();
                break;
            }
        }
        this.f1483g0.setText(D.getCountMessage(this.f2149G0, size));
    }

    public static g newInstance(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("PRODUCT_NO", str);
        g gVar = new g();
        gVar.setArguments(bundle);
        return gVar;
    }

    private void w0() {
        p0(AbstractC5955f.btn_payment_bottom0).setVisibility(8);
    }

    @Override // I5.e, G5.a, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // I5.e, G5.a, F5.a
    public int getReceivedAmount() {
        t.d("getReceivedAmount() : " + super.getReceivedAmount() + ", mProductAmount : " + this.f2148F0);
        return super.getReceivedAmount() + this.f2148F0;
    }

    @Override // I5.e, G5.a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            I1();
            C0();
            Q1();
            w0();
        }
    }

    @Override // I5.e, G5.a, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        K1(true);
        if (AbstractC5955f.btn_payment_bottom1 != id) {
            super.onClick(view);
        } else if (!((IntgStlDao.IntgStlRequest) getIPaymentRequest()).getCart_LumpStlTgtNo().isEmpty()) {
            super.onClick(view);
        } else {
            R1();
            A1(false);
        }
    }

    @Override // I5.e, com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_cart_list != id) {
            if (AbstractC5955f.dao_cart_payment != id) {
                super.onReceive(iBaseDao);
                return;
            }
            if (this.f2150H0.size() > 0) {
                R1();
            }
            super.onReceive(iBaseDao);
            return;
        }
        List<CartListDao.CartInfo> cart_info = ((CartListDao.CartListResponse) iBaseDao.getResponse()).getCart_infos().getCart_info();
        this.f2149G0 = cart_info;
        setIPaymentRequest(C4.b.getIntgStlRequest(cart_info));
        setReservationResponse(null);
        S1();
        y0();
    }
}
