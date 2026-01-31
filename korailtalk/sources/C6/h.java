package c6;

import F4.Q;
import a6.InterfaceC0837a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextClock;
import android.widget.TextView;
import b6.C1084a;
import java.util.ArrayList;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import z4.C6634h;

/* loaded from: classes.dex */
public class h extends C1084a {

    /* renamed from: A, reason: collision with root package name */
    private final TextView f11537A;

    /* renamed from: B, reason: collision with root package name */
    private final ImageView f11538B;

    /* renamed from: C, reason: collision with root package name */
    private final ImageView f11539C;

    /* renamed from: D, reason: collision with root package name */
    protected final View[] f11540D;

    /* renamed from: E, reason: collision with root package name */
    protected final View[] f11541E;

    /* renamed from: F, reason: collision with root package name */
    protected final View[] f11542F;

    /* renamed from: G, reason: collision with root package name */
    private final ImageView f11543G;

    /* renamed from: H, reason: collision with root package name */
    private final View f11544H;

    /* renamed from: I, reason: collision with root package name */
    private final ViewGroup f11545I;

    /* renamed from: J, reason: collision with root package name */
    private final TextClock f11546J;

    /* renamed from: K, reason: collision with root package name */
    private final View f11547K;

    /* renamed from: L, reason: collision with root package name */
    private final View f11548L;

    /* renamed from: M, reason: collision with root package name */
    private final TextView f11549M;

    /* renamed from: N, reason: collision with root package name */
    private final RelativeLayout f11550N;

    /* renamed from: O, reason: collision with root package name */
    private final ImageView f11551O;

    /* renamed from: u, reason: collision with root package name */
    private final int f11552u;

    /* renamed from: v, reason: collision with root package name */
    private final TextView f11553v;

    /* renamed from: w, reason: collision with root package name */
    private final TextView f11554w;

    /* renamed from: x, reason: collision with root package name */
    private final TextView f11555x;

    /* renamed from: y, reason: collision with root package name */
    private final TextView f11556y;

    /* renamed from: z, reason: collision with root package name */
    private final TextView f11557z;

    public h(View view) {
        super(view);
        this.f11552u = 2;
        this.f11553v = (TextView) view.findViewById(AbstractC5955f.tv_ticket_title_left);
        this.f11554w = (TextView) view.findViewById(AbstractC5955f.tv_ticket_title_right);
        this.f11555x = (TextView) view.findViewById(AbstractC5955f.departureTxt);
        this.f11556y = (TextView) view.findViewById(AbstractC5955f.arrivalTxt);
        this.f11557z = (TextView) view.findViewById(AbstractC5955f.tv_dtour);
        this.f11537A = (TextView) view.findViewById(AbstractC5955f.tv_extra);
        this.f11540D = new View[9];
        this.f11541E = new View[9];
        this.f11542F = new View[9];
        for (int i8 = 0; i8 < 2; i8++) {
            this.f11540D[i8] = view.findViewById(I("v_jrny" + i8));
            this.f11541E[i8] = view.findViewById(I("ic_ticket_train" + i8));
            this.f11542F[i8] = view.findViewById(I("ic_ticket_train_seat" + i8));
        }
        this.f11543G = (ImageView) view.findViewById(AbstractC5955f.badge);
        this.f11544H = view.findViewById(AbstractC5955f.v_capture);
        this.f11545I = (ViewGroup) view.findViewById(AbstractC5955f.ic_easy_function);
        this.f11546J = (TextClock) view.findViewById(AbstractC5955f.text_clock);
        this.f11547K = view.findViewById(AbstractC5955f.bottomBtnView);
        this.f11548L = view.findViewById(AbstractC5955f.bottomBtnView2);
        this.f11549M = (TextView) view.findViewById(AbstractC5955f.unavailableTxt);
        this.f11550N = (RelativeLayout) view.findViewById(AbstractC5955f.dim);
        this.f11551O = (ImageView) view.findViewById(AbstractC5955f.iv_sample);
        this.f11538B = (ImageView) view.findViewById(AbstractC5955f.iv_running_close);
        this.f11539C = (ImageView) view.findViewById(AbstractC5955f.iv_running_stpv);
    }

