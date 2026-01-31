package com.korail.talk.ui.ticket.ticketReturn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.view.CEditText;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class TicketReturnPasswordActivity extends BaseViewActivity implements View.OnClickListener {

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f29229i;

    /* renamed from: j, reason: collision with root package name */
    private CEditText f29230j;

    private void s0() {
        this.f29229i = (ArrayList) M(getIntent(), "TICKET_RESPONSE");
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_ticket_return_pw);
    }

    private void t0() {
        findViewById(AbstractC5955f.returnBtn).setOnClickListener(this);
        findViewById(AbstractC5955f.cancelBtn).setOnClickListener(this);
    }

    private void u0() {
        m0();
        this.f29230j = (CEditText) findViewById(AbstractC5955f.pwdEdit);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        O(view);
        int id = view.getId();
        if (AbstractC5955f.returnBtn != id) {
            if (AbstractC5955f.cancelBtn == id) {
                finish();
                return;
            } else {
                super.onClick(view);
                return;
            }
        }
        String text = N.getText(this.f29230j);
        String string = text.isEmpty() ? getString(AbstractC5959j.ticket_delivery_input_input_pwd) : null;
        Iterator it = this.f29229i.iterator();
        while (true) {
            if (!it.hasNext()) {
                string = getString(AbstractC5959j.nonmember_check_password_equal);
                break;
            } else if (text.equals(((TicketDetailDao.TicketDetailResponse) it.next()).getH_orgtk_ret_pwd())) {
                break;
            }
        }
        if (!N.isNull(string)) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(string).showDialog();
            return;
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) TicketReturnActivity.class);
        intent.putExtra("TICKET_RESPONSE", this.f29229i);
        startActivityForResult(intent, 107);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.ticket_return_passwd_activity);
        if (C6630d.isNull(bundle)) {
            s0();
            u0();
            setText();
            t0();
        }
    }
}
