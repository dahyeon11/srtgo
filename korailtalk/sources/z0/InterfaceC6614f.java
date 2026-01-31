package z0;

/* renamed from: z0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6614f extends InterfaceC6612d {
    @Override // z0.InterfaceC6612d
    /* synthetic */ void bindBlob(int i8, byte[] bArr);

    @Override // z0.InterfaceC6612d
    /* synthetic */ void bindDouble(int i8, double d9);

    @Override // z0.InterfaceC6612d
    /* synthetic */ void bindLong(int i8, long j8);

    @Override // z0.InterfaceC6612d
    /* synthetic */ void bindNull(int i8);

    @Override // z0.InterfaceC6612d
    /* synthetic */ void bindString(int i8, String str);

    @Override // z0.InterfaceC6612d
    /* synthetic */ void clearBindings();

    void execute();

    long executeInsert();

    int executeUpdateDelete();

    long simpleQueryForLong();

    String simpleQueryForString();
}
