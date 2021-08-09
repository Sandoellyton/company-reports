package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;
import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends ReportAbstract {
    private DatabaseConnector connector;

     public DatabaseConnector getDatabaseConnector() {
            connector = new PostgreSQLDatabaseConnector();
        return connector;
    }

     void executeQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        getDatabaseConnector().runQuery(query);
    }

     void convertToDocument() {
        System.out.println("Converting To XLS...");
    }
}
