package retrofit;

import java.io.IOException;
import java.io.InputStream;
import retrofit.mime.TypedInput;

/* loaded from: classes3.dex */
class ExceptionCatchingTypedInput implements TypedInput {
    private final TypedInput delegate;
    private final ExceptionCatchingInputStream delegateStream;

    ExceptionCatchingTypedInput(TypedInput typedInput) {
        this.delegate = typedInput;
        this.delegateStream = new ExceptionCatchingInputStream(typedInput.in());
    }

    IOException getThrownException() {
        return this.delegateStream.thrownException;
    }

    @Override // retrofit.mime.TypedInput
    public InputStream in() {
        return this.delegateStream;
    }

    @Override // retrofit.mime.TypedInput
    public long length() {
        return this.delegate.length();
    }

    @Override // retrofit.mime.TypedInput
    public String mimeType() {
        return this.delegate.mimeType();
    }

    boolean threwException() {
        return this.delegateStream.thrownException != null;
    }

    private static class ExceptionCatchingInputStream extends InputStream {
        private final InputStream delegate;
        private IOException thrownException;

        ExceptionCatchingInputStream(InputStream inputStream) {
            this.delegate = inputStream;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            try {
                return this.delegate.available();
            } catch (IOException e8) {
                this.thrownException = e8;
                throw e8;
            }
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.delegate.close();
            } catch (IOException e8) {
                this.thrownException = e8;
                throw e8;
            }
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i8) {
            this.delegate.mark(i8);
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.delegate.markSupported();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.delegate.read();
            } catch (IOException e8) {
                this.thrownException = e8;
                throw e8;
            }
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            try {
                this.delegate.reset();
            } catch (IOException e8) {
                this.thrownException = e8;
                throw e8;
            }
        }

        @Override // java.io.InputStream
        public long skip(long j8) throws IOException {
            try {
                return this.delegate.skip(j8);
            } catch (IOException e8) {
                this.thrownException = e8;
                throw e8;
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            try {
                return this.delegate.read(bArr);
            } catch (IOException e8) {
                this.thrownException = e8;
                throw e8;
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) throws IOException {
            try {
                return this.delegate.read(bArr, i8, i9);
            } catch (IOException e8) {
                this.thrownException = e8;
                throw e8;
            }
        }
    }
}
