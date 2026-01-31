package com.korail.talk.ui.delivery;

import R6.G;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import b5.InterfaceC1083d;
import c5.e;
import c5.f;
import com.kakao.sdk.link.LinkClient;
import com.kakao.sdk.link.model.LinkResult;
import com.kakao.sdk.template.Constants;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.giftInfo.TicketPresentDao;
import com.korail.talk.network.dao.ticket.DlvRcvCustDao;
import com.korail.talk.network.dao.ticket.DlvRcvCustDao.DlvRcvCustwRequest;
import com.korail.talk.view.CustomViewPager;
import com.korail.talk.view.RoundTabLayout;
import com.korail.talk.view.base.BaseViewActivity;
import f7.p;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import n4.AbstractC5952c;
import n4.AbstractC5953d;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.g;
import z4.C;
import z4.C6630d;
import z4.C6637k;
import z4.I;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class DeliveryActivity extends BaseViewActivity implements InterfaceC1083d {

    /* renamed from: i, reason: collision with root package name */
    private TicketPresentDao.TicketPresentRequest f27970i;

    /* renamed from: j, reason: collision with root package name */
    private String f27971j;

    /* renamed from: k, reason: collision with root package name */
    private String f27972k;

    /* renamed from: l, reason: collision with root package name */
    a f27973l;

    private class a extends r {

        /* renamed from: h, reason: collision with root package name */
        private final String[] f27974h;

        /* renamed from: i, reason: collision with root package name */
        private final Fragment[] f27975i;

        public a(FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            this.f27975i = new Fragment[]{f.newInstance(), e.newInstance("S"), e.newInstance("K")};
            this.f27974h = DeliveryActivity.this.getResources().getStringArray(AbstractC5952c.delivery_tab_title);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return this.f27975i.length;
        }

        @Override // androidx.fragment.app.r
        public Fragment getItem(int i8) {
            return this.f27975i[i8];
        }

        @Override // androidx.viewpager.widget.a
        public CharSequence getPageTitle(int i8) {
            return this.f27974h[i8];
        }
    }

    private void A0() {
        Map<String, String> ticketPresentParams = this.f27970i.getTicketPresentParams();
        u0(ticketPresentParams.get("hidSaleWctNo1"), ticketPresentParams.get("hidSaleDt1"), ticketPresentParams.get("hidSaleSqno1"), ticketPresentParams.get("hidtkRetPwd1"));
    }

    private void B0() throws Resources.NotFoundException {
        n0(false);
        RoundTabLayout roundTabLayout = (RoundTabLayout) findViewById(AbstractC5955f.rtl_delivery);
        this.f27973l = new a(getSupportFragmentManager());
        CustomViewPager customViewPager = (CustomViewPager) findViewById(AbstractC5955f.vp_delivery);
        customViewPager.setSwipeEnabled(false);
        customViewPager.setAdapter(this.f27973l);
        if ("Y".equals(this.f27972k)) {
            roundTabLayout.setEnable(false);
        }
        roundTabLayout.setViewPager(customViewPager);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_enter_recipient_information);
    }

    private void u0(String str, String str2, String str3, String str4) {
        DlvRcvCustDao dlvRcvCustDao = new DlvRcvCustDao();
        DlvRcvCustDao.DlvRcvCustwRequest dlvRcvCustwRequest = dlvRcvCustDao.new DlvRcvCustwRequest();
        dlvRcvCustwRequest.setSaleWctNo(str);
        dlvRcvCustwRequest.setSaleDt(str2);
        dlvRcvCustwRequest.setSaleSqno(str3);
        dlvRcvCustwRequest.setTkRetPwd(str4);
        dlvRcvCustDao.setRequest(dlvRcvCustwRequest);
        executeDao(dlvRcvCustDao);
    }

    private long v0() {
        return g.SERVER_TYPE == K4.a.DEV ? 59632L : 58529L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ G w0(LinkResult linkResult, Throwable th) {
        if (C6630d.isNotNull(th)) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(th.getMessage()).showDialog();
            return null;
        }
        if (!C6630d.isNotNull(linkResult)) {
            return null;
        }
        t.e("WarningMsg = " + linkResult.getWarningMsg().toString());
        t.e("ArgumentMsg = " + linkResult.getArgumentMsg().toString());
        startActivity(linkResult.getIntent());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(boolean z8, TicketPresentDao.TicketPresentResponse ticketPresentResponse, DialogInterface dialogInterface, int i8) {
        if (z8) {
            y0(ticketPresentResponse.getChgePbpRsvNo());
        }
        setResult(-1);
        finish();
    }

    private void y0(String str) {
        if (!LinkClient.getInstance().isKakaoLinkAvailable(getApplicationContext())) {
            z4.G.moveToGooglePlay(K(), "com.kakao.talk");
            return;
        }
        HashMap map = new HashMap();
        map.put(androidx.core.app.r.CATEGORY_MESSAGE, this.f27971j);
        map.put(Constants.BUTTON_TITLE, "전달받은 승차권 보기");
        map.put("chgePbpRsvNo", str);
        LinkClient.getInstance().customTemplate(getApplicationContext(), v0(), map, new p() { // from class: b5.c
            @Override // f7.p
            public final Object invoke(Object obj, Object obj2) {
                return this.f11435a.w0((LinkResult) obj, (Throwable) obj2);
            }
        });
    }

    private void z0() {
        this.f27970i = (TicketPresentDao.TicketPresentRequest) getIntent().getSerializableExtra("PRESENT_REQUEST");
        this.f27971j = getIntent().getStringExtra("PRESENT_JRNY_INFO");
        this.f27972k = getIntent().getStringExtra("PRESENT_NCARD_ADD_USER_FLAG");
    }

    @Override // b5.InterfaceC1083d
    public void executeDeliveryEtc(String str, String str2, String str3) {
        IBaseDao ticketPresentDao = new TicketPresentDao();
        TicketPresentDao.TicketPresentRequest ticketPresentRequest = this.f27970i;
        ticketPresentRequest.setHidInfoInpDvCd(str);
        ticketPresentRequest.setHidAcepPsNm(str2);
        ticketPresentRequest.setHidAcepPsTeln(str3);
        ticketPresentRequest.setHidPbpAcepPsMbFlg("N");
        ticketPresentRequest.setHidPbpAcepPsCustMgNo("");
        ticketPresentDao.setRequest(ticketPresentRequest);
        executeDao(ticketPresentDao);
    }

    @Override // b5.InterfaceC1083d
    public void executeDeliveryMember(String str, String str2, String str3) {
        IBaseDao ticketPresentDao = new TicketPresentDao();
        TicketPresentDao.TicketPresentRequest ticketPresentRequest = this.f27970i;
        ticketPresentRequest.setHidInfoInpDvCd(TicketPresentDao.DEFAULT_HID_INFO_INP_DV_CD);
        ticketPresentRequest.setHidAcepPsNm(str);
        ticketPresentRequest.setHidAcepPsTeln(str2);
        ticketPresentRequest.setHidPbpAcepPsMbFlg("Y");
        ticketPresentRequest.setHidPbpAcepPsCustMgNo(str3);
        ticketPresentDao.setRequest(ticketPresentRequest);
        executeDao(ticketPresentDao);
    }

    @Override // b5.InterfaceC1083d
    public void executeDeliveryNonMember(String str, String str2, String str3) {
        IBaseDao ticketPresentDao = new TicketPresentDao();
        TicketPresentDao.TicketPresentRequest ticketPresentRequest = this.f27970i;
        ticketPresentRequest.setHidInfoInpDvCd(TicketPresentDao.DEFAULT_HID_INFO_INP_DV_CD);
        ticketPresentRequest.setHidAcepPsNm(str);
        ticketPresentRequest.setHidAcepPsTeln(str2);
        ticketPresentRequest.setHidPbpAcepPsMbFlg("N");
        ticketPresentRequest.setHidAcepPwd(str3);
        ticketPresentRequest.setHidPbpAcepPsCustMgNo("");
        ticketPresentDao.setRequest(ticketPresentRequest);
        executeDao(ticketPresentDao);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_delivery);
        if (C6630d.isNull(bundle)) {
            z0();
            B0();
            setText();
            if ("Y".equals(this.f27972k)) {
                A0();
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_ticket_present != id) {
            if (AbstractC5955f.dao_delivery_ncard_user_info == id) {
                ((f) this.f27973l.getItem(0)).setDisableView((DlvRcvCustDao.DlvRcvCustwResponse) iBaseDao.getResponse());
            }
        } else {
            TicketPresentDao.TicketPresentRequest ticketPresentRequest = (TicketPresentDao.TicketPresentRequest) iBaseDao.getRequest();
            final TicketPresentDao.TicketPresentResponse ticketPresentResponse = (TicketPresentDao.TicketPresentResponse) iBaseDao.getResponse();
            final boolean zEquals = "K".equals(ticketPresentRequest.getHidInfoInpDvCd());
            C6637k.getCDialog(K(), 1001, 0, getString(zEquals ? AbstractC5959j.dialog_delivery_completed_kakao_title : AbstractC5959j.dialog_delivery_completed_title)).setContent(zEquals ? N.applySpannable(getString(AbstractC5959j.dialog_delivery_completed_kakao_stress), new ForegroundColorSpan(I.getColor(getApplicationContext(), AbstractC5953d.red))) : new SpannableStringBuilder(getText(AbstractC5959j.dialog_delivery_completed_etc)), getString(AbstractC5959j.dialog_delivery_completed), N.applySpannable(getString(AbstractC5959j.dialog_delivery_success_popup_message, ticketPresentRequest.getHidAcepPsNm(), C.makePhoneNumber(ticketPresentRequest.getHidAcepPsTeln())), new ForegroundColorSpan(Color.parseColor("#ff0066b3")))).setButtonListener(new DialogInterface.OnClickListener() { // from class: b5.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f11432a.x0(zEquals, ticketPresentResponse, dialogInterface, i8);
                }
            }).showDialog();
        }
    }
}
