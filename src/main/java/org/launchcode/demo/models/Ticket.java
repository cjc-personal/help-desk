package org.launchcode.demo.models;

import java.util.Date;

public class Ticket {
    private int ticketId;
    private static int ticketNextId = 1;
    private User createdUser;
    private Severity severity;
    private String shortDescription;
    private String fullDescription;
    private User assignedUser;
    private Date createdDate;
    private Date lastUpdate;

    public Ticket(User createdUser, Severity severity, String shortDescription, String fullDescription) {
        this.createdUser = createdUser;
        this.severity = severity;
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
        this.ticketId = ticketNextId;
        ticketNextId++;
        this.createdDate = new Date();
    }

    public Ticket() {

    }

    public int getTicketId() {
        return ticketId;
    }

    public static int getTicketNextId() {
        return ticketNextId;
    }

    public static void setTicketNextId(int ticketNextId) {
        Ticket.ticketNextId = ticketNextId;
    }

    public User getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(User createdUser) {
        this.createdUser = createdUser;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
