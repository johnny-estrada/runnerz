// This is the verbose way of doing the implementation if we use classes.
// If we use records instead, we write less code!!

package dev.johnnyestrada.runnerz.run;

import org.springframework.beans.factory.parsing.Location;

import java.time.LocalDateTime;
import java.util.Objects;

public class Run_verbose_class {
    private Integer id;
    private  String title;
    private LocalDateTime startedOn;
    private LocalDateTime completedOn;
    private  Integer miles;
    private Location location;

    public Run_verbose_class(Integer id, String title, LocalDateTime startedOn, LocalDateTime completedOn, Integer miles, Location location) {
        this.id = id;
        this.title = title;
        this.startedOn = startedOn;
        this.completedOn = completedOn;
        this.miles = miles;
        this.location = location;
        if (!completedOn.isAfter(startedOn)) {
            throw  new IllegalArgumentException("Completed On must be after Started On");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStartedOn() {
        return startedOn;
    }

    public void setStartedOn(LocalDateTime startedOn) {
        this.startedOn = startedOn;
    }

    public LocalDateTime getCompletedOn() {
        return completedOn;
    }

    public void setCompletedOn(LocalDateTime completedOn) {
        this.completedOn = completedOn;
    }

    public Integer getMiles() {
        return miles;
    }

    public void setMiles(Integer miles) {
        this.miles = miles;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Run_verbose_class run = (Run_verbose_class) o;
        return Objects.equals(id, run.id) && Objects.equals(title, run.title) && Objects.equals(startedOn, run.startedOn) && Objects.equals(completedOn, run.completedOn) && Objects.equals(miles, run.miles) && Objects.equals(location, run.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, startedOn, completedOn, miles, location);
    }

    @Override
    public String toString() {
        return "Run{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", startedOn=" + startedOn +
                ", completedOn=" + completedOn +
                ", miles=" + miles +
                ", location=" + location +
                '}';
    }
}
