package s4;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import n4.AbstractC5953d;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import t4.C6364a;
import z4.C6630d;
import z4.N;

/* renamed from: s4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6220d extends C6364a implements CompoundButton.OnCheckedChangeListener {
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
    protected int f36185f;

    /* renamed from: g, reason: collision with root package name */
    private b f36186g;

    /* renamed from: h, reason: collision with root package name */
    protected View f36187h;

    /* renamed from: i, reason: collision with root package name */
    protected View f36188i;

    /* renamed from: j, reason: collision with root package name */
    protected View f36189j;

    /* renamed from: k, reason: collision with root package name */
    protected TextView f36190k;

    /* renamed from: l, reason: collision with root package name */
    protected TextView f36191l;

    /* renamed from: m, reason: collision with root package name */
    protected CheckBox f36192m;

    /* renamed from: n, reason: collision with root package name */
    protected Button f36193n;

    /* renamed from: o, reason: collision with root package name */
    protected Button f36194o;

    /* renamed from: p, reason: collision with root package name */
    protected Button f36195p;

    /* renamed from: q, reason: collision with root package name */
    protected ImageView f36196q;

    /* renamed from: s4.d$b */
    private class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private DialogInterface.OnClickListener f36197a;

        private b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onClick(android.view.View r4) {
            /*
                r3 = this;
                int r4 = r4.getId()
                int r0 = n4.AbstractC5955f.btn_dialog_negative
                r1 = 102(0x66, float:1.43E-43)
                r2 = 100
                if (r0 != r4) goto L1b
                s4.d r4 = s4.C6220d.this
                int r4 = r4.f36185f
                r0 = 1001(0x3e9, float:1.403E-42)
                if (r0 == r4) goto L26
                r0 = 1004(0x3ec, float:1.407E-42)
                if (r0 != r4) goto L19
                goto L26
            L19:
                r1 = r2
                goto L26
            L1b:
                int r0 = n4.AbstractC5955f.btn_dialog_neutral
                if (r0 != r4) goto L22
                r1 = 101(0x65, float:1.42E-43)
                goto L26
            L22:
                int r0 = n4.AbstractC5955f.btn_dialog_positive
                if (r0 != r4) goto L19
            L26:
                s4.d r4 = s4.C6220d.this
                r4.dismissDialog()
                android.content.DialogInterface$OnClickListener r4 = r3.f36197a
                boolean r4 = z4.C6630d.isNotNull(r4)
                if (r4 == 0) goto L3f
                android.content.DialogInterface$OnClickListener r4 = r3.f36197a
                s4.d r0 = s4.C6220d.this
                android.content.DialogInterface r0 = s4.C6220d.m(r0)
                r4.onClick(r0, r1)
                goto L52
            L3f:
                r4 = 0
                boolean r0 = z4.C6630d.isNotNull(r4)
                if (r0 != 0) goto L7c
                boolean r0 = z4.C6630d.isNotNull(r4)
                if (r0 != 0) goto L6a
                boolean r0 = z4.C6630d.isNotNull(r4)
                if (r0 != 0) goto L53
            L52:
                return
            L53:
                s4.d r0 = s4.C6220d.this
                s4.C6220d.p(r0)
                s4.d r0 = s4.C6220d.this
                android.widget.CheckBox r0 = r0.f36192m
                r0.isChecked()
                s4.d r0 = s4.C6220d.this
                r0.q()
                s4.d r0 = s4.C6220d.this
                r0.r()
                throw r4
            L6a:
                s4.d r0 = s4.C6220d.this
                s4.C6220d.o(r0)
                s4.d r0 = s4.C6220d.this
                android.widget.CheckBox r0 = r0.f36192m
                r0.isChecked()
                s4.d r0 = s4.C6220d.this
                r0.q()
                throw r4
            L7c:
                s4.d r0 = s4.C6220d.this
                s4.C6220d.n(r0)
                s4.d r0 = s4.C6220d.this
                android.widget.CheckBox r0 = r0.f36192m
                r0.isChecked()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: s4.C6220d.b.onClick(android.view.View):void");
        }

        public void setOnClickListener(DialogInterface.OnClickListener onClickListener) {
            this.f36197a = onClickListener;
        }

        public void setOnClickListener(c cVar) {
        }

        public void setOnClickListener(InterfaceC0422d interfaceC0422d) {
        }

        public void setOnClickListener(e eVar) {
        }
    }

    /* renamed from: s4.d$c */
    public interface c {
    }

    /* renamed from: s4.d$d, reason: collision with other inner class name */
    public interface InterfaceC0422d {
    }

    /* renamed from: s4.d$e */
    public interface e {
    }

    public C6220d(Context context) {
        super(context);
    }

    @Override // t4.C6364a
    protected void f() {
        g(AbstractC5957h.dialog_custom_image);
    }

    @Override // t4.C6364a
    protected void h() {
        this.f36186g = new b();
    }

    @Override // t4.C6364a
    protected void i() {
        if (C6630d.isNotNull(this.f36192m)) {
            this.f36192m.setOnCheckedChangeListener(this);
        }
        this.f36193n.setOnClickListener(this.f36186g);
        this.f36194o.setOnClickListener(this.f36186g);
        this.f36195p.setOnClickListener(this.f36186g);
    }

    @Override // t4.C6364a
    protected void k() {
        this.f36190k = (TextView) a(AbstractC5955f.tv_dialog_title);
        this.f36187h = a(AbstractC5955f.v_dialog_title_divider);
        this.f36196q = (ImageView) a(AbstractC5955f.popupImage);
        this.f36191l = (TextView) a(AbstractC5955f.tv_dialog_content);
        this.f36192m = (CheckBox) a(AbstractC5955f.cb_dialog);
        this.f36193n = (Button) a(AbstractC5955f.btn_dialog_negative);
        this.f36188i = a(AbstractC5955f.v_dialog_neutral_divider);
        this.f36194o = (Button) a(AbstractC5955f.btn_dialog_neutral);
        this.f36189j = a(AbstractC5955f.v_dialog_positive_divider);
        this.f36195p = (Button) a(AbstractC5955f.btn_dialog_positive);
        if (C6630d.isNotNull(this.f36191l)) {
            this.f36191l.setVisibility(8);
        }
        if (C6630d.isNotNull(this.f36192m)) {
            this.f36192m.setVisibility(8);
        }
        this.f36191l.setVisibility(8);
        this.f36190k.setVisibility(8);
        this.f36187h.setVisibility(8);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
        int i8 = this.f36185f;
        if (1004 == i8) {
            this.f36193n.setEnabled(z8);
        } else if (1005 == i8) {
            this.f36195p.setEnabled(z8);
        }
    }

    protected int q() {
        return -1;
    }

    protected String r() {
        return null;
    }

    public C6220d setButtonListener(DialogInterface.OnClickListener onClickListener) {
        this.f36186g.setOnClickListener(onClickListener);
        this.f36193n.setOnClickListener(this.f36186g);
        this.f36194o.setOnClickListener(this.f36186g);
        this.f36195p.setOnClickListener(this.f36186g);
        return this;
    }

    public C6220d setButtonNames(String[] strArr) {
        if (C6630d.isNotNull(strArr)) {
            if (1 <= strArr.length) {
                this.f36193n.setText(strArr[0]);
            }
            if (2 <= strArr.length) {
                this.f36195p.setText(strArr[1]);
            }
            if (3 <= strArr.length) {
                this.f36194o.setText(strArr[2]);
            }
        }
        return this;
    }

    public C6220d setCheckBoxMessage(String str) {
        if (N.isNotNull(str)) {
            this.f36192m.setText(str);
            this.f36192m.setVisibility(0);
        }
        return this;
    }

    public C6220d setContent(Object... objArr) {
        for (Object obj : objArr) {
            if (obj instanceof String) {
                com.squareup.picasso.s.get().load((String) obj).networkPolicy(com.squareup.picasso.p.NO_CACHE, com.squareup.picasso.p.NO_STORE).into(this.f36196q);
            } else if (obj instanceof SpannableStringBuilder) {
                this.f36191l.append((SpannableStringBuilder) obj);
                this.f36191l.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        this.f36191l.setVisibility(0);
        return this;
    }

    public void setTheme(int i8) {
        if (C6630d.isNotNull(this.f36190k)) {
            this.f36190k.setTextColor(i8 == 0 ? -16303262 : -11586432);
        }
        if (C6630d.isNotNull(this.f36187h)) {
            this.f36187h.setBackgroundColor(i8 == 0 ? 855664307 : -2697493);
        }
        this.f36193n.setTextColor(androidx.core.content.a.getColorStateList(getContext(), i8 == 0 ? AbstractC5953d.selector_btn_text_blue : AbstractC5953d.selector_btn_text_purple));
        this.f36193n.setBackgroundResource(i8 == 0 ? AbstractC5954e.selector_btn_blue : AbstractC5954e.selector_btn_purple);
        this.f36189j.setBackgroundColor(-4800054);
        this.f36194o.setTextColor(androidx.core.content.a.getColorStateList(getContext(), i8 == 0 ? AbstractC5953d.selector_btn_text_blue : AbstractC5953d.selector_btn_text_purple));
        this.f36194o.setBackgroundResource(i8 == 0 ? AbstractC5954e.selector_btn_blue : AbstractC5954e.selector_btn_purple);
        this.f36188i.setBackgroundColor(-4800054);
        this.f36195p.setTextColor(androidx.core.content.a.getColorStateList(getContext(), i8 == 0 ? AbstractC5953d.selector_btn_text_blue : AbstractC5953d.selector_btn_text_purple));
        this.f36195p.setBackgroundResource(i8 == 0 ? AbstractC5954e.selector_btn_blue : AbstractC5954e.selector_btn_purple);
    }

    public void setTitle(String str) {
        if (C6630d.isNotNull(this.f36190k)) {
            this.f36190k.setText(str);
        }
    }

    public void setType(int i8) {
        this.f36185f = i8;
        if (1001 == i8 || 1004 == i8) {
            this.f36188i.setVisibility(8);
            this.f36194o.setVisibility(8);
            this.f36189j.setVisibility(8);
            this.f36195p.setVisibility(8);
            this.f36193n.setText(c(AbstractC5959j.common_confirm));
            if (1004 == i8) {
                this.f36193n.setEnabled(false);
                return;
            }
            return;
        }
        if (1002 == i8 || 1005 == i8 || 1051 == i8) {
            this.f36194o.setVisibility(8);
            this.f36188i.setVisibility(8);
            this.f36193n.setText(c(AbstractC5959j.common_no));
            this.f36195p.setText(c(AbstractC5959j.common_yes));
            if (1005 == i8) {
                this.f36195p.setEnabled(false);
            }
        }
    }

    public C6220d(Context context, int i8) {
        super(context, i8);
    }

    public C6220d setButtonListener(c cVar) {
        this.f36186g.setOnClickListener(cVar);
        this.f36193n.setOnClickListener(this.f36186g);
        this.f36194o.setOnClickListener(this.f36186g);
        this.f36195p.setOnClickListener(this.f36186g);
        return this;
    }

    public C6220d setButtonListener(InterfaceC0422d interfaceC0422d) {
        this.f36186g.setOnClickListener(interfaceC0422d);
        this.f36193n.setOnClickListener(this.f36186g);
        this.f36194o.setOnClickListener(this.f36186g);
        this.f36195p.setOnClickListener(this.f36186g);
        return this;
    }

    public C6220d setButtonListener(e eVar) {
        this.f36186g.setOnClickListener(eVar);
        this.f36193n.setOnClickListener(this.f36186g);
        this.f36194o.setOnClickListener(this.f36186g);
        this.f36195p.setOnClickListener(this.f36186g);
        return this;
    }

    public void setImage(String str) {
    }
}
