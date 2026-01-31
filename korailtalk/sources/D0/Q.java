package D0;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
class Q implements S {

    /* renamed from: a, reason: collision with root package name */
    private final WindowId f749a;

    Q(View view) {
        this.f749a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Q) && ((Q) obj).f749a.equals(this.f749a);
    }

    public int hashCode() {
        return this.f749a.hashCode();
    }
}
