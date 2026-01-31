package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C;
import h.AbstractC5563a;
import l.AbstractC5876b;

/* loaded from: classes.dex */
public class k extends Dialog implements f {

    /* renamed from: a, reason: collision with root package name */
    private g f6416a;

    /* renamed from: b, reason: collision with root package name */
    private final C.a f6417b;

    class a implements C.a {
        a() {
        }

        @Override // androidx.core.view.C.a
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return k.this.b(keyEvent);
        }
    }

    public k(Context context) {
        this(context, 0);
    }

    private static int a(Context context, int i8) {
        if (i8 != 0) {
            return i8;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC5563a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().addContentView(view, layoutParams);
    }

    boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().onDestroy();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C.dispatchKeyEvent(this.f6417b, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i8) {
        return (T) getDelegate().findViewById(i8);
    }

    public g getDelegate() {
        if (this.f6416a == null) {
            this.f6416a = g.create(this, this);
        }
        return this.f6416a;
    }

    public androidx.appcompat.app.a getSupportActionBar() {
        return getDelegate().getSupportActionBar();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        getDelegate().installViewFactory();
        super.onCreate(bundle);
        getDelegate().onCreate(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        getDelegate().onStop();
    }

    @Override // androidx.appcompat.app.f
    public AbstractC5876b onWindowStartingSupportActionMode(AbstractC5876b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i8) {
        getDelegate().setContentView(i8);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().setTitle(charSequence);
    }

    public boolean supportRequestWindowFeature(int i8) {
        return getDelegate().requestWindowFeature(i8);
    }

    public k(Context context, int i8) {
        super(context, a(context, i8));
        this.f6417b = new a();
        g delegate = getDelegate();
        delegate.setTheme(a(context, i8));
        delegate.onCreate(null);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        getDelegate().setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i8) {
        super.setTitle(i8);
        getDelegate().setTitle(getContext().getString(i8));
    }

    @Override // androidx.appcompat.app.f
    public void onSupportActionModeFinished(AbstractC5876b abstractC5876b) {
    }

    @Override // androidx.appcompat.app.f
    public void onSupportActionModeStarted(AbstractC5876b abstractC5876b) {
    }
}
