package n6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import z4.I;

/* loaded from: classes.dex */
public class i extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private Context f34271a;

    protected Context a() {
        return this.f34271a;
    }

    protected Resources b() {
        return a().getResources();
    }

    protected String c(int i8) {
        return I.getString(a(), i8);
    }

    protected Object d(String str) {
        return a().getSystemService(str);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f34271a = context;
    }
}
