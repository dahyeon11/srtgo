package com.korail.talk.test;

import A6.g;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.korail.talk.view.base.BaseActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import u4.e;
import z4.t;

/* loaded from: classes.dex */
public class NetfunnelTestActivity extends BaseActivity implements View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    private final int f27562e = 100;

    class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f27563a;

        a(e eVar) {
            this.f27563a = eVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                g.d dVar = g.d.toEnum(message.what);
                t.e("Netfunnel.EvnetCode = " + dVar);
                if (!dVar.isContinue() && !dVar.isError()) {
                    this.f27563a.dismissDialog();
                    g.END();
                }
            } catch (NullPointerException e8) {
                t.e(e8.getMessage());
            } catch (Exception e9) {
                t.e(e9.getMessage());
            }
        }
    }

    private void g0() {
        findViewById(AbstractC5955f.btn_netfunnel_test).setOnClickListener(this);
    }

    private void h0() {
        for (int i8 = 0; i8 < 100; i8++) {
            e eVar = e.getInstance(this);
            eVar.showDialog();
            g.BEGIN(r4.g.NETFUNNEL_SERVER_ID, r4.g.NETFUNNEL_ACTION_ID, eVar, new a(eVar));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_netfunnel_test == view.getId()) {
            h0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_netfunnel_test);
        g0();
    }
}
