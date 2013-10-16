package org.easetech.easytest.example;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Display;
import org.easetech.easytest.annotation.Parallel;
import org.easetech.easytest.annotation.Report;
import org.easetech.easytest.annotation.TestConfigProvider;

@DataLoader(filePaths = { "classpath:org/easetech/data/testExcelData.xls" })
@Report
@TestConfigProvider({TestConfigProviderClass.class})
@Parallel(threads=8)
@Display(fields={"Description"})
public class TestExcelDataLoaderPolicy {

}