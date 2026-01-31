package h3;

import e3.w;
import java.io.BufferedWriter;
import java.io.Writer;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class j {
    protected j() {
    }

    public Writer openBufferedStream() {
        Writer writerOpenStream = openStream();
        return writerOpenStream instanceof BufferedWriter ? (BufferedWriter) writerOpenStream : new BufferedWriter(writerOpenStream);
    }

    public abstract Writer openStream();

    public void write(CharSequence charSequence) throws X {
        w.checkNotNull(charSequence);
        try {
            Writer writer = (Writer) n.create().register(openStream());
            writer.append(charSequence);
            writer.flush();
        } finally {
        }
    }

    public long writeFrom(Readable readable) throws X {
        w.checkNotNull(readable);
        try {
            Writer writer = (Writer) n.create().register(openStream());
            long jCopy = l.copy(readable, writer);
            writer.flush();
            return jCopy;
        } finally {
        }
    }

    public void writeLines(Iterable<? extends CharSequence> iterable) throws X {
        writeLines(iterable, System.getProperty("line.separator"));
    }

    public void writeLines(Iterable<? extends CharSequence> iterable, String str) throws X {
        w.checkNotNull(iterable);
        w.checkNotNull(str);
        try {
            Writer writer = (Writer) n.create().register(openBufferedStream());
            Iterator<? extends CharSequence> it = iterable.iterator();
            while (it.hasNext()) {
                writer.append(it.next()).append((CharSequence) str);
            }
            writer.flush();
        } finally {
        }
    }
}
