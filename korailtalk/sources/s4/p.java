package s4;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.H;

/* loaded from: classes.dex */
public class p extends C6219c implements View.OnClickListener {

    /* renamed from: q, reason: collision with root package name */
    private CommonCodeDao.LostArticle f36268q;

    public p(Context context) {
        super(context);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void f() {
        g(AbstractC5957h.dialog_lost_article);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void h() {
        super.h();
        this.f36268q = (CommonCodeDao.LostArticle) z4.q.fromJson(H.getString(getContext(), "LOST_ARTICLE"), CommonCodeDao.LostArticle.class);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void i() {
        super.i();
        a(AbstractC5955f.btn_lost_article_phone_call).setOnClickListener(this);
        a(AbstractC5955f.btn_lost_article_contact).setOnClickListener(this);
        a(AbstractC5955f.btn_lost_article_web).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.btn_lost_article_phone_call == id) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.DIAL");
            intent.setData(Uri.parse(c(AbstractC5959j.navigation_call_center_number)));
            l(intent);
        } else if (AbstractC5955f.btn_lost_article_contact == id) {
            Bundle bundle = new Bundle();
            bundle.putString("WEB_POST_URL", this.f36268q.getLinkUrl());
            Intent intent2 = new Intent(getContext(), (Class<?>) IntegrationWebViewActivity.class);
            intent2.putExtras(bundle);
            l(intent2);
        } else if (AbstractC5955f.btn_lost_article_web == id) {
            C6630d.moveToOutSideBrowser(getContext(), r4.g.LOST_112_URL);
        }
        dismissDialog();
    }
}
