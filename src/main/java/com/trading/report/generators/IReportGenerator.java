package com.trading.report.generators;


import java.util.Set;

import com.trading.report.model.Instruction;

public interface IReportGenerator {
    String generateInstructionsReport(Set<Instruction> instructions);
}
