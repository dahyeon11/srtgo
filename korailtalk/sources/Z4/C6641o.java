package z4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.korail.talk.application.KTApplication;
import com.korail.talk.ui.booking.mainBooking.MainBookingActivity;
import com.korail.talk.ui.intro.IntroActivity;
import com.korail.talk.ui.login.member.LoginActivity;
import n4.AbstractC5951b;

/* renamed from: z4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6641o {
    private static Intent a(Activity activity, boolean z8, boolean z9, boolean z10) {
        Intent intent = new Intent(activity, (Class<?>) LoginActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("IS_NONMEMBER", z8);
        intent.putExtra("IS_RESERVATION_DAO", z9);
        intent.putExtra("IS_DRAWER_LOGIN", z10);
        return intent;
    }

    public static Bundle getIntentBundle(Class cls, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("TYPE", "TYPE_NAVIGATION");
        if (C6630d.isNotNull(cls)) {
            bundle2.putSerializable("CLASS", cls);
        }
        if (C6630d.isNotNull(bundle)) {
            bundle2.putAll(bundle);
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Intent getPushIntent(android.content.Context r2, int r3) {
        /*
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            r1 = 5
            if (r3 == r1) goto L98
            r1 = 17
            if (r3 == r1) goto L8a
            r1 = 50
            if (r3 == r1) goto L7c
            r1 = 51
            if (r3 == r1) goto L6e
            switch(r3) {
                case 12: goto L8a;
                case 13: goto L8a;
                case 14: goto L8a;
                default: goto L19;
            }
        L19:
            switch(r3) {
                case 19: goto L66;
                case 20: goto L58;
                case 21: goto L4a;
                case 22: goto L3c;
                default: goto L1c;
            }
        L1c:
            switch(r3) {
                case 24: goto L8a;
                case 25: goto L4a;
                case 26: goto L3c;
                case 27: goto L2e;
                default: goto L1f;
            }
        L1f:
            int r3 = n4.AbstractC5959j.navigation_booking
            java.lang.String r2 = r2.getString(r3)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.setData(r2)
            goto La5
        L2e:
            int r3 = n4.AbstractC5959j.navigation_mileage
            java.lang.String r2 = r2.getString(r3)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.setData(r2)
            goto La5
        L3c:
            int r3 = n4.AbstractC5959j.navigation_delay_discount_coupon
            java.lang.String r2 = r2.getString(r3)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.setData(r2)
            goto La5
        L4a:
            int r3 = n4.AbstractC5959j.navigation_discount_coupon
            java.lang.String r2 = r2.getString(r3)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.setData(r2)
            goto La5
        L58:
            int r3 = n4.AbstractC5959j.navigation_push_history
            java.lang.String r2 = r2.getString(r3)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.setData(r2)
            goto La5
        L66:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.korail.talk.ui.push.SpecialRoomUpgradeActivity> r3 = com.korail.talk.ui.push.SpecialRoomUpgradeActivity.class
            r0.<init>(r2, r3)
            goto La5
        L6e:
            int r3 = n4.AbstractC5959j.navigation_period_season_ticket
            java.lang.String r2 = r2.getString(r3)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.setData(r2)
            goto La5
        L7c:
            int r3 = n4.AbstractC5959j.navigation_season_ticket
            java.lang.String r2 = r2.getString(r3)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.setData(r2)
            goto La5
        L8a:
            int r3 = n4.AbstractC5959j.navigation_ticket
            java.lang.String r2 = r2.getString(r3)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.setData(r2)
            goto La5
        L98:
            int r3 = n4.AbstractC5959j.navigation_push_history
            java.lang.String r2 = r2.getString(r3)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.setData(r2)
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C6641o.getPushIntent(android.content.Context, int):android.content.Intent");
    }

    public static void moveToLogin(Object obj) {
        moveToLogin(obj, false);
    }

    public static void navigation(Context context) {
        navigation(context, null);
    }

    public static void moveToLogin(Object obj, boolean z8) {
        moveToLogin(obj, z8, false);
    }

    public static void navigation(Context context, Class cls) {
        navigation(context, cls, null);
    }

    public static void moveToLogin(Object obj, boolean z8, boolean z9) {
        moveToLogin(obj, z8, z9, false);
    }

    public static void navigation(Context context, Class cls, Bundle bundle) {
        Intent intent = new Intent();
        if (KTApplication.isAppRunning) {
            intent.setClass(context, MainBookingActivity.class);
        } else {
            intent.setClass(context, IntroActivity.class);
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
        }
        intent.setFlags(872415232);
        intent.putExtras(getIntentBundle(cls, bundle));
        context.startActivity(intent);
    }

    public static void moveToLogin(Object obj, boolean z8, boolean z9, boolean z10) {
        if (obj instanceof Fragment) {
            Fragment fragment = (Fragment) obj;
            fragment.startActivityForResult(a(fragment.getActivity(), z8, z9, z10), 104);
            fragment.getActivity().overridePendingTransition(AbstractC5951b.bottom_view_slide_up, AbstractC5951b.bottom_view_slide_stay);
        } else {
            Activity activity = (Activity) obj;
            activity.startActivityForResult(a(activity, z8, z9, z10), 104);
            activity.overridePendingTransition(AbstractC5951b.bottom_view_slide_up, AbstractC5951b.bottom_view_slide_stay);
        }
    }
}
