package s4;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import s4.C6219c;

/* loaded from: classes.dex */
public class m extends C6219c {

    /* renamed from: q, reason: collision with root package name */
    private TextView f36253q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f36254r;

    /* renamed from: s, reason: collision with root package name */
    private ImageButton f36255s;

    /* renamed from: t, reason: collision with root package name */
    private b f36256t;

    private class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private DialogInterface.OnClickListener f36257a;

        /* renamed from: b, reason: collision with root package name */
        private C6219c.InterfaceC0421c f36258b;

        /* renamed from: c, reason: collision with root package name */
        private C6219c.d f36259c;

        private b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onClick(android.view.View r5) {
            /*
                r4 = this;
                int r5 = r5.getId()
                int r0 = n4.AbstractC5955f.btn_dialog_negative
                r1 = 102(0x66, float:1.43E-43)
                r2 = 100
                if (r0 != r5) goto L1b
                s4.m r0 = s4.m.this
                int r0 = r0.f36169f
                r3 = 1001(0x3e9, float:1.403E-42)
                if (r3 == r0) goto L26
                r3 = 1004(0x3ec, float:1.407E-42)
                if (r3 != r0) goto L19
                goto L26
            L19:
                r1 = r2
                goto L26
            L1b:
                int r0 = n4.AbstractC5955f.btn_dialog_neutral
                if (r0 != r5) goto L22
                r1 = 101(0x65, float:1.42E-43)
                goto L26
            L22:
                int r0 = n4.AbstractC5955f.btn_dialog_positive
                if (r0 != r5) goto L19
            L26:
                int r0 = n4.AbstractC5955f.btn_info
                if (r0 != r5) goto L2d
                r1 = 200(0xc8, float:2.8E-43)
                goto L32
            L2d:
                s4.m r5 = s4.m.this
                r5.dismissDialog()
            L32:
                android.content.DialogInterface$OnClickListener r5 = r4.f36257a
                boolean r5 = z4.C6630d.isNotNull(r5)
                if (r5 == 0) goto L46
                android.content.DialogInterface$OnClickListener r5 = r4.f36257a
                s4.m r0 = s4.m.this
                android.content.DialogInterface r0 = s4.m.s(r0)
                r5.onClick(r0, r1)
                goto L83
            L46:
                s4.c$c r5 = r4.f36258b
                boolean r5 = z4.C6630d.isNotNull(r5)
                if (r5 == 0) goto L62
                s4.c$c r5 = r4.f36258b
                s4.m r0 = s4.m.this
                android.content.DialogInterface r0 = s4.m.t(r0)
                s4.m r2 = s4.m.this
                android.widget.CheckBox r2 = r2.f36176m
                boolean r2 = r2.isChecked()
                r5.onClick(r0, r1, r2)
                goto L83
            L62:
                s4.c$d r5 = r4.f36259c
                boolean r5 = z4.C6630d.isNotNull(r5)
                if (r5 == 0) goto L83
                s4.c$d r5 = r4.f36259c
                s4.m r0 = s4.m.this
                android.content.DialogInterface r0 = s4.m.u(r0)
                s4.m r2 = s4.m.this
                android.widget.CheckBox r2 = r2.f36176m
                boolean r2 = r2.isChecked()
                s4.m r3 = s4.m.this
                int r3 = r3.q()
                r5.onClick(r0, r1, r2, r3)
            L83:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s4.m.b.onClick(android.view.View):void");
        }

        public void setOnClickListener(DialogInterface.OnClickListener onClickListener) {
            this.f36257a = onClickListener;
        }

        public void setOnClickListener(C6219c.InterfaceC0421c interfaceC0421c) {
            this.f36258b = interfaceC0421c;
        }

        public void setOnClickListener(C6219c.d dVar) {
            this.f36259c = dVar;
        }
    }

    public m(Context context) {
        super(context);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void f() {
        g(AbstractC5957h.dialog_custom_info);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void h() {
        this.f36256t = new b();
    }

    @Override // s4.C6219c, t4.C6364a
    protected void k() {
        super.k();
        this.f36253q = (TextView) a(AbstractC5955f.tv_info_title);
        this.f36254r = (TextView) a(AbstractC5955f.tv_info_content);
        this.f36255s = (ImageButton) a(AbstractC5955f.btn_info);
        this.f36253q.setVisibility(8);
        this.f36254r.setVisibility(8);
    }

    public void setInfoContent(String str, String str2) {
        this.f36253q.setVisibility(0);
        this.f36254r.setVisibility(0);
        this.f36253q.setText(str);
        this.f36254r.setText(str2);
    }

    @Override // s4.C6219c
    public m setButtonListener(DialogInterface.OnClickListener onClickListener) {
        this.f36256t.setOnClickListener(onClickListener);
        this.f36255s.setOnClickListener(this.f36256t);
        this.f36177n.setOnClickListener(this.f36256t);
        this.f36178o.setOnClickListener(this.f36256t);
        this.f36179p.setOnClickListener(this.f36256t);
        return this;
    }
}
