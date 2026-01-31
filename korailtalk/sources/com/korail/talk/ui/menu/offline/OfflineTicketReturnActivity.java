package com.korail.talk.ui.menu.offline;

import android.os.Bundle;
import com.korail.talk.network.dao.refund.RefundVerifyTicketDao;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z5.InterfaceC6646d;
import z5.ViewOnClickListenerC6645c;
import z5.ViewOnClickListenerC6647e;
import z5.h;

/* loaded from: classes.dex */
public class OfflineTicketReturnActivity extends BaseViewActivity implements InterfaceC6646d {

    /* renamed from: i */
    private ViewOnClickListenerC6645c f28399i;

    private void s0() {
        n0(false);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.offline_return_ticket_title_refund);
    }

    @Override // z5.InterfaceC6646d
    public void addOfflineReturnInputFragment() {
        ViewOnClickListenerC6645c viewOnClickListenerC6645cNewInstance = ViewOnClickListenerC6645c.newInstance();
        this.f28399i = viewOnClickListenerC6645cNewInstance;
        addTransaction(AbstractC5955f.contentContainer, viewOnClickListenerC6645cNewInstance, "OfflineReturnInputFragment");
    }

    @Override // z5.InterfaceC6646d
    public void addOfflineReturnRequestFragment(RefundVerifyTicketDao.RefundVerifyTicketResponse refundVerifyTicketResponse, String str, String str2, String str3) {
        addTransaction(AbstractC5955f.contentContainer, h.newInstance(refundVerifyTicketResponse, str, str2, str3), "OfflineReturnInputFragment");
    }

    @Override // z5.InterfaceC6646d
    public void againCallOfflineReturnInputFragment() {
        onBackPressed();
        this.f28399i.clearInput();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.offline_ticket_return_activity);
        if (C6630d.isNull(bundle)) {
            s0();
            setText();
            setOfflineReturnNoticeFragment();
        }
    }

    @Override // z5.InterfaceC6646d
    public void setOfflineReturnNoticeFragment() {
        replaceTransaction(AbstractC5955f.contentContainer, ViewOnClickListenerC6647e.newInstance(), ViewOnClickListenerC6647e.TAG);
    }
}
