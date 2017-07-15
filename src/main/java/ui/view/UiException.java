package ui.view;

import javax.management.relation.RelationNotFoundException;

/**
 * Created by yanice on 15/07/2017.
 */
public class UiException extends RuntimeException {
    public UiException(String s) {
        super(s);
    }
}
