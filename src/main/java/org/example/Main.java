package org.example;

import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ImmutableList<String> items = ImmutableList.of("a", "b", "c");
        String value = StringUtils.join(items, ", ");
        log.info("Items: {}", value);

        // NumberEquality: comparing Integer objects with == instead of .equals()
        Integer x = Integer.valueOf(args.length);
        Integer y = Integer.valueOf(42);
        if (x == y) {                    // triggers NumberEquality inspection (has autofix)
            log.info("equal");
        }
        if (x != y) {                    // another NumberEquality
            log.info("not equal");
        }

        // Duplicate code block 1
        for (String item : items) {
            String upper = item.toUpperCase();
            String trimmed = upper.trim();
            log.debug("Processed: {}", trimmed);
        }

        // Duplicate code block 2
        for (String item : items) {
            String upper = item.toUpperCase();
            String trimmed = upper.trim();
            log.debug("Processed: {}", trimmed);
        }
    }
}
