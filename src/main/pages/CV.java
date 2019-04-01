package com.andersen.cv.data;

import javax.annotation.concurrent.Immutable;
import java.util.Objects;

/**
 * Contains data about CV from different job search sites.
 */
@Immutable
public class CV {

    private final String id;

    public CV(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CV{" +
                "id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CV cv = (CV) o;
        return Objects.equals(id, cv.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
