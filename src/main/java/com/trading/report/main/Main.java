package com.trading.report.main;

import java.util.Set;

import com.trading.report.generators.IReportGenerator;
import com.trading.report.generators.ReportGenerator;
import com.trading.report.model.Instruction;
import com.trading.report.util.InstructionsGenerator;

public class Main {

    public static void main(String[] args) {
        final Set<Instruction> instructions = InstructionsGenerator.getTradeInstructions();
        final IReportGenerator reportGenerator = new ReportGenerator();

        System.out.println(reportGenerator.generateInstructionsReport(instructions));
    }
}
