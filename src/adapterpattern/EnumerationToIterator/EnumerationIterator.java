package adapterpattern.EnumerationToIterator;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author : 조재철
 * @since 1.0
 */
public class EnumerationIterator implements Iterator<Object> {

    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}