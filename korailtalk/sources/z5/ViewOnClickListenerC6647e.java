package z5;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.N;

/* renamed from: z5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewOnClickListenerC6647e extends com.korail.talk.view.base.a implements View.OnClickListener {
    public static final String TAG = "OfflineReturnNoticeFragment";

    /* renamed from: d0, reason: collision with root package name */
    private InterfaceC6646d f37923d0;

    /* renamed from: e0, reason: collision with root package name */
    private TextView f37924e0;

    /* renamed from: f0, reason: collision with root package name */
    private TextView f37925f0;

    /* renamed from: g0, reason: collision with root package name */
    private TextView f37926g0;

    public static ViewOnClickListenerC6647e newInstance() {
        return new ViewOnClickListenerC6647e();
    }

    private void w0() {
        p0(AbstractC5955f.bottomBtn).setOnClickListener(this);
    }

    private void x0() {
        this.f37924e0.setText(N.applySpannable(getString(AbstractC5959j.offline_return_ticket_notice_message2_1), new ForegroundColorSpan(Color.parseColor("#f04922"))));
        this.f37924e0.append(getString(AbstractC5959j.offline_return_ticket_notice_message2_2));
        this.f37925f0.setText(N.applySpannable(getString(AbstractC5959j.offline_return_ticket_notice_message3_1), new ForegroundColorSpan(Color.parseColor("#f04922"))));
        this.f37925f0.append(getString(AbstractC5959j.offline_return_ticket_notice_message3_2));
        this.f37926g0.setText(N.applySpannable(getString(AbstractC5959j.offline_return_ticket_notice_message6_1), new ForegroundColorSpan(Color.parseColor("#f04922"))));
        this.f37926g0.append(getString(AbstractC5959j.offline_return_ticket_notice_message6_2));
    }

    private void y0() {
        this.f37924e0 = (TextView) p0(AbstractC5955f.tv_offline_ticket_msg2);
        this.f37925f0 = (TextView) p0(AbstractC5955f.tv_offline_ticket_msg3);
        this.f37926g0 = (TextView) p0(AbstractC5955f.tv_offline_ticket_msg6);
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            y0();
            x0();
            w0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f37923d0 = (InterfaceC6646d) context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        t0(view);
        if (AbstractC5955f.bottomBtn == view.getId()) {
            this.f37923d0.addOfflineReturnInputFragment();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.offline_return_notice_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        v0(getString(AbstractC5959j.offline_return_ticket_title_refund));
    }
}
