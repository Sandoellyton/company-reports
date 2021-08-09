package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.ReportAbstract;

public class ReportService {
    public ReportAbstract report;

    public ReportService(ReportAbstract report) {
        this.report = report;
    }

    public void generateReport() {
        this.report.generate();
    }

}
