package com.karmasoftonline.tm.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tournament")
public class Tournament {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Integer id;

    String name;
    String email;
    String website;
    String description;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    PostalAddress location;
    Integer numberOfRounds;
    Integer tables;
    LocalDateTime startTime;
    LocalDateTime endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PostalAddress getLocation() {
        return location;
    }

    public void setLocation(PostalAddress location) {
        this.location = location;
    }

    public Integer getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(Integer numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    public Integer getTables() {
        return tables;
    }

    public void setTables(Integer tables) {
        this.tables = tables;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
