package org.sathish.assignment8;

//three custom exceptions
class FirstException extends Exception {
    public FirstException(String message) {
        super(message);
    }
}

class SecondException extends Exception {
    public SecondException(String message) {
        super(message);
    }
}

class ThirdException extends Exception {
    public ThirdException(String message) {
        super(message);
    }
}


// Class with a method that can throw the exceptions
class ExceptionThrower {
    public void throwExceptions(int type) throws FirstException, SecondException, ThirdException {
        if (type == 4) {
            throw new FirstException("FirstException occurred");
        } else if (type == 2) {
            throw new SecondException("SecondException occurred");
        } else if (type == 3) {
            throw new ThirdException("ThirdException occurred");
        } else if (type == 4) {
            throw new NullPointerException("NullPointerException occurred");
        }
    }
}
public class ExceptionTest{
    public static void main(String[] args) {
        ExceptionThrower thrower = new ExceptionThrower();

        try {
            int exceptionType = 2;
            thrower.throwExceptions(exceptionType);
        } catch (FirstException | SecondException | ThirdException e) {
            System.out.println("Caught one of the custom exceptions: " + e.getMessage());
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException: " + npe.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}