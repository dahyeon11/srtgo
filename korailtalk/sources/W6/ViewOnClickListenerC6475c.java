package w6;

import I4.h;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.payment.point.CityPointView;
import com.korail.talk.view.payment.point.GifticketView;
import com.korail.talk.view.payment.point.KTXMileageView;
import com.korail.talk.view.payment.point.LPointView;
import com.korail.talk.view.payment.point.OkCashBackPointView;
import com.korail.talk.view.payment.point.RailPointView;
import com.korail.talk.view.payment.point.WoorimorePointView;
import com.korail.talk.viewGroup.HeaderTextView;
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
import z4.t;

/* renamed from: w6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewOnClickListenerC6475c extends C6541a implements View.OnClickListener {
    public static final int EASY_PAY_MODE = 1;
    public static final int GENERAL_PAY_MODE = 0;

    /* renamed from: a, reason: collision with root package name */
    private final int f37443a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37444b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37445c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f37446d;

    /* renamed from: e, reason: collision with root package name */
    private a f37447e;

    /* renamed from: f, reason: collision with root package name */
    private HeaderTextView f37448f;

    /* renamed from: g, reason: collision with root package name */
    private LinearLayout f37449g;

    /* renamed from: h, reason: collision with root package name */
    private FrameLayout f37450h;

    /* renamed from: i, reason: collision with root package name */
    private ViewFlipper f37451i;

    /* renamed from: j, reason: collision with root package name */
    private View f37452j;

    /* renamed from: k, reason: collision with root package name */
    protected TextView f37453k;

    /* renamed from: l, reason: collision with root package name */
    private KTXMileageView f37454l;

    /* renamed from: m, reason: collision with root package name */
    private RailPointView f37455m;

    /* renamed from: n, reason: collision with root package name */
    private WoorimorePointView f37456n;

    /* renamed from: o, reason: collision with root package name */
    private CityPointView f37457o;

    /* renamed from: p, reason: collision with root package name */
    private OkCashBackPointView f37458p;

    /* renamed from: q, reason: collision with root package name */
    private LPointView f37459q;

    /* renamed from: r, reason: collision with root package name */
    private GifticketView f37460r;

    /* renamed from: w6.c$a */
    public interface a {
        void onSelectChanged(FrameLayout frameLayout, boolean z8, boolean z9);
    }

    public ViewOnClickListenerC6475c(Context context) {
        super(context);
        this.f37443a = -1;
        this.f37444b = "E";
        this.f37445c = "N";
        j();
    }

    private void f() {
        this.f37448f.collapse();
        this.f37452j.setVisibility(8);
        findViewById(AbstractC5955f.v_ktx_mileage).setVisibility(this.f37446d ? 0 : 8);
        FrameLayout frameLayout = (FrameLayout) findViewById(AbstractC5955f.easy_pay_object1);
        this.f37450h = frameLayout;
        frameLayout.setSelected(true);
        this.f37448f.setText(a(AbstractC5959j.common_ktx_mileage));
        setPaymentOption(1);
    }

    private int g(String str) {
        if (String.valueOf(0).equals(str)) {
            return 0;
        }
        int i8 = 1;
        if (!String.valueOf(1).equals(str)) {
            i8 = 2;
            if (!String.valueOf(2).equals(str)) {
                i8 = 3;
                if (!String.valueOf(3).equals(str)) {
                    i8 = 4;
                    if (!String.valueOf(4).equals(str)) {
                        i8 = 5;
                        if (!String.valueOf(5).equals(str)) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i8;
    }

    private String h(View view) {
        return N.getText((TextView) ((FrameLayout) view).getChildAt(0));
    }

    private boolean i(String str) {
        return "N".equals(str) || "E".equals(str);
    }

    private void j() {
        View.inflate(getContext(), AbstractC5957h.view_point_option, this);
        m();
        q();
        p();
        o();
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(CommonCodeDao.PointData pointData, View view) {
        C6630d.moveToOutSideBrowser(getContext(), pointData.getLinkUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(CommonCodeDao.PointData pointData, View view) {
        Intent intent = new Intent(getContext(), (Class<?>) IntegrationWebViewActivity.class);
        intent.putExtra("WEB_POST_URL", pointData.getLinkUrl());
        getContext().startActivity(intent);
    }

    private void m() {
        this.f37446d = h.getInstance().isLogin();
    }

    private void n(final CommonCodeDao.PointData pointData, int i8) {
        View childAt = this.f37451i.getChildAt(i8);
        RelativeLayout relativeLayout = (RelativeLayout) childAt.findViewById(AbstractC5955f.v_easy_event);
        if (getPayType().isEmpty()) {
            relativeLayout.setVisibility(8);
            return;
        }
        String linkType = pointData.getLinkType();
        String linkUrl = pointData.getLinkUrl();
        relativeLayout.setVisibility(i(linkType) ? 0 : 8);
        t.d("type : " + pointData.getPointType() + ", linkType : " + linkType);
        if (i(linkType)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.topMargin = N.dpToPx(20.0f);
            layoutParams.bottomMargin = N.dpToPx(20.0f);
            relativeLayout.setLayoutParams(layoutParams);
            TextView textView = (TextView) childAt.findViewById(AbstractC5955f.tv_easy_event);
            ((TextView) childAt.findViewById(AbstractC5955f.tv_easy_event_message)).setText(pointData.getLinkTitle());
            TextView textView2 = (TextView) childAt.findViewById(AbstractC5955f.tv_easy_event_link);
            textView2.setVisibility(N.isNotNull(linkUrl) ? 0 : 8);
            if ("E".equals(linkType)) {
                textView.setText(AbstractC5959j.common_event_en);
                textView2.setOnClickListener(new View.OnClickListener() { // from class: w6.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f37439a.k(pointData, view);
                    }
                });
            } else if ("N".equals(linkType)) {
                textView.setText(AbstractC5959j.common_notice_en);
                textView2.setOnClickListener(new View.OnClickListener() { // from class: w6.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f37441a.l(pointData, view);
                    }
                });
            }
            C6627a.addClickEvent(textView2, a(AbstractC5959j.open_new_window));
        }
    }

    private void o() {
        this.f37448f.setOnClickListener(this);
        findViewById(AbstractC5955f.ktx_use_button).setOnClickListener(this);
        for (int i8 = 0; i8 < this.f37449g.getChildCount(); i8++) {
            View childAt = this.f37449g.getChildAt(i8);
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

    private void p() {
        this.f37448f.setTitle(a(AbstractC5959j.payment_option_title_use_point_title));
    }

    private void q() {
        this.f37448f = (HeaderTextView) findViewById(AbstractC5955f.v_header_text_view);
        this.f37452j = findViewById(AbstractC5955f.v_expand);
        this.f37449g = (LinearLayout) findViewById(AbstractC5955f.v_point_pay);
        this.f37451i = (ViewFlipper) findViewById(AbstractC5955f.vf_point_use);
        this.f37453k = (TextView) findViewById(AbstractC5955f.tv_ktx_mileage_total);
        this.f37454l = (KTXMileageView) this.f37451i.getChildAt(0);
        this.f37455m = (RailPointView) this.f37451i.getChildAt(1);
        this.f37456n = (WoorimorePointView) this.f37451i.getChildAt(2);
        this.f37457o = (CityPointView) this.f37451i.getChildAt(3);
        this.f37458p = (OkCashBackPointView) this.f37451i.getChildAt(4);
        this.f37459q = (LPointView) this.f37451i.getChildAt(5);
        this.f37460r = (GifticketView) this.f37451i.getChildAt(6);
    }

    public CityPointView getCityPoint() {
        return this.f37457o;
    }

    public GifticketView getGifticketView() {
        return this.f37460r;
    }

    public KTXMileageView getKTXMileage() {
        return this.f37454l;
    }

    public LPointView getLPoint() {
        return this.f37459q;
    }

    public OkCashBackPointView getOkCashBackPoint() {
        return this.f37458p;
    }

    public String getPayType() {
        CommonCodeDao.PointData pointData = C6630d.isNotNull(this.f37450h) ? (CommonCodeDao.PointData) this.f37450h.getTag() : null;
        return C6630d.isNull(pointData) ? "" : pointData.getPointType();
    }

    public RailPointView getRailPoint() {
        return this.f37455m;
    }

    public int getSelectedItemTag() {
        if (C6630d.isNotNull(this.f37450h) && C6630d.isNotNull(this.f37450h.getTag())) {
            return Integer.parseInt(((CommonCodeDao.PointData) this.f37450h.getTag()).getPointType());
        }
        return -1;
    }

    public int getSelectedUsePoint() {
        if (!isReadyPoint()) {
            return 0;
        }
        switch (getSelectedItemTag()) {
            case 0:
                return this.f37454l.getApplyPoint();
            case 1:
                return this.f37455m.getApplyPoint();
            case 2:
                return this.f37456n.getApplyPoint();
            case 3:
            default:
                return 0;
            case 4:
                return this.f37458p.getApplyPoint();
            case 5:
                return this.f37459q.getApplyPoint();
            case 6:
                return this.f37460r.getApplyPoint();
        }
    }

    public WoorimorePointView getWoorimorePoint() {
        return this.f37456n;
    }

    public boolean isReadyPoint() {
        boolean z8 = true;
        switch (getSelectedItemTag()) {
            case 0:
                if (!this.f37450h.isSelected() || !this.f37454l.isApplyRequest() || !this.f37454l.isApplyPoint()) {
                }
                return z8;
            case 1:
                if (!this.f37450h.isSelected() || !this.f37455m.isApplyRequest() || !this.f37455m.isApplyPoint()) {
                }
                return z8;
            case 2:
                if (!this.f37450h.isSelected() || !this.f37456n.isApplyRequest() || !this.f37456n.isApplyPoint()) {
                }
                return z8;
            case 3:
                if (!this.f37450h.isSelected() || !this.f37457o.isApplyRequest()) {
                }
                return z8;
            case 4:
                if (!this.f37450h.isSelected() || !this.f37458p.isApplyRequest() || !this.f37458p.isApplyPoint()) {
                }
                return z8;
            case 5:
                if (!this.f37450h.isSelected() || !this.f37459q.isApplyRequest() || !this.f37459q.isApplyPoint()) {
                }
                return z8;
            case 6:
                if (!this.f37450h.isSelected() || !this.f37460r.isApplyRequest() || !this.f37460r.isApplyPoint()) {
                }
                return z8;
            default:
                return false;
        }
        z8 = false;
        return z8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        t.d(" id : " + id);
        if (AbstractC5955f.v_header_text_view == id) {
            this.f37452j.setVisibility(this.f37448f.autoExpand() == 1 ? 0 : 8);
            if (C6630d.isNotNull(this.f37450h)) {
                CommonCodeDao.PointData pointData = (CommonCodeDao.PointData) this.f37450h.getTag();
                n(pointData, g(pointData.getPointType()));
                return;
            }
            return;
        }
        if (AbstractC5955f.ktx_use_button == id) {
            if (C6630d.isNotNull(this.f37450h)) {
                this.f37450h.setSelected(false);
            }
            this.f37448f.expand();
            this.f37452j.setVisibility(0);
            FrameLayout frameLayout = (FrameLayout) findViewById(AbstractC5955f.easy_pay_object1);
            this.f37450h = frameLayout;
            frameLayout.setSelected(true);
            n((CommonCodeDao.PointData) this.f37450h.getTag(), 0);
            this.f37451i.setDisplayedChild(0);
            this.f37448f.setText(a(AbstractC5959j.common_ktx_mileage));
            this.f37451i.setVisibility(0);
            return;
        }
        if (C6630d.isNull(this.f37450h)) {
            FrameLayout frameLayout2 = (FrameLayout) view;
            this.f37450h = frameLayout2;
            frameLayout2.setSelected(true);
            this.f37448f.setText(h(view));
            this.f37451i.setVisibility(0);
        } else if (view.getId() == this.f37450h.getId()) {
            this.f37450h.setSelected(false);
            this.f37450h = null;
            this.f37448f.setText(a(AbstractC5959j.payment_no_select));
            this.f37451i.setVisibility(8);
        } else {
            this.f37450h.setSelected(false);
            FrameLayout frameLayout3 = (FrameLayout) view;
            this.f37450h = frameLayout3;
            frameLayout3.setSelected(true);
            this.f37448f.setText(h(view));
            this.f37451i.setVisibility(0);
        }
        CommonCodeDao.PointData pointData2 = (CommonCodeDao.PointData) view.getTag();
        int iG = g(pointData2.getPointType());
        n(pointData2, iG);
        this.f37451i.setDisplayedChild(iG);
        if (C6630d.isNull(this.f37447e)) {
            return;
        }
        this.f37447e.onSelectChanged((FrameLayout) view, C6630d.isNotNull(this.f37450h), true);
    }

    public void setKTXMileage(int i8, String str, String str2) {
        this.f37453k.setText(b(AbstractC5959j.common_points, Integer.valueOf(i8)));
        this.f37454l.setAvailablePoints(i8, str, str2);
    }

    public void setOnSelectChangeListener(a aVar) {
        this.f37447e = aVar;
    }

    public void setPaymentOption(int i8) {
        CommonCodeDao.Point point = (CommonCodeDao.Point) q.fromJson(H.getString(getContext(), "POINT_PAY_OPTION"), CommonCodeDao.Point.class);
        if (C6630d.isNotNull(point)) {
            Iterator<CommonCodeDao.PointData> it = point.getList().iterator();
            int i9 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CommonCodeDao.PointData next = it.next();
                String isEnable = next.getIsEnable();
                if (!"H".equals(isEnable)) {
                    i9++;
                    boolean zIsLogin = "Y".equals(next.getIsNeedLogin()) ? h.getInstance().isLogin() : true;
                    String linkType = next.getLinkType();
                    String pointType = next.getPointType();
                    if (i8 != 0 && (String.valueOf(2).equals(pointType) || String.valueOf(3).equals(pointType))) {
                        isEnable = "N";
                    }
                    FrameLayout frameLayout = (FrameLayout) findViewById(I.getViewId(getContext(), "easy_pay_object" + i9));
                    frameLayout.setVisibility(0);
                    frameLayout.setEnabled("Y".equals(isEnable) && zIsLogin);
                    frameLayout.setTag(next);
                    t.d(i9 + "번째 : " + next.getPointTitle() + ", enableType : " + isEnable + ", linkType :" + linkType);
                    Context context = getContext();
                    StringBuilder sb = new StringBuilder();
                    sb.append("easy_pay_object");
                    sb.append(i9);
                    sb.append("_title");
                    ((TextView) findViewById(I.getViewId(context, sb.toString()))).setText(next.getPointTitle());
                    TextView textView = (TextView) findViewById(I.getViewId(getContext(), "easy_pay_object" + i9 + "_event"));
                    textView.setVisibility(i(linkType) ? 0 : 8);
                    if ("E".equals(linkType)) {
                        textView.setText(AbstractC5959j.common_event_en);
                    } else if ("N".equals(linkType)) {
                        textView.setText(AbstractC5959j.common_notice_en);
                    }
                }
            }
            if (i9 % 2 == 1) {
                ((FrameLayout) findViewById(I.getViewId(getContext(), "easy_pay_object" + (i9 + 1)))).setVisibility(4);
            }
        }
    }

    public ViewOnClickListenerC6475c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37443a = -1;
        this.f37444b = "E";
        this.f37445c = "N";
        j();
    }

    public ViewOnClickListenerC6475c(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f37443a = -1;
        this.f37444b = "E";
        this.f37445c = "N";
        j();
    }
}
