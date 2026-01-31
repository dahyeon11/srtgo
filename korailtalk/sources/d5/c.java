package D5;

import I4.h;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.login.LogoutDao;
import com.korail.talk.network.dao.login.MemberDropDao;
import com.korail.talk.network.dao.login.MemberDropDao.MemberDropRequest;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6637k;

/* loaded from: classes.dex */
public class c extends com.korail.talk.view.base.a implements View.OnClickListener {
    public static final String TAG = "MemberDropFragment";

    /* renamed from: e0, reason: collision with root package name */
    private static String f941e0;

    /* renamed from: d0, reason: collision with root package name */
    private EditText f942d0;

    private void B0() {
        p0(AbstractC5955f.btn_bottom).setOnClickListener(this);
        p0(AbstractC5955f.btn_bottom_cancel).setOnClickListener(this);
    }

    private void C0() {
        String str = "(" + h.getInstance().getMemberNum() + ")";
        ((TextView) p0(AbstractC5955f.tv_detail)).setText(getString(AbstractC5959j.member_drop_detail, f941e0 + str));
    }

    private void D0() {
        this.f942d0 = (EditText) p0(AbstractC5955f.et_id);
    }

    public static c newInstance(String str) {
        f941e0 = str;
        return new c();
    }

    private void x0() {
        executeDao(new LogoutDao());
    }

    private void y0() {
        MemberDropDao memberDropDao = new MemberDropDao();
        memberDropDao.setRequest(memberDropDao.new MemberDropRequest());
        executeDao(memberDropDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(DialogInterface dialogInterface, int i8) {
        x0();
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            A0();
            D0();
            C0();
            B0();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.btn_bottom == id) {
            y0();
        } else if (AbstractC5955f.btn_bottom_cancel == id) {
            q0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_member_drop, viewGroup, false);
    }

    @Override // com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_member_drop == iBaseDao.getId()) {
            C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(iBaseDao.getResponse().gethMsgTxt()).setButtonListener(new DialogInterface.OnClickListener() { // from class: D5.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f940a.z0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    private void A0() {
    }
}
