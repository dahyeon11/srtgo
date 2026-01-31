package com.h2osystech.smartalimi.aidllib;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes2.dex */
public interface ServiceAlimiInterface extends IInterface {

    public static class Default implements ServiceAlimiInterface {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public void enableLog(boolean z8) {
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int erbAddregist(String str, String str2) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int erbDelregist(String str, String str2) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int erbTerm() {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public List getAllCurrentMsg() {
            return null;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public List getAllMsg() {
            return null;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int getBeforeMsg(int i8) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int getNotiDisable() {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int getNotiThreadTime() {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int getNotiType() {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public String getPushOnOff() {
            return null;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public String getReadMsg(String str) {
            return null;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public String getSavedUserID() {
            return null;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public String getSenderBySeq(String str) {
            return null;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int getSortType() {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public MSGVo getUniqMsg(String str) {
            return null;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int newMsgCount() {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int readCheck(String str, List list) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int removeAllMsg() {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int removeBySeq(String str) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int removeListItem(String str) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public List selectGroupID(String str) {
            return null;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public List selectSearchItems(String str) {
            return null;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int selectSearchValuesCount(String str) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int setAllReadCheck() {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int setAppType(String str) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int setBedgeCountPackage(String str) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int setBroadcastOpt(boolean z8) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int setGCMtoSaveMode(int i8) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int setLogin(String str, String str2, int i8) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public boolean setLogout() {
            return false;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int setNotiDisable(int i8) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int setNotiThreadTime(int i8) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int setNotiType(int i8) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int setPhoneNumber(String str) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int setPushOnOff(String str) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int setReadChk(String str, String str2) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int setReadMsg(String str) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int setServerIPPort(String str, String str2) {
            return 0;
        }

        @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
        public int setSortType(int i8) {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements ServiceAlimiInterface {
        private static final String DESCRIPTOR = "com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface";
        static final int TRANSACTION_enableLog = 32;
        static final int TRANSACTION_erbAddregist = 36;
        static final int TRANSACTION_erbDelregist = 37;
        static final int TRANSACTION_erbTerm = 35;
        static final int TRANSACTION_getAllCurrentMsg = 5;
        static final int TRANSACTION_getAllMsg = 4;
        static final int TRANSACTION_getBeforeMsg = 30;
        static final int TRANSACTION_getNotiDisable = 23;
        static final int TRANSACTION_getNotiThreadTime = 25;
        static final int TRANSACTION_getNotiType = 21;
        static final int TRANSACTION_getPushOnOff = 16;
        static final int TRANSACTION_getReadMsg = 15;
        static final int TRANSACTION_getSavedUserID = 3;
        static final int TRANSACTION_getSenderBySeq = 13;
        static final int TRANSACTION_getSortType = 19;
        static final int TRANSACTION_getUniqMsg = 9;
        static final int TRANSACTION_newMsgCount = 34;
        static final int TRANSACTION_readCheck = 33;
        static final int TRANSACTION_removeAllMsg = 6;
        static final int TRANSACTION_removeBySeq = 12;
        static final int TRANSACTION_removeListItem = 7;
        static final int TRANSACTION_selectGroupID = 8;
        static final int TRANSACTION_selectSearchItems = 11;
        static final int TRANSACTION_selectSearchValuesCount = 10;
        static final int TRANSACTION_setAllReadCheck = 27;
        static final int TRANSACTION_setAppType = 31;
        static final int TRANSACTION_setBedgeCountPackage = 26;
        static final int TRANSACTION_setBroadcastOpt = 40;
        static final int TRANSACTION_setGCMtoSaveMode = 38;
        static final int TRANSACTION_setLogin = 1;
        static final int TRANSACTION_setLogout = 2;
        static final int TRANSACTION_setNotiDisable = 22;
        static final int TRANSACTION_setNotiThreadTime = 24;
        static final int TRANSACTION_setNotiType = 20;
        static final int TRANSACTION_setPhoneNumber = 29;
        static final int TRANSACTION_setPushOnOff = 17;
        static final int TRANSACTION_setReadChk = 39;
        static final int TRANSACTION_setReadMsg = 14;
        static final int TRANSACTION_setServerIPPort = 28;
        static final int TRANSACTION_setSortType = 18;

        private static class Proxy implements ServiceAlimiInterface {
            public static ServiceAlimiInterface sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public void enableLog(boolean z8) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z8 ? 1 : 0);
                    if (this.mRemote.transact(32, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().enableLog(z8);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int erbAddregist(String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.mRemote.transact(36, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().erbAddregist(str, str2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int erbDelregist(String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.mRemote.transact(37, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().erbDelregist(str, str2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int erbTerm() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(35, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().erbTerm();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public List getAllCurrentMsg() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAllCurrentMsg();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public List getAllMsg() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAllMsg();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int getBeforeMsg(int i8) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i8);
                    if (!this.mRemote.transact(30, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getBeforeMsg(i8);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int getNotiDisable() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(23, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNotiDisable();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int getNotiThreadTime() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(25, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNotiThreadTime();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int getNotiType() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(21, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNotiType();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public String getPushOnOff() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(16, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPushOnOff();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public String getReadMsg(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(15, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getReadMsg(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public String getSavedUserID() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSavedUserID();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public String getSenderBySeq(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(13, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSenderBySeq(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int getSortType() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(19, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSortType();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public MSGVo getUniqMsg(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(9, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getUniqMsg(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? MSGVo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int newMsgCount() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(34, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().newMsgCount();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int readCheck(String str, List list) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeList(list);
                    if (!this.mRemote.transact(33, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().readCheck(str, list);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int removeAllMsg() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().removeAllMsg();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int removeBySeq(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(12, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().removeBySeq(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int removeListItem(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().removeListItem(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public List selectGroupID(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(8, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().selectGroupID(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public List selectSearchItems(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(11, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().selectSearchItems(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int selectSearchValuesCount(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(10, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().selectSearchValuesCount(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int setAllReadCheck() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(27, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setAllReadCheck();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int setAppType(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(31, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setAppType(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int setBedgeCountPackage(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(26, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setBedgeCountPackage(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int setBroadcastOpt(boolean z8) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z8 ? 1 : 0);
                    if (!this.mRemote.transact(40, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setBroadcastOpt(z8);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int setGCMtoSaveMode(int i8) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i8);
                    if (!this.mRemote.transact(38, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setGCMtoSaveMode(i8);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int setLogin(String str, String str2, int i8) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i8);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setLogin(str, str2, i8);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public boolean setLogout() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setLogout();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int setNotiDisable(int i8) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i8);
                    if (!this.mRemote.transact(22, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setNotiDisable(i8);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int setNotiThreadTime(int i8) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i8);
                    if (!this.mRemote.transact(24, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setNotiThreadTime(i8);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int setNotiType(int i8) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i8);
                    if (!this.mRemote.transact(20, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setNotiType(i8);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int setPhoneNumber(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(29, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setPhoneNumber(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int setPushOnOff(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(17, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setPushOnOff(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int setReadChk(String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.mRemote.transact(39, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setReadChk(str, str2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int setReadMsg(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(14, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setReadMsg(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int setServerIPPort(String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.mRemote.transact(28, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setServerIPPort(str, str2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
            public int setSortType(int i8) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i8);
                    if (!this.mRemote.transact(18, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setSortType(i8);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ServiceAlimiInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ServiceAlimiInterface)) ? new Proxy(iBinder) : (ServiceAlimiInterface) iInterfaceQueryLocalInterface;
        }

        public static ServiceAlimiInterface getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ServiceAlimiInterface serviceAlimiInterface) {
            if (Proxy.sDefaultImpl != null || serviceAlimiInterface == null) {
                return false;
            }
            Proxy.sDefaultImpl = serviceAlimiInterface;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i8) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    int login = setLogin(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(login);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean logout = setLogout();
                    parcel2.writeNoException();
                    parcel2.writeInt(logout ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    String savedUserID = getSavedUserID();
                    parcel2.writeNoException();
                    parcel2.writeString(savedUserID);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    List allMsg = getAllMsg();
                    parcel2.writeNoException();
                    parcel2.writeList(allMsg);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    List allCurrentMsg = getAllCurrentMsg();
                    parcel2.writeNoException();
                    parcel2.writeList(allCurrentMsg);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iRemoveAllMsg = removeAllMsg();
                    parcel2.writeNoException();
                    parcel2.writeInt(iRemoveAllMsg);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iRemoveListItem = removeListItem(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iRemoveListItem);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    List listSelectGroupID = selectGroupID(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeList(listSelectGroupID);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    MSGVo uniqMsg = getUniqMsg(parcel.readString());
                    parcel2.writeNoException();
                    if (uniqMsg != null) {
                        parcel2.writeInt(1);
                        uniqMsg.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iSelectSearchValuesCount = selectSearchValuesCount(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iSelectSearchValuesCount);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    List listSelectSearchItems = selectSearchItems(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeList(listSelectSearchItems);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iRemoveBySeq = removeBySeq(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iRemoveBySeq);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    String senderBySeq = getSenderBySeq(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(senderBySeq);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readMsg = setReadMsg(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(readMsg);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readMsg2 = getReadMsg(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(readMsg2);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    String pushOnOff = getPushOnOff();
                    parcel2.writeNoException();
                    parcel2.writeString(pushOnOff);
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    int pushOnOff2 = setPushOnOff(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(pushOnOff2);
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    int sortType = setSortType(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(sortType);
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    int sortType2 = getSortType();
                    parcel2.writeNoException();
                    parcel2.writeInt(sortType2);
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    int notiType = setNotiType(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(notiType);
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    int notiType2 = getNotiType();
                    parcel2.writeNoException();
                    parcel2.writeInt(notiType2);
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    int notiDisable = setNotiDisable(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(notiDisable);
                    return true;
                case 23:
                    parcel.enforceInterface(DESCRIPTOR);
                    int notiDisable2 = getNotiDisable();
                    parcel2.writeNoException();
                    parcel2.writeInt(notiDisable2);
                    return true;
                case 24:
                    parcel.enforceInterface(DESCRIPTOR);
                    int notiThreadTime = setNotiThreadTime(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(notiThreadTime);
                    return true;
                case 25:
                    parcel.enforceInterface(DESCRIPTOR);
                    int notiThreadTime2 = getNotiThreadTime();
                    parcel2.writeNoException();
                    parcel2.writeInt(notiThreadTime2);
                    return true;
                case 26:
                    parcel.enforceInterface(DESCRIPTOR);
                    int bedgeCountPackage = setBedgeCountPackage(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(bedgeCountPackage);
                    return true;
                case 27:
                    parcel.enforceInterface(DESCRIPTOR);
                    int allReadCheck = setAllReadCheck();
                    parcel2.writeNoException();
                    parcel2.writeInt(allReadCheck);
                    return true;
                case 28:
                    parcel.enforceInterface(DESCRIPTOR);
                    int serverIPPort = setServerIPPort(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(serverIPPort);
                    return true;
                case 29:
                    parcel.enforceInterface(DESCRIPTOR);
                    int phoneNumber = setPhoneNumber(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(phoneNumber);
                    return true;
                case 30:
                    parcel.enforceInterface(DESCRIPTOR);
                    int beforeMsg = getBeforeMsg(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(beforeMsg);
                    return true;
                case 31:
                    parcel.enforceInterface(DESCRIPTOR);
                    int appType = setAppType(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(appType);
                    return true;
                case 32:
                    parcel.enforceInterface(DESCRIPTOR);
                    enableLog(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 33:
                    parcel.enforceInterface(DESCRIPTOR);
                    int check = readCheck(parcel.readString(), parcel.readArrayList(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeInt(check);
                    return true;
                case 34:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iNewMsgCount = newMsgCount();
                    parcel2.writeNoException();
                    parcel2.writeInt(iNewMsgCount);
                    return true;
                case 35:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iErbTerm = erbTerm();
                    parcel2.writeNoException();
                    parcel2.writeInt(iErbTerm);
                    return true;
                case 36:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iErbAddregist = erbAddregist(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iErbAddregist);
                    return true;
                case 37:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iErbDelregist = erbDelregist(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iErbDelregist);
                    return true;
                case 38:
                    parcel.enforceInterface(DESCRIPTOR);
                    int gCMtoSaveMode = setGCMtoSaveMode(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(gCMtoSaveMode);
                    return true;
                case 39:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readChk = setReadChk(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(readChk);
                    return true;
                case 40:
                    parcel.enforceInterface(DESCRIPTOR);
                    int broadcastOpt = setBroadcastOpt(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(broadcastOpt);
                    return true;
                default:
                    return super.onTransact(i8, parcel, parcel2, i9);
            }
        }
    }

    void enableLog(boolean z8);

    int erbAddregist(String str, String str2);

    int erbDelregist(String str, String str2);

    int erbTerm();

    List getAllCurrentMsg();

    List getAllMsg();

    int getBeforeMsg(int i8);

    int getNotiDisable();

    int getNotiThreadTime();

    int getNotiType();

    String getPushOnOff();

    String getReadMsg(String str);

    String getSavedUserID();

    String getSenderBySeq(String str);

    int getSortType();

    MSGVo getUniqMsg(String str);

    int newMsgCount();

    int readCheck(String str, List list);

    int removeAllMsg();

    int removeBySeq(String str);

    int removeListItem(String str);

    List selectGroupID(String str);

    List selectSearchItems(String str);

    int selectSearchValuesCount(String str);

    int setAllReadCheck();

    int setAppType(String str);

    int setBedgeCountPackage(String str);

    int setBroadcastOpt(boolean z8);

    int setGCMtoSaveMode(int i8);

    int setLogin(String str, String str2, int i8);

    boolean setLogout();

    int setNotiDisable(int i8);

    int setNotiThreadTime(int i8);

    int setNotiType(int i8);

    int setPhoneNumber(String str);

    int setPushOnOff(String str);

    int setReadChk(String str, String str2);

    int setReadMsg(String str);

    int setServerIPPort(String str, String str2);

    int setSortType(int i8);
}
