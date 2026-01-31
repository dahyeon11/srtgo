package f2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d;
import androidx.fragment.app.FragmentManager;
import i2.AbstractC5683p;
import k0.AbstractC5837a;

/* renamed from: f2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5405o extends DialogInterfaceOnCancelListenerC1009d {

    /* renamed from: r0, reason: collision with root package name */
    private Dialog f30581r0;

    /* renamed from: s0, reason: collision with root package name */
    private DialogInterface.OnCancelListener f30582s0;

    /* renamed from: t0, reason: collision with root package name */
    private Dialog f30583t0;

    public static C5405o newInstance(Dialog dialog) {
        return newInstance(dialog, null);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f30582s0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f30581r0;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f30583t0 == null) {
            this.f30583t0 = new AlertDialog.Builder((Context) AbstractC5683p.checkNotNull(getContext())).create();
        }
        return this.f30583t0;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }

    public static C5405o newInstance(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C5405o c5405o = new C5405o();
        Dialog dialog2 = (Dialog) AbstractC5683p.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c5405o.f30581r0 = dialog2;
        if (onCancelListener != null) {
            c5405o.f30582s0 = onCancelListener;
        }
        return c5405o;
    }
}
