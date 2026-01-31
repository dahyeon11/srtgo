package com.nhn.android.naverlogin.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import h.AbstractC5571i;

/* loaded from: classes.dex */
public class OAuthLoginDialogMng {
    public Object mProgressDialogSync = new Object();
    public Object mAlertDialogSync = new Object();

    /* renamed from: a, reason: collision with root package name */
    private ProgressDialog f29676a = null;

    class a implements DialogInterface.OnDismissListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            OAuthLoginDialogMng.this.f29676a = null;
        }
    }

    public synchronized boolean hideProgressDlg() {
        synchronized (this.mProgressDialogSync) {
            ProgressDialog progressDialog = this.f29676a;
            if (progressDialog == null) {
                return false;
            }
            try {
                progressDialog.hide();
                this.f29676a.dismiss();
                this.f29676a = null;
                return true;
            } catch (Exception e8) {
                e8.printStackTrace();
                return false;
            }
        }
    }

    public boolean showProgressDlg(Context context, String str, DialogInterface.OnCancelListener onCancelListener) {
        synchronized (this.mProgressDialogSync) {
            try {
                try {
                    ProgressDialog progressDialog = this.f29676a;
                    if (progressDialog != null) {
                        progressDialog.hide();
                        this.f29676a.dismiss();
                    }
                    ProgressDialog progressDialog2 = new ProgressDialog(context, AbstractC5571i.Theme_AppCompat_Light_Dialog);
                    this.f29676a = progressDialog2;
                    progressDialog2.setIndeterminate(true);
                    this.f29676a.setMessage(str);
                    this.f29676a.setProgressStyle(0);
                    if (onCancelListener != null) {
                        this.f29676a.setOnCancelListener(onCancelListener);
                    }
                    this.f29676a.setCanceledOnTouchOutside(false);
                    this.f29676a.setOnDismissListener(new a());
                    this.f29676a.show();
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
