package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class F implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f8704a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Context f8705b;

    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private F(Context context) {
        this.f8705b = context;
    }

    public static F create(Context context) {
        return new F(context);
    }

    @Deprecated
    public static F from(Context context) {
        return create(context);
    }

    public F addNextIntent(Intent intent) {
        this.f8704a.add(intent);
        return this;
    }

    public F addNextIntentWithParentStack(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f8705b.getPackageManager());
        }
        if (component != null) {
            addParentStack(component);
        }
        addNextIntent(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public F addParentStack(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = l.getParentActivityIntent(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f8705b.getPackageManager());
            }
            addParentStack(component);
            addNextIntent(supportParentActivityIntent);
        }
        return this;
    }

    public Intent editIntentAt(int i8) {
        return (Intent) this.f8704a.get(i8);
    }

    @Deprecated
    public Intent getIntent(int i8) {
        return editIntentAt(i8);
    }

    public int getIntentCount() {
        return this.f8704a.size();
    }

    public Intent[] getIntents() {
        int size = this.f8704a.size();
        Intent[] intentArr = new Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent((Intent) this.f8704a.get(0)).addFlags(268484608);
        for (int i8 = 1; i8 < size; i8++) {
            intentArr[i8] = new Intent((Intent) this.f8704a.get(i8));
        }
        return intentArr;
    }

    public PendingIntent getPendingIntent(int i8, int i9) {
        return getPendingIntent(i8, i9, null);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f8704a.iterator();
    }

    public void startActivities() {
        startActivities(null);
    }

    public PendingIntent getPendingIntent(int i8, int i9, Bundle bundle) {
        if (this.f8704a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f8704a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.f8705b, i8, intentArr, i9, bundle);
    }

    public void startActivities(Bundle bundle) {
        if (this.f8704a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f8704a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.startActivities(this.f8705b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f8705b.startActivity(intent);
    }

    public F addParentStack(Class<?> cls) {
        return addParentStack(new ComponentName(this.f8705b, cls));
    }

    public F addParentStack(ComponentName componentName) {
        int size = this.f8704a.size();
        try {
            Intent parentActivityIntent = l.getParentActivityIntent(this.f8705b, componentName);
            while (parentActivityIntent != null) {
                this.f8704a.add(size, parentActivityIntent);
                parentActivityIntent = l.getParentActivityIntent(this.f8705b, parentActivityIntent.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e8) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e8);
        }
    }
}
