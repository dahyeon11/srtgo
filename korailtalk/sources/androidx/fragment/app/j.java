package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.AbstractC0918b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class j extends g {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f9730a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f9731b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f9732c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9733d;

    /* renamed from: e, reason: collision with root package name */
    final FragmentManager f9734e;

    public j(Context context, Handler handler, int i8) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i8);
    }

    Activity a() {
        return this.f9730a;
    }

    Context b() {
        return this.f9731b;
    }

    Handler c() {
        return this.f9732c;
    }

    public void onDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // androidx.fragment.app.g
    public View onFindViewById(int i8) {
        return null;
    }

    public abstract Object onGetHost();

    public LayoutInflater onGetLayoutInflater() {
        return LayoutInflater.from(this.f9731b);
    }

    public int onGetWindowAnimations() {
        return this.f9733d;
    }

    @Override // androidx.fragment.app.g
    public boolean onHasView() {
        return true;
    }

    public boolean onHasWindowAnimations() {
        return true;
    }

    @Deprecated
    public void onRequestPermissionsFromFragment(Fragment fragment, String[] strArr, int i8) {
    }

    public boolean onShouldSaveFragmentState(Fragment fragment) {
        return true;
    }

    public boolean onShouldShowRequestPermissionRationale(String str) {
        return false;
    }

    public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i8) {
        onStartActivityFromFragment(fragment, intent, i8, null);
    }

    @Deprecated
    public void onStartIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11, Bundle bundle) {
        if (i8 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        AbstractC0918b.startIntentSenderForResult(this.f9730a, intentSender, i8, intent, i9, i10, i11, bundle);
    }

    public void onSupportInvalidateOptionsMenu() {
    }

    j(ActivityC1010e activityC1010e) {
        this(activityC1010e, activityC1010e, new Handler(), 0);
    }

    public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i8, Bundle bundle) {
        if (i8 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.a.startActivity(this.f9731b, intent, bundle);
    }

    j(Activity activity, Context context, Handler handler, int i8) {
        this.f9734e = new m();
        this.f9730a = activity;
        this.f9731b = (Context) Z.h.checkNotNull(context, "context == null");
        this.f9732c = (Handler) Z.h.checkNotNull(handler, "handler == null");
        this.f9733d = i8;
    }
}
