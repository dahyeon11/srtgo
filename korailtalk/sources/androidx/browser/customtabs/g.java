package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import b.InterfaceC1058a;

/* loaded from: classes.dex */
class g extends InterfaceC1058a.AbstractBinderC0183a {
    g() {
    }

    @Override // b.InterfaceC1058a.AbstractBinderC0183a, android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // b.InterfaceC1058a.AbstractBinderC0183a, b.InterfaceC1058a
    public void extraCallback(String str, Bundle bundle) {
    }

    @Override // b.InterfaceC1058a.AbstractBinderC0183a, b.InterfaceC1058a
    public Bundle extraCallbackWithResult(String str, Bundle bundle) {
        return null;
    }

    @Override // b.InterfaceC1058a.AbstractBinderC0183a, b.InterfaceC1058a
    public void onMessageChannelReady(Bundle bundle) {
    }

    @Override // b.InterfaceC1058a.AbstractBinderC0183a, b.InterfaceC1058a
    public void onNavigationEvent(int i8, Bundle bundle) {
    }

    @Override // b.InterfaceC1058a.AbstractBinderC0183a, b.InterfaceC1058a
    public void onPostMessage(String str, Bundle bundle) {
    }

    @Override // b.InterfaceC1058a.AbstractBinderC0183a, b.InterfaceC1058a
    public void onRelationshipValidationResult(int i8, Uri uri, boolean z8, Bundle bundle) {
    }
}
