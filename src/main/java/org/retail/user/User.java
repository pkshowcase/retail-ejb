package org.retail.user;

/**
 *
 * @author Paul Kulitski
 */
public class User {

    String username;
    transient String password;
    String authorities;
    Long customerId;
}
