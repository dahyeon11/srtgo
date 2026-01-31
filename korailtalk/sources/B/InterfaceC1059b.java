package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.InterfaceC1058a;
import java.util.List;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1059b extends IInterface {
    Bundle extraCommand(String str, Bundle bundle);

    boolean mayLaunchUrl(InterfaceC1058a interfaceC1058a, Uri uri, Bundle bundle, List<Bundle> list);

    boolean newSession(InterfaceC1058a interfaceC1058a);

    boolean newSessionWithExtras(InterfaceC1058a interfaceC1058a, Bundle bundle);

    int postMessage(InterfaceC1058a interfaceC1058a, String str, Bundle bundle);

    boolean receiveFile(InterfaceC1058a interfaceC1058a, Uri uri, int i8, Bundle bundle);

    boolean requestPostMessageChannel(InterfaceC1058a interfaceC1058a, Uri uri);

    boolean requestPostMessageChannelWithExtras(InterfaceC1058a interfaceC1058a, Uri uri, Bundle bundle);

    boolean updateVisuals(InterfaceC1058a interfaceC1058a, Bundle bundle);

    boolean validateRelationship(InterfaceC1058a interfaceC1058a, int i8, Uri uri, Bundle bundle);

    boolean warmup(long j8);

    /* renamed from: b.b$a */
    public static abstract class a extends Binder implements InterfaceC1059b {

        /* renamed from: b.b$a$a, reason: collision with other inner class name */
        private static class C0185a implements InterfaceC1059b {
            public static InterfaceC1059b sDefaultImpl;

            /* renamed from: a, reason: collision with root package name */
            private IBinder f11274a;

            C0185a(IBinder iBinder) {
                this.f11274a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11274a;
            }

            @Override // b.InterfaceC1059b
            public Bundle extraCommand(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f11274a.transact(5, parcelObtain, parcelObtain2, 0) && a.getDefaultImpl() != null) {
                        Bundle bundleExtraCommand = a.getDefaultImpl().extraCommand(str, bundle);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return bundleExtraCommand;
                    }
                    parcelObtain2.readException();
                    Bundle bundle2 = parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return bundle2;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            public String getInterfaceDescriptor() {
                return "android.support.customtabs.ICustomTabsService";
            }

            @Override // b.InterfaceC1059b
            public boolean mayLaunchUrl(InterfaceC1058a interfaceC1058a, Uri uri, Bundle bundle, List<Bundle> list) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(interfaceC1058a != null ? interfaceC1058a.asBinder() : null);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeTypedList(list);
                    if (!this.f11274a.transact(4, parcelObtain, parcelObtain2, 0) && a.getDefaultImpl() != null) {
                        boolean zMayLaunchUrl = a.getDefaultImpl().mayLaunchUrl(interfaceC1058a, uri, bundle, list);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return zMayLaunchUrl;
                    }
                    parcelObtain2.readException();
                    boolean z8 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z8;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // b.InterfaceC1059b
            public boolean newSession(InterfaceC1058a interfaceC1058a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(interfaceC1058a != null ? interfaceC1058a.asBinder() : null);
                    if (!this.f11274a.transact(3, parcelObtain, parcelObtain2, 0) && a.getDefaultImpl() != null) {
                        boolean zNewSession = a.getDefaultImpl().newSession(interfaceC1058a);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return zNewSession;
                    }
                    parcelObtain2.readException();
                    boolean z8 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z8;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // b.InterfaceC1059b
            public boolean newSessionWithExtras(InterfaceC1058a interfaceC1058a, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(interfaceC1058a != null ? interfaceC1058a.asBinder() : null);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f11274a.transact(10, parcelObtain, parcelObtain2, 0) && a.getDefaultImpl() != null) {
                        boolean zNewSessionWithExtras = a.getDefaultImpl().newSessionWithExtras(interfaceC1058a, bundle);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return zNewSessionWithExtras;
                    }
                    parcelObtain2.readException();
                    boolean z8 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z8;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // b.InterfaceC1059b
            public int postMessage(InterfaceC1058a interfaceC1058a, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(interfaceC1058a != null ? interfaceC1058a.asBinder() : null);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f11274a.transact(8, parcelObtain, parcelObtain2, 0) && a.getDefaultImpl() != null) {
                        int iPostMessage = a.getDefaultImpl().postMessage(interfaceC1058a, str, bundle);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return iPostMessage;
                    }
                    parcelObtain2.readException();
                    int i8 = parcelObtain2.readInt();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return i8;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // b.InterfaceC1059b
            public boolean receiveFile(InterfaceC1058a interfaceC1058a, Uri uri, int i8, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(interfaceC1058a != null ? interfaceC1058a.asBinder() : null);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i8);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f11274a.transact(12, parcelObtain, parcelObtain2, 0) && a.getDefaultImpl() != null) {
                        boolean zReceiveFile = a.getDefaultImpl().receiveFile(interfaceC1058a, uri, i8, bundle);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return zReceiveFile;
                    }
                    parcelObtain2.readException();
                    boolean z8 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z8;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // b.InterfaceC1059b
            public boolean requestPostMessageChannel(InterfaceC1058a interfaceC1058a, Uri uri) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(interfaceC1058a != null ? interfaceC1058a.asBinder() : null);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f11274a.transact(7, parcelObtain, parcelObtain2, 0) && a.getDefaultImpl() != null) {
                        boolean zRequestPostMessageChannel = a.getDefaultImpl().requestPostMessageChannel(interfaceC1058a, uri);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return zRequestPostMessageChannel;
                    }
                    parcelObtain2.readException();
                    boolean z8 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z8;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // b.InterfaceC1059b
            public boolean requestPostMessageChannelWithExtras(InterfaceC1058a interfaceC1058a, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(interfaceC1058a != null ? interfaceC1058a.asBinder() : null);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f11274a.transact(11, parcelObtain, parcelObtain2, 0) && a.getDefaultImpl() != null) {
                        boolean zRequestPostMessageChannelWithExtras = a.getDefaultImpl().requestPostMessageChannelWithExtras(interfaceC1058a, uri, bundle);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return zRequestPostMessageChannelWithExtras;
                    }
                    parcelObtain2.readException();
                    boolean z8 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z8;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // b.InterfaceC1059b
            public boolean updateVisuals(InterfaceC1058a interfaceC1058a, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(interfaceC1058a != null ? interfaceC1058a.asBinder() : null);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f11274a.transact(6, parcelObtain, parcelObtain2, 0) && a.getDefaultImpl() != null) {
                        boolean zUpdateVisuals = a.getDefaultImpl().updateVisuals(interfaceC1058a, bundle);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return zUpdateVisuals;
                    }
                    parcelObtain2.readException();
                    boolean z8 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z8;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // b.InterfaceC1059b
            public boolean validateRelationship(InterfaceC1058a interfaceC1058a, int i8, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(interfaceC1058a != null ? interfaceC1058a.asBinder() : null);
                    parcelObtain.writeInt(i8);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f11274a.transact(9, parcelObtain, parcelObtain2, 0) && a.getDefaultImpl() != null) {
                        boolean zValidateRelationship = a.getDefaultImpl().validateRelationship(interfaceC1058a, i8, uri, bundle);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return zValidateRelationship;
                    }
                    parcelObtain2.readException();
                    boolean z8 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z8;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // b.InterfaceC1059b
            public boolean warmup(long j8) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeLong(j8);
                    if (!this.f11274a.transact(2, parcelObtain, parcelObtain2, 0) && a.getDefaultImpl() != null) {
                        return a.getDefaultImpl().warmup(j8);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsService");
        }

        public static InterfaceC1059b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1059b)) ? new C0185a(iBinder) : (InterfaceC1059b) iInterfaceQueryLocalInterface;
        }

        public static InterfaceC1059b getDefaultImpl() {
            return C0185a.sDefaultImpl;
        }

        public static boolean setDefaultImpl(InterfaceC1059b interfaceC1059b) {
            if (C0185a.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (interfaceC1059b == null) {
                return false;
            }
            C0185a.sDefaultImpl = interfaceC1059b;
            return true;
        }

        public abstract /* synthetic */ Bundle extraCommand(String str, Bundle bundle);

        public abstract /* synthetic */ boolean mayLaunchUrl(InterfaceC1058a interfaceC1058a, Uri uri, Bundle bundle, List list);

        public abstract /* synthetic */ boolean newSession(InterfaceC1058a interfaceC1058a);

        public abstract /* synthetic */ boolean newSessionWithExtras(InterfaceC1058a interfaceC1058a, Bundle bundle);

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 == 1598968902) {
                parcel2.writeString("android.support.customtabs.ICustomTabsService");
                return true;
            }
            switch (i8) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zWarmup = warmup(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zWarmup ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zNewSession = newSession(InterfaceC1058a.AbstractBinderC0183a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zNewSession ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMayLaunchUrl = mayLaunchUrl(InterfaceC1058a.AbstractBinderC0183a.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.createTypedArrayList(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zMayLaunchUrl ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    Bundle bundleExtraCommand = extraCommand(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (bundleExtraCommand != null) {
                        parcel2.writeInt(1);
                        bundleExtraCommand.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zUpdateVisuals = updateVisuals(InterfaceC1058a.AbstractBinderC0183a.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zUpdateVisuals ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zRequestPostMessageChannel = requestPostMessageChannel(InterfaceC1058a.AbstractBinderC0183a.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestPostMessageChannel ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    int iPostMessage = postMessage(InterfaceC1058a.AbstractBinderC0183a.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(iPostMessage);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zValidateRelationship = validateRelationship(InterfaceC1058a.AbstractBinderC0183a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zValidateRelationship ? 1 : 0);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zNewSessionWithExtras = newSessionWithExtras(InterfaceC1058a.AbstractBinderC0183a.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zNewSessionWithExtras ? 1 : 0);
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(InterfaceC1058a.AbstractBinderC0183a.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestPostMessageChannelWithExtras ? 1 : 0);
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zReceiveFile = receiveFile(InterfaceC1058a.AbstractBinderC0183a.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zReceiveFile ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i8, parcel, parcel2, i9);
            }
        }

        public abstract /* synthetic */ int postMessage(InterfaceC1058a interfaceC1058a, String str, Bundle bundle);

        public abstract /* synthetic */ boolean receiveFile(InterfaceC1058a interfaceC1058a, Uri uri, int i8, Bundle bundle);

        public abstract /* synthetic */ boolean requestPostMessageChannel(InterfaceC1058a interfaceC1058a, Uri uri);

        public abstract /* synthetic */ boolean requestPostMessageChannelWithExtras(InterfaceC1058a interfaceC1058a, Uri uri, Bundle bundle);

        public abstract /* synthetic */ boolean updateVisuals(InterfaceC1058a interfaceC1058a, Bundle bundle);

        public abstract /* synthetic */ boolean validateRelationship(InterfaceC1058a interfaceC1058a, int i8, Uri uri, Bundle bundle);

        public abstract /* synthetic */ boolean warmup(long j8);

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
