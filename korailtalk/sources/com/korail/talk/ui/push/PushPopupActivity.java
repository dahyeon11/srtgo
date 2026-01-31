package com.korail.talk.ui.push;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.h2osystech.smartalimi.aidllib.MSGVo;
import com.korail.talk.view.base.BaseActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import org.json.JSONException;
import org.json.JSONObject;
import z4.C6630d;
import z4.C6637k;
import z4.C6641o;
import z4.N;
import z4.t;
import z4.z;

/* loaded from: classes.dex */
public class PushPopupActivity extends BaseActivity {

    /* renamed from: e, reason: collision with root package name */
    private MSGVo f28590e;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            Intent pushIntent = C6641o.getPushIntent(getApplicationContext(), Integer.parseInt(this.f28590e.getTaskName()));
            String url = this.f28590e.getUrl();
            if (C6630d.isNull(url) || url.isEmpty()) {
                pushIntent.putExtra("msg_vo", this.f28590e);
                startActivity(pushIntent);
            } else {
                try {
                    if (new JSONObject(this.f28590e.getParam()).optString("isExternalBrowser").equals("Y")) {
                        C6630d.moveToOutSideBrowser(getApplicationContext(), url);
                    } else {
                        pushIntent.setData(Uri.parse(getString(AbstractC5959j.navigation_web_view)));
                        pushIntent.putExtra("WEB_POST_URL", z.getWebHost() + url);
                        startActivity(pushIntent);
                    }
                } catch (JSONException e8) {
                    t.e(e8.getMessage());
                }
            }
        }
        finish();
    }

    private void i0() {
        this.f28590e = (MSGVo) getIntent().getParcelableExtra("msg_vo");
    }

    private void j0() {
        C6637k.getCDialog(K(), 1002, 0, this.f28590e.getTitle()).setContent(this.f28590e.getContent()).setButtonNames(N.getStringArray(getString(AbstractC5959j.common_cancel), getString(AbstractC5959j.common_confirm))).setButtonListener(new DialogInterface.OnClickListener() { // from class: L5.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f3066a.h0(dialogInterface, i8);
            }
        }).showDialog();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_empty);
        i0();
        if (C6630d.isNull(this.f28590e)) {
            finish();
        } else {
            j0();
        }
    }
}
