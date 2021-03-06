/* File:    TableSchema.java
 * Created: May 20, 2009
 * Author:  Lars George
 *
 * Copyright (c) 2009 larsgeorge.com
 */

package com.larsgeorge.hadoop.hbase;

import java.util.Collection;
import java.util.HashMap;

/**
 * Describes a table.
 * 
 * @author Lars George
 */
public class TableSchema {

    private String name = null;
    private String description = null;
    private final HashMap<String, ColumnDefinition> columns = new HashMap<String, ColumnDefinition>();

    public String getName() {
	return name;
    }

    public void setName(final String name) {
	this.name = name;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(final String description) {
	this.description = description;
    }

    public void addColumn(final ColumnDefinition column) {
	columns.put(column.getName(), column);
    }

    public Collection<ColumnDefinition> getColumns() {
	return columns.values();
    }

    public ColumnDefinition getColumnDefinition(final String name) {
	return columns.get(name);
    } // getColumnDefinition

    @Override
    public String toString() {
	return "name -> " + name + "\n  description -> " + description + "\n  columns -> " + columns;
    }

} // TableSchema

