package d6;

import F4.Q;
import Q7.X;
import a6.InterfaceC0837a;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextClock;
import android.widget.TextView;
import b6.C1084a;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.ui.ticket.confirm.TicketSelfCheckinStatusActivity;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5953d;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import z4.H;
import z4.N;
import z4.q;
import z4.t;

/* loaded from: classes.dex */
public abstract class g extends C1084a {

    /* renamed from: A, reason: collision with root package name */
    private final ImageView f30082A;

    /* renamed from: B, reason: collision with root package name */
    private final TextClock f30083B;

    /* renamed from: C, reason: collision with root package name */
    private final View f30084C;

    /* renamed from: D, reason: collision with root package name */
    private final TextView f30085D;

    /* renamed from: E, reason: collision with root package name */
    private final RelativeLayout f30086E;

    /* renamed from: F, reason: collision with root package name */
    private final ImageView f30087F;

    /* renamed from: u, reason: collision with root package name */
    private final TextView f30088u;

    /* renamed from: v, reason: collision with root package name */
    private final TextView f30089v;

    /* renamed from: w, reason: collision with root package name */
    private final TextView f30090w;

    /* renamed from: x, reason: collision with root package name */
    private final TextView f30091x;

    /* renamed from: y, reason: collision with root package name */
    protected final TextView f30092y;

    /* renamed from: z, reason: collision with root package name */
    private final ImageView f30093z;