    private void N(Bundle bundle) {
        this.f11553v.setText(C6634h.convertFormat(bundle.getString("DEPARTURE_DATE"), "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
        this.f11554w.setText(bundle.getString("TICKET_TITLE", ""));
    }

    protected void K(Context context, Bundle bundle, InterfaceC0837a interfaceC0837a) {
        String strG;
        String string;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("JRNY_LIST_DATA");
        for (int i8 = 0; i8 < parcelableArrayList.size(); i8++) {
            Bundle bundle2 = (Bundle) parcelableArrayList.get(i8);
            if (i8 == 0) {
                strG = G(AbstractC5959j.common_preceding);
                string = bundle2.getString("TRAIN_NAME");
            } else {
                strG = G(AbstractC5959j.common_trailing);
                string = bundle2.getString("TRAIN_NAME");
            }
            this.f11540D[i8].setVisibility(0);
            this.f11541E[i8].findViewById(AbstractC5955f.tv_train_icon).setVisibility(0);
            ((TextView) this.f11541E[i8].findViewById(AbstractC5955f.tv_train_icon)).setText(strG);
            ((TextView) this.f11541E[i8].findViewById(AbstractC5955f.tv_train_nm)).setText(string);
            Q.setTrainServiceInfo(interfaceC0837a, bundle, i8, this.f11541E[i8].findViewById(AbstractC5955f.v_train_facility), this.f11541E[i8].findViewById(AbstractC5955f.v_train_info));
            ArrayList parcelableArrayList2 = bundle2.getParcelableArrayList("SEAT_LIST_DATA");
            for (int i9 = 0; i9 < parcelableArrayList2.size(); i9++) {
                Bundle bundle3 = (Bundle) parcelableArrayList2.get(i9);
                View viewFindViewById = this.f11542F[i8].findViewById(I("ic_ticket_seat" + i9));
                viewFindViewById.setVisibility(0);
                Q.setTrainInfo(context, interfaceC0837a, bundle, bundle3, i8, i9, viewFindViewById);
                viewFindViewById.setVisibility(0);
            }
            for (int size = parcelableArrayList2.size(); size < 9; size++) {
                this.f11542F[i8].findViewById(I("ic_ticket_seat" + size)).setVisibility(8);
            }
        }
        for (int size2 = parcelableArrayList.size(); size2 < 2; size2++) {
            this.f11540D[size2].setVisibility(8);
        }
    }

    protected void L(Context context, Bundle bundle) {
        this.f11555x.setText(bundle.getString("DEPARTURE_STATION_NAME"));
        this.f11556y.setText(bundle.getString("ARRIVAL_STATION_NAME"));
        this.f11557z.setText(bundle.getString("D_TOUR"));
        this.f11557z.setVisibility(bundle.containsKey("D_TOUR") ? 0 : 8);
        Q.setExtraInfo(context, bundle, this.f11537A);
        this.f11538B.setVisibility("Y".equals(bundle.getString("TRAIN_RUNNING_CLOSE_FLG")) ? 0 : 8);
    }

    @Override // b6.C1084a
    public void setItem(Context context, InterfaceC0837a interfaceC0837a, Bundle bundle) {
        super.setItem(context, interfaceC0837a, bundle);
        N(bundle);
        L(context, bundle);
        M(bundle);
        K(context, bundle, interfaceC0837a);
        Q.setBadgeImg(bundle, this.f11543G);
        Q.setEasyFunction(context, interfaceC0837a, bundle, this.f11545I, this.f11544H, this.f11541E[0]);
        Q.setCurrentDate(bundle, this.f11546J);
        Q.setBottomView(context, interfaceC0837a, bundle, C6634h.isDeparture(bundle.getString("DEPARTURE_DATE") + bundle.getString("DEPARTURE_TIME")), this.f11547K, this.f11548L, this.f11549M);
        Q.setSample(this.f11551O);
        Q.setDim(context, interfaceC0837a, bundle, this.f11550N);
    }

    protected void M(Bundle bundle) {
    }
}
