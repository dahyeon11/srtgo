package z4;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* renamed from: z4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6640n {

    /* renamed from: a, reason: collision with root package name */
    private String f37903a;

    public void addTransaction(FragmentManager fragmentManager, int i8, Fragment fragment, String str) {
        fragmentManager.beginTransaction().add(i8, fragment, str).addToBackStack(str).commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
    }

    public boolean appBack(FragmentManager fragmentManager) {
        int backStackEntryCount = fragmentManager.getBackStackEntryCount();
        if (backStackEntryCount == 0) {
            if (C6630d.isNull((com.korail.talk.view.base.a) getCurrentFragment(fragmentManager))) {
                return false;
            }
            return !r6.appBack();
        }
        if (backStackEntryCount <= 0) {
            return false;
        }
        com.korail.talk.view.base.a aVar = (com.korail.talk.view.base.a) getCurrentFragment(fragmentManager);
        boolean zAppBack = aVar.appBack();
        if (!zAppBack) {
            return !zAppBack;
        }
        Intent fragmentResult = aVar.getFragmentResult();
        fragmentManager.popBackStackImmediate(aVar.getTag(), 1);
        int backStackEntryCount2 = fragmentManager.getBackStackEntryCount();
        try {
            ((com.korail.talk.view.base.a) getFragment(fragmentManager, backStackEntryCount2 == 0 ? getFragmentTag(fragmentManager, 0) : getFragmentTag(fragmentManager, backStackEntryCount2 - 1))).onFragmentResult(fragmentResult);
        } catch (NullPointerException e8) {
            t.e(e8.getMessage());
        }
        return zAppBack;
    }

    public void clearBackStackFragment(FragmentManager fragmentManager) {
        fragmentManager.popBackStack((String) null, 1);
    }

    public Fragment getCurrentFragment(FragmentManager fragmentManager) {
        return fragmentManager.findFragmentByTag(getCurrentFragmentTag(fragmentManager));
    }

    public String getCurrentFragmentTag(FragmentManager fragmentManager) {
        int backStackEntryCount = fragmentManager.getBackStackEntryCount();
        return backStackEntryCount > 0 ? fragmentManager.getBackStackEntryAt(backStackEntryCount - 1).getName() : this.f37903a;
    }

    public Fragment getFragment(FragmentManager fragmentManager, String str) {
        return fragmentManager.findFragmentByTag(str);
    }

    public String getFragmentTag(FragmentManager fragmentManager, int i8) {
        return fragmentManager.getBackStackEntryCount() > 0 ? fragmentManager.getBackStackEntryAt(i8).getName() : this.f37903a;
    }

    public void replaceTransaction(FragmentManager fragmentManager, int i8, Fragment fragment, String str) {
        this.f37903a = str;
        fragmentManager.beginTransaction().replace(i8, fragment, str).commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
    }
}
