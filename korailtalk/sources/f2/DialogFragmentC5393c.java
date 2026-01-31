package f2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import i2.AbstractC5683p;

/* renamed from: f2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogFragmentC5393c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f30563a;

    /* renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f30564b;

    /* renamed from: c, reason: collision with root package name */
    private Dialog f30565c;

    public static DialogFragmentC5393c newInstance(Dialog dialog) {
        return newInstance(dialog, null);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f30564b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f30563a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f30565c == null) {
            this.f30565c = new AlertDialog.Builder((Context) AbstractC5683p.checkNotNull(getActivity())).create();
        }
        return this.f30565c;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }

    public static DialogFragmentC5393c newInstance(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC5393c dialogFragmentC5393c = new DialogFragmentC5393c();
        Dialog dialog2 = (Dialog) AbstractC5683p.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC5393c.f30563a = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC5393c.f30564b = onCancelListener;
        }
        return dialogFragmentC5393c;
    }
}
