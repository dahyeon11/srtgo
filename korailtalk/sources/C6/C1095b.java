package c6;

import F4.Q;
import a6.InterfaceC0837a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextClock;
import android.widget.TextView;
import b6.C1084a;
import java.util.ArrayList;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.C6634h;
import z4.N;

/* renamed from: c6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1095b extends C1084a {

    /* renamed from: A, reason: collision with root package name */
    private final TextView f11503A;

    /* renamed from: B, reason: collision with root package name */
    private final TextView f11504B;

    /* renamed from: C, reason: collision with root package name */
    private final TextView f11505C;

    /* renamed from: D, reason: collision with root package name */
    private final ImageView f11506D;

    /* renamed from: E, reason: collision with root package name */
    private final ImageView f11507E;

    /* renamed from: F, reason: collision with root package name */
    private final ImageView f11508F;

    /* renamed from: G, reason: collision with root package name */
    private final ImageView f11509G;

    /* renamed from: H, reason: collision with root package name */
    private final Button f11510H;

    /* renamed from: I, reason: collision with root package name */
    private final Button f11511I;

    /* renamed from: J, reason: collision with root package name */
    private LinearLayout f11512J;

    /* renamed from: K, reason: collision with root package name */
    private String f11513K;

    /* renamed from: u, reason: collision with root package name */
    private final TextClock f11514u;

    /* renamed from: v, reason: collision with root package name */
    private final TextView f11515v;

    /* renamed from: w, reason: collision with root package name */
    private final TextView f11516w;

    /* renamed from: x, reason: collision with root package name */
    private final TextView f11517x;

    /* renamed from: y, reason: collision with root package name */
    private final TextView f11518y;

    /* renamed from: z, reason: collision with root package name */
    private final RelativeLayout f11519z;

    public C1095b(View view, String str) {
        super(view);
        this.f11513K = str;
        this.f11514u = (TextClock) view.findViewById(AbstractC5955f.text_clock);
        this.f11515v = (TextView) view.findViewById(AbstractC5955f.tv_ticket_title_left);
        this.f11516w = (TextView) view.findViewById(AbstractC5955f.tv_ticket_title_right);
        this.f11517x = (TextView) view.findViewById(AbstractC5955f.tv_ticket_departure);
        this.f11518y = (TextView) view.findViewById(AbstractC5955f.tv_ticket_arrival);
        this.f11519z = (RelativeLayout) view.findViewById(AbstractC5955f.dim);
        this.f11503A = (TextView) view.findViewById(AbstractC5955f.tv_limousine_bus_run_tm);
        this.f11504B = (TextView) view.findViewById(AbstractC5955f.tv_limousine_bus_abrd_spot);
        this.f11505C = (TextView) view.findViewById(AbstractC5955f.tv_limousine_guide);
        this.f11512J = (LinearLayout) view.findViewById(AbstractC5955f.busTicketContainer);
        this.f11506D = (ImageView) view.findViewById(AbstractC5955f.iv_down_arrow);
        this.f11507E = (ImageView) view.findViewById(AbstractC5955f.badge);
        this.f11510H = (Button) view.findViewById(AbstractC5955f.btn_return);
        this.f11511I = (Button) view.findViewById(AbstractC5955f.btn_emergency);
        this.f11508F = (ImageView) view.findViewById(AbstractC5955f.iv_sample);
        ImageView imageView = (ImageView) view.findViewById(AbstractC5955f.iv_ticket_train_fare_receipt);
        this.f11509G = imageView;
        imageView.setVisibility(8);
    }

    @Override // b6.C1084a
    public void setItem(Context context, InterfaceC0837a interfaceC0837a, Bundle bundle) {
        super.setItem(context, interfaceC0837a, bundle);
        this.f11515v.setText(C6634h.convertFormat(bundle.getString("DEPARTURE_DATE"), "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
        this.f11516w.setText(bundle.getString("TICKET_TITLE", ""));
        String string = bundle.getString("DEPARTURE_STATION_NAME");
        String string2 = bundle.getString("ARRIVAL_STATION_NAME");
        this.f11517x.setText(string);
        this.f11518y.setText(string2);
        if (this.f11513K.equals("new")) {
            if (bundle.getString("ARRIVAL_STATION_CODE").equals("0921")) {
                this.f11518y.setText(string2);
            }
            String string3 = bundle.getString("DEPARTURE_TIME");
            ArrayList parcelableArrayList = ((Bundle) bundle.getParcelableArrayList("JRNY_LIST_DATA").get(0)).getParcelableArrayList("SEAT_LIST_DATA");
            if (parcelableArrayList != null && parcelableArrayList.size() > 0) {
                this.f11512J.removeAllViews();
                for (int i8 = 0; i8 < parcelableArrayList.size(); i8++) {
                    View viewInflate = LayoutInflater.from(context).inflate(AbstractC5957h.view_bus_list_item, (ViewGroup) this.f11512J, false);
                    ImageView imageView = (ImageView) viewInflate.findViewById(AbstractC5955f.iv_ticket_train_fare_receipt);
                    TextView textView = (TextView) viewInflate.findViewById(AbstractC5955f.tv_bus_seat);
                    TextView textView2 = (TextView) viewInflate.findViewById(AbstractC5955f.tv_bus_tm);
                    textView.setText(((Bundle) parcelableArrayList.get(i8)).getString("SEAT_NUMBER"));
                    textView2.setText(string3);
                    Q.setLimousineQRCode(context, interfaceC0837a, bundle, imageView);
                    this.f11512J.addView(viewInflate);
                }
            }
        } else {
            if (string.length() > string2.length()) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f11517x.getLayoutParams();
                layoutParams.addRule(5, 0);
                layoutParams.addRule(7, 0);
                this.f11517x.setLayoutParams(layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f11518y.getLayoutParams();
                layoutParams2.addRule(5, this.f11517x.getId());
                layoutParams2.addRule(7, this.f11517x.getId());
                this.f11518y.setLayoutParams(layoutParams2);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f11506D.getLayoutParams();
                layoutParams3.addRule(5, this.f11517x.getId());
                layoutParams3.addRule(7, this.f11517x.getId());
                this.f11506D.setLayoutParams(layoutParams3);
            } else {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f11518y.getLayoutParams();
                layoutParams4.addRule(5, 0);
                layoutParams4.addRule(7, 0);
                this.f11518y.setLayoutParams(layoutParams4);
                RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f11517x.getLayoutParams();
                layoutParams5.addRule(5, this.f11518y.getId());
                layoutParams5.addRule(7, this.f11518y.getId());
                this.f11517x.setLayoutParams(layoutParams5);
                RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.f11506D.getLayoutParams();
                layoutParams6.addRule(5, this.f11518y.getId());
                layoutParams6.addRule(7, this.f11518y.getId());
                this.f11506D.setLayoutParams(layoutParams6);
            }
            Q.setLimousineQRCode(context, interfaceC0837a, bundle, this.f11509G);
            this.f11509G.setVisibility(0);
        }
        String string4 = bundle.getString("LIMOUSINE_RUN_TIME");
        this.f11503A.setVisibility(N.isNull(string4) ? 8 : 0);
        TextView textView3 = this.f11503A;
        if (N.isNull(string4)) {
            string4 = "";
        }
        textView3.setText(string4);
        String string5 = bundle.getString("LIMOUSINE_ABRD_SPOT");
        this.f11504B.setVisibility(N.isNull(string5) ? 8 : 0);
        TextView textView4 = this.f11504B;
        if (N.isNull(string5)) {
            string5 = "";
        }
        textView4.setText(string5);
        String string6 = bundle.getString("LIMOUSINE_GUIDE");
        this.f11505C.setVisibility(N.isNull(string6) ? 8 : 0);
        this.f11505C.setText(N.isNull(string6) ? "" : string6);
        Q.setBadgeImg(bundle, this.f11507E);
        Q.setCurrentDate(bundle, this.f11514u);
        Q.setLimousineBottom(interfaceC0837a, bundle, this.f11510H, this.f11511I);
        Q.setSample(this.f11508F);
        Q.setDim(context, interfaceC0837a, bundle, this.f11519z);
    }
}
