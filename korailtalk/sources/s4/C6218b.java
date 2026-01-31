package s4;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.C6630d;
import z4.N;

/* renamed from: s4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6218b extends C6219c {

    /* renamed from: q, reason: collision with root package name */
    private ViewOnClickListenerC0420b f36165q;

    /* renamed from: r, reason: collision with root package name */
    private EditText f36166r;

    /* renamed from: s4.b$b, reason: collision with other inner class name */
    private class ViewOnClickListenerC0420b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private c f36167a;

        private ViewOnClickListenerC0420b() {
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
            C6218b.this.dismissDialog();
            if (C6630d.isNotNull(this.f36167a)) {
                this.f36167a.onClick(C6218b.this.b(), i8, N.getText(C6218b.this.f36166r));
            }
        }

        public void setOnClickListener(c cVar) {
            this.f36167a = cVar;
        }
    }

    /* renamed from: s4.b$c */
    public interface c {
        void onClick(DialogInterface dialogInterface, int i8, String str);
    }

    public C6218b(Context context) {
        super(context);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void f() {
        g(AbstractC5957h.dialog_business_trip_coupon_input);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void h() {
        this.f36165q = new ViewOnClickListenerC0420b();
    }

    @Override // s4.C6219c, t4.C6364a
    protected void i() {
        this.f36177n.setOnClickListener(this.f36165q);
        this.f36178o.setOnClickListener(this.f36165q);
        this.f36179p.setOnClickListener(this.f36165q);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void k() {
        super.k();
        this.f36166r = (EditText) a(AbstractC5955f.couponNoEdit);
    }

    public C6219c setDiscountButtonListener(c cVar) {
        this.f36165q.setOnClickListener(cVar);
        this.f36179p.setOnClickListener(this.f36165q);
        this.f36178o.setOnClickListener(this.f36165q);
        this.f36177n.setOnClickListener(this.f36165q);
        return this;
    }
}
