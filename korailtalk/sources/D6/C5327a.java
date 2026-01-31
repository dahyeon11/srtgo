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

/* renamed from: d6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5327a extends g {

    /* renamed from: G, reason: collision with root package name */
    private final TextView f30051G;

    /* renamed from: H, reason: collision with root package name */
    private final TextView f30052H;

    /* renamed from: I, reason: collision with root package name */
    private final TextView f30053I;

    /* renamed from: J, reason: collision with root package name */
    private final TextView f30054J;

    /* renamed from: K, reason: collision with root package name */
    private final TextView f30055K;

    /* renamed from: L, reason: collision with root package name */
    private final TextView f30056L;

    /* renamed from: M, reason: collision with root package name */
    private final TextView f30057M;

    /* renamed from: N, reason: collision with root package name */
    private final ImageView f30058N;

    public C5327a(View view) {
        super(view);
        this.f30051G = (TextView) view.findViewById(AbstractC5955f.tv_ticket_title_right);
        this.f30052H = (TextView) view.findViewById(AbstractC5955f.tv_dpt_date);
        this.f30053I = (TextView) view.findViewById(AbstractC5955f.tv_arv_date);
        this.f30054J = (TextView) view.findViewById(AbstractC5955f.tv_holiday);
        this.f30055K = (TextView) view.findViewById(AbstractC5955f.tv_dtour);
        this.f30056L = (TextView) view.findViewById(AbstractC5955f.departureTxt);
        this.f30057M = (TextView) view.findViewById(AbstractC5955f.arrivalTxt);
        this.f30058N = (ImageView) view.findViewById(AbstractC5955f.dirArwImg0);
    }

    @Override // d6.g, b6.C1084a
    public void setItem(Context context, InterfaceC0837a interfaceC0837a, Bundle bundle) {
        super.setItem(context, interfaceC0837a, bundle);
        this.f30092y.append(X.LF);
        this.f30092y.append(N.applySpannable(G(AbstractC5959j.common_a_passenger), new ForegroundColorSpan(Color.parseColor(N(bundle)))));
        this.f30051G.setText(bundle.getString("TRAIN_NAME"));
        this.f30052H.setText(bundle.getString("DEPARTURE_DATE"));
        this.f30053I.setText(N.applySpannable("~ " + bundle.getString("ARRIVAL_DATE"), new ForegroundColorSpan(Color.parseColor(N(bundle)))));
        String string = bundle.getString("PERIOD_COMMUTATION_INCLUDE_HOLIDAY");
        if (N.isNotNull(string)) {
            this.f30054J.setVisibility(0);
            this.f30054J.setText(string);
        }
        this.f30055K.setText(N.applySpannable(bundle.getString("D_TOUR"), new ForegroundColorSpan(Color.parseColor(N(bundle)))));
        this.f30055K.setVisibility(N.isNull(bundle.getString("D_TOUR")) ? 8 : 0);
        this.f30056L.setText(N.applySpannable(bundle.getString("DEPARTURE_STATION_NAME"), new ForegroundColorSpan(Color.parseColor(N(bundle)))));
        this.f30057M.setText(N.applySpannable(bundle.getString("ARRIVAL_STATION_NAME"), new ForegroundColorSpan(Color.parseColor(N(bundle)))));
        this.f30058N.setImageResource(M(bundle));
    }
}
