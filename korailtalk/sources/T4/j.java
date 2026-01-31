package T4;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import n4.AbstractC5953d;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6550j;
import z4.C6630d;
import z4.N;

/* loaded from: classes.dex */
public class j extends C6550j implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    private boolean f4911f;

    /* renamed from: g, reason: collision with root package name */
    private a f4912g;

    /* renamed from: h, reason: collision with root package name */
    private String f4913h;

    /* renamed from: i, reason: collision with root package name */
    private String f4914i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f4915j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f4916k;

    /* renamed from: l, reason: collision with root package name */
    private Button f4917l;

    public interface a {
        void requestAddPassengerCertification();
    }

    public j(Context context) {
        super(context);
        g();
    }

    private void g() {
        h();
        j();
        setText();
        i();
    }

    private void i() {
        this.f4917l.setOnClickListener(this);
    }

    private void j() {
        View.inflate(getContext(), AbstractC5957h.view_add_passenger, this);
        this.f4915j = (TextView) findViewById(AbstractC5955f.tv_add_passenger_base_user);
        this.f4916k = (TextView) findViewById(AbstractC5955f.tv_add_passenger_add_user);
        this.f4917l = (Button) findViewById(AbstractC5955f.btn_add_passenger_certification);
    }

    public String getAddUserCustomerNo() {
        return this.f4914i;
    }

    public String getAddUserName() {
        return N.getText(this.f4916k);
    }

    public String getAddUserPhoneNumber() {
        return this.f4913h;
    }

    public boolean isCertification() {
        return this.f4911f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_add_passenger_certification == view.getId() && C6630d.isNotNull(this.f4912g)) {
            this.f4912g.requestAddPassengerCertification();
        }
    }

    public void setAddUserData(String str, String str2, String str3) {
        this.f4911f = true;
        this.f4914i = str;
        this.f4913h = str3;
        this.f4916k.setText(N.applySpannable(str2, new ForegroundColorSpan(getResources().getColor(AbstractC5953d.brownish_grey))));
        this.f4917l.setText(b(AbstractC5959j.multi_n_card_modify_user));
    }

    public void setCertification(a aVar) {
        this.f4912g = aVar;
    }

    public void setText() {
        this.f4915j.setText(I4.h.getInstance().getMemberName());
    }

    private void h() {
    }
}
