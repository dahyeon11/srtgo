package x0;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;
import z0.InterfaceC6610b;
import z0.InterfaceC6613e;

/* loaded from: classes.dex */
public abstract class c {
    public static CancellationSignal createCancellationSignal() {
        return new CancellationSignal();
    }

    public static void dropFtsSyncTriggers(InterfaceC6610b interfaceC6610b) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor cursorQuery = interfaceC6610b.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(cursorQuery.getString(0));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                interfaceC6610b.execSQL("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    @Deprecated
    public static Cursor query(h hVar, InterfaceC6613e interfaceC6613e, boolean z8) {
        return query(hVar, interfaceC6613e, z8, null);
    }

    public static int readVersion(File file) throws IOException {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i8 = byteBufferAllocate.getInt();
            channel.close();
            return i8;
        } catch (Throwable th) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            throw th;
        }
    }

    public static Cursor query(h hVar, InterfaceC6613e interfaceC6613e, boolean z8, CancellationSignal cancellationSignal) {
        Cursor cursorQuery = hVar.query(interfaceC6613e, cancellationSignal);
        if (!z8 || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? AbstractC6482b.copyAndClose(abstractWindowedCursor) : cursorQuery;
    }
}
