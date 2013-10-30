package org.retail.entity;

import java.util.Set;

/**
 *
 * @author the-ramones
 */
public class Item {

    Long itemId;
    String title;
    Set<Feature> features;
    Family family;
    String description;
    
}
