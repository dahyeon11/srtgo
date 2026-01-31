package n6;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public interface j {
    void addTransaction(int i8, Fragment fragment, String str);

    boolean appBack();

    void clearBackStackFragment();

    Fragment getCurrentFragment();

    Fragment getFragment(String str);

    String getFragmentTag(int i8);

    void replaceTransaction(int i8, Fragment fragment, String str);
}
