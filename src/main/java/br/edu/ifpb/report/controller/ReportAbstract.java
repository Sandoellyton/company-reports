package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;

public abstract class ReportAbstract {
    final public void generate() {
        createDatabaseConnection();
        executeQuery();
        convertToDocument();
    }

     void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        getDatabaseConnector().createConnection();
    }

     abstract DatabaseConnector getDatabaseConnector();
     abstract void executeQuery();
     abstract void convertToDocument();

}
