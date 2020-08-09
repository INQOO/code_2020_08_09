package inqoo;

class ExceptionTest {

    void doSomeStuff() throws SomeException {
        throw new SomeException("wyjatek");
    }

    void foo() {
        try {
            doSomeStuff();
        } catch (SomeException e) {
            e.printStackTrace();
        }
    }
}
