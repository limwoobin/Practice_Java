package ch08;

public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보하세요.");
        } catch (MemoryException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("메모리를 확보하세요.");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException , MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족.");
        }

        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족.");
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

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}