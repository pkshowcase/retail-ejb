package org.retail.entity.finance;

import java.math.BigDecimal;
import org.joda.time.DateTime;
import org.retail.entity.Feature;
import org.retail.entity.Item;

/**
 *
 * @author Paul Kulitski
 */
public class Price {

    Item item;
    Feature feature;
    BigDecimal value;
    DateTime endorsedFrom;
}
