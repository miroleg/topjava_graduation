package ru.artemaa.topjavagraduate.util.exception;

import java.time.LocalTime;

/**
 * @author Artem Areshko
 * 21.06.2017
 */
public class LateVoteException extends RuntimeException {

    public LateVoteException(LocalTime deadline) {
        super("Can't change vote after " + deadline.toString());
    }

}
