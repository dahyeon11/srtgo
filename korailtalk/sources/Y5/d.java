package Y5;

import I4.h;
import Y5.b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.C6630d;

/* loaded from: classes.dex */
public class d extends b {
    public static final String TAG = "QRCodeMemberCardFragment";

    /* renamed from: g0, reason: collision with root package name */
    private ImageView f5651g0;

    private void C0() {
        this.f5651g0 = (ImageView) p0(AbstractC5955f.iv_member_card_qr_code);
    }

    public static Fragment newInstance() {
        return new d();
    }

    @Override // Y5.b, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // Y5.b, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            C0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_qr_code_member_card, viewGroup, false);
    }

    @Override // Y5.b, Y5.c
    public void setBitmap() {
        new b.AsyncTaskC0094b(this.f5651g0, h.getInstance().getMemberNum()).execute(new Void[0]);
    }
}
