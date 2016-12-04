package com.yanaguseva.oop;

import java.util.Date;

public class Session {
    private Reader reader;
    private Date startDate;
    private Date endDate;

    public Session(Reader reader, Date startDate) {
        this.reader = reader;
        this.startDate = startDate;
    }

    public Reader getReader() {
        return reader;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
