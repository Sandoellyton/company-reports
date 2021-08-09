
package br.edu.ifpb.report.database;

public interface DatabaseConnector {
    public void createConnection();
    public void runQuery(String query);
}
