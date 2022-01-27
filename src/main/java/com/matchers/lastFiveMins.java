package com.matchers;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import java.time.LocalDateTime;

public class lastFiveMins extends TypeSafeMatcher<LocalDateTime> {
    @Override
    protected boolean matchesSafely(LocalDateTime actual) {
        LocalDateTime fiveMinsAgo = LocalDateTime.now().minusMinutes(5);
        return actual.isAfter(fiveMinsAgo) && actual.isBefore(LocalDateTime.now());
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("date is not in last five mins");
    }

    public static lastFiveMins inLastFiveMins() {
        return new lastFiveMins();
    }
}
