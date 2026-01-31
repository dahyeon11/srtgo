package G4;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public interface b {
    void cancelLogin();

    Fragment getFragment(int i8);

    int getSelectedTabPosition();

    String getTitle(int i8);

    boolean isAutoLogin();

    void moveToGoogleLogin();

    void moveToKakaoLogin();

    void moveToNaverLogin();

    void moveToOnepassLogin();

    void nonMemberSuccessLogin();

    void setAutoLogin(boolean z8);

    void setTabPosition(int i8);

    void successLogin();

    void successLoginWidthPopup(Intent intent);
}
