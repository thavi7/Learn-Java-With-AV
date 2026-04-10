package GeninException;
/*
Java does not support generic exceptions due to type erasure.

Type erasure means that generic type information is removed at runtime.

Since exceptions are closely tied to runtime operations (like catching them in try-catch blocks),
having generic exceptions wouldn't work as expected.

For example, if you had an exception like MyGenericException<T>,
you wouldn’t be able to catch it with a specific type parameter
because that type information would be erased at runtime.
 */
public class Test {

}
