package J5;

import I4.h;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import com.korail.talk.ui.payment.fragment.payment.option.easyPay.EasyStbkPayOption;
import com.korail.talk.ui.payment.fragment.payment.option.easyPay.InstallmentOption;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.viewGroup.HeaderTextView;
import e0.C5339a;
import java.util.Iterator;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6541a;
import z4.C6627a;
import z4.C6630d;
import z4.H;
import z4.I;
import z4.N;
import z4.q;

/* loaded from: classes.dex */
public class d extends C6541a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final String f2615a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2616b;

    /* renamed from: c, reason: collision with root package name */
    private a f2617c;

    /* renamed from: d, reason: collision with root package name */
    private HeaderTextView f2618d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayout f2619e;

    /* renamed from: f, reason: collision with root package name */
    private FrameLayout f2620f;

    /* renamed from: g, reason: collision with root package name */
    private ViewFlipper f2621g;

    /* renamed from: h, reason: collision with root package name */
    private InstallmentOption f2622h;

    /* renamed from: i, reason: collision with root package name */
    private EasyStbkPayOption f2623i;

    public interface a {
        void fullDownScroll();

        void onSelectItem(String str);
    }

    public d(Context context) {
        super(context);
        this.f2615a = "E";
        this.f2616b = "N";
        k();
    }

    private void g() {
        CommonCodeDao.EasyPay easyPay = (CommonCodeDao.EasyPay) q.fromJson(H.getString(getContext(), "EASY_PAY_OPTION"), CommonCodeDao.EasyPay.class);
        if (C6630d.isNotNull(easyPay)) {
            Iterator<CommonCodeDao.EasyPayData> it = easyPay.getList().iterator();
            int i8 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CommonCodeDao.EasyPayData next = it.next();
                String isEnable = next.getIsEnable();
                if (!"H".equals(isEnable) && !C5339a.LONGITUDE_WEST.equals(next.getDisplayType())) {
                    i8++;
                    boolean zIsLogin = "Y".equals(next.getIsNeedLogin()) ? h.getInstance().isLogin() : true;
                    String linkType = next.getLinkType();
                    FrameLayout frameLayout = (FrameLayout) findViewById(I.getViewId(getContext(), "easy_pay_object" + i8));
                    frameLayout.setVisibility(0);
                    frameLayout.setEnabled("Y".equals(isEnable) && zIsLogin);
                    frameLayout.setTag(next);
                    ((TextView) findViewById(I.getViewId(getContext(), "easy_pay_object" + i8 + "_title"))).setText(next.getPayTitle());
                    TextView textView = (TextView) findViewById(I.getViewId(getContext(), "easy_pay_object" + i8 + "_event"));
                    textView.setVisibility(j(linkType) ? 0 : 8);
                    if ("E".equals(linkType)) {
                        textView.setText(AbstractC5959j.common_event_en);
                    } else if ("N".equals(linkType)) {
                        textView.setText(AbstractC5959j.common_notice_en);
                    }
                } else if (C5339a.LONGITUDE_WEST.equals(next.getDisplayType())) {
                    boolean zIsLogin2 = "Y".equals(next.getIsNeedLogin()) ? h.getInstance().isLogin() : true;
                    String linkType2 = next.getLinkType();
                    FrameLayout frameLayout2 = (FrameLayout) findViewById(I.getViewId(getContext(), "easy_pay_wide_object1"));
                    frameLayout2.setVisibility(0);
                    frameLayout2.setEnabled("Y".equals(isEnable) && zIsLogin2);
                    frameLayout2.setTag(next);
                    TextView textView2 = (TextView) findViewById(I.getViewId(getContext(), "easy_pay_wide_object1_event"));
                    textView2.setVisibility(j(linkType2) ? 0 : 8);
                    if ("E".equals(linkType2)) {
                        textView2.setText(AbstractC5959j.common_event_en);
                    } else if ("N".equals(linkType2)) {
                        textView2.setText(AbstractC5959j.common_notice_en);
                    }
                }
            }
            if (i8 % 2 == 1) {
                ((FrameLayout) findViewById(I.getViewId(getContext(), "easy_pay_object" + (i8 + 1)))).setVisibility(4);
            }
        }
    }

    private int h(String str) {
        if ("2".equals(str) || "8".equals(str) || "11".equals(str)) {
            return 1;
        }
        if (StbkAcntDao.CHANGE_PASSWORD.equals(str) || "7".equals(str) || "12".equals(str)) {
            return 2;
        }
        return "0".equals(str) ? 3 : 0;
    }

    private String i(View view) {
        CommonCodeDao.EasyPayData easyPayData = (CommonCodeDao.EasyPayData) view.getTag();
        return StbkAcntDao.DELETE_ACCOUNT.equals(easyPayData.getPayType()) ? easyPayData.getPayTitle() : N.getText((TextView) ((FrameLayout) view).getChildAt(0));
    }

    private boolean j(String str) {
        return "N".equals(str) || "E".equals(str);
    }

    private void k() {
        View.inflate(getContext(), AbstractC5957h.easy_pay_option, this);
        r();
        q();
        p();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f2617c.fullDownScroll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(CommonCodeDao.EasyPayData easyPayData, View view) {
        C6630d.moveToOutSideBrowser(getContext(), easyPayData.getLinkUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(CommonCodeDao.EasyPayData easyPayData, View view) {
        Intent intent = new Intent(getContext(), (Class<?>) IntegrationWebViewActivity.class);
        intent.putExtra("WEB_POST_URL", easyPayData.getLinkUrl());
        getContext().startActivity(intent);
    }

    private void o(final CommonCodeDao.EasyPayData easyPayData, int i8) {
        View childAt = this.f2621g.getChildAt(i8);
        RelativeLayout relativeLayout = (RelativeLayout) childAt.findViewById(AbstractC5955f.v_easy_event);
        if (getEasyPayData() == null) {
            relativeLayout.setVisibility(8);
            return;
        }
        String linkType = easyPayData.getLinkType();
        String linkUrl = easyPayData.getLinkUrl();
        relativeLayout.setVisibility(j(linkType) ? 0 : 8);
        if (j(linkType)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.topMargin = N.dpToPx(20.0f);
            layoutParams.bottomMargin = i8 == 0 ? N.dpToPx(20.0f) : 0;
            relativeLayout.setLayoutParams(layoutParams);
            TextView textView = (TextView) childAt.findViewById(AbstractC5955f.tv_easy_event);
            ((TextView) childAt.findViewById(AbstractC5955f.tv_easy_event_message)).setText(easyPayData.getLinkTitle());
            TextView textView2 = (TextView) childAt.findViewById(AbstractC5955f.tv_easy_event_link);
            textView2.setVisibility(N.isNotNull(linkUrl) ? 0 : 8);
            if ("E".equals(linkType)) {
                textView.setText(AbstractC5959j.common_event_en);
                textView2.setOnClickListener(new View.OnClickListener() { // from class: J5.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f2611a.m(easyPayData, view);
                    }
                });
            } else if ("N".equals(linkType)) {
                textView.setText(AbstractC5959j.common_notice_en);
                textView2.setOnClickListener(new View.OnClickListener() { // from class: J5.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f2613a.n(easyPayData, view);
                    }
                });
            }
            C6627a.addClickEvent(textView2, a(AbstractC5959j.open_new_window));
        }
    }

    private void p() {
        for (int i8 = 0; i8 < this.f2619e.getChildCount(); i8++) {
            View childAt = this.f2619e.getChildAt(i8);
            if (childAt instanceof LinearLayout) {
                int i9 = 0;
                while (true) {
                    LinearLayout linearLayout = (LinearLayout) childAt;
                    if (i9 < linearLayout.getChildCount()) {
                        View childAt2 = linearLayout.getChildAt(i9);
                        if (childAt2 instanceof FrameLayout) {
                            childAt2.setOnClickListener(this);
                        }
                        i9++;
                    }
                }
            }
        }
    }

    private void q() {
        this.f2618d.setTitle(a(AbstractC5959j.payment_tab_easy));
        this.f2618d.setText(a(AbstractC5959j.payment_no_select));
    }

    private void r() {
        this.f2618d = (HeaderTextView) findViewById(AbstractC5955f.v_header_text_view);
        this.f2619e = (LinearLayout) findViewById(AbstractC5955f.v_easy_pay);
        this.f2621g = (ViewFlipper) findViewById(AbstractC5955f.vf_easy_pay);
        this.f2622h = (InstallmentOption) findViewById(AbstractC5955f.v_easy_shinhan);
        this.f2623i = (EasyStbkPayOption) findViewById(AbstractC5955f.v_easy_stbk);
        this.f2621g.findViewById(AbstractC5955f.v_easy_event).setVisibility(8);
    }

    public CommonCodeDao.EasyPayData getEasyPayData() {
        if (C6630d.isNotNull(this.f2620f)) {
            return (CommonCodeDao.EasyPayData) this.f2620f.getTag();
        }
        return null;
    }

    public InstallmentOption getInstallmentOption() {
        return this.f2622h;
    }

    public EasyStbkPayOption getStbkPayOption() {
        return this.f2623i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (C6630d.isNull(this.f2620f)) {
            FrameLayout frameLayout = (FrameLayout) view;
            this.f2620f = frameLayout;
            frameLayout.setSelected(true);
            this.f2618d.setText(i(view));
        } else if (view.getId() == this.f2620f.getId()) {
            this.f2620f.setSelected(false);
            this.f2620f = null;
            this.f2618d.setText(a(AbstractC5959j.payment_no_select));
        } else {
            this.f2620f.setSelected(false);
            FrameLayout frameLayout2 = (FrameLayout) view;
            this.f2620f = frameLayout2;
            frameLayout2.setSelected(true);
            this.f2618d.setText(i(view));
        }
        CommonCodeDao.EasyPayData easyPayData = (CommonCodeDao.EasyPayData) view.getTag();
        String payType = easyPayData.getPayType();
        int iH = h(payType);
        o(easyPayData, iH);
        this.f2621g.setDisplayedChild(iH);
        if (C6630d.isNotNull(this.f2617c)) {
            this.f2617c.onSelectItem(payType);
        }
        if (("2".equals(payType) || StbkAcntDao.CHANGE_PASSWORD.equals(payType) || "0".equals(payType) || "8".equals(payType) || "11".equals(payType) || j(easyPayData.getLinkType())) && C6630d.isNotNull(this.f2617c)) {
            new Handler().postDelayed(new Runnable() { // from class: J5.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2610a.l();
                }
            }, 10L);
        }
    }

    public void setInterface(a aVar) {
        this.f2617c = aVar;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2615a = "E";
        this.f2616b = "N";
        k();
    }

    public d(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f2615a = "E";
        this.f2616b = "N";
        k();
    }
}
