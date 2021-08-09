package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;
import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport extends ReportAbstract{
    private DatabaseConnector connector;

     DatabaseConnector getDatabaseConnector() {
            connector = new MysqlDatabaseConnector();
        return connector;
    }

     void executeQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        getDatabaseConnector().runQuery(query);
    }

     void convertToDocument() {
        System.out.println("Converting To PDF...");
    }
}
