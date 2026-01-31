package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class RemoteActionCompat implements E0.a {
    public PendingIntent mActionIntent;
    public CharSequence mContentDescription;
    public boolean mEnabled;
    public IconCompat mIcon;
    public boolean mShouldShowIcon;
    public CharSequence mTitle;

    static class a {
        static RemoteAction a(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        static PendingIntent b(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        static CharSequence c(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        static Icon d(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        static CharSequence e(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        static boolean f(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        static void g(RemoteAction remoteAction, boolean z8) {
            remoteAction.setEnabled(z8);
        }
    }

    static class b {
        static void a(RemoteAction remoteAction, boolean z8) {
            remoteAction.setShouldShowIcon(z8);
        }

        static boolean b(RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }
    }

    public RemoteActionCompat(IconCompat iconCompat, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        this.mIcon = (IconCompat) Z.h.checkNotNull(iconCompat);
        this.mTitle = (CharSequence) Z.h.checkNotNull(charSequence);
        this.mContentDescription = (CharSequence) Z.h.checkNotNull(charSequence2);
        this.mActionIntent = (PendingIntent) Z.h.checkNotNull(pendingIntent);
        this.mEnabled = true;
        this.mShouldShowIcon = true;
    }

    public static RemoteActionCompat createFromRemoteAction(RemoteAction remoteAction) {
        Z.h.checkNotNull(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.createFromIcon(a.d(remoteAction)), a.e(remoteAction), a.c(remoteAction), a.b(remoteAction));
        remoteActionCompat.setEnabled(a.f(remoteAction));
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.setShouldShowIcon(b.b(remoteAction));
        }
        return remoteActionCompat;
    }

    public PendingIntent getActionIntent() {
        return this.mActionIntent;
    }

    public CharSequence getContentDescription() {
        return this.mContentDescription;
    }

    public IconCompat getIcon() {
        return this.mIcon;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void setEnabled(boolean z8) {
        this.mEnabled = z8;
    }

    public void setShouldShowIcon(boolean z8) {
        this.mShouldShowIcon = z8;
    }

    public boolean shouldShowIcon() {
        return this.mShouldShowIcon;
    }

    public RemoteAction toRemoteAction() {
        RemoteAction remoteActionA = a.a(this.mIcon.toIcon(), this.mTitle, this.mContentDescription, this.mActionIntent);
        a.g(remoteActionA, isEnabled());
        if (Build.VERSION.SDK_INT >= 28) {
            b.a(remoteActionA, shouldShowIcon());
        }
        return remoteActionA;
    }

    public RemoteActionCompat() {
    }

    public RemoteActionCompat(RemoteActionCompat remoteActionCompat) {
        Z.h.checkNotNull(remoteActionCompat);
        this.mIcon = remoteActionCompat.mIcon;
        this.mTitle = remoteActionCompat.mTitle;
        this.mContentDescription = remoteActionCompat.mContentDescription;
        this.mActionIntent = remoteActionCompat.mActionIntent;
        this.mEnabled = remoteActionCompat.mEnabled;
        this.mShouldShowIcon = remoteActionCompat.mShouldShowIcon;
    }
}
