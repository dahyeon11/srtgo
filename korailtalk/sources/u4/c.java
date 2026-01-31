package u4;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.k;
import n4.AbstractC5960k;

/* loaded from: classes.dex */
public class c extends k {

    /* renamed from: c, reason: collision with root package name */
    private int f37124c;

    public c(Context context) {
        super(context, AbstractC5960k.CLoadingDialog);
        c(context);
    }

    private void c(Context context) {
        addContentView(new ProgressBar(context), new LinearLayout.LayoutParams(-2, -2));
        setCanceledOnTouchOutside(false);
    }

    @Override // androidx.appcompat.app.k, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        int i8 = this.f37124c;
        if (i8 > 0) {
            this.f37124c = i8 - 1;
        }
        if (!isShowing() || this.f37124c > 0) {
            return;
        }
        this.f37124c = 0;
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
    }

    @Override // androidx.appcompat.app.k, android.app.Dialog
    protected void onStop() {
        super.onStop();
        this.f37124c = 0;
    }

    @Override // android.app.Dialog
    public void show() {
        if (this.f37124c == 0) {
            super.show();
        }
        this.f37124c++;
    }
}
