package s4;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.C6630d;
import z4.N;

/* renamed from: s4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6223g extends C6219c {

    /* renamed from: q, reason: collision with root package name */
    private b f36211q;

    /* renamed from: r, reason: collision with root package name */
    private EditText f36212r;

    /* renamed from: s, reason: collision with root package name */
    private EditText f36213s;

    /* renamed from: s4.g$b */
    private class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private c f36215a;

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
            C6223g.this.dismissDialog();
            if (C6630d.isNotNull(this.f36215a)) {
                this.f36215a.onClick(C6223g.this.b(), i8, N.getText(C6223g.this.f36212r), N.getText(C6223g.this.f36213s));
            }
        }

        public void setOnClickListener(c cVar) {
            this.f36215a = cVar;
        }

        /* synthetic */ b(C6223g c6223g, a aVar) {
            this();
        }
    }

    /* renamed from: s4.g$c */
    public interface c {
        void onClick(DialogInterface dialogInterface, int i8, String str, String str2);
    }

    public C6223g(Context context) {
        super(context);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void f() {
        g(AbstractC5957h.dialog_discount_coupon_input);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void h() {
        this.f36211q = new b(this, null);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void i() {
        this.f36177n.setOnClickListener(this.f36211q);
        this.f36178o.setOnClickListener(this.f36211q);
        this.f36179p.setOnClickListener(this.f36211q);
        this.f36213s.addTextChangedListener(new a());
    }

    @Override // s4.C6219c, t4.C6364a
    protected void k() {
        super.k();
        this.f36212r = (EditText) a(AbstractC5955f.couponNoEdit);
        this.f36213s = (EditText) a(AbstractC5955f.couponPwdEdit);
        this.f36179p.setEnabled(false);
    }

    public C6219c setDiscountButtonListener(c cVar) {
        this.f36211q.setOnClickListener(cVar);
        this.f36177n.setOnClickListener(this.f36211q);
        this.f36178o.setOnClickListener(this.f36211q);
        this.f36179p.setOnClickListener(this.f36211q);
        return this;
    }

    /* renamed from: s4.g$a */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() > 0) {
                C6223g.this.f36179p.setEnabled(true);
            } else {
                C6223g.this.f36179p.setEnabled(false);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }
}
