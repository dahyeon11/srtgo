package P0;

import H0.d;
import H0.v;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* loaded from: classes.dex */
public abstract class x {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3675a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f3676b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f3677c;

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f3678d;

        static {
            int[] iArr = new int[H0.p.values().length];
            f3678d = iArr;
            try {
                iArr[H0.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3678d[H0.p.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[H0.m.values().length];
            f3677c = iArr2;
            try {
                iArr2[H0.m.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3677c[H0.m.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3677c[H0.m.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3677c[H0.m.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3677c[H0.m.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[H0.a.values().length];
            f3676b = iArr3;
            try {
                iArr3[H0.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3676b[H0.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[v.a.values().length];
            f3675a = iArr4;
            try {
                iArr4[v.a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3675a[v.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3675a[v.a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3675a[v.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3675a[v.a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3675a[v.a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static int backoffPolicyToInt(H0.a aVar) {
        int i8 = a.f3676b[aVar.ordinal()];
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + aVar + " to int");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static H0.d byteArrayToContentUriTriggers(byte[] r6) throws java.lang.Throwable {
        /*
            H0.d r0 = new H0.d
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            int r6 = r2.readInt()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
        L17:
            if (r6 <= 0) goto L2f
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            r0.add(r3, r4)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r6 = move-exception
            goto L59
        L2d:
            r6 = move-exception
            goto L48
        L2f:
            r2.close()     // Catch: java.io.IOException -> L33
            goto L37
        L33:
            r6 = move-exception
            r6.printStackTrace()
        L37:
            r1.close()     // Catch: java.io.IOException -> L3b
            goto L58
        L3b:
            r6 = move-exception
            r6.printStackTrace()
            goto L58
        L40:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L59
        L44:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L48:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r6 = move-exception
            r6.printStackTrace()
        L55:
            r1.close()     // Catch: java.io.IOException -> L3b
        L58:
            return r0
        L59:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L5f
            goto L63
        L5f:
            r0 = move-exception
            r0.printStackTrace()
        L63:
            r1.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r0 = move-exception
            r0.printStackTrace()
        L6b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.x.byteArrayToContentUriTriggers(byte[]):H0.d");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0053 -> B:34:0x006a). Please report as a decompilation issue!!! */
    public static byte[] contentUriTriggersToByteArray(H0.d dVar) throws Throwable {
        ObjectOutputStream objectOutputStream = null;
        if (dVar.size() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream2.writeInt(dVar.size());
                        for (d.a aVar : dVar.getTriggers()) {
                            objectOutputStream2.writeUTF(aVar.getUri().toString());
                            objectOutputStream2.writeBoolean(aVar.shouldTriggerForDescendants());
                        }
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                        byteArrayOutputStream.close();
                    } catch (IOException e9) {
                        e = e9;
                        objectOutputStream = objectOutputStream2;
                        e.printStackTrace();
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        }
                        byteArrayOutputStream.close();
                        return byteArrayOutputStream.toByteArray();
                    } catch (Throwable th) {
                        th = th;
                        objectOutputStream = objectOutputStream2;
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException e12) {
                            e12.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e13) {
                e = e13;
            }
        } catch (IOException e14) {
            e14.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static H0.a intToBackoffPolicy(int i8) {
        if (i8 == 0) {
            return H0.a.EXPONENTIAL;
        }
        if (i8 == 1) {
            return H0.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i8 + " to BackoffPolicy");
    }

    public static H0.m intToNetworkType(int i8) {
        if (i8 == 0) {
            return H0.m.NOT_REQUIRED;
        }
        if (i8 == 1) {
            return H0.m.CONNECTED;
        }
        if (i8 == 2) {
            return H0.m.UNMETERED;
        }
        if (i8 == 3) {
            return H0.m.NOT_ROAMING;
        }
        if (i8 == 4) {
            return H0.m.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i8 == 5) {
            return H0.m.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i8 + " to NetworkType");
    }

    public static H0.p intToOutOfQuotaPolicy(int i8) {
        if (i8 == 0) {
            return H0.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i8 == 1) {
            return H0.p.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i8 + " to OutOfQuotaPolicy");
    }

    public static v.a intToState(int i8) {
        if (i8 == 0) {
            return v.a.ENQUEUED;
        }
        if (i8 == 1) {
            return v.a.RUNNING;
        }
        if (i8 == 2) {
            return v.a.SUCCEEDED;
        }
        if (i8 == 3) {
            return v.a.FAILED;
        }
        if (i8 == 4) {
            return v.a.BLOCKED;
        }
        if (i8 == 5) {
            return v.a.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i8 + " to State");
    }

    public static int networkTypeToInt(H0.m mVar) {
        int i8 = a.f3677c[mVar.ordinal()];
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        if (i8 == 3) {
            return 2;
        }
        if (i8 == 4) {
            return 3;
        }
        if (i8 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && mVar == H0.m.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + mVar + " to int");
    }

    public static int outOfQuotaPolicyToInt(H0.p pVar) {
        int i8 = a.f3678d[pVar.ordinal()];
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + pVar + " to int");
    }

    public static int stateToInt(v.a aVar) {
        switch (a.f3675a[aVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + aVar + " to int");
        }
    }
}
