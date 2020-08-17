package ch08;

public class ChainedExceptionEx {
    public static void main(String[] args) throws InstallException {
        install();
    }

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException2 e) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(e);
            throw ie;
        } catch (MemoryException2 e) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(e);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException2 , MemoryException2 {
        if (!enoughSpace()) {
            throw new SpaceException2("설치할 공간이 부족");
        }

        if (!enoughMemory()) {
            throw new MemoryException2("메모리 부족");
        }
    }

    static void copyFiles() {}
    static void deleteTempFiles() {}

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }
}

class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class SpaceException2 extends Exception {
    SpaceException2(String msg) {
        super(msg);
    }
}

class MemoryException2 extends Exception {
    MemoryException2(String msg) {
        super(msg);
    }
}
