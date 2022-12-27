package org.example.CustomExceptionHandler;

public class CustomExeption {
    //Empty String
    public static class EmptyString extends BaseException {
        private static final long serialVersionUID = 3555714415375055302L;
        public EmptyString(String msg) {
            super(msg);
        }
    }

    //Speacial Charcter String
    public static class InvalidString extends BaseException {
        private static final long serialVersionUID = 4235225697094262603L;

        public InvalidString(String msg) {
            super(msg);
        }
    }
}
