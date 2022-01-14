package common;

import java.util.Objects;

public class Location {
private final File file;
private final Integer rank;

public Location (File file,Integer rank){
    this.file = file;
    this.rank = rank;
}

    public File getFile() {
        return file;
    }

    public Integer getRank() {
        return rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return file == location.file && Objects.equals(rank, location.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, rank);
    }
}
