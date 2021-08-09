package br.edu.ifpb;

import br.edu.ifpb.report.controller.ExpenseReport;
import br.edu.ifpb.report.controller.TaxReport;
import br.edu.ifpb.report.service.ReportService;

public class Main {

    public static void main(String[] args) {
        ReportService expenseReportService = new ReportService(new ExpenseReport());
        expenseReportService.generateReport();

        ReportService taxReportService = new ReportService(new TaxReport());
        taxReportService.generateReport();
    }

}
