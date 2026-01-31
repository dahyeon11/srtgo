package s4;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.C6630d;
import z4.N;

/* renamed from: s4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6222f extends C6219c {

    /* renamed from: q, reason: collision with root package name */
    private b f36207q;

    /* renamed from: r, reason: collision with root package name */
    private EditText[] f36208r;

    /* renamed from: s4.f$b */
    private class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private c f36209a;

        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            int i8 = 100;
            if (AbstractC5955f.btn_dialog_negative != id) {
                if (AbstractC5955f.btn_dialog_neutral == id) {
                    i8 = 101;
                } else if (AbstractC5955f.btn_dialog_positive == id) {
                    i8 = 102;
                }
            }
            int i9 = i8;
            C6222f.this.dismissDialog();
            if (C6630d.isNotNull(this.f36209a)) {
                this.f36209a.onClick(C6222f.this.b(), i9, N.getText(C6222f.this.f36208r[0]), N.getText(C6222f.this.f36208r[1]), N.getText(C6222f.this.f36208r[2]), N.getText(C6222f.this.f36208r[3]));
            }
        }

        public void setOnClickListener(c cVar) {
            this.f36209a = cVar;
        }
    }

    /* renamed from: s4.f$c */
    public interface c {
        void onClick(DialogInterface dialogInterface, int i8, String str, String str2, String str3, String str4);
    }

    public C6222f(Context context) {
        super(context);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void f() {
        g(AbstractC5957h.dialog_delay_discount_coupon_input);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void h() {
        this.f36207q = new b();
        this.f36208r = new EditText[4];
    }

    @Override // s4.C6219c, t4.C6364a
    protected void i() {
        this.f36177n.setOnClickListener(this.f36207q);
        this.f36178o.setOnClickListener(this.f36207q);
        this.f36179p.setOnClickListener(this.f36207q);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void k() {
        super.k();
        this.f36208r[0] = (EditText) a(AbstractC5955f.couponNoEdit0);
        this.f36208r[1] = (EditText) a(AbstractC5955f.couponNoEdit1);
        this.f36208r[2] = (EditText) a(AbstractC5955f.couponNoEdit2);
        this.f36208r[3] = (EditText) a(AbstractC5955f.couponNoEdit3);
    }

    public C6219c setDiscountButtonListener(c cVar) {
        this.f36207q.setOnClickListener(cVar);
        this.f36177n.setOnClickListener(this.f36207q);
        this.f36178o.setOnClickListener(this.f36207q);
        this.f36179p.setOnClickListener(this.f36207q);
        return this;
    }
}
