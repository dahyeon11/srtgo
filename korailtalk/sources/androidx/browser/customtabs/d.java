package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.browser.customtabs.a;
import androidx.browser.customtabs.f;
import androidx.core.app.AbstractC0920d;
import androidx.core.app.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {
    public static final int COLOR_SCHEME_DARK = 2;
    public static final int COLOR_SCHEME_LIGHT = 1;
    public static final int COLOR_SCHEME_SYSTEM = 0;
    public static final String EXTRA_ACTION_BUTTON_BUNDLE = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";
    public static final String EXTRA_CLOSE_BUTTON_ICON = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";
    public static final String EXTRA_COLOR_SCHEME = "androidx.browser.customtabs.extra.COLOR_SCHEME";
    public static final String EXTRA_COLOR_SCHEME_PARAMS = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";

    @Deprecated
    public static final String EXTRA_DEFAULT_SHARE_MENU_ITEM = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    public static final String EXTRA_ENABLE_INSTANT_APPS = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
    public static final String EXTRA_ENABLE_URLBAR_HIDING = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";
    public static final String EXTRA_EXIT_ANIMATION_BUNDLE = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
    public static final String EXTRA_MENU_ITEMS = "android.support.customtabs.extra.MENU_ITEMS";
    public static final String EXTRA_NAVIGATION_BAR_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";
    public static final String EXTRA_NAVIGATION_BAR_DIVIDER_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";
    public static final String EXTRA_REMOTEVIEWS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    public static final String EXTRA_REMOTEVIEWS_CLICKED_ID = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
    public static final String EXTRA_REMOTEVIEWS_PENDINGINTENT = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
    public static final String EXTRA_REMOTEVIEWS_VIEW_IDS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
    public static final String EXTRA_SECONDARY_TOOLBAR_COLOR = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";
    public static final String EXTRA_SESSION = "android.support.customtabs.extra.SESSION";
    public static final String EXTRA_SESSION_ID = "android.support.customtabs.extra.SESSION_ID";
    public static final String EXTRA_SHARE_STATE = "androidx.browser.customtabs.extra.SHARE_STATE";
    public static final String EXTRA_TINT_ACTION_BUTTON = "android.support.customtabs.extra.TINT_ACTION_BUTTON";
    public static final String EXTRA_TITLE_VISIBILITY_STATE = "android.support.customtabs.extra.TITLE_VISIBILITY";
    public static final String EXTRA_TOOLBAR_COLOR = "android.support.customtabs.extra.TOOLBAR_COLOR";
    public static final String EXTRA_TOOLBAR_ITEMS = "android.support.customtabs.extra.TOOLBAR_ITEMS";
    public static final String KEY_DESCRIPTION = "android.support.customtabs.customaction.DESCRIPTION";
    public static final String KEY_ICON = "android.support.customtabs.customaction.ICON";
    public static final String KEY_ID = "android.support.customtabs.customaction.ID";
    public static final String KEY_MENU_ITEM_TITLE = "android.support.customtabs.customaction.MENU_ITEM_TITLE";
    public static final String KEY_PENDING_INTENT = "android.support.customtabs.customaction.PENDING_INTENT";
    public static final int NO_TITLE = 0;
    public static final int SHARE_STATE_DEFAULT = 0;
    public static final int SHARE_STATE_OFF = 2;
    public static final int SHARE_STATE_ON = 1;
    public static final int SHOW_PAGE_TITLE = 1;
    public static final int TOOLBAR_ACTION_BUTTON_ID = 0;
    public final Intent intent;
    public final Bundle startAnimationBundle;

    d(Intent intent, Bundle bundle) {
        this.intent = intent;
        this.startAnimationBundle = bundle;
    }

    public static androidx.browser.customtabs.a getColorSchemeParams(Intent intent, int i8) {
        Bundle bundle;
        if (i8 < 0 || i8 > 2 || i8 == 0) {
            throw new IllegalArgumentException("Invalid colorScheme: " + i8);
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return androidx.browser.customtabs.a.a(null);
        }
        androidx.browser.customtabs.a aVarA = androidx.browser.customtabs.a.a(extras);
        SparseArray sparseParcelableArray = extras.getSparseParcelableArray(EXTRA_COLOR_SCHEME_PARAMS);
        return (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i8)) == null) ? aVarA : androidx.browser.customtabs.a.a(bundle).c(aVarA);
    }

    public static int getMaxToolbarItems() {
        return 5;
    }

    public static Intent setAlwaysUseBrowserUI(Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        return intent;
    }

    public static boolean shouldAlwaysUseBrowserUI(Intent intent) {
        return intent.getBooleanExtra("android.support.customtabs.extra.user_opt_out", false) && (intent.getFlags() & 268435456) != 0;
    }

    public void launchUrl(Context context, Uri uri) {
        this.intent.setData(uri);
        androidx.core.content.a.startActivity(context, this.intent, this.startAnimationBundle);
    }

    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        private ArrayList f7344c;

        /* renamed from: d, reason: collision with root package name */
        private Bundle f7345d;

        /* renamed from: e, reason: collision with root package name */
        private ArrayList f7346e;

        /* renamed from: f, reason: collision with root package name */
        private SparseArray f7347f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f7348g;

        /* renamed from: a, reason: collision with root package name */
        private final Intent f7342a = new Intent("android.intent.action.VIEW");

        /* renamed from: b, reason: collision with root package name */
        private final a.C0115a f7343b = new a.C0115a();

        /* renamed from: h, reason: collision with root package name */
        private int f7349h = 0;

        /* renamed from: i, reason: collision with root package name */
        private boolean f7350i = true;

        public a() {
        }

        private void a(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            h.putBinder(bundle, d.EXTRA_SESSION, iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable(d.EXTRA_SESSION_ID, pendingIntent);
            }
            this.f7342a.putExtras(bundle);
        }

        @Deprecated
        public a addDefaultShareMenuItem() {
            setShareState(1);
            return this;
        }

        public a addMenuItem(String str, PendingIntent pendingIntent) {
            if (this.f7344c == null) {
                this.f7344c = new ArrayList();
            }
            Bundle bundle = new Bundle();
            bundle.putString(d.KEY_MENU_ITEM_TITLE, str);
            bundle.putParcelable(d.KEY_PENDING_INTENT, pendingIntent);
            this.f7344c.add(bundle);
            return this;
        }

        @Deprecated
        public a addToolbarItem(int i8, Bitmap bitmap, String str, PendingIntent pendingIntent) {
            if (this.f7346e == null) {
                this.f7346e = new ArrayList();
            }
            if (this.f7346e.size() >= 5) {
                throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            Bundle bundle = new Bundle();
            bundle.putInt(d.KEY_ID, i8);
            bundle.putParcelable(d.KEY_ICON, bitmap);
            bundle.putString(d.KEY_DESCRIPTION, str);
            bundle.putParcelable(d.KEY_PENDING_INTENT, pendingIntent);
            this.f7346e.add(bundle);
            return this;
        }

        public d build() {
            if (!this.f7342a.hasExtra(d.EXTRA_SESSION)) {
                a(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f7344c;
            if (arrayList != null) {
                this.f7342a.putParcelableArrayListExtra(d.EXTRA_MENU_ITEMS, arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f7346e;
            if (arrayList2 != null) {
                this.f7342a.putParcelableArrayListExtra(d.EXTRA_TOOLBAR_ITEMS, arrayList2);
            }
            this.f7342a.putExtra(d.EXTRA_ENABLE_INSTANT_APPS, this.f7350i);
            this.f7342a.putExtras(this.f7343b.build().b());
            Bundle bundle = this.f7348g;
            if (bundle != null) {
                this.f7342a.putExtras(bundle);
            }
            if (this.f7347f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray(d.EXTRA_COLOR_SCHEME_PARAMS, this.f7347f);
                this.f7342a.putExtras(bundle2);
            }
            this.f7342a.putExtra(d.EXTRA_SHARE_STATE, this.f7349h);
            return new d(this.f7342a, this.f7345d);
        }

        @Deprecated
        public a enableUrlBarHiding() {
            this.f7342a.putExtra(d.EXTRA_ENABLE_URLBAR_HIDING, true);
            return this;
        }

        public a setActionButton(Bitmap bitmap, String str, PendingIntent pendingIntent, boolean z8) {
            Bundle bundle = new Bundle();
            bundle.putInt(d.KEY_ID, 0);
            bundle.putParcelable(d.KEY_ICON, bitmap);
            bundle.putString(d.KEY_DESCRIPTION, str);
            bundle.putParcelable(d.KEY_PENDING_INTENT, pendingIntent);
            this.f7342a.putExtra(d.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
            this.f7342a.putExtra(d.EXTRA_TINT_ACTION_BUTTON, z8);
            return this;
        }

        public a setCloseButtonIcon(Bitmap bitmap) {
            this.f7342a.putExtra(d.EXTRA_CLOSE_BUTTON_ICON, bitmap);
            return this;
        }

        public a setColorScheme(int i8) {
            if (i8 < 0 || i8 > 2) {
                throw new IllegalArgumentException("Invalid value for the colorScheme argument");
            }
            this.f7342a.putExtra(d.EXTRA_COLOR_SCHEME, i8);
            return this;
        }

        public a setColorSchemeParams(int i8, androidx.browser.customtabs.a aVar) {
            if (i8 < 0 || i8 > 2 || i8 == 0) {
                throw new IllegalArgumentException("Invalid colorScheme: " + i8);
            }
            if (this.f7347f == null) {
                this.f7347f = new SparseArray();
            }
            this.f7347f.put(i8, aVar.b());
            return this;
        }

        public a setDefaultColorSchemeParams(androidx.browser.customtabs.a aVar) {
            this.f7348g = aVar.b();
            return this;
        }

        @Deprecated
        public a setDefaultShareMenuItemEnabled(boolean z8) {
            if (z8) {
                setShareState(1);
            } else {
                setShareState(2);
            }
            return this;
        }

        public a setExitAnimations(Context context, int i8, int i9) {
            this.f7342a.putExtra(d.EXTRA_EXIT_ANIMATION_BUNDLE, AbstractC0920d.makeCustomAnimation(context, i8, i9).toBundle());
            return this;
        }

        public a setInstantAppsEnabled(boolean z8) {
            this.f7350i = z8;
            return this;
        }

        @Deprecated
        public a setNavigationBarColor(int i8) {
            this.f7343b.setNavigationBarColor(i8);
            return this;
        }

        @Deprecated
        public a setNavigationBarDividerColor(int i8) {
            this.f7343b.setNavigationBarDividerColor(i8);
            return this;
        }

        public a setPendingSession(f.b bVar) {
            a(null, bVar.b());
            return this;
        }

        @Deprecated
        public a setSecondaryToolbarColor(int i8) {
            this.f7343b.setSecondaryToolbarColor(i8);
            return this;
        }

        public a setSecondaryToolbarViews(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
            this.f7342a.putExtra(d.EXTRA_REMOTEVIEWS, remoteViews);
            this.f7342a.putExtra(d.EXTRA_REMOTEVIEWS_VIEW_IDS, iArr);
            this.f7342a.putExtra(d.EXTRA_REMOTEVIEWS_PENDINGINTENT, pendingIntent);
            return this;
        }

        public a setSession(f fVar) {
            this.f7342a.setPackage(fVar.d().getPackageName());
            a(fVar.c(), fVar.e());
            return this;
        }

        public a setShareState(int i8) {
            if (i8 < 0 || i8 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f7349h = i8;
            if (i8 == 1) {
                this.f7342a.putExtra(d.EXTRA_DEFAULT_SHARE_MENU_ITEM, true);
            } else if (i8 == 2) {
                this.f7342a.putExtra(d.EXTRA_DEFAULT_SHARE_MENU_ITEM, false);
            } else {
                this.f7342a.removeExtra(d.EXTRA_DEFAULT_SHARE_MENU_ITEM);
            }
            return this;
        }

        public a setShowTitle(boolean z8) {
            this.f7342a.putExtra(d.EXTRA_TITLE_VISIBILITY_STATE, z8 ? 1 : 0);
            return this;
        }

        public a setStartAnimations(Context context, int i8, int i9) {
            this.f7345d = AbstractC0920d.makeCustomAnimation(context, i8, i9).toBundle();
            return this;
        }

        @Deprecated
        public a setToolbarColor(int i8) {
            this.f7343b.setToolbarColor(i8);
            return this;
        }

        public a setUrlBarHidingEnabled(boolean z8) {
            this.f7342a.putExtra(d.EXTRA_ENABLE_URLBAR_HIDING, z8);
            return this;
        }

        public a(f fVar) {
            if (fVar != null) {
                setSession(fVar);
            }
        }

        public a setActionButton(Bitmap bitmap, String str, PendingIntent pendingIntent) {
            return setActionButton(bitmap, str, pendingIntent, false);
        }
    }
}
