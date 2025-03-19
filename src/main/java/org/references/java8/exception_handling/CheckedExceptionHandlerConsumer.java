package org.references.java8.exception_handling;

@FunctionalInterface
public interface CheckedExceptionHandlerConsumer<Target,ExObj extends Exception> {

    public void accept(Target target) throws ExObj;
}
