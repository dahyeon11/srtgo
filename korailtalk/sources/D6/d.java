package d6;

import Q7.X;
import a6.InterfaceC0837a;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import j4.r;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import z4.N;

/* loaded from: classes.dex */
public class d extends g {

    /* renamed from: G, reason: collision with root package name */
    private final TextView f30072G;

    /* renamed from: H, reason: collision with root package name */
    private final TextView f30073H;

    /* renamed from: I, reason: collision with root package name */
    private final TextView f30074I;

    /* renamed from: J, reason: collision with root package name */
    private final View[] f30075J;

    /* renamed from: K, reason: collision with root package name */
    private final ViewGroup f30076K;

    public d(View view) {
        super(view);
        this.f30072G = (TextView) view.findViewById(AbstractC5955f.tv_ticket_title_right);
        this.f30073H = (TextView) view.findViewById(AbstractC5955f.tv_dpt_date);
        this.f30074I = (TextView) view.findViewById(AbstractC5955f.tv_arv_date);
        this.f30075J = new View[3];
        for (int i8 = 0; i8 < 3; i8++) {
            this.f30075J[i8] = view.findViewById(I("ic_ticket_station" + i8));
        }
        this.f30076K = (ViewGroup) view.findViewById(AbstractC5955f.returnNumberView);
    }

    private void P(int i8, View view, Bundle bundle) {
        TextView textView = (TextView) view.findViewById(AbstractC5955f.tv_dtour);
        TextView textView2 = (TextView) view.findViewById(AbstractC5955f.departureTxt);
        TextView textView3 = (TextView) view.findViewById(AbstractC5955f.arrivalTxt);
        TextView textView4 = (TextView) view.findViewById(AbstractC5955f.tv_section);
        ImageView imageView = (ImageView) view.findViewById(AbstractC5955f.dirArwImg0);
        textView.setText(N.applySpannable(bundle.getString("D_TOUR" + i8), new ForegroundColorSpan(Color.parseColor(N(bundle)))));
        StringBuilder sb = new StringBuilder();
        sb.append("D_TOUR");
        sb.append(i8);
        textView.setVisibility(N.isNull(bundle.getString(sb.toString())) ? 8 : 0);
        textView2.setText(N.applySpannable(bundle.getString("DEPARTURE_STATION_NAME" + i8), new ForegroundColorSpan(Color.parseColor(N(bundle)))));
        textView3.setText(N.applySpannable(bundle.getString("ARRIVAL_STATION_NAME" + i8), new ForegroundColorSpan(Color.parseColor(N(bundle)))));
        textView4.setVisibility(0);
        textView4.setText(H(AbstractC5959j.common_section_n, Integer.valueOf(i8 + 1)));
        imageView.setImageResource(M(bundle));
    }

    @Override // d6.g, b6.C1084a
    public void setItem(Context context, InterfaceC0837a interfaceC0837a, Bundle bundle) {
        super.setItem(context, interfaceC0837a, bundle);
        this.f30092y.append(X.LF);
        this.f30092y.append(N.applySpannable(G(AbstractC5959j.common_a_passenger), new ForegroundColorSpan(Color.parseColor(N(bundle)))));
        this.f30072G.setText(bundle.getString("TRAIN_NAME"));
        this.f30073H.setText(bundle.getString("DEPARTURE_DATE"));
        this.f30074I.setText(N.applySpannable("~ " + bundle.getString("ARRIVAL_DATE"), new ForegroundColorSpan(Color.parseColor(N(bundle)))));
        int i8 = bundle.getInt("N_CARD_SECTION_COUNT");
        for (int i9 = 0; i9 < i8; i9++) {
            this.f30075J[i9].setVisibility(0);
            P(i9, this.f30075J[i9], bundle);
        }
        while (i8 < 3) {
            this.f30075J[i8].setVisibility(8);
            i8++;
        }
        if (bundle.getBoolean("N_CARD_SECOND_USER_FLG")) {
            bundle.putString(r.QR_CODE, "https://letskorail.com");
            this.f30076K.setVisibility(8);
        }
    }
}
