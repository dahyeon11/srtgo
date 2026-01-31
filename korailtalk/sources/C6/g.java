package c6;

import a6.InterfaceC0837a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import b6.C1084a;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class g extends C1084a {

    /* renamed from: A, reason: collision with root package name */
    private final TextView f11528A;

    /* renamed from: B, reason: collision with root package name */
    private final TextView f11529B;

    /* renamed from: C, reason: collision with root package name */
    private final TextView f11530C;

    /* renamed from: u, reason: collision with root package name */
    private final ImageView f11531u;

    /* renamed from: v, reason: collision with root package name */
    private final ImageView f11532v;

    /* renamed from: w, reason: collision with root package name */
    private final TextView f11533w;

    /* renamed from: x, reason: collision with root package name */
    private final TextView f11534x;

    /* renamed from: y, reason: collision with root package name */
    private final TextView f11535y;

    /* renamed from: z, reason: collision with root package name */
    private final TextView f11536z;

    public g(View view) {
        super(view);
        this.f11531u = (ImageView) view.findViewById(AbstractC5955f.iv_maas_service_title);
        this.f11532v = (ImageView) view.findViewById(AbstractC5955f.iv_maas_service_receipt);
        this.f11533w = (TextView) view.findViewById(AbstractC5955f.tv_maas_service_name);
        this.f11534x = (TextView) view.findViewById(AbstractC5955f.tv_reservation_num);
        this.f11535y = (TextView) view.findViewById(AbstractC5955f.tv_maas_service_message);
        this.f11536z = (TextView) view.findViewById(AbstractC5955f.tv_maas_service_pnr_message);
        this.f11528A = (TextView) view.findViewById(AbstractC5955f.btn_left);
        this.f11529B = (TextView) view.findViewById(AbstractC5955f.btn_middle);
        this.f11530C = (TextView) view.findViewById(AbstractC5955f.btn_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToMaasServiceReceipt(bundle.getInt("INDEX"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToMaasServiceCancel(bundle.getInt("INDEX"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToMaasServiceAddReservation(bundle.getInt("INDEX"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R(InterfaceC0837a interfaceC0837a, Bundle bundle, View view) {
        interfaceC0837a.moveToMaasServiceDetail(bundle.getInt("INDEX"));
    }

    @Override // b6.C1084a
    public void setItem(Context context, final InterfaceC0837a interfaceC0837a, final Bundle bundle) {
        super.setItem(context, interfaceC0837a, bundle);
        String string = bundle.getString("MAAS_SERVICE_DV_CD");
        t.d("maasDvCd : " + string);
        if ("503".equals(string)) {
            this.f11531u.setImageResource(AbstractC5954e.ico_ticket02);
        } else if ("406".equals(string)) {
            this.f11531u.setImageResource(AbstractC5954e.ico_ticket01);
        } else if ("604".equals(string)) {
            this.f11531u.setImageResource(AbstractC5954e.ico_ticket04);
        } else if ("509".equals(string)) {
            this.f11531u.setImageResource(AbstractC5954e.ico_ticket03);
        } else if ("505".equals(string)) {
            this.f11531u.setImageResource(AbstractC5954e.ico_car_sharing);
        } else if ("510".equals(string)) {
            this.f11531u.setImageResource(AbstractC5954e.ico_ticket02);
        } else {
            this.f11531u.setImageResource(AbstractC5954e.ico_ticket05);
        }
        this.f11533w.setText(bundle.getString("MAAS_SERVICE_NAME"));
        this.f11534x.setText(G(AbstractC5959j.product_detail_reservation_id) + ":" + bundle.getString("MAAS_RESERVATION_NUM"));
        this.f11535y.setText(bundle.getString("MAAS_MESSAGE_1"));
        if (N.isNotNull(bundle.getString("MAAS_PNR_NUM"))) {
            this.f11536z.setVisibility(0);
        } else {
            this.f11536z.setVisibility(8);
        }
        this.f11532v.setOnClickListener(new View.OnClickListener() { // from class: c6.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.O(interfaceC0837a, bundle, view);
            }
        });
        t.d("bundle.getBoolean(TicketListDefine.IS_PURCHASE_HISTORY) : " + bundle.getBoolean("IS_PURCHASE_HISTORY"));
        if (bundle.getBoolean("IS_PURCHASE_HISTORY", false)) {
            this.f11528A.setVisibility(8);
            this.f11529B.setVisibility(8);
        } else {
            this.f11528A.setVisibility(0);
            this.f11529B.setVisibility(0);
        }
        this.f11530C.setEnabled(N.isNotNull(bundle.getString("MAAS_SERVICE_DETAIL_URL")) || N.isNotNull(bundle.getString("MAAS_PNR_NUM")));
        this.f11528A.setOnClickListener(new View.OnClickListener() { // from class: c6.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.P(interfaceC0837a, bundle, view);
            }
        });
        this.f11529B.setOnClickListener(new View.OnClickListener() { // from class: c6.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.Q(interfaceC0837a, bundle, view);
            }
        });
        this.f11530C.setOnClickListener(new View.OnClickListener() { // from class: c6.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.R(interfaceC0837a, bundle, view);
            }
        });
    }
}
