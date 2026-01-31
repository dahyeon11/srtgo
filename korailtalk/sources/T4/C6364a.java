package t4;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.app.d;
import n4.AbstractC5960k;
import z4.C6630d;

/* renamed from: t4.a */
/* loaded from: classes.dex */
public class C6364a extends d.a {

    /* renamed from: c */
    private Activity f36941c;

    /* renamed from: d */
    private View f36942d;

    /* renamed from: e */
    private d f36943e;

    public C6364a(Context context) {
        super(context, AbstractC5960k.BDialog);
        this.f36941c = (Activity) context;
        e();
    }

    private void e() {
        setCancelable(false);
        f();
        h();
        k();
        j();
        i();
    }

    protected View a(int i8) {
        return this.f36942d.findViewById(i8);
    }

    public DialogInterface b() {
        return this.f36943e;
    }

    public String c(int i8) {
        return getContext().getString(i8);
    }

    public String d(int i8, Object... objArr) {
        return getContext().getString(i8, objArr);
    }

    public void dismissDialog() {
        if (!C6630d.isNotNull(this.f36943e) || this.f36941c.isFinishing()) {
            return;
        }
        this.f36943e.dismiss();
    }

    protected void g(int i8) {
        View viewInflate = View.inflate(getContext(), i8, null);
        this.f36942d = viewInflate;
        setView(viewInflate);
        this.f36943e = create();
    }

    public boolean isShowing() {
        if (C6630d.isNull(this.f36943e)) {
            return false;
        }
        return this.f36943e.isShowing();
    }

    protected void l(Intent intent) {
        getContext().startActivity(intent);
    }

    public void showDialog() {
        if (!C6630d.isNotNull(this.f36943e) || this.f36941c.isFinishing()) {
            return;
        }
        this.f36943e.show();
    }

    public void showDimDialog(boolean z8) {
        if (!z8) {
            if (!C6630d.isNotNull(this.f36943e) || this.f36941c.isFinishing()) {
                return;
            }
            this.f36943e.show();
            return;
        }
        if (!C6630d.isNotNull(this.f36943e) || this.f36941c.isFinishing()) {
            return;
        }
        this.f36943e.getWindow().setFlags(2, 2);
        WindowManager.LayoutParams attributes = this.f36943e.getWindow().getAttributes();
        attributes.dimAmount = 0.5f;
        this.f36943e.getWindow().setAttributes(attributes);
        this.f36943e.show();
    }

    public C6364a(Context context, int i8) {
        super(context, i8);
        this.f36941c = (Activity) context;
        e();
    }

    protected void f() {
    }

    protected void h() {
    }

    protected void i() {
    }

    protected void j() {
    }

    protected void k() {
    }
}
