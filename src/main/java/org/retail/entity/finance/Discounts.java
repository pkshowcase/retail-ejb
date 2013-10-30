package org.retail.entity.finance;

import java.math.BigDecimal;
import org.joda.time.DateTime;
import org.retail.entity.Family;
import org.retail.entity.Feature;
import org.retail.entity.Item;

/**
 *
 * @author Paul Kulitski
 */
public class Discounts {

    Item item;
    Feature feature;
    Family family;
    BigDecimal value;
    DateTime endorsedFrom;
}
