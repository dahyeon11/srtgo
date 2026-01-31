package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;

/* renamed from: androidx.core.view.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1004z {

    /* renamed from: a, reason: collision with root package name */
    private final DragAndDropPermissions f9288a;

    /* renamed from: androidx.core.view.z$a */
    static class a {
        static void a(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        static DragAndDropPermissions b(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    private C1004z(DragAndDropPermissions dragAndDropPermissions) {
        this.f9288a = dragAndDropPermissions;
    }

    public static C1004z request(Activity activity, DragEvent dragEvent) {
        DragAndDropPermissions dragAndDropPermissionsB = a.b(activity, dragEvent);
        if (dragAndDropPermissionsB != null) {
            return new C1004z(dragAndDropPermissionsB);
        }
        return null;
    }

    public void release() {
        a.a(this.f9288a);
    }
}
