package I5;

import A6.g;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.addService.DealCarBuyDao;
import com.korail.talk.network.dao.addService.DealCarBuyDao.DealCarBuyRequest;
import com.korail.talk.network.dao.cart.CartListDao;
import com.korail.talk.network.dao.cart.CartListDao.CartListRequest;
import com.korail.talk.network.dao.certification.TicketRsvInquiryDao;
import com.korail.talk.network.dao.certification.TicketRsvInquiryDao.TicketRsvInquiryRequest;
import com.korail.talk.network.dao.pay.IntgStlDao;
import com.korail.talk.network.response.certification.ReservationResponse;
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

/* loaded from: classes.dex */
public class f extends e {
    public static final String TAG = "CPaymentFragment";

    /* renamed from: F0 */
    private int f2136F0;

    /* renamed from: G0 */
    private List f2137G0;

    /* renamed from: H0 */
    private ArrayList f2138H0;

    /* renamed from: I0 */
    private C6230a f2139I0;

    /* renamed from: J0 */
    private C6180a f2140J0;

    /* renamed from: K0 */
    private u4.c f2141K0;

    /* renamed from: L0 */
    private u4.e f2142L0;

    /* renamed from: M0 */
    private Handler f2143M0;

    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f2144a;

        a(View view) {
            this.f2144a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!((IntgStlDao.IntgStlRequest) f.this.getIPaymentRequest()).getCart_LumpStlTgtNo().isEmpty()) {
                f.super.onClick(this.f2144a);
            } else {
                f.this.W1();
                f.this.A1(false);
            }
        }
    }

    class b extends Handler {

        /* renamed from: a */
        final /* synthetic */ Runnable f2146a;

        b(Runnable runnable) {
            this.f2146a = runnable;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            g.d dVar = g.d.toEnum(message.what);
            f.this.f2141K0.dismiss();
            if (dVar.isContinue()) {
                return;
            }
            f.this.f2142L0.dismissDialog();
            if (g.d.Success == dVar) {
                f.this.f2143M0.post(this.f2146a);
            }
            A6.g.END();
        }
    }

    private void C0() {
        ViewGroup viewGroup = (ViewGroup) p0(AbstractC5955f.v_payment_container);
        if (i.PAYMENT_TICKET_CHANGE.equals(getPaymentType())) {
            this.f2139I0 = new C6233d(getActivity());
        } else {
            this.f2139I0 = new C6231b(getActivity());
        }
        viewGroup.addView(this.f2139I0, 0);
        C6180a c6180a = new C6180a(getActivity());
        this.f2140J0 = c6180a;
        viewGroup.addView(c6180a, 1);
    }

    private void I1() {
        this.f2137G0 = new ArrayList();
        this.f2138H0 = new ArrayList();
        this.f2143M0 = new Handler(getContext().getMainLooper());
    }

    private void V1() {
        CartListDao cartListDao = new CartListDao();
        CartListDao.CartListRequest cartListRequest = cartListDao.new CartListRequest();
        cartListRequest.setPnrNo(getArguments().getString("PRODUCT_NO"));
        cartListDao.setRequest(cartListRequest);
        cartListDao.setLoadingCancelable(false);
        executeDao(cartListDao);
    }

    public void W1() {
        DealCarBuyDao dealCarBuyDao = new DealCarBuyDao();
        DealCarBuyDao.DealCarBuyRequest dealCarBuyRequest = dealCarBuyDao.new DealCarBuyRequest();
        dealCarBuyRequest.setAddSrvCnt(this.f2138H0.size());
        dealCarBuyRequest.setAddSrvReqNo(this.f2138H0);
        dealCarBuyDao.setRequest(dealCarBuyRequest);
        dealCarBuyDao.setNotShowDialog(true);
        executeDao(dealCarBuyDao);
    }

    private void X1(String str) {
        TicketRsvInquiryDao ticketRsvInquiryDao = new TicketRsvInquiryDao();
        TicketRsvInquiryDao.TicketRsvInquiryRequest ticketRsvInquiryRequest = ticketRsvInquiryDao.new TicketRsvInquiryRequest();
        ticketRsvInquiryRequest.setHidPnrNo(str);
        ticketRsvInquiryDao.setRequest(ticketRsvInquiryRequest);
        ticketRsvInquiryDao.setLoadingCancelable(false);
        executeDao(ticketRsvInquiryDao);
    }

    private void Y1() {
        int i8 = 8;
        int size = 0;
        this.f2139I0.setVisibility(getReceivedAmount() > 0 ? 0 : 8);
        if (this.f2139I0.getVisibility() == 0) {
            if (i.PAYMENT_TICKET_CHANGE == getPaymentType()) {
                this.f2139I0.setAmount(getReservationResponse());
            } else {
                this.f2139I0.setAmount(getReceivedAmount(), getDiscountAmount());
            }
        }
        this.f2136F0 = D.getProductAmount(this.f2137G0);
        this.f2138H0 = D.makeDellCarNo(this.f2137G0);
        this.f2118m0 = getReceivedAmount();
        this.f2140J0.setVisibility((this.f2136F0 > 0 || this.f2138H0.size() > 0) ? 0 : 8);
        if (this.f2140J0.getVisibility() == 0) {
            this.f2140J0.setAmount(getActivity(), this.f2136F0);
            this.f2140J0.setProductDetail(D.getProductMessage(this.f2137G0));
        }
        ViewOnClickListenerC6475c viewOnClickListenerC6475c = this.f2127v0;
        if (!disableDiscountPoint() && r1() != 0) {
            i8 = 0;
        }
        viewOnClickListenerC6475c.setVisibility(i8);
        Iterator it = this.f2137G0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((CartListDao.CartInfo) it.next()).getH_item_dv_cd().equals("0")) {
                size = getJrnyInfo().getSeat_infos().getSeat_info().size();
                break;
            }
        }
        this.f1483g0.setText(D.getCountMessage(this.f2137G0, size));
    }

    public static f newInstance(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("PRODUCT_NO", str);
        f fVar = new f();
        fVar.setArguments(bundle);
        return fVar;
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
        return super.getReceivedAmount() + this.f2136F0;
    }

    @Override // I5.e, G5.a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            I1();
            C0();
            V1();
            w0();
        }
    }

    @Override // I5.e, G5.a, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_payment_bottom1 != view.getId()) {
            super.onClick(view);
            return;
        }
        a aVar = new a(view);
        if (C6630d.isNull(this.f2142L0) || !this.f2142L0.isShowing()) {
            u4.e eVar = new u4.e(getContext());
            this.f2142L0 = eVar;
            eVar.showDialog();
            u4.c cVar = new u4.c(getContext());
            this.f2141K0 = cVar;
            cVar.show();
        }
        A6.g.BEGIN(r4.g.NETFUNNEL_SERVER_ID, r4.g.NETFUNNEL_ACTION_PAY_ID, this.f2142L0, new b(aVar));
    }

    @Override // I5.e, com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_cart_list == id) {
            CartListDao.CartListRequest cartListRequest = (CartListDao.CartListRequest) iBaseDao.getRequest();
            List<CartListDao.CartInfo> cart_info = ((CartListDao.CartListResponse) iBaseDao.getResponse()).getCart_infos().getCart_info();
            this.f2137G0 = cart_info;
            setIPaymentRequest(C4.b.getIntgStlRequest(cart_info));
            X1(cartListRequest.getPnrNo());
            return;
        }
        if (AbstractC5955f.dao_ticket_inquiry == id) {
            setReservationResponse((ReservationResponse) iBaseDao.getResponse());
            Y1();
            y0();
        } else {
            if (AbstractC5955f.dao_cart_payment != id) {
                super.onReceive(iBaseDao);
                return;
            }
            if (this.f2138H0.size() > 0) {
                W1();
            }
            super.onReceive(iBaseDao);
        }
    }
}
