package com.example.ec.domain;

public enum Region {
    Central_Coast("Central_Coast"), Southern_California("Southern_California"),
    Northern_California("Northern_California"), Varies("varies");

    private String label;

    private Region(String label) {
        this.label = label;
    }

    public static Region findByLabel(String label) {
        for (Region r: Region.values()) {
            if (r.label.equalsIgnoreCase(label)) {
                return r;
            }
        }
        return null;
    }
}
