package c6;

import F4.Q;
import a6.InterfaceC0837a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class i extends h {

    /* renamed from: P, reason: collision with root package name */
    private final View f11558P;

    /* renamed from: Q, reason: collision with root package name */
    private final View f11559Q;

    /* renamed from: R, reason: collision with root package name */
    private final TextView f11560R;

    /* renamed from: S, reason: collision with root package name */
    private final TextView f11561S;

    /* renamed from: T, reason: collision with root package name */
    private final TextView f11562T;

    /* renamed from: U, reason: collision with root package name */
    private final TextView f11563U;

    /* renamed from: V, reason: collision with root package name */
    private final TextView f11564V;

    /* renamed from: W, reason: collision with root package name */
    private final LinearLayout f11565W;

    /* renamed from: X, reason: collision with root package name */
    private final LinearLayout f11566X;

    /* renamed from: Y, reason: collision with root package name */
    private final ImageView f11567Y;

    /* renamed from: Z, reason: collision with root package name */
    private final LinearLayout f11568Z;

    /* renamed from: a0, reason: collision with root package name */
    private final ViewGroup f11569a0;

    public i(View view) {
        super(view);
        this.f11558P = view.findViewById(AbstractC5955f.v_transfer);
        this.f11559Q = view.findViewById(AbstractC5955f.iv_station_divider2);
        this.f11565W = (LinearLayout) view.findViewById(AbstractC5955f.transferTimeLayout);
        this.f11566X = (LinearLayout) view.findViewById(AbstractC5955f.arrivalTimeLayout);
        this.f11560R = (TextView) view.findViewById(AbstractC5955f.departureTimeTxt);
        this.f11561S = (TextView) view.findViewById(AbstractC5955f.departureDelayTimeTxt);
        this.f11562T = (TextView) view.findViewById(AbstractC5955f.transferTimeTxt0);
        this.f11563U = (TextView) view.findViewById(AbstractC5955f.arrivalTimeTxt0);
        this.f11564V = (TextView) view.findViewById(AbstractC5955f.arrivalDelayTimeTxt0);
        this.f11567Y = (ImageView) view.findViewById(AbstractC5955f.dotLine0);
        this.f11568Z = (LinearLayout) view.findViewById(AbstractC5955f.transferTimeBottomLayout);
        this.f11569a0 = (ViewGroup) view.findViewById(AbstractC5955f.mergeTicketView);
    }

    private String O(int i8, int i9) {
        t.d("지연 예상 : " + i8 + ", 지연 : " + i9);
        if (i8 > 0) {
            return "(" + H(AbstractC5959j.common_expect_delay_time, Integer.valueOf(i8)) + ")";
        }
        if (i9 <= 0) {
            return "";
        }
        return "(" + H(AbstractC5959j.common_actual_delay_time, Integer.valueOf(i9)) + ")";
    }

    private void P(ArrayList arrayList) {
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            if (1 == i8 && 2 == getItemViewType()) {
                this.f11541E[i8].findViewById(AbstractC5955f.train_info_layout).setVisibility(8);
                this.f11541E[i8].findViewById(AbstractC5955f.train_info_text).setVisibility(0);
                ((TextView) this.f11541E[i8].findViewById(AbstractC5955f.train_info_text)).setText(G(AbstractC5959j.ticket_same_train));
                String string = ((Bundle) arrayList.get(0)).getString("TRAIN_SELF_SEAT");
                if (string != null && string.equals("C")) {
                    ((TextView) this.f11541E[i8].findViewById(AbstractC5955f.train_info_text)).setText(G(AbstractC5959j.ticket_self_seat));
                }
            } else {
                this.f11541E[i8].findViewById(AbstractC5955f.train_info_layout).setVisibility(0);
                this.f11541E[i8].findViewById(AbstractC5955f.train_info_text).setVisibility(8);
            }
        }
    }

    @Override // c6.h
    protected void K(Context context, Bundle bundle, InterfaceC0837a interfaceC0837a) {
        super.K(context, bundle, interfaceC0837a);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("JRNY_LIST_DATA");
        for (int i8 = 0; i8 < parcelableArrayList.size(); i8++) {
            this.f11541E[i8].findViewById(AbstractC5955f.tv_train_icon).setVisibility(8);
        }
    }

    @Override // c6.h
    protected void L(Context context, Bundle bundle) {
        super.L(context, bundle);
        this.f11558P.setVisibility(8);
        this.f11559Q.setVisibility(8);
    }

    @Override // c6.h
    protected void M(Bundle bundle) {
        super.M(bundle);
        this.f11567Y.setVisibility(8);
        this.f11565W.setVisibility(8);
        this.f11562T.setVisibility(8);
        this.f11568Z.setVisibility(8);
        this.f11566X.setVisibility(0);
        this.f11563U.setVisibility(0);
        this.f11560R.setText(bundle.getString("DEPARTURE_TIME"));
        this.f11563U.setText(bundle.getString("ARRIVAL_TIME"));
        if (bundle.getBoolean("IS_EMERGENCY") || bundle.getBoolean("IS_PURCHASE_HISTORY")) {
            return;
        }
        t.d("DEPARTURE_TIME : " + bundle.getString("DEPARTURE_TIME"));
        String strO = O(N.getInteger(bundle.getString("DEPARTURE_EXPECT_DELAY_TIME")), N.getInteger(bundle.getString("DEPARTURE_ACTUAL_DELAY_TIME")));
        if (N.isNotNull(strO)) {
            this.f11561S.setVisibility(0);
            this.f11561S.setText(strO);
        } else {
            this.f11561S.setVisibility(4);
            this.f11561S.setText("");
        }
        String strO2 = O(N.getInteger(bundle.getString("ARRIVAL_EXPECT_DELAY_TIME")), N.getInteger(bundle.getString("ARRIVAL_ACTUAL_DELAY_TIME")));
        if (N.isNotNull(strO2)) {
            this.f11564V.setVisibility(0);
            this.f11564V.setText(strO2);
        } else {
            this.f11564V.setVisibility(4);
            this.f11564V.setText("");
        }
    }

    @Override // c6.h, b6.C1084a
    public void setItem(Context context, InterfaceC0837a interfaceC0837a, Bundle bundle) throws NumberFormatException {
        super.setItem(context, interfaceC0837a, bundle);
        if (2 == getItemViewType()) {
            P(bundle.getParcelableArrayList("JRNY_LIST_DATA"));
        }
        Q.setMergeTrain(context, bundle, this.itemView, this.f11569a0);
    }
}
