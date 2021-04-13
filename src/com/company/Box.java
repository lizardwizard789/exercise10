package com.company;

import java.util.Iterator;

public class Box implements Iterable<Contact>{
    private Contact[] theBox;

    public Contact[] getTheBox() {
        return theBox;
    }

    public void setTheBox(Contact[] theBox) {
        this.theBox = theBox;
    }

    @Override
    public Iterator<Contact> iterator() {
        return new BoxChecker<Contact>(getTheBox());
    }

    public Box(Contact[] theBox) {
        this.theBox = theBox;
    }

    public class BoxChecker<Contact> implements Iterator<Contact> {
        int size;
        int cursor;
        Contact[] innerBox;

        public BoxChecker(Contact[] innerBox) {
            this.size=getTheBox().length;
            this.cursor = 0;
            this.innerBox = innerBox;
        }

        @Override
        public boolean hasNext() {
            return cursor!=innerBox.length;
        }

        @Override
        public Contact next() {
            cursor++;
            return innerBox[cursor-1];

        }
    }
}
