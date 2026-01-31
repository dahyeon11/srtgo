package t6;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.korail.talk.network.dao.cust.MchdDcntTgtDao;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import y6.C6542b;

/* renamed from: t6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6366a extends C6542b {

    /* renamed from: a, reason: collision with root package name */
    private CheckBox f36945a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f36946b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f36947c;

    public C6366a(Context context) {
        super(context);
        g();
    }

    private void g() {
        View.inflate(getContext(), AbstractC5957h.item_view_payment_certication, this);
        h();
    }

    private void h() {
        this.f36945a = (CheckBox) findViewById(AbstractC5955f.cb_item_view_payment_certification);
        this.f36946b = (TextView) findViewById(AbstractC5955f.tv_item_view_payment_certification_name);
        this.f36947c = (TextView) findViewById(AbstractC5955f.tv_item_view_payment_certification_info);
        this.f36945a.setClickable(false);
    }

    public void setCertificationData(MchdDcntTgtDao.Fmly fmly) {
        this.f36946b.setText(fmly.getCustFmlyNm());
        this.f36947c.setText(fmly.getPsgTpNm() + " | " + fmly.getBtdt());
    }

    public C6366a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