    g(View view) {
        super(view);
        this.f30088u = (TextView) view.findViewById(AbstractC5955f.tv_ticket_title_left);
        this.f30090w = (TextView) view.findViewById(AbstractC5955f.tv_ps_nm);
        this.f30091x = (TextView) view.findViewById(AbstractC5955f.tv_ps_self_checkin);
        this.f30092y = (TextView) view.findViewById(AbstractC5955f.tv_ps_info);
        this.f30089v = (TextView) view.findViewById(AbstractC5955f.tv_return_no);
        this.f30093z = (ImageView) view.findViewById(AbstractC5955f.badge);
        this.f30082A = (ImageView) view.findViewById(AbstractC5955f.iv_ticket_train_fare_receipt);
        this.f30083B = (TextClock) view.findViewById(AbstractC5955f.text_clock);
        this.f30084C = view.findViewById(AbstractC5955f.v_bottom);
        this.f30085D = (TextView) view.findViewById(AbstractC5955f.unavailableTxt);
        this.f30086E = (RelativeLayout) view.findViewById(AbstractC5955f.dim);
        this.f30087F = (ImageView) view.findViewById(AbstractC5955f.iv_sample);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private List L(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        switch (bundle.getInt("TICKET_TITLE_BG", 30)) {
            case 33:
                arrayList.add("\n25세 이하");
                return arrayList;
            case 34:
                arrayList.add("\n25세 이상");
                return arrayList;
            case 35:
                String string = bundle.getString("PASS_STATION_NAME");
                String string2 = bundle.getString("PASS_COUPON_NUMBER");
                boolean zIsNotNull = N.isNotNull(string);
                boolean z8 = N.isNotNull(string2) && !string2.equalsIgnoreCase("0");
                if (zIsNotNull) {
                    arrayList.add(X.LF + string);
                    if (z8) {
                        arrayList.add(string2);
                    }
                } else if (z8) {
                    arrayList.add(X.LF + string2);
                }
                return arrayList;
            case 36:
                arrayList.add("");
                return arrayList;
            default:
                return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToSelfCheckinStatus(bundle.getInt("INDEX"), 0, 0);
    }

    protected int M(Bundle bundle) {
        int i8 = AbstractC5954e.arw_return;
        int i9 = bundle.getInt("TICKET_TITLE_BG", 30);
        return i9 != 33 ? i9 != 34 ? i9 != 36 ? i8 : AbstractC5954e.arw_return_p : AbstractC5954e.arw_return : AbstractC5954e.arw_return_b;
    }

    protected String N(Bundle bundle) {
        switch (bundle.getInt("TICKET_TITLE_BG", 30)) {
            case 33:
                return "#8c83cd";
            case 34:
            default:
                return "#47b6ed";
            case 35:
                return "#349c63";
            case 36:
                return "#cc628c";
            case 37:
                return "#984629";
        }
    }

    @Override // b6.C1084a
    public void setItem(Context context, final InterfaceC0837a interfaceC0837a, final Bundle bundle) {
        super.setItem(context, interfaceC0837a, bundle);
        this.f30088u.setText(bundle.getString("TICKET_TITLE"));
        this.f30089v.setText(bundle.getString("RETURN_NO"));
        this.f30090w.setText(N.applySpannable(bundle.getString("CUSTOMER_NAME"), new ForegroundColorSpan(Color.parseColor(N(bundle)))));
        CommonCodeDao.ViewVisibility viewVisibility = (CommonCodeDao.ViewVisibility) q.fromJson(H.getString(context, "VIEW_VISIBILITY"), CommonCodeDao.ViewVisibility.class);
        String string = bundle.getString("SELF_CHECKIN_STATUS");
        t.d("selfCheckinStatus : " + string + ", qrCheckinEnable : " + viewVisibility.getCheckIn());
        if (("Y".equals(viewVisibility.getCheckIn()) && (TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE.equals(string) || TicketSelfCheckinStatusActivity.CHECKIN_STATUS_USING.equals(string) || TicketSelfCheckinStatusActivity.CHECKIN_STATUS_CANCEL.equals(string))) || TicketSelfCheckinStatusActivity.CHECKIN_STATUS_EXCEED.equals(string)) {
            this.f30091x.setVisibility(0);
            this.f30091x.setTextColor(androidx.core.content.a.getColor(context, AbstractC5953d.ocean_blue));
            this.f30091x.setBackground(androidx.core.content.a.getDrawable(context, AbstractC5954e.selector_btn_round_stroke_blue));
            if (TicketSelfCheckinStatusActivity.CHECKIN_STATUS_EXCEED.equals(string)) {
                this.f30091x.setText(G(AbstractC5959j.self_checkin_exceed));
                this.f30091x.setOnClickListener(null);
            } else {
                if (TicketSelfCheckinStatusActivity.CHECKIN_STATUS_USING.equals(string)) {
                    this.f30091x.setText(G(AbstractC5959j.self_checkin_using));
                    this.f30091x.setTextColor(androidx.core.content.a.getColor(context, AbstractC5953d.color_ffffffff));
                    this.f30091x.setBackground(androidx.core.content.a.getDrawable(context, AbstractC5954e.selector_self_checkin_btn_round_stroke));
                } else {
                    this.f30091x.setText(G(AbstractC5959j.common_self_checkin));
                }
                this.f30091x.setOnClickListener(new View.OnClickListener() { // from class: d6.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        g.O(interfaceC0837a, bundle, view);
                    }
                });
            }
        } else {
            this.f30091x.setVisibility(8);
        }
        this.f30092y.setText(bundle.getString("CUSTOMER_SEX"));
        this.f30092y.append(N.applySpannable(" | ", new ForegroundColorSpan(Color.parseColor("#CCCCCC"))));
        this.f30092y.append(bundle.getString("CUSTOMER_BIRTH"));
        List listL = L(bundle);
        for (int i8 = 0; i8 < listL.size(); i8++) {
            this.f30092y.append((CharSequence) listL.get(i8));
            if (i8 < listL.size() - 1) {
                this.f30092y.append(N.applySpannable(" | ", new ForegroundColorSpan(Color.parseColor("#CCCCCC"))));
            }
        }
        Q.setBadgeImg(bundle, this.f30093z);
        Q.setSpecialQRCode(context, interfaceC0837a, bundle, this.f30082A);
        Q.setCurrentDate(bundle, this.f30083B);
        Q.setSpecialBottomView(context, interfaceC0837a, bundle, this.f30084C, this.f30085D);
        Q.setSample(this.f30087F);
        Q.setDim(context, interfaceC0837a, bundle, this.f30086E);
    }
}
