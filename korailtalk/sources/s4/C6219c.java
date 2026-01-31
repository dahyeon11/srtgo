package s4;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import n4.AbstractC5953d;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import t4.C6364a;
import z4.C6630d;
import z4.N;

/* renamed from: s4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6219c extends C6364a implements CompoundButton.OnCheckedChangeListener {
    public static final int CLICK_INFO = 200;
    public static final int CLICK_NEGATIVE = 100;
    public static final int CLICK_NEUTRAL = 101;
    public static final int CLICK_POSITIVE = 102;
    public static final int C_TYPE_1 = 1004;
    public static final int C_TYPE_2 = 1005;
    public static final int C_TYPE_21 = 1051;
    public static final int THEME_BLUE = 0;
    public static final int THEME_PURPLE = 1;
    public static final int TYPE_1 = 1001;
    public static final int TYPE_2 = 1002;
    public static final int TYPE_3 = 1003;

    /* renamed from: f, reason: collision with root package name */
    protected int f36169f;

    /* renamed from: g, reason: collision with root package name */
    private b f36170g;

    /* renamed from: h, reason: collision with root package name */
    protected View f36171h;

    /* renamed from: i, reason: collision with root package name */
    protected View f36172i;

    /* renamed from: j, reason: collision with root package name */
    protected View f36173j;

    /* renamed from: k, reason: collision with root package name */
    protected TextView f36174k;

    /* renamed from: l, reason: collision with root package name */
    protected TextView f36175l;

    /* renamed from: m, reason: collision with root package name */
    protected CheckBox f36176m;

    /* renamed from: n, reason: collision with root package name */
    protected Button f36177n;

    /* renamed from: o, reason: collision with root package name */
    protected Button f36178o;

    /* renamed from: p, reason: collision with root package name */
    protected Button f36179p;

    /* renamed from: s4.c$b */
    private class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private DialogInterface.OnClickListener f36180a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC0421c f36181b;

        /* renamed from: c, reason: collision with root package name */
        private d f36182c;

        /* renamed from: d, reason: collision with root package name */
        private e f36183d;

        private b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onClick(android.view.View r10) {
            /*
                r9 = this;
                int r10 = r10.getId()
                int r0 = n4.AbstractC5955f.btn_dialog_negative
                r1 = 102(0x66, float:1.43E-43)
                r2 = 100
                if (r0 != r10) goto L1d
                s4.c r10 = s4.C6219c.this
                int r10 = r10.f36169f
                r0 = 1001(0x3e9, float:1.403E-42)
                if (r0 == r10) goto L1b
                r0 = 1004(0x3ec, float:1.407E-42)
                if (r0 != r10) goto L19
                goto L1b
            L19:
                r5 = r2
                goto L29
            L1b:
                r5 = r1
                goto L29
            L1d:
                int r0 = n4.AbstractC5955f.btn_dialog_neutral
                if (r0 != r10) goto L24
                r1 = 101(0x65, float:1.42E-43)
                goto L1b
            L24:
                int r0 = n4.AbstractC5955f.btn_dialog_positive
                if (r0 != r10) goto L19
                goto L1b
            L29:
                s4.c r10 = s4.C6219c.this
                r10.dismissDialog()
                android.content.DialogInterface$OnClickListener r10 = r9.f36180a
                boolean r10 = z4.C6630d.isNotNull(r10)
                if (r10 == 0) goto L42
                android.content.DialogInterface$OnClickListener r10 = r9.f36180a
                s4.c r0 = s4.C6219c.this
                android.content.DialogInterface r0 = s4.C6219c.m(r0)
                r10.onClick(r0, r5)
                goto La7
            L42:
                s4.c$c r10 = r9.f36181b
                boolean r10 = z4.C6630d.isNotNull(r10)
                if (r10 == 0) goto L5e
                s4.c$c r10 = r9.f36181b
                s4.c r0 = s4.C6219c.this
                android.content.DialogInterface r0 = s4.C6219c.n(r0)
                s4.c r1 = s4.C6219c.this
                android.widget.CheckBox r1 = r1.f36176m
                boolean r1 = r1.isChecked()
                r10.onClick(r0, r5, r1)
                goto La7
            L5e:
                s4.c$d r10 = r9.f36182c
                boolean r10 = z4.C6630d.isNotNull(r10)
                if (r10 == 0) goto L80
                s4.c$d r10 = r9.f36182c
                s4.c r0 = s4.C6219c.this
                android.content.DialogInterface r0 = s4.C6219c.o(r0)
                s4.c r1 = s4.C6219c.this
                android.widget.CheckBox r1 = r1.f36176m
                boolean r1 = r1.isChecked()
                s4.c r2 = s4.C6219c.this
                int r2 = r2.q()
                r10.onClick(r0, r5, r1, r2)
                goto La7
            L80:
                s4.c$e r10 = r9.f36183d
                boolean r10 = z4.C6630d.isNotNull(r10)
                if (r10 == 0) goto La7
                s4.c$e r3 = r9.f36183d
                s4.c r10 = s4.C6219c.this
                android.content.DialogInterface r4 = s4.C6219c.p(r10)
                s4.c r10 = s4.C6219c.this
                android.widget.CheckBox r10 = r10.f36176m
                boolean r6 = r10.isChecked()
                s4.c r10 = s4.C6219c.this
                int r7 = r10.q()
                s4.c r10 = s4.C6219c.this
                java.lang.String r8 = r10.r()
                r3.onClick(r4, r5, r6, r7, r8)
            La7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s4.C6219c.b.onClick(android.view.View):void");
        }

        public void setOnClickListener(DialogInterface.OnClickListener onClickListener) {
            this.f36180a = onClickListener;
        }

        public void setOnClickListener(InterfaceC0421c interfaceC0421c) {
            this.f36181b = interfaceC0421c;
        }

        public void setOnClickListener(d dVar) {
            this.f36182c = dVar;
        }

        public void setOnClickListener(e eVar) {
            this.f36183d = eVar;
        }
    }

    /* renamed from: s4.c$c, reason: collision with other inner class name */
    public interface InterfaceC0421c {
        void onClick(DialogInterface dialogInterface, int i8, boolean z8);
    }

    /* renamed from: s4.c$d */
    public interface d {
        void onClick(DialogInterface dialogInterface, int i8, boolean z8, int i9);
    }

    /* renamed from: s4.c$e */
    public interface e {
        void onClick(DialogInterface dialogInterface, int i8, boolean z8, int i9, String str);
    }

    public C6219c(Context context) {
        super(context);
    }

    @Override // t4.C6364a
    protected void f() {
        g(AbstractC5957h.dialog_custom);
    }

    @Override // t4.C6364a
    protected void h() {
        this.f36170g = new b();
    }

    @Override // t4.C6364a
    protected void i() {
        if (C6630d.isNotNull(this.f36176m)) {
            this.f36176m.setOnCheckedChangeListener(this);
        }
        this.f36177n.setOnClickListener(this.f36170g);
        this.f36178o.setOnClickListener(this.f36170g);
        this.f36179p.setOnClickListener(this.f36170g);
    }

    @Override // t4.C6364a
    protected void k() {
        this.f36174k = (TextView) a(AbstractC5955f.tv_dialog_title);
        this.f36171h = a(AbstractC5955f.v_dialog_title_divider);
        this.f36175l = (TextView) a(AbstractC5955f.tv_dialog_content);
        this.f36176m = (CheckBox) a(AbstractC5955f.cb_dialog);
        this.f36177n = (Button) a(AbstractC5955f.btn_dialog_negative);
        this.f36172i = a(AbstractC5955f.v_dialog_neutral_divider);
        this.f36178o = (Button) a(AbstractC5955f.btn_dialog_neutral);
        this.f36173j = a(AbstractC5955f.v_dialog_positive_divider);
        this.f36179p = (Button) a(AbstractC5955f.btn_dialog_positive);
        if (C6630d.isNotNull(this.f36175l)) {
            this.f36175l.setVisibility(8);
        }
        if (C6630d.isNotNull(this.f36176m)) {
            this.f36176m.setVisibility(8);
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
        int i8 = this.f36169f;
        if (1004 == i8) {
            this.f36177n.setEnabled(z8);
        } else if (1005 == i8) {
            this.f36179p.setEnabled(z8);
        }
    }

    protected int q() {
        return -1;
    }

    protected String r() {
        return null;
    }

    public C6219c setButtonListener(DialogInterface.OnClickListener onClickListener) {
        this.f36170g.setOnClickListener(onClickListener);
        this.f36177n.setOnClickListener(this.f36170g);
        this.f36178o.setOnClickListener(this.f36170g);
        this.f36179p.setOnClickListener(this.f36170g);
        return this;
    }

    public C6219c setButtonNames(String[] strArr) {
        if (C6630d.isNotNull(strArr)) {
            if (1 <= strArr.length) {
                this.f36177n.setText(strArr[0]);
            }
            if (2 <= strArr.length) {
                this.f36179p.setText(strArr[1]);
            }
            if (3 <= strArr.length) {
                this.f36178o.setText(strArr[2]);
            }
        }
        return this;
    }

    public C6219c setButtonTextLetterCase(boolean z8) {
        this.f36177n.setAllCaps(z8);
        this.f36179p.setAllCaps(z8);
        this.f36178o.setAllCaps(z8);
        return this;
    }

    public C6219c setCheckBoxMessage(String str) {
        if (N.isNotNull(str)) {
            this.f36176m.setText(str);
            this.f36176m.setVisibility(0);
        }
        return this;
    }

    public C6219c setContent(Object... objArr) {
        for (Object obj : objArr) {
            if (obj instanceof String) {
                this.f36175l.append((String) obj);
            } else if (obj instanceof SpannableStringBuilder) {
                this.f36175l.append((SpannableStringBuilder) obj);
                this.f36175l.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        this.f36175l.setVisibility(0);
        return this;
    }

    public C6219c setPositiveButtonText(String str) {
        this.f36179p.setText(str);
        return this;
    }

    public void setTheme(int i8) {
        if (C6630d.isNotNull(this.f36174k)) {
            this.f36174k.setTextColor(i8 == 0 ? -16303262 : -11586432);
        }
        if (C6630d.isNotNull(this.f36171h)) {
            this.f36171h.setBackgroundColor(i8 == 0 ? 855664307 : -2697493);
        }
        this.f36177n.setTextColor(androidx.core.content.a.getColorStateList(getContext(), i8 == 0 ? AbstractC5953d.selector_btn_text_blue : AbstractC5953d.selector_btn_text_purple));
        this.f36177n.setBackgroundResource(i8 == 0 ? AbstractC5954e.selector_btn_blue : AbstractC5954e.selector_btn_purple);
        this.f36173j.setBackgroundColor(-4800054);
        this.f36178o.setTextColor(androidx.core.content.a.getColorStateList(getContext(), i8 == 0 ? AbstractC5953d.selector_btn_text_blue : AbstractC5953d.selector_btn_text_purple));
        this.f36178o.setBackgroundResource(i8 == 0 ? AbstractC5954e.selector_btn_blue : AbstractC5954e.selector_btn_purple);
        this.f36172i.setBackgroundColor(-4800054);
        this.f36179p.setTextColor(androidx.core.content.a.getColorStateList(getContext(), i8 == 0 ? AbstractC5953d.selector_btn_text_blue : AbstractC5953d.selector_btn_text_purple));
        this.f36179p.setBackgroundResource(i8 == 0 ? AbstractC5954e.selector_btn_blue : AbstractC5954e.selector_btn_purple);
    }

    public void setTitle(String str) {
        if (C6630d.isNotNull(this.f36174k)) {
            this.f36174k.setText(str);
        }
    }

    public void setType(int i8) {
        this.f36169f = i8;
        if (1001 == i8 || 1004 == i8) {
            this.f36172i.setVisibility(8);
            this.f36178o.setVisibility(8);
            this.f36173j.setVisibility(8);
            this.f36179p.setVisibility(8);
            this.f36177n.setText(c(AbstractC5959j.common_confirm));
            if (1004 == i8) {
                this.f36177n.setEnabled(false);
                return;
            }
            return;
        }
        if (1002 == i8 || 1005 == i8 || 1051 == i8) {
            this.f36178o.setVisibility(8);
            this.f36172i.setVisibility(8);
            this.f36177n.setText(c(AbstractC5959j.common_no));
            this.f36179p.setText(c(AbstractC5959j.common_yes));
            if (1005 == i8) {
                this.f36179p.setEnabled(false);
            }
        }
    }

    public C6219c(Context context, int i8) {
        super(context, i8);
    }

    public C6219c setButtonListener(InterfaceC0421c interfaceC0421c) {
        this.f36170g.setOnClickListener(interfaceC0421c);
        this.f36177n.setOnClickListener(this.f36170g);
        this.f36178o.setOnClickListener(this.f36170g);
        this.f36179p.setOnClickListener(this.f36170g);
        return this;
    }

    public C6219c setButtonListener(d dVar) {
        this.f36170g.setOnClickListener(dVar);
        this.f36177n.setOnClickListener(this.f36170g);
        this.f36178o.setOnClickListener(this.f36170g);
        this.f36179p.setOnClickListener(this.f36170g);
        return this;
    }

    public C6219c setButtonListener(e eVar) {
        this.f36170g.setOnClickListener(eVar);
        this.f36177n.setOnClickListener(this.f36170g);
        this.f36178o.setOnClickListener(this.f36170g);
        this.f36179p.setOnClickListener(this.f36170g);
        return this;
    }
}
