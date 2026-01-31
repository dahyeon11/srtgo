package D5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.login.MemberCheckDao;
import com.korail.talk.network.dao.login.MemberCheckDao.MemberCheckRequest;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.C6630d;

/* loaded from: classes.dex */
public class a extends com.korail.talk.view.base.a implements View.OnClickListener {
    public static final String TAG = "MemberDropCheckFragment";

    /* renamed from: d0, reason: collision with root package name */
    private EditText f938d0;

    /* renamed from: e0, reason: collision with root package name */
    private EditText f939e0;

    public static a newInstance() {
        return new a();
    }

    private void w0() {
        MemberCheckDao memberCheckDao = new MemberCheckDao();
        MemberCheckDao.MemberCheckRequest memberCheckRequest = memberCheckDao.new MemberCheckRequest();
        memberCheckRequest.setCustNm(this.f938d0.getText().toString());
        memberCheckRequest.setHmpgPwd(this.f939e0.getText().toString());
        memberCheckDao.setRequest(memberCheckRequest);
        executeDao(memberCheckDao);
    }

    private void x0() {
        p0(AbstractC5955f.btn_bottom).setOnClickListener(this);
    }

    private void z0() {
        this.f938d0 = (EditText) p0(AbstractC5955f.et_id);
        this.f939e0 = (EditText) p0(AbstractC5955f.et_password);
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            z0();
            y0();
            x0();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_bottom == view.getId()) {
            w0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_member_drop_check, viewGroup, false);
    }

    @Override // com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        if (AbstractC5955f.dao_member_check == iBaseDao.getId()) {
            o0();
            replaceTransaction(AbstractC5955f.fragment_content, c.newInstance(this.f938d0.getText().toString()), c.TAG);
        }
    }

    private void y0() {
    }
}
