package c6;

import F4.Q;
import a6.InterfaceC0837a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class j extends h {

    /* renamed from: P, reason: collision with root package name */
    private final TextView f11570P;

    /* renamed from: Q, reason: collision with root package name */
    private final TextView f11571Q;

    /* renamed from: R, reason: collision with root package name */
    private final TextView f11572R;

    /* renamed from: S, reason: collision with root package name */
    private final TextView f11573S;

    /* renamed from: T, reason: collision with root package name */
    private final TextView f11574T;

    /* renamed from: U, reason: collision with root package name */
    private final TextView f11575U;

    /* renamed from: V, reason: collision with root package name */
    private final ViewGroup f11576V;

    public j(View view) {
        super(view);
        this.f11570P = (TextView) view.findViewById(AbstractC5955f.transferTxt0);
        this.f11571Q = (TextView) view.findViewById(AbstractC5955f.transferTxt1);
        this.f11572R = (TextView) view.findViewById(AbstractC5955f.departureTimeTxt);
        this.f11573S = (TextView) view.findViewById(AbstractC5955f.transferTimeTxt0);
        this.f11574T = (TextView) view.findViewById(AbstractC5955f.transferTimeTxt1);
        this.f11575U = (TextView) view.findViewById(AbstractC5955f.arrivalTimeTxt);
        this.f11576V = (ViewGroup) view.findViewById(AbstractC5955f.ic_extra_product);
    }

    @Override // c6.h
    protected void L(Context context, Bundle bundle) {
        super.L(context, bundle);
        this.f11570P.setText(bundle.getString("TRANSFER_ARRIVAL_STATION_NAME"));
        this.f11571Q.setText(bundle.getString("TRANSFER_DEPARTURE_STATION_NAME"));
        this.f11571Q.setVisibility(bundle.containsKey("TRANSFER_DEPARTURE_STATION_NAME") ? 0 : 8);
    }

    @Override // c6.h
    protected void M(Bundle bundle) {
        super.M(bundle);
        this.f11572R.setText(bundle.getString("DEPARTURE_TIME"));
        this.f11573S.setText(bundle.getString("TRANSFER_ARRIVAL_TIME"));
        this.f11574T.setText(bundle.getString("TRANSFER_DEPARTURE_TIME"));
        this.f11575U.setText(bundle.getString("ARRIVAL_TIME"));
    }

    @Override // c6.h, b6.C1084a
    public void setItem(Context context, InterfaceC0837a interfaceC0837a, Bundle bundle) {
        super.setItem(context, interfaceC0837a, bundle);
        Q.setExtraProduct(context, interfaceC0837a, bundle, this.f11576V);
    }
}
