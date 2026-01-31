package d6;

import Q7.X;
import a6.InterfaceC0837a;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import z4.N;

/* renamed from: d6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5328b extends g {

    /* renamed from: G, reason: collision with root package name */
    private final TextView f30059G;

    /* renamed from: H, reason: collision with root package name */
    private final TextView f30060H;

    /* renamed from: I, reason: collision with root package name */
    private final TextView f30061I;

    /* renamed from: J, reason: collision with root package name */
    private final TextView f30062J;

    /* renamed from: K, reason: collision with root package name */
    private final TextView f30063K;

    /* renamed from: L, reason: collision with root package name */
    private final TextView f30064L;

    /* renamed from: M, reason: collision with root package name */
    private final TextView f30065M;

    /* renamed from: N, reason: collision with root package name */
    private final TextView f30066N;

    /* renamed from: O, reason: collision with root package name */
    private final TextView f30067O;

    /* renamed from: P, reason: collision with root package name */
    private final ImageView f30068P;

    /* renamed from: Q, reason: collision with root package name */
    private final ImageView f30069Q;

    public C5328b(View view) {
        super(view);
        this.f30059G = (TextView) view.findViewById(AbstractC5955f.tv_ticket_title_right);
        this.f30060H = (TextView) view.findViewById(AbstractC5955f.tv_dpt_date);
        this.f30061I = (TextView) view.findViewById(AbstractC5955f.tv_arv_date);
        this.f30062J = (TextView) view.findViewById(AbstractC5955f.tv_holiday);
        this.f30063K = (TextView) view.findViewById(AbstractC5955f.tv_dtour);
        this.f30064L = (TextView) view.findViewById(AbstractC5955f.departureTxt);
        this.f30065M = (TextView) view.findViewById(AbstractC5955f.transferTxt0);
        this.f30066N = (TextView) view.findViewById(AbstractC5955f.transferTxt1);
        this.f30067O = (TextView) view.findViewById(AbstractC5955f.arrivalTxt);
        this.f30068P = (ImageView) view.findViewById(AbstractC5955f.iv_station_divider1);
        this.f30069Q = (ImageView) view.findViewById(AbstractC5955f.iv_station_divider2);
    }

    @Override // d6.g, b6.C1084a
    public void setItem(Context context, InterfaceC0837a interfaceC0837a, Bundle bundle) {
        String str;
        super.setItem(context, interfaceC0837a, bundle);
        this.f30092y.append(X.LF);
        this.f30092y.append(N.applySpannable(G(AbstractC5959j.common_a_passenger), new ForegroundColorSpan(Color.parseColor(N(bundle)))));
        TextView textView = this.f30059G;
        StringBuilder sb = new StringBuilder();
        sb.append(bundle.getString("TRAIN_NAME"));
        if (N.isNull(bundle.getString("TRANSFER_TRAILING_TRAIN_NAME"))) {
            str = "";
        } else {
            str = " / " + bundle.getString("TRANSFER_TRAILING_TRAIN_NAME");
        }
        sb.append(str);
        textView.setText(sb.toString());
        this.f30060H.setText(bundle.getString("DEPARTURE_DATE"));
        this.f30061I.setText(N.applySpannable("~ " + bundle.getString("ARRIVAL_DATE"), new ForegroundColorSpan(Color.parseColor(N(bundle)))));
        String string = bundle.getString("PERIOD_COMMUTATION_INCLUDE_HOLIDAY");
        if (N.isNotNull(string)) {
            this.f30062J.setVisibility(0);
            this.f30062J.setText(string);
        }
        this.f30063K.setText(N.applySpannable(bundle.getString("D_TOUR"), new ForegroundColorSpan(Color.parseColor(N(bundle)))));
        this.f30063K.setVisibility(N.isNull(bundle.getString("D_TOUR")) ? 8 : 0);
        this.f30064L.setText(N.applySpannable(bundle.getString("DEPARTURE_STATION_NAME"), new ForegroundColorSpan(Color.parseColor(N(bundle)))));
        this.f30065M.setText(N.applySpannable(bundle.getString("ARRIVAL_STATION_NAME"), new ForegroundColorSpan(Color.parseColor(N(bundle)))));
        this.f30065M.setVisibility(N.isNull(bundle.getString("ARRIVAL_STATION_NAME")) ? 8 : 0);
        this.f30066N.setText(N.applySpannable(bundle.getString("TRANSFER_DEPARTURE_STATION_NAME"), new ForegroundColorSpan(Color.parseColor(N(bundle)))));
        this.f30066N.setVisibility(N.isNull(bundle.getString("TRANSFER_DEPARTURE_STATION_NAME")) ? 8 : 0);
        this.f30067O.setText(N.applySpannable(bundle.getString("TRANSFER_ARRIVAL_STATION_NAME"), new ForegroundColorSpan(Color.parseColor(N(bundle)))));
        this.f30068P.setImageResource(M(bundle));
        this.f30069Q.setImageResource(M(bundle));
    }
}
